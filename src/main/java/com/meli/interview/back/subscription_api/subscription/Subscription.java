package com.meli.interview.back.subscription_api.subscription;

public class Subscription {
    private String partner;

    public float getPrice() {
        float price = 0;
        if (partner.equals("disney")) {
            price = 100;
        }else if (partner.equals("netflix")) {
            price = 200;
        }else if (partner.equals("spotify")) {
            price = 50;
        }else {
            price = 0;
        }

        return price;
     }
}
