// Generated by view binder compiler. Do not edit!
package com.example.meble_thefurnitureapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import com.example.meble_thefurnitureapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentFurnitureSetsBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final ImageView ArmChairs;

  @NonNull
  public final ImageView BathroomFurnitureSets;

  @NonNull
  public final ImageView DiningSets;

  @NonNull
  public final ImageView OscFurniture;

  private FragmentFurnitureSetsBinding(@NonNull ScrollView rootView, @NonNull ImageView ArmChairs,
      @NonNull ImageView BathroomFurnitureSets, @NonNull ImageView DiningSets,
      @NonNull ImageView OscFurniture) {
    this.rootView = rootView;
    this.ArmChairs = ArmChairs;
    this.BathroomFurnitureSets = BathroomFurnitureSets;
    this.DiningSets = DiningSets;
    this.OscFurniture = OscFurniture;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentFurnitureSetsBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentFurnitureSetsBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_furniture_sets, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentFurnitureSetsBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.ArmChairs;
      ImageView ArmChairs = rootView.findViewById(id);
      if (ArmChairs == null) {
        break missingId;
      }

      id = R.id.BathroomFurnitureSets;
      ImageView BathroomFurnitureSets = rootView.findViewById(id);
      if (BathroomFurnitureSets == null) {
        break missingId;
      }

      id = R.id.DiningSets;
      ImageView DiningSets = rootView.findViewById(id);
      if (DiningSets == null) {
        break missingId;
      }

      id = R.id.OscFurniture;
      ImageView OscFurniture = rootView.findViewById(id);
      if (OscFurniture == null) {
        break missingId;
      }

      return new FragmentFurnitureSetsBinding((ScrollView) rootView, ArmChairs,
          BathroomFurnitureSets, DiningSets, OscFurniture);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
