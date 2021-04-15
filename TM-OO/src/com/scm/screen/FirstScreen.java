package com.scm.screen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class FirstScreen {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstScreen window = new FirstScreen();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstScreen() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setTitle("Super Conversor de Medidas");
		frame.setSize(420, 460);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JButton areaButton = new JButton("Área"); //----------Comeco botão área
		areaButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		areaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				AreaScreen ArScreen = new AreaScreen();
				ArScreen.setVisible(true);
				ArScreen.setTitle("Área");
				ArScreen.setSize(420,460);
			}
		});
		areaButton.setBounds(124, 117, 150, 50);
		frame.getContentPane().add(areaButton);
		
		JButton distButton = new JButton("Distância"); //------Começo botao distancia
		distButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				DistScreen DiScreen = new DistScreen();
				DiScreen.setVisible(true);
				DiScreen.setTitle("Distância");
				DiScreen.setSize(420, 460);
			}
		});
		distButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		distButton.setBounds(124, 177, 150, 50);
		frame.getContentPane().add(distButton);
		
		JButton massButton = new JButton("Massa");  //---------Começo botao Massa
		massButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				MassScreen MaScreen = new MassScreen();
				MaScreen.setVisible(true);
				MaScreen.setTitle("Massa");
				MaScreen.setSize(420, 460);
			}
		});
		massButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		massButton.setBounds(124, 237, 150, 50);
		frame.getContentPane().add(massButton);
		
		JButton tempButton = new JButton("Temperatura");  //----Começo botao Temperatura
		tempButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				TempScreen TeScreen = new TempScreen();
				TeScreen.setVisible(true);
				TeScreen.setTitle("Temperatura");
				TeScreen.setSize(420, 460);
			}
		});
		tempButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		tempButton.setBounds(124, 297, 150, 50);
		frame.getContentPane().add(tempButton);
		
		JButton voluButton = new JButton("Volume");  //---------Começo botao Volume
		voluButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
				VoluScreen VoScreen = new VoluScreen();
				VoScreen.setVisible(true);
				VoScreen.setTitle("Volume");
				VoScreen.setSize(420, 460);
			}
		});
		voluButton.setFont(new Font("Tahoma", Font.BOLD, 16));
		voluButton.setBounds(124, 357, 150, 50);
		frame.getContentPane().add(voluButton);
	}
}
