package com.recyclerview;

import android.os.Bundle;
import android.support.design.widget.CoordinatorLayout;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.TypedValue;

/**
 * Created by Administrator on 2017/3/17.
 */

public class LineActivity extends AppCompatActivity {
    private static RecyclerView recyclerView;
    private CoordinatorLayout coordinatorLayout;
    private LinearLayoutManager layoutManager;
    private SwipeRefreshLayout swipeRefreshLayout;
    private RecyclerViewAdapter viewAdapter;
    private int page = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line);

        initView();
//        setListener();

        new GetData().execute("http://gank.io/api/data/福利/10/1");
    }

    private void initView() {
        // 获取RecyclerView的引用
        coordinatorLayout = (CoordinatorLayout) findViewById(R.id.coordinatorLayout);

        // 获取RecyclerView的引用
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        // 创建一个LayoutManager并添加
        layoutManager = new LinearLayoutManager(this);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        layoutManager.scrollToPosition(0);
        recyclerView.setLayoutManager(layoutManager);

        // 获取SwipeRefreshLayout
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swipeRefreshLayout);
        // 设置刷新时动画的颜色，效果
        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary,
                R.color.colorPrimaryDark,
                R.color.colorAccent);
        swipeRefreshLayout.setProgressViewOffset(
                false, 0, (int) TypedValue.applyDimension(
                        TypedValue.COMPLEX_UNIT_DIP, 24, getResources().getDisplayMetrics()));
    }

    private void setListener() {
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                page = 1;
                new GetData().execute("http://gank.io/api/data/福利/10/1");
            }
        });
    }

}
