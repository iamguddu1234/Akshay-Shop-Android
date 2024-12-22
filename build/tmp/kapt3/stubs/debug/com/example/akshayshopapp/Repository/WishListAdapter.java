package com.example.akshayshopapp.Repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0014\u0010\u0013\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/akshayshopapp/Repository/WishListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/akshayshopapp/Repository/WishListAdapter$WishListViewHolder;", "wishList", "", "Lcom/example/akshayshopapp/dataClass/Product;", "removeFromWishList", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateWishList", "newWishList", "WishListViewHolder", "app_debug"})
public final class WishListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.akshayshopapp.Repository.WishListAdapter.WishListViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.akshayshopapp.dataClass.Product> wishList;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<com.example.akshayshopapp.dataClass.Product, kotlin.Unit> removeFromWishList = null;
    
    public WishListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.akshayshopapp.dataClass.Product> wishList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super com.example.akshayshopapp.dataClass.Product, kotlin.Unit> removeFromWishList) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.akshayshopapp.Repository.WishListAdapter.WishListViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.Repository.WishListAdapter.WishListViewHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public final void updateWishList(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.akshayshopapp.dataClass.Product> newWishList) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00060\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/example/akshayshopapp/Repository/WishListAdapter$WishListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/akshayshopapp/databinding/WishlistViewBinding;", "(Lcom/example/akshayshopapp/databinding/WishlistViewBinding;)V", "bind", "", "product", "Lcom/example/akshayshopapp/dataClass/Product;", "context", "Landroid/content/Context;", "removeFromWishList", "Lkotlin/Function1;", "app_debug"})
    public static final class WishListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.akshayshopapp.databinding.WishlistViewBinding binding = null;
        
        public WishListViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.akshayshopapp.databinding.WishlistViewBinding binding) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.akshayshopapp.dataClass.Product product, @org.jetbrains.annotations.NotNull()
        android.content.Context context, @org.jetbrains.annotations.NotNull()
        kotlin.jvm.functions.Function1<? super com.example.akshayshopapp.dataClass.Product, kotlin.Unit> removeFromWishList) {
        }
    }
}