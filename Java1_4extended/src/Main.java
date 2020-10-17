import java.util.Random;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);
    static Random random = new Random();
    static int size = chooseGameFieldSize();
    static char[][] field = generateField(size);

    public static void main(String[] args) {
        playGame();
    }

    static int chooseGameFieldSize() {
        System.out.println("Выберите размер поля для игры (общую длину сторон)");
        return scanner.nextInt();
    }

    static char[][] generateField(int size) {
        char[][] generatedField = new char[size][size];
        for (int i = 0; i < generatedField.length; i++) {
            for (int j = 0; j < generatedField[i].length; j++) {
                generatedField[i][j] = '-';
            }
        }
        return generatedField;
    }

    static void drawField() {
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                System.out.print(field[i][j]);
            }
            System.out.println();
        }
    }

    static int getCoordinate(char coordinateName) {
        int coordinate;
        do {
            System.out.println(String.format("Введите координату: %s (1 - %o)", coordinateName, size));
            coordinate = scanner.nextInt() - 1;
        } while (coordinate < 0 || coordinate > size);
        return coordinate;
    }

    static void makePlayerTurn() {
        int x, y;
        do {
            x = getCoordinate('X');
            y = getCoordinate('Y');
        } while (field[x][y] != '-');
        field[x][y] = 'X';
    }

    static void makeAITurn() {
        int x, y;
        do {
            x = random.nextInt(size);
            y = random.nextInt(size);
        } while (field[x][y] != '-');
        field[x][y] = 'O';
    }

    static boolean drawCheck() {
        int token = 0;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if (field[i][j] == '-') {
                    token++;
                }
            }
        }
        if (token == 0) {
            return true;
        }
        return false;
    }

    static boolean winCheck(char sign) {
        //Горизонталь
        for (int i = 0; i < field.length; i++) {
            boolean tempHorizontal = false;
            int tempHorizontalCounter = size;
            for (int j = 0; j < field[i].length; j++) {
                if ((field[i][0] == sign) && (field[i][j] == field[i][0])) {
                    tempHorizontalCounter--;
                }
                tempHorizontal = (tempHorizontalCounter == 0);
            }
            if (tempHorizontal) {
                return true;
            }
        }

        //Вертикаль
        for (int i = 0; i < field.length; i++) {
            boolean tempVertical = false;
            int tempVerticalCounter = size;
            for (int j = 0; j < field[i].length; j++) {
                if ((field[j][i] == sign) && (field[j][i] == field[0][i])) {
                    tempVerticalCounter--;
                }
                tempVertical = (tempVerticalCounter == 0);
            }
            if (tempVertical) {
                return true;
            }
        }

        //Диагональ
        int tempDiagonal = size;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if ((i == j) && (field[i][j] == sign)) {
                    tempDiagonal--;
                }
            }
        }
        if (tempDiagonal == 0) {
            return true;
        }

        //Обратная диагональ
        int tempSecondDiagonal = size;
        for (int i = 0; i < field.length; i++) {
            for (int j = 0; j < field[i].length; j++) {
                if ((i + j == field.length - 1) && (field[i][j] == sign)) {
                    tempSecondDiagonal--;
                }
            }
        }
        if (tempSecondDiagonal == 0) {
            return true;
        }

        return false;
    }

    static boolean endGameCheck(char sign) {
        if (winCheck(sign)) {
            String name = sign == 'X' ? "Игрок" : "Компьютер";
            System.out.println(String.format("%s победил", name));
            return true;
        }
        if (drawCheck()) {
            System.out.println("Ничья");
            return true;
        }
        return false;
    }

    static void playGame() {
        drawField();
        do {
            makePlayerTurn();
            if (endGameCheck('X')) {
                break;
            }
            makeAITurn();
            if (endGameCheck('O')) {
                break;
            }
            drawField();
        } while (true);
        System.out.println("Финальный расклад: ");
        drawField();
    }
}
