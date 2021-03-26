package IntGrafica;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class tela1 {

	private JFrame frame;
	private JTextField textField1;
	private JTextField textField2;
	private JTextField textField3;
	private JTextField textField4;
	private JTextField textField5;
	private JTextField textField6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tela1 window = new tela1();
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
	public tela1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setForeground(new Color(0, 255, 255));
		frame.setTitle("Super Conversor de Medidas");
		frame.setSize(676, 439);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon image = new ImageIcon("logo_TM_OO.png");
		frame.setIconImage(image.getImage());
		
		frame.getContentPane().setBackground(new Color(0x0058cf));
		
		JLabel lblNewLabel = new JLabel("Super Conversor de Medidas");//Título Superior Central
		lblNewLabel.setBounds(51, 10, 558, 40);
		lblNewLabel.setToolTipText("");
		lblNewLabel.setForeground(Color.white);;
		frame.getContentPane().setLayout(null);
		lblNewLabel.setBackground(new Color(240, 240, 240));
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 39));
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel_0 = new JPanel();//-----------------------------------------------------------------Distância
		panel_0.setBounds(15, 60, 200, 240);
		panel_0.setBorder(new LineBorder(Color.WHITE, 3, true));
		panel_0.setBackground(null);
		frame.getContentPane().add(panel_0);
		panel_0.setLayout(null);
		
		JLabel lblNewLabel_0 = new JLabel("Dist\u00E2ncia");
		lblNewLabel_0.setBounds(10, 10, 117, 30);
		panel_0.add(lblNewLabel_0);
		lblNewLabel_0.setForeground(Color.WHITE);
		lblNewLabel_0.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JComboBox comboBox1 = new JComboBox();
		comboBox1.setMaximumRowCount(9);
		comboBox1.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox1.setModel(new DefaultComboBoxModel(new String[] {"UM - Micrometro", "MM - Mil\u00EDmetro", "CM - Cent\u00EDmetro", "DM - Dec\u00EDmetro", "M - Metro", "DAM - Dec\u00E2metro", "HM - Hect\u00E2metro", "KM - Quil\u00F4metro", "AL - Anos Luz"}));
		comboBox1.setBounds(10, 45, 180, 30);
		panel_0.add(comboBox1);
		
		JComboBox comboBox2 = new JComboBox();
		comboBox2.setMaximumRowCount(9);
		comboBox2.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox2.setModel(new DefaultComboBoxModel(new String[] {"UM - Micrometro", "MM - Mil\u00EDmetro", "CM - Cent\u00EDmetro", "DM - Dec\u00EDmetro", "M - Metro", "DAM - Dec\u00E2metro", "HM - Hect\u00E2metro", "KM - Quil\u00F4metro", "AL - Anos Luz"}));
		comboBox2.setBounds(10, 140, 180, 30);
		panel_0.add(comboBox2);
	
		JButton btnNewButton1 = new JButton("Converter");
		btnNewButton1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton1.setBounds(45, 105, 110, 30);
		panel_0.add(btnNewButton1);
		
		JButton btnNewButton2 = new JButton("Limpar");
		btnNewButton2.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText("");
				textField2.setText("");
			}
		});
		btnNewButton2.setBounds(100, 200, 90, 30);
		panel_0.add(btnNewButton2);
		
		textField1 = new JTextField();
		textField1.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField1.setHorizontalAlignment(SwingConstants.CENTER);
		textField1.setBounds(10, 75, 180, 25);
		panel_0.add(textField1);
		textField1.setColumns(10);
		
		textField2 = new JTextField();
		textField2.setEditable(false);
		textField2.setHorizontalAlignment(SwingConstants.CENTER);
		textField2.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField2.setBounds(10, 170, 180, 25);
		panel_0.add(textField2);
		textField2.setColumns(10);
		
		JPanel panel_1 = new JPanel();//-----------------------------------------------------------------Massa
		panel_1.setBorder(new LineBorder(Color.WHITE, 3, true));
		panel_1.setBackground((Color) null);
		panel_1.setBounds(230, 60, 200, 240);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Massa");
		lblNewLabel_1.setBounds(10, 10, 78, 30);
		panel_1.add(lblNewLabel_1);
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JComboBox comboBox3 = new JComboBox();
		comboBox3.setMaximumRowCount(9);
		comboBox3.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox3.setModel(new DefaultComboBoxModel(new String[] {"UM   - Micrometro", "MM  - Mil\u00EDmetro", "CM   - Cent\u00EDmetro", "DM   - Dec\u00EDmetro", "M      - Metro", "DAM - Dec\u00E2metro", "HM   - Hect\u00E2metro", "KM    - Quil\u00F4metro", "AL     - Anos Luz"}));
		comboBox3.setBounds(10, 45, 180, 30);
		panel_1.add(comboBox3);
		
		JComboBox comboBox4 = new JComboBox();
		comboBox4.setMaximumRowCount(9);
		comboBox4.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox4.setModel(new DefaultComboBoxModel(new String[] {"UM   - Micrometro", "MM  - Mil\u00EDmetro", "CM   - Cent\u00EDmetro", "DM   - Dec\u00EDmetro", "M      - Metro", "DAM - Dec\u00E2metro", "HM   - Hect\u00E2metro", "KM    - Quil\u00F4metro", "AL     - Anos Luz"}));
		comboBox4.setBounds(10, 140, 180, 30);
		panel_1.add(comboBox4);

		JButton btnNewButton3 = new JButton("Converter");
		btnNewButton3.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton3.setBounds(45, 105, 110, 30);
		panel_1.add(btnNewButton3);
		
		JButton btnNewButton4 = new JButton("Limpar");
		btnNewButton4.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField3.setText("");
				textField4.setText("");
			}
		});
		btnNewButton4.setBounds(100, 200, 90, 30);
		panel_1.add(btnNewButton4);
		
		textField3 = new JTextField();
		textField3.setHorizontalAlignment(SwingConstants.CENTER);
		textField3.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField3.setColumns(10);
		textField3.setBounds(10, 75, 180, 25);
		panel_1.add(textField3);
		
		textField4 = new JTextField();
		textField4.setEditable(false);
		textField4.setHorizontalAlignment(SwingConstants.CENTER);
		textField4.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField4.setColumns(10);
		textField4.setBounds(10, 170, 180, 25);
		panel_1.add(textField4);
		
		JPanel panel_2 = new JPanel();//-----------------------------------------------------------------Temperatura
		panel_2.setBorder(new LineBorder(Color.WHITE, 3, true));
		panel_2.setBackground((Color) null);
		panel_2.setBounds(445, 60, 200, 240);
		frame.getContentPane().add(panel_2);
		panel_2.setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("Temperatura");
		lblNewLabel_2.setBounds(10, 10, 163, 30);
		panel_2.add(lblNewLabel_2);
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 25));
		
		JComboBox comboBox5 = new JComboBox();
		comboBox5.setMaximumRowCount(3);
		comboBox5.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox5.setModel(new DefaultComboBoxModel(new String[] {"\u00BAC - Celsius", "\u00BAF - Fahreinheit", "\u00BAK - Kelvin"}));
		comboBox5.setBounds(10, 45, 180, 30);
		panel_2.add(comboBox5);
		
		JComboBox comboBox6 = new JComboBox();
		comboBox6.setMaximumRowCount(3);
		comboBox6.setFont(new Font("Tahoma", Font.BOLD, 14));
		comboBox6.setModel(new DefaultComboBoxModel(new String[] {"\u00BAC - Celsius", "\u00BAF - Fahreinheit", "\u00BAK - Kelvin"}));
		comboBox6.setBounds(10, 140, 180, 30);
		panel_2.add(comboBox6);
		
		JButton btnNewButton5 = new JButton("Converter");
		btnNewButton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String box1 = (String)comboBox5.getSelectedItem();
			    String box2 = (String)comboBox6.getSelectedItem();
			    
			    //--------------------------------------------------------------------------------ºC - Celsius/ ºF - Fahreinheit
			    if(box1.equals("ºC - Celsius") && box2.equals("ºF - Fahreinheit"))
			    {
			        double c = Double.parseDouble(textField5.getText()); 
			        double f = (double)(c * 1.8 + 32);
			          
			        String resultado = String.format("%.f", f);

			        textField6.setText(resultado);
			    }
			    else if(box1.equals("ºC - Celsius") && box2.equals("ºK - Kelvin"))//--------------ºC - Celsius/ ºK - Kelvin
			    {
			        double c = Double.parseDouble(textField5.getText());
			        double k = (double)(c + 273.15 );
			           
			        textField6.setText(String.valueOf(k));
			    }
			    else if(box1.equals("ºC - Celsius") && box2.equals("ºC - Celsius"))//-------------ºC - Celsius/ ºC - Celsius
			    {
			        double c = Double.parseDouble(textField5.getText());
			         
			        textField6.setText(String.valueOf(c));
			    }
			    //--------------------------------------------------------------------------------ºF - Fahreinheit/ ºC - Celsius
			    if(box1.equals("ºF - Fahreinheit") && box2.equals("ºC - Celsius"))
			    {
			        double f = Double.parseDouble(textField5.getText()); 
			        double c = (double)((f - 32)*5/9);
			           
			        textField6.setText(String.valueOf(c));
			    }
			    else if(box1.equals("ºF - Fahreinheit") && box2.equals("ºK - Kelvin"))//----------ºF - Fahreinheit/ ºK - Kelvin
			    {
			        double f = Double.parseDouble(textField5.getText());
			           
			        double k = (double)((f - 32)*5/9 + 273.15);
			           
			        textField6.setText(String.valueOf(k));
			    }
			    else if(box1.equals("ºF - Fahreinheit") && box2.equals("ºF - Fahreinheit"))//-----ºF - Fahreinheit/ ºF - Fahreinheit
			    {
			        double f = Double.parseDouble(textField5.getText());
			         
			        textField6.setText(String.valueOf(f));
			    }   
			    //------------------------------------------------------------------------------ºK - Kelvin/ 
			    if(box1.equals("ºK - Kelvin") && box2.equals("ºC - Celsius"))
			    {
			        double k = Double.parseDouble(textField5.getText());
			        double c = (double)(0 - 273.15);
			           
			        textField6.setText(String.valueOf(c));
			    }
			    else if(box1.equals("ºK - Kelvin") && box2.equals("ºF - Fahreinheit"))//-------------------ºK - Kelvin/
			    {
			        double k = Double.parseDouble(textField5.getText());
			        double f = (double)(0 - 273.15) * 9/5 +32;
			           
			        textField6.setText(String.valueOf(f));
			    }
			    else if(box1.equals("ºK - Kelvin") && box2.equals("ºK - Kelvin"))//-----------------------ºK - Kelvin/ ºK - Kelvin
			    {
			        double k = Double.parseDouble(textField5.getText());
			         
			        textField6.setText(String.valueOf(k));
			    }
			         
			
		}
		});
		btnNewButton5.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton5.setBounds(45, 105, 110, 30);
		panel_2.add(btnNewButton5);
		
		JButton btnNewButton6 = new JButton("Limpar");
		btnNewButton6.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnNewButton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField5.setText("");
				textField6.setText("");
			}
		});
		btnNewButton6.setBounds(100, 200, 90, 30);
		panel_2.add(btnNewButton6);
		
		textField5 = new JTextField();
		textField5.setHorizontalAlignment(SwingConstants.CENTER);
		textField5.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField5.setColumns(10);
		textField5.setBounds(10, 75, 180, 25);
		panel_2.add(textField5);
		
		textField6 = new JTextField();
		textField6.setEditable(false);
		textField6.setHorizontalAlignment(SwingConstants.CENTER);
		textField6.setFont(new Font("Tahoma", Font.BOLD, 14));
		textField6.setColumns(10);
		textField6.setBounds(10, 170, 180, 25);
		panel_2.add(textField6);
		
		JPanel panel_3 = new JPanel();//-----------------------------------------------------------------Rodapé
		panel_3.setBorder(new LineBorder(Color.WHITE, 3, true));
		panel_3.setBackground((Color) null);
		panel_3.setBounds(15, 310, 630, 80);
		frame.getContentPane().add(panel_3);
		panel_3.setLayout(null);
		
		JLabel lblCopyrightBy = new JLabel("UnB - Gama - Copyright 2021 - by Carlos Daniel Godoy & Jos\u00E9 Lu\u00EDs Ramos Teixeira");
		lblCopyrightBy.setBounds(27, 60, 575, 17);
		panel_3.add(lblCopyrightBy);
		lblCopyrightBy.setToolTipText("");
		lblCopyrightBy.setForeground(Color.WHITE);
		lblCopyrightBy.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblCopyrightBy.setBackground(SystemColor.menu);
		
		JButton btnNewButton7 = new JButton("Limpar Tudo");//--------------------LIMPAR TUDO
		btnNewButton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField1.setText("");
				textField2.setText("");
				textField3.setText("");
				textField4.setText("");
				textField5.setText("");
				textField6.setText("");
			}
		});
		btnNewButton7.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton7.setBounds(90, 11, 180, 40);
		panel_3.add(btnNewButton7);
		
		JButton btnNewButton8 = new JButton("Sair");//---------------------------SAIR
		btnNewButton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton8.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnNewButton8.setBounds(360, 9, 180, 40);
		panel_3.add(btnNewButton8);
	
		
		
		
	}
}
