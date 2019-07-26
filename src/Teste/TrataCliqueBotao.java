package Teste;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

public class TrataCliqueBotao implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		JOptionPane.showMessageDialog(null, "EU AVISEI POW CERTO", "Mensagem", JOptionPane.YES_NO_OPTION);
		System.exit(0);

	}

}
