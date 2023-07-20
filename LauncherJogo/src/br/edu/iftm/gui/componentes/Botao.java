package br.edu.iftm.gui.componentes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Botao extends JButton {
	public Botao(String texto) {
		super(texto);
		
		this.setBounds(700, 500, 125, 60);
        this.setBackground(Color.decode("#6d5dd3"));
        this.setFocusPainted(false);
        this.setBorderPainted(false);
	}
}
