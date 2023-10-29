package Question_5;
import javax.swing.*;
public class Question_5 {
    public static int sumFactors(int a){
        int factor=0;
        for (int i=1;i<a;i++)
        {
            if (a%i==0) factor=i+factor; // çarpanları toplar

        }
        return factor;  // çarpanları toplamını döndürür
    }
    public static void main(String[] Sinan){
        String num = JOptionPane.showInputDialog(null,"Bir sayı giriniz");
        int sum=Integer.parseInt(num);
        JOptionPane.showMessageDialog(null,"sumFactors = " + sumFactors(sum));
    }
}
