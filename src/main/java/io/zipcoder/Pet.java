package io.zipcoder;

public class Pet implements Comparable<Pet>{
    String name;

    public Pet() {

    }

    public void speak() {

    }

    public void setName(String newName) {
        this.name = newName;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Pet otherPet) {
        if  (getName().compareTo(otherPet.getName()) > 0) {
            return 1;
        } else if (getName().compareTo(otherPet.getName()) < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
