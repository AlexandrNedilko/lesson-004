/*"1. Create a class ""Human"". A human should have the following attributes:
        weight, age, first name, last name, height."
        "1) Create a class Human with all the required fields to store the information (variable types you could choose by yourself).
2) Add to the class a constructor with parameters which initialize all the fields."*/

public class Task1 {
    private  int weight;
    private int age;
    private String firstName;
    private String lastName;
    private int height;

    public Task1(int weight, int age, String firstName, String lastName, int height) {
        this.weight = weight;
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
        this.height = height;
    }

}
