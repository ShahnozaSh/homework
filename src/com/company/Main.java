package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(homeWork(geterateRandomAge(), 22));
        System.out.println(homeWork(geterateRandomAge(), 20));
        System.out.println(homeWork(geterateRandomAge(), -22));
        System.out.println(homeWork(geterateRandomAge(), 99));
        System.out.println(homeWork(geterateRandomAge(), 6));
    }

    private static int geterateRandomAge() {
        return 0;
    }

    public static String homeWork(int age, int temperature) {
        System.out.println("возраст:" + age + "темпуратура" + temperature);
        if (age >= 20 && age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age >= 20 && temperature >= 0 && temperature <= 28) {
            return " Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
        public static int geterateRandomAge () {
            Random random = new Random();
            return random.nextlnt(70);
        }

    }

}
}
