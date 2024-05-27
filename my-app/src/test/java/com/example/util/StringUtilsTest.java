package com.example.util;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class StringUtilsTest {
    @Test
    public void testReverse() {
        assertEquals("!dlroW ,olleH", StringUtils.reverse("Hello, World!"));
        assertEquals("", StringUtils.reverse(""));
        assertEquals("elppa", StringUtils.reverse("apple"));
    }
}
