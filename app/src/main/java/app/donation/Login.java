package app.donation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import static android.widget.Toast.*;

/**
 * Created by austin on 13/09/2016.
 */
public class Login extends AppCompatActivity {
    private Button loginViewButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        loginViewButton = (Button) findViewById(R.id.loginViewButton);
        if (loginViewButton != null) {
            Log.v("Login", "Login Pressed!");
        }
    }

    public void loginViewButtonPressed (View view)
    {
        DonationApp app = (DonationApp)getApplication();

        TextView email = (TextView) findViewById(R.id.emailLogin);
        TextView password = (TextView) findViewById(R.id.passwordLogin);

        if (app.validUser(email.getText().toString(),password.getText().toString())){
            startActivity(new Intent(this,donate.class));
        } else {
            Toast toast = Toast.makeText(this, "Invalid User name or Password", Toast.LENGTH_SHORT);
                    toast.show();
        }
    }
}
