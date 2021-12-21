package BaiTapThem.Main;

import BaiTapThem.Manager.CandyManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CandyManagement managerAnimal = new CandyManagement();

        int choice = 1;

        do {
            System.out.println("Menu: ");
            System.out.println("1. Add new Candy");
            System.out.println("2. Display candy list");
            System.out.println("3. Display candy color");
            System.out.println("4. Display candy has color");
            System.out.println("5. Delete candy by Id");
            System.out.println("6. Find candy by Id");
            System.out.println("7. Find candy by highest price");
            System.out.println("8.  ");
            System.out.println("9. Calculate the cost of candy and display it as: Name - Cost: ");
            System.out.println("0. Exit");
            System.out.println("--------------------------------------------");
            System.out.println("Select your choice");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 1:
                    CandyManagement.();
                    break;
                case 2:
                    CandyManagement.();
                    break;
                case 3:
                    CandyManagement.();
                    break;
                case 4:
                    CandyManagement.();
                    break;
                case 5:
                    CandyManagement.();
                    break;
                case 6:
                    CandyManagement.();
                    break;
                case 7:
                    CandyManagement.();
                    break;
                case 8:
                    CandyManagement.();
                    break;
                default:
                    System.out.println("Wrong choice!!!");
                    break;
            }
        } while (choice!=0);

    }
}
