// Generated by view binder compiler. Do not edit!
package com.example.akshayshopapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.akshayshopapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityUpdateProductBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button UpdateP;

  @NonNull
  public final EditText edCategory;

  @NonNull
  public final EditText edDescription;

  @NonNull
  public final EditText edId;

  @NonNull
  public final EditText edImageUrl;

  @NonNull
  public final EditText edPrice;

  @NonNull
  public final EditText edTitle;

  private ActivityUpdateProductBinding(@NonNull LinearLayout rootView, @NonNull Button UpdateP,
      @NonNull EditText edCategory, @NonNull EditText edDescription, @NonNull EditText edId,
      @NonNull EditText edImageUrl, @NonNull EditText edPrice, @NonNull EditText edTitle) {
    this.rootView = rootView;
    this.UpdateP = UpdateP;
    this.edCategory = edCategory;
    this.edDescription = edDescription;
    this.edId = edId;
    this.edImageUrl = edImageUrl;
    this.edPrice = edPrice;
    this.edTitle = edTitle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityUpdateProductBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityUpdateProductBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_update_product, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityUpdateProductBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.UpdateP;
      Button UpdateP = ViewBindings.findChildViewById(rootView, id);
      if (UpdateP == null) {
        break missingId;
      }

      id = R.id.ed_category;
      EditText edCategory = ViewBindings.findChildViewById(rootView, id);
      if (edCategory == null) {
        break missingId;
      }

      id = R.id.ed_description;
      EditText edDescription = ViewBindings.findChildViewById(rootView, id);
      if (edDescription == null) {
        break missingId;
      }

      id = R.id.ed_id;
      EditText edId = ViewBindings.findChildViewById(rootView, id);
      if (edId == null) {
        break missingId;
      }

      id = R.id.ed_imageUrl;
      EditText edImageUrl = ViewBindings.findChildViewById(rootView, id);
      if (edImageUrl == null) {
        break missingId;
      }

      id = R.id.ed_price;
      EditText edPrice = ViewBindings.findChildViewById(rootView, id);
      if (edPrice == null) {
        break missingId;
      }

      id = R.id.ed_title;
      EditText edTitle = ViewBindings.findChildViewById(rootView, id);
      if (edTitle == null) {
        break missingId;
      }

      return new ActivityUpdateProductBinding((LinearLayout) rootView, UpdateP, edCategory,
          edDescription, edId, edImageUrl, edPrice, edTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
