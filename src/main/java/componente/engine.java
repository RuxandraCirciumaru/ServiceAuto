package componente;

public class engine {
    private String model;
    private int capacity;
    private double price;


    public engine(String model, int capacity, double price) {
        this.model = model;
        this.capacity = capacity;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
