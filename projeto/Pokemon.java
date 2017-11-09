package projeto;

import java.util.Random;

public class Pokemon {
	private String pokemon;
	private double nivel;
	private String tipo;
	
	
	Pokemon(int nivel){
		Random gerador = new Random();
		int numero = gerador.nextInt(3);
		if (numero == 1) {
			Random gerador2 = new Random();
			int numero2 = gerador2.nextInt(30);
			this.pokemon = BancoPokemon.pegarpokemon(numero,numero2);
			Random gerador3 = new Random();
			int numero3 = gerador3.nextInt(nivel);
			this.nivel = numero3;
			this.tipo = "Agua";
		} else if (numero == 2) {
			this.tipo = "Fogo";
		} else {
			this.tipo = "Planta";
		}
	}
	
}
