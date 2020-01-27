package br.com.home;

public class CalculadorDeImpostos {
	public void realizaCalculo(Orcamento orcamento, Imposto impostoQualquer) {
			double impostoCalculado = impostoQualquer.calcula(orcamento);
			System.out.println(impostoCalculado);
	}

}
