package BaiTapThem.Manager;

import BaiTapThem.Human.Human;

import java.util.ArrayList;
import java.util.Scanner;

public abstract class HumanManagement implements Manager{
    private ArrayList<Human> humans;
    private Scanner scanner = new Scanner(System.in);

    public HumanManagement(){
        this.humans = new ArrayList<>();
    }
     public void displayAll(){
        for (Human human : humans){
            System.out.println(human);
        }
     }

     public Human createHuman(){
         System.out.println("Enter name :");
         String name = scanner.nextLine();
         System.out.println("Enter age :");
         int age = scanner.nextInt();
         System.out.println("Enter gender :");
         String gender = scanner.nextLine();
         System.out.println("Enter address :");
         String address = scanner.nextLine();
         return new Human(name, age, gender, address);
     }

     public void addHuman(Human human){
        humans.add(human);
     }

    public Human editHuman(String name) {
        Human human = null;
        for (Human h : humans) {
            if (h.getName().equals(name)) {
                human = h;
            }
        }
        if (human != null) {
            int index = humans.indexOf(human);
            System.out.println("Enter name :");
            name = scanner.nextLine();
            Human.setName(name);
            System.out.println("Enter age :");
            int age = Integer.parseInt(scanner.nextLine());
            Human.setAge(age);
            System.out.println("Enter gender:");
            int qua = scanner.nextInt();
            Human.setGender();
        }
        return human;
    }

     public ArrayList<Human> deleteHumanByName(String name){
       ArrayList<Human> human = new ArrayList<>();
       for (Human h : humans){
           if (h.getName().equals(name)){
               human.add(h);
           }
       }
         return human;
     }
    public ArrayList<Human> displayHumanListByName(String name) {
        ArrayList<Human> human = new ArrayList<>();
        for (Human h : humans) {
            if (h.getName().equals(name)) {
                human.add(h);
            }
        }
        return human;
    }
}


