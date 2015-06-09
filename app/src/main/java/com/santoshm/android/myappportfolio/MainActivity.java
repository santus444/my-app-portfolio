package com.santoshm.android.myappportfolio;

import android.content.Context;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    //Called when any button in activity_main.xml is clicked
    public void launchApplication(View view){
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my ";
        if(view.getId() == R.id.buttonSpotify) {
            text = text + "Media Streamer";
        }else if(view.getId() == R.id.buttonScoresApp){
            text = text + "Scores";
        }else if(view.getId() == R.id.buttonLibraryApp){
            text = text + "Library";
        }else if(view.getId() == R.id.buttonBuildBigger){
            text = text + "Build Bigger";
        }else if(view.getId() == R.id.buttonXyzReader){
            text = text + "XYZ Reader";
        }else if(view.getId() == R.id.buttonCapstone){
            text = text + "Capstone";
        }

        text = text + " app!";
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
