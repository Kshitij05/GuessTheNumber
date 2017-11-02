package com.kshitij.higherorlower;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    int randomNumber; //declaring this variable for the whole code

    public void clickFunction(View view)
    {
       EditText guessText = (EditText) findViewById(R.id.guessText);

        int guessInt =  Integer.parseInt(guessText.getText().toString()); /* converting the string that the user will
                                                                             be entering into int */

        // guessText is the guessed number in string form
        // guessInt is the guessed number in integer form

        if(guessInt < randomNumber)
        {
            Toast.makeText(this, "Higher!", Toast.LENGTH_SHORT).show();
        }
        else if(guessInt > randomNumber)
        {
            Toast.makeText(this, "Lower!", Toast.LENGTH_SHORT).show();
        }
        else if(guessInt == randomNumber) //just else can also be used here
        {
            Toast.makeText(this, "That is correct! Try again.", Toast.LENGTH_SHORT).show();

            Random rand = new Random();

            // again generating a random number

            randomNumber = rand.nextInt(20) + 1; // between 20 and 1


        }

    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Random rand = new Random(); /* this will be generating a random number when the app is
                                            launched because it is in the on create section */

        randomNumber = rand.nextInt(20) + 1; /* this means that the number is between 1 and 20
                                                20 specified in the parameter, and 1 specified as +1
                                                */
    }
}
