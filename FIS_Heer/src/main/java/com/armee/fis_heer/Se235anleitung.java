package com.armee.fis_heer;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * Created by Gion-martin on 19.05.13.
 */
public class Se235anleitung extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anleitung_se235);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}