package com.he2ng.time.deal.thread.race.condition;

import java.util.ArrayList;
import java.util.List;

public class Product {
    private Integer maxQuantity = 500;

    private Integer prizeCount = 0;

    private List<String> prizeUser;

    public Product() {
        this.prizeUser = new ArrayList<>();
    }

    public void prize(String userName) {
        if (prizeCount >= maxQuantity) {
            return;
        }

        prizeCount++;
        System.out.println("prizeCount = " + prizeCount);
        prizeUser.add(userName);

    }

    public void print() {
        System.out.println("최종 당첨자 수  = " + prizeCount);
        System.out.println("최종 당첨자 수  = " + prizeUser.size());
    }
}
