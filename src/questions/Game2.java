/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package questions;

import java.awt.Color;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import model.dao.PerguntaDAO;
import model.entidades.Pergunta;
import model.entidades.Pessoa;
import model.entidades.Pontuacao;

/**
 *
 * @author Jhonatan
 */
public class Game2 extends javax.swing.JFrame {

    JFrame frame = new JFrame();
    int indexQuestion = 0;
    private static Pessoa pessoa;
    ArrayList<Pergunta> questoes;
    int numeroDeTentativas = 3;
    Pontuacao pontucao;

    public Game2(Pessoa pessoa) {
        initComponents();
        this.pessoa = pessoa;
        this.pontucao = new Pontuacao(pessoa.getId(), 0);
        getContentPane().setBackground(Color.BLACK);
        setLocationRelativeTo(null);
        setResizable(false);
    }

    public void load() throws SQLException {
        setVisible(true);
        questoes = new PerguntaDAO().getQuestoes();

        lbTextoPergunta.setText(questoes.get(indexQuestion).getTitulo());
        rBtnAlt01.setText(questoes.get(indexQuestion).getAlternativa01());
        rBtnAlt02.setText(questoes.get(indexQuestion).getAlternativa02());
        rBtnAlt03.setText(questoes.get(indexQuestion).getAlternativa03());
        rBtnAlt04.setText(questoes.get(indexQuestion).getAlternativa04());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGroupQuestions = new javax.swing.ButtonGroup();
        rBtnAlt01 = new javax.swing.JRadioButton();
        rBtnAlt02 = new javax.swing.JRadioButton();
        rBtnAlt03 = new javax.swing.JRadioButton();
        rBtnAlt04 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        iconCor01 = new javax.swing.JLabel();
        iconCor03 = new javax.swing.JLabel();
        iconCor02 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lbPontuacaoAtual = new javax.swing.JLabel();
        lbNumeroPergunta = new javax.swing.JLabel();
        lbTextoPergunta = new javax.swing.JLabel();
        btnProximo = new javax.swing.JButton();
        btnSair = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 700));

        rBtnAlt01.setBackground(new java.awt.Color(0, 0, 0));
        btnGroupQuestions.add(rBtnAlt01);
        rBtnAlt01.setForeground(new java.awt.Color(255, 255, 255));
        rBtnAlt01.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rBtnAlt01.setDoubleBuffered(true);
        rBtnAlt01.setName(""); // NOI18N

        rBtnAlt02.setBackground(new java.awt.Color(0, 0, 0));
        btnGroupQuestions.add(rBtnAlt02);
        rBtnAlt02.setForeground(new java.awt.Color(255, 255, 255));
        rBtnAlt02.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rBtnAlt02.setDoubleBuffered(true);
        rBtnAlt02.setName(""); // NOI18N

        rBtnAlt03.setBackground(new java.awt.Color(0, 0, 0));
        btnGroupQuestions.add(rBtnAlt03);
        rBtnAlt03.setForeground(new java.awt.Color(255, 255, 255));
        rBtnAlt03.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rBtnAlt03.setDoubleBuffered(true);
        rBtnAlt03.setName(""); // NOI18N

        rBtnAlt04.setBackground(new java.awt.Color(0, 0, 0));
        btnGroupQuestions.add(rBtnAlt04);
        rBtnAlt04.setForeground(new java.awt.Color(255, 255, 255));
        rBtnAlt04.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        rBtnAlt04.setDoubleBuffered(true);
        rBtnAlt04.setName(""); // NOI18N

        jPanel1.setBackground(new java.awt.Color(0, 51, 51));
        jPanel1.setAutoscrolls(true);

        iconCor01.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contents/icons/heart.png"))); // NOI18N

        iconCor03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contents/icons/heart.png"))); // NOI18N

        iconCor02.setIcon(new javax.swing.ImageIcon(getClass().getResource("/contents/icons/heart.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Pontuação: ");

        lbPontuacaoAtual.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbPontuacaoAtual.setForeground(new java.awt.Color(0, 204, 153));
        lbPontuacaoAtual.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbPontuacaoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(iconCor01)
                .addGap(18, 18, 18)
                .addComponent(iconCor02)
                .addGap(18, 18, 18)
                .addComponent(iconCor03)
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbPontuacaoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(iconCor02)
                    .addComponent(iconCor03)
                    .addComponent(iconCor01))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        lbNumeroPergunta.setBackground(new java.awt.Color(0, 0, 0));
        lbNumeroPergunta.setForeground(new java.awt.Color(255, 255, 255));
        lbNumeroPergunta.setText("1");

        lbTextoPergunta.setBackground(new java.awt.Color(0, 0, 0));
        lbTextoPergunta.setForeground(new java.awt.Color(255, 255, 255));
        lbTextoPergunta.setText("Texto da pergunta");

        btnProximo.setBackground(new java.awt.Color(0, 0, 0));
        btnProximo.setForeground(new java.awt.Color(255, 255, 255));
        btnProximo.setText("Próximo");
        btnProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProximoActionPerformed(evt);
            }
        });

        btnSair.setBackground(new java.awt.Color(0, 0, 0));
        btnSair.setForeground(new java.awt.Color(255, 255, 255));
        btnSair.setText("Sair");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lbNumeroPergunta)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbTextoPergunta, javax.swing.GroupLayout.PREFERRED_SIZE, 465, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(rBtnAlt04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rBtnAlt03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rBtnAlt02, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(rBtnAlt01, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(97, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(27, 27, 27)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(458, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNumeroPergunta)
                    .addComponent(lbTextoPergunta))
                .addGap(58, 58, 58)
                .addComponent(rBtnAlt01)
                .addGap(18, 18, 18)
                .addComponent(rBtnAlt02)
                .addGap(18, 18, 18)
                .addComponent(rBtnAlt03)
                .addGap(18, 18, 18)
                .addComponent(rBtnAlt04)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 147, Short.MAX_VALUE)
                .addComponent(btnProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(540, Short.MAX_VALUE)
                    .addComponent(btnSair, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(10, 10, 10)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProximoActionPerformed

        String opcaoDoUsuario = "";

        int perguntaAutal = indexQuestion + 2;
        lbNumeroPergunta.setText(String.valueOf(perguntaAutal));

        System.out.println("Cheguei aqui");

        if (true) {
            if (rBtnAlt01.isSelected()) {
                opcaoDoUsuario = rBtnAlt01.getText();
            } else if (rBtnAlt02.isSelected()) {
                opcaoDoUsuario = rBtnAlt02.getText();
            } else if (rBtnAlt03.isSelected()) {
                opcaoDoUsuario = rBtnAlt03.getText();
            } else if (rBtnAlt04.isSelected()) {
                opcaoDoUsuario = rBtnAlt04.getText();
            }

            if (opcaoDoUsuario.equalsIgnoreCase(questoes.get(indexQuestion).getAlternativaCorreta())) {
                pontucao.setPontuacao(pontucao.getPontuacao() + 10);
            } else {
                if (numeroDeTentativas == 3) {
                    iconCor01.setVisible(false);
                    numeroDeTentativas = numeroDeTentativas - 1;
                } else if (numeroDeTentativas == 2) {
                    iconCor02.setVisible(false);
                    numeroDeTentativas = numeroDeTentativas - 1;
                } else if (numeroDeTentativas == 1) {
                    iconCor03.setVisible(false);
                    numeroDeTentativas = numeroDeTentativas - 1;
                } else if (numeroDeTentativas == 0) {
                    dispose();
                    EndGame2 finish;
                    finish = new EndGame2(pontucao, pessoa);
                    finish.load();;
                }
            }

            if (!(indexQuestion >= 8)) {

                System.out.println("Cheguei no index+");

                indexQuestion = indexQuestion + 1;

                lbTextoPergunta.setText(questoes.get(indexQuestion).getTitulo());
                rBtnAlt01.setText(questoes.get(indexQuestion).getAlternativa01());
                rBtnAlt02.setText(questoes.get(indexQuestion).getAlternativa02());
                rBtnAlt03.setText(questoes.get(indexQuestion).getAlternativa03());
                rBtnAlt04.setText(questoes.get(indexQuestion).getAlternativa04());

            } else {
                dispose();
                EndGame2 finish;
                finish = new EndGame2(pontucao, pessoa);
                finish.load();
            }
        }

        lbPontuacaoAtual.setText(String.valueOf(pontucao.getPontuacao()));

    }//GEN-LAST:event_btnProximoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Game2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Game2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Game2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Game2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Game2 game = new Game2(pessoa);
                try {
                    game.load();
                } catch (SQLException ex) {
                    Logger.getLogger(Game2.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btnGroupQuestions;
    private javax.swing.JButton btnProximo;
    private javax.swing.JButton btnSair;
    private javax.swing.JLabel iconCor01;
    private javax.swing.JLabel iconCor02;
    private javax.swing.JLabel iconCor03;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbNumeroPergunta;
    private javax.swing.JLabel lbPontuacaoAtual;
    private javax.swing.JLabel lbTextoPergunta;
    private javax.swing.JRadioButton rBtnAlt01;
    private javax.swing.JRadioButton rBtnAlt02;
    private javax.swing.JRadioButton rBtnAlt03;
    private javax.swing.JRadioButton rBtnAlt04;
    // End of variables declaration//GEN-END:variables
}