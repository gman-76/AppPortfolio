package com.projects.gerhardschoeman.appportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toast mToast;

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

        return super.onOptionsItemSelected(item);
    }

    public void onButtonsClick(View view){
        int id = view.getId();
        String strToast="";
        switch(id) {
            case R.id.btSpotStreamer: strToast = "Launch Spotify Streamer app"; break;
            case R.id.btScores: strToast = "Launch Scores app"; break;
            case R.id.btLibrary: strToast = "Launch Library app"; break;
            case R.id.btBuildBigger: strToast = "Launch Build it Bigger app"; break;
            case R.id.btXYZReader: strToast = "Launch XYZ Reader app"; break;
            case R.id.btCapstone: strToast = "Launch Capstone Project app"; break;
        }
        if(mToast!=null) mToast.cancel();
        mToast = Toast.makeText(this,strToast,Toast.LENGTH_SHORT);
        mToast.show();
    }
}
