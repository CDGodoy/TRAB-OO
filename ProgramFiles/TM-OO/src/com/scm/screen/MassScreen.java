package com.scm.screen;

import com.scm.back.Calculos;
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
/**
 * Contém a tela de conversão de massa
 * @author Carlos Daniel de Godoy Barros Nascimento & José Luís Ramos Teixeira
 */
public class MassScreen extends JFrame {
        
        static Calculos calc = new Calculos();
        private double fator;
        
        private JPanel contentPane;
        private JTextField textFieldO;
        private JComboBox comboBoxD;
        private JTextField textFieldD;
        private JButton converterButton;
        private JLabel textD;
        private JLabel titulo;
        /**
         * Inicia a tela.
         */
        public static void main(String[] args) {
                EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        MassScreen window = new MassScreen();
                                        window.setVisible(true);
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }
                });
        }

        /**
         * Cria a janela de massa e executa as operações
         * Neste método, são recebidas as unidades de origem e destino e também é recebido o valor a ser convertido
         * Após o clique do botão, são chamadas os seguintes métodos passando os devidos parâmetros:
         * (1) UMedida @see {@link com.scm.back.Calculos#UMedida(String)} Retorna seu valor
         * (2) pMetros @see {@link com.scm.back.Calculos#pMetros(double, double)} Converte a medida para gramas
         * (3) UMedida @see {@link com.scm.back.Calculos#UMedida(String)} Retorna seu valor
         * (4) pMetros @see {@link com.scm.back.Calculos#dMetros(double, double)} Converte a medida para a unidade destino
         * (5) arredondar @see {@link com.scm.back.Calculos#arredondar(double)} Arredonda o valor para 5 casas decimais
         */
        public MassScreen() {
                setResizable(false);
                setTitle("Massa"); //Título canto superior esquerdo
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
                comboBoxO.setMaximumRowCount(7);
                comboBoxO.setFont(new Font("Tahoma", Font.BOLD, 16));
                comboBoxO.setModel(new DefaultComboBoxModel(new String[] {
                        "mg - Miligramas",
                        "cg - Centigramas",
                        "dg - Decigramas",
                        "g - Gramas",
                        "dag - Decagramas",
                        "hg - Hectogramas",
                        "kg - Quilogramas"
                }));
                comboBoxO.setBounds(50, 130, 320, 40);
                contentPane.add(comboBoxO);

                comboBoxD = new JComboBox();
                comboBoxD.setMaximumRowCount(7);
                comboBoxD.setFont(new Font("Tahoma", Font.BOLD, 16));
                comboBoxD.setModel(new DefaultComboBoxModel(new String[] {
                        "mg - Miligramas",
                        "cg - Centigramas",
                        "dg - Decigramas",
                        "g - Gramas",
                        "dag - Decagramas",
                        "hg - Hectogramas",
                        "kg - Quilogramas"
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

                converterButton = new JButton("Converter"); //------------------------BOTÃO DE CONVERTER
                converterButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                String arboxO = (String) comboBoxO.getSelectedItem();//Obtem as unidades selecionadas
                                String arboxD = (String) comboBoxD.getSelectedItem();

                                double medida = Double.parseDouble(textFieldO.getText());//Obtem a medida de origem

                                fator = calc.UMedida(arboxO);//Obtém o fator de conversão 
                                double emMetros = calc.pMetros(medida, fator);//Converte para gramas

                                fator = calc.UMedida(arboxD);//Obtém o fator de conversão
                                double mFinal = calc.dMetros(emMetros, fator);//Converte para a unidade de destino

                                textFieldD.setText(calc.arredondar(mFinal));//Exibe o resultado final arredondado

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

                JPanel panel = new JPanel(); //----------------------------------------PAINEL DE TÍTULO
                panel.setBackground(SystemColor.textHighlight);
                panel.setBounds(0, 0, 420, 80);
                contentPane.add(panel);
                panel.setLayout(null);

                titulo = new JLabel("MASSA"); //Título no cabeçalho em azul
                titulo.setForeground(SystemColor.textHighlightText);
                titulo.setFont(new Font("Tahoma", Font.BOLD, 36));
                titulo.setHorizontalAlignment(SwingConstants.CENTER);
                titulo.setBounds(0, 0, 420, 80);
                panel.add(titulo);

                JButton voltarButton = new JButton("Voltar"); //------------------------BOTÃO DE VOLTAR
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