package com.company;

public class Doctors extends Personal{
    protected String academicDegree;

    public Doctors (String name, int age, int experience, OperatingSchedule operatingSchedule, String academicDegree){
        super(name, age, experience, operatingSchedule);
        this.academicDegree = academicDegree;
    }

    public Doctors(String name, int age, int experience, OperatingSchedule operatingSchedule) {
        super(name, age, experience, operatingSchedule);
    }


    public String getAcademicDegree(String academicDegree){
        return this.academicDegree;
    }


    public String getInfo(){
        return "Имя медика: " + getName(name)
                + "\nВозраст: " + getAge(age)
                + "\nОпыт: " + getExperience(experience)
                + "\nГрафик работы: " + getOperatingSchedule(operatingSchedule)
                + "\nНаучная степень: " + academicDegree
                + "\n----------";

    }
    @Override
    public final void applyProfessionalAbility(Doctors Bob) {
        System.out.println("Доктора только назначают курс лечения");
    }

}
