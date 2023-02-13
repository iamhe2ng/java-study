package com.he2ng.time.deal.singleton;

import java.util.ArrayList;
import java.util.List;

public enum Product {
    INSTANCE;

    private static final Integer MAX_QUANTITY = 500;

    private Integer prizeCount = 0;

    private List<String> prizeUser;

    Product() {
        this.prizeUser = new ArrayList<>();
    }

    public void prize(String userName) {
        if (prizeCount >= MAX_QUANTITY) {
            return;
        }

        prizeCount++;
        System.out.println("prizeCount = " + prizeCount);
        prizeUser.add(userName);

    }

    public void print() {
        System.out.println("최종 당첨자 수  = " + prizeCount);
        System.out.println("최종 당첨자 리스트 사이즈  = " + prizeUser.size());
    }
}
