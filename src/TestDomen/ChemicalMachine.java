package TestDomen;

import java.util.ArrayList;
import java.util.List;

public class ChemicalMachine {

    public static List<String> applyHeat(List<String> ingredients)
    {
        List<String> result = new ArrayList<>();

        // Check for specific known combinations
        if (ingredients.size() == 2) {
            if (ingredients.get(0).equals("BROWN") && ingredients.get(1).equals("YELLOW")) {
                result.add("MAGENTA");
            } else if (ingredients.get(0).equals("CYAN") && ingredients.get(1).equals("GREEN")) {
                result.add("ORANGE");
            } else {
                result.add("UNKNOWN");
            }
        } else {
            result.add("UNKNOWN");
        }

        return result;
    }

    public static void main(String[] args)
    {
        System.out.println(applyHeat(new ArrayList<String>(List.of("BROWN", "YELLOW")))); // should print [MAGENTA]
        System.out.println(applyHeat(new ArrayList<String>(List.of("YELLOW", "BROWN")))); // should print [UNKNOWN]
    }

}
