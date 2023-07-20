package br.edu.iftm.gui.componentes;


import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class TelaPanel extends JPanel implements ActionListener {
	private JPanel telas;
	private CardLayout controleTela;
	private JFrame janela;
	
	public TelaPanel(JPanel telas, JFrame janela) {
		this.telas = telas;
    	this.controleTela = (CardLayout) telas.getLayout();
    	this.janela = janela;
    	this.setBackground(Color.decode("#202028"));
    	this.setLayout(null);
    	
    	
    	
    	
    	 Imagem botaoFechar = new Imagem("window-close.png");
    	 botaoFechar.setBounds(1489, 0, 36, 36);
    	 
    	 Imagem botaoMinimizar = new Imagem("dash.png");
    	 botaoMinimizar.setBounds(1445, 0, 36, 36);
    	 
    	
    	botaoFechar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				janela.dispose();
			}
		});
    	
    	botaoMinimizar.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				janela.setState(JFrame.ICONIFIED);
			}
		});
    	
    	this.add(botaoFechar);
    	this.add(botaoMinimizar);
    	
	}
	
	@Override
    public void actionPerformed(ActionEvent e) {
		executarBotao(e);
    }
	
	protected void executarBotao(ActionEvent e) {
		
	}
	
	protected void trocarTela(String indentificado) {
		controleTela.show(telas, indentificado);
	}
}
