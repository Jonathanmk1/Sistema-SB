package ilib;

import java.util.logging.Level;
import java.util.logging.Logger;

public class FrmMO extends javax.swing.JFrame {

    static long i1, i2, i3;
    static double t1, t2, t3;

    public FrmMO() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlprincipal = new javax.swing.JPanel();
        btnMen = new javax.swing.JButton();
        btncerrar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pnl3 = new javax.swing.JPanel();
        pnl4 = new javax.swing.JPanel();
        pnlcontenedor = new javax.swing.JPanel();
        pnl2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 255));
        setUndecorated(true);

        pnlprincipal.setBackground(new java.awt.Color(25, 118, 210));
        pnlprincipal.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        btnMen.setText("Mostrar");
        btnMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenActionPerformed(evt);
            }
        });

        btncerrar.setText("Cerrar");
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlprincipalLayout = new javax.swing.GroupLayout(pnlprincipal);
        pnlprincipal.setLayout(pnlprincipalLayout);
        pnlprincipalLayout.setHorizontalGroup(
            pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnMen, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btncerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        pnlprincipalLayout.setVerticalGroup(
            pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlprincipalLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(btnMen)
                .addGap(83, 83, 83)
                .addComponent(btncerrar)
                .addContainerGap(270, Short.MAX_VALUE))
        );

        jPanel1.setBackground(new java.awt.Color(25, 118, 210));

        pnl3.setBackground(new java.awt.Color(255, 255, 255));
        pnl3.setBorder(new javax.swing.border.MatteBorder(null));
        pnl3.setForeground(new java.awt.Color(255, 255, 255));
        pnl3.setLayout(new java.awt.BorderLayout());

        pnl4.setBackground(new java.awt.Color(255, 255, 255));
        pnl4.setBorder(new javax.swing.border.MatteBorder(null));
        pnl4.setForeground(new java.awt.Color(255, 255, 255));
        pnl4.setLayout(new java.awt.BorderLayout());

        pnlcontenedor.setBackground(new java.awt.Color(255, 255, 255));
        pnlcontenedor.setBorder(new javax.swing.border.MatteBorder(null));
        pnlcontenedor.setForeground(new java.awt.Color(255, 255, 255));
        pnlcontenedor.setLayout(new java.awt.BorderLayout());

        pnl2.setBackground(new java.awt.Color(255, 255, 255));
        pnl2.setBorder(new javax.swing.border.MatteBorder(null));
        pnl2.setForeground(new java.awt.Color(255, 255, 255));
        pnl2.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 739, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(5, 5, 5)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnlcontenedor, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                        .addComponent(pnl3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pnl2, javax.swing.GroupLayout.DEFAULT_SIZE, 350, Short.MAX_VALUE)
                        .addComponent(pnl4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGap(5, 5, 5)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(pnl2, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnlcontenedor, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(pnl3, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(pnl4, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(21, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlprincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenActionPerformed

        Burbuja pnlDibujo4 = new Burbuja();
        Thread t = new Thread(pnlDibujo4);

        HeapSort pnlDibujo = new HeapSort();
        Thread l = new Thread(pnlDibujo);

        Seleccion pnlDibujo1 = new Seleccion();
        Thread r = new Thread(pnlDibujo1);

        Inserción pnlDibujo3 = new Inserción();
        Thread e = new Thread(pnlDibujo3);

        pnl4.removeAll();
        pnl4.add(pnlDibujo4);
        pnlDibujo4.revalidate();
        pnlDibujo4.repaint();
//        t.start();

        pnlcontenedor.removeAll();
        pnlcontenedor.add(pnlDibujo);
        pnlDibujo.revalidate();
        pnlDibujo.repaint();
//        l.start();

        pnl2.removeAll();
        pnl2.add(pnlDibujo1);
        pnlDibujo1.revalidate();
        pnlDibujo1.repaint();
//        r.start();

        pnl3.removeAll();
        pnl3.add(pnlDibujo3);
        pnlDibujo3.revalidate();
        pnlDibujo3.repaint();
//        e.start();

        long inicio = System.nanoTime();
        t.start();
        l.start();
        r.start();
        e.start();
        long f4 = System.nanoTime();

        try {
            i1 = System.nanoTime();
            t.join();
            long f1 = System.nanoTime();
            t1 = (f1 - i1) / 1e9;
            
            i2 = System.nanoTime();
            l.join();
            long f2 = System.nanoTime();
            t2 = (f2 - i2) / 1e9;
            
            i3 = System.nanoTime();
            r.join();
            long f3 = System.nanoTime();
            t3 = (f3 - i3) / 1e9;
            
            
        } catch (InterruptedException ex) {

        }
        
        long fin = System.nanoTime();
        double t_total = (fin - inicio) / 1e9;
//        double t = (fin - inicio) / 1e9;
        double t4 = (f4 - inicio) / 1e9;
        
//        System.out.printf("%-10s %-10s %-10s %-10s %-10s", "t_total", "t_m1", "t_m2", "t_m3", "t_m4");
//        System.out.println(" ");
        System.out.printf("%-10.4f %-10.4f %-10.4f %-10.4f %-10.4f", t_total, t1, t2, t3, t4);

    }//GEN-LAST:event_btnMenActionPerformed
    private void tiempo() {

    }
    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
        dispose();
        System.exit(0);
    }//GEN-LAST:event_btncerrarActionPerformed

//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(FrmMO.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(FrmMO.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(FrmMO.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrmMO.class
//                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new FrmMO().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMen;
    private javax.swing.JButton btncerrar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    private javax.swing.JPanel pnl4;
    private javax.swing.JPanel pnlcontenedor;
    private javax.swing.JPanel pnlprincipal;
    // End of variables declaration//GEN-END:variables
}
