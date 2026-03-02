public class Main {
    public static void main(String[] args) {
        int[] A = new int[20];
        int sum = 0;

        for (int i = 0; i < 20; i++) {
            A[i] = (int)(Math.random() * 40 - 20); // от -20 до 20
            System.out.print(A[i] + " ");
            if (A[i] < 0) {
                sum += A[i];
            }
        }

        System.out.println("\nСумма отрицательных элементов: " + sum);
    }
}
public class Main {
    public static void main(String[] args) {
        int[] B = new int[15];
        int sum = 0;

        for (int i = 0; i < 15; i++) {
            B[i] = (int)(Math.random() * 40 - 20);
            System.out.print(B[i] + " ");
            if (B[i] > 0) {
                sum += B[i];
            }
        }

        System.out.println("\nСумма положительных элементов: " + sum);
    }
}
public class Main {
    public static void main(String[] args) {
        double[] A = new double[12];
        double product = 1;

        for (int i = 0; i < 12; i++) {
            A[i] = Math.random() * 20 - 10;
            System.out.print(A[i] + " ");
            if (A[i] < 0) {
                product *= A[i];
            }
        }

        System.out.println("\nПроизведение отрицательных: " + product);
    }
}
public class Task5 Main {
    public static void main(String[] args) {
        double[] D = new double[17];
        double sum = 0;

        for (int i = 0; i < 17; i++) {
            D[i] = Math.random() * 100;
            System.out.print(D[i] + " ");
            sum += D[i];
        }

        double avg = sum / 17;
        System.out.println("\nСреднее арифметическое: " + avg);
    }
}
public class Main {
    public static void main(String[] args) {
        int[][] A = new int[10][10];
        int[] B = new int[10];

        for (int i = 0; i < 10; i++) {
            int sum = 0;
            for (int j = 0; j < 10; j++) {
                A[i][j] = (int)(Math.random() * 40 - 20);
                System.out.print(A[i][j] + " ");
                if (A[i][j] < 0) {
                    sum += A[i][j];
                }
            }
            B[i] = sum;
            System.out.println(" | Сумма отрицательных строки = " + B[i]);
        }

    }
}
public class main {
    public static void main(String[] args) {
        int[] A = new int[25];

        for (int i = 0; i < 25; i++) {
            A[i] = (int)(Math.random() * 100);
            System.out.print(A[i] + " ");
        }

        int min = 0, max = 0;

        for (int i = 1; i < 25; i++) {
            if (A[i] < A[min]) min = i;
            if (A[i] > A[max]) max = i;
        }

        int temp = A[min];
        A[min] = A[max];
        A[max] = temp;

        System.out.println("\nПосле обмена:");
        for (int i = 0; i < 25; i++) {
            System.out.print(A[i] + " ");
        }
    }
}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] B = new int[25];

        for (int i = 0; i < 25; i++) {
            B[i] = (int)(Math.random() * 100);
        }

        Arrays.sort(B);

        System.out.println("Отсортированный массив:");
        for (int x : B) {
            System.out.print(x + " ");
        }
    }
}
public class main{
    public static void main (String[] args) {
        int[][] a = new int[3][5];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                a[i][j] = (int)(Math.random() * 10);
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public static short maxX() {
    short[] array = new short[10];
    short max;

    for (int i = 0; i < 10; i++) {
        array[i] = (short)Math.round(50 * Math.random());
        System.out.print(array[i] + ", ");
    }

    max = array[0];

    for (int i = 1; i < 10; i++) {
        if (array[i] > max) {
            max = array[i];
        }
    }

    return max;
}

void main() {
}



