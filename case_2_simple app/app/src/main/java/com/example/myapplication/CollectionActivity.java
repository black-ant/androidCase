package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * @Classname CollectionActivity
 * @Description TODO
 * @Date 2021/1/30 18:08
 * @Created by zengzg
 */
public class CollectionActivity  extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.active_collection);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
    }
}
