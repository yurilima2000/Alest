package aula2802.c;
import java.util.Random;

public class C {


    public static void main(String[] args) {

        int[][] matriz = new int[4][5];
        Random rdm = new Random();




        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){

                int aux = rdm.nextInt(10);
                aux += 90;
                matriz[i][j] = aux;
              
            }
        }

       
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
               

                System.out.print(matriz[i][j] + " ");
              
            }
            System.out.println();
        }
        

    }
}
