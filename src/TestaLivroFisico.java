
public class TestaLivroFisico {
public static void main(String[] args) {
	LivroFisico lf1 = new LivroFisico();
	
	lf1.autor = "Miguel Rufino";
	lf1.categoria = "Romance";
	lf1.titulo = "O último Romantico";
	lf1.valor = 49.99;
	lf1.aplicarDesconto();
	System.out.println("Valor total com impressão é: " + lf1.getTaxaImpressao() + "\nValor total sem impressão é: " + lf1.valor);
	
}
}
