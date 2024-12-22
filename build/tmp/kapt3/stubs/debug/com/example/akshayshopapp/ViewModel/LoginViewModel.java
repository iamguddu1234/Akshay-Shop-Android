package com.example.akshayshopapp.ViewModel;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\b\u0010\u0013\u001a\u00020\u000fH\u0014R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u000b8F\u00a2\u0006\u0006\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/example/akshayshopapp/ViewModel/LoginViewModel;", "Landroidx/lifecycle/ViewModel;", "repository", "Lcom/example/akshayshopapp/Repository/LoginRepository;", "(Lcom/example/akshayshopapp/Repository/LoginRepository;)V", "_loginLiveData", "Landroidx/lifecycle/MutableLiveData;", "Lcom/example/akshayshopapp/dataClass/Login/LoginResponse;", "compositeDisposable", "Lio/reactivex/rxjava3/disposables/CompositeDisposable;", "loginLiveData", "Landroidx/lifecycle/LiveData;", "getLoginLiveData", "()Landroidx/lifecycle/LiveData;", "login", "", "username", "", "password", "onCleared", "app_debug"})
public final class LoginViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.akshayshopapp.Repository.LoginRepository repository = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.akshayshopapp.dataClass.Login.LoginResponse> _loginLiveData = null;
    @org.jetbrains.annotations.NotNull()
    private final io.reactivex.rxjava3.disposables.CompositeDisposable compositeDisposable = null;
    
    public LoginViewModel(@org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.Repository.LoginRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.akshayshopapp.dataClass.Login.LoginResponse> getLoginLiveData() {
        return null;
    }
    
    public final void login(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String password) {
    }
    
    @java.lang.Override()
    protected void onCleared() {
    }
}