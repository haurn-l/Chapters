package chapter2;

import java.time.LocalTime;
import java.util.Scanner;

public class sorular {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
    }
    //2,20
    public static void yillikFaizHesaplama(){
        System.out.println("Bakiyenizi giriniz");
        double bakiye = scanner.nextDouble();
        System.out.println("yillik faiz orani giriniz Örn: 3.5");
        double faizOrani = scanner.nextDouble();

        double aylikFaiz = bakiye * (faizOrani / 1200);
        System.out.printf("Aylik faiz orani %.5f",aylikFaiz);
    }
    // 2.21
    public static void gelecektekiYatirimDegeri() {
        double yatirimMiktari, yillikFaizOrani;
        int yilSayisi;

        System.out.print("Yatırım miktarını girin: ");
        yatirimMiktari = scanner.nextDouble();

        System.out.print("Yıllık faiz oranını yüzde olarak girin: ");
        yillikFaizOrani = scanner.nextDouble();

        System.out.print("Yıl sayısını girin: ");
        yilSayisi = scanner.nextInt();

        double gelecektekiYatirim = yatirimMiktari * Math.pow(1 + (yillikFaizOrani / 100) / 12, yilSayisi * 12);

        System.out.printf("Birikmiş değer: $%.2f%n", gelecektekiYatirim);
    }

    // para birimi
    public static void paraBirimiHesaplama() {
        int para;

        System.out.print("Para miktarını (son iki rakam cent olarak) tam sayı olarak girin: ");
        para = scanner.nextInt();

        int dolar = para / 100;
        int cent = para % 100;

        System.out.printf("Dolar: %d, Cent: %d%n", dolar, cent);
    }

    // 2.23 yakıt fiyat
    public static void surusMaliyeti() {
        double mesafe, yakitVerimliligi, yakitFiyati;

        System.out.print("Sürüş mesafesini girin (mil cinsinden): ");
        mesafe = scanner.nextDouble();

        System.out.print("Kilometre başına yakıt verimliliğini girin (mpg cinsinden): ");
        yakitVerimliligi = scanner.nextDouble();

        System.out.print("Bir galon yakıtın fiyatını girin: ");
        yakitFiyati = scanner.nextDouble();

        double surusMaliyeti = (mesafe / yakitVerimliligi) * yakitFiyati;

        System.out.printf("Sürüş maliyeti: $%.2f%n", surusMaliyeti);
    }
    // 2.17 Rüzgar Soğukluğu Sıcaklığı
    public static void ruzgarSogukluguSicakligi() {
        double sicaklik, ruzgarHizi;

        System.out.print("Fahrenheit cinsinden sıcaklığı girin (-58°F ile 41°F arasında): ");
        sicaklik = scanner.nextDouble();

        System.out.print("Rüzgar hızını girin (>= 2 mph): ");
        ruzgarHizi = scanner.nextDouble();

        double ruzgarSoguklukSicakligi ;
        if (sicaklik < -58 || sicaklik > 41 || ruzgarHizi < 2) {
            System.out.println("Geçersiz sıcaklık veya rüzgar hızı.");
            ruzgarSoguklukSicakligi = 0;
        }else  {
         ruzgarSoguklukSicakligi = 35.74 + 0.6215 * sicaklik - 35.75 * Math.pow(ruzgarHizi, 0.16) + 0.4275 * sicaklik * Math.pow(ruzgarHizi, 0.16);
        }
        System.out.printf("Rüzgar soğukluk indeksi: %.5f%n", ruzgarSoguklukSicakligi);
    }

    // 2.18 Print a Table (Bir Tablo Yazdır)
    public static void tabloYazdir() {
        System.out.println("a\tb\tpow(a, b)");

        for (int a = 1; a <= 5; a++) {
            for (int b = a + 1; b <= a + 1; b++) {
                int sonuc = (int) Math.pow(a, b);
                System.out.printf("%d\t%d\t%d%n", a, b, sonuc);
            }
        }
    }

    // 2.19 Geometry: Area of a Triangle (Geometri: Üçgen Alanı)
    public static void ucgenAlani() {
        double x1, y1, x2, y2, x3, y3;

        System.out.print("Üçgen için üç nokta girin (x1, y1, x2, y2, x3, y3): ");
        x1 = scanner.nextDouble();
        y1 = scanner.nextDouble();
        x2 = scanner.nextDouble();
        y2 = scanner.nextDouble();
        x3 = scanner.nextDouble();
        y3 = scanner.nextDouble();

        double alan = ucgenAlaniHesapla(x1, y1, x2, y2, x3, y3);
        System.out.printf("Üçgenin alanı: %.1f%n", alan);
    }

    public static double ucgenAlaniHesapla(double x1, double y1, double x2, double y2, double x3, double y3) {
        double kenar1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        double kenar2 = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2));
        double kenar3 = Math.sqrt(Math.pow(x3 - x1, 2) + Math.pow(y3 - y1, 2));

        double s = (kenar1 + kenar2 + kenar3) / 2;
        return Math.sqrt(s * (s - kenar1) * (s - kenar2) * (s - kenar3));
    }

    
    // 2.13 6 aylık faiz oranı
    public static void altiAylikFaizHesabi(){
        System.out.println("Aylık tasarruf miktarını giriniz : ");
        double tasarrufMiktari = scanner.nextDouble();
        
        double aylikFaizOrani = 0.05 / 12;
        double bakiye = 0;
        for (int i = 0; i < 6; i++) {
            bakiye = (bakiye + tasarrufMiktari) * (1 + aylikFaizOrani);
        }
        System.out.printf("Altıncı ayın sonunda hesap bakiyesi: $%.2f%n", bakiye);
    }
    
    // BMI Hesaplama
    public static void hesaplaBMI() {
        System.out.print("Kilonuzu pound cinsinden girin: ");
        double kiloPound = scanner.nextDouble();
        System.out.print("Boyunuzu inç cinsinden girin: ");
        double boyInch = scanner.nextDouble();

        double kiloKg = kiloPound * 0.45359237; // Pound'u kg'ye çevirme
        double boyMetre = boyInch * 0.0254; // İnç'i metreye çevirme

        double bmi = kiloKg / (boyMetre * boyMetre);

        System.out.printf("Vücut Kitle İndeksiniz (BMI): %.4f%n", bmi);
    }

    // 2.15: İki Nokta Arasındaki Mesafeyi Hesaplama
    public static void hesaplaIkiNoktaArasiMesafe() {
        System.out.print("İlk noktanın (x1, y1) değerlerini girin: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.print("İkinci noktanın (x2, y2) değerlerini girin: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        double mesafe = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.printf("İki nokta arasındaki mesafe: %.15f%n", mesafe);
    }

    // 2.16: Altıgenin Alanını Hesaplama
    public static void hesaplaAltigenAlani() {
        System.out.print("Altıgenin bir kenar uzunluğunu girin: ");
        double kenar = scanner.nextDouble();

        double alan = (3 * Math.sqrt(3) / 2) * Math.pow(kenar, 2);

        System.out.printf("Altıgenin alanı: %.4f%n", alan);
    }
    
    // 2.9 - Ortalama İvme Hesaplama
    public static void ortalamaIvmeHesapla() {
        System.out.print("Başlangıç hızı (v0), bitiş hızı (v1) ve süre (t) girin: ");
        double v0 = scanner.nextDouble();
        double v1 = scanner.nextDouble();
        double t = scanner.nextDouble();
        
        double ivme = (v1 - v0) / t;
        System.out.printf("Ortalama ivme: %.4f m/s²%n", ivme);
    }

    // 2.10 - Su Isıtmak İçin Gerekli Enerji Hesaplama
    public static void enerjiHesapla() {
        System.out.print("Su miktarını (kg) girin: ");
        double suMiktari = scanner.nextDouble();
        System.out.print("Başlangıç sıcaklığı (°C) girin: ");
        double baslangicSicaklik = scanner.nextDouble();
        System.out.print("Bitiş sıcaklığı (°C) girin: ");
        double bitisSicaklik = scanner.nextDouble();
        
        double enerji = suMiktari * (bitisSicaklik - baslangicSicaklik) * 4184;
        System.out.printf("Isıtmak için gereken enerji: %.1f Joule%n", enerji);
    }

    // 2.11 - Nüfus Projeksiyonu Hesaplama
    public static void nufusProjeksiyonu() {
        System.out.print("Kaç yıl sonra nüfusu hesaplamak istiyorsunuz? ");
        int yillar = scanner.nextInt();
        
        int mevcutNufus = 312032486;
        int saniyeYilda = 365 * 24 * 60 * 60;

        int dogumlar = saniyeYilda / 7;
        int olumler = saniyeYilda / 13;
        int gocmenler = saniyeYilda / 45;

        int yillikArtis = dogumlar - olumler + gocmenler;
        int yeniNufus = mevcutNufus + (yillar * yillikArtis);

        System.out.printf("%d yıl sonra nüfus: %d%n", yillar, yeniNufus);
    }

    // 2.12 - Uçak Pist Uzunluğu Hesaplama
    public static void pistUzunluguHesapla() {
        System.out.print("Hızı (m/s) ve ivmeyi (m/s^2) girin: ");
        double hiz = scanner.nextDouble();
        double ivme = scanner.nextDouble();
        
        double uzunluk = (hiz * hiz) / (2 * ivme);
        System.out.printf("Gerekli minimum pist uzunluğu: %.3f metre%n", uzunluk);
    }
    
    // 2.5 Bahşiş Hesaplama Metodu
    public static void bahsisHesapla() {
        System.out.print("Ara toplam ve bahşiş oranını giriniz: ");
        double araToplam = scanner.nextDouble();
        double bahsisOrani = scanner.nextDouble();
        
        double bahsis = araToplam * (bahsisOrani / 100);
        double toplam = araToplam + bahsis;
        System.out.printf("Bahşiş: $%.2f ve Toplam: $%.2f%n", bahsis, toplam);
    }

    // 2.6 Rakamları Toplama Metodu
    public static void rakamTopla() {
        System.out.print("0 ile 1000 arasında bir sayı giriniz: ");
        int sayi = scanner.nextInt();
        
        int toplam = 0;
        while (sayi > 0) {
            toplam += sayi % 10;
            sayi /= 10;
        }
        System.out.println("Rakamların toplamı: " + toplam);
    }

    // 2.7 Yıl ve Gün Hesaplama Metodu
    public static void yilVeGunHesapla() {
        System.out.print("Dakika sayısını giriniz: ");
        long dakika = scanner.nextLong();
        
        long gun = dakika / (60 * 24);
        long yil = gun / 365;
        long kalanGun = gun % 365;
        System.out.printf("%d dakika yaklaşık %d yıl ve %d gündür.%n", dakika, yil, kalanGun);
    }

    // 2.8 Güncel Saat Hesaplama Metodu
    public static void guncelSaatHesapla() {
        System.out.print("GMT'ye göre saat farkını giriniz: ");
        int saatFarki = scanner.nextInt();
        
        long toplamSaniye = System.currentTimeMillis() / 1000;
        long mevcutSaat = (toplamSaniye / 3600) % 24;
        long dakika = (toplamSaniye / 60) % 60;
        long saniye = toplamSaniye % 60;
        long yerelSaat = (mevcutSaat + saatFarki) % 24;

        System.out.printf("Güncel saat: %02d:%02d:%02d%n", yerelSaat, dakika, saniye);
    }
    
    public static void hacimHesapla(){
        System.out.println("yaricapini giriniz : ");
        int yaricap = scanner.nextInt();
        System.out.println("Yukseklik giriniz : ");
        double yukseklik = scanner.nextDouble();
        
        double hacim = Math.PI * Math.pow(yaricap, 2) * yukseklik;
        System.out.printf("Silindir hacmi: %.2f%n", hacim);
    }
    
    public static void poundToKilograms(){
        System.out.print("Kilonuzu pound cinsinden girin: ");
        double pound = scanner.nextDouble();
        
        //1 pound = 0.454 kg
        final double KILOGRAMS_PER_POUND = 0.454;

        double kilogram = pound * KILOGRAMS_PER_POUND;
        System.out.println(pound + " pound = "+kilogram + " kilogramdır ");
    }
    
    //2.1
    public static void celsiusToFahrenheit(){
        System.out.print("Sıcaklığı Celsius cinsinden girin: ");
        double celsius = scanner.nextDouble();
        
        double fahrenheit = (9.0 / 5) * celsius + 32;
        System.out.println(celsius+" Celsius = "+fahrenheit+" fahrenheit");
    }
    
    //2.9
    public static void kmHesapla(){
        double mil = 100;
        final double KILOMETERS_PER_MILE = 1.609;
        double kilometre = mil * KILOMETERS_PER_MILE;
        System.out.println("Kilometre : "+kilometre);
    }
    
    //2.10
    public static void veriTipleriniHesapla(){
        System.out.println("Byte en Küçük: "+Byte.MIN_VALUE+" Byte en büyük: "+Byte.MAX_VALUE);
        System.out.println("Bellekte en az yer kaplayan veri tipi byte tır. (8 bit kaplar)");
        System.out.println("SHort min: "+Short.MIN_VALUE+" short max: "+Short.MAX_VALUE);
    }
    
    //2.11
    public static void modHesaplama(){
        System.out.println("56 % 6 = "+(56 % 6));
        System.out.println(78 % -4);
        System.out.println("-34 % 5 = "+ (-34 % 5));
        System.out.println("-34 % -5 = "+(-34 % -5));
        System.out.println("5 % 1 = "+(5 % 1));
        System.out.println("1 % 5 = "+(1 % 5));
    }
    
    //2.12
    public static void gunHesaplama(){
        System.out.print("Kaç gün sonrasını hesaplamak istiyorsunuz: ");
        int kacGunSonra = scanner.nextInt();
        
        String [] gunler = {"Pazar","Pazartesi","Sali","Carsamba","Persembe","Cuma","Cumartesi"};
        int bugun = 2;
        int arananGun=  (bugun + kacGunSonra) % 7;
        System.out.println(kacGunSonra + " gün sonra "+ gunler[arananGun]);
    }
    
    //2.13
    public static void tamSayiBolme(){
        System.out.println(25 / 4 );
        System.out.println(25 / 4.0);
    }
    
    //2.14
    public static void islemHesapla(){
        System.out.println("2 * (5 / 2 + 5 / 2)"+ (2 * (5 / 2 + 5 / 2) ) );
        System.out.println(2 * 5 / 2 + 2 * 5 / 2);
        System.out.println(2 * (5 / 2));
        System.out.println(2 * 5 / 2);
    }
    
    //2.15
    public static void hesaplama(){
        System.out.println("25 / 4 is " + 25 / 4);
        System.out.println("25 / 4.0 is " + 25 / 4.0);
        System.out.println("3 * 2 / 4 is " + 3 * 2 / 4);
        System.out.println("3.0 * 2 / 4 is " + 3.0 * 2 / 4);
    }
    
    //2.16
    public static void ifadeyiYazdir(){
        System.out.println(Math.pow(2,3.5));
    }
    
    //2.17
    public static void mVerYazdir(){
        System.out.print("m ve r değerlerini giriniz: ");
        int m = scanner.nextInt();
        int r = scanner.nextInt();
        
        double sonuc = m * Math.pow(r,2);
        System.out.println(sonuc);
    }
    
    //2.23
    public static void suAniHesapla(){
        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();
        int minute = currentTime.getMinute();
        int second = currentTime.getSecond();
        System.out.println("Şu anki zaman :"+ hour+"."+minute+"."+second);
    }
    
    //2.32
    public static void deltaHesaplama(){
        System.out.print("a, b ve c değerlerini giriniz: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        
        System.out.println( (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a));
    }
}
