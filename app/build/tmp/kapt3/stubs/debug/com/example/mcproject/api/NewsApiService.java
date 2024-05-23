package com.example.mcproject.api;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000eB\u0005\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ%\u0010\n\u001a\u00020\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\b2\b\u0010\f\u001a\u0004\u0018\u00010\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/mcproject/api/NewsApiService;", "", "()V", "TopHeadlinesApi", "Lcom/example/mcproject/api/NewsApiService$NewsApiTopHeadlines;", "getSearchResults", "Lcom/example/mcproject/api/NewsResponse;", "query", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopHeadlines", "category", "country", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "NewsApiTopHeadlines", "app_debug"})
public final class NewsApiService {
    private com.example.mcproject.api.NewsApiService.NewsApiTopHeadlines TopHeadlinesApi;
    
    public NewsApiService() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getTopHeadlines(@org.jetbrains.annotations.Nullable
    java.lang.String category, @org.jetbrains.annotations.Nullable
    java.lang.String country, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.mcproject.api.NewsResponse> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getSearchResults(@org.jetbrains.annotations.Nullable
    java.lang.String query, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.mcproject.api.NewsResponse> $completion) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001J3\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ?\u0010\n\u001a\u00020\u00032\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0004\u001a\u00020\u00052\n\b\u0003\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000e"}, d2 = {"Lcom/example/mcproject/api/NewsApiService$NewsApiTopHeadlines;", "", "getSearchResults", "Lcom/example/mcproject/api/NewsResponse;", "apiKey", "", "limit", "", "search", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTopHeadlines", "country", "category", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
    public static abstract interface NewsApiTopHeadlines {
        
        @retrofit2.http.GET(value = "/v2/top-headlines")
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object getTopHeadlines(@retrofit2.http.Query(value = "country")
        @org.jetbrains.annotations.Nullable
        java.lang.String country, @retrofit2.http.Query(value = "apiKey")
        @org.jetbrains.annotations.NotNull
        java.lang.String apiKey, @retrofit2.http.Query(value = "category")
        @org.jetbrains.annotations.Nullable
        java.lang.String category, @retrofit2.http.Query(value = "pageSize")
        @org.jetbrains.annotations.Nullable
        java.lang.Integer limit, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super com.example.mcproject.api.NewsResponse> $completion);
        
        @retrofit2.http.GET(value = "/v2/everything")
        @org.jetbrains.annotations.Nullable
        public abstract java.lang.Object getSearchResults(@retrofit2.http.Query(value = "apiKey")
        @org.jetbrains.annotations.NotNull
        java.lang.String apiKey, @retrofit2.http.Query(value = "pageSize")
        @org.jetbrains.annotations.Nullable
        java.lang.Integer limit, @retrofit2.http.Query(value = "q")
        @org.jetbrains.annotations.Nullable
        java.lang.String search, @org.jetbrains.annotations.NotNull
        kotlin.coroutines.Continuation<? super com.example.mcproject.api.NewsResponse> $completion);
        
        @kotlin.Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
        public static final class DefaultImpls {
        }
    }
}