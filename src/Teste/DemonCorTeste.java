package Teste;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import Anotacao.WALNEYNEGREIROSGOMES;
import Fabrica.FactoryCor;
@WALNEYNEGREIROSGOMES
public class DemonCorTeste extends JFrame {
	public JTextField informacao1;

	public DemonCorTeste() {

		Container tela = this.getContentPane();
		tela.setLayout(new FlowLayout(FlowLayout.LEFT));

		JButton botaoMgs = new JButton("NAO CLIQUE AQUI");
		botaoMgs.addActionListener(new TrataCliqueBotao());

		JPanel painel1 = new JPanel();

		painel1.setBackground(Color.BLUE);
		painel1.setToolTipText("Digite nome cor");
		painel1.setPreferredSize(new Dimension(255, 89));

		informacao1 = new JTextField("Digite nome cor");
		informacao1 = new JTextField(50);

		informacao1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent evento) {
				FactoryCor cor = new FactoryCor();
				cor.criarCorPelo(informacao1.getText());
			}
		}

		);
		tela.add(new JLabel("EXEMPLO = azul  "));
		tela.add(new JLabel(" COR AO ABAIXO "));
		tela.add(informacao1);
		tela.add(botaoMgs);
		tela.add(painel1);
		tela.add(new JLabel("DIGITE UMA COR "));

		tela.add(new JLabel(" azul "));
		tela.add(new JLabel(" verde "));
		tela.add(new JLabel(" vermelho "));

		tela.add(new JLabel(" azul "));

		this.setSize(900, 900);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);

	}

	public static void main(String[] args) {
		new DemonCorTeste();

	}

}
