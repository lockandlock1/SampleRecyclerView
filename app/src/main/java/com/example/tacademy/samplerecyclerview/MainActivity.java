package com.example.tacademy.samplerecyclerview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    MyAdapter mAdapter;
    RecyclerView.LayoutManager layoutManager;
    int[] IDS = {R.drawable.sample_thumb_0,R.drawable.sample_thumb_1,
            R.drawable.sample_thumb_2,R.drawable.sample_thumb_3,
            R.drawable.sample_thumb_4,R.drawable.sample_thumb_5,
            R.drawable.sample_thumb_6,R.drawable.sample_thumb_7};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = (RecyclerView)findViewById(R.id.recycler);
        mAdapter = new MyAdapter();
        recyclerView.setAdapter(mAdapter);

        layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(layoutManager);
        initData();
    }

    private void initData(){
        Random r = new Random();
                 for (int i = 0; i < 100; i++) {
                         MyData data = new MyData();
                         data.icon = getResources().getDrawable(IDS[i%IDS.length]);
                         data.title = "item " + i;
                         data.fontSize = 20 + r.nextInt(40);
                         mAdapter.add(data);
                     }

    }
}
