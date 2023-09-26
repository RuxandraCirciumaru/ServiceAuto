package org.example;

import componente.GearBox;
import componente.engine;

public class Main {
    public static void main(String[] args) {
        GearBox gearBox = new GearBox(200,true,"E97");
        engine engine = new engine("E97",1200,450);

        Service service = new Service("bmw", 5000.50, engine, gearBox);
        service.calculate();
    }
}