package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.BottomNavigationView;
import android.view.View;
import android.widget.Button;
import com.example.myapplication.layout.FrameLayoutView;

public class MainActivity extends CommonActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        // redirect 方式一 : event 触发
        // 见下方

        // redirect 方式二 : 对象触发
        Button btnButton = findViewById(R.id.loginButton2);
        btnButton.setOnClickListener(new MyListener());

        // redirect 方式三 : 匿名内部类
        Button btnButton3 = findViewById(R.id.loginButton3);
        btnButton3.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                System.out.println("匿名内部类响应按钮点击事件");
            }
        });

        // redirect 方式四 : 继承 OnClickListener
        Button btnButton4 = findViewById(R.id.loginButton4);
        btnButton4.setOnClickListener(this);

    }

    /**
     * redirect 方式一 : event 触发
     *
     * @param v
     */
    public void btnOnClick(View v) {
        System.out.println("定义属性响应按钮点击事件");
    }

    /**
     * redirect 方式四 : 先实现 OnClickListener
     *
     * @param v
     */
    @Override
    public void onClick(View v) {

        System.out.println("redirect 4 to home Activity");
        // 此处跳转到首页
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, HomeActivity.class);
        startActivity(intent);
    }

    /**
     * redirect 方式二 :
     */
    class MyListener implements View.OnClickListener {

        @Override
        public void onClick(View v) {
            System.out.println("内部类响应点击事件");
        }
    }


    /**
     * ============ 布局格式
     */
    public void btnOnClickTableLayout(View v) {
        System.out.println("btnOnClickTableLayout");
        // 此处跳转到首页
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, FrameLayoutView.class);
        startActivity(intent);
    }

    public void btnOnClickFrameLayout(View v) {
        System.out.println("btnOnClickTableLayout");
        // 此处跳转到首页
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, FrameLayoutView.class);
        startActivity(intent);
    }

    public void btnOnClickGridLayout(View v) {
        System.out.println("btnOnClickTableLayout");
        // 此处跳转到首页
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, FrameLayoutView.class);
        startActivity(intent);
    }

    public void btnOnClickAbsoluteLayout(View v) {
        System.out.println("btnOnClickTableLayout");
        // 此处跳转到首页
        Intent intent = new Intent();
        intent.setClass(MainActivity.this, FrameLayoutView.class);
        startActivity(intent);
    }


}
