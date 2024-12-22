package com.example.akshayshopapp.Adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB;\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\nJ\u000e\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u000eJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0010H\u0016J\u0018\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0010H\u0016J\u0014\u0010\u0018\u001a\u00020\b2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/example/akshayshopapp/Adapter/ProductListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/akshayshopapp/Adapter/ProductListAdapter$ProductViewHolder;", "productList", "", "Lcom/example/akshayshopapp/dataClass/Product;", "onItemCLicked", "Lkotlin/Function1;", "", "onFavorite", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V", "filterProductList", "filter", "query", "", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateProductList", "newProductList", "ProductViewHolder", "app_debug"})
public final class ProductListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.akshayshopapp.Adapter.ProductListAdapter.ProductViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.akshayshopapp.dataClass.Product> productList;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.example.akshayshopapp.dataClass.Product, kotlin.Unit> onItemCLicked = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.example.akshayshopapp.dataClass.Product, kotlin.Unit> onFavorite = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.akshayshopapp.dataClass.Product> filterProductList;
    
    public ProductListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.akshayshopapp.dataClass.Product> productList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.akshayshopapp.dataClass.Product, kotlin.Unit> onItemCLicked, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.akshayshopapp.dataClass.Product, kotlin.Unit> onFavorite) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.akshayshopapp.Adapter.ProductListAdapter.ProductViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.Adapter.ProductListAdapter.ProductViewHolder holder, int position) {
    }
    
    public final void filter(@org.jetbrains.annotations.NotNull()
    java.lang.String query) {
    }
    
    public final void updateProductList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.akshayshopapp.dataClass.Product> newProductList) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/akshayshopapp/Adapter/ProductListAdapter$ProductViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/akshayshopapp/databinding/CustomeProductCardBinding;", "(Lcom/example/akshayshopapp/databinding/CustomeProductCardBinding;)V", "getBinding", "()Lcom/example/akshayshopapp/databinding/CustomeProductCardBinding;", "app_debug"})
    public static final class ProductViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.akshayshopapp.databinding.CustomeProductCardBinding binding = null;
        
        public ProductViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.akshayshopapp.databinding.CustomeProductCardBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.akshayshopapp.databinding.CustomeProductCardBinding getBinding() {
            return null;
        }
    }
}