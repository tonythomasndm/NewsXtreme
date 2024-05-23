package com.example.mcproject.database;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0019\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/example/mcproject/database/NewsDBrepository;", "", "dao", "Lcom/example/mcproject/database/NewsDao;", "(Lcom/example/mcproject/database/NewsDao;)V", "allData", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/mcproject/database/NewsData;", "getAllData", "()Lkotlinx/coroutines/flow/Flow;", "clearAllData", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "delete", "news", "(Lcom/example/mcproject/database/NewsData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "upsert", "app_debug"})
public final class NewsDBrepository {
    @org.jetbrains.annotations.NotNull
    private final com.example.mcproject.database.NewsDao dao = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.example.mcproject.database.NewsData>> allData = null;
    
    public NewsDBrepository(@org.jetbrains.annotations.NotNull
    com.example.mcproject.database.NewsDao dao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.mcproject.database.NewsData>> getAllData() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object upsert(@org.jetbrains.annotations.NotNull
    com.example.mcproject.database.NewsData news, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull
    com.example.mcproject.database.NewsData news, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object clearAllData(@org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}