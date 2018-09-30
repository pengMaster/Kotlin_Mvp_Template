### 1.项目简介
适合团队的框架才是好的框架。
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

### 3.技术选型

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

### 4.图解

    <img src="https://github.com/pengMaster/picApplyGit/blob/master/KotlinMvp/Architecture.png"   alt="引自MvpArms"/>


### 5.简单效果图
<div >
    <img src="https://github.com/pengMaster/picApplyGit/blob/master/KotlinMvp/device-2018-09-28-164014.jpg" width="150" height="250"  alt=""/>
    <img src="https://github.com/pengMaster/picApplyGit/blob/master/KotlinMvp/device-2018-09-28-164030.jpg" width="150" height="250"  alt=""/>
    <img src="https://github.com/pengMaster/picApplyGit/blob/master/KotlinMvp/device-2018-09-28-164110.jpg" width="150" height="250"  alt=""/>
    <img src="https://github.com/pengMaster/picApplyGit/blob/master/KotlinMvp/device-2018-09-28-164920.jpg" width="150" height="250" alt=""/>
    <img src="https://github.com/pengMaster/picApplyGit/blob/master/KotlinMvp/device-2018-09-29-100403.jpg" width="150" height="250"  alt=""/>
   <img src="https://github.com/pengMaster/picApplyGit/blob/master/KotlinMvp/device-2018-09-29-144929.jpg" width="150" height="250"  alt=""/>
</div>
### 2.传送门
https://github.com/MindorksOpenSource/from-java-to-kotlin