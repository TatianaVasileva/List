import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        List<String> basket = new ArrayList<>();

        while (true) {
            System.out.println("Выберите операцию:" +
                    "1 Добавить " +
                    "2 Показать " +
                    "3 Удалить ");
            String operation = scanner.next();

            switch (operation) {
                case ("1"): {
                    System.out.println("Какую покупку хотите добавить?");
                    String purchase = scanner.next();
                    basket.add(purchase);
                    System.out.println("Итого в списке покупок: " + basket.size());
                    break;
                }
                case ("2"): {
                    allPurchases(basket);

                    break;
                }

                case ("3"): {
                    allPurchases(basket);
                    System.out.println("Какую покупку хотите удалить: введите номер или название ");
                    String numberOrName = scanner.next();
                    try {
                        int number = Integer.parseInt(numberOrName);
                        basket.remove(number - 1);
                    } catch (NumberFormatException e) {
                        basket.remove(numberOrName);
                    }
                    break;
                }
            }
        }
    }
    private static void allPurchases(List<String> basket) {
        int count = 1;
        System.out.println("Список покупок");
        for (String purchase : basket) {
            System.out.println(" " + count + purchase);
            count++;
        }
    }
}