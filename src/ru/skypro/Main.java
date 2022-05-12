package ru.skypro;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(7, 12, 20, 1, 1, 2, 3, 4, 8, 10, 10, 20, 24, 24, 4, 5, 5, 6, 7));

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0) {
                System.out.println(nums.get(i));
            }
        }
        System.out.println("==================================================================================================");

        Collections.sort(nums);

        for (int i = 0; i < nums.size(); i++) {
            if (nums.get(i) % 2 == 0 && nums.get(i - 1) != nums.get(i)) {
                System.out.println(nums.get(i));
            }
        }
        System.out.println("==================================================================================================");


        List<String> strings = new ArrayList<>(List.of(
                "Андрей", "Иван", "Антон",
                "Сергей", "Александр", "Вадим",
                "Евгений", "Александр", "Сергей",
                "Виталий", "Артем", "Максим",
                "Анатолий", "Андрей", "Сергей",
                "Виталий", "Андрей", "Семён", "Сергей"));

       Set <String> set  = new HashSet<>(strings);
        System.out.println(set);
        System.out.println("==================================================================================================");



        System.out.println(strings.size()- set.size());
    }
}
