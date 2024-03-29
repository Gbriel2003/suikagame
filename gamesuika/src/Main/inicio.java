package Main;

import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author gabri
 */
public class inicio extends javax.swing.JFrame {
    
    FondoPanel fondo = new FondoPanel();
    List<Fruta> listafrutas = new ArrayList<>();
    int caida = 5;
        
    public inicio() {
        this.setContentPane(fondo);
        initComponents();
        botontransparente();
        this.setLocationRelativeTo(null);
        
        Fruta datil = new Fruta("datil", "datil.png" , 1, false, 2, caida);
        Fruta cotoperi = new Fruta("cotoperi", "cotoperi.png" , 2, false, 4, caida);
        Fruta mamey = new Fruta("mamey", "mamey.png" , 3, false, 6, caida);
        Fruta cereza = new Fruta("cereza", "cereza.png" , 4, false, 8, caida);
        Fruta pumalaca = new Fruta("pumalaca", "pumalaca.png" , 5, false, 10, caida);
        Fruta kiwi = new Fruta("kiwi", "kiwi.png" , 6, false, 12, caida);
        Fruta parchita = new Fruta("parchita", "parchita.png" , 7, false, 14, caida);
        Fruta mango = new Fruta("mango", "mango.png" , 8, false, 16, caida);
        Fruta coco = new Fruta("coco", "coco.png" , 9, false, 18, caida);
        Fruta patilla = new Fruta("patilla", "patilla.png" , 10, false, 20, caida);
        
        
        listafrutas.add(datil);
        listafrutas.add(cotoperi);
        listafrutas.add(mamey);
        listafrutas.add(cereza);
        listafrutas.add(pumalaca);
        listafrutas.add(kiwi);
        listafrutas.add(parchita);
        listafrutas.add(mango);
        listafrutas.add(coco);
        listafrutas.add(patilla);
        
    
        
    }
    public void botontransparente(){
        jugar.setOpaque(false);
        jugar.setContentAreaFilled(false);
        jugar.setBorderPainted(false);
        puntaje.setOpaque(false);
        puntaje.setContentAreaFilled(false);
        puntaje.setBorderPainted(false);
        salir.setOpaque(false);
        salir.setContentAreaFilled(false);
        salir.setBorderPainted(false);
     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jugar = new javax.swing.JButton();
        puntaje = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jugar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Imagen1_off.png"))); // NOI18N
        jugar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jugar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/jugar1.png"))); // NOI18N
        jugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jugarActionPerformed(evt);
            }
        });

        puntaje.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/puntaje1.png"))); // NOI18N
        puntaje.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        puntaje.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/puntaje.png"))); // NOI18N

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir1.png"))); // NOI18N
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.png"))); // NOI18N
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(315, 315, 315)
                        .addComponent(jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(294, 294, 294)
                        .addComponent(puntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(285, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(318, 318, 318))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(183, Short.MAX_VALUE)
                .addComponent(jugar, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(puntaje, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void jugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jugarActionPerformed
        this.setVisible(false);
        juego c = new juego();
        c.setVisible(true);
    }//GEN-LAST:event_jugarActionPerformed

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
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jugar;
    private javax.swing.JButton puntaje;
    private javax.swing.JButton salir;
    // End of variables declaration//GEN-END:variables
}
     class FondoPanel extends JPanel{
         
         private Image imagen;
         
         @Override
         public void paint (Graphics g){
         
                imagen = new ImageIcon(getClass().getResource("/imagenes/maderafondo.png")).getImage();
                
                g.drawImage(imagen, 0, 0, getWidth(), getHeight(), this);
                
                setOpaque(false);
                
                super.paint(g);
 
         }
     }
