package com.org.junit.duanhl.lengthmanager.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.org.junit.duanhl.lengthmanager.realize.LengthManager;


/**
 * unit test for lengthManager
 * @author duanhl
 *
 */
public class LengthManagerTest {
    LengthManager lengthManager = new LengthManager();
    
    @Test
    public void should_calculation_return_545mm() {
       String length = lengthManager.calculationLength("mm"); 
       assertEquals("545.0mm", length);
    }
    
    @Test
    public void should_calculation_return_54_5cm() {
       String length = lengthManager.calculationLength("cm"); 
       assertEquals("54.5cm", length);
    }

    @Test
    public void should_calculation_return_0_545m() {
       String length = lengthManager.calculationLength("m"); 
       assertEquals("0.545m", length);
    }
}
