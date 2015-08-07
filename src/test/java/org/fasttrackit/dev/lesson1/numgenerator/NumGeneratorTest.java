package org.fasttrackit.dev.lesson1.numgenerator;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumGeneratorTest {

    @Test
    public void testGenerate() throws Exception {

        int max = 100;
        int val = NumGenerator.generate(max);
        boolean exists = false;
        for (int i = 0; i <= max; i++) {
            if (val == i) {
                System.out.println("val="+val);
                exists = true;
                break;
            }
        }
        assertTrue(exists);
    }
}