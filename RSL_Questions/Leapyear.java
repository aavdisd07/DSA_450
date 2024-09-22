package RSL_Questions;

import java.time.Year;

// A year is a leap year if “any one of ” the following conditions are satisfied: 

// The year is multiple of 400.
// The year is a multiple of 4 and not a multiple of 100.

public class Leapyear {

    public static void main(String[] args) {
        int ye = 2024;
        Year y = Year.of(ye);
        // inBuilt method year.isLeap()
        // if((y.isLeap())){
        // System.out.println("Leap year");
        // }
        // else{
        // System.out.println("No leap year");
        // }

        int year = 2020;
        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("Leap year");
            System.out.println("next leap year is " + (year + 4));
        } else {
            System.out.println(year + " is Not leap year");
            year += 1;
            boolean Findnextleap = true;
            while (Findnextleap) {
                if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
                    System.out.println("Next  leap year " + year);
                    break;
                } else {
                    year += 1;
                }
            }
        }

    }

}
