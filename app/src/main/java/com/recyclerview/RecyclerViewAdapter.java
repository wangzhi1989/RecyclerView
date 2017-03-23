package com.recyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2017/3/17.
 * Adapter的作用主要是负责一个item中视图的布局以及信息的展示
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewHolder> implements View.OnClickListener {

    // 在任何ViewHolder被实例化的时候，OnCreateViewHolder将会被触发
    // OnCreateViewHolder创建了一个ViewHolder的实例
    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.line_meizi_item, null);
        RecyclerViewHolder recyclerViewHolder = new RecyclerViewHolder(view);
        view.setOnClickListener(this);
        return recyclerViewHolder;
    }

    // onBindViewHolder方法则负责将数据与ViewHolder绑定
    @Override
    public void onBindViewHolder(RecyclerViewHolder holder, int position) {
        holder.textView.setText("图"+position);

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    @Override
    public void onClick(View view) {

    }
}
