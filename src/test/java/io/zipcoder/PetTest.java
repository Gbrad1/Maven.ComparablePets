package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    io.zipcoder.Pet currentPet = new io.zipcoder.Pet();
    io.zipcoder.Dog currentDog = new io.zipcoder.Dog();
    io.zipcoder.Fish currentFish = new io.zipcoder.Fish();
    io.zipcoder.Cat currentCat = new io.zipcoder.Cat();

    @Test
    public void setName() {
        currentPet.setName("Kali");
        String a = currentPet.getName();

        Assert.assertEquals(a,"Kali");
    }

    @Test
    public void getName() {
        currentPet.setName("Lilli");
        String a = currentPet.getName();

        Assert.assertEquals(a, "Lilli");
    }

    @Test
    public void dogSpeakTest() {
        currentDog.speak();
    }

    @Test
    public void fishSpeakTest() {
        currentFish.speak();
    }

    @Test
    public void catSpeakTest() {
        currentCat.speak();
    }

}
