package com.example.akshayshopapp.Adapter;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\'\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\b\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000bH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000bH\u0016J\u0014\u0010\u0013\u001a\u00020\b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0016"}, d2 = {"Lcom/example/akshayshopapp/Adapter/CategoryAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/akshayshopapp/Adapter/CategoryAdapter$CategoryViewHolder;", "categoryList", "", "", "onItemClicked", "Lkotlin/Function1;", "", "(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V", "getItemCount", "", "onBindViewHolder", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "updateCategoryList", "newCategory", "CategoryViewHolder", "app_debug"})
public final class CategoryAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.akshayshopapp.Adapter.CategoryAdapter.CategoryViewHolder> {
    @org.jetbrains.annotations.NotNull()
    private java.util.List<java.lang.String> categoryList;
    @org.jetbrains.annotations.NotNull()
    private final kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> onItemClicked = null;
    
    public CategoryAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> categoryList, @org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function1<? super java.lang.String, kotlin.Unit> onItemClicked) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.NotNull()
    public com.example.akshayshopapp.Adapter.CategoryAdapter.CategoryViewHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    com.example.akshayshopapp.Adapter.CategoryAdapter.CategoryViewHolder holder, int position) {
    }
    
    public final void updateCategoryList(@org.jetbrains.annotations.NotNull()
    java.util.List<java.lang.String> newCategory) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/example/akshayshopapp/Adapter/CategoryAdapter$CategoryViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "binding", "Lcom/example/akshayshopapp/databinding/CustomeCategoryBinding;", "(Lcom/example/akshayshopapp/databinding/CustomeCategoryBinding;)V", "getBinding", "()Lcom/example/akshayshopapp/databinding/CustomeCategoryBinding;", "app_debug"})
    public static final class CategoryViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull()
        private final com.example.akshayshopapp.databinding.CustomeCategoryBinding binding = null;
        
        public CategoryViewHolder(@org.jetbrains.annotations.NotNull()
        com.example.akshayshopapp.databinding.CustomeCategoryBinding binding) {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.example.akshayshopapp.databinding.CustomeCategoryBinding getBinding() {
            return null;
        }
    }
}