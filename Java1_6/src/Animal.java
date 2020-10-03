public abstract class Animal {

    protected int runDistanceLengthLimit;
    protected int swimDistanceLengthLimit;
    protected double jumpHeightLimit;

    public abstract void run(int distanceLength);

    public abstract void swim(int distanceLength);

    public abstract void jump(double barrierHeight);

}
