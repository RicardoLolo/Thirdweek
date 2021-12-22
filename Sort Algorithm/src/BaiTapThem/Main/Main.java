package BaiTapThem.Main;

import BaiTapThem.Manager.HumanManagement;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        HumanManagement humanManagement = new HumanManagement() {
            @Override
            public void addHuman() {

            }

            @Override
            public void editHuman() {

            }

            @Override
            public void deleteHumanByName() {

            }
        };
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Enter all human ");
            System.out.println("2. Add human ");
            System.out.println("3. Delete human by name ");
            System.out.println("4. edit human by name");
            System.out.println("5. Display all human by name ");
            System.out.println("6. ");
            System.out.println("7. ");
            System.out.println("8. ");
            System.out.println("9. ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
            }
        }

    }
}
