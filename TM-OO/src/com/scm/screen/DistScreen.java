package com.scm.screen;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import com.scm.back.Calculos;

public class DistScreen extends JFrame {
        private JPanel contentPane;

        static Calculos calc = new Calculos();

        private JTextField textFieldO;
        private JComboBox comboBoxD;
        private JTextField textFieldD;
        private JButton converterButton;
        private JLabel textD;
        private JLabel titulo;
        private double fator;
        /**
         * Launch the application.
         */
        public static void main(String[] args) {
                EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        DistScreen window = new DistScreen();
                                        window.setVisible(true);
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }
                });
        }

        /**
         * Create the frame.
         */
        public DistScreen() {
                setResizable(false);
                setTitle("Dist�ncia"); //T�tulo canto superior esquerdo
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setBounds(100, 100, 434, 537);
                contentPane = new JPanel();
                contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
                setContentPane(contentPane);
                contentPane.setLayout(null);

                textFieldO = new JTextField();
                textFieldO.setHorizontalAlignment(SwingConstants.CENTER);
                textFieldO.setFont(new Font("Tahoma", Font.BOLD, 16));
                textFieldO.setBounds(50, 180, 320, 40);
                contentPane.add(textFieldO);
                textFieldO.setColumns(10);

                JComboBox comboBoxO = new JComboBox();
                comboBoxO.setFont(new Font("Tahoma", Font.BOLD, 16));
                comboBoxO.setModel(new DefaultComboBoxModel(new String[] {
                        "UM-Micrometros",
                        "MM-Milimetros",
                        "CM-Centimetros",
                        "DM-Decimetros",
                        "M-Metros",
                        "DAM-Decametros",
                        "HM-Hectametros",
                        "KM-Quilometros",
                        "AL-Anos Luz",
                        "ML-Milhas\t\t",
                        "JD-Jardas\t",
                        "PE-Pes\t\t",
                        "PL-Polegadas"
                }));
                comboBoxO.setBounds(50, 130, 320, 40);
                contentPane.add(comboBoxO);

                comboBoxD = new JComboBox();
                comboBoxD.setFont(new Font("Tahoma", Font.BOLD, 16));
                comboBoxD.setModel(new DefaultComboBoxModel(new String[] {
                        "UM-Micrometros",
                        "MM-Milimetros",
                        "CM-Centimetros",
                        "DM-Decimetros",
                        "M-Metros",
                        "DAM-Decametros",
                        "HM-Hectametros",
                        "KM-Quilometros",
                        "AL-Anos Luz",
                        "ML-Milhas\t\t",
                        "JD-Jardas\t",
                        "PE-Pes\t\t",
                        "PL-Polegadas"
                }));
                comboBoxD.setBounds(50, 280, 320, 40);
                contentPane.add(comboBoxD);

                JLabel textO = new JLabel("Selecione a unidade de medida de origem:");
                textO.setHorizontalAlignment(SwingConstants.CENTER);
                textO.setFont(new Font("Tahoma", Font.BOLD, 16));
                textO.setForeground(new Color(0, 0, 0));
                textO.setBounds(30, 90, 360, 30);
                contentPane.add(textO);

                textFieldD = new JTextField();
                textFieldD.setHorizontalAlignment(SwingConstants.CENTER);
                textFieldD.setFont(new Font("Tahoma", Font.BOLD, 16));
                textFieldD.setColumns(10);
                textFieldD.setBounds(50, 330, 320, 40);
                textFieldD.setEditable(false);
                contentPane.add(textFieldD);

                converterButton = new JButton("Converter"); //------------------------BOT�O DE CONVERTER
                converterButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String arboxO = (String) comboBoxO.getSelectedItem();
                                String arboxD = (String) comboBoxD.getSelectedItem();

                                double medida = Double.parseDouble(textFieldO.getText());

                                fator = calc.UMedida(arboxO);
                                double emMetros = calc.pMetros(medida, fator);

                                fator = calc.UMedida(arboxD);

                                double mFinal = calc.dMetros(emMetros, fator);
                                //System.out.println(mFinal);
                                textFieldD.setText(calc.arredondar(mFinal));
                        }
                });
                converterButton.setFont(new Font("Tahoma", Font.BOLD, 16));
                converterButton.setBounds(50, 400, 140, 40);
                contentPane.add(converterButton);

                textD = new JLabel("Selecione a unidade de medida de destino:");
                textD.setHorizontalAlignment(SwingConstants.CENTER);
                textD.setForeground(Color.BLACK);
                textD.setFont(new Font("Tahoma", Font.BOLD, 16));
                textD.setBounds(29, 240, 360, 30);
                contentPane.add(textD);

                JPanel panel = new JPanel(); //----------------------------------------PAINEL DE T�TULO
                panel.setBackground(SystemColor.textHighlight);
                panel.setBounds(0, 0, 420, 80);
                contentPane.add(panel);
                panel.setLayout(null);

                titulo = new JLabel("DIST�NCIA"); //T�tulo no cabe�alho em azul
                titulo.setForeground(SystemColor.textHighlightText);
                titulo.setFont(new Font("Tahoma", Font.BOLD, 36));
                titulo.setHorizontalAlignment(SwingConstants.CENTER);
                titulo.setBounds(0, 0, 420, 80);
                panel.add(titulo);

                JButton voltarButton = new JButton("Voltar"); //------------------------BOT�O DE VOLTAR
                voltarButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                contentPane.setVisible(false);
                                dispose();
                                FirstScreen.main(null);
                        }
                });
                voltarButton.setFont(new Font("Tahoma", Font.BOLD, 16));
                voltarButton.setBounds(230, 400, 140, 40);
                contentPane.add(voltarButton);
        }
}