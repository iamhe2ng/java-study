package com.he2ng.user;


import com.he2ng.time.deal.singleton.Product;

public class User implements Runnable {
    private String name;

    private Product product;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void run() {
        product.prize(this.name);
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}
