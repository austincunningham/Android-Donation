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

    private Button loginButton;
    private Button registerButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        loginButton = (Button) findViewById(R.id.loginButton);
        registerButton = (Button) findViewById(R.id.registerButton);

        /*if (loginButton != null) {
            Log.v("Welcome", "Login Pressed!");
        }
        if (registerButton != null) {
            Log.v("Signup", "Signup Pressed!");
        }
*/

    }

    public void loginButtonPressed (View view) {
        startActivity(new Intent(this,Login.class));
    }

    public void signupButtonPressed (View view){
       startActivity(new Intent(this,Signup.class));
    }
}
