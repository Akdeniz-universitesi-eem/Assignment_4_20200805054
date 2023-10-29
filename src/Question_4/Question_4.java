package Question_4;

import javax.swing.*;

public class Question_4 {
    public static int factorial(int num){
        int first = 1;
        for (int i=1;i<=num;i++)  // faktöriyel işlemini yapar
        {
            first=first*i;
        }
        return first;
    }
    public static void main(String[] Sinan){
        float num_e=0;
        for (int i=0;i<10;i++) {
            float divide = (float) 1 / factorial(i); // bölüm işlemlerini yapar
            num_e = num_e + divide; // bölümlerden gelen sonuçlalrı toplar
        }
        JOptionPane.showMessageDialog(null,"Value of e = " + num_e);
    }
}
