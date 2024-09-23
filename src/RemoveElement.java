import java.util.ArrayList;
import java.util.List;

public class RemoveElement {
    public static void main(String[] args) {

        int[] num = {3,2,2,3};
        int val = 3;

        removeElement(num,val);

    }
    public static int removeElement (int[] nums, int val) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            list.add(nums[i]);
        }

        int finalVal = val;
        list.removeIf(integer -> integer == finalVal);

        val = list.size();

        for (int i = 0; i < list.size(); i++) {
            nums[i] = list.get(i);
        }
        return val;
        }

    }

