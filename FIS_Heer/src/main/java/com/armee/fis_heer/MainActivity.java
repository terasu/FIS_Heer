package com.armee.fis_heer;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.view.Menu;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void seitese235anleitungmain(View view){
        startActivity(new Intent("com.armee.fis_heer.Se235anleitungmain"));
    }

    public void seitefisheer(View view){
        startActivity(new Intent("com.armee.fis_heer.Fisheeranleitung"));

    }
    public void seitefehlerbehebfisheer(View view){
        startActivity(new Intent("com.armee.fis_heer.Fehlerbehebungfisheer"));

    }
    public void seitefehlerbehebse235(View view){
        startActivity(new Intent("com.armee.fis_heer.Fehlerbehebungse235"));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
