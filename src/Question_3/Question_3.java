package Question_3;
import javax.swing.*;
public class Question_3 {

 // Kuralları teker teker kontrol eden fonksiyonumuz
public static boolean isValid(String pass){
 if (pass.length() < 8 || pass.length() > 95) // Karakter sayısını kontrol eder
  return false;
 boolean containsLetter = false;
 boolean containsDigit = false;
 boolean containsSpecialCharacter = false;
 for (char a:pass.toCharArray()){     // Girilen string değerin her bir harfini gezer
  if (Character.isLetter(a))  containsLetter = true; // şifrenin içinde harf varmı ?
  else if(Character.isDigit(a)) containsDigit=true; // şifrenin içinde sayı varmı ?
  else if("!%+@-_}=".contains(String.valueOf(a))) containsSpecialCharacter=true; // şifrede belirlediğimiz özel karakter varmı ?
 }
 return containsDigit && containsLetter && containsSpecialCharacter && !pass.matches("^\\s.*|.*\\s$");
 /* !password.matches("^\\s.*|.*\\s$") yapısı şifrenin başında ve sonunda boşluk arar
 ^ ifadesi şifrenin başını ,
 $ ifadesi şifrenin sonunu temsil eder.
  */
}
 public static void main(String[] Sinan){
boolean control=false;
  String password=" K";  // şifremizin geleceği string değer
 while(control==false) {  // şifrenin yanlış gelmesi durumunda döngüyü başa sarar

 String message = """  
         • Password must be at least 8 and at most 95 characters
         • Must contain at least 1 letter
         • Must contain at least 1 number
         • Cannot have leading or trailing spaces
         • Must contain at least 1 special character(!%+@-_}=)         \s""";

  password= JOptionPane.showInputDialog(null, message, "Enter a new password below", JOptionPane.QUESTION_MESSAGE);

  control=isValid(password); // fonksiyona gidip kontrol yapar.

  // her hangi bir koşul sağlanmazsa kullanıcıya kuralları yeniden hatırlatır ve döngü başa döner
  if (control==false) {
   JOptionPane.showMessageDialog(null, """
           Password is not valid! The password must comply with the following rules.
           • Password must be at least 8 and at most 95 characters
           • Must contain at least 1 letter
           • Must contain at least 1 number
           • Cannot have leading or trailing spaces
           • Must contain at least 1 special character(!%+@-_}=)"""); }
   }
  // her koşul sağlandığında döngü biter ve ekrana şifreyi yazar.
  JOptionPane.showMessageDialog(null, "Your password has been saved. Your password :" + password);
}
}
