package io.zipcoder;

public class Cat extends io.zipcoder.Pet {
    String name;

    @Override
    public void speak() {
        System.out.println(super.getName() + " the cat, says Meow!");
    }
}
