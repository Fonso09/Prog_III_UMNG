/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package prueba.timers;

import java.awt.event.ActionEvent;
import java.applet.AudioClip;
import javax.swing.Timer;

/**
 *
 * @author Portátil de Fonso
 */
public class DemoTimer extends javax.swing.JFrame {

    private Timer myTimer;
   private Timer myTimer2;
    private int horas=0;
    private int minutos=0;
    private int segundos=0;
    public DemoTimer() {
        initComponents();
        myTimer = new Timer(1000, (ActionEvent e) -> {
           IniciarCronometro();
        });
        myTimer2 = new Timer(10000, (ActionEvent e) -> {
           Sonido();
        });
    }
    private void Sonido(){
        AudioClip Sound;
        Sound = java.applet.Applet.newAudioClip(getClass().getResource("/prueba.timers/alarma.wav"));
        Sound.play();
    }

    private void IniciarCronometro(){
        horas= Integer.parseInt(texthoras.getText());
        minutos= Integer.parseInt(textminutos.getText());
        segundos= Integer.parseInt(textsegundos.getText());
        ActualizarTiempos();
        ActualizarTextos();
    }
    private void ActualizarTiempos(){
        
        if(segundos==0 && minutos!=0){
            segundos=60;
            minutos--;
        }
        if(minutos==0 && horas!=0){
            minutos=60;
            horas--;
        }
        segundos--;
        if(segundos==0 && minutos ==0 && horas==0){
            myTimer2.start();
        }
     
    }
    private void ActualizarTextos(){
        texthoras.setText(String.valueOf(horas));
        textminutos.setText(String.valueOf(minutos));
        textsegundos.setText(String.valueOf(segundos));
     
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnstart = new javax.swing.JButton();
        btnrestart = new javax.swing.JButton();
        btnstop = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        texthoras = new javax.swing.JTextField();
        textminutos = new javax.swing.JTextField();
        textsegundos = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnstart.setText("INICIAR");
        btnstart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstartActionPerformed(evt);
            }
        });

        btnrestart.setText("REINICIAR");
        btnrestart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnrestartActionPerformed(evt);
            }
        });

        btnstop.setText("STOP");
        btnstop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnstopActionPerformed(evt);
            }
        });

        jLabel1.setText("HH");

        jLabel2.setText("MM");

        jLabel3.setText("SS");

        texthoras.setText("00");
        texthoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                texthorasActionPerformed(evt);
            }
        });

        textminutos.setText("00");
        textminutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textminutosActionPerformed(evt);
            }
        });

        textsegundos.setText("00");
        textsegundos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textsegundosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(texthoras, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textminutos, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textsegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addComponent(jLabel1)
                                .addGap(111, 111, 111))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnstart)
                                .addGap(67, 67, 67)
                                .addComponent(btnstop)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(93, 93, 93)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(96, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(btnrestart)
                                .addGap(0, 0, Short.MAX_VALUE))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(52, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texthoras, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textminutos, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textsegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnrestart, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnstop, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnstart, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void texthorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_texthorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_texthorasActionPerformed

    private void textminutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textminutosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textminutosActionPerformed

    private void textsegundosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textsegundosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textsegundosActionPerformed

    private void btnstopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstopActionPerformed
        myTimer.stop();
        btnstart.setEnabled(true);
    }//GEN-LAST:event_btnstopActionPerformed

    private void btnstartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnstartActionPerformed
        myTimer.start();
        btnstart.setEnabled(false);
        
    }//GEN-LAST:event_btnstartActionPerformed

    private void btnrestartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnrestartActionPerformed
        if(myTimer.isRunning()){
            myTimer.stop();
            btnstart.setEnabled(true);
        }
        horas=0;
        minutos=0;
        segundos=0;
        ActualizarTextos();
    }//GEN-LAST:event_btnrestartActionPerformed

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
            java.util.logging.Logger.getLogger(DemoTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DemoTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DemoTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DemoTimer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DemoTimer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnrestart;
    private javax.swing.JButton btnstart;
    private javax.swing.JButton btnstop;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField texthoras;
    private javax.swing.JTextField textminutos;
    private javax.swing.JTextField textsegundos;
    // End of variables declaration//GEN-END:variables
}
