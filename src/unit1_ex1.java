import java.util.Scanner;

public class unit1_ex1 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ingresa un numero:");
        int numero=scanner.nextInt();
        long n1=numero*2;
        long n2=numero*3;
        System.out.println("El doble es "+n1);
        System.out.println("El triple es "+n2);
    }
}
