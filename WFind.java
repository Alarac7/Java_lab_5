import java.util.regex.*;

public class WFind {
    public static void findWords(String text, char targetLetter) {
        if (text == null || text.trim().isEmpty()) {
            System.err.println("Ошибка: Текст пуст или равен null.");
            return;
        }
        if (!Character.isLetter(targetLetter)) {
            System.err.println("Ошибка: Переданный символ '" + targetLetter + "' не является буквой.");
            return;
        }

        try {
            String regex = "(?iU)\\b" + Pattern.quote(String.valueOf(targetLetter)) + "\\p{L}*\\b";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            System.out.println("Слова, начинающиеся на букву '" + targetLetter + "':");
            boolean found = false;

            while (matcher.find()) {
                System.out.println("- " + matcher.group());
                found = true;
            }

            if (!found) {
                System.out.println("Слов на такую букву не найдено.");
            }

        } catch (PatternSyntaxException e) {
            System.err.println("Ошибка формирования Regex: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Ошибка при поиске слов: " + e.getMessage());
        }
    }

    static void main() {
        String text = "Аня и Андрей ели арбуз. Кот смотрел на них из окна, а на столе лежала Азбука.";
        findWords(text, 'а');
        System.out.println("\n");
        findWords(text, 'я');
        System.out.println("\n");
        findWords(null, 'к');
    }
}
