package jumpGame;

public class Main {
    public static void main(String[] args) {
        Soulution soulution = new Soulution();
        int[] nb1 = {2, 3, 1, 1, 4};
        int[] nb2 = {3, 2, 1, 0, 4};

        System.out.println(soulution.canJump(nb1));
        System.out.println(soulution.canJump(nb2));
    }
}
class Soulution {
    public boolean canJump(int[] nums) {

        int maxReach = 0;
        int i = 0;

        while (i < nums.length) {
            if (i > maxReach) {
                return false;
            }
            maxReach = Math.max(maxReach, i + nums[i]);
            i++;
        }

        return maxReach >= nums.length - 1;
    }
}
