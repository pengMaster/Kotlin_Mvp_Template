<h1 align="center">A good framework is one that suits the team


</h1>
<p align="center">
  <a href="README_CN.md">
    <b>Chinese Description</b>
  </a>
</p>

### 1.project brief
This project is a lightweight template project based on kotlin + Mvp + Rxjava + Retrofit package without too much redundant dependencies, suitable for rapid development as well as novice training。

### 2.directory structure
```
├── .gradle
├── .idea
├── app.main.java.package
│   ├── api                 Configure the request address
│   ├── base                base packaging
│   ├── glide               Image loading frame
│   ├── net                 Network request framework configuration
│   ├── rx                  rxjava configuration
│   ├── mvp
│   │    └── contract       view and presenter Implement method interface
│   │    └── model          Data loading layer
│   │    └── presenter      Logical processing layer (data loading page display)
│   ├── ui
│   │    └── activity       activity
│   │    └── adapter        adapter
│   │    └── fragment       fragment
│   ├── utils               utils
│   ├── view                view widget
│   ├── Constants.kt        Constants
│   ├── Extensions.kt       Extensions
│   ├── MyApplication.kt    Application
├── build
├── gradle
├── build.gradle
├── settings.gradle

```

### 3.scheme

<div >
<img src="https://github.com/pengMaster/picApplyGit/blob/master/KotlinMvp/Architecture.png"   alt="引自MvpArms"/>
</div>

### 4.choosing technology

| MvpArms   | KotlinMvpTemplate    |
| :----: | :----:   |
|   Mvp+Rxjava+Retrofit+Dagger+modularization    |   Kotlin+Mvp+Rxjava+Retrofit    |
|   Easy to use, there are one-click generation tools, too much redundant code, not suitable for rapid development   |   Easy to use, suitable for rapid development and novice |  
|   Mature framework    |   VMCPP    |  
|   Java     | Kotlin      |  

```
Why is it compared with MvpArms? This simple framework is only a basic framework, there is no necessity of comparing with other framework, but used for a period of time before MvpArms, also learned a lot from this, but not all the company projects are big projects, could face the demand of the rapid development, all MvpArms some function is not very suitable for the framework of team framework is good

```

### 5.technical essential

The main third-party open source frameworks used are：

 - [RxJava](https://github.com/ReactiveX/RxJava)
 - [RxAndroid](https://github.com/ReactiveX/RxAndroid)
 - [Retrofit](https://github.com/square/retrofit)
 - [Glide](https://github.com/bumptech/glide)
 - [Logger](https://github.com/orhanobut/logger)
 - [SmartRefreshLayout](https://github.com/scwang90/SmartRefreshLayout)


### 6.update

- Add Dagger2 and the redundant code is replaced with tags
- Open one-click generation of the serve-model-presenter tool


### 7.Simple rendering

<div >
    <img src="https://github.com/pengMaster/picApplyGit/blob/master/KotlinMvp/device-2018-09-28-164014.jpg" width="150" height="250"  alt=""/>
    <img src="https://github.com/pengMaster/picApplyGit/blob/master/KotlinMvp/device-2018-09-28-164110.jpg" width="150" height="250"  alt=""/>
    <img src="https://github.com/pengMaster/picApplyGit/blob/master/KotlinMvp/device-2018-09-28-164920.jpg" width="150" height="250" alt=""/>
    <img src="https://github.com/pengMaster/picApplyGit/blob/master/KotlinMvp/device-2018-09-29-100403.jpg" width="150" height="250"  alt=""/>
   <img src="https://github.com/pengMaster/picApplyGit/blob/master/KotlinMvp/device-2018-09-29-144929.jpg" width="150" height="250"  alt=""/>
</div>

The project function is relatively simple, just a simple picture display. Currently, the project encapsulates the following points:
- network request RetrofitManager encapsulation
- network request loading - failure - success MultipleStatusView is a tool that works well
- Base Base class activity - fragment - adapter
- glide encapsulation
- rxjava encapsulation
- various tool classes encapsulation
- shape and gradient graphics encapsulation
- animation encapsulation

### 8.particular thanks

 - [MvpArms](https://github.com/JessYanCoding/MVPArms)
 - [KotlinMvp](https://github.com/git-xuhao/KotlinMvp)

### 9.project address

 - [Your Star and Fork are my eternal quest](https://github.com/pengMaster/Kotlin_Mvp_Template)