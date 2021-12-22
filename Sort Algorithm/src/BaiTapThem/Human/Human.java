package BaiTapThem.Human;

public class Human {
    String name;
    int age;
    String Gender;
    String Address;

    public Human(String name, int age, String gender, String address) {
        this.name = name;
        this.age = age;
        Gender = gender;
        Address = address;
    }

    public static void setGender() {
    }

    public String getName() {
        return name;
    }

    public static void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public static void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Gender='" + Gender + '\'' +
                ", Address='" + Address + '\'' +
                '}';
    }
}
