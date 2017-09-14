




package cv.mikusher.fat16;





import java.awt.event.ActionEvent;
import java.text.DecimalFormat;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;





public class PrincipalTela extends javax.swing.JFrame {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;





    public PrincipalTela() {

        initComponents();
    }





    @SuppressWarnings({ "unchecked", "rawtypes" })
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTextcolocarParticao = new javax.swing.JTextField();
        jButton_criarparticao = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextTamanhototaldaparticao = new javax.swing.JTextField();
        jTclusterquant = new javax.swing.JTextField();
        jTclustersTamanho = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLtituo = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextnomedoArquivo = new javax.swing.JTextField();
        jTexttamanhodoarquivo = new javax.swing.JTextField();
        jComboBoxkbmbgb = new javax.swing.JComboBox();
        jButton_adicionararquivo = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jTextTamanhodoarqAdicionado = new javax.swing.JTextField();
        jTextClusterUsadospeloArquivo = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLkbunidade = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jButton_Pesquisarparaexcluir = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTabledosArqaExcluir = new javax.swing.JTable();
        jTexnomedaArqaExcluir = new javax.swing.JTextField();
        jButton_excluir = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jTabbedPane3 = new javax.swing.JTabbedPane();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTabledeBlocosLivres = new javax.swing.JTable();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTabledeAlocacaodeDados = new javax.swing.JTable();
        jButtonAtualizarInformacao = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextunidadeTotal = new javax.swing.JTextField();
        jTextespacoLivredaUnidade = new javax.swing.JTextField();
        jTextespacoOcupadodaUnidade = new javax.swing.JTextField();
        jProgressBardoUsodaUnidade = new javax.swing.JProgressBar();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jButtonAtualizarUnidadeTotal = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        jLporcentagem = new javax.swing.JLabel();
        jLporcentagem.setSize(30, 20);
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTabbedPane1.setFont(new java.awt.Font("Tahoma", 1, 11));

        jLabel1.setText("Criar Partição:");

        jTextcolocarParticao.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jTextcolocarParticaoActionPerformed(evt);
            }
        });

        jButton_criarparticao.setText("Criar");
        jButton_criarparticao.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton_criarparticaoActionPerformed(evt);
            }
        });

        jLabel2.setText("Informação da Partição:");

        jLabel3.setText("Tamanho Total:");

        jLabel4.setText("Quantidade de Clusters:");

        jLabel5.setText("Tamanho de Clusters:");

        jLabel6.setText("MB");

        jLabel7.setText("KB");

        jLtituo.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLtituo.setText("CRIAÇÃO DA PARTIÇÃO");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGroup(jPanel1Layout.createSequentialGroup()
                                                                             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                           .addContainerGap()
                                                                                                                           .addComponent(jLabel2))
                                                                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                           .addGap(76, 76, 76)
                                                                                                                           .addComponent(jLabel1)
                                                                                                                           .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                           .addComponent(jTextcolocarParticao,
                                                                                                                                         javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                         174,
                                                                                                                                         javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                           .addGap(6, 6, 6)
                                                                                                                           .addComponent(jButton_criarparticao)))
                                                                             .addContainerGap(252, Short.MAX_VALUE))
                                                      .addGroup(jPanel1Layout.createSequentialGroup()
                                                                             .addContainerGap()
                                                                             .addComponent(jLabel3)
                                                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                             .addComponent(jTextTamanhototaldaparticao,
                                                                                           javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                           124,
                                                                                           javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                             .addComponent(jLabel6)
                                                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                                                                             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                    .addComponent(jLabel4)
                                                                                                    .addComponent(jLabel5))
                                                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                             .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                    .addComponent(jTclustersTamanho)
                                                                                                    .addComponent(jTclusterquant,
                                                                                                                  javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                  103,
                                                                                                                  javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                             .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                             .addComponent(jLabel7)
                                                                             .addGap(76, 76, 76))
                                                      .addGroup(jPanel1Layout.createSequentialGroup()
                                                                             .addGap(267, 267, 267)
                                                                             .addComponent(jLtituo)
                                                                             .addContainerGap(238, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                                                           .addGap(45, 45, 45)
                                                                           .addComponent(jLtituo)
                                                                           .addGap(46, 46, 46)
                                                                           .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                  .addComponent(jLabel1)
                                                                                                  .addComponent(jTextcolocarParticao,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                  .addComponent(jButton_criarparticao))
                                                                           .addGap(72, 72, 72)
                                                                           .addComponent(jLabel2)
                                                                           .addGap(18, 18, 18)
                                                                           .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                  .addComponent(jLabel3)
                                                                                                  .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                         .addComponent(jTextTamanhototaldaparticao,
                                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                       javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                         .addComponent(jLabel6))
                                                                                                  .addGroup(jPanel1Layout.createSequentialGroup()
                                                                                                                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                .addComponent(jLabel4)
                                                                                                                                                .addComponent(jTclusterquant,
                                                                                                                                                              javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                              javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                              javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                         .addGap(28, 28, 28)
                                                                                                                         .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                .addComponent(jLabel5)
                                                                                                                                                .addComponent(jTclustersTamanho,
                                                                                                                                                              javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                              javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                              javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addComponent(jLabel7))))
                                                                           .addContainerGap(77, Short.MAX_VALUE)));

        jTabbedPane1.addTab("Criar Partição", jPanel1);

        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 11));

        jLabel9.setText("Nome do Arquivo");

        jLabel10.setText("Tamanho do Arquivo");

        jComboBoxkbmbgb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "KB", "MB", "GB" }));
        jComboBoxkbmbgb.addActionListener(new java.awt.event.ActionListener() {

            @Override
            @SuppressWarnings("synthetic-access")
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jComboBoxkbmbgbActionPerformed(evt);
            }
        });

        jButton_adicionararquivo.setText("Adicionar");
        jButton_adicionararquivo.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton_adicionararquivoActionPerformed(evt);
            }
        });

        jLabel11.setText("Informação do Arquivo Atual");

        jLabel12.setText("Tamanho:");

        jLabel13.setText("Clusters Usados");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel16.setText("ADICIONAR ARQUIVO");

        jLkbunidade.setText("KB");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGroup(jPanel4Layout.createSequentialGroup()
                                                                             .addContainerGap()
                                                                             .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                    .addComponent(jLabel11)
                                                                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                                                                                           .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                                       false)
                                                                                                                                                  .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                            jPanel4Layout.createSequentialGroup()
                                                                                                                                                                         .addComponent(jLabel12)
                                                                                                                                                                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                         .addComponent(jTextTamanhodoarqAdicionado))
                                                                                                                                                  .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                            jPanel4Layout.createSequentialGroup()
                                                                                                                                                                         .addComponent(jLabel13)
                                                                                                                                                                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                                         .addComponent(jTextClusterUsadospeloArquivo,
                                                                                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                       100,
                                                                                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                                           .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                           .addComponent(jLkbunidade)))
                                                                             .addContainerGap(418, Short.MAX_VALUE))
                                                      .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                jPanel4Layout.createSequentialGroup()
                                                                             .addContainerGap(270, Short.MAX_VALUE)
                                                                             .addComponent(jLabel16)
                                                                             .addGap(242, 242, 242))
                                                      .addGroup(jPanel4Layout.createSequentialGroup()
                                                                             .addContainerGap()
                                                                             .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                              jPanel4Layout.createSequentialGroup()
                                                                                                                           .addComponent(jLabel9)
                                                                                                                           .addGap(10, 10, 10)
                                                                                                                           .addComponent(jTextnomedoArquivo))
                                                                                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                              jPanel4Layout.createSequentialGroup()
                                                                                                                           .addComponent(jLabel10)
                                                                                                                           .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                           .addComponent(jTexttamanhodoarquivo,
                                                                                                                                         javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                         111,
                                                                                                                                         javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                             .addGap(18, 18, 18)
                                                                             .addComponent(jComboBoxkbmbgb,
                                                                                           javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                           javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                           javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                             .addGap(18, 18, 18)
                                                                             .addComponent(jButton_adicionararquivo)
                                                                             .addContainerGap(255, Short.MAX_VALUE)));
        jPanel4Layout.setVerticalGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                                                           .addGap(19, 19, 19)
                                                                           .addComponent(jLabel16)
                                                                           .addGap(38, 38, 38)
                                                                           .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                  .addComponent(jLabel9)
                                                                                                  .addComponent(jTextnomedoArquivo,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                           .addGap(18, 18, 18)
                                                                           .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                  .addComponent(jLabel10)
                                                                                                  .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                         .addComponent(jTexttamanhodoarquivo,
                                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                       javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                         .addComponent(jComboBoxkbmbgb,
                                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                       javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                         .addComponent(jButton_adicionararquivo)))
                                                                           .addGap(44, 44, 44)
                                                                           .addComponent(jLabel11)
                                                                           .addGap(29, 29, 29)
                                                                           .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                  .addComponent(jLabel12)
                                                                                                  .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                         .addComponent(jTextTamanhodoarqAdicionado,
                                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                       javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                         .addComponent(jLkbunidade)))
                                                                           .addGap(30, 30, 30)
                                                                           .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                  .addComponent(jLabel13)
                                                                                                  .addComponent(jTextClusterUsadospeloArquivo,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                           .addContainerGap(60, Short.MAX_VALUE)));

        jTabbedPane2.addTab("Adicionar Arquivo", jPanel4);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel14.setText("EXCLUIR ARQUIVO");

        jLabel15.setText("Dados na Partição");

        jButton_Pesquisarparaexcluir.setText("Pesquisar");
        jButton_Pesquisarparaexcluir.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton_PesquisarparaexcluirActionPerformed(evt);
            }
        });

        jTabledosArqaExcluir.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null }, { null, null }, { null, null }, { null, null } }, new String[] { "Nome", "Tamanho" }));
        jTabledosArqaExcluir.addContainerListener(new java.awt.event.ContainerAdapter() {

            @Override
            public void componentAdded(java.awt.event.ContainerEvent evt) {

                jTabledosArqaExcluirComponentAdded(evt);
            }





            @Override
            public void componentRemoved(java.awt.event.ContainerEvent evt) {

                jTabledosArqaExcluirComponentRemoved(evt);
            }
        });
        jScrollPane1.setViewportView(jTabledosArqaExcluir);

        jButton_excluir.setText("Excluir");
        jButton_excluir.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButton_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGroup(jPanel5Layout.createSequentialGroup()
                                                                             .addContainerGap()
                                                                             .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                                                                                                           .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                  .addComponent(jScrollPane1,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                611,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                  .addComponent(jButton_Pesquisarparaexcluir)
                                                                                                                                                  .addComponent(jLabel15)
                                                                                                                                                  .addGroup(jPanel5Layout.createSequentialGroup()
                                                                                                                                                                         .addComponent(jTexnomedaArqaExcluir,
                                                                                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                       192,
                                                                                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                         .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                                         .addComponent(jButton_excluir)))
                                                                                                                           .addContainerGap())
                                                                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                              jPanel5Layout.createSequentialGroup()
                                                                                                                           .addComponent(jLabel14)
                                                                                                                           .addGap(253, 253, 253)))));
        jPanel5Layout.setVerticalGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                                                           .addGap(24, 24, 24)
                                                                           .addComponent(jLabel14)
                                                                           .addGap(18, 18, 18)
                                                                           .addComponent(jLabel15)
                                                                           .addGap(5, 5, 5)
                                                                           .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                           .addGap(18, 18, 18)
                                                                           .addComponent(jButton_Pesquisarparaexcluir)
                                                                           .addGap(46, 46, 46)
                                                                           .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                  .addComponent(jTexnomedaArqaExcluir,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                  .addComponent(jButton_excluir))
                                                                           .addContainerGap(67, Short.MAX_VALUE)));

        jTabbedPane2.addTab("Exluir Arquivo", jPanel5);

        jTabbedPane1.addTab("Adicionar Dados / Excluir Dados", jTabbedPane2);

        jTabbedPane3.setFont(new java.awt.Font("Tahoma", 1, 11));

        jLabel17.setText("Blocos Livres");

        jTabledeBlocosLivres.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null }, { null, null }, { null, null }, { null, null } },
                                                                              new String[] { "Bloco Livre", "Disponives" }));
        jScrollPane2.setViewportView(jTabledeBlocosLivres);

        jLabel18.setText("Alocação de Dados");

        jTabledeAlocacaodeDados.setModel(new javax.swing.table.DefaultTableModel(new Object[][] { { null, null, null, null }, { null, null, null, null }, { null, null, null, null },
                                                                                                  { null, null, null, null } },
                                                                                 new String[] { "Arquivo", "Tamanho", "Bloco", "Disponivel" }));
        jScrollPane3.setViewportView(jTabledeAlocacaodeDados);

        jButtonAtualizarInformacao.setText("Atualiza");

        jButtonAtualizarInformacao.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButtonAtualizarInformacaoPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel19.setText("TABELAS INFORMATIVAS");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGroup(jPanel6Layout.createSequentialGroup()
                                                                             .addContainerGap()
                                                                             .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                    .addGroup(jPanel6Layout.createSequentialGroup()
                                                                                                                           .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                  .addComponent(jButtonAtualizarInformacao,
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                  .addComponent(jScrollPane2,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                611,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                  .addComponent(jLabel17)
                                                                                                                                                  .addComponent(jLabel18)
                                                                                                                                                  .addComponent(jScrollPane3,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                611,
                                                                                                                                                                Short.MAX_VALUE))
                                                                                                                           .addContainerGap())
                                                                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                              jPanel6Layout.createSequentialGroup()
                                                                                                                           .addComponent(jLabel19)
                                                                                                                           .addGap(230, 230, 230)))));
        jPanel6Layout.setVerticalGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                              jPanel6Layout.createSequentialGroup()
                                                                           .addContainerGap(28, Short.MAX_VALUE)
                                                                           .addComponent(jLabel19)
                                                                           .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                           .addComponent(jLabel17)
                                                                           .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                           .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                           .addGap(18, 18, 18)
                                                                           .addComponent(jLabel18)
                                                                           .addGap(18, 18, 18)
                                                                           .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                           .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                           .addComponent(jButtonAtualizarInformacao)
                                                                           .addContainerGap()));

        jTabbedPane3.addTab("Tabelas de Informativas", jPanel6);

        jLabel20.setText("Tamanho Total da Partição:");

        jLabel21.setText("Espaço Livre:");

        jLabel22.setText("Espaço Ocupado:");

        jLabel23.setText("Partição:");

        jLabel24.setText("Ocupado");

        jButtonAtualizarUnidadeTotal.setText("Atualizar");

        jButtonAtualizarUnidadeTotal.addActionListener(new java.awt.event.ActionListener() {

            @Override
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                jButtonAtualizarUnidadeTotalPerformed(evt);
            }
        });

        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 11));
        jLabel25.setText("INFORMAÇÃO DA UNIDADE");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGroup(jPanel7Layout.createSequentialGroup()
                                                                             .addContainerGap()
                                                                             .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                           .addComponent(jLabel20)
                                                                                                                           .addComponent(jLabel22)
                                                                                                                           .addComponent(jLabel21)
                                                                                                                           .addGroup(jPanel7Layout.createSequentialGroup()
                                                                                                                                                  .addComponent(jProgressBardoUsodaUnidade,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                467,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                  .addComponent(jLporcentagem,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                36,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                  .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                  .addComponent(jLabel24)
                                                                                                                                                  .addContainerGap())
                                                                                                                           .addGroup(jPanel7Layout.createSequentialGroup()
                                                                                                                                                  .addComponent(jLabel23)
                                                                                                                                                  .addContainerGap(578, Short.MAX_VALUE))
                                                                                                                           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                     jPanel7Layout.createSequentialGroup()
                                                                                                                                                  .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                                         .addComponent(jTextunidadeTotal,
                                                                                                                                                                                       javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                                                                       javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                       271,
                                                                                                                                                                                       Short.MAX_VALUE)
                                                                                                                                                                         .addComponent(jTextespacoLivredaUnidade,
                                                                                                                                                                                       javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                       271,
                                                                                                                                                                                       Short.MAX_VALUE))
                                                                                                                                                  .addGap(350, 350, 350))
                                                                                                                           .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                     jPanel7Layout.createSequentialGroup()
                                                                                                                                                  .addComponent(jTextespacoOcupadodaUnidade,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                271,
                                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                                  .addGap(51, 51, 51)
                                                                                                                                                  .addComponent(jButtonAtualizarUnidadeTotal)
                                                                                                                                                  .addGap(224, 224, 224)))
                                                                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                              jPanel7Layout.createSequentialGroup()
                                                                                                                           .addComponent(jLabel25)
                                                                                                                           .addGap(240, 240, 240)))));
        jPanel7Layout.setVerticalGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                              jPanel7Layout.createSequentialGroup()
                                                                           .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                  .addGroup(jPanel7Layout.createSequentialGroup()
                                                                                                                         .addContainerGap()
                                                                                                                         .addComponent(jLabel24))
                                                                                                  .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                         .addComponent(jLporcentagem,
                                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                       21,
                                                                                                                                       javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                         .addGroup(jPanel7Layout.createSequentialGroup()
                                                                                                                                                .addGap(41, 41, 41)
                                                                                                                                                .addComponent(jLabel25)
                                                                                                                                                .addGap(39, 39, 39)
                                                                                                                                                .addComponent(jLabel20)
                                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(jTextunidadeTotal,
                                                                                                                                                              javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                              javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                              javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addGap(18, 18, 18)
                                                                                                                                                .addComponent(jLabel21)
                                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(jTextespacoLivredaUnidade,
                                                                                                                                                              javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                              javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                              javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(jLabel22)
                                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                                                                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                                                                       .addComponent(jTextespacoOcupadodaUnidade,
                                                                                                                                                                                     javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                                     javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                                     javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                                       .addComponent(jButtonAtualizarUnidadeTotal))
                                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                                                                 57,
                                                                                                                                                                 Short.MAX_VALUE)
                                                                                                                                                .addComponent(jLabel23)
                                                                                                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(jProgressBardoUsodaUnidade,
                                                                                                                                                              javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                              21,
                                                                                                                                                              javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                           .addContainerGap()));

        jTabbedPane3.addTab("Informações da Partição", jPanel7);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                      .addGap(0, 636, Short.MAX_VALUE)
                                                      .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                             .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                                    .addGap(0, 0, Short.MAX_VALUE)
                                                                                                    .addComponent(jTabbedPane3,
                                                                                                                  javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                  636,
                                                                                                                  javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                    .addGap(0, 0, Short.MAX_VALUE))));
        jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGap(0, 383, Short.MAX_VALUE)
                                                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                           .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                                  .addGap(0, 0, Short.MAX_VALUE)
                                                                                                  .addComponent(jTabbedPane3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                383,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                  .addGap(0, 0, Short.MAX_VALUE))));

        jTabbedPane1.addTab("Tabela de Arquivos / Informações", jPanel3);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("SISTEMA DE ARQUIVOS FAT16");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                        .addContainerGap()
                                                                                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 641, Short.MAX_VALUE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                        .addGap(212, 212, 212)
                                                                                        .addComponent(jLabel8)))
                                                        .addContainerGap()));
        layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                      .addGroup(layout.createSequentialGroup()
                                                      .addContainerGap()
                                                      .addComponent(jLabel8)
                                                      .addGap(18, 18, 18)
                                                      .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 405, Short.MAX_VALUE)
                                                      .addContainerGap()));

        pack();
    }// </editor-fold>//GEN-END:initComponents





    protected void jButtonAtualizarUnidadeTotalPerformed(ActionEvent evt) {

        jTextunidadeTotal.setText("" + particao1.getTamanho() + " kB");
        double Elivre = 0;
        double Eocupado = 0;
        for (int i = 0; i < particao1.quantidadeClusters.length; i++) {

            if (particao1.quantidadeClusters[i] == 0) {
                Elivre += 1;
            } else {
                Eocupado += 1;
            }

        }

        int tamanhoClus = particao1.getCluster();

        double livre = (Elivre * tamanhoClus) / 1024;
        double ocupado = (Eocupado * tamanhoClus) / 1024;

        DecimalFormat format1 = new DecimalFormat("0.000");

        String decimallivre = format1.format(livre);
        decimallivre = decimallivre.replace(",", ".");
        livre = Double.parseDouble(decimallivre);

        String decimalocupado = format1.format(ocupado);
        decimalocupado = decimalocupado.replace(",", ".");
        ocupado = Double.parseDouble(decimalocupado);

        jTextespacoLivredaUnidade.setText("" + livre + "kB");
        jTextespacoOcupadodaUnidade.setText("" + ocupado + "kB");

        int progresso = (int) ((ocupado / particao1.getTamanho()) * 100);

        jProgressBardoUsodaUnidade.setValue(progresso);

        jLporcentagem.setText("" + progresso + "%");

        repaint();

    }





    protected void jButtonAtualizarInformacaoPerformed(ActionEvent evt) {

        DefaultTableModel modelo2 = (DefaultTableModel) jTabledeBlocosLivres.getModel();
        modelo2.setNumRows(0);
        DefaultTableModel modelo3 = (DefaultTableModel) jTabledeAlocacaodeDados.getModel();
        modelo3.setNumRows(0);

        int blocolivre = 0;
        int contador = 0;

        for (int i = 0; i < particao1.quantidadeClusters.length; i++) {

            if (particao1.quantidadeClusters[i] == 0) {

                blocolivre = i;
                for (int j = i; j < particao1.quantidadeClusters.length; j++) {

                    if (particao1.quantidadeClusters[j] == 0) {
                        contador += 1;
                    } else {
                        i += contador;
                        modelo2.addRow(new Object[] { blocolivre, contador });
                        contador = 0;
                        break;

                    }
                    if (j == (particao1.quantidadeClusters.length - 1)) {
                        i += contador;
                        modelo2.addRow(new Object[] { blocolivre, contador });
                        contador = 0;
                        break;
                    }

                }

            }
        }

        for (int i = 0; i < particao1.arquivos.length; i++) {

            if (particao1.arquivos[i] != null) {

                String nome = particao1.arquivos[i].getNome();
                double tamanho = particao1.arquivos[i].getTamanho();
                int bloco = particao1.arquivos[i].getClusters(0);
                int contador2 = (particao1.arquivos[i].getClusters(1) - particao1.arquivos[i].getClusters(0) + 1);

                modelo3.addRow(new Object[] { nome, tamanho, bloco, contador2 });
            }

        }

    }





    protected void jButton_PesquisarparaexcluirActionPerformed(ActionEvent evt) {

        DefaultTableModel modelo = (DefaultTableModel) jTabledosArqaExcluir.getModel();
        modelo.setNumRows(0);
        for (int i = 0; i < particao1.arquivos.length; i++) {

            if (particao1.arquivos[i] != null) {

                String nome = particao1.arquivos[i].getNome();
                double tamanho = particao1.arquivos[i].getTamanho();

                modelo.addRow(new Object[] { nome, tamanho });
            }

        }

    }





    private void jComboBoxkbmbgbActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBoxkbmbgbActionPerformed

    }// GEN-LAST:event_jComboBoxkbmbgbActionPerformed





    private void jTextcolocarParticaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextcolocarParticaoActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jTextcolocarParticaoActionPerformed





    private void jButton_excluirActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton_excluirActionPerformed

        String nome = jTexnomedaArqaExcluir.getText();
        particao1.excluirArquivo(nome);

        jTexnomedaArqaExcluir.setText("");

        jButton_PesquisarparaexcluirActionPerformed(evt);

    }// GEN-LAST:event_jButton_excluirActionPerformed





    private void jTabledosArqaExcluirComponentRemoved(java.awt.event.ContainerEvent evt) {// GEN-FIRST:event_jTabledosArqaExcluirComponentRemoved

        // TODO add your handling code here:
    }// GEN-LAST:event_jTabledosArqaExcluirComponentRemoved





    private void jTabledosArqaExcluirComponentAdded(java.awt.event.ContainerEvent evt) {// GEN-FIRST:event_jTabledosArqaExcluirComponentAdded
        // TODO add your handling code here:
    }// GEN-LAST:event_jTabledosArqaExcluirComponentAdded





    private void jButton_adicionararquivoActionPerformed(ActionEvent evt) {// GEN-FIRST:event_jTabledosArqaExcluirComponentAdded

        String nome = jTextnomedoArquivo.getText();
        String entrada1 = jTexttamanhodoarquivo.getText();
        Double tamanhoArq;
        if (jComboBoxkbmbgb.getSelectedIndex() == 0) {

            tamanhoArq = Double.parseDouble(entrada1);

        } else if (jComboBoxkbmbgb.getSelectedIndex() == 1) {

            tamanhoArq = Double.parseDouble(entrada1);
            tamanhoArq = tamanhoArq * 1000;
        } else {

            tamanhoArq = Double.parseDouble(entrada1);
            tamanhoArq = tamanhoArq * 1000000;
        }

        Cluster novoArquivo = new Cluster(nome, tamanhoArq);

        particao1.adicionarArquivo(novoArquivo);

        // jLabel_Unidade.setText("kB");

        jTextTamanhodoarqAdicionado.setText("" + novoArquivo.tamanho);
        jTextClusterUsadospeloArquivo.setText("" + ((novoArquivo.getClusters(1) - novoArquivo.getClusters(0)) + 1));

        jTextnomedoArquivo.setText("");
        jTexttamanhodoarquivo.setText("");

    }





    private void jButton_criarparticaoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_ActionPerformed

        String entrada = jTextcolocarParticao.getText();
        int tamanhoParticao = Integer.parseInt(entrada);

        if (tamanhoParticao > 2048) {

            JOptionPane.showMessageDialog(null, "Erro: Tamaho da partição não suportada ");
            jTextcolocarParticao.setText("");

        } else {
            particao1 = ParticionarHD.criaParticao(tamanhoParticao);

            jTextTamanhototaldaparticao.setText("" + particao1.getTamanho());
            jTclusterquant.setText("" + particao1.getQuantidadeCluster());
            jTclustersTamanho.setText("" + particao1.getCluster());

            jTextTamanhototaldaparticao.setEditable(false);
            jTclusterquant.setEditable(false);
            jTclustersTamanho.setEditable(false);

            jTextcolocarParticao.setEditable(false);
            jButton_criarparticao.setEnabled(false);
        }

    }





    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {

                new PrincipalTela().setVisible(true);
            }
        });
    }





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton      jButtonAtualizarInformacao;
    private javax.swing.JButton      jButtonAtualizarUnidadeTotal;
    private javax.swing.JButton      jButton_Pesquisarparaexcluir;
    private javax.swing.JButton      jButton_adicionararquivo;
    private javax.swing.JButton      jButton_criarparticao;
    private javax.swing.JButton      jButton_excluir;
    private javax.swing.JComboBox    jComboBoxkbmbgb;
    private javax.swing.JLabel       jLabel1;
    private javax.swing.JLabel       jLabel10;
    private javax.swing.JLabel       jLabel11;
    private javax.swing.JLabel       jLabel12;
    private javax.swing.JLabel       jLabel13;
    private javax.swing.JLabel       jLabel14;
    private javax.swing.JLabel       jLabel15;
    private javax.swing.JLabel       jLabel16;
    private javax.swing.JLabel       jLabel17;
    private javax.swing.JLabel       jLabel18;
    private javax.swing.JLabel       jLabel19;
    private javax.swing.JLabel       jLabel2;
    private javax.swing.JLabel       jLabel20;
    private javax.swing.JLabel       jLabel21;
    private javax.swing.JLabel       jLabel22;
    private javax.swing.JLabel       jLabel23;
    private javax.swing.JLabel       jLabel24;
    private javax.swing.JLabel       jLabel25;
    private javax.swing.JLabel       jLabel3;
    private javax.swing.JLabel       jLabel4;
    private javax.swing.JLabel       jLabel5;
    private javax.swing.JLabel       jLabel6;
    private javax.swing.JLabel       jLabel7;
    private javax.swing.JLabel       jLabel8;
    private javax.swing.JLabel       jLabel9;
    private javax.swing.JLabel       jLkbunidade;
    private javax.swing.JLabel       jLporcentagem;
    private javax.swing.JLabel       jLtituo;
    private javax.swing.JPanel       jPanel1;
    private javax.swing.JPanel       jPanel3;
    private javax.swing.JPanel       jPanel4;
    private javax.swing.JPanel       jPanel5;
    private javax.swing.JPanel       jPanel6;
    private javax.swing.JPanel       jPanel7;
    private javax.swing.JProgressBar jProgressBardoUsodaUnidade;
    private javax.swing.JScrollPane  jScrollPane1;
    private javax.swing.JScrollPane  jScrollPane2;
    private javax.swing.JScrollPane  jScrollPane3;
    private javax.swing.JTabbedPane  jTabbedPane1;
    private javax.swing.JTabbedPane  jTabbedPane2;
    private javax.swing.JTabbedPane  jTabbedPane3;
    private javax.swing.JTable       jTabledeAlocacaodeDados;
    private javax.swing.JTable       jTabledeBlocosLivres;
    private javax.swing.JTable       jTabledosArqaExcluir;
    private javax.swing.JTextField   jTclusterquant;
    private javax.swing.JTextField   jTclustersTamanho;
    private javax.swing.JTextField   jTexnomedaArqaExcluir;
    private javax.swing.JTextField   jTextClusterUsadospeloArquivo;
    private javax.swing.JTextField   jTextTamanhodoarqAdicionado;
    private javax.swing.JTextField   jTextTamanhototaldaparticao;
    private javax.swing.JTextField   jTextcolocarParticao;
    private javax.swing.JTextField   jTextespacoLivredaUnidade;
    private javax.swing.JTextField   jTextespacoOcupadodaUnidade;
    private javax.swing.JTextField   jTextnomedoArquivo;
    private javax.swing.JTextField   jTexttamanhodoarquivo;
    private javax.swing.JTextField   jTextunidadeTotal;
    public ParticionarHD             particao1;
    // End of variables declaration//GEN-END:variables

}
