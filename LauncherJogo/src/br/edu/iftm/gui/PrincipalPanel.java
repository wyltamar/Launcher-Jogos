package br.edu.iftm.gui;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JOptionPane;

import java.awt.*;
import java.awt.event.*;


public class PrincipalPanel extends JPanel implements ActionListener{
	private JPanel telas;
	private CardLayout controleTela;
	
	public PrincipalPanel(JPanel telas) {
		this.telas = telas;
    	this.controleTela = (CardLayout) telas.getLayout();
    		
		JLabel  mensagem = new JLabel("Conteudo do Principal Panel");
		
		JButton botao = new JButton("Voltar");
		botao.addActionListener(this);
		
		this.add(mensagem);
		this.add(botao);
	}
	
	 @Override
	 public void actionPerformed(ActionEvent e) {
		controleTela.show(telas, "Tela Login");
	}
}
