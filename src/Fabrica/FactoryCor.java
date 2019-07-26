package Fabrica;

import java.awt.Component;

import Entidades.CorAzulGui;
import Entidades.CorGui;
import Entidades.VerdeCorGui;
import Entidades.VermelhoCorGui;

public class FactoryCor {

	public CorGui criarCorPelo( String nome) {
		CorGui cor = null;

		if ("vermelho".equals(nome)) {
			cor = new VermelhoCorGui("Tele " + nome);
			cor.corViews();
		} else if ("verde".equals(nome)) {
			cor = new VerdeCorGui("Tele " + nome);
			cor.corViews();
		} else if ("azul".equals(nome)) {
			cor = new CorAzulGui("Tele " + nome);
			cor.corViews();
		}

		return cor;

	}

}
