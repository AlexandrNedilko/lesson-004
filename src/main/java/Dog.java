/*Task3
* 3. Create a class Dog.
        The dog should have a name and an age (private).
        Create getters and setter for all the fields."
        1) When you will be creating setters - keep in mind that
        fields shouldn't be empty and age can't be less of equals to zero.*/
import java.util.Scanner;

public class Dog {
    private String name;
    private int age;

    public Dog() {
    }

    public String getName() {
        return name;
    }

    public boolean setName(String name) {
        if (name.equals("")) {
            return  false;
        } else {
            this.name = name;
            return true;
        }

    }

    public int getAge() {
        return age;
    }

    public boolean setAge(int age) {

        if (age < 0) {

            return  false;
        } else {
            this.age = age;
            return true;
        }
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dog Boby= new Dog();
        Boby.setAge(5);
       // Boby.setName("Tad");
        boolean b=true;
        do {
            System.out.println("Please enter Name of Dog...");

            String name = sc.nextLine();
            boolean tmp =Boby.setName(name);
            if (tmp) {
                b = false;
               // sc.close();
            } else {
                System.out.println("не может быть собака без имени, назовите как-то))");
            }
        } while (b);

        boolean b1=true;
        do {
            System.out.println("Please enter Age of Dog...");
             sc = new Scanner(System.in);
            int age = sc.nextInt();
            boolean tmp =Boby.setAge(age);
            if (tmp) {
                b1 = false;
                sc.close();
            } else {
                System.out.println("не может быть собака отрицательного возраста...))");
            }
        } while (b1);


        Boby.setAge(-22);
        System.out.println(Boby);

    }
}
