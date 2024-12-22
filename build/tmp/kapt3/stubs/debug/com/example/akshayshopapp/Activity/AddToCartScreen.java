package com.example.akshayshopapp.Activity;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\u001a\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00102\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u001b\u001a\u00020\u0015H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001c"}, d2 = {"Lcom/example/akshayshopapp/Activity/AddToCartScreen;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/razorpay/PaymentResultListener;", "()V", "binding", "Lcom/example/akshayshopapp/databinding/ActivityAddToCartScreenBinding;", "cartViewModel", "Lcom/example/akshayshopapp/Room/CartViewModel;", "getCartViewModel", "()Lcom/example/akshayshopapp/Room/CartViewModel;", "cartViewModel$delegate", "Lkotlin/Lazy;", "productList", "", "Lcom/example/akshayshopapp/dataClass/Product;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPaymentError", "code", "", "response", "", "onPaymentSuccess", "razorpayPaymentID", "startPayment", "amount", "app_debug"})
public final class AddToCartScreen extends androidx.appcompat.app.AppCompatActivity implements com.razorpay.PaymentResultListener {
    private com.example.akshayshopapp.databinding.ActivityAddToCartScreenBinding binding;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.example.akshayshopapp.dataClass.Product> productList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.Lazy cartViewModel$delegate = null;
    
    public AddToCartScreen() {
        super();
    }
    
    private final com.example.akshayshopapp.Room.CartViewModel getCartViewModel() {
        return null;
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void startPayment(int amount) {
    }
    
    @java.lang.Override()
    public void onPaymentSuccess(@org.jetbrains.annotations.Nullable()
    java.lang.String razorpayPaymentID) {
    }
    
    @java.lang.Override()
    public void onPaymentError(int code, @org.jetbrains.annotations.Nullable()
    java.lang.String response) {
    }
}