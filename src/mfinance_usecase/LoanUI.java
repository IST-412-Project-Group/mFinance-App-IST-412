/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mfinance_usecase;
import Loan.Apply;
import Loan.LoanControl;
import Loan.Loan;
/**
 *
 * @author spencer
 */
public class LoanUI extends javax.swing.JFrame {
    
    /**
     * Creates new form LoanUI
     */
    public LoanUI() {
        initComponents();
        lblSchoolName.setVisible(false);
        txtSchoolName.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtLoanAmount = new javax.swing.JTextField();
        lblLoanAmount = new javax.swing.JLabel();
        lblInterestRate = new javax.swing.JLabel();
        txtInterestRate = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JTextField();
        lblEmail = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        cboxCarType = new javax.swing.JComboBox<>();
        lblLoanType = new javax.swing.JLabel();
        lblFullName = new javax.swing.JLabel();
        txtFullName = new javax.swing.JTextField();
        lblCarYear = new javax.swing.JLabel();
        txtCarYear = new javax.swing.JTextField();
        lblSchoolName = new javax.swing.JLabel();
        txtSchoolName = new javax.swing.JTextField();
        lblCarMake = new javax.swing.JLabel();
        txtCarMake = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtIncome = new javax.swing.JTextField();
        lblIncome = new javax.swing.JLabel();
        btnMainMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtLoanAmount.setText("6000");
        txtLoanAmount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoanAmountActionPerformed(evt);
            }
        });

        lblLoanAmount.setText("Loan Amount");

        lblInterestRate.setText("Desired Interest Rate");

        txtInterestRate.setText("2");
        txtInterestRate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtInterestRateActionPerformed(evt);
            }
        });

        lblPhoneNumber.setText("Phone Number");

        txtPhoneNumber.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        txtPhoneNumber.setText("814-865-4700");

        lblEmail.setText("Email");

        txtEmail.setText("hello@world.org");

        btnSubmit.setText("Submit Application");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblTitle.setText("Applying for a new loan!");

        cboxCarType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car", "Student" }));
        cboxCarType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboxCarTypeActionPerformed(evt);
            }
        });

        lblLoanType.setText("Loan Type");

        lblFullName.setText("Full Name");

        txtFullName.setText("ex. Jane Doe");
        txtFullName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullNameActionPerformed(evt);
            }
        });

        lblCarYear.setText("Car Year");

        txtCarYear.setText("1996");

        lblSchoolName.setText("Institution");

        txtSchoolName.setText("Penn State");
        txtSchoolName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSchoolNameActionPerformed(evt);
            }
        });

        lblCarMake.setText("Car Manufacturer");

        txtCarMake.setText("Honda");

        txtIncome.setText("20000");
        txtIncome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIncomeActionPerformed(evt);
            }
        });

        lblIncome.setText("Current Income");

        btnMainMenu.setText("Main Menu");
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel11)
                            .addComponent(lblLoanType)
                            .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblFullName)
                            .addComponent(cboxCarType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtFullName, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblInterestRate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLoanAmount, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtLoanAmount, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblEmail, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtInterestRate, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE))
                                .addGap(70, 70, 70)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblCarYear)
                                    .addComponent(txtCarYear)
                                    .addComponent(lblSchoolName)
                                    .addComponent(txtSchoolName, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                                    .addComponent(lblCarMake)
                                    .addComponent(txtCarMake)
                                    .addComponent(lblIncome)
                                    .addComponent(txtIncome))))
                        .addContainerGap(164, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addComponent(btnMainMenu)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnSubmit)
                        .addGap(150, 150, 150))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLoanAmount)
                    .addComponent(lblCarYear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLoanAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCarYear, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblInterestRate)
                    .addComponent(lblCarMake))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInterestRate, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(txtCarMake, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPhoneNumber)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblSchoolName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtSchoolName, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmail)
                    .addComponent(lblIncome))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIncome, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblLoanType)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cboxCarType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblFullName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSubmit)
                    .addComponent(btnMainMenu))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtInterestRateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtInterestRateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtInterestRateActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
       /* Create the loan object */
        Apply newLoan = new Apply();
              
        newLoan.setLoanAmount(Integer.parseInt(txtLoanAmount.getText()));
        newLoan.setInterestRate(Float.parseFloat(txtInterestRate.getText()));
        newLoan.setLoanType(cboxCarType.getSelectedItem().toString());
        newLoan.setCarMake(txtCarMake.getText());
        newLoan.setCarYear(Integer.parseInt(txtCarYear.getText()));
        newLoan.setInstituion(txtSchoolName.getText());
        
        Loan finalizedLoan = LoanControl.LoanFactory(newLoan);
        
        if (newLoan.doesQualify(Integer.parseInt(txtIncome.getText()))) {
            jLabel11.setText("Congrats on your new loan!");
        } else {
            jLabel11.setText("I'm sorry, you do not currently qualify.");
        }
        
        /* var finalizedLoan is now ready to be POSTed to the DB */
        /* Clear form and prompt user to fill out another application if they want to */
        txtLoanAmount.setText("");
        txtInterestRate.setText("");
        txtPhoneNumber.setText("");
        txtEmail.setText("");
        txtFullName.setText("");
        txtCarYear.setText("");
        txtSchoolName.setText("");
        txtCarMake.setText("");
        txtIncome.setText("");
        cboxCarType.setSelectedIndex(0);
        lblTitle.setText("Would you like to apply for another loan?");
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void txtLoanAmountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoanAmountActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoanAmountActionPerformed

    private void txtFullNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullNameActionPerformed

    private void cboxCarTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboxCarTypeActionPerformed
        // TODO add your handling code here:
        if (cboxCarType.getSelectedItem().toString().equalsIgnoreCase("car")) {
            txtCarYear.setVisible(true);
            lblCarYear.setVisible(true);
            
            txtCarMake.setVisible(true);
            lblCarMake.setVisible(true);
            
            lblSchoolName.setVisible(false);
            txtSchoolName.setVisible(false);
            
        } else {
            txtCarYear.setVisible(false);
            lblCarYear.setVisible(false);
            
            txtCarMake.setVisible(false);
            lblCarMake.setVisible(false);
            
            lblSchoolName.setVisible(true);
            txtSchoolName.setVisible(true);
        }
    }//GEN-LAST:event_cboxCarTypeActionPerformed

    private void txtSchoolNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSchoolNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSchoolNameActionPerformed

    private void txtIncomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIncomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIncomeActionPerformed

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed

        this.dispose();
            
            java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MainMenu().setVisible(true);
            }
        });     
    }//GEN-LAST:event_btnMainMenuActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cboxCarType;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel lblCarMake;
    private javax.swing.JLabel lblCarYear;
    private javax.swing.JLabel lblEmail;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblIncome;
    private javax.swing.JLabel lblInterestRate;
    private javax.swing.JLabel lblLoanAmount;
    private javax.swing.JLabel lblLoanType;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblSchoolName;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTextField txtCarMake;
    private javax.swing.JTextField txtCarYear;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtFullName;
    private javax.swing.JTextField txtIncome;
    private javax.swing.JTextField txtInterestRate;
    private javax.swing.JTextField txtLoanAmount;
    private javax.swing.JTextField txtPhoneNumber;
    private javax.swing.JTextField txtSchoolName;
    // End of variables declaration//GEN-END:variables
}