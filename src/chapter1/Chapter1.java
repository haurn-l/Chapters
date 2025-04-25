package chapter1;

public class Chapter1 {

    public static void main(String[] args) {
        //1.1
//        mesajlariGoster();
//        //1.2
//        besMesajGoster();
//        //1.3
//        desenGoster();
//        //1.4
        tabloOlustur();
//        //1.5
//        ifadeleriHesapla();
//        //1.6
//        seriToplami();
//        //1.7
        piHesapla();
//        // 1.8
//        cemberAlanCevre();
//        // 1.9
//        dikdortgenAlanCevre();
//        // 1.10
//        milCinsindenOrtalamaHiz();
//        // 1.11
        nufusProjeksiyonu();
//        // 1.12
//        kilometreCinsindenOrtalamaHiz();
//        // 1.13
//        soruCozum();
    }

    public static void mesajlariGoster() {
        System.out.println("Java'ya Hoşgeldiniz");
        System.out.println("Bilgisayar Bilimine Hoşgeldiniz");
        System.out.println("Programlama Eğlencelidir");
    }

    public static void besMesajGoster() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Java'ya Hoşgeldiniz");
        }
    }

    public static void desenGoster() {
        System.out.println("     J    A     V     V    A");
        System.out.println("     J   A A     V   V    A A");
        System.out.println("J    J  AAAAA     V V    AAAAA");
        System.out.println(" J J   A     A     V    A     A");
    }

    public static void tabloOlustur() {
        System.out.println("a      a^2    a^3");
        for (int a = 1; a <= 4; a++) {
            System.out.println(a + "      " + (a * a) + "      " + (a * a * a));
        }
    }

    public static void ifadeleriHesapla() {
        double sonuc1 = 9.5 * 4.5 - 2.5 * 3;
        double sonuc2 = 45.5 - 3.5;

        System.out.println("9.5 * 4.5 - 2.5 * 3 = " + sonuc1);
        System.out.println("45.5 - 3.5 = " + sonuc2);
    }

    public static void seriToplami() {
        int toplam = 0;
        for (int i = 1; i <= 9; i++) {
            toplam += i;
        }
        System.out.println("Seri Toplamı: " + toplam);
    }
    public static void piHesapla(){
        // İlk formül
        double pi1 = 4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11));

        // İkinci formül
        double pi2 = 4 * (1.0 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) + (1.0 / 13));

        // Sonuçları yazdır
        System.out.println("Approximation of pi using first formula: " + pi1);
        System.out.println("Approximation of pi using second formula: " + pi2);
    }

    public static void cemberAlanCevre() {
        double yaricap = 5.5;
        double pi = 3.14159;

        double cevre = 2 * yaricap * pi;
        double alan = yaricap * yaricap * pi;

        System.out.println("Çevre: " + cevre);
        System.out.println("Alan: " + alan);
    }

    public static void dikdortgenAlanCevre() {
        double genislik = 4.5;
        double yukseklik = 7.9;

        double alan = genislik * yukseklik;
        double cevre = 2 * (genislik + yukseklik);

        System.out.println("Dikdörtgenin Alanı: " + alan);
        System.out.println("Dikdörtgenin Çevresi: " + cevre);
    }

    public static void milCinsindenOrtalamaHiz() {
        double mesafeKm = 14;
        double sureDakika = 45 + 30.0 / 60;
        double sureSaat = sureDakika / 60;

        double mesafeMil = mesafeKm / 1.6;
        double hizMilSaat = mesafeMil / sureSaat;

        System.out.println("Ortalama hız (mil/saat): " + hizMilSaat);
    }

    public static void nufusProjeksiyonu() {
        int mevcutNufus = 312032486;
        int saniyeYil = 365 * 24 * 60 * 60;

        int dogumYil = saniyeYil / 7;
        int olumYil = saniyeYil / 13;
        int gocmenYil = saniyeYil / 45;

        for (int yil = 1; yil <= 5; yil++) {
            int yeniNufus = mevcutNufus + (dogumYil - olumYil + gocmenYil) * yil;
            System.out.println(yil + ". yılın sonundaki nüfus: " + yeniNufus);
        }
    }

    public static void kilometreCinsindenOrtalamaHiz() {
        double mesafeMil = 24;
        double sureSaat = 1 + 40.0 / 60 + 35.0 / 3600;

        double mesafeKm = mesafeMil * 1.6;
        double hizKmSaat = mesafeKm / sureSaat;

        System.out.println("Ortalama hız (km/saat): " + hizKmSaat);
    }

    public static void soruCozum() {
        double a = 3.4, b = 50.2, e = 44.5;
        double c = 2.1, d = 0.55, f = 5.9;

        double payda = (a * d) - (b * c);
        double x = (e * d - b * f) / payda;
        double y = (a * f - e * c) / payda;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}
