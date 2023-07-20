package br.edu.iftm.gui;
  
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import br.edu.iftm.gui.componentes.*;



public class LoginPanel extends TelaPanel {
	private JButton botaoLogin;
	
    public LoginPanel(JPanel telas, JFrame janela) {
    	super(telas, janela);
    	
        JLabel mensagem = new JLabel("Conteudo do Login Panel");
        
        JTextField txtLogin = new JTextField();
        txtLogin.setBounds(650, 320, 220, 30);
        
        JTextField txtSenha = new JTextField();
        txtSenha.setBounds(650, 380, 220, 30);
        
        
        botaoLogin = new Botao("Fazer Login");
        botaoLogin.addActionListener(this);
        
        
        this.add(mensagem);
        this.add(botaoLogin);
        this.add(txtLogin);
        this.add(txtSenha);
    }
    
    public void executarBotao(ActionEvent e) {
    	trocarTela("Tela Principal");
    }
}