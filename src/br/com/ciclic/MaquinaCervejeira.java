package br.com.ciclic;

import java.util.HashMap;
import java.util.Map;

public class MaquinaCervejeira {

	private Cerveja cervejaEscolhida;
	private Map<String, Cerveja> cervejas = new HashMap<String, Cerveja>();
	String msg;

	public MaquinaCervejeira() {

		cervejaEscolhida = null;
		cervejas.put("WEISSBIER", new Cerveja("Weissbier", -1, 3));
		cervejas.put("PILSEN", new Cerveja("Pilsen", -2, 4));
		cervejas.put("WEIZENBIER", new Cerveja("Weizenbier", -4, 6));
		cervejas.put("RED ALE", new Cerveja("RED ALE", -5, 5));
		cervejas.put("INDIA PALE ALE", new Cerveja("India pale ale", -1, 3));
		cervejas.put("IPA", new Cerveja("IPA", -7, 10));
		cervejas.put("DUNKEL", new Cerveja("Dunkel", -8, 2));
		cervejas.put("IMPERIAL STOUTS", new Cerveja("Imperial Stouts", -10, 13));
		cervejas.put("BROWM ALE", new Cerveja("Brown ale", 0, 14));
	}

	public void escolherCerveja(String cerveja) {
		cervejaEscolhida = cervejas.get(cerveja);
	}

	public String display() {
					return cervejaEscolhida != null ? "A temperatura ideal para a cerveja tipo " + cervejaEscolhida.getEstilo()
			+ " é de " + String.valueOf(cervejaEscolhida.getTemperaturaMinima() + "°"):"Quer saber qual é a temperatura ideal para o consumo da sua cerveja preferida? \nDigite o estilo dela, "
			+ "se é Pilsen, Red Ale, IPA ou outro que goste muito, ou se quiser desistir, digite SAIR: ";
		}
					
	}


