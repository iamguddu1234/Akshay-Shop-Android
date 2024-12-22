package com.example.akshayshopapp.productApi;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'J\u0018\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\b\u001a\u00020\u0007H\'J\u001e\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\'J\u001e\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\u00032\b\b\u0001\u0010\f\u001a\u00020\rH\'J\u0014\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u0003H\'J\u0014\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u0003H\'J\u0014\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00100\u0003H\'J\u001e\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u00032\b\b\u0001\u0010\u0015\u001a\u00020\rH\'J\u001e\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u00032\b\b\u0001\u0010\u0015\u001a\u00020\rH\'J\u001e\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u00032\b\b\u0001\u0010\u0018\u001a\u00020\u0013H\'J\u001e\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00100\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u0013H\'J\u001e\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00100\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u0013H\'J\u0018\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0001\u0010\u001e\u001a\u00020\u001fH\'J\"\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\u0005\u001a\u00020\u0004H\'J\"\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u00032\b\b\u0001\u0010\f\u001a\u00020\r2\b\b\u0001\u0010\b\u001a\u00020\u0007H\'\u00a8\u0006\""}, d2 = {"Lcom/example/akshayshopapp/productApi/ProductApi;", "", "addProduct", "Lio/reactivex/rxjava3/core/Single;", "Lcom/example/akshayshopapp/dataClass/Product;", "product", "addUser", "Lcom/example/akshayshopapp/dataClass/User;", "user", "deleteProduct", "Lretrofit2/Response;", "Ljava/lang/Void;", "id", "", "deleteUser", "getAllProduct", "", "getAllUsers", "getCategory", "", "getLimitedProduct", "limit", "getLimitedUser", "getProductByCategory", "category", "getProductsByOrder", "sort", "getUserByOrder", "login", "Lcom/example/akshayshopapp/dataClass/Login/LoginResponse;", "loginRequest", "Lcom/example/akshayshopapp/dataClass/Login/LoginRequest;", "updateProduct", "updateUser", "app_debug"})
public abstract interface ProductApi {
    
    @retrofit2.http.POST(value = "/auth/login")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<com.example.akshayshopapp.dataClass.Login.LoginResponse> login(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.dataClass.Login.LoginRequest loginRequest);
    
    @retrofit2.http.GET(value = "products")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.example.akshayshopapp.dataClass.Product>> getAllProduct();
    
    @retrofit2.http.GET(value = "products/categories")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<java.lang.String>> getCategory();
    
    @retrofit2.http.GET(value = "products/category/{type}")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.example.akshayshopapp.dataClass.Product>> getProductByCategory(@retrofit2.http.Path(value = "type")
    @org.jetbrains.annotations.NotNull()
    java.lang.String category);
    
    @retrofit2.http.GET(value = "products")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.example.akshayshopapp.dataClass.Product>> getLimitedProduct(@retrofit2.http.Query(value = "limit")
    int limit);
    
    @retrofit2.http.GET(value = "products")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.example.akshayshopapp.dataClass.Product>> getProductsByOrder(@retrofit2.http.Query(value = "sort")
    @org.jetbrains.annotations.NotNull()
    java.lang.String sort);
    
    @retrofit2.http.POST(value = "products")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<com.example.akshayshopapp.dataClass.Product> addProduct(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.dataClass.Product product);
    
    @retrofit2.http.PUT(value = "products/{id}")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<com.example.akshayshopapp.dataClass.Product> updateProduct(@retrofit2.http.Path(value = "id")
    int id, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.dataClass.Product product);
    
    @retrofit2.http.DELETE(value = "products/{id}")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<retrofit2.Response<java.lang.Void>> deleteProduct(@retrofit2.http.Path(value = "id")
    int id);
    
    @retrofit2.http.GET(value = "users")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.example.akshayshopapp.dataClass.User>> getAllUsers();
    
    @retrofit2.http.POST(value = "users")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<com.example.akshayshopapp.dataClass.User> addUser(@retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.dataClass.User user);
    
    @retrofit2.http.PUT(value = "users/{id}")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<com.example.akshayshopapp.dataClass.User> updateUser(@retrofit2.http.Path(value = "id")
    int id, @retrofit2.http.Body()
    @org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.dataClass.User user);
    
    @retrofit2.http.DELETE(value = "users/{id}")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<retrofit2.Response<java.lang.Void>> deleteUser(@retrofit2.http.Path(value = "id")
    int id);
    
    @retrofit2.http.GET(value = "users")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.example.akshayshopapp.dataClass.User>> getUserByOrder(@retrofit2.http.Query(value = "sort")
    @org.jetbrains.annotations.NotNull()
    java.lang.String sort);
    
    @retrofit2.http.GET(value = "users")
    @org.jetbrains.annotations.NotNull()
    public abstract io.reactivex.rxjava3.core.Single<java.util.List<com.example.akshayshopapp.dataClass.User>> getLimitedUser(@retrofit2.http.Query(value = "limit")
    int limit);
}