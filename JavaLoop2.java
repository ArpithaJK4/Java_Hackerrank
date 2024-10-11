import java.util.Scanner;

public class SequenceGenerator {

   
    public static void generateSequence(int a, int b, int n) {
    
        long current = a + b;
        System.out.print(current + " ");  

      
        long powerOfTwo = 2;

       
        for (int i = 1; i < n; i++) {
           
            long increment = b * powerOfTwo;

            
            current += increment;

           
            System.out.print(current + " ");

           
            powerOfTwo *= 2;
        }

        
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
        
            int t = scanner.nextInt();

        
            for (int i = 0; i < t; i++) {
        
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int n = scanner.nextInt();

        
                generateSequence(a, b, n);
            }
        } catch (Exception e) {
            System.out.println("Invalid input. Please enter integers only.");
        } finally {
                    scanner.close();
        }
    }
}
