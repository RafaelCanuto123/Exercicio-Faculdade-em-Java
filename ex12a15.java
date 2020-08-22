import javax.swing.JOptionPane;

public class ex12a15 {
	
	static int numberNP(int numero) {
		if(numero > 0) {
			System.out.println("Numero positivo!");
		}else {
			System.out.println("Numero negativo!");

		}	
		return numero;
		
	}
	static double imc(double peso, double altura) {
		return peso/altura * 2;
	}
	static String nome(String nome) {
		return nome.toLowerCase();
	}
	
	static int triangulo(int lado1, int lado2, int lado3) {
		 
		if(lado1 == lado2 && lado2 == lado3) {
			System.out.println("Triângulo Equilátero!");
		} else if(lado1 == lado2 && lado2 != lado3) {
			System.out.println("Triângulo Isóceles!");
		}else {
			System.out.println("Triângulo Escaleno!");
		}
		return lado3;
		
	}
	
	
	public static void main(String[] args) {
		String operacao = "";
		 while(!operacao.equals("x")) {
			 operacao = JOptionPane.showInputDialog("Bem vindo ao programa:\n"
			 		+ "O que você deseja fazer?\n"
			 		+ "(n) - Verificar se um número é positivo ou negativo:\n"
			 		+ "(i) - Verificar seu IMC:\n"
			 		+ "(l) - Retornar um nome em minúsculo:\n"
			 		+ "(t) - Verificar triângulo:\n"
			 		+ "(x) - Sair do programa");
			 if(operacao.equals("n")) {
				 int number = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
				 numberNP(number);
			 } else if(operacao.equals("i")) {
				 
				 double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o seu peso: "));
				 double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura: "));
				 double resultado = imc(peso, altura);
				 JOptionPane.showMessageDialog(null, "Seu IMC é: " + resultado);
			 } else if(operacao.equals("l")) {
				 String nome = JOptionPane.showInputDialog("Digite o seu nome: ");
				 String resultadoNome = nome(nome);
				 JOptionPane.showMessageDialog(null, "Nome: " + resultadoNome);
			 } else if(operacao.equals("t")) {
				 int lado1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1° lado: "));
				 int lado2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2° lado: "));
				 int lado3 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 3° lado: "));
				 triangulo(lado1, lado2, lado3);
			 }
		 }
		 
	}
	

}
