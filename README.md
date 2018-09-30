<h1 align="center">适合团队的框架才是好的框架</h1>
<p align="center">
  <a href="README_EN.md">
    <b>英文说明</b>
  </a>
</p>

### 1.项目简介
本项目是基于kotlin + Mvp + Rxjava + Retrofit 封装的轻量级模板项目。项目没有过多冗余的依赖，
适用于快速开发以及新手练手。

### 2.目录结构
```
├── .gradle
├── .idea
├── app.main.java.package
│   ├── api                 配置请求地址
│   ├── base                base基类封装
│   ├── glide               图片加载框架
│   ├── net                 网络请求框架配置
│   ├── rx                  rxjava配置
│   ├── mvp
│   │    └── contract       view和presenter实现方法接口
│   │    └── model          数据加载层
│   │    └── presenter      逻辑处理层（数据加载页面显示）
│   ├── ui
│   │    └── activity       activity
│   │    └── adapter        适配器
│   │    └── fragment       fragment
│   ├── utils               工具类
│   ├── view                view控件
│   ├── Constants.kt        全局常量
│   ├── Extensions.kt       扩展函数
│   ├── MyApplication.kt    Application
├── build
├── gradle
├── build.gradle
├── settings.gradle

```

### 3.图解

<div >
<img src="https://github.com/pengMaster/picApplyGit/blob/master/KotlinMvp/Architecture.png"   alt="引自MvpArms"/>
</div>

### 4.技术选型

| MvpArms   | KotlinMvpTemplate    |
| :----: | :----:   |
|   Mvp+Rxjava+Retrofit+Dagger+组件化    |   Kotlin+Mvp+Rxjava+Retrofit    |
|   使用方便，还有一键生成工具，冗余代码过多，不适合快速开发   |   使用方便，适合快速开发以及新手    |  
|   框架成熟    |   可根据需求定制    |  
|   Java     | Kotlin      |  

```
为什么和MvpArms做对比昵？ 这个简单框架只是一个基础框架，其实没有和别的框架做比较的必要性，
但是之前用过一段时间MvpArms，也从中学到了很多东西，但是并不是所有公司项目都是大项目，可能会面临
快速开发的需求，所有MvpArms有些功能并不是很适合。适合团队的框架才是好的框架
```

### 5.技术要点
主要使用的第三方开源框架有：

 - [RxJava](https://github.com/ReactiveX/RxJava)
 - [RxAndroid](https://github.com/ReactiveX/RxAndroid)
 - [Retrofit](https://github.com/square/retrofit)
 - [Glide](https://github.com/bumptech/glide)
 - [Logger](https://github.com/orhanobut/logger)
 - [SmartRefreshLayout](https://github.com/scwang90/SmartRefreshLayout)


### 6.后续更新

- 加入Dagger2，过多冗余代码用标签代替
- 开放一键生成contract - model - presenter 工具

### 7.简单效果图
<div >
    <img src="https://github.com/pengMaster/picApplyGit/blob/master/KotlinMvp/device-2018-09-28-164014.jpg" width="150" height="250"  alt=""/>
    <img src="https://github.com/pengMaster/picApplyGit/blob/master/KotlinMvp/device-2018-09-28-164110.jpg" width="150" height="250"  alt=""/>
    <img src="https://github.com/pengMaster/picApplyGit/blob/master/KotlinMvp/device-2018-09-28-164920.jpg" width="150" height="250" alt=""/>
    <img src="https://github.com/pengMaster/picApplyGit/blob/master/KotlinMvp/device-2018-09-29-100403.jpg" width="150" height="250"  alt=""/>
   <img src="https://github.com/pengMaster/picApplyGit/blob/master/KotlinMvp/device-2018-09-29-144929.jpg" width="150" height="250"  alt=""/>
</div>

项目功能较为简单，只是一个简单的图片展示，目前项目封装了以下点位：
- 网络请求RetrofitManager封装
- 网络请求 加载 - 失败 - 成功 MultipleStatusView是一个和好用的工具
- Base基类 activity - fragment - adapter
- glide封装
- rxjava封装
- 各种工具类封装
- shape以及gradient各种图形封装
- 动画封装


### 8.特别感谢

 - [MvpArms](https://github.com/JessYanCoding/MVPArms)
 - [KotlinMvp](https://github.com/git-xuhao/KotlinMvp)

### 9.项目地址

 - [你的Star和Fork是我永生的追求](https://github.com/pengMaster/Kotlin_Mvp_Template)