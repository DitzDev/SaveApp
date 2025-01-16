package com.ditzdev.savapp.activity.main;

import android.os.Bundle;
import android.view.Menu;
import androidx.appcompat.app.AppCompatActivity;
import com.ditzdev.savapp.activity.main.adapter.SavMainAdapter;
import com.ditzdev.savapp.databinding.LayoutSavAppMainBinding;
import com.ditzdev.savapp.R;
import com.google.android.material.tabs.TabLayoutMediator;

public class SavAppMain extends AppCompatActivity {
    
    private LayoutSavAppMainBinding binding;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = LayoutSavAppMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolbar);
        SavMainAdapter adapter = new SavMainAdapter(this);
        
        binding.viewPager.setAdapter(adapter);
        new TabLayoutMediator(binding.tabLayout, binding.viewPager, (tab, strategy) -> {
            switch(strategy) {
                case 0:
                    tab.setText("On Progress");
                    break;
                case 1: 
                    tab.setText("Completed");
                    break;  
            }
        }).attach();
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_item, menu);
        return true;
    }
}
