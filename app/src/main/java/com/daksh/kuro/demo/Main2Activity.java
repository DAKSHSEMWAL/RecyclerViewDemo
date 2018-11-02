package com.daksh.kuro.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import android.support.v7.widget.LinearLayoutManager;

import android.support.v4.content.ContextCompat;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;


import android.widget.Toast;
import android.os.Handler;
import android.support.v7.widget.Toolbar;


public class Main2Activity extends AppCompatActivity {

    private RecyclerView recyclerView;

    // @BindView(R.id.recycler_view)
    // RecyclerView recyclerView;

    //@BindView(R.id.toolbar)
    //Toolbar toolbar;
    private Toolbar toolbar;

    private RecyclerViewAdapter mAdapter;

    private ArrayList<AbstractModel> modelList = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // ButterKnife.bind(this);
        findViews();
        initToolbar("Takeoff Android");
        setAdapter();


    }

    private void findViews() {
        toolbar = (Toolbar) findViewById(R.id.toolbar);
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
    }

    public void initToolbar(String title) {
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setTitle(title);
    }


    private void setAdapter() {


        modelList.add(new AbstractModel("Golden Package", "KD 20",R.mipmap.icon_goldenpackage,"Lorem ipsum dolor sit amet, consectetur adipiscing elit,"));
        modelList.add(new AbstractModel("Silver Package", "KD 10",R.mipmap.icon_silvermedal,"Lorem ipsum dolor sit amet, consectetur adipiscing elit,"));
        modelList.add(new AbstractModel("Basic Package", "FREE",R.mipmap.icon_freepackage,"Lorem ipsum dolor sit amet, consectetur adipiscing elit,"));



        mAdapter = new RecyclerViewAdapter(Main2Activity.this, modelList, "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua.");


        recyclerView.setHasFixedSize(true);

        // use a linear layout manager

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        recyclerView.setLayoutManager(layoutManager);


        recyclerView.setAdapter(mAdapter);


        mAdapter.SetOnItemClickListener(new ItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {

                //handle item click events here
                Toast.makeText(Main2Activity.this, "Hey " , Toast.LENGTH_SHORT).show();


            }
        });




    }


}
