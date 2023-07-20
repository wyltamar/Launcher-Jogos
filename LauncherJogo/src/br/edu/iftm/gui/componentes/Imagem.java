package br.edu.iftm.gui.componentes;

import javax.swing.*;


public class Imagem extends JLabel {
	public Imagem(String nome) {
		super();
		ImageIcon icone = new ImageIcon(Imagem.class.getResource("/images/" + nome));
		setIcon(icone);
		repaint();
	}
}
