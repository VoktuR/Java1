public class FoodBowl
{
    private int foodQuantity;

    public FoodBowl(int foodQuantity) {
        this.foodQuantity = foodQuantity;
    }

    public int getFoodQuantity() {
        return foodQuantity;
    }

    public void decreaseFoodQuantity(int eatenFood) {
        foodQuantity -= eatenFood;
    }

    public void increaseFoodQuantity(int newFood) {
        System.out.println("Adding food.. ");
        foodQuantity += newFood;
    }

    public void info() {
        System.out.println("Bowl contains: " + foodQuantity);
    }
}