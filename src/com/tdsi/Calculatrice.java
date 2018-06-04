package com.tdsi;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.SystemColor;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.LineBorder;

public class Calculatrice {

	private JFrame frmMaCalculatrice;
	private static JTextField jtext;
	private JPanel panneau;
	private JButton button;
	private JButton btnX;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JButton button_16;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnOff;
	private JButton btnC;
	
	
	private double numero,rep;
	private int resultat;
	
	
	
	public static void tape(String touche){
		jtext.setText(jtext.getText()+touche);
	}
	
	
	private void operations(){
		
		switch(resultat){
			case 1 :
				rep = numero + Double.parseDouble(jtext.getText());
				jtext.setText(Double.toString(rep));
				
				break;
			case 2 :
				rep = numero - Double.parseDouble(jtext.getText());
				jtext.setText(Double.toString(rep));
				break;
			case 3 :
				rep = numero * Double.parseDouble(jtext.getText());
				jtext.setText(Double.toString(rep));
				break;
			case 4 :
				rep = numero / Double.parseDouble(jtext.getText());
				jtext.setText(Double.toString(rep));
				break;
		}
	}
	
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JButton button_18;
	private JTextField numhaut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculatrice window = new Calculatrice();
					window.frmMaCalculatrice.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculatrice() {
		initialize();
	}

	
	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMaCalculatrice = new JFrame();
		frmMaCalculatrice.getContentPane().setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		frmMaCalculatrice.setLocationByPlatform(true);
		frmMaCalculatrice.setLocation(new Point(500, 250));
		frmMaCalculatrice.getContentPane().setBackground(new Color(95, 158, 160));
		frmMaCalculatrice.getContentPane().setLayout(null);
		
		panneau = new JPanel();
		panneau.setBounds(10, 37, 453, 368);
		frmMaCalculatrice.getContentPane().add(panneau);
		panneau.setLayout(null);
		
		rdbtnNewRadioButton = new JRadioButton("ON");
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				activer();
			}
		});
		rdbtnNewRadioButton.setBounds(25, 107, 60, 23);
		panneau.add(rdbtnNewRadioButton);
		buttonGroup.add(rdbtnNewRadioButton);
		
		rdbtnOff = new JRadioButton("OFF");
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				desactiver();
			}
		});
		rdbtnOff.setBounds(90, 107, 60, 23);
		panneau.add(rdbtnOff);
		buttonGroup.add(rdbtnOff);
		
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				jtext.setText(null);
				numhaut.setText(null);
				
			}
		});
		btnC.setBounds(254, 105, 89, 23);
		panneau.add(btnC);
		btnC.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		
		button_1 = new JButton("+");
		button_1.setBounds(354, 128, 89, 23);
		panneau.add(button_1);
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
			numero = Double.parseDouble(jtext.getText());
			resultat = 1;
			numhaut.setText(jtext.getText());
			jtext.setText(null);
				
			}
		});
		button_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		
		button = new JButton("7");
		button.setBounds(26, 167, 89, 23);
		panneau.add(button);
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tape("7");
			}
		});
		button.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		
		button_2 = new JButton("8");
		button_2.setBounds(134, 167, 89, 23);
		panneau.add(button_2);
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tape("8");
			}
		});
		button_2.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		
		button_3 = new JButton("9");
		button_3.setBounds(233, 167, 89, 23);
		panneau.add(button_3);
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tape("9");
			}
			
		});
		button_3.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		
		button_4 = new JButton("4");
		button_4.setBounds(26, 201, 89, 23);
		panneau.add(button_4);
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tape("4");
			}
		});
		button_4.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		
		button_5 = new JButton("5");
		button_5.setBounds(134, 201, 89, 23);
		panneau.add(button_5);
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tape("5");
			}
		});
		button_5.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		
		button_6 = new JButton("6");
		button_6.setBounds(233, 201, 89, 23);
		panneau.add(button_6);
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tape("6");
			}
		});
		button_6.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		
		button_7 = new JButton("1");
		button_7.setBounds(26, 235, 89, 23);
		panneau.add(button_7);
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tape("1");
			}
		});
		button_7.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		
		button_8 = new JButton("2");
		button_8.setBounds(134, 235, 89, 23);
		panneau.add(button_8);
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tape("2");
			}
		});
		button_8.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		
		button_9 = new JButton("3");
		button_9.setBounds(233, 235, 89, 23);
		panneau.add(button_9);
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tape("3");
			}
		});
		button_9.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		
		button_10 = new JButton("-");
		button_10.setBounds(354, 167, 89, 23);
		panneau.add(button_10);
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero = Double.parseDouble(jtext.getText());
				resultat = 2;
				numhaut.setText(jtext.getText());
				jtext.setText(null);
			}
		});
		button_10.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		
		btnX = new JButton("*");
		btnX.setBounds(354, 205, 89, 23);
		panneau.add(btnX);
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero = Double.parseDouble(jtext.getText());
				resultat = 3;
				numhaut.setText(jtext.getText());
				jtext.setText(null);
			}
		});
		btnX.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		
		button_12 = new JButton("/");
		button_12.setBounds(354, 243, 89, 23);
		panneau.add(button_12);
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numero = Double.parseDouble(jtext.getText());
				resultat = 4;
				numhaut.setText(jtext.getText());
				jtext.setText(null);
			}
		});
		button_12.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		
		button_11 = new JButton("=");
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				operations();
			}
		});
		button_11.setBounds(233, 276, 192, 47);
		panneau.add(button_11);
		button_11.setFont(new Font("Trebuchet MS", Font.BOLD, 38));
		
		button_13 = new JButton("0");
		button_13.setBounds(133, 269, 89, 23);
		panneau.add(button_13);
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tape("0");
			}
		});
		button_13.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		
		button_14 = new JButton(".");
		button_14.setBounds(25, 269, 89, 23);
		panneau.add(button_14);
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tape(".");
			}
		});
		button_14.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		
		button_15 = new JButton("\u221a");
		button_15.setBounds(25, 300, 89, 23);
		panneau.add(button_15);
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Double res = Double.parseDouble(jtext.getText());
				
				res = Math.sqrt(res);
				
				numhaut.setText("\u221a ("+jtext.getText()+")");
				jtext.setText(String.valueOf(res));
					
			}
		});
		button_15.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		
		button_18 = new JButton("<--");
		button_18.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				
				int longueur = jtext.getText().length();
				int nombre = longueur-1;
				
				StringBuilder sb = new StringBuilder(jtext.getText());
				
				
				if(longueur>0){
					sb.deleteCharAt(nombre);
					String res= sb.toString();
					
					jtext.setText(res);
				}
				
				
			}
		});
		button_18.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		button_18.setBounds(155, 105, 89, 23);
		panneau.add(button_18);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setEditable(false);
		editorPane.setBackground(SystemColor.control);
		editorPane.setBounds(10, 11, 433, 89);
		panneau.add(editorPane);
		editorPane.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		
		jtext = new JTextField();
		jtext.setEditable(false);
		jtext.setBorder(null);
		jtext.setBounds(20, 47, 412, 47);
		panneau.add(jtext);
		jtext.setEnabled(false);
		jtext.setBackground(SystemColor.control);
		jtext.setDisabledTextColor(new Color(0, 0, 0));
		jtext.setFont(new Font("Lucida Console", Font.BOLD, 22));
		jtext.setHorizontalAlignment(SwingConstants.RIGHT);
		jtext.setColumns(10);
		
		numhaut = new JTextField();
		numhaut.setBackground(SystemColor.control);
		numhaut.setDisabledTextColor(Color.WHITE);
		numhaut.setEditable(false);
		numhaut.setHorizontalAlignment(SwingConstants.RIGHT);
		numhaut.setBorder(null);
		numhaut.setBounds(169, 16, 263, 31);
		panneau.add(numhaut);
		numhaut.setColumns(10);
		
		button_16 = new JButton("1/x");
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double ret=1/(Double.parseDouble(jtext.getText()));
				
				jtext.setText(String.valueOf(ret));
			}
		});
		button_16.setFont(new Font("Trebuchet MS", Font.BOLD, 17));
		button_16.setBounds(134, 298, 89, 23);
		panneau.add(button_16);
		frmMaCalculatrice.setType(Type.UTILITY);
		frmMaCalculatrice.setTitle("Ma Calculatrice");
		frmMaCalculatrice.setBounds(100, 100, 489, 466);
		frmMaCalculatrice.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	
		public void desactiver(){
			rdbtnNewRadioButton.setEnabled(true);
			rdbtnOff.setEnabled(false);
			btnC.setEnabled(false);
			jtext.setEnabled(false);
			button.setEnabled(false);
			btnX.setEnabled(false);
			button_3.setEnabled(false);
			button_1.setEnabled(false);
			button_2.setEnabled(false);
			button_4.setEnabled(false);
			button_5.setEnabled(false);
			button_6.setEnabled(false);
			button_7.setEnabled(false);
			button_8.setEnabled(false);
			button_9.setEnabled(false);
			button_10.setEnabled(false);
			button_11.setEnabled(false);
			button_12.setEnabled(false);
			button_13.setEnabled(false);
			button_14.setEnabled(false);
			button_15.setEnabled(false);
			button_16.setEnabled(false);
			
			panneau.setEnabled(false);
			
			jtext.setText("");
		}
		
		public void activer(){
			rdbtnNewRadioButton.setEnabled(false);
			rdbtnOff.setEnabled(true);
			btnC.setEnabled(true);
			jtext.setEnabled(true);
			button.setEnabled(true);
			btnX.setEnabled(true);
			button_3.setEnabled(true);
			button_1.setEnabled(true);
			button_2.setEnabled(true);
			button_4.setEnabled(true);
			button_5.setEnabled(true);
			button_6.setEnabled(true);
			button_7.setEnabled(true);
			button_8.setEnabled(true);
			button_9.setEnabled(true);
			button_10.setEnabled(true);
			button_11.setEnabled(true);
			button_12.setEnabled(true);
			button_13.setEnabled(true);
			button_14.setEnabled(true);
			button_15.setEnabled(true);
			button_16.setEnabled(true);
			
			panneau.setEnabled(true);
		}
}
