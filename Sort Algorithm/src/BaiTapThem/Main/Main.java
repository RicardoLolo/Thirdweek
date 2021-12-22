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
            System.out.println("6. Display all man in list ");
            System.out.println("7. Display all woman in list ");
            System.out.println("8. Display all people under 20 years old in list ");
            System.out.println("9. Display by the name entered ");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();

            case 1:
                CandyManagement. ();
                break;
            case 2:
                CandyManagement. ();
                break;
            case 3:
                CandyManagement. ();
                break;
            case 4:
                CandyManagement. ();
                break;
            case 5:
                CandyManagement. ();
                break;
            case 6:
                CandyManagement. ();
                break;
            case 7:
                CandyManagement. ();
                break;
            case 8:
                CandyManagement. ();
                break;
            default:
                System.out.println("Wrong choice!!!");
                break;
        }
    } while(choice!=0);
}
}

