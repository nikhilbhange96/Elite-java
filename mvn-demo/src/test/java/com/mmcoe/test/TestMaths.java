package com.mmcoe.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.mmcoe.pojo.Maths;

public class TestMaths {

    private Maths m;

    @BeforeEach
    void init() {
        m = new Maths();
    }

    @Test
    void testAdd() {
        assertEquals(10, m.add(4, 6));
    }

    @Test
    void testSub() {
        assertEquals(5, m.sub(10, 5));
    }

    @Test
    void testDiv() {
        assertEquals(3, m.div(9, 3));
    }
}