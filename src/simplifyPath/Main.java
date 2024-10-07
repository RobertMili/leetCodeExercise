package simplifyPath;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        String s = "/home/";
        System.out.println(solution.simplifyPath(s));

    }
}
class Solution {
    public String simplifyPath(String path) {
        List<String> mapping = new ArrayList<>();
        String[] parts = path.split("/");


        for (String part : parts ){
            if (!part.isEmpty() && !part.equals(".")) {
                if (part.equals("..")) {
                    if (!mapping.isEmpty()) {
                        mapping.remove(mapping.size() - 1);
                    }
                } else {
                    mapping.add(part);
                }
            }
        }
        return "/" + String.join("/", mapping);
    }
}
