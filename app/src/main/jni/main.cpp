//
// Created by qff on 2017/5/22.
//
#include "com_qffweather_android_myjni_MainActivity.h"
JNIEXPORT jstring JNICALL Java_com_qffweather_android_myjni_MainActivity_sayHello(JNIEnv*env ,jobject obj)
{
        return env -> NewStringUTF("Hello jni");
}