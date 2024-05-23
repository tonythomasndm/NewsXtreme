package com.example.mcproject.database;

import android.database.Cursor;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.EntityUpsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class NewsDao_Impl implements NewsDao {
  private final RoomDatabase __db;

  private final EntityDeletionOrUpdateAdapter<NewsData> __deletionAdapterOfNewsData;

  private final SharedSQLiteStatement __preparedStmtOfClearAllData;

  private final EntityUpsertionAdapter<NewsData> __upsertionAdapterOfNewsData;

  public NewsDao_Impl(@NonNull final RoomDatabase __db) {
    this.__db = __db;
    this.__deletionAdapterOfNewsData = new EntityDeletionOrUpdateAdapter<NewsData>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "DELETE FROM `news_table` WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final NewsData entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
      }
    };
    this.__preparedStmtOfClearAllData = new SharedSQLiteStatement(__db) {
      @Override
      @NonNull
      public String createQuery() {
        final String _query = "DELETE FROM news_table";
        return _query;
      }
    };
    this.__upsertionAdapterOfNewsData = new EntityUpsertionAdapter<NewsData>(new EntityInsertionAdapter<NewsData>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "INSERT INTO `news_table` (`id`,`source`,`author`,`title`,`description`,`image`,`publishedAt`) VALUES (?,?,?,?,?,?,?)";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final NewsData entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getSource() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getSource());
        }
        if (entity.getAuthor() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getAuthor());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getTitle());
        }
        if (entity.getDescription() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getDescription());
        }
        if (entity.getImage() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getImage());
        }
        if (entity.getPublishedAt() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getPublishedAt());
        }
      }
    }, new EntityDeletionOrUpdateAdapter<NewsData>(__db) {
      @Override
      @NonNull
      protected String createQuery() {
        return "UPDATE `news_table` SET `id` = ?,`source` = ?,`author` = ?,`title` = ?,`description` = ?,`image` = ?,`publishedAt` = ? WHERE `id` = ?";
      }

      @Override
      protected void bind(@NonNull final SupportSQLiteStatement statement,
          @Nullable final NewsData entity) {
        if (entity.getId() == null) {
          statement.bindNull(1);
        } else {
          statement.bindLong(1, entity.getId());
        }
        if (entity.getSource() == null) {
          statement.bindNull(2);
        } else {
          statement.bindString(2, entity.getSource());
        }
        if (entity.getAuthor() == null) {
          statement.bindNull(3);
        } else {
          statement.bindString(3, entity.getAuthor());
        }
        if (entity.getTitle() == null) {
          statement.bindNull(4);
        } else {
          statement.bindString(4, entity.getTitle());
        }
        if (entity.getDescription() == null) {
          statement.bindNull(5);
        } else {
          statement.bindString(5, entity.getDescription());
        }
        if (entity.getImage() == null) {
          statement.bindNull(6);
        } else {
          statement.bindString(6, entity.getImage());
        }
        if (entity.getPublishedAt() == null) {
          statement.bindNull(7);
        } else {
          statement.bindString(7, entity.getPublishedAt());
        }
        if (entity.getId() == null) {
          statement.bindNull(8);
        } else {
          statement.bindLong(8, entity.getId());
        }
      }
    });
  }

  @Override
  public Object deleteData(final NewsData news, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __deletionAdapterOfNewsData.handle(news);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Object clearAllData(final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfClearAllData.acquire();
        try {
          __db.beginTransaction();
          try {
            _stmt.executeUpdateDelete();
            __db.setTransactionSuccessful();
            return Unit.INSTANCE;
          } finally {
            __db.endTransaction();
          }
        } finally {
          __preparedStmtOfClearAllData.release(_stmt);
        }
      }
    }, $completion);
  }

  @Override
  public Object upsertData(final NewsData news, final Continuation<? super Unit> $completion) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      @NonNull
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __upsertionAdapterOfNewsData.upsert(news);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, $completion);
  }

  @Override
  public Flow<List<NewsData>> getAllData() {
    final String _sql = "SELECT * from news_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[] {"news_table"}, new Callable<List<NewsData>>() {
      @Override
      @NonNull
      public List<NewsData> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfSource = CursorUtil.getColumnIndexOrThrow(_cursor, "source");
          final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
          final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
          final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
          final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
          final int _cursorIndexOfPublishedAt = CursorUtil.getColumnIndexOrThrow(_cursor, "publishedAt");
          final List<NewsData> _result = new ArrayList<NewsData>(_cursor.getCount());
          while (_cursor.moveToNext()) {
            final NewsData _item;
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            final String _tmpSource;
            if (_cursor.isNull(_cursorIndexOfSource)) {
              _tmpSource = null;
            } else {
              _tmpSource = _cursor.getString(_cursorIndexOfSource);
            }
            final String _tmpAuthor;
            if (_cursor.isNull(_cursorIndexOfAuthor)) {
              _tmpAuthor = null;
            } else {
              _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
            }
            final String _tmpTitle;
            if (_cursor.isNull(_cursorIndexOfTitle)) {
              _tmpTitle = null;
            } else {
              _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
            }
            final String _tmpDescription;
            if (_cursor.isNull(_cursorIndexOfDescription)) {
              _tmpDescription = null;
            } else {
              _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
            }
            final String _tmpImage;
            if (_cursor.isNull(_cursorIndexOfImage)) {
              _tmpImage = null;
            } else {
              _tmpImage = _cursor.getString(_cursorIndexOfImage);
            }
            final String _tmpPublishedAt;
            if (_cursor.isNull(_cursorIndexOfPublishedAt)) {
              _tmpPublishedAt = null;
            } else {
              _tmpPublishedAt = _cursor.getString(_cursorIndexOfPublishedAt);
            }
            _item = new NewsData(_tmpId,_tmpSource,_tmpAuthor,_tmpTitle,_tmpDescription,_tmpImage,_tmpPublishedAt);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @NonNull
  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
