package classwork1;
/*
  Демонстрирайте действието на логическите оператори:
• Логическо И - && (oзначение в Java &&)
• Логическо ИЛИ - ||
• Логическо Отрицание НЕ - !
*/
import java.util.Scanner;
public class Uprj08{
    public static void inputStoinost(String[] args) {
        Scanner scanner = new Scanner(System.in);
                System.out.println("Отговорът на Упражнение \"8\" за задаване на стойности е:");
                System.out.println("Въведете стойност за f:");
                int f=scanner.nextInt();
                System.out.println("Въведете стойност за g:");
                int g=scanner.nextInt();
                System.out.println("Отговорът на Упражнение \"8\" е: "+(f+g));
                
    }
       
}
