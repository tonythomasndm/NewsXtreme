package com.example.mcproject;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0005\u00a2\u0006\u0002\u0010\u0002J:\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\r2\u0006\u0010\u000e\u001a\u00020\u0001H\u0007J\u0012\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/mcproject/ContentScreenActivity;", "Landroidx/activity/ComponentActivity;", "()V", "databaseViewModel1", "Lcom/example/mcproject/NewsViewModel/DatabaseViewModel;", "NewsContent", "", "databaseViewModel", "article", "Lcom/example/mcproject/api/Article;", "mode", "", "text", "Landroidx/compose/runtime/MutableState;", "contentScreenActivity", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "app_debug"})
public final class ContentScreenActivity extends androidx.activity.ComponentActivity {
    private com.example.mcproject.NewsViewModel.DatabaseViewModel databaseViewModel1;
    private static android.content.Context appContext;
    @org.jetbrains.annotations.NotNull
    public static final com.example.mcproject.ContentScreenActivity.Companion Companion = null;
    
    public ContentScreenActivity() {
        super(0);
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    @androidx.compose.runtime.Composable
    public final void NewsContent(@org.jetbrains.annotations.NotNull
    com.example.mcproject.NewsViewModel.DatabaseViewModel databaseViewModel, @org.jetbrains.annotations.NotNull
    com.example.mcproject.api.Article article, @org.jetbrains.annotations.NotNull
    java.lang.String mode, @org.jetbrains.annotations.NotNull
    androidx.compose.runtime.MutableState<java.lang.String> text, @org.jetbrains.annotations.NotNull
    androidx.activity.ComponentActivity contentScreenActivity) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0004@BX\u0086.\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u00a8\u0006\b"}, d2 = {"Lcom/example/mcproject/ContentScreenActivity$Companion;", "", "()V", "<set-?>", "Landroid/content/Context;", "appContext", "getAppContext", "()Landroid/content/Context;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull
        public final android.content.Context getAppContext() {
            return null;
        }
    }
}