package aula1803;

/*** Classe que implementa uma lista linear usando arranjo. **/

public class ListArrayOfInteger {

    // Atributos
    private static final int INITIAL_SIZE = 10;
    private Integer[] data;
    private int count;

    // Construtor padrão da classe
    public ListArrayOfInteger() {
        this(INITIAL_SIZE);
    }

    /**
     * Construtor sobrecarregado
     * @param tam tamanho inicial para data[]
     */
    public ListArrayOfInteger(int tam) {
        if (tam <= 0) {
            tam = INITIAL_SIZE;
        }
        data = new Integer[tam];
        count = 0;
    }

    /**
     * Amplia a capacidade do arranjo
     * @param newCapacity novo tamanho do arranjo
     */
    private void setCapacity(int newCapacity) {
        if (newCapacity != data.length) {
            int min = 0;
            Integer[] newData = new Integer[newCapacity];
            if(data.length < newCapacity) {
                min = data.length;
            } else {
                min = newCapacity;
            }
            for (int i = 0; i < min; i++) {
                newData[i] = data[i];
            }
            data = newData;
        }
    }

    /**
     * Adiciona um elemento ao final da lista.
     * @param element elemento a ser adicionado ao final da lista
     */
    public void add(Integer element) {
        if (count == data.length) {
            setCapacity(data.length * 2);
        }
        data[count] = element;
        count++;
    }

    /**
     * Insere um elemento em uma determinada posição da lista
     * @param index a posição da lista onde o elemento será inserido
     * @param element elemento a ser inserido
     * @throws IndexOutOfBoundsException se (index < 0 || index > size())
     */
    public void add(int index, Integer element) {
        // Primeiro verifica se index é válido
        if ( (index<0) || (index>count) )
            throw new IndexOutOfBoundsException();

        // Verifica se tem espaco
        if (count == data.length) {
            setCapacity(data.length * 2);
        }

        // Insere o elemento em data
        for(int i=count; i>index; i--) { // "Empurra" os elementos para o lado para "abrir espaço"
            data[i] = data[i-1];
        }
        data[index] = element;

        // Atualiza count
        count++;
    }

    /**
     * Retorna o elemento de uma determinada posição da lista.
     * @param index a posição da lista
     * @return o elemento da posição especificada
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public int get(int index) {
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException("Index = " + index);
        }
        return data[index];
    }

    /**
     * Substitui o elemento armazenado em uma determinada posição da lista pelo
     * elemento passado por parâmetro, retornando o elemento que foi substituído
     * @param index a posição da lista
     * @param element o elemento a ser armazenado na lista
     * @return o elemento armazenado anteriormente na posição da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public int set(int index, Integer element) {
        if ((index < 0) || (index >= count)) {
            throw new IndexOutOfBoundsException("Index = " + index);
        }
        Integer aux = data[index]; // guarda o elemento da posição index
        data[index] = element; // coloca o novo elemento na posição index
        return aux; // retorna o elemento que foi substituído
    }


    /**
     * Remove a primeira ocorrência do elemento na lista, se estiver presente
     * @param element o elemento a ser removido
     * @return true se a lista contém o elemento especificado
     */
    public boolean remove(Integer element) {

        // Percorre a lista procurando por element
        for (int i=0; i<count; i++) {
            if (element.equals(data[i])) { // Se achou element
                // Faz a remocao
                for(int j=i; j<count-1; j++) {
                    data[j] = data[j+1];
                }
                data[count-1] = null; // opcional
                // Atualiza o count
                count--;
                // Returna verdadeiro
                return true;
            }
        }
        return false; // Se não encontrou, retorna falso
    }
	
    /**
     * Remove o elemento de uma determinada posição da lista
     *
     * @param index a posição da lista
     * @return o elemento que foi removido da lista
     * @throws IndexOutOfBoundsException se (index < 0 || index >= size())
     */
    public Integer removeByIndex(int index) {
             // Primeiro verifica se index eh valido
         if ( (index<0) || (index>=count) )
            throw new IndexOutOfBoundsException(); 
         
         // Guarda o elemento que sera removido
         Integer elemRemovido = data[index];
         
         // Remover o elemento
         for(int i=index; i<count-1 ;i++) {
             data[i] = data[i+1];
         }
         data[count-1] = null; // opcional
         
         // Atualizar o count
         count--;
         
         // Retorna o elemento removido
        return elemRemovido;
    }


    /**
     * Retorna o índice da primeira ocorrência do elemento na lista, ou -1 se a
     * lista não contém o elemento
     *
     * @param element o elemento a ser buscado
     * @return o índice da primeira ocorrencia do elemento na lista, ou -1 se a
     * lista não contém o elemento
     */
    public int indexOf(Integer element) {
        // Procura elemento no array, se achar retorna o índice
        for (int i = 0; i < count; i++) {
            if (data[i].equals(element)) {
                return i;
            }
        }
        // Neste ponto, não achou: retorna -1
        return -1;
    }



    /**
     * Procura pelo elemento passado por parâmetro na lista e retorna true se a
     * lista contem este elemento.
     * @param element o elemento a ser procurado
     * @return true se a lista contem o elemento passado por parâmetro
     */
    public boolean contains(Integer element) {
        for(int i=0; i<count; i++) {
            if (data[i].equals(element))
                return true;
        }
        return false;
    }


    /**
     * Procura pelo elemento passado por parâmetro na lista e retorna true se a
     * lista contem este elemento.
     * @param element o elemento a ser procurado
     * @return true se a lista contém o elemento passado por parâmetro
     */    
    public boolean containsRecursivo(Integer element) {
        return containsRecursivoAux(element, 0);
    }    
    private boolean containsRecursivoAux(Integer element, int i) {
        if (i>=count)
            return false;
        if (data[i].equals(element))
            return true;
        return containsRecursivoAux(element,i+1);
    }


    /**
     * Esvazia a lista
     */
    public void clear() {
        data = new Integer[INITIAL_SIZE];
        count = 0;
    }

    /**
     * Verificar se a lista está vazia
     * @return true se a lista não contém elementos
     */
    public boolean isEmpty() {
        return (count == 0);
    }

    /**
     * Tamanho da lista (quantidade de elementos)
     * @return o número de elementos da lista
     */
    public int size() {
        return count;
    }


    /**
     * Retorna um arranjo que contem os elementos da lista original entre 
     * fromIndex (inclusivo) e toIndex (exclusivo).
     * @param fromIndex posição a partir da qual os elementos serão inseridos no
     * arranjo a ser retornado
     * @param toIndex indica a posicao final dos elementos que devem ser inseridos
     * @return Retorna um arranjo com um subconjunto dos elementos da lista.
     */   

        public Integer[] subList (int fromIndex , int toIndex) {

            ListArrayOfInteger lista = new ListArrayOfInteger();




            for(int i = fromIndex, j = 0; i < toIndex; i++, j++){
                lista.add(this.data[i]);
            }




          return lista.data;
        }
    
    /**
     * Este método deve inverter o conteúdo da lista. 
     */

        public void reverse() {
            int aux;     

        

            for(int i = 0, j = data.length/2; i < data.length; i++, j--){
                aux = data[i];
                data[j] = data[i];
                data[i] = aux;
            }

        }
     
     /**
      * Conta o número de ocorrências do elemento passado como
      * parâmetro na lista, retornando este valor. 
      * @param element a ser contado
      * @return o total de ocorrencias de element
      */
        int countOccurrences(int element) {
            int count = 0;
            for(Integer nro : data){
                if(nro.equals(element)){
                    count++;
                }
            }
            return count;
        }

     /*
     *
     * */
     @Override
     public String toString() {
        StringBuilder s = new StringBuilder();
        for (int i = 0; i < count; i++) {
            s.append(data[i]);
            if (i != (count - 1)) {
                s.append(" | ");
            }
        }
        s.append("\n");
        return s.toString();
    }
  
}
