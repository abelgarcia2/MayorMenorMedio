import java.util.Scanner;

public class MayorMenorMedio {
    public static void main(String[] args) {
        // DECLARACION DE VARIABLES
        Scanner sc = new Scanner(System.in);
        int num1, num2, num3;
        int mayor, menor, medio;

        // PEDIMOS LOS NUMEROS
        System.out.println("Introduce un número");
        num1 = sc.nextInt();
        System.out.println("Introduce un número");
        num2 = sc.nextInt();
        System.out.println("Introduce un número");
        num3 = sc.nextInt();

        // CUAL ES EL MAYOR?
        if (num1 > num2 && num1 > num3) {
            mayor = num1;
        } else if (num2 > num1 && num2 > num3) {
            mayor = num2;
        } else {
            mayor = num3;
        }

        // CUAL ES EL MENOR?
        if (num1 < num2 && num1 < num3) {
            menor = num1;
        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
        } else {
            menor = num3;
        }

        //CUAL ES EL DEL MEDIO?
        if (num1==mayor && num2==menor){
            medio=num3;
        }else if(num2==mayor && num3==menor){
            medio=num1;
        }else{
            medio=num2;
        }

        //MUESTRALOS
        System.out.println("Los números introducidos son: "+num1+", "+num2+", "+num3);
        System.out.println("El mayor es: "+mayor);
        System.out.println("El del medio es: "+medio);
        System.out.println("El menor es: "+menor);

    }

}
