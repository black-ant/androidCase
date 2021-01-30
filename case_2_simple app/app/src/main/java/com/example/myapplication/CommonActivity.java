package com.example.myapplication;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.logging.Logger;

/**
 * @Classname CommonActivity
 * @Description TODO
 * @Date 2021/1/30 18:10
 * @Created by zengzg
 */
public class CommonActivity extends AppCompatActivity {


    protected BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    return true;
                case R.id.navigation_dashboard:
                    return true;
                case R.id.navigation_notifications:
                    return true;
            }
            return false;
        }
    };

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        //子菜单部分：
        MenuInflater inflator = new MenuInflater(this);
        inflator.inflate(R.menu.navigation, menu);
        onCreateContextMenu(menu, v, menuInfo);
    }

    /**
     * 配置点击menu 的页面跳转
     *
     * @param item
     * @return
     */
    public boolean onContextItemSelected(MenuItem item) {

        android.util.Log.w("info", "Item id :" + item.getItemId());
        switch (item.getItemId()) {
            case R.id.navigation_home:
                Intent intent = new Intent();
                intent.setClass(this, HomeActivity.class);
                startActivity(intent);
                break;
            case R.id.navigation_dashboard:
                item.setCheckable(true);
                item.setIntent(new Intent(this, CollectionActivity.class));
                break;
            case R.id.navigation_notifications:
                item.setIntent(new Intent(this, DocActivity.class));
                item.setCheckable(true);
                break;
        }
        return true;
    }
}
