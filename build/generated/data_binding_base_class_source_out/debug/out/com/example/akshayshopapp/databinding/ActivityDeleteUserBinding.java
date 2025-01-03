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

public final class ActivityDeleteUserBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText edId;

  @NonNull
  public final Button userDELETE;

  private ActivityDeleteUserBinding(@NonNull LinearLayout rootView, @NonNull EditText edId,
      @NonNull Button userDELETE) {
    this.rootView = rootView;
    this.edId = edId;
    this.userDELETE = userDELETE;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityDeleteUserBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityDeleteUserBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_delete_user, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityDeleteUserBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ed_id;
      EditText edId = ViewBindings.findChildViewById(rootView, id);
      if (edId == null) {
        break missingId;
      }

      id = R.id.userDELETE;
      Button userDELETE = ViewBindings.findChildViewById(rootView, id);
      if (userDELETE == null) {
        break missingId;
      }

      return new ActivityDeleteUserBinding((LinearLayout) rootView, edId, userDELETE);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
