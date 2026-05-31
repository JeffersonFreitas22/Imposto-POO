import java.util.Scanner;

public class App {
	
    public static void main(String[] args) {
    	
    	//Criar Scanner 
    	Scanner in = new Scanner (System.in);

    	//Puxar dados de outra classe
    	Produto p = new Produto();
        Impostos i = new Impostos();

        //Lendo as infornações do produto
        System.out.println("Nome do produto: ");
        p.setNome(in.nextLine());
        System.out.println("Valor do produto: ");
        p.setValor(in.nextDouble());
        
        //Calcular valor liquido
        Double total = p.getValor() + i.calcularIcms(p) + i.calcularIss(p) + i.calcularIpi(p);

        //Apresentar valores
        System.out.println("Produto: " + p.getNome());
        System.out.println("Valor bruto: " + p.getValor());
        System.out.println("Icms: " + i.calcularIcms(p));
        System.out.println("Iss: " +i.calcularIss(p));
        System.out.println("Ipi: " +i.calcularIpi(p));
        System.out.println("Valor liquido: " + total);
        
        in.close();
    }
}
