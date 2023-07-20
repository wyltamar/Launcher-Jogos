package br.edu.iftm.gui;

import javax.swing.*;

import br.edu.iftm.gui.componentes.*;

import java.awt.event.*;


public class PrincipalPanel extends TelaPanel {
	private JButton botaoVoltar;
	
	public PrincipalPanel(JPanel telas, JFrame janela) {
		super(telas, janela);
    		
		JLabel  mensagem = new JLabel("Conteudo do Principal Panel");
		
		botaoVoltar = new JButton("Voltar");
		botaoVoltar.addActionListener(this);
		
		this.add(mensagem);
		this.add(botaoVoltar);
	}
	public void executarBotao(ActionEvent e) {
    	trocarTela("Tela Login");
    }
}
