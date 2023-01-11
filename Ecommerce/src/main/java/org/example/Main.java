package org.example;

public class Main {
    public static void main(String[] args) {
        User d=new User();
        d.setUserName("Akash");
        d.setPassword("Aki568");
        d.setMobileNum(987456123);
        d.setEmailId("Akash@gmail.com");
        d.setAddress("New Delhi");

        Product P= new Product();
        P.setProductName("EarPod");
        P.setBrand("Boat");
        P.setColor("Black");
        P.setChargingType("Type c");
        P.setModelName("Xpods");
        P.setWarranty("1 Year");
        P.setProductVersion(5.0);
        P.setCountryOfOrigin("India");
        P.setWirelessRange("10m");

        System.out.println("User name:" +d.getUserName());
        System.out.println("User password:"+d.getPassword());
        System.out.println("User Mobile Number:" +d.getMobileNum());
        System.out.println(" User EmailId:" +d.getEmailId());
        System.out.println("User Address:"+d.getAddress());
        System.out.println("Product name:" +P.getProductName());
        System.out.println("Product Brand:" +P.getBrand());
        System.out.println("Product Color:"+P.getColor());
        System.out.println("Product Charging Type:" +P.getChargingType());
        System.out.println("Product Model Name:" +P.getModelName());
        System.out.println("Product Warranty:" +P.getWarranty());
        System.out.println("Product Version:"+P.getProductVersion());
        System.out.println("Product Country Of Origin:" +P.getCountryOfOrigin());
        System.out.println("Product Wireless Range:" +P.getWirelessRange());
    }
}