import java.util.Scanner;

public class unit1_ejercicios01 {
    public static void main(String[] args){

        Scanner numero=new Scanner(System.in);
        System.out.println("Escriba primer numero:");
        float numero1=numero.nextFloat();
        
        System.out.println("Escriba segundo numero:");
        float numero2=numero.nextFloat();
        
        float resultado=numero1+numero2;
        String operacion="Suma";
        System.out.println("La "+operacion+" de "+numero1+" y "+numero2+" es igual a "+resultado);

        
        
        
    }
}
