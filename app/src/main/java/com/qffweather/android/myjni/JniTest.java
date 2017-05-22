package com.qffweather.android.myjni;

/**
 * Created by qff on 2017/5/21.
 */

public class JniTest {
    static {
        System.loadLibrary("testLib");
    }

    public static void main(String args[]){
        JniTest jniTest = new JniTest();
        System.out.println(jniTest.get());
        jniTest.set("hello world");
    }

    public native String get();
    public native void set(String str);
}
