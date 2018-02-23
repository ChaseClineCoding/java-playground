package com.galvanize;

import org.junit.Assert;
import org.junit.Test;

public class AccumulatorTest {

    @Test
    public void emptyCase() {
        Accumulator acc = new Accumulator();
        Assert.assertEquals("", acc.toSentence(new String[0]));
        Assert.assertEquals("", acc.toSentence(new String[]{""}));
    }

    @Test
    public void normalCase() {
        Accumulator acc = new Accumulator();
        Assert.assertEquals("Alice, Bob and Carol", acc.toSentence(new String[]{"Alice", "Bob", "Carol"}));
        Assert.assertEquals("Alice and Bob", acc.toSentence(new String[]{"Alice", "Bob"}));
    }

}
