package com.example.bottomnavigationview;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {
    BottomNavigationView bottomNavigation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction hometrans =getSupportFragmentManager().beginTransaction();
        hometrans.replace(R.id.data,new HomeFragment());
        hometrans.commit();
        bottomNavigation = findViewById(R.id.bottomNavigationView);
        bottomNavigation.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                int itemid = item.getItemId();
                switch (itemid){
                    case R.id.home_tab:
                        FragmentTransaction hometrans =getSupportFragmentManager().beginTransaction();
                        hometrans.replace(R.id.data,new HomeFragment());
                        hometrans.commit();
                        break;
                }
                return true;
            }
        });
    }
}