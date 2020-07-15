package com.company;

public class Surgeon extends Doctors{
    protected String surgeryDirection;

    public Surgeon(String name, int age, int experience, String academicDegree, OperatingSchedule operatingSchedule, String surgeryDirection) {
        super(name, age, experience, operatingSchedule, academicDegree);
        this.surgeryDirection = surgeryDirection;
    }

    public Surgeon( String name, int age, int experience,  OperatingSchedule operatingSchedule, String surgeryDirection) {
        super(name, age, experience, operatingSchedule);
        this.surgeryDirection = surgeryDirection;
    }

    @Override
    public String getInfo(){
        return "\nНаправление хирургии: " +surgeryDirection + "\n"
                + super.getInfo();
    }

}
