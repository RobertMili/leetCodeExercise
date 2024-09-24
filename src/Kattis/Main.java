package Kattis;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int days = sc.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < days; i++) {
            list.add(sc.nextInt());
        }

        int count = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) < 0) {
                count += 1;
            }
        }
        System.out.println(count);
    }

}