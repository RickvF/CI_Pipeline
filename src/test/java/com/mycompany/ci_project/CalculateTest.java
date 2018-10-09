/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ci_project;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Herman-Peter18001
 */
public class CalculateTest {
    @Test
    public void testDivide() {
        assertEquals(Calculate.divide(6.0f, 3.0f), 2.0f);
    }
    @Test
    public void testMultiply() {
        assertEquals(Calculate.multiply(6.0f, 3.0f), 18.0f);
    }
}
