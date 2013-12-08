package classwork1;
/*
 Създайте метод „void m(double d1, double d2)”, който извежда стойността на израза

• (d1+d2)*(d1-d2), ако d1+d2 е по-голямо от 20;

• (d1+d2)/5 (в обратния случай - когато d1+d2 <=20);

o Извикайте метода в основната програма.
*/
public class Uprj10 {
    public static void ifElse(double l, double m){
        if((l+m)>20){
            System.out.println("Oтговорът на задача \"10\" e, че (l+m)>20 и следователно (l+m)*(l-m) е равно на: "+((l+m)*(l-m)));
        }
        else
            System.out.println("Oтговорът на задача \"10\" e, че (l+m)<=20 и следователно (l+m)*(l-m) е равно на: "+((l+m)/5));
    }
}
