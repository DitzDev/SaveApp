package com.ditzdev.savapp.activity.main.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.ditzdev.savapp.activity.main.fragment.FragmentOnComplete;
import com.ditzdev.savapp.activity.main.fragment.FragmentOnProgress;

public class SavMainAdapter extends FragmentStateAdapter {
    public SavMainAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }
    
    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0: return new FragmentOnProgress();
            case 1: return new FragmentOnComplete();
            default: return new FragmentOnProgress();
        }   
    }      
    
    @Override
    public int getItemCount() {
        return 2;
    } 
}
