/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paint;

import java.awt.Color;

/**
 *
 * @author alextec
 */
public class Resize extends javax.swing.JFrame {

    /**
     * Creates new form Resize
     */
    public Resize() {
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

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jButton1.setText("Resize");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Horizontal");

        jLabel2.setText("Vertical");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 82, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addGap(32, 32, 32)
                .addComponent(jButton1)
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jButton1)))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
        if(paintJFrame.flag==1){
        paintJFrame.jPanel1.update(paintJFrame.g2);   
        paintJFrame.polygonsContainer.remove(paintJFrame.selectedPolygon);
        paintJFrame.DrawAll();
        if(paintJFrame.selectedPolygon.getXstart()<=paintJFrame.selectedPolygon.getXend()&&paintJFrame.selectedPolygon.getYstart()<=paintJFrame.selectedPolygon.getYend())
        paintJFrame.selectedPolygon.polygon2D(paintJFrame.selectedPolygon.getXstart(),paintJFrame.selectedPolygon.getXstart()+Float.parseFloat(jTextField1.getText()),paintJFrame.selectedPolygon.getYstart(),paintJFrame.selectedPolygon.getYstart()+Float.parseFloat(jTextField2.getText()) );
        else if(paintJFrame.selectedPolygon.getXstart()>=paintJFrame.selectedPolygon.getXend()&&paintJFrame.selectedPolygon.getYstart()<=paintJFrame.selectedPolygon.getYend())
        paintJFrame.selectedPolygon.polygon2D(paintJFrame.selectedPolygon.getXstart(),paintJFrame.selectedPolygon.getXstart()-Float.parseFloat(jTextField1.getText()),paintJFrame.selectedPolygon.getYstart(),paintJFrame.selectedPolygon.getYstart()+Float.parseFloat(jTextField2.getText()) );
         else if(paintJFrame.selectedPolygon.getXstart()<=paintJFrame.selectedPolygon.getXend()&&paintJFrame.selectedPolygon.getYstart()>=paintJFrame.selectedPolygon.getYend())
        paintJFrame.selectedPolygon.polygon2D(paintJFrame.selectedPolygon.getXstart(),paintJFrame.selectedPolygon.getXstart()+Float.parseFloat(jTextField1.getText()),paintJFrame.selectedPolygon.getYstart(),paintJFrame.selectedPolygon.getYstart()-Float.parseFloat(jTextField2.getText()) );
          else if(paintJFrame.selectedPolygon.getXstart()>=paintJFrame.selectedPolygon.getXend()&&paintJFrame.selectedPolygon.getYstart()>=paintJFrame.selectedPolygon.getYend())
        paintJFrame.selectedPolygon.polygon2D(paintJFrame.selectedPolygon.getXstart(),paintJFrame.selectedPolygon.getXstart()-Float.parseFloat(jTextField1.getText()),paintJFrame.selectedPolygon.getYstart(),paintJFrame.selectedPolygon.getYstart()-Float.parseFloat(jTextField2.getText()) );
       
        paintJFrame.selectedPolygon.drawPolygon();
        paintJFrame.polygonsContainer.add(paintJFrame.selectedPolygon);
        paintJFrame.DrawAll();
        paintJFrame.newState();
        dispose();}
       
         if(paintJFrame.flag==2){
        paintJFrame.jPanel1.update(paintJFrame.g2);   
        paintJFrame.ellipticalShapesContainer.remove(paintJFrame.selectedEllipticalShape);
        paintJFrame.DrawAll();
        paintJFrame.selectedEllipticalShape.ellipticalShape2D(paintJFrame.selectedEllipticalShape.getXstart(),Float.parseFloat(jTextField1.getText())+paintJFrame.selectedEllipticalShape.getXstart(),paintJFrame.selectedEllipticalShape.getYstart(),Float.parseFloat(jTextField2.getText())+paintJFrame.selectedEllipticalShape.getYstart() );
        paintJFrame.selectedEllipticalShape.drawEllipticalShape();
        paintJFrame.ellipticalShapesContainer.add(paintJFrame.selectedEllipticalShape);
        paintJFrame.DrawAll();
         paintJFrame.newState();
        dispose();}
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
            java.util.logging.Logger.getLogger(Resize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Resize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Resize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Resize.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Resize().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}