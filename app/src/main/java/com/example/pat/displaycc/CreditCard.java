package com.example.pat.displaycc;


import android.widget.Toast;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.net.*;

public class CreditCard {

    //set up method to get and return data as arraylist
    public ArrayList<String> ccArray(){
        ArrayList<String> ccInfo = new ArrayList<String>();

        //array set up. time to get data
        //DONT FORGET TO CHANGE URL TO INPUT FROM EDITTEXT YOU FOOL
        try {
            URL urlDat = new URL("https://web.njit.edu/~halper/it114/l2d.txt");
            Scanner urlScn = new Scanner(urlDat.openStream());
            while (urlScn.hasNext()){
                ccArray().add(urlScn.nextLine() + "\n");
            }

        }catch (MalformedURLException URLe){
            //I dont know, toast or something. do it

        }
        catch (IOException IOe){
            //same thing
        }
        return ccInfo;
    }

      


    public class ccProfile{
        String issuer, name, cardnum, expire;
        Double bal, limit;

        public String getIssuer() {
            return issuer;
        }

        public void setIssuer(String issuer) {
            this.issuer = issuer;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCardnum() {
            return cardnum;
        }

        public void setCardnum(String cardnum) {
            this.cardnum = cardnum;
        }

        public String getExpire() {
            return expire;
        }

        public void setExpire(String expire) {
            this.expire = expire;
        }

        public Double getBal() {
            return bal;
        }

        public void setBal(Double bal) {
            this.bal = bal;
        }

        public Double getLimit() {
            return limit;
        }

        public void setLimit(Double limit) {
            this.limit = limit;
        }
    }
}
//tes