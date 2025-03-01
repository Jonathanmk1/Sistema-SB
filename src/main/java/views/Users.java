package views;

import ilib.DAOUsersImpl;
import ilib.FrmSisBib;
import interfaces.DAOUsers;
import java.awt.Color;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import db.Conexion;
import java.io.*;
import java.sql.*;
import javax.swing.JOptionPane;

public class Users extends javax.swing.JPanel implements Runnable{
    Conexion conexion;
    
    public Users() {
        initComponents();
        InitStyles();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            System.out.println("Error");
        }
        h1.start();
  
    }
    Thread h1 = new Thread(this);
    
    private void InitStyles() {
        title.putClientProperty("FlatLaf.styleClass", "h1");
        title.setForeground(Color.black);
        userSearch.putClientProperty("JTextField.placeholderText", "Ingrese el nombre de usuario a buscar.");
    }
    
     @Override
    public void run() {
        try {
            DAOUsers dao = new DAOUsersImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            dao.listar("").forEach((u) -> model.addRow(new Object[]{u.getId(), u.getName(), u.getLast_name_p(), u.getLast_name_m(), u.getDomicilio(), u.getTel()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        userSearch = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        btnpdf = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));

        bg.setBackground(new java.awt.Color(255, 255, 255));

        title.setText("Usuarios");

        userSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userSearchActionPerformed(evt);
            }
        });

        searchButton.setBackground(new java.awt.Color(18, 90, 173));
        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        searchButton.setForeground(new java.awt.Color(255, 255, 255));
        searchButton.setText("Buscar");
        searchButton.setBorderPainted(false);
        searchButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Apellido P.", "Apellido M.", "Domicilio", "Teléfono"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.getTableHeader().setReorderingAllowed(false);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable1MousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        deleteButton.setBackground(new java.awt.Color(18, 90, 173));
        deleteButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deleteButton.setForeground(new java.awt.Color(255, 255, 255));
        deleteButton.setText("Borrar");
        deleteButton.setBorderPainted(false);
        deleteButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        editButton.setBackground(new java.awt.Color(18, 90, 173));
        editButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        editButton.setForeground(new java.awt.Color(255, 255, 255));
        editButton.setText("Editar");
        editButton.setBorderPainted(false);
        editButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        addButton.setBackground(new java.awt.Color(18, 90, 173));
        addButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addButton.setForeground(new java.awt.Color(255, 255, 255));
        addButton.setText("Nuevo");
        addButton.setBorderPainted(false);
        addButton.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        btnpdf.setBackground(new java.awt.Color(18, 90, 173));
        btnpdf.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnpdf.setForeground(new java.awt.Color(255, 255, 255));
        btnpdf.setText("Pdf");
        btnpdf.setBorderPainted(false);
        btnpdf.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnpdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnpdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(699, 699, 699))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(328, 328, 328)
                                .addComponent(btnpdf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(18, 18, 18)
                                .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(deleteButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(userSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton)))
                        .addGap(50, 50, 50))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(userSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deleteButton)
                    .addComponent(editButton)
                    .addComponent(addButton)
                    .addComponent(btnpdf))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MousePressed

    }//GEN-LAST:event_jTable1MousePressed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        FrmSisBib.ShowJPanel(new UpUsers());
    }//GEN-LAST:event_addButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        DAOUsers dao = new DAOUsersImpl();
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        if (jTable1.getSelectedRows().length < 1) {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes seleccionar uno o más usuarios a eliminar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        } else {
            for (int i : jTable1.getSelectedRows()) {
                try {
                    dao.eliminar((int) jTable1.getValueAt(i, 0));
                    model.removeRow(i);
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        if (jTable1.getSelectedRow() > -1) {
            try {
                int userId = (int) jTable1.getValueAt(jTable1.getSelectedRow(), 0);
                DAOUsers dao = new DAOUsersImpl();
                FrmSisBib.ShowJPanel(new UpUsers(dao.getUserById(userId)));
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Debes seleccionar el usuario a editar.\n", "AVISO", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try {
            DAOUsers dao = new DAOUsersImpl();
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0);
            dao.listar(userSearch.getText()).forEach((u) -> model.addRow(new Object[]{u.getId(), u.getName(), u.getLast_name_p(), u.getLast_name_m(), u.getDomicilio(), u.getTel()}));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_searchButtonActionPerformed

    private void btnpdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnpdfActionPerformed
        Document documento = new Document();
        try {
            String ruta = System.getProperty("C:\\Users\\USER\\OneDrive - Universidad Autónoma del Estado de México\\Documents");
            PdfWriter.getInstance(documento, new FileOutputStream(ruta + "Reporte_usuarios.pdf"));
            documento.open();
            PdfPTable tabla = new PdfPTable(6);
            tabla.addCell("Id");
            tabla.addCell("Nombre");
            tabla.addCell("Apellido_Paterno");
            tabla.addCell("Apellido_Materno");
            tabla.addCell("Domicilio");
            tabla.addCell("Telefono");
            
            try {
                conexion = new Conexion();
                Connection conectar = conexion.conectar();
                PreparedStatement seleccionar = conectar.prepareStatement("select * from users");
                ResultSet consultar = seleccionar.executeQuery();
                
                if(consultar.next()){
                    do{
                        tabla.addCell(consultar.getString(1));
                        tabla.addCell(consultar.getString(2));
                        tabla.addCell(consultar.getString(3));
                        tabla.addCell(consultar.getString(4));
                        tabla.addCell(consultar.getString(5));
                        tabla.addCell(consultar.getString(6));
                        
                    }while(consultar.next());
                    documento.add(tabla);
                }else{
                    JOptionPane.showMessageDialog(null, "no existen datos");
                }
                
            } catch (SQLException e) {
                System.out.println("Error :" + e);
                
            }
            documento.close();
            conexion.cerrar();
            JOptionPane.showMessageDialog(null, "Reporte creado con exito");
            
        } catch (DocumentException | FileNotFoundException e) {
            System.out.println("Error");
        } catch (SQLException ex) {
            //Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnpdfActionPerformed

    private void userSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userSearchActionPerformed
        
    }//GEN-LAST:event_userSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JPanel bg;
    private javax.swing.JButton btnpdf;
    private javax.swing.JButton deleteButton;
    private javax.swing.JButton editButton;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton searchButton;
    private javax.swing.JLabel title;
    private javax.swing.JTextField userSearch;
    // End of variables declaration//GEN-END:variables

}