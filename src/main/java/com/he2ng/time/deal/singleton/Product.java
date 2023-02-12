package com.he2ng.time.deal.singleton;

import java.util.ArrayList;
import java.util.List;

public enum Product {
    INSTANCE;

    private Integer maxQuantity = 500;

    private Integer prizeCount = 0;

    private List<String> prizeUser;

    Product() {
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
