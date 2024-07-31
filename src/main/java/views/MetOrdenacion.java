
package views;

import ilib.*;
public class MetOrdenacion extends javax.swing.JPanel {
    
    static long i1, i2, i3;
    static double t1, t2, t3;
    
    public MetOrdenacion() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        pnlprincipal = new javax.swing.JPanel();
        btnMen = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        pnl3 = new javax.swing.JPanel();
        pnl4 = new javax.swing.JPanel();
        pnlcontenedor = new javax.swing.JPanel();
        pnl2 = new javax.swing.JPanel();

        bg.setBackground(new java.awt.Color(25, 118, 210));
        bg.setPreferredSize(new java.awt.Dimension(750, 430));

        pnlprincipal.setBackground(new java.awt.Color(25, 118, 210));

        btnMen.setText("Mostrar");
        btnMen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlprincipalLayout = new javax.swing.GroupLayout(pnlprincipal);
        pnlprincipal.setLayout(pnlprincipalLayout);
        pnlprincipalLayout.setHorizontalGroup(
            pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlprincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnMen, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );
        pnlprincipalLayout.setVerticalGroup(
            pnlprincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlprincipalLayout.createSequentialGroup()
                .addContainerGap(182, Short.MAX_VALUE)
                .addComponent(btnMen)
                .addGap(225, 225, 225))
        );

        jPanel1.setBackground(new java.awt.Color(25, 118, 210));
        jPanel1.setPreferredSize(new java.awt.Dimension(400, 400));

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
            .addGap(0, 720, Short.MAX_VALUE)
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
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(pnlprincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlprincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 855, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnMen;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel pnl2;
    private javax.swing.JPanel pnl3;
    private javax.swing.JPanel pnl4;
    private javax.swing.JPanel pnlcontenedor;
    private javax.swing.JPanel pnlprincipal;
    // End of variables declaration//GEN-END:variables
}
