package classwork1;
/*
   упр. 6 - Демонстрирайте действието на операторa за сравнение = =
   упр. 7 - Демонстрирайте действието на всички оператори за сравнение.
*/
public class Uprj06and07 {
    public static void sravnenie(float a,float b,boolean s){
         s=(a==b);
         System.out.println("Отговорът на Упражнение \"6\" е: " + s + ", защото a= "+a+", а b= "+b);
         System.out.println("Отговорът на Упражнение \"7\" е: ");
         System.out.println("За а<=b: "+(a<=b));
         System.out.println("За а<b: "+(a<b));
         System.out.println("За а>=b: "+(a>=b));
         System.out.println("За а>b: "+(a>b));
         System.out.println("За а!=b: "+(a!=b));
    }
           
}
