package com.example.akshayshopapp.Room;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\fH\u0086@\u00a2\u0006\u0002\u0010\rJ\u0016\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\u0010J\u0016\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\bH\u0086@\u00a2\u0006\u0002\u0010\u0010R\u001d\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0012"}, d2 = {"Lcom/example/akshayshopapp/Room/WishlistRepository;", "", "productDao", "Lcom/example/akshayshopapp/Room/ProductDao;", "(Lcom/example/akshayshopapp/Room/ProductDao;)V", "allWishlistProduct", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/akshayshopapp/dataClass/Product;", "getAllWishlistProduct", "()Landroidx/lifecycle/LiveData;", "clearCart", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteWishlistProduct", "product", "(Lcom/example/akshayshopapp/dataClass/Product;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertWishlistProduct", "app_debug"})
public final class WishlistRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.akshayshopapp.Room.ProductDao productDao = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<java.util.List<com.example.akshayshopapp.dataClass.Product>> allWishlistProduct = null;
    
    public WishlistRepository(@org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.Room.ProductDao productDao) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.akshayshopapp.dataClass.Product>> getAllWishlistProduct() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertWishlistProduct(@org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.dataClass.Product product, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteWishlistProduct(@org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.dataClass.Product product, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object clearCart(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> $completion) {
        return null;
    }
}