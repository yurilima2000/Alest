package aula2802.d;

import java.util.Random;
import java.util.Scanner;

public class D {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);
        
        Random rdm = new Random();
        int aux = rdm.nextInt(51);
        
      
        
        for(int i =0; i<=10; i++){
            System.out.println("DIGITE UM NUMERO: ");
            int nro = in.nextInt();

            if(nro > aux){
                System.out.println("nro secreto eh MENOR");
            }

            if(nro < aux){
                System.out.println("nro secretp eh MAIOR");
            }

            if(nro == aux){
                System.out.println("PARABENS VC ACERTOU");
                int tentativas = i+1;
                System.out.println("TENTATIVAS: " + tentativas);

                System.exit(0);
            }


        }

        System.out.println("BOA SORTE NA PROXIMA");
        



    }
}
