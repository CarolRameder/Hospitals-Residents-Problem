package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Hospital H0 = new Hospital("H0", 1);
        Hospital H1 = new Hospital("H1", 2);
        Hospital H2 = new Hospital("H2", 2);

        Resident R0 = new Resident("R0", 9);
        Resident R1 = new Resident("R1", 5);
        Resident R2 = new Resident("R2", 8);
        Resident R3 = new Resident("R3", 10);
        Resident R4 = new Resident("R4", 3);

        R3.isHiredBy(H0);
        R0.isHiredBy(H0);
        R0.isHiredBy(H1);
        R1.isHiredBy(H2);
        R2.isHiredBy(H1);
        R2.isHiredBy(H1);

        ArrayList<Resident> res = new ArrayList();
        res.add(R0);
        res.add(R1);
        res.add(R2);
        res.add(R3);
        res.add(R4);
        Collections.sort(res);

        System.out.println("Residents information : name , hired / not hired, grade ");
        Iterator<Resident> itR;
        itR = res.iterator();
        while(itR.hasNext()) {
            Resident i = (Resident)itR.next();
            i.print();
        }

        TreeSet<Hospital> hos = new TreeSet();
        hos.add(H0);
        hos.add(H1);
        hos.add(H2);

        System.out.println("Hospital information : name , available posts ");
        Iterator<Hospital> itH;
        itH = hos.iterator();
        while(itH.hasNext()) {
            Hospital j = (Hospital)itH.next();
            j.print();
        }

        ArrayList<Hospital> prefR0 = new ArrayList();
        prefR0.add(H0);
        prefR0.add(H1);
        prefR0.add(H2);

        ArrayList<Resident> prefH0 = new ArrayList();
        prefH0.add(R3);
        prefH0.add(R0);
        prefH0.add(R1);
        prefH0.add(R2);

        ArrayList<Resident> prefH1 = new ArrayList();
        prefH1.add(R0);
        prefH1.add(R2);
        prefH1.add(R1);

        ArrayList<Resident> prefH2 = new ArrayList();
        prefH2.add(R0);
        prefH2.add(R1);
        prefH2.add(R3);

        TreeMap<Hospital, ArrayList<Resident>> hosMap = new TreeMap();
        hosMap.put(H0, prefH0);
        hosMap.put(H1, prefH1);
        hosMap.put(H2, prefH2);

        ArrayList<Hospital> prefR1 = new ArrayList();
        prefR1.add(H0);
        prefR1.add(H1);
        prefR1.add(H2);

        ArrayList<Hospital> prefR2 = new ArrayList();
        prefR2.add(H0);
        prefR2.add(H1);

        ArrayList<Hospital> prefR3 = new ArrayList();
        prefR3.add(H0);
        prefR3.add(H2);

        HashMap<Resident, ArrayList<Hospital>> resMap = new HashMap();
        resMap.put(R0, prefR0 );
        resMap.put(R1, prefR1);
        resMap.put(R2, prefR2);
        resMap.put(R3, prefR3);

        System.out.println("Hospitals map: " + hosMap);
        System.out.println("Residents map: " + resMap);
    }
}
