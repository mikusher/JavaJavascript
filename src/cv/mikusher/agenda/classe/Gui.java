/*
 * Copyright (C) 2017 Miky Mikusher
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 */

package cv.mikusher.agenda.classe;

import java.io.IOException;

import javax.swing.JOptionPane;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

/**
 *
 * @author Miky Mikusher
 */
public class Gui extends javax.swing.JFrame {

	static Object uuid = null;
	Operacao opr = new Operacao();
	OperacoesSQL opSql = new OperacoesSQL();
	Pessoa ps = new Pessoa();

	/**
	 * Creates new form Gui
	 */
	public Gui() {

		initComponents();
		this.setLocationRelativeTo(null);
		this.isLimpo();
		this.isEditable(false);
		this.opSql.createNewDatabase();
		this.opSql.createNewTable();

	}

	public void isEditable(boolean status) {

		jt_EditName.setEditable(status);
		jt_EditEndereco.setEditable(status);
		jt_EditIdade.setEditable(status);
		jbEDSave.setEnabled(status);
	}

	public void isLimpo() {

		try {
			if (jtName.getText().trim().equals("") || jtEndereco.getText().trim().equals("")
					|| jtIdade.getText().trim().equals("") || jtId.getText().trim().equals("")) {
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Campo nao pode ser limpo.");
			// TODO: handle exception
		}
	}

	/**
	 * This method is called from within the constructor to initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is always
	 * regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
	// <editor-fold defaultstate="collapsed" desc="Generated
	// Code">//GEN-BEGIN:initComponents
	private void initComponents() {

		jTabbedPane1 = new javax.swing.JTabbedPane();
		jPanel1 = new javax.swing.JPanel();
		jLabelName = new javax.swing.JLabel();
		jLabelEndereco = new javax.swing.JLabel();
		jLabelIdade = new javax.swing.JLabel();
		jLabelId = new javax.swing.JLabel();
		jtName = new javax.swing.JTextField();
		jtEndereco = new javax.swing.JTextField();
		jtIdade = new javax.swing.JTextField();
		jtId = new javax.swing.JTextField();
		jbSave = new javax.swing.JButton();
		jbCancel = new javax.swing.JButton();
		jLabel9 = new javax.swing.JLabel();
		jPanel2 = new javax.swing.JPanel();
		jLabel5 = new javax.swing.JLabel();
		jtidPesquisa = new javax.swing.JTextField();
		jbPesquisa = new javax.swing.JButton();
		jScrollPane1 = new javax.swing.JScrollPane();
		jtResultado = new javax.swing.JTextArea();
		jLabel10 = new javax.swing.JLabel();
		jPanel3 = new javax.swing.JPanel();
		jLabel1 = new javax.swing.JLabel();
		jtIDRemove = new javax.swing.JTextField();
		jbRemove = new javax.swing.JButton();
		jSeparator1 = new javax.swing.JSeparator();
		jLabel2 = new javax.swing.JLabel();
		jLabel3 = new javax.swing.JLabel();
		jLabel4 = new javax.swing.JLabel();
		jLabel6 = new javax.swing.JLabel();
		jLabel7 = new javax.swing.JLabel();
		jt_EditEndereco = new javax.swing.JTextField();
		jt_EditIdade = new javax.swing.JTextField();
		jt_EditName = new javax.swing.JTextField();
		jLabel8 = new javax.swing.JLabel();
		jt_IDCheck = new javax.swing.JTextField();
		jb_IDCheck = new javax.swing.JButton();
		jbEDSave = new javax.swing.JButton();

		setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

		jLabelName.setText("Nome:");

		jLabelEndereco.setText("Endereco:");

		jLabelIdade.setText("Idade:");

		jLabelId.setText("Id:");

		jtId.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {

				jtIdActionPerformed(evt);
			}
		});

		jbSave.setText("Save");
		jbSave.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {

				try {
					jbSaveActionPerformed(evt);
				} catch (SecurityException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		jbCancel.setText("Cancel");
		jbCancel.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {

				jbCancelActionPerformed(evt);
			}
		});

		jLabel9.setText("Cadastro");

		javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
		jPanel1.setLayout(jPanel1Layout);
		jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel1Layout.createSequentialGroup().addContainerGap().addGroup(jPanel1Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel9)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
								.addGroup(jPanel1Layout.createSequentialGroup()
										.addComponent(jbSave, javax.swing.GroupLayout.PREFERRED_SIZE, 62,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addGap(18, 18, 18).addComponent(jbCancel))
								.addGroup(jPanel1Layout.createSequentialGroup().addGroup(jPanel1Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
												jPanel1Layout.createSequentialGroup().addComponent(jLabelEndereco)
														.addGap(5, 5, 5))
										.addGroup(jPanel1Layout.createSequentialGroup().addComponent(jLabelIdade)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
										.addGroup(jPanel1Layout
												.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
												.addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jtName, javax.swing.GroupLayout.PREFERRED_SIZE, 381,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addComponent(jtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 50,
														javax.swing.GroupLayout.PREFERRED_SIZE))))
						.addComponent(jLabelId).addComponent(jLabelName)).addContainerGap(35, Short.MAX_VALUE)));

		jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] { jbCancel, jbSave });

		jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
						.addContainerGap().addComponent(jLabel9).addGap(19, 19, 19)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelId).addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(11, 11, 11)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelIdade).addComponent(jtIdade, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelName).addComponent(jtName, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabelEndereco).addComponent(jtEndereco,
										javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
										javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jbSave).addComponent(jbCancel))
						.addContainerGap(62, Short.MAX_VALUE)));

		jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] { jbCancel, jbSave });

		jTabbedPane1.addTab("Cadastro", jPanel1);

		jLabel5.setText("Id:");

		jbPesquisa.setText("Pesquisar");
		jbPesquisa.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {

				jbPesquisaActionPerformed(evt);
			}
		});

		jtResultado.setEditable(false);
		jtResultado.setColumns(20);
		jtResultado.setRows(5);
		jScrollPane1.setViewportView(jtResultado);

		jLabel10.setText("Consulta");

		javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
		jPanel2.setLayout(jPanel2Layout);
		jPanel2Layout.setHorizontalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addGroup(jPanel2Layout
						.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
						.addGroup(jPanel2Layout.createSequentialGroup().addGroup(jPanel2Layout
								.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addComponent(jLabel10)
								.addGroup(jPanel2Layout.createSequentialGroup().addComponent(jLabel5).addGap(2, 2, 2)
										.addComponent(jtidPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 33,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jbPesquisa)))
								.addGap(0, 0, Short.MAX_VALUE)))
						.addContainerGap()));
		jPanel2Layout.setVerticalGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel2Layout.createSequentialGroup().addContainerGap().addComponent(jLabel10)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel5)
								.addComponent(jtidPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbPesquisa))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
						.addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 198, Short.MAX_VALUE)
						.addContainerGap()));

		jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL,
				new java.awt.Component[] { jbPesquisa, jtidPesquisa });

		jTabbedPane1.addTab("Consulta", jPanel2);

		jLabel1.setText("Id:");

		jbRemove.setText("Remove");
		jbRemove.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {

				jbRemoveActionPerformed(evt);
			}
		});

		jLabel2.setText("Remove");

		jLabel3.setText("Edite");

		jLabel4.setText("Nome:");

		jLabel6.setText("Endere�o:");

		jLabel7.setText("Idade:");

		jLabel8.setText("Id:");

		jb_IDCheck.setText("Check");
		jb_IDCheck.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {

				jb_IDCheckActionPerformed(evt);
			}
		});

		jbEDSave.setText("Save");
		jbEDSave.addActionListener(new java.awt.event.ActionListener() {

			public void actionPerformed(java.awt.event.ActionEvent evt) {

				try {
					jbEDSaveActionPerformed(evt);
				} catch (SecurityException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		});

		javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
		jPanel3.setLayout(jPanel3Layout);
		jPanel3Layout.setHorizontalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addContainerGap()
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
								.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel1)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jtIDRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
												javax.swing.GroupLayout.PREFERRED_SIZE)
										.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
										.addComponent(jbRemove).addGap(0, 0, Short.MAX_VALUE))
								.addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jLabel2).addComponent(jLabel3)
										.addGroup(jPanel3Layout.createSequentialGroup().addComponent(jLabel8)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jt_IDCheck, javax.swing.GroupLayout.PREFERRED_SIZE, 39,
														javax.swing.GroupLayout.PREFERRED_SIZE)
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addComponent(jb_IDCheck)))
										.addGap(333, 333, 333))
								.addGroup(jPanel3Layout.createSequentialGroup().addGroup(jPanel3Layout
										.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
										.addComponent(jSeparator1)
										.addGroup(jPanel3Layout.createSequentialGroup().addGroup(
												jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addComponent(jLabel6).addComponent(jLabel4))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
																false)
														.addComponent(jt_EditName, javax.swing.GroupLayout.DEFAULT_SIZE,
																314, Short.MAX_VALUE)
														.addComponent(jt_EditEndereco))
												.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
												.addGroup(jPanel3Layout
														.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
														.addGroup(jPanel3Layout.createSequentialGroup()
																.addComponent(jLabel7)
																.addPreferredGap(
																		javax.swing.LayoutStyle.ComponentPlacement.RELATED)
																.addComponent(jt_EditIdade,
																		javax.swing.GroupLayout.PREFERRED_SIZE, 36,
																		javax.swing.GroupLayout.PREFERRED_SIZE))
														.addComponent(jbEDSave, javax.swing.GroupLayout.DEFAULT_SIZE,
																javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
												.addGap(0, 0, Short.MAX_VALUE)))
										.addContainerGap()))));

		jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL,
				new java.awt.Component[] { jbEDSave, jbRemove, jb_IDCheck });

		jPanel3Layout.setVerticalGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(jPanel3Layout.createSequentialGroup().addGap(7, 7, 7).addComponent(jLabel2).addGap(18, 18, 18)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel1)
								.addComponent(jtIDRemove, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbRemove))
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED).addComponent(jLabel3)
						.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel8)
								.addComponent(jt_IDCheck, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jb_IDCheck))
						.addGap(18, 18, 18)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel4)
								.addComponent(jt_EditName, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jLabel7)
								.addComponent(jt_EditIdade, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
						.addGap(18, 18, 18)
						.addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
								.addComponent(jLabel6)
								.addComponent(jt_EditEndereco, javax.swing.GroupLayout.PREFERRED_SIZE,
										javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
								.addComponent(jbEDSave))
						.addGap(29, 29, 29)));

		jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL,
				new java.awt.Component[] { jbEDSave, jbRemove, jb_IDCheck });

		jTabbedPane1.addTab("Update/Remove", jPanel3);

		javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
		getContentPane().setLayout(layout);
		layout.setHorizontalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
				.addGroup(layout.createSequentialGroup().addContainerGap()
						.addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 485,
								javax.swing.GroupLayout.PREFERRED_SIZE)
						.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
		layout.setVerticalGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING).addGroup(
				layout.createSequentialGroup().addContainerGap().addComponent(jTabbedPane1).addContainerGap()));

		pack();
	}// </editor-fold>//GEN-END:initComponents

	private void jbRemoveActionPerformed(java.awt.event.ActionEvent evt) {

		// code for remove ID
		int idRemove = Integer.parseInt(jtIDRemove.getText().trim());
		try {
			// Remove the XML File and SER File
			opr.deleteFileUser(idRemove);
			// Remove the SQL Query
			OperacoesSQL.deleteSQLUser(idRemove);
		} catch (Exception e) {
			System.out.println("Error in Removed");
		}
	}

	private void jb_IDCheckActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jb_IDCheckActionPerformed

		if (jt_IDCheck.getText() == "" || jt_IDCheck.getText().isEmpty() || jt_IDCheck.getText().equals("")) {
			JOptionPane.showConfirmDialog(null, "Campo vazio, indica um ID valido para pesquisa", "Campo ID vazio",
					JOptionPane.CANCEL_OPTION);

		} else {
			try {
				int idCheck = Integer.parseInt(jt_IDCheck.getText().trim());
				String _idade = String.valueOf(opr.p.getIdade());
				if (opr.checkUtilizador(idCheck) == null) {
					LoggOperation.LOGGER.warning(idCheck + " n�o encontrado!");
				} else {
					this.jt_EditName.setText(opr.p.getNome());
					this.jt_EditEndereco.setText(opr.p.getEndereco());
					this.jt_EditIdade.setText(_idade.toString());
					this.isEditable(true);
				}

			} catch (Exception e) {
				LoggOperation.LOGGER.warning("Erro na verifica��o de ID!");
			}

		}
	}

	private void jbEDSaveActionPerformed(java.awt.event.ActionEvent evt) throws SecurityException, IOException {

		// Save Operation after edit
		try {
			opr.gravarBeforEditUser(jt_EditName.getText().toString(), jt_EditEndereco.getText().toString(),
					Integer.parseInt(jt_EditIdade.getText()));

			// Atualiza��o somento na base de dados funcional por momento
			OperacoesSQL.updateUser(Integer.parseInt(jt_IDCheck.getText().trim()), jt_EditName.getText().toString(),
					Integer.parseInt(jt_EditIdade.getText()), jt_EditEndereco.getText().toString());
			LoggOperation.LOGGER.info("Informa��es Editadas com Sucesso!!");
		} catch (NumberFormatException | ParserConfigurationException | TransformerException e) {
			// TODO Auto-generated catch block
			LoggOperation.LOGGER.warning("N�o foi possivel editar!");
			e.printStackTrace();
		}

	}

	private void jtIdActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jtIdActionPerformed
		// TODO add your handling code here:
	}// GEN-LAST:event_jtIdActionPerformed

	private void jbSaveActionPerformed(java.awt.event.ActionEvent evt) throws SecurityException, IOException {// GEN-FIRST:event_jbSaveActionPerformed

		try {
			// Operation (xml/ser)
			opr.gravarUtilizador(jtName.getText().toString(), jtEndereco.getText().toString(),
					Integer.parseInt(jtIdade.getText()), Integer.parseInt(jtId.getText()), uuid);

			// is create on initial Gui
			// Database operation (sqlLite)
			OperacoesSQL.insert(opr.p.getUUID(), Integer.parseInt(jtId.getText()), jtName.getText().toString(),
					Integer.parseInt(jtIdade.getText()), jtEndereco.getText());

		} catch (NumberFormatException | ParserConfigurationException | TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// GEN-LAST:event_jbSaveActionPerformed

	private void jbCancelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbCancelActionPerformed

		// TODO add your handling code here:
		System.exit(0);
	}// GEN-LAST:event_jbCancelActionPerformed

	private void jbPesquisaActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jbPesquisaActionPerformed

		// TODO add your handling code here:
		if (jtidPesquisa.getText() == "" || jtidPesquisa.getText().isEmpty() || jtidPesquisa.getText().equals("")) {
			JOptionPane.showConfirmDialog(null, "Campo vazio, indica um ID valido para pesquisa", "Campo ID vazio",
					JOptionPane.CANCEL_OPTION);
		} else {
			try {
				int idCheck = Integer.parseInt(jtidPesquisa.getText().trim());
				if (opr.pesquisarUtilizador(idCheck) == null) {
					LoggOperation.LOGGER.warning("O ID " + idCheck + " n�o foi encontrado!");
					jtidPesquisa.setText("");
					jtResultado.setText("");

				} else {
					jtResultado.setText("Nome: " + opr.p.getNome() + '\n' + "Endereco: " + opr.p.getEndereco() + '\n'
							+ "Idade: " + opr.p.getIdade() + '\n' + "UUID: " + opr.p.getUUID() + '\n');
				}

			} catch (NumberFormatException e) {
				JOptionPane.showConfirmDialog(null, "N�o � um ID. Indica um valor numerico valido para pesquisa",
						"Numero Invalido", JOptionPane.CANCEL_OPTION);
			}
		}

	}

	/**
	 * @param args
	 *            the command line arguments
	 */
	public static void main(String args[]) {

		/* Set the Nimbus look and feel */
		// <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
		// (optional) ">
		/*
		 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
		 * look and feel. For details see
		 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Gui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		// </editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {

			public void run() {

				new Gui().setVisible(true);
			}
		});
	}

	// Variables declaration - do not modify//GEN-BEGIN:variables
	private javax.swing.JLabel jLabel1;
	private javax.swing.JLabel jLabel10;
	private javax.swing.JLabel jLabel2;
	private javax.swing.JLabel jLabel3;
	private javax.swing.JLabel jLabel4;
	private javax.swing.JLabel jLabel5;
	private javax.swing.JLabel jLabel6;
	private javax.swing.JLabel jLabel7;
	private javax.swing.JLabel jLabel8;
	private javax.swing.JLabel jLabel9;
	private javax.swing.JLabel jLabelEndereco;
	private javax.swing.JLabel jLabelId;
	private javax.swing.JLabel jLabelIdade;
	private javax.swing.JLabel jLabelName;
	private javax.swing.JPanel jPanel1;
	private javax.swing.JPanel jPanel2;
	private javax.swing.JPanel jPanel3;
	private javax.swing.JScrollPane jScrollPane1;
	private javax.swing.JSeparator jSeparator1;
	private javax.swing.JTabbedPane jTabbedPane1;
	private javax.swing.JButton jbCancel;
	private javax.swing.JButton jbEDSave;
	private javax.swing.JButton jbPesquisa;
	private javax.swing.JButton jbRemove;
	private javax.swing.JButton jbSave;
	private javax.swing.JButton jb_IDCheck;
	private javax.swing.JTextField jtEndereco;
	private javax.swing.JTextField jtIDRemove;
	private javax.swing.JTextField jtId;
	private javax.swing.JTextField jtIdade;
	private javax.swing.JTextField jtName;
	private javax.swing.JTextArea jtResultado;
	private javax.swing.JTextField jt_EditEndereco;
	private javax.swing.JTextField jt_EditIdade;
	private javax.swing.JTextField jt_EditName;
	private javax.swing.JTextField jt_IDCheck;
	private javax.swing.JTextField jtidPesquisa;
	// End of variables declaration//GEN-END:variables
}
