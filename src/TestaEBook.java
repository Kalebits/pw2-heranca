
public class TestaEBook {
public static void main(String[] args) {
	EBook eb1 = new EBook();
	eb1.autor = "Jos� Almeida";
	eb1.categoria = "Romance";
	eb1.titulo = "O �ltimo Romantico";
	eb1.valor = 49.99;
	eb1.setMarcaDagua("Kaleb");
	eb1.aplicarDesconto();
	
	System.out.println("Valor total: " + eb1.valor);
	
}
}
