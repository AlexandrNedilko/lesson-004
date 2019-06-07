/*"1. Create a class ""Human"". A human should have the following attributes:
        weight, age, first name, last name, height."
        "1) Create a class Human with all the required fields to store the information (variable types you could choose by yourself).
2) Add to the class a constructor with parameters which initialize all the fields."*/



public class Task1Human {
    private  int weight;
    private int age;
    private String firstName;
    private String lastName;
    private int height;

    public Task1Human(int weight, int age, String firstName, String lastName, int height) {
        this.weight = weight;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    private void setWeight(int weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    private void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getHeight() {
        return height;
    }

    private void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Human{" +
                "weight=" + weight +
                ", age=" + age +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Task1Human kolya = new Task1Human(50,16,"Kolya","Yaryna",165);
        System.out.println(kolya);
    }
}
