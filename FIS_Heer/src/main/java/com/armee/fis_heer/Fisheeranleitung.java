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
public class Fisheeranleitung extends Activity  {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.anleitung_fisheer);
    }

        public void seitese235anleitungmain(View view){
            startActivity(new Intent("com.armee.fis_heer.Se235anleitungmain"));
        }
    public void fail(View view){
        startActivity(new Intent("com.armee.fis_heer.Fail"));

    }
    public void datenfunkgo(View view){
        startActivity(new Intent("com.armee.fis_heer.Datenfunk"));

    }
    public void monitor(View view){
        startActivity(new Intent("com.armee.fis_heer.Monitorkalib"));

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
                startActivity(new Intent("com.armee.fis_heer.Hinweise_Senden"));
                break;
        }
        return false;
    }
}
