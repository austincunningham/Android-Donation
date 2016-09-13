package app.donation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by austin on 13/09/2016.
 */
public class Signup extends AppCompatActivity {
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);

        registerButton = (Button) findViewById(R.id.registerButton);
        if (registerButton != null) {
            Log.v("Signup", "Register Pressed!");
        }
    }

    public void registerButtonPressed (View view)
    {
        startActivity(new Intent(this,donate.class));
    }
}
