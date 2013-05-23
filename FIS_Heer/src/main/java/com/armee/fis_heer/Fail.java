package com.armee.fis_heer;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;

/**
 * Created by Gion-martin on 23.05.13.
 */
public class Fail extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fail);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
