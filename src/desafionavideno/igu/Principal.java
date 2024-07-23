
package desafionavideno.igu;

import desafionavideno.logica.Controladora;

public class Principal extends javax.swing.JFrame {
    
    Controladora control = new Controladora();
    
    String emoji;
    String matriz[][] = new String[4][4];
    int cantEncontrados;

 
    public Principal() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCantidad = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        btnPapaNoel = new javax.swing.JButton();
        btnEstrella = new javax.swing.JButton();
        btnArbol = new javax.swing.JButton();
        btnRegalo = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtEmojiElegido = new javax.swing.JTextField();
        txtCantidadElegida = new javax.swing.JTextField();
        txtEncontrados = new javax.swing.JTextField();
        txtResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Adivinanza Navideña");

        jLabel2.setText("Ingrese la cantidad de veces que cree que aparece el personaje");

        txtCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCantidadActionPerformed(evt);
            }
        });

        jLabel3.setText("Eliga su personaje:");

        btnPapaNoel.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnPapaNoel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desafionavideno/imagenes/santa64x64.png"))); // NOI18N
        btnPapaNoel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapaNoelActionPerformed(evt);
            }
        });

        btnEstrella.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnEstrella.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desafionavideno/imagenes/estrella64x64.png"))); // NOI18N
        btnEstrella.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstrellaActionPerformed(evt);
            }
        });

        btnArbol.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnArbol.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desafionavideno/imagenes/arbol64x64.png"))); // NOI18N
        btnArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnArbolActionPerformed(evt);
            }
        });

        btnRegalo.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnRegalo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desafionavideno/imagenes/regalo64x64.png"))); // NOI18N
        btnRegalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegaloActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/desafionavideno/imagenes/reset48x48.png"))); // NOI18N
        jButton1.setText("Reset");

        jLabel4.setText("Elegido: ");

        jLabel5.setText("Cantidad:");

        jLabel6.setText("Encontrados:");

        jLabel7.setText("Resultado:");

        txtEmojiElegido.setEditable(false);

        txtCantidadElegida.setEditable(false);

        txtEncontrados.setEditable(false);
        txtEncontrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEncontradosActionPerformed(evt);
            }
        });

        txtResultado.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane1)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(btnPapaNoel)
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnEstrella)
                                                .addGap(31, 31, 31)
                                                .addComponent(btnArbol))
                                            .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(btnRegalo)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(26, 26, 26)
                                        .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel4))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtEmojiElegido, javax.swing.GroupLayout.DEFAULT_SIZE, 101, Short.MAX_VALUE)
                                            .addComponent(txtCantidadElegida)
                                            .addComponent(txtEncontrados)))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(44, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegalo)
                    .addComponent(btnArbol)
                    .addComponent(btnEstrella)
                    .addComponent(btnPapaNoel))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtEmojiElegido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCantidadElegida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtEncontrados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCantidadActionPerformed
       
    }//GEN-LAST:event_txtCantidadActionPerformed

    private void btnEstrellaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstrellaActionPerformed
         emoji = "⭐️";
         completarDatos(emoji);
                                 
    }//GEN-LAST:event_btnEstrellaActionPerformed

    private void txtEncontradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEncontradosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEncontradosActionPerformed

    private void btnPapaNoelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapaNoelActionPerformed
         emoji = "🎅";
         completarDatos(emoji);
    }//GEN-LAST:event_btnPapaNoelActionPerformed

    private void btnArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnArbolActionPerformed
        emoji = "🎄";
        completarDatos(emoji);
    }//GEN-LAST:event_btnArbolActionPerformed

    private void btnRegaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegaloActionPerformed
        emoji = "🎁";
        completarDatos(emoji);
    }//GEN-LAST:event_btnRegaloActionPerformed

   private void completarDatos(String emoji){
       int cantidad = Integer.parseInt(txtCantidad.getText());
        
        if(cantidad >= 0 && cantidad <= 16){
           matriz = control.generarMatriz();
           cantEncontrados = control.determinarCantidadEmoji(emoji,cantidad, matriz);
           
            txtEncontrados.setText(String.valueOf(cantEncontrados));
            txtEmojiElegido.setText(emoji);
            txtCantidadElegida.setText(String.valueOf(cantidad));
            
           if (cantEncontrados == cantidad){
               
               txtResultado.setText("ACERTÓ");
           }
        }else{
             
             txtResultado.setText("FALLÓ");
            
        }
   }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArbol;
    private javax.swing.JButton btnEstrella;
    private javax.swing.JButton btnPapaNoel;
    private javax.swing.JButton btnRegalo;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtCantidad;
    private javax.swing.JTextField txtCantidadElegida;
    private javax.swing.JTextField txtEmojiElegido;
    private javax.swing.JTextField txtEncontrados;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
