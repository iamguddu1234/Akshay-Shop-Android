package com.example.akshayshopapp;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\rH\u0002J\b\u0010\u0011\u001a\u00020\u000fH\u0017J\u0012\u0010\u0012\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0015"}, d2 = {"Lcom/example/akshayshopapp/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "binding", "Lcom/example/akshayshopapp/databinding/ActivityMainBinding;", "category_adapter", "Lcom/example/akshayshopapp/Adapter/CategoryAdapter;", "productListAdapter", "Lcom/example/akshayshopapp/Adapter/ProductListAdapter;", "viewModel", "Lcom/example/akshayshopapp/ViewModel/ProductViewModel;", "wishList", "", "Lcom/example/akshayshopapp/dataClass/Product;", "addProductToWishlist", "", "product", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private com.example.akshayshopapp.databinding.ActivityMainBinding binding;
    private com.example.akshayshopapp.ViewModel.ProductViewModel viewModel;
    private com.example.akshayshopapp.Adapter.ProductListAdapter productListAdapter;
    private com.example.akshayshopapp.Adapter.CategoryAdapter category_adapter;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.akshayshopapp.dataClass.Product> wishList;
    
    public MainActivity() {
        super();
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void addProductToWishlist(com.example.akshayshopapp.dataClass.Product product) {
    }
    
    @java.lang.Override()
    @android.annotation.SuppressLint(value = {"MissingSuperCall"})
    public void onBackPressed() {
    }
}