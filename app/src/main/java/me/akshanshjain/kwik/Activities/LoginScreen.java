package me.akshanshjain.kwik.Activities;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import me.akshanshjain.kwik.R;

public class LoginScreen extends AppCompatActivity {

    private Typeface QLight;
    private TextView appGreeting, appDescription, directingToSignIn, signUp;
    private EditText phone;
    private Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        /*
        Setting up the activity for fullscreen mode.
        */
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_login_screen);

        //Initializing the typeface.
        QLight = Typeface.createFromAsset(getAssets(), "fonts/Quicksand-Light.ttf");

        //Referencing the views from XML layout.
        appGreeting = findViewById(R.id.greeting_login);
        appDescription = findViewById(R.id.app_description_login);
        directingToSignIn = findViewById(R.id.sign_in_direction_login);
        signUp = findViewById(R.id.sign_up_text_login);

        appGreeting.setTypeface(QLight, Typeface.BOLD);
        appDescription.setTypeface(QLight);
        directingToSignIn.setTypeface(QLight);
        signUp.setTypeface(QLight, Typeface.BOLD);

        phone = findViewById(R.id.user_phone_number_login);
        phone.setTypeface(QLight);

        loginButton = findViewById(R.id.button_login);
        loginButton.setTypeface(QLight, Typeface.BOLD);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), MainActivity.class));
            }
        });
    }
}