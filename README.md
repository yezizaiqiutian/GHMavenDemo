# GHMavenDemo

> 发布远程maven到github的学习demo

学习链接:https://zhuanlan.zhihu.com/p/259140063
自己demo地址:https://github.com/yezizaiqiutian/GHMavenDemo

主要流程
1 projcet中build.gradle
```
classpath 'com.github.dcendents:android-maven-gradle-plugin:2.1'
```
2 lib中build.gradle
```
plugins {
    id 'com.android.library'
    id 'kotlin-android'
    id 'com.github.dcendents.android-maven'//添加maven
}
```
3 打开github设置版本
4 引入依赖
app中build.gradle
```
//    implementation project(':lib_demo')
    implementation 'com.github.yezizaiqiutian:GHMavenDemo:0.1'
```