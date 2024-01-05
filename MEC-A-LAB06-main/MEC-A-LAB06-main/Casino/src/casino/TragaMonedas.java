/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package casino;


import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author Portátil de Fonso
 */
public class TragaMonedas extends javax.swing.JFrame {
    int in=0;
    int s1,s2,s3;
    int sald;
    boolean detener= false;
    public void detenerHilos(){
        detener=true;
    }
    public synchronized void activarHilos(){
        detener=false;
        notifyAll();
        
    }
    Thread t = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                while (detener) {
                    synchronized (TragaMonedas.this) {
                        try {
                            TragaMonedas.this.wait();
                        }catch (InterruptedException e) {
                            // Manejar interrupción si es necesario
                        }
                    }
                }
                for (int i = 0; i<20; i++) {
                    int num= (int)(Math.random()*100+1);
                    stock1.setIcon(new ImageIcon(TragaMonedas.this.getClass().getResource("/casino/obj/"+num%16+".jpg")));
                    
                    try{
                        Thread.sleep(100);
                    } catch(InterruptedException e){
                    }
                    if(i==19){
                        detenerHilos();
                    }
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        // Manejar interrupción si es necesario
                    }
                    s1=(num%16)+1;
                }
            }
        }
    });
    Thread t1 = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                while (detener) {
                    synchronized (TragaMonedas.this) {
                        try {
                            TragaMonedas.this.wait();
                        }catch (InterruptedException e) {
                            // Manejar interrupción si es necesario
                        }
                    }
                }
                for (int i = 0; i<20; i++) {
                    int num= (int)(Math.random()*100+1);
                    stock2.setIcon(new ImageIcon(TragaMonedas.this.getClass().getResource("/casino/obj/"+num%16+".jpg")));
                    
                    try{
                        Thread.sleep(100);
                    } catch(InterruptedException e){
                    }
                    if(i==19){
                        detenerHilos();
                    }
                    try {
                        Thread.sleep(110);
                    } catch (InterruptedException e) {
                        // Manejar interrupción si es necesario
                    }
                    

                   s2=(num%16)+1;
                }
                
               
            }
        }
    });
    Thread t2 = new Thread(new Runnable() {
        @Override
        public void run() {
            while (true) {
                while (detener) {
                    synchronized (TragaMonedas.this) {
                        try {
                            TragaMonedas.this.wait();
                        }catch (InterruptedException e) {
                            // Manejar interrupción si es necesario
                        }
                    }
                }
                for (int i = 0; i<20; i++) {
                    int num= (int)(Math.random()*100+1);
                    stock3.setIcon(new ImageIcon(TragaMonedas.this.getClass().getResource("/casino/obj/"+num%16+".jpg"))); 
                    
                    try{
                        Thread.sleep(100);
                    } catch(InterruptedException e){
                    }
                    if(i==19){
                        detenerHilos();
                    }
                    try {
                        Thread.sleep(120);
                    } catch (InterruptedException e) {
                        // Manejar interrupción si es necesario
                    }
                    
                    s3=(num%16)+1;
                    //System.out.print(dad2);
                }
                if(s1==s2 || s1==s3 || s2==s3){
                    sald=sald+(sald/2);
                    saldo.setText(String.valueOf(sald));
                } else if(s1==s2 && s1==s3 ){
                    sald=sald*2;
                    saldo.setText(String.valueOf(sald));
                } else{
                    sald=sald-10;
                    saldo.setText(String.valueOf(sald));
                }
                
               
            }
        }
    });
    
    public TragaMonedas() {
        initComponents();
       
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        stock2 = new javax.swing.JLabel();
        stock3 = new javax.swing.JLabel();
        stock1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        saldo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        stock2.setText("jLabel2");
        jPanel1.add(stock2, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 210, 100, 170));

        stock3.setText("jLabel2");
        jPanel1.add(stock3, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 220, 100, 150));

        stock1.setText("jLabel2");
        jPanel1.add(stock1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 100, 170));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 70, 50, 30));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        jLabel2.setText("SALDO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        saldo.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        saldo.setText("0");
        jPanel1.add(saldo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 90, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/casino/fondoReal2.jpg"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-3, -4, 800, 540));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        in++;
        
        if(sald<=0){
            saldo.setText("0");
            sald= Integer.parseInt(JOptionPane.showInputDialog(null,"Introducir Saldo"));
            saldo.setText(String.valueOf(sald));
        }
        if(in==1){
            t.start();
            t1.start();
            t2.start();
        } else{
          activarHilos(); 
          
        }
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(TragaMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TragaMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TragaMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TragaMonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TragaMonedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel saldo;
    private javax.swing.JLabel stock1;
    private javax.swing.JLabel stock2;
    private javax.swing.JLabel stock3;
    // End of variables declaration//GEN-END:variables
}
