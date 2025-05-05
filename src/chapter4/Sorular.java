package chapter4;


import java.util.Scanner;

public class Sorular {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


    }
    static void pentagonCoordinates() {
        System.out.print("Enter the radius of the bounding circle: ");
        double radius = sc.nextDouble();
        double angle = Math.PI / 5; // 360 dereceyi 5'e böldük
        System.out.println("The coordinates of five points on the pentagon are:");
        for (int i = 0; i < 5; i++) {
            double x = radius * Math.cos(i * angle);
            double y = radius * Math.sin(i * angle);
            System.out.printf("(%f, %f)\n", x, y);
        }
    }
    // 4.14 Harf notunu sayısal değere çevir
    static void convertLetterGradeToNumber() {
        System.out.print("Enter a letter grade (A, B, C, D, or F): ");
        char grade = sc.next().charAt(0);
        switch (Character.toUpperCase(grade)) {
            case 'A': System.out.println("The numeric value for grade A is 4"); break;
            case 'B': System.out.println("The numeric value for grade B is 3"); break;
            case 'C': System.out.println("The numeric value for grade C is 2"); break;
            case 'D': System.out.println("The numeric value for grade D is 1"); break;
            case 'F': System.out.println("The numeric value for grade F is 0"); break;
            default: System.out.println(grade + " is an invalid grade"); break;
        }
    }

    // 4.15 Telefon tuş takımına göre harfi sayıya dönüştür
    static void phoneKeyPad() {
        System.out.print("Enter a letter: ");
        char letter = sc.next().charAt(0);
        if (Character.isLetter(letter)) {
            letter = Character.toUpperCase(letter);
            int number = (letter - 'A') / 3 + 2; // A-B-C = 2, D-E-F = 3 gibi
            if (letter == 'S' || letter == 'T' || letter == 'U' || letter == 'V') number = 8;
            if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z') number = 9;
            System.out.println("The corresponding number is " + number);
        } else {
            System.out.println(letter + " is an invalid input");
        }
    }

    // 4.16 Rastgele bir büyük harf göster
    static void randomCharacter() {
        char randomChar = (char) ('A' + Math.random() * 26);
        System.out.println("The random uppercase letter is " + randomChar);
    }

    // 4.17 Bir yıl ve ay ismi girilerek ayın gün sayısı hesaplanır
    static void daysOfMonth() {
        System.out.print("Enter a year: ");
        int year = sc.nextInt();
        System.out.print("Enter a month: ");
        String month = sc.next();
        int days = 0;

        switch (month.toLowerCase()) {
            case "jan": case "mar": case "may": case "jul": case "aug": case "oct": case "dec":
                days = 31; break;
            case "apr": case "jun": case "sep": case "nov":
                days = 30; break;
            case "feb":
                days = (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) ? 29 : 28; break;
            default:
                System.out.println(month + " is an invalid month");
                return;
        }

        System.out.println(month + " " + year + " has " + days + " days");
    }

    // 4.18 Öğrencinin bölümü ve durumu
    static void studentMajorAndStatus() {
        System.out.print("Enter two characters: ");
        String input = sc.next();
        if (input.length() == 2) {
            char major = input.charAt(0);
            char status = input.charAt(1);

            String majorName = "";
            switch (major) {
                case 'M': majorName = "Mathematics"; break;
                case 'C': majorName = "Computer Science"; break;
                case 'I': majorName = "Information Technology"; break;
                default:
                    System.out.println("Invalid input");
                    return;
            }

            String statusName = "";
            switch (status) {
                case '1': statusName = "Freshman"; break;
                case '2': statusName = "Sophomore"; break;
                case '3': statusName = "Junior"; break;
                case '4': statusName = "Senior"; break;
                default:
                    System.out.println("Invalid input");
                    return;
            }

            System.out.println(majorName + " " + statusName);
        } else {
            System.out.println("Invalid input");
        }
    }

    // 4.19 ISBN kontrolü
    static void checkISBN() {
        // Bu kısmı basitleştirdim çünkü 3.9 sorusunun detayına girmiyoruz.
        System.out.println("This exercise is about checking ISBN-10 format, implement your logic here.");
    }

    // 4.20 String'in uzunluğunu ve ilk karakterini göster
    static void processString() {
        System.out.print("Enter a string: ");
        String s = sc.next();
        System.out.println("Length of string: " + s.length());
        System.out.println("First character: " + s.charAt(0));
    }

    // 4.21 SSN (Social Security Number) kontrolü
    static void checkSSN() {
        System.out.print("Enter a SSN: ");
        String ssn = sc.next();
        if (ssn.matches("\\d{3}-\\d{2}-\\d{4}")) {
            System.out.println(ssn + " is a valid social security number");
        } else {
            System.out.println(ssn + " is an invalid social security number");
        }
    }

    // 4.22 Substring kontrolü
    static void checkSubstring() {
        System.out.print("Enter string s1: ");
        String s1 = sc.next();
        System.out.print("Enter string s2: ");
        String s2 = sc.next();

        if (s1.contains(s2)) {
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }
    }

    // 4.8 ASCII kodunu karaktere dönüştür
    static void asciiToCharacter() {
        System.out.print("Enter an ASCII code: ");
        int asciiCode = sc.nextInt();
        if (asciiCode >= 0 && asciiCode <= 127) {
            char character = (char) asciiCode;
            System.out.println("The character for ASCII code " + asciiCode + " is " + character);
        } else {
            System.out.println(asciiCode + " is an invalid input");
        }
    }

    // 4.9 Karakterin Unicode değeri
    static void characterToUnicode() {
        System.out.print("Enter a character: ");
        char character = sc.next().charAt(0);
        int unicode = (int) character;
        System.out.println("The Unicode for the character " + character + " is " + unicode);
    }

    // 4.10 Doğum günü tahminini Y/N ile al
    static void guessBirthday() {
        System.out.println("Guess your birthday!");
        System.out.print("Is the month January, February, March, or April? (Y/N): ");
        char answer = sc.next().charAt(0);
        if (answer == 'Y' || answer == 'y') {
            System.out.println("You are born in one of the first four months!");
        } else {
            System.out.println("You are born after April!");
        }
    }

    // 4.11 Decimal'den Hex'e dönüşüm
    static void decimalToHex() {
        System.out.print("Enter a decimal value (0 to 15): ");
        int decimalValue = sc.nextInt();
        if (decimalValue >= 0 && decimalValue <= 15) {
            System.out.println("The hex value is " + Integer.toHexString(decimalValue).toUpperCase());
        } else {
            System.out.println(decimalValue + " is an invalid input");
        }
    }

    // 4.12 Hex'ten Binary'ye dönüşüm
    static void hexToBinary() {
        System.out.print("Enter a hex digit: ");
        char hexDigit = sc.next().charAt(0);
        if (Character.isDigit(hexDigit)) {
            int decimalValue = Character.digit(hexDigit, 16);
            String binary = Integer.toBinaryString(decimalValue);
            System.out.println("The binary value is " + binary);
        } else {
            System.out.println(hexDigit + " is an invalid input");
        }
    }

    // 4.13 Vokal veya sessiz harf kontrolü
    static void vowelOrConsonant() {
        System.out.print("Enter a letter: ");
        char letter = sc.next().charAt(0);
        if (Character.isLetter(letter)) {
            char lowerLetter = Character.toLowerCase(letter);
            if (lowerLetter == 'a' || lowerLetter == 'e' || lowerLetter == 'i' || lowerLetter == 'o' || lowerLetter == 'u') {
                System.out.println(letter + " is a vowel");
            } else {
                System.out.println(letter + " is a consonant");
            }
        } else {
            System.out.println(letter + " is an invalid input");
        }
    }
    static void RegularPolygonArea(){
        System.out.print("Enter the number of sides: ");
        int n = sc.nextInt();

        System.out.print("Enter the side: ");
        double s = sc.nextDouble();

        double area = (n * s * s) / (4 * Math.tan(Math.PI / n));

        System.out.printf("The area of the polygon is %.14f\n", area);
    }
    static void altigeninAlani(){
        System.out.print("Enter the side: ");
        double s = sc.nextDouble();

        double area = (6 * s * s) / (4 * Math.tan(Math.PI / 6));

        System.out.printf("The area of the hexagon is %.2f\n", area);
    }
    static void greatCircleDistance(){
        System.out.print("Enter point 1 (latitude and longitude) in degrees: ");
        double x1 = Math.toRadians(sc.nextDouble());
        double y1 = Math.toRadians(sc.nextDouble());

        System.out.print("Enter point 2 (latitude and longitude) in degrees: ");
        double x2 = Math.toRadians(sc.nextDouble());
        double y2 = Math.toRadians(sc.nextDouble());

        // Hesapla
        double radius = 6371.01;
        double d = radius * Math.acos(
                Math.sin(x1) * Math.sin(x2) +
                        Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2)
        );

        // Sonucu yazdır
        System.out.println("The distance between the two points is " + d + " km");
    }
    static void besgeninAlani(){
        System.out.print("Enter the length from the center to a vertex: ");
        double r = sc.nextDouble();
        double s = 2 * r * Math.sin(Math.PI / 5);
        double area = (5 * s * s) / (4 * Math.tan(Math.PI / 5));
        System.out.printf("The area of the pentagon is %.2f\n", area);
    }

    static void asciiKodlariVeKarakterler() {
        // Karakterlerin ASCII değerleri
        System.out.println("'1' ASCII = " + (int)'1');
        System.out.println("'A' ASCII = " + (int)'A');
        System.out.println("'B' ASCII = " + (int)'B');
        System.out.println("'a' ASCII = " + (int)'a');
        System.out.println("'b' ASCII = " + (int)'b');

        // Sayıların karakter karşılıkları
        System.out.println("40 = " + (char)40);
        System.out.println("59 = " + (char)59);
        System.out.println("79 = " + (char)79);
        System.out.println("85 = " + (char)85);
        System.out.println("90 = " + (char)90);

        // Hexadecimal (onaltılık) sayıların karakter karşılığı
        System.out.println("0x40 = " + (char)0x40);
        System.out.println("0x5A = " + (char)0x5A);
        System.out.println("0x71 = " + (char)0x71);
        System.out.println("0x72 = " + (char)0x72);
        System.out.println("0x7A = " + (char)0x7A);
    }

    static void karakterLiteralKontrolu() {
        // Geçerli karakter literal’leri
        char c1 = '1';          // geçerli
        // char c2 = '\u345dE'; // geçersiz çünkü fazla karakter
        char c3 = '\u3FFA';     // geçerli Unicode
        char c4 = '\b';         // geçerli backspace karakteri
        char c5 = '\t';         // geçerli tab karakteri

        System.out.println("Geçerli karakter literal’leri: " + c1 + " " + c3 + " " + c4 + " " + c5);
    }

    static void tersTersKarakterYazdirma() {
        System.out.println("Ters bölü: \\");
        System.out.println("Çift tırnak: \"");
    }

    static void karakterAritmetikIslemler() {
        int sayi1 = '1'; // ASCII = 49
        int sayi2 = '1' + '2' * ('4' - '3') + 'b' / 'a'; // 49 + 50 * (52-51) + 98/97
        int sayi3 = 'a'; // ASCII = 97
        char karakter = 90; // ASCII 90 = 'Z'

        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
        System.out.println("sayi3 = " + sayi3);
        System.out.println("karakter = " + karakter);
    }

    static void tipDonusumleri() {
        char karakter = 'A';
        int sayi1 = (int) karakter;

        float ondalikSayi1 = 1000.34f;
        int sayi2 = (int) ondalikSayi1;

        double ondalikSayi2 = 1000.34;
        int sayi3 = (int) ondalikSayi2;

        int sayi4 = 97;
        char karakter2 = (char) sayi4;

        System.out.println("char 'A' int'e dönüştü: " + sayi1);
        System.out.println("float 1000.34 int'e dönüştü: " + sayi2);
        System.out.println("double 1000.34 int'e dönüştü: " + sayi3);
        System.out.println("int 97 char'a dönüştü: " + karakter2);
    }

    static void karakterIslemCiktilari() {
        char karakter1 = 'a';
        char karakter2 = 'c';

        System.out.println("++karakter1: " + (++karakter1)); // b
        System.out.println("karakter2++: " + (karakter2++)); // c, sonra d
        System.out.println("karakter1 - karakter2: " + (karakter1 - karakter2)); // 'b' - 'd' = 98 - 100 = -2
    }

    static void rastgeleKucukHarfUret() {
        char rastgeleHarf = (char) ('a' + Math.random() * 26);
        System.out.println("Rastgele küçük harf: " + rastgeleHarf);
    }

    static void karakterKarsilastirmalar() {
        System.out.println("'a' < 'b' = " + ('a' < 'b'));     // true
        System.out.println("'a' <= 'A' = " + ('a' <= 'A'));   // false
        System.out.println("'a' > 'b' = " + ('a' > 'b'));     // false
        System.out.println("'a' >= 'A' = " + ('a' >= 'A'));   // true
        System.out.println("'a' == 'a' = " + ('a' == 'a'));   // true
        System.out.println("'a' != 'b' = " + ('a' != 'b'));   // true
    }
}
