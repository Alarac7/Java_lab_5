import java.util.regex.*;

public class PassOk {
    public static void validatePassword(String password) {
        if (password == null) {
            System.err.println("Ошибка: Пароль не может быть null.");
            return;
        }

        try {
            String regex = "^(?=.*[A-Z])(?=.*\\d)[A-Za-z0-9]{8,16}$";

            if (Pattern.matches(regex, password)) {
                System.out.println("Пароль '" + password + "' корректен.");
            } else {
                System.out.println("Пароль '" + password + "' НЕ соответствует требованиям.");
            }
        } catch (Exception e) {
            System.err.println("Ошибка при проверке пароля: " + e.getMessage());
        }
    }

    static void main() {
        validatePassword("SecurePswd123");
        validatePassword("weak123");
        validatePassword("Numb3rs!_");
    }
}
