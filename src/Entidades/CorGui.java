package Entidades;

import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;

public abstract class CorGui extends JFrame {
	Container container;

	public CorGui( String nome) {
		// O nome da Janela
		super(nome);
		this.container = this.getContentPane();
		this.container.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		this.setSize(900, 900);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}

	public abstract void corViews();

}
