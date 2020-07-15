package com.company;

import java.util.Random;

public abstract class Personal implements HavingProfessionalSkills{
    protected String name;
    protected int age;
    protected int experience;
    protected OperatingSchedule operatingSchedule;

    public Personal(String name, int age, int experience, OperatingSchedule operatingSchedule) {
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.operatingSchedule = operatingSchedule;
    }

    public Personal(String name, int age, int experience) {
        this.name = name;
        this.age = age;
        this.experience = experience;
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


//    public String getInfo(){
//        return "Имя медика " + name
//                + "\nВозраст " + age
//                + "\nОпыт " + experience
//                + "\nГрафик работы " + operatingSchedule;
//    }


}
