
public class Impostos {
	
	public Double calcularIcms (Produto p) {
		Double icms = p.getValor() * 0.18;
		return icms;
	}
	
	public Double calcularIss (Produto p) {
		Double iss = p.getValor() * 0.05;
		return iss;
	}
	
	public Double calcularIpi (Produto p) {
		Double ipi = p.getValor() * 0.1;
		return ipi;
	}
}
