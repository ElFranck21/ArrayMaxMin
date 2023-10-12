/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package arrayMaxMin;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author maris
 */
public class ArrayMaxMin {
    public static BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    public static String entrada;

    
    public static void main(String[] args) throws IOException{
        int a;
        int par=0; 
        int imp=0;
        System.out.print("Introduzca"+ " el tamaño del arreglo: ");
        entrada = bufer.readLine();
        a = Integer.parseInt(entrada);

        int[] arreglo = new int[a];

        for (int i = 0; i < a; i++) {
            System.out.print("Introduzca el valor entero..." + (i + 1) + ": ");
            entrada = bufer.readLine();
            arreglo[i] = Integer.parseInt(entrada);
        }

        int maximo = arreglo[0]; 
        int minimo = arreglo[0]; 

        for (int i = 1; i < a; i++) {
            if (arreglo[i] > maximo) {
                maximo = arreglo[i];
            }
            if (arreglo[i] < minimo) {
                minimo = arreglo[i]; 
            }
        }
        for (int i=0;i<arreglo.length; i++ ){
            if (arreglo [i]%2==0){
                par++;
            }
            else {
                imp++;
               }
        }
        System.out.println("El valor máximo es: " + maximo);
        System.out.println("El valor mínimo es: " + minimo);
        System.out.println("El numero de numeros pares es: "+par);
        System.out.println("El numero de numeros impares es: "+imp);
}
}