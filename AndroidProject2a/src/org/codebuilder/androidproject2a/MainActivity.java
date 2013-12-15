package org.codebuilder.androidproject2a;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("2a Tag", "It\'s raining Cats and Doges");	// Log something to LogCat
        Log.v("2a Tag", "This is a really verbose message - it is " +
        		"raining canines and felines today"); // Log something verbose
        Log.d("2a Tag", "Debug Android 2a: in MainActivity class now"); // a debugging log
        Log.wtf("2a Tag", "This is a WTF log entry.... WTF!"); // Log WTF
        		
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
