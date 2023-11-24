// src/test/java/com/example/MyAppTest.java

package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MyAppTest {

    @Test
    public void testSum() {
        MyApp myApp = new MyApp();
        assertEquals(4, myApp.sum(2, 2));
    }
}
