package app.donation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by austin on 12/09/2016.
 */
public class Welcome extends AppCompatActivity{

    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        buttonLogin = (Button) findViewById(R.id.buttonLogin);
        if (buttonLogin != null) {
            Log.v("Welcome", "Login Pressed!");
        }
    }

    public void loginButtonPressed (View view)
    {
        startActivity(new Intent(this,donate.class));
    }
}
