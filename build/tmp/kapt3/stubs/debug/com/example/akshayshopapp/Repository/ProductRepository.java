package com.example.akshayshopapp.Repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006J\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006J\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\f\u001a\u00020\rJ\u001a\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u000f\u001a\u00020\nJ\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\u0011\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/akshayshopapp/Repository/ProductRepository;", "", "api", "Lcom/example/akshayshopapp/productApi/ProductApi;", "(Lcom/example/akshayshopapp/productApi/ProductApi;)V", "getAllProduct", "Lio/reactivex/rxjava3/core/Single;", "", "Lcom/example/akshayshopapp/dataClass/Product;", "getCategory", "", "getLimitedProduct", "limit", "", "getProductByCategory", "category", "getProductsByOrder", "sort", "app_debug"})
public final class ProductRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.akshayshopapp.productApi.ProductApi api = null;
    
    public ProductRepository(@org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.productApi.ProductApi api) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Single<java.util.List<com.example.akshayshopapp.dataClass.Product>> getAllProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Single<java.util.List<java.lang.String>> getCategory() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Single<java.util.List<com.example.akshayshopapp.dataClass.Product>> getProductByCategory(@org.jetbrains.annotations.NotNull()
    java.lang.String category) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Single<java.util.List<com.example.akshayshopapp.dataClass.Product>> getLimitedProduct(int limit) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Single<java.util.List<com.example.akshayshopapp.dataClass.Product>> getProductsByOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String sort) {
        return null;
    }
}