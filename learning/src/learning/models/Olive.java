package learning.models;

public class Olive {
    
    private String name;
    private long color;
    private int oil;

    public Olive (String name, long color, int oil) {
        this.name = name;
        this.color = color;
        this.oil = oil;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getcolor() {
        return this.color;
    }

    public void setColor(long color) {
        this.color = color;
    }

    public int crush() {
        return this.oil;
    }

    public void setOil(int oil) {
        this.oil = oil;
    }

}
