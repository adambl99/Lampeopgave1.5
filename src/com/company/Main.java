package com.company;

public class Main {

    public static void main(String[] args) {
            Lamp loftLampe = new Lamp();

            Lamp skriveBordsLampe = new Lamp();

        //Indtast true for slukket og false for tændte lamper.

        if (loftLampe.isOn() == false)
            System.out.println("Loftslampen er tændt");
        else System.out.println("Loftslampen er slukket");

        if ( skriveBordsLampe.isOn() == false)
            System.out.println("Skrivebordslampen er tændt");
        else System.out.println("Skrivebordslampen er slukket");

        loftLampe.pressLightSwitch();

        skriveBordsLampe.pressLightSwitch();







        }
    }


