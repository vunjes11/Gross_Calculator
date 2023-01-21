package gross_calculator;

public class GrossPayCalculator {
    public static void main (String[] args){
        //1. Get the numbers of hours worked
       int  hours=40;
        //2. Get the hourly pay rate
        double payRate=25.40;
        //3. Multiply hours and pay rate
        double grosspay = hours*payRate;
        //4. Display result
        System.out.println("Gross Pay :"+grosspay);
    }
}
