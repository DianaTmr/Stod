package com.example.hachepe.stod;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


/**
 * Created by HachePe on 23/04/2018.
 */

public class ChatActivity extends AppCompatActivity {
    private static final String TAG = "ChatActivity";


    private Context mContext = ChatActivity.this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");

    }

}

