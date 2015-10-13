package com.example.pat.displaycc;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

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
        String[] data = new String[18];
        int i = 0;
        //make objects
        ccProfile ccObj1 = new ccProfile();
        ccProfile ccObj2 = new ccProfile();
        ccProfile ccObj3 = new ccProfile();



        tv1 = (TextView) findViewById(R.id.text_main);
        tv1.setText("Data will appear here");

        //create objects to det data and make profiles
        try {
            URL urlDat = new URL("https://web.njit.edu/~halper/it114/l2d.txt");
            Scanner urlScn = new Scanner(urlDat.openStream());
            while (urlScn.hasNext()){
                data[].add(urlScn.nextLine() + "\n");
            }
            urlScn.close();


        }catch (MalformedURLException URLe){
            //I dont know, toast or something. do it

        }
        catch (IOException IOe){
            //same thing
        }


        tv1.setText();


    }
}
