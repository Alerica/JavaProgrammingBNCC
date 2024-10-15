package bnccsesi0;

public class BNCCSesi0 {

    public static void main(String[] args) {
        String day = "Wednesday";
        switch(day) {
            case "Sunday":
                System.out.println("It`s Sunday!");
                break; // to prevent going to other cases
            case "Monday":
                System.out.println("It`s Monday!");
                break;
            case "Tuesday":
                System.out.println("It`s Tuesday!");
                break;
            case "Wednesday":
                System.out.println("It`s Wednesday!");
                break;
            case "Thursday":
                System.out.println("It`s Thursday!");
                break;
            case "Friday":
                System.out.println("It`s Friday!");
                break;
            case "Saturday":
                System.out.println("It`s Saturday!");
                break;
            default: // In case the value is outside all of the case
                System.out.println("It`s not a valid day");
        }
    } 
    
}
/* Program output
It`s Wednesday!
*/
