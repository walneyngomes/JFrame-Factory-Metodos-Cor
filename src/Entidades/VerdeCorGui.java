package Entidades;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class VerdeCorGui extends CorGui{
	

	public VerdeCorGui(String nome) {
		super( nome);
		super.container.add(new JLabel(" FABRICA PRODUZIU UMA COR VERDE"));
		super.container.add(new JLabel(" CONFIRA ABAIXO "));

	}

	private Color nome() {
		// TODO Auto-generated method stub
		return Color.GREEN;
	}

	@Override
	public void corViews() {
		// TODO Auto-generated method stub
		JPanel painel1 = new JPanel();
		painel1.setBackground(this.nome());
		painel1.setPreferredSize(new Dimension(255, 89));
		// Add no Containers
		this.container.add(painel1);
		this.setSize(300, 900);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		this.setResizable(false);

	}

}
