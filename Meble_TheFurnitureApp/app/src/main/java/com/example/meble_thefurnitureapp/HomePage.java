package com.example.meble_thefurnitureapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Menu;
import android.widget.Button;

import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.navigation.NavigationView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.appcompat.app.AppCompatActivity;

import com.example.meble_thefurnitureapp.databinding.ActivityHomePageBinding;
import com.google.firebase.auth.FirebaseAuth;

public class HomePage extends AppCompatActivity {
    FirebaseAuth auth;
    Button signout;
    private AppBarConfiguration mAppBarConfiguration;
    ActivityHomePageBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        auth = FirebaseAuth.getInstance();

        binding = ActivityHomePageBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        setSupportActionBar(binding.appBarHomePage.toolbar);

        DrawerLayout drawer = binding.drawerLayout;
        NavigationView navigationView = binding.navView;
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        mAppBarConfiguration = new AppBarConfiguration.Builder(
                R.id.nav_home,R.id.nav_bar_furniture, R.id.nav_beds, R.id.nav_bookcases_shelves,R.id.nav_chairs,R.id.nav_furniture_sets
                ,R.id.nav_tables,R.id.nav_media)
                .setDrawerLayout(drawer)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_home_page);
        NavigationUI.setupActionBarWithNavController(this, navController, mAppBarConfiguration);
        NavigationUI.setupWithNavController(navigationView, navController);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.home_page, menu);
        return true;
    }

    @Override
    public boolean onSupportNavigateUp() {
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment_content_home_page);
        return NavigationUI.navigateUp(navController, mAppBarConfiguration)
                || super.onSupportNavigateUp();
    }


    public void signout(MenuItem item) {
        auth.signOut();

        Intent i = new Intent(getApplicationContext(),LoginPage.class);
        startActivity(i);
    }

    public void AboutUs(MenuItem item) {
        Intent i = new Intent(getApplicationContext(),AboutUs.class);
        startActivity(i);
    }

    public void sofa_beds(View view) {
        Intent i = new Intent(getApplicationContext(),Beds_SofaBeds.class);
        startActivity(i);
    }

    public void stools(View view) {
        Intent i = new Intent(getApplicationContext(),Chairs_Stools.class);
        startActivity(i);
    }

    public void bookcases(View view) {
        Intent i = new Intent(getApplicationContext(),BookcasesShelves_Bookcases.class);
        startActivity(i);
    }

    public void computer_table(View view) {
        Intent i = new Intent(getApplicationContext(),TablesAndDesks_ComputerDesks.class);
        startActivity(i);
    }

    public void outside_furniture(View view) {
        Intent i = new Intent(getApplicationContext(),FurnitureSets_Oscfurniture.class);
        startActivity(i);
    }

    public void childrens_beds(View view) {
        Intent i = new Intent(getApplicationContext(),Beds_ChildrensBeds.class);
        startActivity(i);
    }
}