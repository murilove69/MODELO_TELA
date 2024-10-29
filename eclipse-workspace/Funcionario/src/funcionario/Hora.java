package funcionario;

//Classe Hora tendo a implementação da interface Func.
public class Hora implements Func {

	private double salarioHora;
	private int horasAno;

// Construtor para inicializar os atributos salário por hora e horas anuais.
	public Hora(double salarioHora, int horasAno) {
		this.salarioHora = salarioHora;
		this.horasAno = horasAno;
	}

//Método independente para fazer o calculo dos 10%.
	@Override
	public double calcularBonus() {
		double salarioAnual = salarioHora * horasAno;
		return salarioAnual * 0.10;
	}
}
