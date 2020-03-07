package io.zipcoder;

public class Dog extends io.zipcoder.Pet {
    String name;

    @Override
    public void speak() {
        System.out.println(super.getName() + " the Dog, says Bark!");
    }

}
