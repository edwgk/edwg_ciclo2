import java.util.Scanner;

public class unit1_ejercicios01 {
    public static void main(String[] args){
        
        Scanner numero=new Scanner(System.in);
        System.out.println("Escriba primer numero:");
        float numero1=numero.nextFloat();
        System.out.println("Escriba segundo numero:");
        float numero2=numero.nextFloat();

        float resultado=sumar(numero1,numero2);
        float resultado2=restar(numero1,numero2);
        float resultado3=multiplicar(numero1,numero2);
        
        
        
        
    }

    public static float sumar(float numero1,float numero2){
        float resultado=numero1+numero2;
        String operacion="Suma";
        System.out.println("La "+operacion+" de "+numero1+" y "+numero2+" es igual a "+resultado);

        return resultado;
    }

    public static float restar(float numero1,float numero2){
        float resultado2=numero1-numero2;
        String operacion="Resta";
        System.out.println("La "+operacion+" de "+numero1+" y "+numero2+" es igual a "+resultado2);

        return resultado2;
    }
    public static float multiplicar(float numero1,float numero2){
        float resultado3=numero1*numero2;
        String operacion="Multplicacion";
        System.out.println("La "+operacion+" de "+numero1+" y "+numero2+" es igual a "+resultado3);

        return resultado3;
    }
    
        

        
        
}