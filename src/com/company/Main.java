package com.company;

public class Main {

    public static void main(String[] args) {
        Doctors Bob = new Doctors("Bob", 36, 10,
                OperatingSchedule.DAY, "Докторская степень");
        System.out.println(Bob.getInfo());

        Surgeon Timur = new Surgeon("Timur", 30,5,
                "Кандидат наук", OperatingSchedule.NIGHT,
                "Нейрохирург");
        System.out.println(Timur.getInfo());

        Surgeon Catman = new Surgeon("Catman", 25, 5,
                OperatingSchedule.DAY_AND_NIGHT, "Экстренная хирургия");
        System.out.println(Catman.getInfo());
    }
}
