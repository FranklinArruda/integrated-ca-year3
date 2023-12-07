/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Util;

import java.time.Duration;

/**
 *
 * @author: Diego Ydalgo Jensen Francisco
 * @student no.: 2021336
 *  
 * Note that this class has been created inside a package to kept converters, calculators
 * and other utilities following "best practices" recommendations and intended to separate the concerns.
 * 
 * It can be used in a upgrade if, for example, the parental control and other ratings
 * regulations if it needs to be adapted for other countries legislation.
 *  
 */
public class ConversionUtil {
    
    public static Duration parseDuration(String durationStr){
        String[] parts = durationStr.split(":");
        int hours = Integer.parseInt(parts[0]);
        int minutes = Integer.parseInt(parts[1]);
        return Duration.ofHours(hours).plusMinutes(minutes);
        
    }
    
    // There's space here for other utilities methods
    
}
