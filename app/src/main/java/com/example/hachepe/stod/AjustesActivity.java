package com.example.hachepe.stod;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.support.annotation.Nullable;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;


/**
 * Created by HachePe on 23/04/2018.
 */

public class AjustesActivity extends AppCompatActivity {
    private static final String TAG = "AjustesActivity";

    private Context mContext = AjustesActivity.this;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate: started.");
    }
}
