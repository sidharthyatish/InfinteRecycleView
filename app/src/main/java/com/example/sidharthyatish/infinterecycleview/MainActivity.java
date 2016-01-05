package com.example.sidharthyatish.infinterecycleview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        home fragment=new home();
        getSupportFragmentManager().beginTransaction().add(R.id.frame,fragment).commit();
    }
}
