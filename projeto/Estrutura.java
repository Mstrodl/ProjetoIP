package projeto;

public class Estrutura {
	private ListaNPC NPC;
	private ListaTreinadores Treinadores;
	private String Insignia;

	public Estrutura(){
		this.NPC = null;
		this.Treinadores = null;
		this.Insignia = null;
	}

	public String getinsignia (){
		return this.Insignia;
	}

	public void requisitor (treinador) throws PExeption, IExeption{


		for (int x = 0; x<6;x++){
			if (treinador.pokemons.getpokemons[x]!=null){
				boolean permission = true;
			} else {
				permission = false;
				PExeption a;
				a = PExeption(treinador.pokemons);
				throw a;
			}
		}
		if (treiandor.insignia.getinsignia() == this.Insignia){
			permission = true;
		} else {
			permission = false;
			IExeption b;
			b = IExeption (treinador.insignia);
			throw b;
		}
		if (permission == true){
			// metodo interagir.
		}
	}

}
