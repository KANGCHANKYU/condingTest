import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int a = 472;
        int b = 385;
        ArrayList<Integer> arr = new ArrayList<>();
        int result = a * b;

        while (b > 0) {
            arr.add(b % 10);
            b /= 10;
        }

        for(int i = 0; i < arr.size(); i++){
            int n = arr.get(i) * a;
            System.out.println(n);
        }

        System.out.println(result);
    
    }

    // public void math1(){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     System.out.println(a+b);
    // }

    // public void math2(){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     System.out.println(a-b);
    // }

    // public void meth3(){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     System.out.println(a*b);
    // }
    // public void meth4(){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     System.out.println(a/b);
    // }
    // public void meth5(){
    //     Scanner sc = new Scanner(System.in);
    //     double a = sc.nextDouble();
    //     double b = sc.nextDouble();
    //     sc.close();
    //     System.out.print(a/b);
    // }
    // public void meth6(){
    //     Scanner sc = new Scanner(System.in);
    //     int a = sc.nextInt();
    //     int b = sc.nextInt();
    //     System.out.println(a+b);
    //     System.out.println(a-b);
    //     System.out.println(a*b);
    //     System.out.println(a/b);
    //     System.out.println(a%b);
    // }
    // public void meth7(){
    //     Scanner sc = new Scanner(System.in);
    //     int n = sc.nextInt();
    //     for(int i = n; i < 10; i++){
    //             System.out.println(n + " * " + i + " = " + n * i);
    //     }
    // }
    // public void meth8(){
        // Scanner sc = new Scanner(System.in);
        // int a = sc.nextInt();
        // int b = sc.nextInt();
        // int c = sc.nextInt();
        // System.out.println((a+b)%c);
        // System.out.println(((a%c)+(b%c))%c);
        // System.out.println((a*b)%c);
        // System.out.println(((a%c)*(b%c))%c);
    // }
    // public void meth9(){
    //     Scanner sc = new Scanner(System.in);
    //     int year = sc.nextInt();
    //     if(year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
    //         System.out.println(1);
    //     else
    //         System.out.println(0);
    // }
    // public void meth10(){
    //     Scanner sc = new Scanner(System.in);
    //     // int n = sc.nextInt();
    //     int n = 3;
    //     int result = n;
    //     for(int i = 1; i < n; i++){
    //         result += i;
    //     }
    //     System.out.println(result);
    // }
    // public void meth10(){
    //     Scanner sc = new Scanner(System.in);
    //     // int n = sc.nextInt();
    //     int a = 472;
    //     int b = 385;
    //     ArrayList<Integer> arr = new ArrayList<>();
    //     int result = a * b;

    //     while (b > 0) {
    //         arr.add(b % 10);
    //         b /= 10;
    //     }

    //     for(int i = 0; i < arr.size(); i++){
    //         int n = arr.get(i) * a;
    //         System.out.println(n);
    //     }

    //     System.out.println(result);
    // }

}
