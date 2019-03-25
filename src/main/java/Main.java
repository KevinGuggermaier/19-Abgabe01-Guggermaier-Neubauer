public class Main {

    public static void main(String[] args){

        Calculator calc = new Calculator();

        calc.addValue(20);	// currently highest number
        calc.addValue(4);	// currently lowester number
        calc.addValue(16);

        // add other integers
        calc.addValue(37);
        calc.addValue(15);

        // output lowest number
        System.out.println("Lowest Number: " + calc.getMinimum());

        // output highest number

        // output sum of all numbers
    }
}
