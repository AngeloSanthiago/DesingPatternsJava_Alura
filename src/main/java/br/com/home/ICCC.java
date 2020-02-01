package br.com.home;

public class ICCC implements Imposto {

	public double calcula(Orcamento orcamento) {
	double valorOrcamento = orcamento.getValor();
	double valorICCC = 0;
	if (valorOrcamento < 1000.0) {
		valorICCC = valorOrcamento * 0.05;
		System.out.println("taxa de 5%");
	} else if(valorOrcamento >= 1000.0 && valorOrcamento <= 3000.0){
		valorICCC = valorOrcamento * 0.07;
		System.out.println("taxa de 7%");
	} else {
		valorICCC = (valorOrcamento * 0.08) + 30.0;
		System.out.println("taxa de 8% + 30.0");
	}
		return valorICCC;
	}
}
