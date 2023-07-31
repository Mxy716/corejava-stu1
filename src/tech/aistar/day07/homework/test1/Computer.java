package tech.aistar.day07.homework.test1;

public class Computer {

    private String brand;
    private Double prices;
    private String description;

    private Screen screen;

    public Computer(String brand, Double prices, String description, Screen screen) {
        this.brand = brand;
        this.prices = prices;
        this.description = description;
        this.screen = screen;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getPrices() {

        return prices;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    public void setPrices(Double prices) {
        if (prices < 1000 || prices > 20000) {
            this.prices = 2000.0;
            return;
        }
        this.prices = prices;

    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", prices=").append(prices);
        sb.append(", description='").append(description).append('\'');
        sb.append(", screen=").append(screen);
        sb.append('}');
        return sb.toString();
    }
}
