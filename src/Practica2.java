import java.util.Scanner;
public class Practica2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1,num2;
        System.out.println("Dame el primer numero");
        num1=sc.nextInt();
        System.out.println("Dame el segundo numero");
        num2=sc.nextInt();
        if(num1>num2){
            System.out.println("El primer numero es mayor que el segundo");
        }else
        {
            System.out.println("El segundo numero es mayor que el primer");
        }

    }
}
