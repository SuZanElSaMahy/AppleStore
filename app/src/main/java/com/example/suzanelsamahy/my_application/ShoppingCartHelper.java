package com.example.suzanelsamahy.my_application;

import java.util.List;
import java.util.Vector;

import android.content.res.Resources;

public class ShoppingCartHelper {

    public static final String PRODUCT_INDEX = "PRODUCT_INDEX";

    private static List<Product> catalog;
    private static List<Product> cart;

    public static List<Product> getCatalog(Resources res){
        if(catalog == null) {
            catalog = new Vector<Product>();

              catalog.add(new Product("Switch", res
                    .getDrawable(R.drawable.switchh), "Switch by Chip Heath and Dan Heath", 24.99));

        }

        return catalog;
    }

    public static List<Product> getCart() {
        if(cart == null) {
            cart = new Vector<Product>();
        }

        return cart;
    }

}
