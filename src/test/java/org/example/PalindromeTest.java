package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PalindromeTest {
    Palindrome pal = new Palindrome();
    @BeforeEach
    public void setUp()
    {

    }
    @Test
    void testPalindromeFalse() {
        assertFalse(pal.IsWordPalindrome("egg"));
    }
    @Test
    void testPalindromeTrue ()
    {
        assertTrue(pal.IsWordPalindrome("aga"));
    }
    @Test
    void testPalindromeFalseWithTwoWords ()
    {
        assertFalse(pal.IsWordPalindrome("aga rur"));
    }
}