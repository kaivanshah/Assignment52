package com.kaivanshah.assignment52;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        menu.add(Menu.NONE,Menu.NONE,0, "Option").setIcon(R.drawable.mainmenu).setShowAsAction(MenuItem.SHOW_AS_ACTION_ALWAYS);
        menu.add(Menu.NONE,Menu.NONE,1, "Computer").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MainActivity.this, "Computer option is clicked", Toast.LENGTH_SHORT).show();
                return true;
            }
        });;
        menu.add(Menu.NONE,Menu.NONE,2, "Gamepad").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MainActivity.this, "Gamepad option is clicked", Toast.LENGTH_SHORT).show();
                return true;
            }
        });;
        menu.add(Menu.NONE,Menu.NONE,3, "Camera").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MainActivity.this, "Camera option is clicked", Toast.LENGTH_SHORT).show();
                return true;
            }
        });;
        menu.add(Menu.NONE,Menu.NONE,4, "Video").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MainActivity.this, "Video option is clicked", Toast.LENGTH_SHORT).show();
                return true;
            }
        });;
        menu.add(Menu.NONE,Menu.NONE,5, "Email").setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem item) {
                Toast.makeText(MainActivity.this, "Email option is clicked", Toast.LENGTH_SHORT).show();
                return true;
            }
        });;




        return true;
    }


}
