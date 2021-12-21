package BaiTapThem.Manager;

import BaiTapThem.Object.Candy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CandyManagement {
    private final ArrayList<Candy> candies;
    Scanner scanner = new Scanner(System.in);
    private  static int index = 0;
    private  static final  String DIVIDE_SECTION = "----------------";

    public CandyManagement() {
        this.candies = candies;
    }
    private String checkColor(String color) {
        for (Candy candy : candies) {
            while (candy.getColor().equals(color)) {
                System.out.print("This name already exists. Please enter another name: ");
                color = scanner.nextLine();
            }
        }
        return color;
    }
    public List<Candy> addCandy(int choice){
        System.out.println("Enter color:");
        String color = scanner.nextLine();
        color = checkColor(color);
        System.out.println("Enter nature:");
        String nature = scanner.nextLine();
        System.out.println("Enter quantity:");
        int quantity = scanner.nextInt();
        System.out.println("Enter price:");
        double price = scanner.nextDouble();
        scanner.nextLine();
        int idCandy = Candy.idCandy;
        return Collections.unmodifiableList(candies);
    }
    public Candy deleteCandyById(int idCandy) {
        Candy candy = new Candy();
        for (Candy candy1 : candies) {
            if (candy1.getId()== idCandy) {
                candy = candy1;
                candies.remove(candy);
                break;
            }
        }
        return candy;
    }

    public void displayAll() {
        for (Candy candy : candies) {
            System.out.println(candy);
        }
    }

    public void displayByColor(String displayColor) {
        for (Candy candy : candies) {
            if (candy.getColor().equals(displayColor)) {
                System.out.println(candy);
            }
        }
    }

    public void displayByID(int choice) {
        for (Candy candy : candies) {
            if (choice == 1) {
                System.out.println(candy);}
       }
    }


}

