package com.mySpring.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private int id;
    private String name;
    private float money;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public float getMoney() {
        return money;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMoney(float money) {
        this.money = money;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
