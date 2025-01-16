package com.ditzdev.savapp.activity.splash;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.ditzdev.savapp.databinding.LayoutSplashBinding;

public class Splash extends AppCompatActivity {
    
    private LayoutSplashBinding binding;
    private static final int DELAY = 3000;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = LayoutSplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}