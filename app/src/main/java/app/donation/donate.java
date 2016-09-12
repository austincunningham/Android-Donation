package app.donation;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.util.Log;
import android.view.View;
import android.widget.RadioGroup;
import android.widget.NumberPicker;
import android.widget.ProgressBar;
import android.widget.Toast;


public class donate extends AppCompatActivity {

    private Button donateButton;
    private RadioGroup paymentMethod;
    private ProgressBar progressBar;
    private NumberPicker amountPicker;
    private int totalDonated;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_donate);

        donateButton = (Button) findViewById(R.id.donateButton);
        paymentMethod = (RadioGroup) findViewById(R.id.paymentMethod);
        progressBar = (ProgressBar) findViewById(R.id.progressBar);
        amountPicker = (NumberPicker) findViewById(R.id.amountPicker);

        amountPicker.setMinValue(0);
        amountPicker.setMaxValue(1000);
        progressBar.setMax(10000);

        if(donateButton != null){
            Log.v("Donate","Really got the donate button");
        }
    }
    public void donateButtonPressed (View view)
    {
        int amount = amountPicker.getValue();
        int radioId = paymentMethod.getCheckedRadioButtonId();
        //progress bar
        totalDonated = totalDonated + amount;
        progressBar.setProgress(totalDonated);
        //radio button
        //the following can be replaced by the ternary operator
        //String method = radioId == R.id.PayPal ? "PayPal" : "Direct";
        String method = "";
        if(radioId == R.id.PayPal){
            method = "PayPal";
        }else {
            method = "Direct";
        }
        Log.v("Donate", "Donate Pressed! with ammount : " +amount+ " Method : "+method+ "\nTotal Donated : " +totalDonated);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        //Inflate the menu, this adds items to the action bar if it is present
        getMenuInflater().inflate(R.menu.menu_donate,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.menuReport:
                //Toast.makeText(this, "Report Selected", Toast.LENGTH_SHORT).show();
                startActivity(new Intent(this,Report.class));
                break;
        }
        return true;
    }

}
