package projeto;

public class Player {
	private InventarioTreinador inventario;
	private int insignias;
	public String nome;

	public Player(String nome, Pokemon inicial) {
		this.inventario = new InventarioTreinador(inicial);
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
			BancoPokemon Selvagem = new BancoPokemon(b);
			if (Programa.batalhar(this,Selvagem)) {
				inventario.inserirXP(this,Selvagem.getNivel());
			}
		} else if (a == 1) {// NPC Battle
			BancoPokemon NPC = new BancoPokemon(b);//AQUI NPC TA COMO POKEMON!!!
			if (Programa.batalhar(this,NPC)) {
				inventario.inserirXP(this,NPC.getNivel());
			}
		}
		
	}

	public void procurar(int a, boolean b) {

		if (b) {//Derrotar
			BancoPokemon selvagem = new BancoPokemon(100);//Um pokemon de nivel random
			if (Programa.batalhar(this,selvagem)) {
				inventario.inserirXP(this,selvagem.getNivel());
			}
			
		} else {//Capturar
			BancoPokemon Selvagem = new BancoPokemon(100);//Um pokemon de nivel random
			if (Programa.batalhar(this,Selvagem)) {
				inventario.inserirPokemon(this,Selvagem);
			}
		}
	
	}
	
	public void desafiarEstrutura(){
		Lista Estrutura = new Lista();//Trocar o tipo da lista
		if(Lista.lutar(this)){
			this.insignias++;
		}//Else
	}
	

}