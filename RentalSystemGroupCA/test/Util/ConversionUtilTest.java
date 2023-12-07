/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.time.Duration;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

/**
 *
 * @author diego
 */
public class ConversionUtilTest {

    @Test
    void testParseValidDuration() {
        Duration expected = Duration.ofHours(2).plusMinutes(30);
        Duration actual = ConversionUtil.parseDuration("2:30");
        assertEquals(expected, actual, "Parsing 2:30 should return a duration of 2 hours and 30 minutes");
    }

    @Test
    void testParseEdgeCaseDuration() {
        Duration expected = Duration.ofHours(0);
        Duration actual = ConversionUtil.parseDuration("0:00");
        assertEquals(expected, actual, "Parsing 0:00 should return a duration of 0 hours");
    }

    @Test
    void testParseInvalidDuration() {
        assertThrows(NumberFormatException.class, () -> ConversionUtil.parseDuration("abc"),
                     "Parsing an invalid duration string should throw a NumberFormatException");
    }

    // You can add more test cases as needed
}