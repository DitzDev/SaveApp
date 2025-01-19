package com.ditzdev.savapp.activity.main;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import com.ditzdev.savapp.activity.main.adapter.SavMainAdapter;
import com.ditzdev.savapp.databinding.LayoutSavAppMainBinding;
import com.ditzdev.savapp.R;
import com.google.android.gms.oss.licenses.OssLicensesActivity;
import com.google.android.gms.oss.licenses.OssLicensesMenuActivity;
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
        new TabLayoutMediator(
                        binding.tabLayout,
                        binding.viewPager,
                        (tab, strategy) -> {
                            switch (strategy) {
                                case 0:
                                    tab.setText("On Progress");
                                    break;
                                case 1:
                                    tab.setText("Completed");
                                    break;
                            }
                        })
                .attach();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.toolbar_item, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int itemId = item.getItemId();
        if (itemId == R.id.menu_settings) {
            Toast.makeText(this, "Settings clicked", Toast.LENGTH_SHORT).show();
            return true;
        } else if (itemId == R.id.menu_license) {
            OssLicensesMenuActivity.setActivityTitle(getString(R.string.app_name));
            startActivity(new Intent(this, OssLicensesMenuActivity.class));
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
