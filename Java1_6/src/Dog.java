public class Dog extends Animal {

    public Dog(int runDistanceLengthLimit, int swimDistanceLengthLimit, double jumpHeightLimit) {
        super.runDistanceLengthLimit = runDistanceLengthLimit;
        super.swimDistanceLengthLimit = swimDistanceLengthLimit;
        super.jumpHeightLimit = jumpHeightLimit;
    }


    @Override
    public void run(int runDistanceLength) {
        if (runDistanceLength <= super.runDistanceLengthLimit) System.out.println("run: true");
        else System.out.println("run: false");
    }
    @Override
    public void swim(int swimDistanceLength) {
        if (swimDistanceLength <= super.swimDistanceLengthLimit) System.out.println("swim: true");
        else System.out.println("swim: false");
    }
    @Override
    public void jump(double jumpHeight) {
        if (jumpHeight <= super.jumpHeightLimit) System.out.println("jump: true");
        else System.out.println("jump: false");
    }

    @Override
    public String toString() {
        return "Dog: { " +
                "runDistanceLengthLimit = " + super.runDistanceLengthLimit +
                ", swimDistanceLengthLimit = " + super.swimDistanceLengthLimit +
                ", jumpHeightLimit = " + super.jumpHeightLimit +
                " }";
    }
}
