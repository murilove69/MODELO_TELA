package funcionario;
//Criando o método para criar o recebimento de bônus do funcionário assalariado.
//Usando o termo implements para IMPLEMENTAR o método na classe.
public class Assalariado implements Func {
 
 private static final double BONUS_FIXO = 5000.00;

 // Método que calcula o bônus fixo para funcionário assalariado.
 @Override
 public double calcularBonus() {
     return BONUS_FIXO;
 }
}

