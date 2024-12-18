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

public final class ActivityLoginScreenBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final EditText edPassword;

  @NonNull
  public final EditText edUsername;

  @NonNull
  public final Button login;

  @NonNull
  public final Button register;

  @NonNull
  public final Button signInWithFacebook;

  @NonNull
  public final Button signInWithGoogle;

  private ActivityLoginScreenBinding(@NonNull LinearLayout rootView, @NonNull EditText edPassword,
      @NonNull EditText edUsername, @NonNull Button login, @NonNull Button register,
      @NonNull Button signInWithFacebook, @NonNull Button signInWithGoogle) {
    this.rootView = rootView;
    this.edPassword = edPassword;
    this.edUsername = edUsername;
    this.login = login;
    this.register = register;
    this.signInWithFacebook = signInWithFacebook;
    this.signInWithGoogle = signInWithGoogle;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityLoginScreenBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityLoginScreenBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_login_screen, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityLoginScreenBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ed_password;
      EditText edPassword = ViewBindings.findChildViewById(rootView, id);
      if (edPassword == null) {
        break missingId;
      }

      id = R.id.ed_Username;
      EditText edUsername = ViewBindings.findChildViewById(rootView, id);
      if (edUsername == null) {
        break missingId;
      }

      id = R.id.login;
      Button login = ViewBindings.findChildViewById(rootView, id);
      if (login == null) {
        break missingId;
      }

      id = R.id.register;
      Button register = ViewBindings.findChildViewById(rootView, id);
      if (register == null) {
        break missingId;
      }

      id = R.id.signInWithFacebook;
      Button signInWithFacebook = ViewBindings.findChildViewById(rootView, id);
      if (signInWithFacebook == null) {
        break missingId;
      }

      id = R.id.signInWithGoogle;
      Button signInWithGoogle = ViewBindings.findChildViewById(rootView, id);
      if (signInWithGoogle == null) {
        break missingId;
      }

      return new ActivityLoginScreenBinding((LinearLayout) rootView, edPassword, edUsername, login,
          register, signInWithFacebook, signInWithGoogle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
