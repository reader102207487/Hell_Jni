package com.qffweather.android.myjni;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this, sayHello(), Toast.LENGTH_SHORT).show();

    }

    public void btn(View view){
        JniTest jniTest = new JniTest();
        Toast.makeText(this, jniTest.get(), Toast.LENGTH_SHORT).show();

    }
    public native String sayHello();

    /**
     * 导入c++lib,名字和build.gradle中声明的一样
     */
    static {
        System.loadLibrary("testLib");
    }
}
