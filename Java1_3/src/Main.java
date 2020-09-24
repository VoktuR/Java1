import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // 1
        System.out.println("Приветствую");
        System.out.println("Угадайте число от 0 до 9");
        System.out.println("У вас 3 попытки, удачи");
        guessTheNumber();
        restartGuessTheNumber();

        // 2
        System.out.println("С числами закончили");
        System.out.println("Теперь угадайте слово");
        System.out.println("Вводите свой вариант слова");
        System.out.println("Совпадающие буквы будут отображены, удачи");
        guessTheWord();
    }

    // 1
    static void guessTheNumber() {
        System.out.println("Можете приступать");
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int secretNumber = rnd.nextInt(10);
        for (int tryCounter = 0; tryCounter < 3; tryCounter++) {
            int userNumber = scan.nextInt();
            if (userNumber == secretNumber) {
                System.out.println("Поздравляю, вы победили");
                break;
            } else if (userNumber < secretNumber) {
                System.out.println("Загаданное число больше");
            } else {
                System.out.println("Загаданное число меньше");
            }
            if (tryCounter == 2) System.out.println("Вы проиграли");
        }
    }
    static void restartGuessTheNumber () {
        Scanner scan = new Scanner(System.in);
        int restart;
        do {
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет");
            restart = scan.nextInt();
            switch (restart) {
                case 0: {
                    System.out.println("Игра окончена, перейдем далее");
                    break;
                }
                case 1: {
                    System.out.println("Игра перезапущена...");
                    guessTheNumber();
                        break;
                }
                default: {
                    System.out.println("Некорректное значение, повторите ввод");
                    break;
                }
            }
        } while (restart != 0);
    }

    // 2
    static void guessTheWord () {
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot",
                "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive",
                "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};

        int numberOfWord = rnd.nextInt(words.length);
        String word = words[numberOfWord];
        for (int i = word.length(); i < 15; i++) {
            word = word.concat("#");
        }

        char[] lettersOfWord = new char[15];
        for (int i = 0; i < lettersOfWord.length - 1; i++) {
            lettersOfWord[i] = '#';
        }

        while (true) {
            String userWord = scan.nextLine();
            for (int i = userWord.length(); i < 15; i++) {
                userWord = userWord.concat("#");
            }
            if (userWord.equals(word)) {
                System.out.println("Поздравляю, вы угадали слово, до свидания");
                break;
            }
            for (int i = 0; i < word.length(); i++) {
                if (userWord.charAt(i) == word.charAt(i)) {
                    lettersOfWord[i] = word.charAt(i);
                }
                System.out.print(lettersOfWord[i]);
            }
            System.out.println();
        }
    }
}
