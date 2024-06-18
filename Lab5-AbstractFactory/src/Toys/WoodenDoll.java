package Toys;

import Abstractions.Doll;

public class WoodenDoll implements Doll {
    @Override
    public void play() {
        System.out.println("Playing with a wooden doll.");
    }
}
