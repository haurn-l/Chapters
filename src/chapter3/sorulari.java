package chapter3;

import java.util.Random;
import java.util.Scanner;

public class sorulari {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println( Math.ceil(2.0999) );
        System.out.println(Math.rint(3.5));
        long sayi = Math.round(2.95331f);
        System.out.println(sayi);
    }

    // 3.1
    public static void denklemiCoz() {
        System.out.print("a, b, c değerlerini girin: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        double diskriminant = b * b - 4 * a * c;

        if (diskriminant > 0) {
            double kok1 = (-b + Math.sqrt(diskriminant)) / (2 * a);
            double kok2 = (-b - Math.sqrt(diskriminant)) / (2 * a);
            System.out.println("Denklemin iki kökü: " + kok1 + " ve " + kok2);
        } else if (diskriminant == 0) {
            double kok = -b / (2 * a);
            System.out.println("Denklemin bir kökü: " + kok);
        } else {
            System.out.println("Denklemin gerçek kökleri yok.");
        }
    }

    // 3.2 (Üç Sayıyı Topla)
    public static void ucSayiyiTopla() {
        int sayi1 = (int)(Math.random() * 10000);
        int sayi2 = (int)(Math.random() * 1000);
        int sayi3 = (int)(Math.random() * 100);

        System.out.println("Bu üç sayının toplamını tahmin edin: " + sayi1 + " + " + sayi2 + " + " + sayi3);
        System.out.print("Cevabınızı girin: ");
        int cevap = scanner.nextInt();

        int toplam = sayi1 + sayi2 + sayi3;
        if (cevap == toplam) {
            System.out.println("Doğru cevap!");
        } else {
            System.out.println("Yanlış cevap. Doğru cevap: " + toplam);
        }
    }

    // 3.3
    public static void dogrusalDenklemCoz() {
        System.out.print("a, b, c, d, e, f değerlerini girin: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double e = scanner.nextDouble();
        double f = scanner.nextDouble();

        double payda = a * d - b * c;

        if (payda == 0) {
            System.out.println("Denklemin çözümü yok.");
        } else {
            double x = (e * d - b * f) / payda;
            double y = (a * f - e * c) / payda;
            System.out.println("x: " + x + " ve y: " + y);
        }
    }

    // 3.4
    public static void rastgeleAy() {
        int ay = (int)(Math.random() * 12) + 1;
        String ayAdi = "";

        switch (ay) {
            case 1: ayAdi = "Ocak"; break;
            case 2: ayAdi = "Şubat"; break;
            case 3: ayAdi = "Mart"; break;
            case 4: ayAdi = "Nisan"; break;
            case 5: ayAdi = "Mayıs"; break;
            case 6: ayAdi = "Haziran"; break;
            case 7: ayAdi = "Temmuz"; break;
            case 8: ayAdi = "Ağustos"; break;
            case 9: ayAdi = "Eylül"; break;
            case 10: ayAdi = "Ekim"; break;
            case 11: ayAdi = "Kasım"; break;
            case 12: ayAdi = "Aralık"; break;
        }

        System.out.println("Rastgele seçilen ay: " + ayAdi);
    }

    // 3.5
    public static void gelecektekiGunleriBul() {
        System.out.print("Bugünün gününü girin (Pazar 0, Pazartesi 1, ... Cumartesi 6): ");
        int bugun = scanner.nextInt();
        System.out.print("Bugünden itibaren kaç gün sonra: ");
        int gunSonra = scanner.nextInt();

        int gelecektekiGun = (bugun + gunSonra) % 7;

        String[] gunler = {"Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi"};

        System.out.println("Bugün " + gunler[bugun] + " ve gelecekteki gün " + gunler[gelecektekiGun]);
    }

    // 3.6
    public static void bmiHesapla() {
        System.out.print("Kilonuzu girin (pound): ");
        double kilo = scanner.nextDouble();
        System.out.print("Boyunuzu girin (feet): ");
        int feet = scanner.nextInt();
        System.out.print("Boyunuzu girin (inches): ");
        int inches = scanner.nextInt();

        int toplamInch = feet * 12 + inches;
        double boyMetre = toplamInch * 0.0254;


        double bmi = kilo / (boyMetre * boyMetre);
        System.out.println("BMI: " + bmi);

        if (bmi < 18.5) {
            System.out.println("Zayıf");
        } else if (bmi < 24.9) {
            System.out.println("Normal");
        } else if (bmi < 29.9) {
            System.out.println("Fazla Kilolu");
        } else {
            System.out.println("Obez");
        }
    }

    // 3.7
    public static void paraBirimiHesapla() {
        System.out.print("Para miktarını girin (örneğin: 11.56): ");
        double miktar = scanner.nextDouble();

        int dolar = (int) miktar;
        int sent = (int) ((miktar - dolar) * 100);

        int[] birimler = {100, 50, 25, 10, 5, 1};
        String[] birimAdlari = {"dolar", "yarım dolar", "çeyrek dolar", "on sent", "beş sent", "sent"};

        System.out.println("Değişim:");

        for (int i = 0; i < birimler.length; i++) {
            int adet = sent / birimler[i];
            if (adet > 0) {
                if (i == 0) {
                    System.out.println(adet + " " + birimAdlari[i]);
                } else {
                    System.out.println(adet + " " + birimAdlari[i]);
                }
                sent = sent % birimler[i];
            }
        }
    }
    // 3.8 Üç Sayıyı Sıralama
    public static void sayiSiralama() {
        System.out.print("Birinci sayıyı girin: ");
        int sayi1 = scanner.nextInt();

        System.out.print("İkinci sayıyı girin: ");
        int sayi2 = scanner.nextInt();

        System.out.print("Üçüncü sayıyı girin: ");
        int sayi3 = scanner.nextInt();

        if (sayi1 > sayi2) {
            int temp = sayi1;
            sayi1 = sayi2;
            sayi2 = temp;
        }

        if (sayi2 > sayi3) {
            int temp = sayi2;
            sayi2 = sayi3;
            sayi3 = temp;
        }

        if (sayi1 > sayi2) {
            int temp = sayi1;
            sayi1 = sayi2;
            sayi2 = temp;
        }

        System.out.println("Sıralı sayılar: " + sayi1 + ", " + sayi2 + ", " + sayi3);
    }

    // 3.9 ISBN-10 Kontrolü
    public static void isbnKontrol() {
        System.out.print("ISBN numarasının ilk 9 rakamını girin: ");
        int isbn9 = scanner.nextInt();


        int toplam = 0;
        for (int i = 0; i < 9; i++) {
            int rakam = isbn9 % 10;
            toplam += rakam * (i + 1);
            isbn9 /= 10;
        }

        int sonRakam = toplam % 11;
        if (sonRakam == 10) {
            System.out.println("ISBN-10 numarası: " + isbn9 + "X");
        } else {
            System.out.println("ISBN-10 numarası: " + isbn9 + sonRakam);
        }
    }

    // 3.10 Toplama Sorusu
    public static void toplamaSorusu() {
        int sayi1 = (int) (Math.random() * 100);
        int sayi2 = (int) (Math.random() * 100);

        System.out.println("Toplama sorusu: " + sayi1 + " + " + sayi2);
        System.out.print("Cevabınızı girin: ");
        int cevap = scanner.nextInt();

        if (cevap == (sayi1 + sayi2)) {
            System.out.println("Doğru!");
        } else {
            System.out.println("Yanlış. Doğru cevap: " + (sayi1 + sayi2));
        }
    }

    // 3.11 Bir Ayın Gün Sayısını Bulma
    public static void ayGunuHesapla() {
        System.out.print("Ayı girin (1-12): ");
        int ay = scanner.nextInt();
        System.out.print("Yılı girin: ");
        int yil = scanner.nextInt();

        int gunSayisi = 0;

        switch (ay) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                gunSayisi = 31;
                break;
            case 4: case 6: case 9: case 11:
                gunSayisi = 30;
                break;
            case 2:
                if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
                    gunSayisi = 29;
                } else {
                    gunSayisi = 28;
                }
                break;
            default:
                System.out.println("Geçersiz ay.");
                return;
        }

        System.out.println(ay + " ayı, " + yil + " yılında " + gunSayisi + " gün çeker.");
    }

    // 3.12 Palindromik Sayı
    public static void palindromSayi() {
        System.out.print("Bir üç basamaklı sayı girin: ");
        int sayi = scanner.nextInt();

        int yuzler = sayi / 100;
        int onlar = (sayi % 100) / 10;
        int birler = sayi % 10;

        if (yuzler == birler) {
            System.out.println(sayi + " bir palindrom sayıdır.");
        } else {
            System.out.println(sayi + " bir palindrom sayı değildir.");
        }
    }

    // 3.13 Vergi Hesaplama (Basit bir örnek ile)
    public static void vergiHesaplama() {
        System.out.print("Gelirinizi girin: ");
        double gelir = scanner.nextDouble();

        double vergi = gelir * 0.15;  // Örnek olarak %15 vergi hesaplıyoruz
        System.out.println("Vergi miktarı: " + vergi);
    }

    // 3.14 Yazı Tura
    public static void yaziTura() {
        // Rastgele yazı-tura seçimi
        int secim = (int) (Math.random() * 2);  // 0: yazı, 1: tura
        String sonuc = secim == 0 ? "Yazı" : "Tura";

        // Kullanıcı tahmini
        System.out.print("Yazı mı yoksa Tura mı tahmin ediyorsunuz? ");
        String tahmin = scanner.nextLine();

        if (tahmin.equalsIgnoreCase(sonuc)) {
            System.out.println("Tebrikler! Doğru tahmin.");
        } else {
            System.out.println("Yanlış tahmin. Sonuç: " + sonuc);
        }
    }
    //3,15
    public static void piyangoNumarasi(){
        int piyangoNo = (int) ( Math.random() * 100 );
        String piyangoString = String.valueOf(piyangoNo);
        char [] piyangoDizisi = piyangoString.toCharArray();

        System.out.print("Lütfenn tahmin yapınız  : ");
        String tahmin = scanner.next();

        if (tahmin.length() != 3 || !tahmin.matches("\\d{3}")){
            System.out.println("Hatali bir giriş yaptiniz !!");
            return;
        }
        char [] tahminDizisi = tahmin.toCharArray();

        if (tahmin.equals(piyangoString)){
            System.out.println("Tebrikler Bildiniz $10.000 kazandınız!!");
        }
        boolean tumRakamlarVar = true;
        for (char rakam : piyangoDizisi) {
            boolean mevcutMu = false;
            for (char tahminRakam : tahminDizisi) {
                if (rakam == tahminRakam) {
                    mevcutMu = true;
                    break;
                }
            }
            if (!mevcutMu) {
                tumRakamlarVar = false;
                break;
            }
        }
        if (tumRakamlarVar) {
            System.out.println("Harika! Tüm rakamlar var ama sıralama farklı. $3.000 kazandınız! ");
            return;
        }

        // **3. Kural: En az bir rakam eşleşiyorsa**
        boolean enAzBirRakamVar = false;
        for (char tahminRakam : tahminDizisi) {
            for (char rakam : piyangoDizisi) {
                if (tahminRakam == rakam) {
                    enAzBirRakamVar = true;
                    break;
                }
            }
            if (enAzBirRakamVar) break;
        }

        if (enAzBirRakamVar) {
            System.out.println("Tebrikler! En az bir rakam eşleşti. $1.000 kazandınız! ");
        } else {
            System.out.println("Üzgünüm, kazanamadınız. Piyango numarası: " + piyangoNo);
        }
    }
    // **3.16 - Rastgele Koordinat**
    public static void rastgeleKoordinat() {
        int en = 100;
        int boy = 200;
        int x = (int) (Math.random() * en) - en / 2;
        int y = (int) (Math.random() * boy) - boy / 2;

        System.out.println("Rastgele Nokta: (" + x + ", " + y + ")");
    }

    // 3.17
    public static void tasKagitMakas() {
        System.out.print("Taş (1), Kağıt (2), Makas (0) seçin: ");
        int kullaniciSecim = scanner.nextInt();

        int bilgisayarSecim = (int) (Math.random() * 3);
        String[] secimler = {"Makas", "Taş", "Kağıt"};

        System.out.println("Bilgisayar: " + secimler[bilgisayarSecim]);
        System.out.println("Siz: " + secimler[kullaniciSecim]);

        if (kullaniciSecim == bilgisayarSecim) {
            System.out.println("Berabere!");
        } else if ((kullaniciSecim == 0 && bilgisayarSecim == 2) ||
                (kullaniciSecim == 1 && bilgisayarSecim == 0) ||
                (kullaniciSecim == 2 && bilgisayarSecim == 1)) {
            System.out.println("Kazandınız!");
        } else {
            System.out.println("Kaybettiniz!");
        }
    }

    //3.18
    public static void kargoUcretiHesapla() {
        System.out.print("Paketin ağırlığını girin (lbs): ");
        double agirlik = scanner.nextDouble();
        double ucret;

        if (agirlik > 50) {
            System.out.println("Paket taşınamaz.");
            return;
        }

        if (agirlik > 10) ucret = 10.5;
        else if (agirlik > 3) ucret = 8.5;
        else if (agirlik > 1) ucret = 5.5;
        else ucret = 3.5;

        System.out.println("Kargo ücreti: $" + ucret);
    }

    // 3.19
    public static void ucgenCevresiHesapla() {
        System.out.print("Üçgenin kenarlarını girin (3 değer): ");
        double kenar1 = scanner.nextDouble();
        double kenar2 = scanner.nextDouble();
        double kenar3 = scanner.nextDouble();

        if (kenar1 + kenar2 > kenar3 && kenar1 + kenar3 > kenar2 && kenar2 + kenar3 > kenar1) {
            double cevre = kenar1 + kenar2 + kenar3;
            System.out.println("Üçgenin çevresi: " + cevre);
        } else {
            System.out.println("Geçersiz üçgen kenarları!");
        }
    }

    //*3.20
    public static void ruzgarUsumeHesapla() {
        System.out.print("Hava sıcaklığını girin (°F): ");
        double sicaklik = scanner.nextDouble();
        System.out.print("Rüzgar hızını girin (mph): ");
        double ruzgarHizi = scanner.nextDouble();

        if (sicaklik < -58 || sicaklik > 41) {
            System.out.println("Geçersiz sıcaklık değeri!");
            return;
        }
        if (ruzgarHizi < 2) {
            System.out.println("Geçersiz rüzgar hızı!");
            return;
        }

        double usumeHissi = 35.74 + 0.6215 * sicaklik - 35.75 * Math.pow(ruzgarHizi, 0.16) +
                0.4275 * sicaklik * Math.pow(ruzgarHizi, 0.16);

        System.out.println("Rüzgar üşüme hissi: " + usumeHissi + "°F");
    }
    //3.21
    public static void haftaninGununuHesapla() {
        System.out.print("Yılı girin (örn: 2012): ");
        int yil = scanner.nextInt();

        System.out.print("Ayı girin (1-12): ");
        int ay = scanner.nextInt();

        System.out.print("Günü girin (1-31): ");
        int gun = scanner.nextInt();

        // Ocak ve Şubat'ı 13 ve 14 olarak kabul edip yılı bir önceki yıla çekiyoruz
        if (ay == 1 || ay == 2) {
            ay += 12;
            yil -= 1;
        }

        int j = yil / 100;  // Yüzyıl
        int k = yil % 100;  // Yılın yüzyıldaki kısmı

        // Zeller’s Congruence Formülü
        int h = (gun + (26 * (ay + 1)) / 10 + k + (k / 4) + (j / 4) + (5 * j)) % 7;

        String[] gunler = {"Cumartesi", "Pazar", "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma"};

        System.out.println("Girilen tarih: " + gun + "/" + (ay > 12 ? ay - 12 : ay) + "/" + (yil + (ay > 12 ? 1 : 0)));
        System.out.println("Haftanın günü: " + gunler[h]);
    }
    //3.24
    public static void kartSecme(){
        Random rand = new Random();
        int cardNumber = rand.nextInt(52) + 1;

        String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
        String suit = suits[(cardNumber - 1) / 13];

        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        String rank = ranks[(cardNumber - 1) % 13];

        System.out.println("The card you picked is " + rank + " of " + suit);
    }
    //3.26
    public static void bolunurlukKontrol(){
        System.out.print("Bir sayi giriniz : ");
        int sayi = scanner.nextInt();
        boolean ikiside = (sayi % 5 == 0 && sayi % 6 == 0);
        boolean birisi = (sayi % 5 == 0 || sayi % 6 == 0);
        boolean yalnizBiri = (sayi % 5 == 0 ^ sayi % 6 == 0); // XOR operatörü

        // Sonuçları yazdır
        System.out.println("Is " + sayi + " divisible by 5 and 6? " + ikiside);
        System.out.println("Is " + sayi + " divisible by 5 or 6? " + birisi);
        System.out.println("Is " + sayi + " divisible by 5 or 6, but not both? " + yalnizBiri);
    }

}
