package io.zipcoder;

public class Fish extends io.zipcoder.Pet {
    String name;

    @Override
    public void speak() {
        System.out.println(super.getName() + " the fish, says YEET?");
    }
}
