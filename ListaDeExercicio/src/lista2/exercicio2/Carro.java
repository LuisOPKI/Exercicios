package lista2.exercicio2;

public class Carro {
	
	String modelo;
	String marca;
	String cor;
	int ano;
	int renavam;
	String chassi;
	String placa;
	boolean partidaCarro = false;
	int velocidadeCarro = 0;
	
	public void ligar() {
		if (partidaCarro == false && velocidadeCarro == 0) {
			System.out.println("O " + modelo + " está ligando!");
			partidaCarro = true;
		}
		else {
			System.out.println("O " + " já está ligado");
		}
	}
	public void desligar() {
		if (partidaCarro == true && velocidadeCarro == 0) {
		System.out.println("O " + modelo + " está desligando!");
		partidaCarro = false;
		}
		else{
			System.out.println("O " + " já está desligado");
		}
	}
	public void frear() {
		if(velocidadeCarro > 0 && partidaCarro == true) {
		velocidadeCarro = velocidadeCarro - 10;
		System.out.println("O " + modelo + " está freando, sua velocidade é agora de " + velocidadeCarro + "KM/h");
		}
		else {
			System.out.println("O " + modelo + " está parado!");
		}
	}
	public void acelerar() {
		if (partidaCarro == true){
			velocidadeCarro = velocidadeCarro + 10;
			System.out.println("O " + modelo + " está acelerando, sua velocidade é agora de " + velocidadeCarro + "KM/h");
		}
		else {
			System.out.println("O " + modelo + " está desligado!");
		}

	}

}
