package com.example.hachepe.stod.Utils;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.util.Log;
import android.view.MenuItem;

import com.example.hachepe.stod.AjustesActivity;
import com.example.hachepe.stod.ChatActivity;
import com.example.hachepe.stod.HomeActivity;
import com.example.hachepe.stod.PerfilActivity;
import com.example.hachepe.stod.R;
import com.example.hachepe.stod.SintomasActivity;
import com.ittianyu.bottomnavigationviewex.BottomNavigationViewEx;

/**
 * Created by HachePe on 23/04/2018.
 */

public class BottomNavigationViewHelper {
    private static final String TAG = "BottomNavigationViewHel";

    public static void setupBottomNavigationView(BottomNavigationViewEx bottomNavigationViewEx){
        Log.d(TAG, "setupBottomNavigationView: Setting up BottomNavigationView");
        bottomNavigationViewEx.enableAnimation(false);
        bottomNavigationViewEx.enableItemShiftingMode(false);
        bottomNavigationViewEx.enableShiftingMode(false);
        bottomNavigationViewEx.setTextVisibility(false);
    }

    public static void enableNavigation(final Context context, BottomNavigationViewEx view){
        view.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){

                    case R.id.ic_home:
                        Intent intent1 = new Intent(context, HomeActivity.class);//ACTIVITY_NUM = 0
                        context.startActivity(intent1);
                        break;

                    case R.id.ic_assign:
                        Intent intent2  = new Intent(context, SintomasActivity.class);//ACTIVITY_NUM = 1
                        context.startActivity(intent2);
                        break;

                    case R.id.ic_profile:
                        Intent intent3 = new Intent(context, PerfilActivity.class);//ACTIVITY_NUM = 2
                        context.startActivity(intent3);
                        break;

                    case R.id.ic_chat:
                        Intent intent4 = new Intent(context, ChatActivity.class);//ACTIVITY_NUM = 3
                        context.startActivity(intent4);
                        break;

                    case R.id.ic_settings:
                        Intent intent5 = new Intent(context, AjustesActivity.class);//ACTIVITY_NUM = 4
                        context.startActivity(intent5);
                        break;
                }


                return false;
            }
        });
    }
}
