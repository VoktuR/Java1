public class Main {

    public static void main(String[] args) {

        // 1
        int[] inverseArray = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        showArray(inverseArray);
        for (int i = 0; i < inverseArray.length; i++) {
            if (inverseArray[i] == 0) {
                inverseArray[i] = 1;
            } else {
                inverseArray[i] = 0;
            }
        }
        showArray(inverseArray);
        System.out.println();

        // 2
        int[] arrayOfEightNumbers = new int[8];
        for (int i = 1; i < arrayOfEightNumbers.length; i++) {
            arrayOfEightNumbers[i] = arrayOfEightNumbers[i - 1] + 3;
        }
        showArray(arrayOfEightNumbers);
        System.out.println();

        // 3
        int[] multipliedArray = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        showArray(multipliedArray);
        for (int i = 0; i < multipliedArray.length; i++) {
            if (multipliedArray[i] < 6) {
                multipliedArray[i] *= 2;
            }
        }
        showArray(multipliedArray);
        System.out.println();

        // 4
        int[][] diagonalArray = new int[5][5];
        for (int i = 0; i < diagonalArray.length; i++) {
            for (int j = 0; j < diagonalArray.length; j++) {
                if (i == j) {
                    diagonalArray[i][j] = 1;
                }
            }
        }
        showArray(diagonalArray);
        System.out.println();

        // 5
        int min, max;
        int[] randomArray = new int[10];
        for (int i = 0; i < randomArray.length; i++) {
            randomArray[i] = (int) (Math.random() * 10);
        }
        showArray(randomArray);
        min = randomArray[0];
        max = randomArray[0];
        for (int i = 1; i < randomArray.length; i++) {
            if (randomArray[i] < min) {
                min = randomArray[i];
            }
            if (randomArray[i] > max) {
                 max = randomArray[i];
            }
        }
        System.out.println("Максимальное число в массиве: " + max + ", минимальное число в массиве " + min);
        System.out.println();

        // 6
        int[] testStaticArray = {5, 3, 2, 2, 1, 8, 1, 3, 1};
        boolean result = checkBalance(testStaticArray);
        System.out.println(result);
        System.out.println();

        //7
        int[] shiftedArray = {5, 3, 2, 2, 1, 8, 1, 3, 1};
        showArray(shiftedArray);
        shiftedArray = pushArrayElements(testStaticArray, -3);
        showArray(shiftedArray);
    }

    // 6
    static boolean checkBalance(int[] arr) {
        int leftSum, rightSum;
        leftSum = arr[0];
        rightSum = arr[arr.length - 1];
        int i = 0;
        int j = arr.length - 1;
        do {
            if (leftSum <= rightSum) {
                i++;
                leftSum += arr[i];
            }
            else {
                j--;
                rightSum += arr[j];
            }
        }
        while (i != (j - 1));
            if (leftSum == rightSum) {
                return true;
            }
            return false;
    }

    // 7
    static int[] pushArrayElements(int[] arr, int n) {
        int temp;
        if (n > 0) {
            while (n != 0) {
                temp = arr[arr.length - 1];
                for (int i = arr.length - 2; i >= 0; i--) {
                    arr[i + 1] = arr[i];
                }
                arr[0] = temp;
                n--;
            }
        }
        else if (n < 0) {
            while (n != 0) {
                temp = arr[0];
                for (int i = 0; i < arr.length - 1; i++) {
                    arr[i] = arr[i + 1];
                }
                arr[arr.length - 1] = temp;
                n++;
            }
        }
        return arr;
    }

    //Для удобного вывода
    static void showArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static void showArray(int[][] arr) {
        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
