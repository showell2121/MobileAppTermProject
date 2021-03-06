package edu.uco.showell.mobileapptermproject;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    // Declare Varibles
    EditText usernameInput, passwordInput;
    Button registerButton, signinButton;

    //Strings
    String inputUsername, inputPassword = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        //Initalize variables EditText
        usernameInput = (EditText) findViewById(R.id.EditTextUsername);
        passwordInput = (EditText) findViewById(R.id.EditTextPassword);
        //Initalize variables Buttons
        registerButton = (Button) findViewById(R.id.ButtonRegister);
        signinButton = (Button) findViewById(R.id.ButtonLogin);


        signinButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //sets varables that were entered in
                inputUsername = usernameInput.getText().toString();
                inputPassword = passwordInput.getText().toString();

               // System.out.println(" input :" +inputUsername + ":");

                //checks if password and username are not empty
                if(!inputPassword.matches("") && !inputUsername.matches("") ){

                    if(inputPassword.length() < 6){
                        Toast.makeText(MainActivity.this, "Invalid Password Length", Toast.LENGTH_SHORT).show();
                    }else{
                        Intent intent = new Intent(MainActivity.this, LoginSuccessActivity.class);
                        startActivityForResult(intent,1);

                    }


                    // array or database for username and password to make usre it is correct

                    if(true){

                    }

                }
                else {
                    Toast.makeText(MainActivity.this, "Invalid Username or Password", Toast.LENGTH_SHORT).show();
                }
            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, RegisterUserActivity.class);
                startActivityForResult(intent,2);

            }
        });

    }
}
