package aula1103;

public class App{


    public static void main(String[] args){

        System.out.println("===================================");


        System.out.println("FUNC 1");
        for(int i = 10; i <= 50; i+=10){


            System.out.println(f1(i));



        }

        System.out.println("===================================");

        System.out.println("FUNC 2");
        for(int i = 10; i <= 50; i+=10){
            System.out.println(f2(i));

        }



    }


    public static int f1(int n) { 
        int r = 0;
     
        for (int i = 1; i < n; i++) {
            for (int j = i; j < i+2; j++) {
                for (int k = 1; k < i; k++) 
                    r = r + 1;
            }
        }
        return r; 
    }

    public static int f2(int n) {
        int r = 0;
    
        for(int x = 1; x < n; x++) { 
            for(int y = x; y < x+2; y++) {
                for(int z = y; z < y+2; z++) 
                    r = r + 1;
            }
        }
        return r;
    }

}