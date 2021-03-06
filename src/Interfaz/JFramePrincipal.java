
package Interfaz;

import Musica.Musica;
import java.awt.Color;
import java.util.Random;

/**
 * @author Chris
 */
public class JFramePrincipal extends javax.swing.JFrame {
    JFRespuestaSi jfrespuestasi = new JFRespuestaSi();
    Musica musica = new Musica();
    public JFramePrincipal() {
        initComponents();
        this.setTitle("PROGRAMA DE AMOR");
        this.setLocationRelativeTo(this);
        jfrespuestasi.setVisible(false);
        musica.playMusica();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLPregunta1 = new javax.swing.JLabel();
        jLPregunta = new javax.swing.JLabel();
        jBSi = new javax.swing.JButton();
        JBNo = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLPregunta1.setBackground(new java.awt.Color(255, 255, 255));
        jLPregunta1.setFont(new java.awt.Font("Tekton Pro Cond", 1, 48)); // NOI18N
        jLPregunta1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLPregunta1.setText("¿Quieres ser mi novia?");
        jLPregunta1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLPregunta1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLPregunta1.setOpaque(true);

        jLPregunta.setBackground(new java.awt.Color(255, 255, 255));
        jLPregunta.setFont(new java.awt.Font("Tekton Pro Cond", 1, 18)); // NOI18N
        jLPregunta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLPregunta.setText("Created by: ChrisPaz");
        jLPregunta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLPregunta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLPregunta.setOpaque(true);

        jBSi.setBackground(new java.awt.Color(255, 255, 0));
        jBSi.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        jBSi.setText("SI");
        jBSi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jBSi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBSiMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jBSiMouseExited(evt);
            }
        });
        jBSi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSiActionPerformed(evt);
            }
        });

        JBNo.setBackground(java.awt.Color.yellow);
        JBNo.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N
        JBNo.setText("NO");
        JBNo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        JBNo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                JBNoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                JBNoMouseExited(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                JBNoMouseReleased(evt);
            }
        });

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/EsponjaFondo.jpg"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLPregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(jBSi, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(340, 340, 340)
                        .addComponent(JBNo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(400, 400, 400)
                        .addComponent(jLPregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jLPregunta1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jBSi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(JBNo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(350, 350, 350)
                        .addComponent(jLPregunta)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSiActionPerformed
        jfrespuestasi.setVisible(true);
    }//GEN-LAST:event_jBSiActionPerformed

    private void jBSiMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSiMouseEntered
        this.jBSi.setBackground(Color.GREEN);
    }//GEN-LAST:event_jBSiMouseEntered

    private void jBSiMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSiMouseExited
        this.jBSi.setBackground(new Color(255,255,0));
    }//GEN-LAST:event_jBSiMouseExited

    private void JBNoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBNoMouseEntered
        //563, 382 JFrame
        //43, 35 Boton
        //473,330 LIMITES
        int numX = (int) (Math.random()*473)+1;
        int numY = (int) (Math.random()*330)+1;
        this.JBNo.setLocation(numX,numY);
    }//GEN-LAST:event_JBNoMouseEntered

    private void JBNoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBNoMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_JBNoMouseExited

    private void JBNoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_JBNoMouseReleased
        
    }//GEN-LAST:event_JBNoMouseReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton JBNo;
    private javax.swing.JButton jBSi;
    private javax.swing.JLabel jLPregunta;
    private javax.swing.JLabel jLPregunta1;
    // End of variables declaration//GEN-END:variables
}
