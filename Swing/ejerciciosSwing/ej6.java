package ejerciciosSwing;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author admin
 */
public class ej6 extends javax.swing.JFrame {

    /**
     * Creates new form EJ6
     */
    public ej6() {
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

        jButton1 = new javax.swing.JButton();
        t1 = new javax.swing.JLabel();
        N3 = new javax.swing.JButton();
        N4 = new javax.swing.JButton();
        N5 = new javax.swing.JButton();
        N6 = new javax.swing.JButton();
        N8 = new javax.swing.JButton();
        N7 = new javax.swing.JButton();
        N2 = new javax.swing.JButton();
        N1 = new javax.swing.JButton();
        N9 = new javax.swing.JButton();
        t2 = new javax.swing.JLabel();
        res = new javax.swing.JButton();
        mul = new javax.swing.JButton();
        div = new javax.swing.JButton();
        sum = new javax.swing.JButton();
        resultado = new javax.swing.JTextField();
        op = new javax.swing.JTextArea();
        calcular = new javax.swing.JButton();
        bBorrar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        t1.setText("CALCULADORA");

        N3.setText("3");
        N3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N3ActionPerformed(evt);
            }
        });

        N4.setText("4");
        N4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N4ActionPerformed(evt);
            }
        });

        N5.setText("5");
        N5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N5ActionPerformed(evt);
            }
        });

        N6.setText("6");
        N6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N6ActionPerformed(evt);
            }
        });

        N8.setText("8");
        N8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N8ActionPerformed(evt);
            }
        });

        N7.setText("7");
        N7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N7ActionPerformed(evt);
            }
        });

        N2.setText("2");
        N2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N2ActionPerformed(evt);
            }
        });

        N1.setText("1");
        N1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N1ActionPerformed(evt);
            }
        });

        N9.setText("9");
        N9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N9ActionPerformed(evt);
            }
        });

        t2.setText("Resultado");

        res.setText("-");
        res.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resActionPerformed(evt);
            }
        });

        mul.setText("*");
        mul.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mulActionPerformed(evt);
            }
        });

        div.setText("/");
        div.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divActionPerformed(evt);
            }
        });

        sum.setText("+");
        sum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sumActionPerformed(evt);
            }
        });

        op.setColumns(20);
        op.setRows(5);

        calcular.setText("Calcular");
        calcular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcularActionPerformed(evt);
            }
        });

        bBorrar.setText("Borrar");
        bBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(op)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addComponent(t1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N7, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(44, 44, 44)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(N8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(N6, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(N9, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(res, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(mul, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(div, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sum, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(bBorrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(calcular, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                                .addGap(27, 27, 27)
                                .addComponent(t2)
                                .addGap(41, 41, 41)
                                .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(40, 40, 40))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(t1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(op, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(N3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(N5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N6, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N4, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(N8, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N7, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(N9, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(mul, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sum, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(res, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(div, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(bBorrar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(t2)
                    .addComponent(resultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(calcular))
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void N3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N3ActionPerformed
        op.append(N3.getText());
    }//GEN-LAST:event_N3ActionPerformed

    private void N4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N4ActionPerformed
        op.append(N4.getText());
    }//GEN-LAST:event_N4ActionPerformed

    private void N5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N5ActionPerformed
        op.append(N5.getText());
    }//GEN-LAST:event_N5ActionPerformed

    private void N6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N6ActionPerformed
        op.append(N6.getText());
    }//GEN-LAST:event_N6ActionPerformed

    private void N8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N8ActionPerformed
        op.append(N8.getText());
    }//GEN-LAST:event_N8ActionPerformed

    private void N7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N7ActionPerformed
        op.append(N7.getText());
    }//GEN-LAST:event_N7ActionPerformed

    private void N2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N2ActionPerformed
        op.append(N2.getText());
    }//GEN-LAST:event_N2ActionPerformed

    private void N1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N1ActionPerformed
        op.append(N1.getText());
    }//GEN-LAST:event_N1ActionPerformed

    private void N9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N9ActionPerformed
        op.append(N9.getText());
    }//GEN-LAST:event_N9ActionPerformed

    private void calcularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcularActionPerformed
        String cad= op.getText();
        char[] posSimbolo =cad.toCharArray();
        System.out.println("Linea "+posSimbolo.toString());
        String n1="", n2="";
        char op1=' ';
        for (int j = 0; j < posSimbolo.length; j++) {
               if(posSimbolo[j]=='*'|| posSimbolo[j]=='-' || posSimbolo[j]=='+' || posSimbolo[j]=='/'){
                   System.out.println("PAra en "+j);
                    n1=(cad.substring(0, j));
                    n2=(cad.substring(j+1,cad.length()));
                    op1=posSimbolo[j];
                    break;
               }
                
            }
        int a = op1;
        System.out.println(a);
        System.out.println(n1 + " ... "+op1+" ... "+n2);
        if(op1=='+'){
            int resul = Integer.parseInt(n1)+Integer.parseInt(n2);
            resultado.setText(String.valueOf(resul));
        }else if(op1=='-'){
            int resul = Integer.parseInt(n1)-Integer.parseInt(n2);
            resultado.setText(String.valueOf(resul));
        }else if(op1=='*'){
            int resul = Integer.parseInt(n1)*Integer.parseInt(n2);
            resultado.setText(String.valueOf(resul));
        }else if(op1=='/'){
            double resul = Double.parseDouble(n1)/Double.parseDouble(n2);
            DecimalFormat df = new DecimalFormat("#.##");
            df.setRoundingMode(RoundingMode.FLOOR);
            String resulR = df.format(resul);
            resultado.setText(resulR);
        }
        System.out.println(op1);
        System.out.println(n1+" "+op1+" "+n2);
        op.setText("");
    }//GEN-LAST:event_calcularActionPerformed

    private void divActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divActionPerformed
        
        op.append(div.getText());
    }//GEN-LAST:event_divActionPerformed

    private void resActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resActionPerformed
        op.append(res.getText());
    }//GEN-LAST:event_resActionPerformed

    private void sumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sumActionPerformed
        op.append(sum.getText());
    }//GEN-LAST:event_sumActionPerformed

    private void mulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mulActionPerformed
        op.append(mul.getText());
    }//GEN-LAST:event_mulActionPerformed

    private void bBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBorrarActionPerformed
        op.setText("");
    }//GEN-LAST:event_bBorrarActionPerformed

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
            java.util.logging.Logger.getLogger(ej6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ej6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ej6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ej6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ej6().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton N1;
    private javax.swing.JButton N2;
    private javax.swing.JButton N3;
    private javax.swing.JButton N4;
    private javax.swing.JButton N5;
    private javax.swing.JButton N6;
    private javax.swing.JButton N7;
    private javax.swing.JButton N8;
    private javax.swing.JButton N9;
    private javax.swing.JButton bBorrar;
    private javax.swing.JButton calcular;
    private javax.swing.JButton div;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton mul;
    private javax.swing.JTextArea op;
    private javax.swing.JButton res;
    private javax.swing.JTextField resultado;
    private javax.swing.JButton sum;
    private javax.swing.JLabel t1;
    private javax.swing.JLabel t2;
    // End of variables declaration//GEN-END:variables

    
}
