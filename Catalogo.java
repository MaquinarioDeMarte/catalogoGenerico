public class Catalogo<T> {
    private List<T> lista = new ArrayList<>();

    public void adicionar(T item) {
        lista.add(item);
    }

    public void listar() {
        for (T item : lista) {
            System.out.println(item);
        }
    }

    public int tamanho() {
        return lista.size();
    }

    
}

