package Implementation;

public class SupermercadoArray implements Supermarket{

    private final String [] items;

    private int lastIndex;

    public SupermercadoArray(final int size) {
        items = new String[size];
        lastIndex = -1;
    }


    @Override
    public void add(String item) {
        if (lastIndex == items.length-1) {
            System.err.println("Lista de Supermercado cheia");
        } else {
            lastIndex++;
            items[lastIndex] = item;
        }
    }

    @Override
    public void delete(final int index) {
        if(index >= 0 && index <= lastIndex){
            shift(index);
            lastIndex--;
        } else {
            System.err.println("Indice inválido");
        }
    }

    private void shift(final int index) {
        for (int i = lastIndex; i < lastIndex; i++) {
            items[i] = items[i+1];
        }
    }

    @Override
    public void print() {
        System.out.println("##########################");
        if(lastIndex  < 0) {
            System.out.println("Lista de Supermercado vazia");
        }
        for (int i = 0; i <= lastIndex; i++) {
            System.out.println(i + "-" + items[i]);
        }
        System.out.println("##########################");
    }
}
