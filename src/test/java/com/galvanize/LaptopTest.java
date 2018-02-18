package com.galvanize;

import org.junit.Assert;
import org.junit.Test;

public class LaptopTest {

    @Test
    public void itIsOffByDefault(){
        Laptop laptop = new Laptop();
        Assert.assertEquals(false, laptop.isOn());
    }

    @Test
    public void callingPowerTurnsItOn(){
        Laptop laptop = new Laptop();
        laptop.power();
        Assert.assertEquals(true, laptop.isOn());
        Assert.assertEquals(false, laptop.isSleeping());
    }

    @Test
    public void callingPowerWhenItIsOnTurnsItOff(){
        Laptop laptop = new Laptop();
        laptop.power();
        laptop.power();
        Assert.assertEquals(false, laptop.isOn());
    }

    @Test
    public void itCanBePutToSleep(){
        Laptop laptop = new Laptop();
        laptop.power();
        laptop.sleep();
        Assert.assertEquals(true, laptop.isOn());
        Assert.assertEquals(true, laptop.isSleeping());
    }

    @Test
    public void callingPowerCanWakeUpTheLaptop(){
        Laptop laptop = new Laptop();
        laptop.power();
        laptop.sleep();
        laptop.power();
        Assert.assertEquals(true, laptop.isOn());
        Assert.assertEquals(false, laptop.isSleeping());
    }

}
