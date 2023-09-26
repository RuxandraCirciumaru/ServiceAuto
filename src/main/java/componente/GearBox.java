package componente;

public class GearBox {

    private double price;
    private boolean automatic;
    private String model;

    public GearBox(double price,boolean automatic,String model){
        this.price = price;
        this.automatic = automatic;
        this.model = model;

    }

    public double getPrice() {
        return price;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public String getModel() {
        return model;
    }
}
