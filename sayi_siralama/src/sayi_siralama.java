import java.util.Scanner;

public class sayi_siralama {
    public static void main(String[] args) {

        // sayıları ve sınıfı tanımla
        int a,b,c;
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan seçeceği sayıları girmesini iste
        System.out.print("Lütfen a sayısını giriniz:");
        a = input.nextInt();
        System.out.print("Lütfen b sayısını giriniz:");
        b = input.nextInt();
        System.out.print("Lütfen c sayısını giriniz:");
        c = input.nextInt();

        // a'nın en küçük olduğu koşul
        if (a<b && a<c) {

            if (b < c) {
                System.out.print("a < b < c");
            } else {
                System.out.print("a < c < b");

            }
        }
        //b'nin en küçük olduğu koşul
        else if (b<a && b<c) {

            if (a < c) {
                System.out.print("b<a<c");
            } else {
                System.out.print("b<c<a");
            }
        }
        //c'nin en küçük olduğu koşul
        else if (c<a && c<b) {
            if (a<b) {
                System.out.print("c<a<b");
            }
            else {
                System.out.print("c<b<a");
            }
        }

        }
            }


