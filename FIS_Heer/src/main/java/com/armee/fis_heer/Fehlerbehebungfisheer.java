package com.armee.fis_heer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

/**
 * Created by Gion-martin on 20.05.13.
 */
public class Fehlerbehebungfisheer extends Activity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fehlebehebungfisheer);
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

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch(item.getItemId()) {
            case R.id.action_settings:
                startActivity(new Intent("com.armee.fis_heer.About"));
                break;
        }
        switch(item.getItemId()) {
            case R.id.Hinweis_menu:
                startActivity(new Intent("com.armee.fis_heer.Test"));
                break;
        }
        return false;
    }
}