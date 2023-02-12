package com.he2ng;

import com.he2ng.time.deal.singleton.Product;
import com.he2ng.user.User;

public class App {
    public static void main(String[] args) {
        final Product product = Product.INSTANCE;
//        final Product product = new Product();

        for (int i = 0; i < 1000; i++) {
            final User user = new User(String.format("%s-%d", "이름", i));
            user.setProduct(product);
            final Thread thread = new Thread(user);
            thread.start();
        }

        product.print();
    }
}
