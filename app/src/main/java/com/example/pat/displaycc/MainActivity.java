package com.example.pat.displaycc;

import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        StrictMode.ThreadPolicy policy = new StrictMode.ThreadPolicy.Builder().permitAll().build();
        StrictMode.setThreadPolicy(policy);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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

    public void displayCreditCards(View view) throws IOException {
        TextView tv1;

        tv1 = (TextView) findViewById(R.id.text_main);
        tv1.setText("Data will appear here");

        //create objects to det data and make profiles
        CreditCard ccObj = new CreditCard();

        while(ccObj.getccInfo().hasNext())

        tv1.setText(ccObj.getccInfo());


        /*
        CreditCard ccObj1 = new CreditCard();
        ccObj1.ccInfo();
        CreditCard ccObj2 = new CreditCard();
        ccObj2.ccInfo();
        CreditCard ccObj3 = new CreditCard();
        ccObj3.ccInfo(); */
    }
}
