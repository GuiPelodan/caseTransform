package br.com.pelodan.casechange.view;

import br.com.pelodan.casechange.system.SystemLogic;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class App extends JFrame implements ActionListener {
	
	SystemLogic system = new SystemLogic();
	JLabel title = new JLabel("Conversor de Caracteres");
	JTextArea text = new JTextArea(system.getString());
	JButton btnUpper = new JButton("MAÍUSCULA");
	JButton btnLower = new JButton("minúsculas");
	JButton btnTitled = new JButton("Apenas Primeiras");
	
	App(){
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setVisible(true);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(460, 220);
		getContentPane().setLayout(null);
		title.setForeground(Color.BLACK);
		title.setBounds(119, 0, 325, 32);
		title.setHorizontalAlignment(SwingConstants.LEFT);
		title.setFont(new Font("Tahoma", Font.BOLD, 14));
		title.setBackground(new Color(240, 240, 240));
		getContentPane().add(title);
		text.setFont(new Font("Tahoma", Font.PLAIN, 12));
		text.setBounds(119, 39, 315, 122);
		getContentPane().add(text);
		btnUpper.setBounds(0, 71, 115, 43);
		getContentPane().add(btnUpper);
		btnLower.setBounds(0, 118, 115, 43);
		getContentPane().add(btnLower);
		btnTitled.setFont(new Font("Tahoma", Font.PLAIN, 10));
		btnTitled.setBounds(0, 25, 115, 43);
		getContentPane().add(btnTitled);
		btnUpper.addActionListener(this);
		btnLower.addActionListener(this);
		btnTitled.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object obj = e.getSource();
		
		if(obj==btnUpper) {
			system.setString(text.getText());
			system.toUpperCaseTransform();
			text.setText(system.getString());
		} else if(obj==btnLower) {
			system.setString(text.getText());
			system.toLowerCaseTransform();
			text.setText(system.getString());
		} else if(obj==btnTitled) {
			system.setString(text.getText());
			system.toTitledCaseTransform();
			text.setText(system.getString());
		}
		
	}
	
	public static void main(String[] args) {
		new App();
	}
	
}
