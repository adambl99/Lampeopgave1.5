package com.company;

public class Lamp {

    private boolean lampIsOn = false;
public Lamp(){
    lampIsOn = false;
}
        public void turnOn()
        {
            lampIsOn = true;
            reportState();
        }

        public void turnOff()
        {
            lampIsOn = false;
            reportState();
        }
        public boolean isOn()
        {
            return lampIsOn;
        }
        public void reportState()
        {
            if (this.isOn() == true)
                System.out.println("Lampen er tændt");
            else
                System.out.println("Lampen er slukket");
        }
        public void pressLightSwitch(){
    if (lampIsOn==false){
        lampIsOn = true;
        System.out.println("Lampen er nu slukket");
    } else if (lampIsOn==true){
        lampIsOn = false;
        System.out.println("Lampen er nu tændt");
    }
        }
    }

















