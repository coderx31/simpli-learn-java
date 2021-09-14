package com.coderx.inheritance;

public class Demo {
    public static void main(String[] args) {
        MountainBike mountainBike = new MountainBike(10,1,20);
        System.out.println("Gear is "+mountainBike.getGear());
        System.out.println("Seat height is "+mountainBike.getSeatHeight()); // if use Bicycle bike = new MountainBike(),
                                                                            // we can not access seat height
        System.out.println("Bike speed is "+mountainBike.getSpeed());
        mountainBike.applyBreak(1);
        System.out.println("Bike speed after applying break "+mountainBike.getSpeed());
    }
}
