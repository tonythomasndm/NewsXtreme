package com.example.mcproject.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u0014\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u000b0\nH\'J\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\b\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\r"}, d2 = {"Lcom/example/mcproject/database/NewsDao;", "", "clearAllData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteData", "news", "Lcom/example/mcproject/database/NewsData;", "(Lcom/example/mcproject/database/NewsData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllData", "Lkotlinx/coroutines/flow/Flow;", "", "upsertData", "app_debug"})
@androidx.room.Dao
public abstract interface NewsDao {
    
    @androidx.room.Upsert
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object upsertData(@org.jetbrains.annotations.NotNull
    com.example.mcproject.database.NewsData news, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Delete
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object deleteData(@org.jetbrains.annotations.NotNull
    com.example.mcproject.database.NewsData news, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
    
    @androidx.room.Query(value = "SELECT * from news_table")
    @org.jetbrains.annotations.NotNull
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.mcproject.database.NewsData>> getAllData();
    
    @androidx.room.Query(value = "DELETE FROM news_table")
    @org.jetbrains.annotations.Nullable
    public abstract java.lang.Object clearAllData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion);
}