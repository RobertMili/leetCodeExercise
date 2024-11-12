package TestDomen;

public class FlimsyBridge {
    public static int usageCount(int[] bridge) {
        int count = 0;


        // Loop until any section of the bridge reaches zero
        while (true) {

            boolean canCross = true;
            for (int integrity : bridge) {
                if (integrity <= 2) {
                    canCross = false;
                    break;
                }
            }

            if (!canCross) {
                return count;
            }


            for (int i = 0; i < bridge.length; i++) {
                bridge[i] -= 2;
            }


            count++;
        }
    }

    public static void main(String[] args) {
        int[] bridge = { 7, 6, 5, 8 };
        System.out.println(usageCount(bridge)); // Should print 2
    }
}