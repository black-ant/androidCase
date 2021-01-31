package com.example.myapplication;

import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

/**
 * @Classname HomeActivity
 * @Description TODO
 * @Date 2021/1/30 18:07
 * @Created by zengzg
 */
public class HomeActivity extends CommonActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.active_home);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
    }


}
