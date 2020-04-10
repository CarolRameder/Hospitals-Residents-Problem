package com.company;

public class Hospital implements Comparable<Hospital> {
    private int availablePosts;
    private String name;

    public Hospital(String nume, int n) {
        this.availablePosts = n;
        this.name = nume;
    }

    public void print() {
        System.out.println( this.name + " " + this.availablePosts );
    }

    public String getName() {
        return this.name;
    }

    public int getAvailablePosts() {
        return this.availablePosts;
    }

    public void lower() {
        this.availablePosts = this.availablePosts - 1;
    }


    @Override
    public int compareTo(Hospital o) {

        if (this.name.equals(o.name))
            return 0;
        else
            return 1;

    }

    @Override
    public String toString() {
        return name;
    }
}
