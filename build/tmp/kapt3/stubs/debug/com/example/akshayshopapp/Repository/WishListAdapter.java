package com.example.akshayshopapp.Repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\nH\u0002J\u0014\u0010\u0014\u001a\u00020\f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/akshayshopapp/Repository/WishListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/akshayshopapp/Repository/WishListAdapter$WishListViewHolder;", "wishList", "", "Lcom/example/akshayshopapp/dataClass/Product;", "wishlistViewModel", "Lcom/example/akshayshopapp/Room/WishlistViewModel;", "(Ljava/util/List;Lcom/example/akshayshopapp/Room/WishlistViewModel;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "removeWishListItem", "setWishListProduct", "products", "", "WishListViewHolder", "app_debug"})
public final class WishListAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.akshayshopapp.Repository.WishListAdapter.WishListViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<com.example.akshayshopapp.dataClass.Product> wishList;
    @org.jetbrains.annotations.NotNull()
    private final com.example.akshayshopapp.Room.WishlistViewModel wishlistViewModel = null;
    
    public WishListAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.akshayshopapp.dataClass.Product> wishList, @org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.Room.WishlistViewModel wishlistViewModel) {
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
    
    private final void removeWishListItem(int position) {
    }
    
    public final void setWishListProduct(@org.jetbrains.annotations.NotNull()
    java.util.List<com.example.akshayshopapp.dataClass.Product> products) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u000b"}, d2 = {"Lcom/example/akshayshopapp/Repository/WishListAdapter$WishListViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/akshayshopapp/databinding/WishlistViewBinding;", "(Lcom/example/akshayshopapp/databinding/WishlistViewBinding;)V", "getBinding", "()Lcom/example/akshayshopapp/databinding/WishlistViewBinding;", "bind", "", "product", "Lcom/example/akshayshopapp/dataClass/Product;", "app_debug"})
    public static final class WishListViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.akshayshopapp.databinding.WishlistViewBinding binding = null;
        
        public WishListViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.akshayshopapp.databinding.WishlistViewBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.akshayshopapp.databinding.WishlistViewBinding getBinding() {
            return null;
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        com.example.akshayshopapp.dataClass.Product product) {
        }
    }
}