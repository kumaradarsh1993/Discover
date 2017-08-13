package com.example.kadar.discover;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment1 = fm.findFragmentById(R.id.fragCon1);

        if (fragment1 == null) {
            fragment1 = new CardFragment1();
            fm.beginTransaction()
                    .add(R.id.fragCon1, fragment1)
                    .commit();


        }
    }
}
