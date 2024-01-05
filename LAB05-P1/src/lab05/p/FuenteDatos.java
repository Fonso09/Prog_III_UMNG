package lab05.p;

public class FuenteDatos extends javax.swing.JFrame {
    GRÁFICA ex = new GRÁFICA();
    Datos dat= new Datos();
    public FuenteDatos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGraficar = new javax.swing.JButton();
        Opc = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGraficar.setText("Graficar");
        btnGraficar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficarActionPerformed(evt);
            }
        });

        Opc.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Veredas", "Predios", "Años", "Veredas en Años", " " }));
        Opc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpcActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGraficar)
                .addGap(17, 17, 17))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Opc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(235, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(Opc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
                .addComponent(btnGraficar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGraficarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficarActionPerformed
        
        
        int a = Opc.getSelectedIndex();
        int e=1;
        if(a==0){
            dat.FiltroVereda();
            dat.getFiltro();
            for (String i : dat.getFiltro().keySet()) {
                ex.guardarx(e);
                ex.guardary(dat.getFiltro().get(i));
                ex.guardar();
                e++;
        }
        } else if(a==1){
           dat.FiltroPredio();
            dat.getFiltro();
            for (String i : dat.getFiltro().keySet()) {
                ex.guardarx(e);
                ex.guardary(dat.getFiltro().get(i));
                ex.guardar();
                e++;
        } 
            
        } else if(a==2){
            dat.FiltroFechas();
            dat.getFiltro();
            for (String i : dat.getFiltro().keySet()) {
                ex.guardarx(e);
                ex.guardary(dat.getFiltro().get(i));
                ex.guardar();
                e++;
        }
        }
        
        ex.setVisible(true);
        
    }//GEN-LAST:event_btnGraficarActionPerformed

    private void OpcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpcActionPerformed
        
    }//GEN-LAST:event_OpcActionPerformed

    public static void main(String args[]) {


        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuenteDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Opc;
    private javax.swing.JButton btnGraficar;
    // End of variables declaration//GEN-END:variables
}
