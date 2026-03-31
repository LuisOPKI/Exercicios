package lista2.exercicio3;

public class PessoaTeste {
	public static void main(String[] args) {
		
		Pessoa pessoa1 = new Pessoa();
		Pessoa pessoa2 = new Pessoa();
		Pessoa pessoa3 = new Pessoa();
		
		pessoa1.nome = "Rodrigo Garro";
		pessoa1.sexo = "Masculino";
		pessoa1.cpf = "111.222.333-44"; 
		pessoa1.idade = 28;
		pessoa1.altura = 1.74;
		pessoa1.peso = 72.5;

		pessoa2.nome = "Memphis Depay";
		pessoa2.sexo = "Masculino";
		pessoa2.cpf = "555.666.777-88"; 
		pessoa2.idade = 32;
		pessoa2.altura = 1.76;
		pessoa2.peso = 78.0;

		pessoa3.nome = "Yuri Alberto";
		pessoa3.sexo = "Masculino";
		pessoa3.cpf = "999.000.111-22"; 
		pessoa3.idade = 25;
		pessoa3.altura = 1.82;
		pessoa3.peso = 78.0;
		
		pessoa1.andar();
		pessoa2.correr();
		pessoa3.dormir();
		pessoa1.falar();
		
	}
}
