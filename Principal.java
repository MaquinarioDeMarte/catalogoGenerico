public class Principal {
    Catalogo<String> catalogString = new Catalogo<>();
    Catalogo<Integer> catalogInteger = new Catalogo<>();
    public static void main(String[] args) throws Exception {
        Principal principal = new Principal();

        principal.catalogString.adicionar("Matrix");
        principal.catalogString.adicionar("O Poderoso Chefão");
        principal.catalogString.adicionar("Clube da Luta");

        principal.catalogInteger.adicionar(101);
        principal.catalogInteger.adicionar(202);
        principal.catalogInteger.adicionar(303);

        System.out.println("=== Exibindo via método genérico ===");
        System.out.println();
        System.out.println("Catalogo de Filmes:");
        Catalogo.exibirCatalogoGenerico(principal.catalogString);
        System.out.println("-----------------------------");
        System.out.println("Catalogo de Códigos:");
        Catalogo.exibirCatalogoGenerico(principal.catalogInteger);
        System.out.println("-----------------------------");
    }
}
