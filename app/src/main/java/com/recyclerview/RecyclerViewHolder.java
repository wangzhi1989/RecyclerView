package com.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Administrator on 2017/3/17.
 * ViewHolder通过保存item中使用到的控件的引用来减少findViewById的调用，以此使RecyclerView滑动得更加顺畅
 */

public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    public ImageView imageView;
    public TextView textView;

    public RecyclerViewHolder(View itemView) {
        super(itemView);
        imageView = (ImageView) itemView.findViewById(R.id.imageView);
        textView = (TextView) itemView.findViewById(R.id.textView);
    }
}
