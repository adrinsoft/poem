package com.adrinweb.poemfr;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.LinearLayout;


import com.google.android.material.navigation.NavigationView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView=(RecyclerView) findViewById(R.id.recycler_view);
        NewsAdapter newsAdapter=new NewsAdapter(this,DataFakeGenerator.getData(this));
        recyclerView.setLayoutManager(new GridLayoutManager(this,2,LinearLayoutManager.VERTICAL,false));
        recyclerView.setAdapter(newsAdapter);
        setupToolbar();
        setupNavigationView(this);


    }

    private void setupNavigationView(final Context context) {
        NavigationView navigationView=(NavigationView) findViewById(R.id.navigation_view);
        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.setting_app:
                        startActivity(new Intent(MainActivity.this,setting.class));
                        break;
                    case R.id.contact_us:
                        startActivity(new Intent(MainActivity.this,about_us.class));
                        break;
                    case R.id.share_app:
                        final String appPackageName = context.getPackageName();
                        Intent sendIntent = new Intent();
                        sendIntent.setAction(Intent.ACTION_SEND);
                        sendIntent.putExtra(Intent.EXTRA_TEXT, "Check out the App at: https://play.google.com/store/apps/details?id=" + appPackageName);
                        sendIntent.setType("text/plain");
                        context.startActivity(sendIntent);
                        break;

                }
                 return true;
            }
        });

    }

    private void setupToolbar(){
        DrawerLayout drawerLayout=(DrawerLayout) findViewById(R.id.drawer_layout);
        androidx.appcompat.widget.Toolbar toolbar =findViewById(R.id.toolbar);
        toolbar.setTitleTextColor(getResources().getColor(R.color.White));
        setSupportActionBar(toolbar);
        ActionBar actionBar=getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setHomeButtonEnabled(true);
        ActionBarDrawerToggle drawerToggle=new ActionBarDrawerToggle(this,drawerLayout,toolbar,0,0);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

    }

}
