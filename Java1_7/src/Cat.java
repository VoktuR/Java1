public class Cat {
    private String name;
    private int appetite;
    private boolean isFed;

    protected Cat(String name, int appetit) {
        this.name = name;
        this.appetite = appetit;
    }

    public String getName() {
        return name;
    }

    public boolean getIsFed() {
        return isFed;
    }

    protected void eat(FoodBowl bowl) {
        if (bowl.getFoodQuantity() < appetite) {
            System.out.println("There is not enough food, add some first");
            return;
        }
        else {
            bowl.decreaseFoodQuantity(appetite);
            isFed = true;
        }
    }
}