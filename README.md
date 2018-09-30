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

### 2.源码解析

| MvpArms   | Mvp    |  comment  |
| :----: | :----:   | :----: |
|   项目没有过多冗余的依赖    |   id    |   id    |
|   name    |   name    |   name    |
|   pass    |   title    |   content    |
|   avator     | content      |   moment    |
|    moment     | md      |    postid   |
|     -    | uid      |   avator    |
|     -    | moment      |    -   |
|     -   | comments      |    -   |    
|     -   | pv             |   -   |    
|     -   |  avator       |    -   |  


### 2.传送门
https://github.com/MindorksOpenSource/from-java-to-kotlin