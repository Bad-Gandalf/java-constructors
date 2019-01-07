package com.patdoc;

public class Main {

    public static void main(String[] args) {

        VipCustomer pat = new VipCustomer();
        System.out.println(pat.getCreditLimit());
        System.out.println(pat.getEmail());
        System.out.println(pat.getName());

        VipCustomer steve = new VipCustomer("Steve Jobs", "Steve@apple.com");
        System.out.println(steve.getCreditLimit());
        System.out.println(steve.getEmail());
        System.out.println(steve.getName());

        VipCustomer roger = new VipCustomer("Roger Doger", 2000, "Roger@beano.com");
        System.out.println(roger.getCreditLimit());
        System.out.println(roger.getEmail());
        System.out.println(roger.getName());






    }
}
