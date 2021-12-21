package BaiTapThem.Object;

import com.sun.tools.internal.xjc.reader.xmlschema.bindinfo.BIConversion;

import java.util.Stack;

public class Candy {
    public static int idCandy;
    private static int VALUE = 1000;
    private String color;
    private String nature;
    private int quantity;
    private double price;
    private int id;

    public Candy(String color, String nature, int quantity, double price) {
        this.color = color;
        this.nature = nature;
        this.quantity = quantity;
        this.price = price;
        this.id = VALUE++;
    }
    public Candy(){

    }

    public static int getVALUE() {
        return VALUE;
    }

    public static void setVALUE(int VALUE) {
        Candy.VALUE = VALUE;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "color='" + color + '\'' +
                ", nature='" + nature + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", id=" + id +
                '}';
    }
}
