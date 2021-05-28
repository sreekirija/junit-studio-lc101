package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

public class BalancedBracketsTest {

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() { assertTrue(BalancedBrackets.hasBalancedBrackets("[]")); }

    @Test
    public void textInsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void textOutsideBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    @Test
    public void onlyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void textInsideBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]LaunchCode["));
    }

    @Test
    public void textOutsideBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("][LaunchCode"));
    }

    @Test
    public void twoSetBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    @Test
    public void twoSetBracketsReturnsFalse() {
        assertFalse (BalancedBrackets.hasBalancedBrackets("][]["));
    }

    @Test
    public void oneBracketWithTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void onlyOneBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void onlyOpenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[[[[[[[["));
    }

    @Test
    public void onlyCloseBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]]]]]]]]"));
    }

}
