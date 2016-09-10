package com.example.donation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.util.Log;
import android.view.View;

public class donate extends AppCompatActivity {

    private Button donateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        donateButton = (Button) findViewById(R.id.donateButton);
        if(donateButton != null){
            Log.v("Donate","Really got the donate button");
        }
    }
    public void donateButtonPressed (View view)
    {
        Log.v("Donate", "Donate Pressed!");
    }
    /*@Override
    public boolean onCreateOptionMenu(Menu menu) {
        //Inflate the menu, this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.menu_donate,menu);
        return true;
    }*/
    /*@Override
    public boolean onOptionsItemSelected(MenuItem item) {
        //Handle action bar item clicks here. The action bar will
        //automatically handle clicks on the Home/Up button so long
        //as you specify a parent activity in AndroidManifest.xml
        int id = item.getItemId();

        //noinspections SimplifiableIfStatement
        if(id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }*/

}
