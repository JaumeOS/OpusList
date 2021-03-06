package opuslist;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JList;

public class MainForm extends javax.swing.JFrame {

    private static final java.lang.reflect.Type LIST_OF_OBRA_TYPE = new TypeToken<List<Obra>>() {
    }.getType();
    public static ArrayList<Obra> obras = new ArrayList<>();
    private static JList<Obra> lstObras;

    private boolean confirmSave = false;
    private boolean dataChanged = false;

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        lstObras = new JList<Obra>();
        jScrollPane1.setViewportView(lstObras);
        lstObras.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                //lstObrasValueChanged(evt);
            }
        });
    }

//    private void lstObrasValueChanged(javax.swing.event.ListSelectionEvent evt) {
//        Obra selectedObra = lstObras.getSelectedValue();
//        if (selectedObra != null) {
//            for (Obra o : obras) {
//                try {
//                    BufferedImage bufferedImage = ImageIO.read(new File(System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\images\\" + o.getImatge()));
//                    ImageIcon icon = resizeImageIcon(bufferedImage, lblImage.getWidth(), lblImage.getHeight());
//                    lblImage.setIcon(icon);
//                    txtImagePath.setText(System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\images\\" + o.getImatge());
//                } catch (IOException ioe) {
//                    ioe.printStackTrace();
//                }
//            }
//        }
//    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        mnuMenuBar = new javax.swing.JMenuBar();
        mnuCRUD = new javax.swing.JMenu();
        mniRead = new javax.swing.JMenuItem();
        mniInsert = new javax.swing.JMenuItem();
        mniUpdate = new javax.swing.JMenuItem();
        mniDelette = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Opus List");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        mnuCRUD.setText("CRUD");

        mniRead.setText("Read");
        mniRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniReadActionPerformed(evt);
            }
        });
        mnuCRUD.add(mniRead);

        mniInsert.setText("Insert");
        mniInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniInsertActionPerformed(evt);
            }
        });
        mnuCRUD.add(mniInsert);

        mniUpdate.setText("Update");
        mniUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniUpdateActionPerformed(evt);
            }
        });
        mnuCRUD.add(mniUpdate);

        mniDelette.setText("Delete");
        mniDelette.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mniDeletteActionPerformed(evt);
            }
        });
        mnuCRUD.add(mniDelette);

        mnuMenuBar.add(mnuCRUD);

        setJMenuBar(mnuMenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnInsert, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRead, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 538, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInsert, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnUpdate)
                        .addComponent(btnDelete)
                        .addComponent(btnSave)
                        .addComponent(btnRead)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        Gson gson = new Gson();
        try {
            JsonReader reader = new JsonReader(new FileReader(System.getProperty("user.home") + "\\AppData\\Local\\OpusList\\data\\obres.json"));
            obras = gson.fromJson(reader, LIST_OF_OBRA_TYPE);

            DefaultListModel<Obra> usersListModel = new DefaultListModel<Obra>();
            for (Obra o : obras) {
                usersListModel.addElement(o);
            }
            lstObras.setModel(usersListModel);
        } catch (FileNotFoundException fnfe) {
            fnfe.printStackTrace();
        }
    }//GEN-LAST:event_btnReadActionPerformed

    private void mniReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniReadActionPerformed
        btnRead.doClick();
    }//GEN-LAST:event_mniReadActionPerformed

    private void mniDeletteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniDeletteActionPerformed
        btnDelete.doClick();
    }//GEN-LAST:event_mniDeletteActionPerformed

    private void mniUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniUpdateActionPerformed
        btnUpdate.doClick();
    }//GEN-LAST:event_mniUpdateActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        InsertDialog insertDialog = new InsertDialog(this, true);
        insertDialog.setVisible(true);
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed

    }//GEN-LAST:event_btnSaveActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        btnRead.doClick();
    }//GEN-LAST:event_formWindowOpened

    private void mniInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mniInsertActionPerformed
        btnInsert.doClick();
    }//GEN-LAST:event_mniInsertActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        DeleteDialog deleteDialog = new DeleteDialog(this, true);
        deleteDialog.setVisible(true);
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        UpdateDialog updateDialog = new UpdateDialog(this, true);
        updateDialog.setVisible(true);
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void UpdateListModel() {
        DefaultListModel obrasListModel = new DefaultListModel();
        for (Obra o : obras) {
            obrasListModel.addElement(o);
        }
    }

    ImageIcon resizeImageIcon(BufferedImage originalImage, int desiredWidth, int desiredHeight) {
        int newHeight;
        int newWidth;
        float aspectRatio = (float) originalImage.getWidth() / (float) originalImage.getHeight();
        if (originalImage.getWidth() > originalImage.getHeight()) {
            newWidth = desiredWidth;
            newHeight = Math.round(desiredWidth / aspectRatio);
        } else {
            newHeight = desiredHeight;
            newWidth = Math.round(desiredHeight * aspectRatio);
        }
        Image resultingImage = originalImage.getScaledInstance(newWidth, newHeight, Image.SCALE_SMOOTH);
        BufferedImage outputImage = new BufferedImage(newWidth, newHeight, BufferedImage.TYPE_INT_RGB);
        outputImage.getGraphics().drawImage(resultingImage, 0, 0, null);
        ImageIcon imageIcon = new ImageIcon(outputImage);
        return imageIcon;
    }

    public boolean isConfirmSave() {
        return confirmSave;
    }

    public void setConfirmSave(boolean confirmSave) {
        this.confirmSave = confirmSave;
    }

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem mniDelette;
    private javax.swing.JMenuItem mniInsert;
    private javax.swing.JMenuItem mniRead;
    private javax.swing.JMenuItem mniUpdate;
    private javax.swing.JMenu mnuCRUD;
    private javax.swing.JMenuBar mnuMenuBar;
    // End of variables declaration//GEN-END:variables
}
