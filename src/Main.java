import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fiz, kim, tur, muz;
        int toplamNot = 0;
        int derSayisi = 0;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz: ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            toplamNot += mat;
            derSayisi++;
        }else if(!(mat >= 0 && mat <= 100)) {
            derSayisi++; // ders sayisi dusmeyecek ortalamayi etkileyecek fakat not yanlis girildigi icin dahil edilmeyecek.
            System.out.println("gecersiz not! bu ders toplamina dahil edilmeyecektir. gecerli notlarin toplami, 5 ders sayisina bolunecektir");
        }

            System.out.print("Fizik Notunuzu Giriniz: ");
            fiz = input.nextInt();
            if (fiz >= 0 && fiz <= 100) {
                toplamNot += fiz;
                derSayisi++;

                System.out.print("Kimya Notunuzu Giriniz: ");
                kim = input.nextInt();
                if (kim >= 0 && kim <= 100) {
                    toplamNot += kim;
                    derSayisi++;

                    System.out.print("Turkce Notunuzu Giriniz: ");
                    tur = input.nextInt();
                    if (tur >= 0 && tur <= 100) {
                        toplamNot += tur;
                        derSayisi++;

                        System.out.print("Muzik Notunuzu Giriniz: ");
                        muz = input.nextInt();
                        if (muz >= 0 && muz <= 100) {
                            toplamNot += muz;
                            derSayisi++;
                        }

                        double avarage = toplamNot / derSayisi;
                        if (derSayisi > 0) {
                            avarage = toplamNot / derSayisi;
                            if (avarage <= 55) {
                                System.out.println("Sinifta kaldiniz! Seneye gorusuruz..." + avarage);
                            } else {
                                System.out.println("Tebrikler! Sinifi gectiniz..." + avarage);
                            }
                        } else {
                            System.out.println("Gecerli not bulunmamaktadir ");
                        }


                    }
                }
            }

    }
}