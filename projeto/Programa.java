package projeto;

public class Programa {
	/**
	 * Make a battle between the player and a wild pokémon
	 * 
	 * @param player
	 * @param selvagem
	 * @return boolean
	 */
	public static boolean batalhar(Player player, Pokemon selvagem) {
		int i = 1;
		Pokemon maisForte = player.getPokemon(0);
		while(true) {
			Pokemon p = player.getPokemon(i);
			if(p == null) break;

			if(p.getNivel() > maisForte.getNivel()) {
				maisForte = p;
			}
			
			i++;
		}
			
		return maisForte.getNivel() >= selvagem.getNivel();
	}
	
	public static void main(String[] args) {
		return;
	}
}
