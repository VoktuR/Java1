public class Main {

    public static void main(String[] args) {

        Cat[] cats = {
                new Cat("Cat one", 20),
                new Cat("Cat two", 30),
                new Cat("Cat three", 40),
                new Cat("Cat four", 50)
        };
        FoodBowl bowl1 = new FoodBowl(50);

        bowl1.info();
        bowl1.increaseFoodQuantity(50);
        bowl1.info();

        System.out.println("----------------------------------------");

        for (Cat cat : cats) {
            System.out.println(String.format("%s is eating..", cat.getName()));
            cat.eat(bowl1);
            bowl1.info();
        }

        System.out.println("----------------------------------------");

        for (Cat cat : cats) {
            System.out.println(String.format("Is %s fed:  %b", cat.getName(), cat.getIsFed()));
        }

    }
}
