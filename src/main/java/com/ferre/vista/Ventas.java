/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ferre.vista;


import com.ferre.controlador.FacturaControlador;
import com.ferre.model.Factura;
import com.ferre.vista.MenuPrincipal;
import com.toedter.calendar.JDateChooser;
import com.toedter.calendar.JMonthChooser;
import com.toedter.calendar.JYearChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Usuario
 */
public class Ventas extends javax.swing.JFrame {
    GenerarVenta generarVenta;
    MenuPrincipal menuprincipal = new MenuPrincipal();
    FacturaControlador facturactrl = new FacturaControlador();
    /**
     * Creates new form Ventas
     */
    public Ventas() {
        generarVenta=new GenerarVenta();
        initComponents();
    }
    public JDateChooser getfecha(){
        return date_fecha;
    }
    public JTextField getfactura(){
       return txt_Nofactura;
    }
    public JMonthChooser getmes(){
        return jMonth_mes;
    }
    public JYearChooser getaño(){
        return jYear_año;
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btn_atras = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        Btn_consFactura = new javax.swing.JButton();
        Btn_Facturar = new javax.swing.JButton();
        Btn_consVenta = new javax.swing.JButton();
        Btn_CVM = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txt_Nofactura = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Btn_CGM = new javax.swing.JButton();
        date_fecha = new com.toedter.calendar.JDateChooser();
        jMonth_mes = new com.toedter.calendar.JMonthChooser();
        jYear_año = new com.toedter.calendar.JYearChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 102, 204));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/LOGO FERRE 2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(94, 94, 94))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 204));
        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Elephant", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(238, 238, 238));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("VENTAS");

        btn_atras.setBackground(new java.awt.Color(0, 102, 204));
        btn_atras.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/atras.png"))); // NOI18N
        btn_atras.setBorderPainted(false);
        btn_atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_atrasActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 204));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/home.png"))); // NOI18N
        jButton1.setBorderPainted(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(120, 120, 120)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_atras, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2))
        );

        jPanel3.setBackground(new java.awt.Color(0, 102, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        Btn_consFactura.setBackground(new java.awt.Color(0, 153, 153));
        Btn_consFactura.setForeground(new java.awt.Color(238, 238, 238));
        Btn_consFactura.setText("CONSULTAR FACTURA");
        Btn_consFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_consFacturaActionPerformed(evt);
            }
        });

        Btn_Facturar.setBackground(new java.awt.Color(0, 153, 153));
        Btn_Facturar.setForeground(new java.awt.Color(238, 238, 238));
        Btn_Facturar.setText("REALIZAR VENTA");
        Btn_Facturar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_FacturarActionPerformed(evt);
            }
        });

        Btn_consVenta.setBackground(new java.awt.Color(0, 153, 153));
        Btn_consVenta.setForeground(new java.awt.Color(238, 238, 238));
        Btn_consVenta.setText("CONSULTAR VENTA DIA");
        Btn_consVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_consVentaActionPerformed(evt);
            }
        });

        Btn_CVM.setBackground(new java.awt.Color(0, 153, 153));
        Btn_CVM.setForeground(new java.awt.Color(238, 238, 238));
        Btn_CVM.setText("CONSULTAR VENTA MES");
        Btn_CVM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CVMActionPerformed(evt);
            }
        });

        jLabel3.setForeground(new java.awt.Color(238, 238, 238));
        jLabel3.setText("NUMERO DE FACTURA");

        txt_Nofactura.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_Nofactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_NofacturaActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(238, 238, 238));
        jLabel4.setText("FECHA");

        jLabel5.setForeground(new java.awt.Color(238, 238, 238));
        jLabel5.setText("MES");

        Btn_CGM.setBackground(new java.awt.Color(0, 153, 153));
        Btn_CGM.setForeground(new java.awt.Color(238, 238, 238));
        Btn_CGM.setText("CONSULTAR GANANCIA MES");
        Btn_CGM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Btn_CGMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(date_fecha, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                            .addComponent(txt_Nofactura))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(Btn_consFactura, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Btn_consVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jMonth_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jYear_año, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Btn_CVM, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(Btn_CGM, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(133, 133, 133))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Facturar, javax.swing.GroupLayout.PREFERRED_SIZE, 485, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(Btn_Facturar)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txt_Nofactura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(Btn_consFactura))
                .addGap(44, 44, 44)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(date_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Btn_consVenta))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jMonth_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jYear_año, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_CGM)
                    .addComponent(Btn_CVM))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Btn_CVMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CVMActionPerformed
        // TODO add your handling code here:
       try{
                List<Factura> facturas = facturactrl.getByMY(this.getmes().getMonth()+1,this.getaño().getYear());
                String mes = getMes(this.getmes().getMonth()+1);
                this.setVisible(false);
                MesVentas mventas = new MesVentas(this.getmes().getMonth()+1,this.getaño().getYear());
                mventas.mesVentas.setText("VENTAS "+mes.toUpperCase() +" "+this.getaño().getYear());
                mventas.setVisible(true);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Rellene correctamente el formulario", "Advertencia"
                        , JOptionPane.WARNING_MESSAGE); 
            }
    }//GEN-LAST:event_Btn_CVMActionPerformed

    private void Btn_FacturarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_FacturarActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        generarVenta.setVisible(true);
        
    }//GEN-LAST:event_Btn_FacturarActionPerformed

    private void Btn_consFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_consFacturaActionPerformed
        // TODO add your handling code here:
        int nFactura = Integer.valueOf(this.getfactura().getText());
        try{
            Factura factura = facturactrl.getById(nFactura);
            this.setVisible(false);
            new FacturaGen(factura).setVisible(true);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,"El numero de la factura no se encuentra registrado", "Advertencia"
                        , JOptionPane.WARNING_MESSAGE); 
        }
        
    }//GEN-LAST:event_Btn_consFacturaActionPerformed

    private void Btn_consVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_consVentaActionPerformed
            // TODO add your handling code here:
            //Date date = this.getfecha().getDate().parse("yyyy-MM-dd");
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date fecha = new Date();
            Date date = new Date();
        try {
            date = sdf.parse(sdf.format(fecha));
        } catch (ParseException ex) {
            Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
        }
            SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
            String datee = format.format(this.getfecha().getDate());
            try{
                List<Factura> facturas = facturactrl.getByFecha(date);
                this.setVisible(false);
                FechaGen fechagen = new FechaGen(date);
                fechagen.fechaVenta.setText("Ventas "+datee);
                fechagen.setVisible(true);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"No se encontraron facturas en la fecha indicada", "Advertencia"
                        , JOptionPane.WARNING_MESSAGE); 
            }
    }//GEN-LAST:event_Btn_consVentaActionPerformed

    private void Btn_CGMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Btn_CGMActionPerformed
        // TODO add your handling code here:
        try{
                List<Factura> facturas = facturactrl.getByMY(this.getmes().getMonth()+1,this.getaño().getYear());
                this.setVisible(false);
                String mes = getMes(this.getmes().getMonth()+1);
                
                MesGanancias mesg = new MesGanancias(this.getmes().getMonth()+1,this.getaño().getYear());
                mesg.gananciasMes.setText("GANANCIAS "+mes.toUpperCase()+" "+ getaño().getYear());
                mesg.setVisible(true);
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Rellene correctamente el formulario", "Advertencia"
                        , JOptionPane.WARNING_MESSAGE); 
            }
            
    }//GEN-LAST:event_Btn_CGMActionPerformed

    private void btn_atrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_atrasActionPerformed
        // TODO add your handling code here:
        
        menuprincipal.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_btn_atrasActionPerformed

    private void txt_NofacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_NofacturaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_NofacturaActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton Btn_CGM;
    public javax.swing.JButton Btn_CVM;
    public javax.swing.JButton Btn_Facturar;
    public javax.swing.JButton Btn_consFactura;
    public javax.swing.JButton Btn_consVenta;
    public javax.swing.JButton btn_atras;
    public com.toedter.calendar.JDateChooser date_fecha;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public com.toedter.calendar.JMonthChooser jMonth_mes;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public com.toedter.calendar.JYearChooser jYear_año;
    public javax.swing.JTextField txt_Nofactura;
    // End of variables declaration//GEN-END:variables
    public String getMes(int mes){
    
        String  meS = "";
    switch (mes) {
      case 1:
        meS="Enero";
        break;
      case 2:
        meS="Febrero";
        break;
      case 3:
        meS="Marzo";
        break;
      case 4:
        meS="Abril";
        break;
      case 5:
        meS="Mayo";
        break;
      case 6:
        meS="Junio";
        break;
      case 7:
        meS="Julio";
        break;
      case 8:
        meS="Agosto";
        break;
      case 9:
        meS="Septiembre";
        break;
      case 10:
        meS="Octubre";
        break;
      case 11:
        meS="Noviembre";
        break;
      case 12:
        meS="Diciembre";
        break;  
        
      
    }
    return meS;
    }


}
