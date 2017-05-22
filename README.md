# Hell_Jni
jni入门
生成头文件.h。在Android Studio terminal中进入到app/src/main/java目录，使用命令javah -d ../jni 包名.MainActivity生成头文件。
（3）在app的build.gradle中配置lib。moduleName是我们的c/c++ lib的名称，可以随便指定，abiFilters确定我们要生成哪些平台的lib，使用过第三方SDK的同学一定很熟悉，因为经常需要我们把第三方的lib拷贝到我们的libs对应目录下。这步和eclipse中配置.mk文件类似。

defaultConfig {
        applicationId "com.example.tziyao.ndkdemo"
        minSdkVersion 15
        targetSdkVersion 23
        versionCode 1
        versionName "1.0"
        ndk{
            moduleName "testLib"
            abiFilters "armeabi","armeabi-v7a","x86"
        }
    }
（4）在需要使用native的类中导入c/c++ lib。这里我需要在MainActivity中导入。名字需要和在build.gradle中声明的一样。

static {
        System.loadLibrary("testLib");
    }
（5）在c中实现sayHello方法。首先需要在jni目录下创建一个.c或.cpp文件，文件名随意，我这里就叫main。
