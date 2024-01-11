package com.rathod.java8;

public final class PanCard {
    final String pancardNumber;

    public PanCard(String pancardNumber) {
        this.pancardNumber = pancardNumber;
    }

    public String getPancardNumber() {
        return pancardNumber;
    }
}

class ImmutableDemo {
    public static void main(String ar[]) {
        PanCard e = new PanCard("ABC123");
        String s1 = e.getPancardNumber();
        System.out.println("Pancard Number: " + s1);
    }
}