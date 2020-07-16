package com.company;

import java.util.Random;

public class Doctors extends Personal{
    protected String academicDegree;

    public Doctors (String name, int age, int experience, OperatingSchedule operatingSchedule, Patients patients, String academicDegree){
        super(name, age, experience, operatingSchedule, patients);
        this.academicDegree = academicDegree;
    }

    public Doctors(String name, int age, int experience, Patients patients, OperatingSchedule operatingSchedule) {
        super(name, age, experience, patients, operatingSchedule);
    }

    public String getAcademicDegree(String academicDegree){
        return this.academicDegree;
    }

    public void medicineDropper(String medicament, int dosage){
        for (int i = 0; i < 1; i++) {
            System.out.println("Медик сделал капельницу препаратом " + medicament + " " + dosage + "мл.");
        }
    }

    public void work(){
        Random random = new Random();
        int event = random.nextInt(2);
        if (event == 1)
        System.out.println("Доктор болен");
        else {
            System.out.println("Доктор принимает больных, назначает лечение");
        }
    }

    public final void operation(){
        Random random = new Random();
        int event = random.nextInt(2);
            if (event == 1){
                System.out.println("Doctor Bob is going to do drop");
            }
            else if (event == 2){
                System.out.println("Any surgeons will operate a patient");
            }
            else {
                System.out.println("All doctors have a rest");
            }

        }
    @Override
    public String getInfo(){
        return "\nНаучная степень: " + academicDegree + "\n"
                + super.getInfo();
    }


}
