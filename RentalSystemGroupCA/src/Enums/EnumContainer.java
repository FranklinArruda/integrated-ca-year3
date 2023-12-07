

//I have USED this as reference to assign ENUMS with String values

//https://www.programiz.com/java-programming/enum-string
//https://stackoverflow.com/questions/3978654/best-way-to-create-enum-of-strings

package Enums;

/**
 * @Author Franklin
 * Student Name: Franklin Arruda Cirino
 * Student No.: 2021368
 */
   
public class EnumContainer {
    
    // Greetings class message 
    // Call toString method and return message in real time when run program
    // Return message calling toString method 
    public enum Greetings {
   
        MORNING {   
        @Override
        public String toString(){
        return "Hello there," + "\n" + "Good morning!" + "\n"; // It creates a new line
      }
    },
      
        NOON {  
        @Override
        public String toString(){
        return "Hello there," + "\n" + "Good noon!" + "\n"; 
      }
    },
        
        AFTERNOON {
        @Override
        public String toString(){
        return "Hello there," + "\n" + "Good afternoon!" + "\n"; 
      }
    },
            
        EVENING {    
        @Override
        public String toString(){
        return "Hello there," + "\n" + "Good evening!" + "\n"; 
      }
    },
  }
    
    
    
    // get hour and return TO be validated in the greeting method
    public enum Hour {
    
    TWELVE(12), // set hour
    SEVENTEEN(17);
    
    final int hour;
    
    Hour (int hour){ // constructor
    this.hour = hour;
    }
    
    public int getHour(){ // get hour
    return hour;
    }
    }
    
    
    // another class 
}










