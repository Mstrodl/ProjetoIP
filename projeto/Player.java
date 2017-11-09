package projeto;

public class Player {
	private Pokemon[] inventario;
	private int insignias;
	public String nome;

	public Player(String nome, Pokemon inicial) {
		this.inventario = new Pokemon[5];
		this.insignias = 0;
		this.nome = nome;
	}

	public class Tipos {
		public final int POKEMON = 0;
		public final int NPC = 1;
		public final boolean MODO_DERROTAR = true;
		public final boolean MODO_CAPTURAR = false;
	}

	public void procurar(int a, int b) {

		if (a == 0) {// Pokemon Battle
			Pokemon selvagem = new Pokemon(b);
			if (Programa.batalhar(this, selvagem)) {
				inserirXP(selvagem.getNivel());
			}
		} else if (a == 1) {// NPC Battle
			Pokemon NPC = new Pokemon(b);// AQUI NPC TA COMO POKEMON!!!
			if (Programa.batalhar(this, NPC)) {
				inserirXP(NPC.getNivel());
			}
		}

	}

	public void procurar(int a, boolean b) {

		if (b) {// Derrotar
			Pokemon selvagem = new Pokemon(100);// Um pokemon de nivel random
			if (Programa.batalhar(this, selvagem)) {
				inserirXP(selvagem.getNivel());
			}

		} else {// Capturar
			Pokemon selvagem = new Pokemon(100);// Um pokemon de nivel random
			if (Programa.batalhar(this, selvagem)) {
				inserirPokemon(selvagem);
			}
		}

	}

	public Pokemon getPokemon(int n) {
		return this.inventario[n];
	}

	public void inserirPokemon(Pokemon p) {
		for (int i = 0; i < 5; i++) {
			if (this.inventario[i] == null) {
				inventario[i] = p;
				i = 10;
			}
		}
	}

	public void inserirXP(int x) {
		int i = 0;
		while (this.inventario[i] != null)
			inventario[i].inserirNivel(x / 10);
	}
	/*
	 * public void desafiarEstrutura(){ Lista Estrutura = new Lista();//Trocar o
	 * tipo da lista if(Lista.lutar(this)){ this.insignias++; }//Else }
	 * 
	 */
}