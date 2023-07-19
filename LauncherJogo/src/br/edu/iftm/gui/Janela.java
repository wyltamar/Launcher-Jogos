package br.edu.iftm.gui;

import javax.swing.JPanel;
import javax.swing.JFrame;

import java.awt.*;

public class Janela extends JFrame {

	public Janela() {
        this.setBounds(0, 0, 1920, 1080);
        
        CardLayout controleTela = new CardLayout();
        JPanel telas = new JPanel(controleTela);
        
        LoginPanel loginPanel = new LoginPanel(telas);
        PrincipalPanel principalPanel = new PrincipalPanel(telas);
        
        telas.add(loginPanel, "Tela Login");
        telas.add(principalPanel, "Tela Principal");
       
        this.add(telas);
        this.setVisible(true);
    }
}
