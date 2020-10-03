public class Cat extends Animal {

    public Cat(int runDistanceLengthLimit, double jumpHeightLimit) {
        super.runDistanceLengthLimit = runDistanceLengthLimit;
        super.jumpHeightLimit = jumpHeightLimit;
    }


    @Override
    public void run(int runDistanceLength) {
        if (runDistanceLength <= super.runDistanceLengthLimit) System.out.println("run: true");
        else System.out.println("run: false");
    }
    @Override
    public void swim(int swimDistanceLength) {
        System.out.println("swim: false (sorry, cant do it, im afraid of water)");
    }
    @Override
    public void jump(double jumpHeight) {
        if (jumpHeight <= super.jumpHeightLimit) System.out.println("jump: true");
        else System.out.println("jump: false");
    }


    @Override
    public String toString() {
        return "Cat: { " +
                "runDistanceLengthLimit = " + super.runDistanceLengthLimit +
                ", jumpHeightLimit = " + super.jumpHeightLimit +
                " }";
    }
}
