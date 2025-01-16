package com.ditzdev.savapp.activity.main.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import com.ditzdev.savapp.databinding.LayoutFragmentOnProgressBinding;

public class FragmentOnProgress extends Fragment {

    private LayoutFragmentOnProgressBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflate,
            @Nullable ViewGroup container,
            @Nullable Bundle savedInstanceState) {
        binding = LayoutFragmentOnProgressBinding.inflate(inflate, container, false);
        return binding.getRoot();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        binding = null;
    }
}
