package Question_6;
import java.util.Scanner;
public class Question_6 {
    public static int sumFactors(int a){
        int factor=0;
        for (int i=1;i<a;i++)
        {
            if (a%i==0) factor=i+factor; // çarpanları toplar

        }
        return factor;  // çarpanları toplamını döndürür
    }
    public static void main(String[] Sinan){
        Scanner data=new Scanner(System.in);
        int attempts =0;
        int max=3;
        int num1=0,num2=0;
        while (attempts<max) {
            try {   // kullanıcıdan girdileri alır
                System.out.print("\n1.Sayınızı Girin\n");
                num1 = data.nextInt();
                System.out.print("\n2.Sayınızı Girin\n");
                num2 = data.nextInt();
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
        }   // SAYILARIN ARKADAŞ OLUP OLMADIĞINI KONTROL EDER
        if (num1==sumFactors(num2)) {
            if (num2==sumFactors(num1))
                System.out.printf("%d - %d Sayıları Arkadaştır.",num1,num2); }
        else
            System.out.printf("%d - %d Sayıları Arkadaş DEĞİLDİR.",num1,num2);
    }
}
