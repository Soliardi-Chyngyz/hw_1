package com.company;

import java.sql.SQLOutput;
import java.util.Random;

public abstract class Personal{
    private String name;
    private int age;
    private int experience;
    private OperatingSchedule operatingSchedule;
    private Patients patients;

    public Personal(String name, int age, int experience, OperatingSchedule operatingSchedule, Patients patients) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.operatingSchedule = operatingSchedule;
        this.patients = patients;
    }

    public Personal(String name, int age, int experience, Patients patients, OperatingSchedule operatingSchedule) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.patients = patients;
        this.operatingSchedule = operatingSchedule;
    }


    public String getName(String name){
        return this.name;
    }
    public int getAge(int age){
        return this.age;
    }
    public int getExperience(int experience){
        return this.experience;
    }
    public OperatingSchedule getOperatingSchedule(OperatingSchedule operatingSchedule){
        return this.operatingSchedule;
    }
    public Patients getPatients(){
        return patients;
    }

    public String getInfo(){
        return "Имя медика: " + getName(name)
                + "\nВозраст: " + getAge(age)
                + "\nОпыт: " + getExperience(experience)
                + "\nГрафик работы: " + getOperatingSchedule(operatingSchedule)
                + "\nПациенты: выздоровило - " + patients.getSuccessfulHealing() + " в тяжелом состоянии - " + patients.getSeriouslyIll() + " умерло - " + patients.getDead()
                + "\n----------";
    }
}
