//
// Created by qff on 2017/5/22.
//

#include "com_qffweather_android_myjni_JniTest.h"
JNIEXPORT jstring JNICALL Java_com_qffweather_android_myjni_JniTest_get(JNIEnv*env ,jobject obj)
{
        return env -> NewStringUTF("Hello jni 我是c++");
}