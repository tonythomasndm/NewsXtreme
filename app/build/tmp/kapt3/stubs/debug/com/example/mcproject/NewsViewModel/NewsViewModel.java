package com.example.mcproject.NewsViewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u001b\u0010\u0010\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J%\u0010\u000e\u001a\u00020\r2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0005H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0005J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u0005J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\b\u001a\u00020\u0005J\u0011\u0010\u0019\u001a\u00020\u0015H\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u00152\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/example/mcproject/NewsViewModel/NewsViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "category", "Landroidx/lifecycle/MutableLiveData;", "", "getCategory", "()Landroidx/lifecycle/MutableLiveData;", "country", "repository", "Lcom/example/mcproject/api/NewsRepository;", "topHeadlines", "Landroidx/compose/runtime/MutableState;", "Lcom/example/mcproject/api/NewsResponse;", "getTopHeadlines", "()Landroidx/compose/runtime/MutableState;", "getSearchResults", "query", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setCountry", "", "code", "updateCategory", "updateCountry", "updateNews", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "userSearch", "app_debug"})
public final class NewsViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final androidx.lifecycle.MutableLiveData<java.lang.String> category = null;
    @org.jetbrains.annotations.NotNull
    private androidx.lifecycle.MutableLiveData<java.lang.String> country;
    @org.jetbrains.annotations.NotNull
    private final androidx.compose.runtime.MutableState<com.example.mcproject.api.NewsResponse> topHeadlines = null;
    @org.jetbrains.annotations.NotNull
    private final com.example.mcproject.api.NewsRepository repository = null;
    
    public NewsViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.MutableLiveData<java.lang.String> getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.compose.runtime.MutableState<com.example.mcproject.api.NewsResponse> getTopHeadlines() {
        return null;
    }
    
    public final void updateCategory(@org.jetbrains.annotations.NotNull
    java.lang.String category) {
    }
    
    public final void updateCountry(@org.jetbrains.annotations.NotNull
    java.lang.String country) {
    }
    
    private final java.lang.Object updateNews(kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    public final void userSearch(@org.jetbrains.annotations.Nullable
    java.lang.String query) {
    }
    
    public final void setCountry(@org.jetbrains.annotations.NotNull
    java.lang.String code) {
    }
    
    private final java.lang.Object getTopHeadlines(java.lang.String category, java.lang.String country, kotlin.coroutines.Continuation<? super com.example.mcproject.api.NewsResponse> $completion) {
        return null;
    }
    
    private final java.lang.Object getSearchResults(java.lang.String query, kotlin.coroutines.Continuation<? super com.example.mcproject.api.NewsResponse> $completion) {
        return null;
    }
}