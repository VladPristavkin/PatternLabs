package Toys;

import Abstractions.Doll;

public class PlasticDoll implements Doll {
    @Override
    public void play() {
        System.out.println("Playing with a plastic doll.");
    }
}
