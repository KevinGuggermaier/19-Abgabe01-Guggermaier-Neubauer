/*
 * Main Class
 * Makes an Instance of the Calculator Class and calls different methods of it
 * Author:      Kevin Guggermaier, Dominik Neubauer
 * Last Change: 28.03.2019
 */

public class Main {

    public static void main(String[] args){

        Calculator calc = new CalculatorImpl();


        calc.addValue(20);	// currently highest number
        calc.addValue(4);	// currently lowester number
        calc.addValue(16);

        // add other integers
        calc.addValue(37);
        calc.addValue(15);


        // output lowest number
        System.out.println("Lowest Number: " + calc.getMinimum());

        // output highest number
        System.out.println("Highest Number: " + calc.getMaximum());

        // output sum of all numbers

        System.out.println("Sum of all Numbers: " + calc.sum());

        System.out.println("Sum of all values: " + calc.sum(0,0));
    }
}
