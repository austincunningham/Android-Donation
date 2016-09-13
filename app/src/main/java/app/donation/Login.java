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
        startActivity(new Intent(this,donate.class));
    }
}
