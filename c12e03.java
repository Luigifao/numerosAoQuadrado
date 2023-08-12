package Exerci_MOD3;
import java.util.Scanner;
public class c12e03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vet[] = new int[10];
     for(int aux=0;aux<10;aux++){
        System.out.print("Digite um valor: ");
        vet[aux]=teclado.nextInt();

     }
     for(int aux=0;aux<10;aux++){
        System.out.print(Math.pow(vet[aux],2));
     }
     teclado.close();   
    }
}
