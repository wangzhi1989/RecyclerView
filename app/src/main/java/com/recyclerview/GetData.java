package com.recyclerview;

import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;

/**
 * Created by Administrator on 2017/3/17.
 * 生成该类的对象，并调用execute方法之后
 * 首先执行的是onProExecute方法
 * 其次执行doInBackgroup方法
 */

public class GetData extends AsyncTask<String, Integer, String> {

    /**
     * 该方法运行在UI线程当中,并且运行在UI线程当中 可以对UI空间进行设置
     * 该方法将在执行实际的后台操作前被UI thread调用。可以在该方法中做一些准备工作，如在界面上显示一个进度条。
     */
    @Override
    protected void onPreExecute() {
        super.onPreExecute();
    }

    /**
     * 这里的String参数对应AsyncTask中的第一个参数
     * 这里的String返回值对应AsyncTask的第三个参数
     * 该方法并不运行在UI线程当中，主要用于异步操作，所有在该方法中不能对UI当中的空间进行设置和修改
     * 但是可以调用publishProgress方法触发onProgressUpdate对UI进行操作
     * 将在onPreExecute 方法执行后马上执行，该方法运行在后台线程中。
     * 这里将主要负责执行那些很耗时的后台计算工作。
     * 可以调用 publishProgress方法来更新实时的任务进度。该方法是抽象方法，子类必须实现。
     */
    @Override
    protected String doInBackground(String... strings) {
        return MyOkhttp.get(strings[0]);
    }

    /**
     * 这里的String参数对应AsyncTask中的第三个参数（也就是接收doInBackground的返回值）
     * 在doInBackground方法执行结束之后在运行，并且运行在UI线程当中 可以对UI空间进行设置
     * 该方法将在执行实际的后台操作前被UI thread调用。可以在该方法中做一些准备工作，如在界面上显示一个进度条。
     */
    @Override
    protected void onPostExecute(String s) {
        super.onPostExecute(s);
        if (!TextUtils.isEmpty(s)) {
            Log.d("Tag","test");
        }
    }



    /**
     * 这里的Intege参数对应AsyncTask中的第二个参数
     * 在doInBackground方法当中，，每次调用publishProgress方法都会触发onProgressUpdate执行
     * onProgressUpdate是在UI线程中执行，所有可以对UI空间进行操作
     */
    @Override
    protected void onProgressUpdate(Integer... values) {
        super.onProgressUpdate(values);
    }
}
