package Question_7_b;

public class Question_7_b {
    public static int isPerfect(int a){
        int factor=0;
        for (int i=1;i<a;i++) {
            if (a % i == 0) factor = i + factor; // çarpanları toplar
        }
        // Aradığımız SAYI İSE
        if (factor==a){
            return a;
        }
        // Degil ise recursive şekilde değer artırır ve bulur
        else
            return isPerfect(a+1);
    }

    public static void main(String[] Sinan){
        int x=1000;
        System.out.print(" " + isPerfect(x));
    }
}
