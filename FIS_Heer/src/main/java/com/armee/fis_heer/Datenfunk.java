package com.armee.fis_heer;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

/**
 * Created by Gion-martin on 03.06.13.
 */
public class Datenfunk extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.datenfunk);


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
