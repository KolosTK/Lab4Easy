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
    void isWordPalindromeFalse() {
        assertFalse(pal.IsWordPalindrome("egg"));
    }
    @Test
    void isPalindromeTrue ()
    {
        assertTrue(pal.IsWordPalindrome("aga"));
    }
}