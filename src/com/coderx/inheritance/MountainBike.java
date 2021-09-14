package com.coderx.inheritance;

public class MountainBike extends Bicycle {
    private int seatHeight;
    public MountainBike() {
        super();
    }

    public MountainBike(int seatHeight, int gear, int speed) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }

    public int getSeatHeight() {
        return seatHeight;
    }

    public void setSeatHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }

    @Override
    public String toString() {
        return "MountainBike{" +super.toString()+" "+
                "seatHeight=" + seatHeight +
                '}';
    }
}
