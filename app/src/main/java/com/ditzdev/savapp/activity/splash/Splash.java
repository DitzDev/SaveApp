package com.ditzdev.savapp.activity.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import androidx.appcompat.app.AppCompatActivity;
import com.ditzdev.savapp.activity.main.SavAppMain;
import com.ditzdev.savapp.databinding.LayoutSplashBinding;

public class Splash extends AppCompatActivity {
    
    private LayoutSplashBinding binding;
    private static final int DELAY = 3000;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = LayoutSplashBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        new Handler().postDelayed(() -> {
            startActivity(new Intent(this, SavAppMain.class));
            finish();    
        }, DELAY);
    }
}