package com.shabiruzzaman_shiam.wallpaper_by_sn.activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.shabiruzzaman_shiam.wallpaper_by_sn.R;
import com.shabiruzzaman_shiam.wallpaper_by_sn.fragments.HomeFragment;

public class Dashboard extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener{

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);

        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        displayFragment(new HomeFragment());
    }

    private void displayFragment(Fragment fragment){

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.content_area,fragment).commit();
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment;
        switch (item.getItemId()){
            case R.id.nav_home:
                fragment = new HomeFragment();
                break;
            case R.id.nav_fav:
                fragment = new HomeFragment();

                break;
            case R.id.nav_set:
                fragment = new HomeFragment();

                break;
            default:
                fragment = new HomeFragment();
                break;

        }
        displayFragment(fragment);
        return true;


    }
}
