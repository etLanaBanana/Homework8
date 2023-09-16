import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите действие: \n1.зашифровать текст.\n2.разшифровать текс.");
        int number = scanner.nextInt();
        if (number==1) {
            zashifrovka();
        } else if (number==2) {
            razshifrovka();
        } else {
            System.out.println("Вы что-то неправильно ввели, выберите цифру 1 или 2");
        }


    }
    public static void zashifrovka() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст, который хотите зашифровать");
        String text = scanner.nextLine();
        System.out.println("Введите ключ");
        int key = scanner.nextInt();
        char[] shifr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
                shifr[i] = (char) ((int)(text.charAt(i)) + key);
            }
            System.out.println(shifr);
    }
    public static void razshifrovka() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите текст, который хотите разшифровать");
        String text = scanner.nextLine();
        System.out.println("Введите ключ");
        int key = scanner.nextInt();
        char[] shifr = new char[text.length()];
        for (int i = 0; i < text.length(); i++) {
            shifr[i] = (char) ((int)(text.charAt(i)) - key);
        }
        System.out.println(shifr);
    }
}