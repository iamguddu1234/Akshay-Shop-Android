package com.example.akshayshopapp.ViewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0017\u001a\u00020\u0018J\u0006\u0010\u0019\u001a\u00020\u0018J\u000e\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u000bJ\u000e\u0010\u001f\u001a\u00020\u00182\u0006\u0010 \u001a\u00020\u000bJ\b\u0010!\u001a\u00020\u0018H\u0014R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0014\u0010\u0010R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\n0\u000e8F\u00a2\u0006\u0006\u001a\u0004\b\u0016\u0010\u0010R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\""}, d2 = {"Lcom/example/akshayshopapp/ViewModel/ProductViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/akshayshopapp/Repository/ProductRepository;", "(Lcom/example/akshayshopapp/Repository/ProductRepository;)V", "_FavLivedata", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/akshayshopapp/dataClass/Product;", "_categoryLiveData", "", "", "_productLiveData", "categoryLiveData", "Landroidx/lifecycle/LiveData;", "getCategoryLiveData", "()Landroidx/lifecycle/LiveData;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "favLiveData", "getFavLiveData", "productLiveData", "getProductLiveData", "getAllProduct", "", "getCategory", "getLimitedProduct", "limit", "", "getProductByCategory", "category", "getProductsByOrder", "sort", "onCleared", "app_debug"})
public final class ProductViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.akshayshopapp.Repository.ProductRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.akshayshopapp.dataClass.Product>> _productLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<java.lang.String>> _categoryLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.akshayshopapp.dataClass.Product>> _FavLivedata = null;
    
    public ProductViewModel(@org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.Repository.ProductRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.akshayshopapp.dataClass.Product>> getProductLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<java.lang.String>> getCategoryLiveData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.akshayshopapp.dataClass.Product>> getFavLiveData() {
        return null;
    }
    
    public final void getAllProduct() {
    }
    
    public final void getCategory() {
    }
    
    public final void getProductByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category) {
    }
    
    public final void getLimitedProduct(int limit) {
    }
    
    public final void getProductsByOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String sort) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}