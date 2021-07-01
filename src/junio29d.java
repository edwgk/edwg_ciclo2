import java.util.Scanner;

public class junio29d {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        int numero=scanner.nextInt();
        int resultado=contadorDigitos(numero);
        System.out.println(resultado);
    }
    public static int contadorDigitos(int numero){

        //1990->4 cuantos digitos tiene un numero entero
        int cifras=0;
        while(numero!=0){
            numero/=10;
            cifras++;


        }
        return cifras;
    }
}
