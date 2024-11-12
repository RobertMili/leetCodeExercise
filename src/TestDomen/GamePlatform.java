package TestDomen;

public class GamePlatform {


        public static double calculateFinalSpeed ( double initialSpeed, int[] inclinations) {

            double output = initialSpeed;
            for (int incline : inclinations) {
                output -= incline;  // Decrease speed by the incline value
                if (output <= 0) {
                    return 0;  // If speed becomes zero or negative, return 0
                }
            }
            return output;
        }

    public static void main(String[] args){
        System.out.println(calculateFinalSpeed(60.0, new int[] { 0, 30, 0, -45, 0 }));
    }
}
