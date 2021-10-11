
public class ImpostoRenda {

	public static void main(String[] args) {
		double salario = 2800.0;

		if (salario < 2500.0) {
			System.out.println("A sua Aliquota e de 15 %");
			System.out.println("Você pode deduzir até R$350");
		} else if (salario >= 2500.0 && salario <= 3800.0) {
			System.out.println("A sua Aliquota e de 18%");
			System.out.println("Você pode deduzir até R$500");
		}
		if (salario > 3800.00) {
			System.out.println("Sua Aliquota e de 23%");
			System.out.println("Você pode deduzir até R$630");
		} 

	}

}
