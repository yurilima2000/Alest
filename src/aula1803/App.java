package aula1803;


public class App {

    public static void main(String[] args) {
        ListArrayOfInteger lista = new ListArrayOfInteger();
        lista.add(2);
        lista.add(4);
        lista.add(6);
        lista.add(8);
        lista.add(10);
        lista.add(12);

        System.out.println("\n------------------- LISTA COM ARRANJOS -------------------\n");
        System.out.println("Lista inicial: ");
        System.out.println(lista);
        System.out.println("Acessar o valor da primeira posição: " + lista.get(0));

        System.out.println("\n---------------------- REMOÇÃO ---------------------------\n");
        System.out.println("Removeu o 2? " + lista.remove(2));
        System.out.println(lista);
        System.out.println("Removeu o 22? " + lista.remove(22));
        System.out.println(lista);
        System.out.println("Removeu o 12? " + lista.remove(12));
        System.out.println(lista);
        System.out.println("Lista apos remocoes \n" + lista);
        System.out.println("Trocou " + lista.set(0, 2) + " por " + lista.get(0));
        System.out.println(lista);

        System.out.println("-------------------- VERIFICAÇÃO --------------------------\n");
        System.out.println("Lista contem 5? " + lista.contains(5));
        System.out.println("Lista contem 10? " + lista.contains(10));

        System.out.println("------------------- ÍNDICE -----------------------------\n");
        System.out.println("Índice do valor 0: " + lista.indexOf(0));
        System.out.println("Índice do valor 8: " + lista.indexOf(8));

        System.out.println("\n--------------------- INSERÇÃO --------------------------\n");
        System.out.println("Adicionando valor 0 no início da lista:");
        lista.add(0, 0);
        System.out.println(lista);
        System.out.println("Adicionando valor 4 no meio da lista:");
        lista.add(2, 4);
        System.out.println(lista);
        System.out.println("Adicionando valor 14 no final da lista:");
        lista.add(lista.size(), 14);
        System.out.println(lista);
        System.out.println("Adicionando valor 4 no final da lista:");
        lista.add(4);
        System.out.println(lista);

      


        System.out.println("\n------------------ SUBLISTAS -------------------------\n");
        System.out.println("Sublista (2, 6)");
        Integer v[] = lista.subList(2, 6);
        for (int i = 0; i < v.length; i++)
            System.out.print(v[i] + " | ");



        System.out.println("\n\n--------------- RERVERSÃO -------------------------\n");
        lista.reverse();
        System.out.println("Lista após reverse:");
        System.out.println(lista);

        System.out.println("------------------ OCORRÊNCIAS ------------------------\n");
        System.out.println("Total ocorrências 8: " + lista.countOccurrences(8));
        System.out.println("Total ocorrências 4: " + lista.countOccurrences(4));

    }
}
