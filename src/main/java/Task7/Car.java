package Task7;

public class Car extends Vehicle {
    protected String name;
    protected String model;
    protected String changingGears;
    protected boolean isON;



    public Car(String name, String model) {
        super();
        this.name = name;
        this.model = model;
        this.isON = false;
    }


    public String getChangingGears() {
        return changingGears;
    }

    public void setChangingGears(String changingGears) {
        this.changingGears = changingGears;
    }

    @Override
    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Car.steer():Steering at " + currentDirection + " degrees.");
    }

    public void setCurrentDirection(int currentDirection) {
        this.currentDirection = currentDirection;
    }

    public String isEngineOn() {
        if (isON) {
            return "Engine is ON";
        } else {
            return "Engine is OFF";
        }

    }

    public void startCarEngine( ) {
        isON = true;
    }
    public void stopCarEngine( ) {
        isON = false;
    }

    public void setVelocity(int velocity) {
        this.currentVelocity += velocity;
    }
}