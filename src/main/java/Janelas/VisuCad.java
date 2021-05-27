
package Janelas;

import Objetos.Fornecedor;
import Objetos.Produtos;


public class VisuCad extends javax.swing.JFrame {
    

    
    public VisuCad() {
        initComponents();
    }
   
    public VisuCad(Fornecedor forn, Produtos prod) {
        initComponents();
        jLRazSocial.setText(forn.getRazSocial());
       
        
        
    }
    
        


    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLRazSocial = new javax.swing.JLabel();
        jLCnpj = new javax.swing.JLabel();
        jLEndereco = new javax.swing.JLabel();
        jLTelefone = new javax.swing.JLabel();
        jLNomeRep = new javax.swing.JLabel();
        jLNomeProd = new javax.swing.JLabel();
        jLDesc = new javax.swing.JLabel();
        jLValorUni = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLQtd = new javax.swing.JLabel();
        jLForn = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("FORNECEDOR");

        jLabel2.setText("PRODUTO");

        jLRazSocial.setText("jLabel3");

        jLCnpj.setText("jLabel4");

        jLEndereco.setText("jLabel5");

        jLTelefone.setText("jLabel6");

        jLNomeRep.setText("jLabel7");

        jLNomeProd.setText("jLabel8");

        jLDesc.setText("jLabel9");

        jLValorUni.setText("jLabel10");

        jLabel11.setText("jLabel11");

        jLQtd.setText("jLabel12");

        jLForn.setText("jLabel13");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLNomeRep)
                            .addComponent(jLTelefone)
                            .addComponent(jLEndereco)
                            .addComponent(jLCnpj)
                            .addComponent(jLRazSocial))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 155, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLQtd)
                    .addComponent(jLNomeProd)
                    .addComponent(jLabel2)
                    .addComponent(jLDesc)
                    .addComponent(jLValorUni)
                    .addComponent(jLabel11)
                    .addComponent(jLForn))
                .addGap(94, 94, 94))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLRazSocial))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLNomeProd)))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLCnpj)
                    .addComponent(jLDesc))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLEndereco)
                    .addComponent(jLValorUni))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefone)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addComponent(jLQtd)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLNomeRep)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLForn)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VisuCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VisuCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VisuCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VisuCad.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VisuCad().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLCnpj;
    private javax.swing.JLabel jLDesc;
    private javax.swing.JLabel jLEndereco;
    private javax.swing.JLabel jLForn;
    private javax.swing.JLabel jLNomeProd;
    private javax.swing.JLabel jLNomeRep;
    private javax.swing.JLabel jLQtd;
    private javax.swing.JLabel jLRazSocial;
    private javax.swing.JLabel jLTelefone;
    private javax.swing.JLabel jLValorUni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
