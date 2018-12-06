package com.example.lewis.food;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.media.session.PlaybackState;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.EventLogTags;
import android.util.Log;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedList;

public class MainActivity extends AppCompatActivity {

    private final LinkedList<String> mWordList = new LinkedList<>();
    private final LinkedList<String> mDescription = new LinkedList<>();

    private final ArrayList<String> imgURL = new ArrayList<>();
    private final ArrayList<String> images = new ArrayList<>();

    private int mCount = 0;
    private RecyclerView mRecyclerView;
    private WordListAdapter mAdapter;
    private TextView Description;

    private String[] defaultitems = {"Beer Cheese Burger", "Lasagna", "Mac'n Cheese", "Jamaican Christmas Cake", "Irish Car Bomb", "Spiced Chai", "Long Island Iced Tea"};
    String selectedfood = "null";
    BroadcastReceiver receiver;

    IntentFilter filter1 = new IntentFilter();
    //filter1.addAction("Intent.I_AM_HOME");

    @Override
    public Intent registerReceiver(BroadcastReceiver receiver, IntentFilter filter) {
        return super.registerReceiver(receiver, filter);
    }
    // public Integer[] defaultpics = { R.drawable.bcb,R.drawable.las, R.drawable.macncheese,R.drawable.jcc,R.drawable.icb,R.drawable.chai,R.drawable.liit };

private void getimagebitmaps(){
    imgURL.add("https://bit.ly/2DtN2Xs");
    imgURL.add("https://bit.ly/2AUjKis");
    imgURL.add("https://bit.ly/2JOmm3X");
    imgURL.add("https://bit.ly/1FwyTi1");
    imgURL.add("https://bit.ly/2SQTV9T");
    imgURL.add("https://bit.ly/2RDO5aq");
    imgURL.add("https://bit.ly/2SSgxGS");

}
    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        receiver = new BroadcastReceiver() {
            @Override
            public void onReceive(Context context, Intent intent) {
                Toast.makeText(context,"Happy Cooking "+selectedfood,Toast.LENGTH_SHORT).show();
                openActivity3();
            }
        };

        filter1 = new IntentFilter();
        filter1.addAction("I_AM_HOME");
        registerReceiver(receiver,filter1);

        getimagebitmaps();

        for(int i = 0;i < defaultitems.length;i++){
            mWordList.addLast(defaultitems[i]);

        }

        mRecyclerView = findViewById(R.id.recyclerview);
        mAdapter = new WordListAdapter(this, mWordList,imgURL,mDescription);
        mRecyclerView.setAdapter(mAdapter);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wordListSize = mWordList.size();
                // Add a new word to the end of the wordList.
                mWordList.addLast("+ Word " + wordListSize);
                // Notify the adapter, that the data has changed so it can
                // update the RecyclerView to display the data.
                mRecyclerView.getAdapter().notifyItemInserted(wordListSize);
                // Scroll to the bottom.
                mRecyclerView.smoothScrollToPosition(wordListSize);
            }
        });
    }

    public void openActivity3(){
        Intent intent2 = new Intent(this,activity3.class);
        startActivity(intent2);
    }

}
