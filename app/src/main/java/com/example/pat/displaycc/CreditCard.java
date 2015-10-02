package com.example.pat.displaycc;


import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CreditCard {

     public  String getccInfo() throws IOException {
         String allData = null;
         String issuer, name, cardnum, expire;
         Double bal, limit;
         List<String> ccData = new ArrayList<String>();
        //get cc info
        URL urlDat = new URL("https://web.njit.edu/~halper/it114/l2d.txt");
         Scanner urlScn = new Scanner(urlDat.openStream());
         while (urlScn.hasNext()){
             ccData.add(urlScn.nextLine() + "\n");
         }
         return ccData.toString();
    }

    public class makeCCprofile{
        
    }
}
//tes