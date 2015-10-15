package com.example.pat.displaycc;

import android.os.Bundle;
import android.os.StrictMode;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DecimalFormat;
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
        tv1 = (TextView) findViewById(R.id.text_main); //set textview to variable
        EditText et1;
        et1 = (EditText) findViewById(R.id.edit_file); //set edittext to variable
        String[] data = new String[18];
        String sD;
        int i = 0;
        double avgBal;
        double avgLim;
        //make objects
        ccProfile ccObj1 = new ccProfile();
        ccProfile ccObj2 = new ccProfile();
        ccProfile ccObj3 = new ccProfile();
        double xd;
        String inUrl;

        inUrl = et1.getText().toString();


        tv1.setText("Data will appear here");

        //create objects to det data and make profiles
        try {
            URL urlDat = new URL(inUrl);
            Scanner urlScn = new Scanner(urlDat.openStream());
            while (urlScn.hasNext()){
                data[i] = (urlScn.nextLine() + "\n");
                i++;
            }
            urlScn.close();


        }catch (IOException Exc){
            //I dont know, toast or something. do it
            tv1.setText("IO Exception: check file address or URL");

        }

        for(int z = 0; z < data.length; ){
            switch (z){
                case 0:
                    ccObj1.setIssuer(data[z]);
                    z++;
                    break;
                case 1:
                    ccObj1.setName(data[z]);
                    z++;
                    break;
                case 2:
                    ccObj1.setCardnum(data[z]);
                    z++;
                    break;
                case 3:
                    ccObj1.setExpire(data[z]);
                    z++;
                    break;
                case 4:
                    xd = Double.parseDouble(data[z]);
                    ccObj1.setBal(xd);
                    z++;
                    break;
                case 5:
                    xd = Double.parseDouble(data[z]);
                    ccObj1.setLimit(xd);
                    z++;
                    break;
                //start second object
                case 6:
                    ccObj2.setIssuer(data[z]);
                    z++;
                    break;
                case 7:
                    ccObj2.setName(data[z]);
                    z++;
                    break;
                case 8:
                    ccObj2.setCardnum(data[z]);
                    z++;
                    break;
                case 9:
                    ccObj2.setExpire(data[z]);
                    z++;
                    break;
                case 10:
                    xd = Double.parseDouble(data[z]);
                    ccObj2.setBal(xd);
                    z++;
                    break;
                case 11:
                    xd = Double.parseDouble(data[z]);
                    ccObj2.setLimit(xd);
                    z++;
                    break;

                //start 3rd object
                case 12:
                    ccObj3.setIssuer(data[z]);
                    z++;
                    break;
                case 13:
                    ccObj3.setName(data[z]);
                    z++;
                    break;
                case 14:
                    ccObj3.setCardnum(data[z]);
                    z++;
                    break;
                case 15:
                    ccObj3.setExpire(data[z]);
                    z++;
                    break;
                case 16:
                    xd = Double.parseDouble(data[z]);
                    ccObj3.setBal(xd);
                    z++;
                    break;
                case 17:
                    xd = Double.parseDouble(data[z]);
                    ccObj3.setLimit(xd);
                    z++;
                    break;

            }
        }
        //print out all data for first object
        tv1.append(ccObj1.getIssuer() + "\n");
        tv1.append(ccObj1.getName()+"\n");
        tv1.append(ccObj1.getCardnum()+"\n");
        tv1.append(ccObj1.getExpire()+"\n");
        sD = Double.toString(ccObj1.getBal());
        tv1.append(sD+"\n");
        sD = Double.toString(ccObj1.getLimit());
        tv1.append(sD+"\n");

        //print out all data for 2nd object
        tv1.append(ccObj2.getIssuer() + "\n");
        tv1.append(ccObj2.getName() + "\n");
        tv1.append(ccObj2.getCardnum()+"\n");
        tv1.append(ccObj2.getExpire()+"\n");
        sD = Double.toString(ccObj2.getBal());
        tv1.append(sD+"\n");
        sD = Double.toString(ccObj2.getLimit());
        tv1.append(sD + "\n");

        //print out all data for 3rd object
        tv1.append(ccObj3.getIssuer() + "\n");
        tv1.append(ccObj3.getName()+"\n");
        tv1.append(ccObj3.getCardnum()+"\n");
        tv1.append(ccObj3.getExpire()+"\n");
        sD = Double.toString(ccObj3.getBal());
        tv1.append(sD+"\n");
        sD = Double.toString(ccObj3.getLimit());
        tv1.append(sD+"\n");

        tv1.append("Average balance is: $");
        DecimalFormat df = new DecimalFormat("0.00");
        avgBal = (ccObj1.getBal()+ccObj2.getBal()+ccObj3.getBal())/3;
        tv1.append(df.format(avgBal)+ "\n");

        tv1.append("Average limit is: $");
        avgLim = (ccObj1.getLimit()+ccObj2.getLimit()+ccObj3.getLimit());
        tv1.append(df.format(avgLim)+"\n");


    }
}
