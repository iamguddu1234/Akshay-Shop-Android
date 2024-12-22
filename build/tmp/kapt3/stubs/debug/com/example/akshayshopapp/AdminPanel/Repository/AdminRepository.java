package com.example.akshayshopapp.AdminPanel.Repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\u0007J\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u000b\u001a\u00020\nJ\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00062\u0006\u0010\u000f\u001a\u00020\u0010J\u001a\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\u00062\u0006\u0010\u000f\u001a\u00020\u0010J\u0012\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00130\u0006J\u001a\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00130\u00062\u0006\u0010\u0015\u001a\u00020\u0010J\u001a\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00130\u00062\u0006\u0010\u0017\u001a\u00020\u0018J\u001c\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0007J\u001c\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/akshayshopapp/AdminPanel/Repository/AdminRepository;", "", "api", "Lcom/example/akshayshopapp/productApi/ProductApi;", "(Lcom/example/akshayshopapp/productApi/ProductApi;)V", "addProduct", "Lio/reactivex/rxjava3/core/Single;", "Lcom/example/akshayshopapp/dataClass/Product;", "product", "addUser", "Lcom/example/akshayshopapp/dataClass/User;", "user", "deleteProduct", "Lretrofit2/Response;", "Ljava/lang/Void;", "id", "", "deleteUser", "getAllUsers", "", "getLimitedUser", "limit", "getUserByOrder", "sort", "", "updateProduct", "updateUser", "app_debug"})
public final class AdminRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.akshayshopapp.productApi.ProductApi api = null;
    
    public AdminRepository(@org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.productApi.ProductApi api) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Single<com.example.akshayshopapp.dataClass.Product> addProduct(@org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.dataClass.Product product) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Single<com.example.akshayshopapp.dataClass.Product> updateProduct(int id, @org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.dataClass.Product product) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Single<retrofit2.Response<java.lang.Void>> deleteProduct(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Single<java.util.List<com.example.akshayshopapp.dataClass.User>> getAllUsers() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Single<com.example.akshayshopapp.dataClass.User> addUser(@org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.dataClass.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Single<com.example.akshayshopapp.dataClass.User> updateUser(int id, @org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.dataClass.User user) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Single<retrofit2.Response<java.lang.Void>> deleteUser(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Single<java.util.List<com.example.akshayshopapp.dataClass.User>> getUserByOrder(@org.jetbrains.annotations.NotNull()
    java.lang.String sort) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final io.reactivex.rxjava3.core.Single<java.util.List<com.example.akshayshopapp.dataClass.User>> getLimitedUser(int limit) {
        return null;
    }
}