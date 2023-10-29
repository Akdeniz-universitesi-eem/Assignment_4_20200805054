package Question_7_a;

import java.util.Scanner;

public class Question_7_a {
    public static boolean perfect_number(int a){
        int factor=0;
        for (int i=1;i<a;i++) {
            if (a % i == 0) factor = i + factor; // çarpanları toplar
        }
        if (factor==a) return true; // mükemmel ise true döndürür
        else return false;

    }
    public static void main(String[] Sinan){
        Scanner data=new Scanner(System.in);
        int attempts =0;
        int max=3;
        int num1=0;
        while (attempts<max) {
            try {   // kullanıcıdan girdi alır
                System.out.print("\nSayınızı Girin\n");
                num1 = data.nextInt();
                break;
            }
            catch (Exception e) {
                System.out.print("Lütfen Sayı giriniz. ");
                attempts++;
                data.nextLine(); // Hatalı kısmı siler
            }
            if (attempts==max) {   // Max deneme hakkınını kontrol eder
                System.out.print("\nMaximum deneme sayısına ulaştınız.");
                return;
            }
        }   // SAYILARIN mükemmel olup OLMADIĞINI KONTROL EDER
        if (perfect_number(num1))
            System.out.printf("%d Sayısı Mükemmel Sayıdır.",num1);
        else
            System.out.printf("Sayınız Mükemmel sayı degildir.");
    }
}
