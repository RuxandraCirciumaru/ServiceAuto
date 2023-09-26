package org.example;

import componente.GearBox;
import componente.engine;

public class Service {
    private String model;
    private double price;
    private engine engine;
    private GearBox gearBox;


    public Service(String model, double price, engine engine, GearBox gearBox) {
        this.model = model;
        this.price = price;
        this.engine = engine;
        this.gearBox = gearBox;
    }

    public boolean checkGearBoxCompatibility() {
        return gearBox.getModel().equals(model);
    }

    public boolean checkEngineCompatibility() {
        return engine.getModel().equals(model);
    }

    public void calculate() {
        if (checkGearBoxCompatibility() && checkEngineCompatibility()) {
            if (gearBox.isAutomatic()) {
                System.out.println("Pretul de reparatie final pentru cutia de viteze automata este de " + (price + 2150.75) + " lei");
            } else {
                System.out.println("Pretul de reparatie final pentru cutia de viteze automata este de " + price + " lei");
            }
        } else {
            System.out.println("Costul nu poate fi definit. Componente diferite. Diagnostic: ");
            if (!checkGearBoxCompatibility()) {
                System.out.println("Cutie de viteza diferita");
            }
            if (!checkEngineCompatibility()) {
                System.out.println("Motor diferit");
            }

        }
    }
}
