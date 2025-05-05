package chapter4;


import java.util.Scanner;

public class Sorular {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {


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
