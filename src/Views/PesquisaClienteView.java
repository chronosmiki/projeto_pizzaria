/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Views;

import ClassesAuxiliares.*;
import Controls.*;
import Models.*;
import java.util.ArrayList;



public class PesquisaClienteView extends javax.swing.JFrame {

   private ClienteControl clienteControl;
   private final OperadorControl operadorControl = new OperadorControl();
   private ClienteModel clienteModel;
   private ArrayList <ClienteModel> arrayClientes = new ArrayList<>();  
   private int linha = 0;
    
    public PesquisaClienteView() {
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

        jSeparator1 = new javax.swing.JSeparator();
        jMenuItem1 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        painelPrincipal = new javax.swing.JPanel();
        painelPesquisaProdutos = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtClientes = new javax.swing.JTable();
        txtPesq = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        painelClientes = new javax.swing.JPanel();
        btnCadastrarCliente = new javax.swing.JButton();
        jmenuPrincipal = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setMinimumSize(new java.awt.Dimension(680, 600));
        setSize(new java.awt.Dimension(680, 600));

        painelPrincipal.setBackground(new java.awt.Color(0, 108, 81));
        painelPrincipal.setBorder(new javax.swing.border.SoftBevelBorder(0));
        painelPrincipal.setMinimumSize(new java.awt.Dimension(650, 385));

        painelPesquisaProdutos.setBackground(new java.awt.Color(95, 211, 134));
        painelPesquisaProdutos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Clientes", 0, 0, new java.awt.Font("Arial Narrow", 1, 20))); // NOI18N
        painelPesquisaProdutos.setForeground(new java.awt.Color(255, 255, 255));
        painelPesquisaProdutos.setPreferredSize(new java.awt.Dimension(500, 500));

        jtClientes.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Telefone", "Nome", "Endereço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtClientes.setRowHeight(20);
        jtClientes.setSelectionBackground(new java.awt.Color(255, 208, 115));
        jtClientes.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jtClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtClientes);
        if (jtClientes.getColumnModel().getColumnCount() > 0) {
            jtClientes.getColumnModel().getColumn(0).setMinWidth(5);
            jtClientes.getColumnModel().getColumn(0).setPreferredWidth(10);
            jtClientes.getColumnModel().getColumn(1).setMinWidth(200);
            jtClientes.getColumnModel().getColumn(1).setPreferredWidth(200);
        }

        txtPesq.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        txtPesq.setToolTipText("Pesquisa");
        txtPesq.setCaretColor(new java.awt.Color(204, 204, 204));
        txtPesq.setMargin(new java.awt.Insets(10, 2, 2, 2));
        txtPesq.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtPesqKeyReleased(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Narrow", 0, 14)); // NOI18N
        jLabel8.setText("* Clique no Cliente para Realizar uma venda");
        jLabel8.setToolTipText("");

        javax.swing.GroupLayout painelPesquisaProdutosLayout = new javax.swing.GroupLayout(painelPesquisaProdutos);
        painelPesquisaProdutos.setLayout(painelPesquisaProdutosLayout);
        painelPesquisaProdutosLayout.setHorizontalGroup(
            painelPesquisaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaProdutosLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelPesquisaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 628, Short.MAX_VALUE)
                    .addComponent(txtPesq, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(painelPesquisaProdutosLayout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelPesquisaProdutosLayout.setVerticalGroup(
            painelPesquisaProdutosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPesquisaProdutosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtPesq, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
                .addGap(14, 14, 14)
                .addComponent(jLabel8)
                .addContainerGap())
        );

        javax.swing.GroupLayout painelPrincipalLayout = new javax.swing.GroupLayout(painelPrincipal);
        painelPrincipal.setLayout(painelPrincipalLayout);
        painelPrincipalLayout.setHorizontalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPesquisaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 660, Short.MAX_VALUE)
                .addContainerGap())
        );
        painelPrincipalLayout.setVerticalGroup(
            painelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(painelPesquisaProdutos, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                .addContainerGap())
        );

        painelClientes.setBackground(new java.awt.Color(95, 211, 134));
        painelClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnCadastrarCliente.setBackground(new java.awt.Color(95, 211, 134));
        btnCadastrarCliente.setFont(new java.awt.Font("Arial Narrow", 0, 18)); // NOI18N
        btnCadastrarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cadastro_cliente.png"))); // NOI18N
        btnCadastrarCliente.setText("Cadastrar Cliente");
        btnCadastrarCliente.setBorder(null);
        btnCadastrarCliente.setFocusable(false);
        btnCadastrarCliente.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCadastrarCliente.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnCadastrarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout painelClientesLayout = new javax.swing.GroupLayout(painelClientes);
        painelClientes.setLayout(painelClientesLayout);
        painelClientesLayout.setHorizontalGroup(
            painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(530, Short.MAX_VALUE))
        );
        painelClientesLayout.setVerticalGroup(
            painelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelClientesLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCadastrarCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addContainerGap())
        );

        jmenuPrincipal.setBackground(new java.awt.Color(0, 108, 81));
        jmenuPrincipal.setBorder(new javax.swing.border.MatteBorder(null));
        jmenuPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jmenuPrincipal.setBorderPainted(false);
        jmenuPrincipal.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Relatórios");
        jMenu1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        jMenuItem2.setBackground(new java.awt.Color(0, 108, 81));
        jMenuItem2.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setText("Melhores Clientes");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jmenuPrincipal.add(jMenu1);

        setJMenuBar(jmenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(painelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(painelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(painelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void txtPesqKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPesqKeyReleased
        clienteControl = new ClienteControl(clienteModel);        
        //LIMPA O ARRAY
        arrayClientes.clear();
        //SOMENTE REALIZA A PESQUISA E A CAIXA DE PESQUISA TIVER VALOR
        if(!txtPesq.getText().equals("")){
            
            OperadorControl.pesq = txtPesq.getText();
            arrayClientes = (ArrayList) operadorControl.pesquisarCliente();             
            //RECUPERA OS OBJETOS RETORNADOS NA PESQUISA
            for (int x = 0 ; x < arrayClientes.size(); x++){

                    clienteModel = (ClienteModel) arrayClientes.get(x);
                    jtClientes.setValueAt(clienteModel.getTelefone(), x, 0);
                    jtClientes.setValueAt(clienteModel.getNome() + " " + clienteModel.getSobrenome(), x, 1);            
                    jtClientes.setValueAt(clienteModel.getTipo() + " " + clienteModel.getLogradouro() +
                            ", " + clienteModel.getNumero(), x, 2);
            }
        }
        
    }//GEN-LAST:event_txtPesqKeyReleased

    private void jtClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClientesMouseClicked
                                              
    }//GEN-LAST:event_jtClientesMouseClicked

    private void btnCadastrarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarClienteActionPerformed
        new CadastroClienteView().setVisible(true);
    }//GEN-LAST:event_btnCadastrarClienteActionPerformed

    
    
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
           new PesquisaClienteView().setVisible(true);                                 
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarCliente;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JMenuBar jmenuPrincipal;
    private javax.swing.JTable jtClientes;
    public javax.swing.JPanel painelClientes;
    private javax.swing.JPanel painelPesquisaProdutos;
    private javax.swing.JPanel painelPrincipal;
    private javax.swing.JTextField txtPesq;
    // End of variables declaration//GEN-END:variables

    
}
