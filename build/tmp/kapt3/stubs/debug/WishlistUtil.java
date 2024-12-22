
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\t\u001a\u00020\nJ\u001c\u0010\u000b\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000f"}, d2 = {"LWishlistUtil;", "", "()V", "PREFS_NAME", "", "WISHLIST_KEY", "getWishlist", "", "Lcom/example/akshayshopapp/dataClass/Product;", "context", "Landroid/content/Context;", "saveWishlist", "", "wishlist", "", "app_debug"})
public final class WishlistUtil {
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String PREFS_NAME = "wishlist_prefs";
    @org.jetbrains.annotations.NotNull()
    private static final java.lang.String WISHLIST_KEY = "wishlist";
    @org.jetbrains.annotations.NotNull()
    public static final WishlistUtil INSTANCE = null;
    
    private WishlistUtil() {
        super();
    }
    
    public final void saveWishlist(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.util.List<com.example.akshayshopapp.dataClass.Product> wishlist) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.example.akshayshopapp.dataClass.Product> getWishlist(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        return null;
    }
}