
public class Impostos {
	Produto p = new Produto();
	private Double iss;
	public void Icms (Produto produto) {
		
		Double A = p.getValor() * 18 / 100;
		Double icms = p.getValor() - A;
		
		System.out.println("ICMS: " +icms);
	}
	
	
	public void Iss (Produto produto) {
		Double B = p.getValor() * 5 / 100;
		iss = p.getValor() - B;
		
	}
	
	
	public void Ipi (Produto produto) {
		Double C = p.getValor() * 10 / 100;
		Double ipi = p.getValor() - C;

	}
	
	
	public void ValorT (Produto produto) {
		Double valorTotal = p.getValor();
	}
}
