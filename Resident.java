package com.company;

public class Resident implements Comparable<Resident> {
    private String name;
    private int isHired;
    private Hospital hospital;
    private int grade;

    public Resident(String nume, int nota) {
        this.name = nume;
        this.isHired = 0;
        this.grade = nota;
    }

    public int getIsHired() {
        return this.isHired;
    }

    public void print() {
        if (this.isHired == 0) {
            System.out.println(this.name + " is not hired  " + this.grade);
        } else {
            System.out.println(this.name + " is hired at " + this.hospital.getName() + " " + this.grade);
        }

    }

    public void isHiredBy(Hospital h) {
        if (this.isHired == 0) {
            if (h.getAvailablePosts() > 0) {
                this.hospital = h;
                this.isHired = 1;
                this.hospital.lower();
            } else {
                System.out.println("The hospital " + h.getName() + " is full!");
            }
        } else {
            System.out.println("Already hired!");
        }

    }

    public int compareTo(Resident o) {
        return Integer.compare(o.grade, this.grade);
    }

    public String getName() {
        return this.name;
    }

    public String toString() {
        return this.name;
    }
}
