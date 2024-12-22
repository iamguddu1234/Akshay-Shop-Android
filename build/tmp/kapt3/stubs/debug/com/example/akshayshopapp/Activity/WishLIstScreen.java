package com.example.akshayshopapp.Activity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0014J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u0007H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/akshayshopapp/Activity/WishLIstScreen;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/akshayshopapp/databinding/ActivityWishListScreenBinding;", "wishList", "", "Lcom/example/akshayshopapp/dataClass/Product;", "wishListAdapter", "Lcom/example/akshayshopapp/Repository/WishListAdapter;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "removeItemFromWishlist", "product", "app_debug"})
public final class WishLIstScreen extends androidx.appcompat.app.AppCompatActivity {
    private com.example.akshayshopapp.databinding.ActivityWishListScreenBinding binding;
    private com.example.akshayshopapp.Repository.WishListAdapter wishListAdapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.akshayshopapp.dataClass.Product> wishList;
    
    public WishLIstScreen() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void removeItemFromWishlist(com.example.akshayshopapp.dataClass.Product product) {
    }
}