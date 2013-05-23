package com.armee.fis_heer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

/**
 * Created by Gion-martin on 20.05.13.
 */
public class Fehlerbehebungse235 extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fehelebehebungse235);
    }
    public void fail(View view){
        startActivity(new Intent("com.armee.fis_heer.Fail"));

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
}
