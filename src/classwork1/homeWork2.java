package classwork1;
/*
- създайте код за въвеждане от конзолата на 4 реални числа – a, b, c, d;
- извикайте метода два пъти с фактически параметри съответно a, d и b, c – т.е. f(a, d) и f(b, c).
*/
import java.util.Scanner;
public class homeWork2 { 
    public static void homeWork2(){
        double p, q, r, s;
     Scanner scanner=new Scanner(System.in);
    System.out.println("Oтговорът на \"Home Work 2-ра част\" е: ");
    System.out.println("Въведете стойност за p: ");     
        p=scanner.nextDouble();
    System.out.println("Въведете стойност за q: ");    
        q=scanner.nextDouble();
    System.out.println("Въведете стойност за r: ");  
        r=scanner.nextDouble();
    System.out.println("Въведете стойност за s: ");  
        s=scanner.nextDouble();    
  
        f(p,r);
        f(q,s);
    }

    private static void f(double p, double r) {
        
    }
} 
