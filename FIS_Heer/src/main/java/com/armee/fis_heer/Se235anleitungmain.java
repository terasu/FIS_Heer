package com.armee.fis_heer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

/**
 * Created by Gion-martin on 23.05.13.
 */
public class Se235anleitungmain extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anleitung_se235_main);
    }
    public void seitese235anleitung(View view){
        startActivity(new Intent("com.armee.fis_heer.Se235anleitung"));

    }
    public void se235sync(View view){
        startActivity(new Intent("com.armee.fis_heer.Se235sync"));

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    }
