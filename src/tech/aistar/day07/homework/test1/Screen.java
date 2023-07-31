package tech.aistar.day07.homework.test1;

public class Screen {
    private String type;
    private  int size;
    private String brand;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        if (size!=17||size!=23||size!=19||size!=25){
            this.size=17;
            return;
        }
        this.size = size;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Screen(String type, int size, String brand) {
        this.type = type;
        this.size = size;
        this.brand = brand;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Screen{");
        sb.append("type='").append(type).append('\'');
        sb.append(", size=").append(size);
        sb.append(", brand='").append(brand).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
