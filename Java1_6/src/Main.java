import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rnd = new Random();

        Animal[] animals = {
                new Cat(150 + rnd.nextInt(100),  1.75 + rnd.nextDouble()),
                new Cat(150 + rnd.nextInt(100),  1.75 + rnd.nextDouble()),
                new Dog(400 + rnd.nextInt(200), 7 + rnd.nextInt(5), 0.25 + rnd.nextDouble()),
                new Dog(400 + rnd.nextInt(200), 7 + rnd.nextInt(5), 0.25 + rnd.nextDouble())
        };

        System.out.println(animals[0].toString());
        animals[0].run(150);
        animals[0].jump(2);

        System.out.println(animals[1].toString());
        animals[1].run(300);
        animals[1].swim(4);

        System.out.println(animals[2].toString());
        animals[2].swim(10);
        animals[2].jump(3);

        System.out.println(animals[3].toString());
        animals[3].run(500);
        animals[3].jump(1);

    }
}
