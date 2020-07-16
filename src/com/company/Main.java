package com.company;

public class Main {

    public static void main(String[] args) {
        Doctors Bob = new Doctors("Bob", 36, 10,
                OperatingSchedule.ДЕНЬ, new Patients(30, 10,3), "Кандидат наук");
        Bob.work();
        System.out.println(Bob.getInfo());
        Bob.medicineDropper("физ.раствор", 300);
        Bob.operation();


        Surgeon Timur = new Surgeon("Timur", 30,5,
                "Кандидат наук", OperatingSchedule.НОЧЬ, new Patients(40, 20, 10),
                "Нейрохирург");
        System.out.println(Timur.getInfo());
        Timur.work();
        Timur.medicineDropper("аналгин", 200);
        Timur.operation();

        Surgeon Catman = new Surgeon("Catman", 25, 5, new Patients(15,5,0),
                OperatingSchedule.СУТКИ, "Экстренная хирургия");
        System.out.println(Catman.getInfo());
        Catman.work();
        Catman.medicineDropper("антибиотик", 500);
        Catman.operation();
    }
}
