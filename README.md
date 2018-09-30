

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