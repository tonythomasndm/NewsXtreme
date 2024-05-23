
/**
 * Manages all location related tasks for the app.
 */
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001:\u0001#B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J1\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\u00062\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0002\u00a2\u0006\u0002\u0010\u0015J\u001e\u0010\u0016\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u001bJ\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001bH\u0007J)\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u001b2\u0012\u0010\u0012\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00140\u0013\"\u00020\u0014H\u0002\u00a2\u0006\u0002\u0010 J\b\u0010!\u001a\u00020\u0010H\u0007J\b\u0010\"\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u00020\nX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006$"}, d2 = {"LUserLocation;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "REQUEST_LOCATION_PERMISSION", "", "locationCallback", "Lcom/google/android/gms/location/LocationCallback;", "locationProvider", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getLocationProvider", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setLocationProvider", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "askPermissions", "", "requestCode", "permissions", "", "", "(Landroid/app/Activity;I[Ljava/lang/String;)V", "getReadableLocation", "latitude", "", "longitude", "context", "Landroid/content/Context;", "getUserLocation", "LUserLocation$LatandLong;", "hasPermissions", "", "(Landroid/content/Context;[Ljava/lang/String;)Z", "locationUpdate", "stopLocationUpdate", "LatandLong", "app_debug"})
public final class UserLocation {
    @org.jetbrains.annotations.NotNull
    private final android.app.Activity activity = null;
    private com.google.android.gms.location.LocationCallback locationCallback;
    public com.google.android.gms.location.FusedLocationProviderClient locationProvider;
    private final int REQUEST_LOCATION_PERMISSION = 123;
    
    public UserLocation(@org.jetbrains.annotations.NotNull
    android.app.Activity activity) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.google.android.gms.location.FusedLocationProviderClient getLocationProvider() {
        return null;
    }
    
    public final void setLocationProvider(@org.jetbrains.annotations.NotNull
    com.google.android.gms.location.FusedLocationProviderClient p0) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    @androidx.compose.runtime.Composable
    @org.jetbrains.annotations.NotNull
    public final UserLocation.LatandLong getUserLocation(@org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    private final boolean hasPermissions(android.content.Context context, java.lang.String... permissions) {
        return false;
    }
    
    private final void askPermissions(android.app.Activity activity, int requestCode, java.lang.String... permissions) {
    }
    
    private final void stopLocationUpdate() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void locationUpdate() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getReadableLocation(double latitude, double longitude, @org.jetbrains.annotations.NotNull
    android.content.Context context) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\n\u001a\u00020\u0003H\u00c6\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001J\t\u0010\u0011\u001a\u00020\u0012H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007\u00a8\u0006\u0013"}, d2 = {"LUserLocation$LatandLong;", "", "latitude", "", "longitude", "(DD)V", "getLatitude", "()D", "getLongitude", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
    public static final class LatandLong {
        private final double latitude = 0.0;
        private final double longitude = 0.0;
        
        public LatandLong(double latitude, double longitude) {
            super();
        }
        
        public final double getLatitude() {
            return 0.0;
        }
        
        public final double getLongitude() {
            return 0.0;
        }
        
        public LatandLong() {
            super();
        }
        
        public final double component1() {
            return 0.0;
        }
        
        public final double component2() {
            return 0.0;
        }
        
        @org.jetbrains.annotations.NotNull
        public final UserLocation.LatandLong copy(double latitude, double longitude) {
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
}