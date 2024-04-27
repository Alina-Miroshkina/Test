import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите первое слово: ");
        String word1 = scanner.nextLine();

        System.out.print("Введите второе слово: ");
        String word2 = scanner.nextLine();

        if (word1.length() % 2 != 0 || word2.length() % 2 != 0) {
            System.out.println("Оба слова должны иметь четное количество букв.");
            return;
        }

        String firstHalfWord1 = word1.substring(0, word1.length() / 2);
        String secondHalfWord2 = word2.substring(word2.length() / 2);

        String combinedWord = firstHalfWord1 + secondHalfWord2;

        System.out.println("Объединенное слово: " + combinedWord);
    }
}
