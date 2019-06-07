/*Task2
2. Implement the method fight() depending on weight, strength and age of the boxer:
        You should write dependency by yourself. The method should return true or false if our boxer won or lost.
        1) if ourBoxer.fight(anotherBoxer) returns true, then anotherBoxer.fight(outBoxer) should return false;*/

public class Boxer {
    public String name;
    public int age;
    public int weight;
    public int strength;

    public Boxer(int age, int weight, int strength, String name) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.strength = strength;
    }

    public boolean fight(Boxer anotherBoxer) {
        // write your code here
        if (this.weight > anotherBoxer.weight) {
            return true;
        } else return false;

    }

    public static void main(String[] args) {
        Boxer boxer1 = new Boxer(25, 58, 183, "Anton");
        Boxer boxer2 = new Boxer(22, 75, 182, "Vasya");
        boolean winnerFirstBoxer = boxer1.fight(boxer2);
        if (winnerFirstBoxer) {
            System.out.println("Win "+ boxer1.name);
        } else {
            System.out.println("Win  "+ boxer2.name);
        }
    }
}