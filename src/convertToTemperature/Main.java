package convertToTemperature;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        double celsius = 36.50;
        solution.convertTemperature(celsius);

    }
}
class Solution {
    public double[] convertTemperature(double celsius) {

        double[] result = new double[2];
        double kelvin = 273.15;
        double fahrenheit = 0;

        result[0] = celsius;

        kelvin += celsius;
        fahrenheit = celsius * 1.80 + 32.00;

       result[0] = kelvin;
       result[1] = fahrenheit;



        return result;
    }
}
