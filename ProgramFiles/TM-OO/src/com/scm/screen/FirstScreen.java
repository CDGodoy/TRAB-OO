package com.scm.screen;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

/**
 * Classe para a tela inicial da aplicação
 * @author Carlos Daniel de Godoy Barros Nascimento & José Luís Ramos Teixeira
 */
public class FirstScreen {

        private JFrame mainFrame;

        /**
         * Inicia a tela
         */
        public static void main(String[] args) {
                EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        FirstScreen window = new FirstScreen();
                                        window.mainFrame.setVisible(true);
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                        }
                });
        }

        /**
         * Cria a tela
         */
        public FirstScreen() {
                initialize();
        }

        /**
         * Inicializa os conteúdos da janela
         */
        void initialize() {
                mainFrame = new JFrame();
                mainFrame.setBounds(100, 100, 434, 538);
                mainFrame.setTitle("Super Conversor de Medidas");
                mainFrame.setResizable(false);
                mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                mainFrame.getContentPane().setLayout(null);

                JLabel lblNewLabel_2 = new JLabel("Selecione o tipo de medida:");
                lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 18));
                lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_2.setBounds(10, 110, 400, 50);
                mainFrame.getContentPane().add(lblNewLabel_2);

                JButton distButton = new JButton("Distância"); //-------------BOTÃO DE DISTÂNCIA
                distButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                mainFrame.dispose();
                                DistScreen DiScreen = new DistScreen();
                                DiScreen.setVisible(true);
                        }
                });
                distButton.setFont(new Font("Tahoma", Font.BOLD, 18));
                distButton.setBounds(130, 170, 160, 60);
                mainFrame.getContentPane().add(distButton);

                JButton areaButton = new JButton("Área"); //------------------BOTÃO DE ÁREA
                areaButton.setFont(new Font("Tahoma", Font.BOLD, 18));
                areaButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                mainFrame.dispose();
                                AreaScreen ArScreen = new AreaScreen();
                                ArScreen.setVisible(true);
                        }
                });
                areaButton.setBounds(40, 250, 160, 60);
                mainFrame.getContentPane().add(areaButton);

                JButton voluButton = new JButton("Volume"); //---------------BOTÃO DE VOLUME
                voluButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                mainFrame.dispose();
                                VoluScreen VoScreen = new VoluScreen();
                                VoScreen.setVisible(true);
                        }
                });
                voluButton.setFont(new Font("Tahoma", Font.BOLD, 18));
                voluButton.setBounds(40, 330, 160, 60);
                mainFrame.getContentPane().add(voluButton);

                JButton massButton = new JButton("Massa"); //----------------BOTÃO DE MASSA
                massButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                mainFrame.dispose();
                                MassScreen MaScreen = new MassScreen();
                                MaScreen.setVisible(true);
                        }
                });
                massButton.setFont(new Font("Tahoma", Font.BOLD, 18));
                massButton.setBounds(220, 250, 160, 60);
                mainFrame.getContentPane().add(massButton);

                JButton tempButton = new JButton("Temperatura"); //----------BOTÃO DE TEMPERATURA
                tempButton.addActionListener(new ActionListener() {
                        public void actionPerformed(ActionEvent e) {
                                mainFrame.dispose();
                                TempScreen TeScreen = new TempScreen();
                                TeScreen.setVisible(true);
                        }
                });
                tempButton.setFont(new Font("Tahoma", Font.BOLD, 18));
                tempButton.setBounds(220, 330, 160, 60);
                mainFrame.getContentPane().add(tempButton);

                JPanel cabecalho = new JPanel(); //--------------------------------------------------------------CABEÇALHO
                cabecalho.setBackground(SystemColor.textHighlight);
                cabecalho.setBounds(0, 0, 420, 80);
                mainFrame.getContentPane().add(cabecalho);
                cabecalho.setLayout(null);

                JLabel lblNewLabel_1 = new JLabel("SUPER CONVERSOR DE MEDIDAS");
                lblNewLabel_1.setForeground(SystemColor.textHighlightText);
                lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 22));
                lblNewLabel_1.setBounds(0, 0, 420, 80);
                cabecalho.add(lblNewLabel_1);

                JPanel rodape = new JPanel(); //------------------------------------------------------------------RODAPÉ
                rodape.setBackground(SystemColor.textHighlight);
                rodape.setBounds(0, 430, 420, 80);
                mainFrame.getContentPane().add(rodape);
                rodape.setLayout(null);

                JLabel lblNewLabel = new JLabel("Faculdade UnB Gama - FGA - 2021");
                lblNewLabel.setForeground(SystemColor.textHighlightText);
                lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
                lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 22));
                lblNewLabel.setBounds(0, 0, 420, 30);
                rodape.add(lblNewLabel);

                JLabel lblJosLusRamos = new JLabel("Carlos Daniel De Godoy Barros Nascimento - 19/0042303");
                lblJosLusRamos.setForeground(SystemColor.textHighlightText);
                lblJosLusRamos.setHorizontalAlignment(SwingConstants.CENTER);
                lblJosLusRamos.setFont(new Font("Tahoma", Font.BOLD, 13));
                lblJosLusRamos.setBounds(10, 30, 400, 20);
                rodape.add(lblJosLusRamos);

                JLabel lblCarlosDanielDe = new JLabel("Jos\u00E9 Lu\u00EDs Ramos Teixeira - 19/0057858");
                lblCarlosDanielDe.setForeground(SystemColor.textHighlightText);
                lblCarlosDanielDe.setHorizontalAlignment(SwingConstants.CENTER);
                lblCarlosDanielDe.setFont(new Font("Tahoma", Font.BOLD, 13));
                lblCarlosDanielDe.setBounds(10, 50, 400, 20);
                rodape.add(lblCarlosDanielDe);

        }
}