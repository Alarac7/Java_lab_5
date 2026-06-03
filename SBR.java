public class SBR {
    public static void highlight(String text) {
        if (text == null || text.isEmpty()) {
            System.err.println("Ошибка: Текст пуст или равен null.");
            return;
        }

        try {
            String regex = "\\p{Ll}\\p{Lu}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(text);

            String result = matcher.replaceAll("!$0!");

            System.out.println("Исходный текст: " + text);
            System.out.println("Результат:      " + result);

        } catch (PatternSyntaxException e) {
            System.err.println("Ошибка синтаксиса Regex: " + e.getMessage());
        } catch (Exception e) {
            System.err.println("Непредвиденная ошибка: " + e.getMessage());
        }
    }

    static void main() {
        highlight("В этом тексте есть слово javaScript и iPhone.");
    }
}
