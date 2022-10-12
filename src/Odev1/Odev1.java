package Odev1;

import java.util.Scanner;

public class Odev1 {

    public static void main(String[] args) {

        Scanner giris1 = new Scanner(System.in);
        while (true) {

            int giris;
            int ilkSayi;
            int ikinciSayi;
            System.out.println("1-TOPLAMA işlemi  \n"
                    + "2-ÇIKARMA işlemi\n"
                    + "3-ÇARPMA işlemi\n"
                    + "4-BÖLME işlemi\n"
                    + "5-ÇIKIŞ");

            try {
                System.out.print("yapmak istediğiniz işlem=");
                giris = giris1.nextInt();

                if (giris == 5) {
                    System.out.print("Çıkış yapılıyor...");
                    break;
                } else if (giris > 5) {
                    System.out.println("Hatalı sayı giriş!!!");
                    break;
                }
                System.out.print("İlk sayıyı giriniz=");
                ilkSayi = giris1.nextInt();

                System.out.print("İkinci sayıyı giriniz =");
                ikinciSayi = giris1.nextInt();
                switch (giris) {

                    case 1:
                        Islem top = new Toplama(ilkSayi, ikinciSayi);
                        top.sonucYazdir();
                        break;
                    case 2:
                        Islem cık = new Cikarma(ilkSayi, ikinciSayi);
                        cık.sonucYazdir();
                        break;
                    case 3:
                        Islem carp = new Carpma(ilkSayi, ikinciSayi);
                        carp.sonucYazdir();
                        break;
                    case 4:
                        Islem bol = new Bolme(ilkSayi, ikinciSayi);
                        bol.sonucYazdir();
                        break;
                }
            } catch (Exception e) {
                System.out.println("Karakter girişi yapılamaz!!!");
                break;
            }

        }
    }

}
