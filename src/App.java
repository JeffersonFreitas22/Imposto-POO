
public class App {
	
    public static void main(String[] args) {

        Produto p = new Produto();

        p.setNome("Borough Mid 2");
        p.setValor(290.00);

        Impostos imp = new Impostos();

        System.out.println("Produto: " + p.getNome());
        System.out.println("Preço Original: R$ " + p.getValor());

        imp.Icms(p);

    }
}
