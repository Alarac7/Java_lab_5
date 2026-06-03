import java.util.regex.*;

public class IP {
    public static void validateIP(String ip) {
        if (ip == null) {
            System.err.println("Ошибка: IP-адрес не может быть null.");
            return;
        }

        try {String zeroTo255 = "(25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)";
            String regex = "^(" + zeroTo255 + "\\.){3}" + zeroTo255 + "$";

            if (Pattern.matches(regex, ip)) {
                System.out.println("IP-адрес " + ip + " - КОРРЕКТНЫЙ.");
            } else {
                System.out.println("IP-адрес " + ip + " - НЕКОРРЕКТНЫЙ.");
            }
        } catch (Exception e) {
            System.err.println("Ошибка валидации IP: " + e.getMessage());
        }
    }

    static void main() {
        validateIP("192.168.0.1");
        validateIP("255.255.255.0");
        validateIP("256.100.50.0");
        validateIP("192.168.1");
    }
}
