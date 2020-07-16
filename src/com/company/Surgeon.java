package com.company;

import java.util.Random;

public class Surgeon extends Doctors{
    protected String surgeryDirection;

    public Surgeon(String name, int age, int experience, String academicDegree, OperatingSchedule operatingSchedule, Patients patients, String surgeryDirection) {
        super(name, age, experience, operatingSchedule, patients, academicDegree );
        this.surgeryDirection = surgeryDirection;
    }

    public Surgeon( String name, int age, int experience, Patients patients, OperatingSchedule operatingSchedule, String surgeryDirection) {
        super(name, age, experience, patients, operatingSchedule);
        this.surgeryDirection = surgeryDirection;
    }

    @Override
    public final void work(){
        Random random = new Random();
        int event = random.nextInt(2);
        if (event == 1)
            System.out.println("Доктор болен, и пациентов за место него принимает один из хирургов");
        else {
            System.out.println("Доктор принимает больных, назначает лечение");
        }
    }

    @Override
    public final String getInfo(){
        return "Направление хирургии: " +surgeryDirection + ""
                + super.getInfo();
    }

}
