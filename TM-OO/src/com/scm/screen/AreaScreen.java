package com.scm.screen;

import com.scm.back.Calculos;


import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import java.awt.Color;

public class AreaScreen extends JFrame {
	String fUnidade;
	static Calculos calc = new Calculos();
	private JPanel contentPane;
	private JFrame myFrame;
	private JTextField textFieldAreaO;
	private JComboBox comboBoxAreaD;
	private JTextField textFieldAreaD;
	private JButton btnNewButton;
	private JLabel lblSelecioneAUnidade;
	private double fator;
	private JLabel lblQuadrados;
	private JLabel lblQuadrados_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AreaScreen frame = new AreaScreen();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AreaScreen() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textFieldAreaO = new JTextField();
		textFieldAreaO.setFont(new Font("Tahoma", Font.BOLD, 16));
		textFieldAreaO.setBounds(68, 86, 280, 40);
		contentPane.add(textFieldAreaO);
		textFieldAreaO.setColumns(10);
		
		JComboBox comboBoxAreaO = new JComboBox();
		comboBoxAreaO.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBoxAreaO.setModel(new DefaultComboBoxModel(new String[] {"UM-Micrometros", "MM-Milimetros", "CM-Centimetros", "DM-Decimetros", "M-Metros", "DAM-Decametros", "HM-Hectametros", "KM-Quilometros"}));
		comboBoxAreaO.setBounds(68, 36, 160, 40);
		contentPane.add(comboBoxAreaO);
		
		comboBoxAreaD = new JComboBox();
		comboBoxAreaD.setFont(new Font("Tahoma", Font.BOLD, 16));
		comboBoxAreaD.setModel(new DefaultComboBoxModel(new String[] {"UM-Micrometros", "MM-Milimetros", "CM-Centimetros", "DM-Decimetros", "M-Metros", "DAM-Decametros", "HM-Hectametros", "KM-Quilometros"}));
		comboBoxAreaD.setBounds(68, 173, 160, 40);
		contentPane.add(comboBoxAreaD);
		
		JLabel lblNewLabel = new JLabel("Selecione a unidade de medida de origem:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setForeground(new Color(0, 0, 0));
		lblNewLabel.setBounds(29, 10, 368, 27);
		contentPane.add(lblNewLabel);
		
		textFieldAreaD = new JTextField();
		textFieldAreaD.setFont(new Font("Tahoma", Font.BOLD, 16));
		textFieldAreaD.setColumns(10);
		textFieldAreaD.setBounds(68, 223, 280, 40);
		textFieldAreaD.setEditable(false);
		contentPane.add(textFieldAreaD);
		
		btnNewButton = new JButton("Converter");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String arboxO = (String)comboBoxAreaO.getSelectedItem();
				String arboxD = (String)comboBoxAreaD.getSelectedItem();
				
				double medida = Double.parseDouble(textFieldAreaO.getText());
				
				fator = Math.pow(calc.UMedida(arboxO), 2);
				double emMetros = calc.pMetros(medida, fator);
				
				fator = Math.pow(calc.UMedida(arboxD), 2);
				
				double mFinal = calc.dMetros(emMetros, fator);
				System.out.println(mFinal);
				textFieldAreaD.setText(calc.arredondar(mFinal));
				//String resultado = String.format("%f", mFinal);
				//textFieldAreaD.setText(String.valueOf(mFinal));
				//double leitura = Double.parseDouble(textFieldAreaO.getText());
				//textFieldAreaD.setText();
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnNewButton.setBounds(139, 315, 142, 30);
		contentPane.add(btnNewButton);
		
		lblSelecioneAUnidade = new JLabel("Selecione a unidade de medida de destino:");
		lblSelecioneAUnidade.setForeground(Color.BLACK);
		lblSelecioneAUnidade.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblSelecioneAUnidade.setBounds(29, 136, 368, 27);
		contentPane.add(lblSelecioneAUnidade);
		
		lblQuadrados = new JLabel("quadrados");
		lblQuadrados.setForeground(Color.BLACK);
		lblQuadrados.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQuadrados.setBounds(238, 43, 110, 27);
		contentPane.add(lblQuadrados);
		
		lblQuadrados_1 = new JLabel("quadrados");
		lblQuadrados_1.setForeground(Color.BLACK);
		lblQuadrados_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblQuadrados_1.setBounds(238, 180, 110, 27);
		contentPane.add(lblQuadrados_1);
	}
}
