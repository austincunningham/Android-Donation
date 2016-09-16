package app.donation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

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
        TextView firstName = (TextView) findViewById(R.id.firstName);
        TextView secondName= (TextView) findViewById(R.id.secondName);
        TextView email = (TextView) findViewById(R.id.email);
        TextView password = (TextView) findViewById(R.id.password);

        User user = new User(firstName.getText().toString(), secondName.getText().toString(),
                email.getText().toString(),password.getText().toString());

        DonationApp app =  (DonationApp) getApplication();
        app.newUser(user);

        startActivity(new Intent(this,Welcome.class));
    }
}
