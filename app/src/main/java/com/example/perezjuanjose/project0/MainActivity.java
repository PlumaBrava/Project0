/*

This is the first project PROJECT 0 of the Nanodegree corse
        Developer :Juan Jose Perez
        Date 23 Julio 2015
*/


package com.example.perezjuanjose.project0;


import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

//Use AppCompactAvtivity becouse  ActionBarActivity is deprecated
public class MainActivity extends AppCompatActivity {
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
         context = getApplicationContext();

        // for Button 1, we create an anonymous class and set the OnClickListener here.
        // All code for the button is right here

        Button btn1 = (Button) findViewById(R.id.button1);
        btn1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(context, "This button will launch PFootball Scores App", Toast.LENGTH_SHORT).show();;
            }
        });

        // for Button 2, we create an anonymous class and set the OnClickListener here.
        // All code for the button is right here

        Button btn2 = (Button) findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(context, "This button will launch library App", Toast.LENGTH_SHORT).show();;
            }
        });

        // for Button 3, we create an anonymous class and set the OnClickListener here.
        // All code for the button is right here

        Button btn3 = (Button) findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(context, "This button will launch Build It Bigger", Toast.LENGTH_SHORT).show();;
            }
        });


        // for Button 3, we create an anonymous class and set the OnClickListener here.
        // All code for the button is right here

        Button btn4 = (Button) findViewById(R.id.button4);
        btn4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(context, "This button will launch XYZ Reader", Toast.LENGTH_SHORT).show();;
            }
        });

        // for Button 5, we create an anonymous class and set the OnClickListener here.
        // All code for the button is right here

        Button btn5 = (Button) findViewById(R.id.button5);
        btn5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Toast.makeText(context, "This button will launch My Own App!", Toast.LENGTH_SHORT).show();;
            }
        });
    }

    /**
     * Called when Button 0 is click. Link created in XML layout using onClick attribute
     * @param view - link to the view
     */
    public void button0lick(View view) {
        // Do something in response to button click
        Toast.makeText(context, "This button will launch Popular Movies", Toast.LENGTH_SHORT).show();;
    }

    /**Other way is set a listener for each button and decode it using R.Id.buttoId
     * implements View.OnClickListene
     * after that all onClic and do somthing
     * i think is not clear and dificult to mantein
     */
    public void onClick(View view) {
        // Do something in response to button click
       // status.setText("Status: Button 3 Clicked");
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
