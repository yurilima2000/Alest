package aula2802.b;



public class B {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int[] aux = inverteArray(array);

        System.out.println("ARRAY INVERTIDO: ");
        for(int i = 0; i < aux.length; i++){
            System.out.println(aux[i]);
        }
        
        int nro = 8;
        System.out.println("PROCURANDO O NRO " + nro + "...");
        for(int i = 0; i < aux.length; i++){
            if(aux[i] == nro){
                System.out.println("nro lido: " + aux[i] + " |  Índice: " + i);
                break;
            }

            if(i == aux.length-1){
                System.out.println("VALOR " + nro + " NAO ENCONTRADO");
            }
        }

    }

    public static int[] inverteArray(int[] array){

        int[] aux = new int[array.length];

        for(int i = array.length-1,j = 0; i >= 0; i--, j++){
            aux[i] = array[j];    
        }

        return aux;
    }
}
