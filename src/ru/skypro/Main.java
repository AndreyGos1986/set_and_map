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

        Set<String> set = new HashSet<>(strings);
        System.out.println(set);
        System.out.println("==================================================================================================");

        System.out.println(strings.size() - set.size());
        System.out.println("==================================================================================================");

        List<Integer> someNums = new ArrayList<>(List.of(12, 20, 2, 5, 2, 9, 7, 8, 6, 4, 2, 13, 25, 4, 8, 10, 10, 20, 24, 24, 4, 5, 5, 6, 7));
        for (int i = 0; i < someNums.size(); i++) {
            int t = someNums.get(i);
            if (t <= 1) {
                continue;
            }
            int ls = someNums.lastIndexOf(t);
            if (i != ls) {
                someNums.set(i, 0);
                someNums.set(ls, 0);
            } else {
                someNums.set(i, 1);
            }
        }
        int summ = 0;
        System.out.println(someNums);
        for (int i = 0; i < someNums.size(); i++) {
            summ = summ + someNums.get(i);
        }
        System.out.println(summ);
        System.out.println("==================================================================================================");


        //Задача 6
        String str = "абба";
        String str2 = "баба";

        Set<Character> strToArr = new HashSet<>();
        Set<Character> str2ToArr = new HashSet<>();
        for (int i = 0; i < str.length(); i++) {
            strToArr.add(str.charAt(i));
        }
        for (int i = 0; i < str2.length(); i++) {
            strToArr.add(str2.charAt(i));
        }
        if (!strToArr.contains(str2ToArr)) {
            System.out.println(false);
        }
            System.out.println(true);

        //Задача7
        String str3 = "abc";
        String str4 = "bca";
        List <Character> str3ToArr = new ArrayList<>();
        for (Character charArr : str3.toCharArray()) {
            str3ToArr.add(charArr);
        }
        for (Character charArr2 : str4.toCharArray()) {
            if (!str3ToArr.remove(charArr2)) {
                System.out.println(false);
            } else System.out.println(true);
        }
        }
}
