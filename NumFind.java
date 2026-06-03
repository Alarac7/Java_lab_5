import java.util.regex.*;

public class NumFind {
    public static void findAndPrintNumbers(String text) {
        if (text == null || text.trim().isEmpty()) {
            System.err.println("Ошибка: Передан пустой текст или null.");
            return;
        }
        try {
            String regex = "-?\\d+([.,]\\d+)?";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            boolean found = false;
            System.out.println("Поиск чисел в тексте: \"" + text + "\"");

            while (matcher.find()) {
                System.out.println("Найдено число: " + matcher.group());
                found = true;
            }

            if (!found) {
                System.out.println("Числа в тексте не найдены.");
            }
            System.out.println("\n");
        } catch (PatternSyntaxException e) {
            System.err.println("Ошибка в синтаксисе регулярного выражения: " + e.getDescription());
        } catch (Exception e) {
            System.err.println("Произошла непредвиденная ошибка: " + e.getMessage());
        }
    }

    static void main() {
        String text1 = "Цена продукта $19.99, скидка составляет -5 процентов. В наличии 100 штук, вес 2,5 кг.";
        findAndPrintNumbers(text1);

        String text2 = "Здесь нет никаких цифр, только буквы.";
        findAndPrintNumbers(text2);

        findAndPrintNumbers(null);
    }
}
