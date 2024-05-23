package com.example.mcproject.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0002\u0010\u000bJ\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0010J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003Jb\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005H\u00c6\u0001\u00a2\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u00d6\u0003J\t\u0010#\u001a\u00020\u0003H\u00d6\u0001J\t\u0010$\u001a\u00020\u0005H\u00d6\u0001R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\r\u00a8\u0006%"}, d2 = {"Lcom/example/mcproject/database/NewsData;", "Ljava/io/Serializable;", "id", "", "source", "", "author", "title", "description", "image", "publishedAt", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAuthor", "()Ljava/lang/String;", "getDescription", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getImage", "getPublishedAt", "getSource", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/example/mcproject/database/NewsData;", "equals", "", "other", "", "hashCode", "toString", "app_debug"})
@androidx.room.Entity(tableName = "news_table")
public final class NewsData implements java.io.Serializable {
    @androidx.room.PrimaryKey(autoGenerate = true)
    @org.jetbrains.annotations.Nullable
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String source = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String author = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String title = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String image = null;
    @org.jetbrains.annotations.Nullable
    private final java.lang.String publishedAt = null;
    
    public NewsData(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.String source, @org.jetbrains.annotations.Nullable
    java.lang.String author, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String image, @org.jetbrains.annotations.Nullable
    java.lang.String publishedAt) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getSource() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getAuthor() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getTitle() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getImage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getPublishedAt() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.mcproject.database.NewsData copy(@org.jetbrains.annotations.Nullable
    java.lang.Integer id, @org.jetbrains.annotations.Nullable
    java.lang.String source, @org.jetbrains.annotations.Nullable
    java.lang.String author, @org.jetbrains.annotations.Nullable
    java.lang.String title, @org.jetbrains.annotations.Nullable
    java.lang.String description, @org.jetbrains.annotations.Nullable
    java.lang.String image, @org.jetbrains.annotations.Nullable
    java.lang.String publishedAt) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public java.lang.String toString() {
        return null;
    }
}