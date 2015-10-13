package com.example.pat.displaycc;


import android.widget.Toast;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.net.*;

    class ccProfile{
        private String issuer, name, cardnum, expire;
        private Double bal, limit;

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

