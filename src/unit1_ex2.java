import java.util.Scanner;

public class unit1_ex2 {
    public static void main(String[] args){
        
        Scanner scanner=new Scanner(System.in);
        System.out.println("Escriba temperatura en °C ");
        float temperaturaC=scanner.nextFloat();
        float tempf=conversortemperatura(temperaturaC);
        System.out.println("Temperatura en Fahrenheit= "+tempf);
        //msj ejemplo


    }

    public static float conversortemperatura(Float temperaturaC){
        float tempf=32+(9*temperaturaC/5);        
        return tempf;

    }
}
