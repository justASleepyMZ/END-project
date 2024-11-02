package main;

public class StandardRoom extends Room {
    public StandardRoom() {
        type = "Standard";
        price = 100.0;
    }

    @Override
    public void book() {
        System.out.println("Standard room booked.");
    }
}


class LuxuryRoom extends Room {
    public LuxuryRoom() {
        type = "Luxury";
        price = 250.0;
    }

    @Override
    public void book() {
        System.out.println("Luxury room booked.");
    }
}

