package com.example.mcproject.NewsViewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\r\u001a\u00020\u000eJ\u000e\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bJ\u0019\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\bR\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/example/mcproject/NewsViewModel/DatabaseViewModel;", "Landroidx/lifecycle/AndroidViewModel;", "application", "Landroid/app/Application;", "(Landroid/app/Application;)V", "allData", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/mcproject/database/NewsData;", "getAllData", "()Landroidx/lifecycle/LiveData;", "repository", "Lcom/example/mcproject/database/NewsDBrepository;", "clearAllData", "Lkotlinx/coroutines/Job;", "delete", "news", "getBitmap", "Landroid/graphics/Bitmap;", "context", "Landroid/content/Context;", "(Landroid/content/Context;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsert", "app_debug"})
public final class DatabaseViewModel extends androidx.lifecycle.AndroidViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.LiveData<java.util.List<com.example.mcproject.database.NewsData>> allData = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.mcproject.database.NewsDBrepository repository = null;
    
    public DatabaseViewModel(@org.jetbrains.annotations.NotNull
    android.app.Application application) {
        super(null);
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.mcproject.database.NewsData>> getAllData() {
        return null;
    }
    
    /**
     * Launching a new coroutine to insert the data in a non-blocking way
     */
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job upsert(@org.jetbrains.annotations.NotNull
    com.example.mcproject.database.NewsData news) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job delete(@org.jetbrains.annotations.NotNull
    com.example.mcproject.database.NewsData news) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.Job clearAllData() {
        return null;
    }
    
    private final java.lang.Object getBitmap(android.content.Context context, kotlin.coroutines.Continuation<? super android.graphics.Bitmap> $completion) {
        return null;
    }
}