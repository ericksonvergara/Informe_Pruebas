/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package redsuelva.genadorInformes.views;

import java.io.File;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author erickson.vergara
 */
public class CargueArchivosView extends javax.swing.JFrame {

    /**
     * Creates new form cargar_BD
     */
    public CargueArchivosView() {
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

        cargara_lbl3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        textFielNameFileGeneral = new javax.swing.JTextField();
        btn_cargar = new javax.swing.JButton();
        cargar_lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        textFileNameUpdatePagos = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        btn_UpdatePagos = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        UpdatePagos_lbl = new javax.swing.JLabel();
        cargara_lbl2 = new javax.swing.JLabel();
        cargara_lbl4 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        cargara_lbl3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscando.png"))); // NOI18N
        cargara_lbl3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cargara_lbl3MouseClicked(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cargar BD");

        btn_cargar.setText("Cargar");

        cargar_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscando.png"))); // NOI18N

        jLabel2.setText("Pagos");

        jLabel3.setText("Cartera");

        jLabel4.setText("Gestion");

        btn_UpdatePagos.setText("Actualizar");

        jButton3.setText("Actualizar");

        jButton4.setText("Actualizar");

        UpdatePagos_lbl.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscando.png"))); // NOI18N

        cargara_lbl2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscando.png"))); // NOI18N

        cargara_lbl4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/buscando.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(textFielNameFileGeneral)
                                .addGap(10, 10, 10))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE)
                                    .addComponent(textFileNameUpdatePagos, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(UpdatePagos_lbl)
                                    .addComponent(cargara_lbl2))
                                .addComponent(cargara_lbl4))
                            .addComponent(cargar_lbl))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn_cargar, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3)
                            .addComponent(btn_UpdatePagos)
                            .addComponent(jButton4))
                        .addGap(230, 230, 230))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(157, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(textFileNameUpdatePagos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel1)
                                .addComponent(textFielNameFileGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cargar_lbl)
                            .addComponent(btn_cargar, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(5, 5, 5)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(UpdatePagos_lbl)
                            .addComponent(btn_UpdatePagos))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cargara_lbl2)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4)
                            .addComponent(cargara_lbl4))))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cargara_lbl3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cargara_lbl3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cargara_lbl3MouseClicked

    
    /*
    CAMPOS CARGAR BASE DE DATOS
    */
    public JLabel getCargar_lbl() {
        return cargar_lbl;
    }

    public void setCargar_lbl(JLabel cargar_lbl) {
        this.cargar_lbl = cargar_lbl;
    }

    public JTextField getTextFielNameFileGeneral() {
        return textFielNameFileGeneral;
    }

    public void setTextFielNameFileGeneral(JTextField textFielNameFileGeneral) {
        this.textFielNameFileGeneral = textFielNameFileGeneral;
    }

    public JButton getBtn_cargar() {
        return btn_cargar;
    }

    public void setBtn_cargar(JButton btn_cargar) {
        this.btn_cargar = btn_cargar;
    }
    
    /*
    CAMPOS ACTUALIZAR EL MODULO DE PAGOS
    */

    public JLabel getUpdatePagos_lbl() {
        return UpdatePagos_lbl;
    }

    public void setUpdatePagos_lbl(JLabel UpdatePagos_lbl) {
        this.UpdatePagos_lbl = UpdatePagos_lbl;
    }

    public JTextField getTextFileNameUpdatePagos() {
        return textFileNameUpdatePagos;
    }

    public void setTextFileNameUpdatePagos(JTextField textFileNameUpdatePagos) {
        this.textFileNameUpdatePagos = textFileNameUpdatePagos;
    }

    public JButton getBtn_UpdatePagos() {
        return btn_UpdatePagos;
    }

    public void setBtn_UpdatePagos(JButton btn_UpdatePagos) {
        this.btn_UpdatePagos = btn_UpdatePagos;
    }  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel UpdatePagos_lbl;
    private javax.swing.JButton btn_UpdatePagos;
    private javax.swing.JButton btn_cargar;
    private javax.swing.JLabel cargar_lbl;
    private javax.swing.JLabel cargara_lbl2;
    private javax.swing.JLabel cargara_lbl3;
    private javax.swing.JLabel cargara_lbl4;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField textFielNameFileGeneral;
    private javax.swing.JTextField textFileNameUpdatePagos;
    // End of variables declaration//GEN-END:variables
}