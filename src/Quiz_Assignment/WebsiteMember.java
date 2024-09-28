// İLAYDA KAPTAN 
// 200101023

package Quiz_Assignment;

import java.util.Scanner;

public class WebsiteMember {

    static String[] bilgiler = new String[7];

    public static boolean checkUsername(String data, String[] array) {
        for (String element : array) {
            if (element != null && element.equals(data)) {
                System.out.println("Bu kullanıcı adı zaten kullanılmakta, lütfen farklı bir kullanıcı adı seçiniz.");
                return false;
            }
        }
        return true;
    }

    public static boolean checkEmail(String data) {
        if (!data.matches(".+@[^@]+\\..+")) {
            System.out.println("Lütfen geçerli bir e-mail adresi giriniz: ");
            return false;
        }
        return true;
    }

    public static boolean checkPassword(String data) {
        if (data.length() < 6 || data.length() > 10) {
            System.out.println("Şifreniz en az 6, en fazla 10 karakter uzunluğunda olmalıdır: ");
            return false;
        }

        boolean hasLetter = false;
        boolean hasNumber = false;
        boolean hasSpecialChar = false;

        for (int j = 0; j < data.length(); j++) {
            char ch = data.charAt(j);

            if (Character.isLetter(ch)) {
                hasLetter = true;
            } else if (Character.isDigit(ch)) {
                hasNumber = true;
            } else if ("?!&{}\\/._-+*".indexOf(ch) != -1) {
                hasSpecialChar = true;
            }
        }

        if (!hasLetter || !hasNumber || !hasSpecialChar) {
            System.out.println("Şifrenizde en az 1 sayı, 1 özel karakter ve 2 harf bulunmalıdır: ");
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Sisteme kayıt olmak için gerekli bilgileri giriniz. "
                + "\nSistemden çıkış yapmak için q'ya basınız.");

        while (true) {
            System.out.println("\nName: ");
            bilgiler[0] = scanner.nextLine();

            if (bilgiler[0].equals("q")) {
                System.out.println("Sistemden çıkış yapılıyor...");
                break;
            }

            System.out.println("Surname: ");
            bilgiler[1] = scanner.nextLine();

            System.out.println("Username: ");
            String username;
            while (true) {
                username = scanner.nextLine();
                if (checkUsername(username, bilgiler)) {
                    break;
                }
            }
            bilgiler[2] = username;

            System.out.println("E-mail Address: ");
            while (true) {
                bilgiler[3] = scanner.nextLine();
                if (checkEmail(bilgiler[3])) {
                    break;
                }
            }

            System.out.println("Country: ");
            bilgiler[4] = scanner.nextLine();

            System.out.println("Education Level: ");
            bilgiler[5] = scanner.nextLine();

            System.out.println("Password: ");
            while (true) {
                bilgiler[6] = scanner.nextLine();
                if (checkPassword(bilgiler[6])) {
                    break;
                }
            }

            System.out.println("Yeni kişi kaydı açılıyor..."
                    + "\nSistemden çıkış yapmak için q'ya basınız.");
        }
    }
}
