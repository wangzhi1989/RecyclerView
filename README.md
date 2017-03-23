# 1.学习RecyclerView,AsyncTask,okhttp,picasso,design

```java
public class RecyclerViewHolder extends RecyclerView.ViewHolder {}
```
viewHolder通过保存item中使用到的控件的引用来减少findViewById的调用，以此使RecyclerView滑动得更加顺畅

```java
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {}
```
Adapter的作用主要是负责一个item中视图的布局以及信息的展示

```java
public class GetData extends AsyncTask<String, Integer, String> {}
```
AsyncTask,是android提供的轻量级的异步类,可以直接继承AsyncTask,在类中实现异步操作,并提供接口反馈当前异步执行的程度(可以通过接口实现UI进度更新),最后反馈执行的结果给UI主线程.


## AndroidStudio配置gradle： 
### RecyclerView
> compile 'com.android.support:recyclerview-v7:25.1.0'
### okhttp
> compile 'com.squareup.okhttp3:okhttp:3.6.0'
### picasso
> compile 'com.squareup.picasso:picasso:2.5.2'
### design
> compile 'com.android.support:design:25.1.0'


