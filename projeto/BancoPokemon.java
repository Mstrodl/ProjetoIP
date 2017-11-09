package projeto;

public class BancoPokemon {
	private String PokemonsA[];
	private String PokemonsF[];
	private String PokemonsP[];
	
	public BancoPokemon() {
		PokemonsA = new String [30];
		PokemonsF = new String [11];
		PokemonsP = new String [14];
	}
	
	public String pegarpokemon (int a , int b) {
		if(a==1) {
			return PokemonsA[b];
		} else if (a==2) {
			return PokemonsF[b];
		} else {
			return PokemonsP[b];
		}
	}
	
    PokemonsA[0] = "Squirtle";
    PokemonsA[1] = "Wartortle";
    PokemonsA[2] = "Blastoise";
    PokemonsA[3] = "Psyduck";
    PokemonsA[4] = "Golduck";
    PokemonsA[5] = "Poliwag";
    PokemonsA[6] = "Poliwhirl";
    PokemonsA[7] = "Poliwrath";
    PokemonsA[8] = "Tentacool";
    PokemonsA[9]= "Tentacruel";
    PokemonsA[10] = "Slowpoke";
    PokemonsA[11] = "Slowbro";
    PokemonsA[12] = "Seel";
    PokemonsA[13] = "Dewgong";
    PokemonsA[14] = "Shellder";
    PokemonsA[15] = "Cloyster";
    PokemonsA[16] = "Krabby";
    PokemonsA[17] = "Kingler";
    PokemonsA[18] = "Horsea";
    PokemonsA[19] = "Seadra";
    PokemonsA[20] = "Goldeen";
    PokemonsA[21] = "Seaking";
    PokemonsA[22] = "Staryu";
    PokemonsA[23] = "Starmie";
    PokemonsA[24] = "Magikarp";
    PokemonsA[25] = "Gyarados";
    PokemonsA[26] = "Lapras";
    PokemonsA[27] = "Vaporeon";
    PokemonsA[28] = "Omanyte";
    PokemonsA[29] = "Omastar";
    PokemonsF[0] = "Charmander";
    PokemonsF[1] = "Charmeleon";
    PokemonsF[2] = "Charizard";
    PokemonsF[3] = "Vulpix";
    PokemonsF[4] = "Ninetales";
    PokemonsF[5] = "Growlithe";
    PokemonsF[6] = "Arcanine";
    PokemonsF[7] = "Ponyta";
    PokemonsF[8] = "Rapidash";
    PokemonsF[9] = "Magmar";
    PokemonsF[10] = "Flareon";
    PokemonsP[0] = "Bulbasaur";
    PokemonsP[1] = "Ivysaur";
    PokemonsP[2] = "Venusaur";
    PokemonsP[3] = "Oddish";
    PokemonsP[4] = "Gloom";
    PokemonsP[5] = "Vileplume";
    PokemonsP[6] = "Paras";
    PokemonsP[7] = "Parasect";
    PokemonsP[8] = "Bellsprout";
    PokemonsP[9] = "Weepinbell";
    PokemonsP[10] = "Victreebel";
    PokemonsP[11] = "Exeggcute";
    PokemonsP[12] = "Exeggutor";
    PokemonsP[13] = "Tangela";
}
