/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learningwords;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import learningwords.enums.DynamicViewElementE;
import learningwords.enums.ElementActionE;
import learningwords.enums.ViewTypeE;

/**
 *
 * @author Andrz3j
 */
public class WordsJDialog extends javax.swing.JDialog {
    
    private static BusinessLogic appLogic;
    public static WordsJDialog dialog;
    /**
     * Creates new form WordsJDialog
     */
    public WordsJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        fromLanguageGroup = new javax.swing.ButtonGroup();
        jFrontLayer = new javax.swing.JLayeredPane();
        jTextField1UserTranslation = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3Solutions = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jButton1Approve = new javax.swing.JButton();
        jLabel5MissedWords = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7IncorrectWords = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel12GuessWord = new javax.swing.JLabel();
        jButton1Approve1 = new javax.swing.JButton();
        jSettingsLayer = new javax.swing.JLayeredPane();
        jLabel8 = new javax.swing.JLabel();
        jRadioButton1Polish = new javax.swing.JRadioButton();
        jRadioButton2English = new javax.swing.JRadioButton();
        jRadioButton3Random = new javax.swing.JRadioButton();
        jLabel9 = new javax.swing.JLabel();
        jTextField2SuspendTime = new javax.swing.JTextField();
        jCheckBox1HideAfterSuccess = new javax.swing.JCheckBox();
        jButton4Apply = new javax.swing.JButton();
        jButton5Abort = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jButton3Settings = new javax.swing.JButton();
        jButton2Hide = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jFrontLayer.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jTextField1UserTranslation.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jTextField1UserTranslation.setToolTipText("");

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Translation:");
        jLabel1.setAutoscrolls(true);

        jLabel2.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Solutions:");
        jLabel2.setAutoscrolls(true);

        jLabel3Solutions.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel3Solutions.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3Solutions.setText("3");
        jLabel3Solutions.setAutoscrolls(true);

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Missed words:");
        jLabel4.setAutoscrolls(true);

        jButton1Approve.setText("Approve");

        jLabel5MissedWords.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel5MissedWords.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5MissedWords.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5MissedWords.setText("nasiono, pestka, zalążek");
        jLabel5MissedWords.setAutoscrolls(true);
        jLabel5MissedWords.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Incorrect words:");
        jLabel6.setAutoscrolls(true);

        jLabel7IncorrectWords.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel7IncorrectWords.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7IncorrectWords.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7IncorrectWords.setText("strzelać, chodzić");
        jLabel7IncorrectWords.setAutoscrolls(true);
        jLabel7IncorrectWords.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Guess:");
        jLabel11.setAutoscrolls(true);

        jLabel12GuessWord.setFont(new java.awt.Font("Calibri", 1, 24)); // NOI18N
        jLabel12GuessWord.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12GuessWord.setText("Seed");
        jLabel12GuessWord.setAutoscrolls(true);

        jButton1Approve1.setText("Check & Next");

        javax.swing.GroupLayout jFrontLayerLayout = new javax.swing.GroupLayout(jFrontLayer);
        jFrontLayer.setLayout(jFrontLayerLayout);
        jFrontLayerLayout.setHorizontalGroup(
            jFrontLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrontLayerLayout.createSequentialGroup()
                .addGroup(jFrontLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1UserTranslation)
                    .addComponent(jLabel12GuessWord, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jFrontLayerLayout.createSequentialGroup()
                        .addGroup(jFrontLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jFrontLayerLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5MissedWords, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jFrontLayerLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7IncorrectWords, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel11))
                        .addGap(0, 240, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrontLayerLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3Solutions))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrontLayerLayout.createSequentialGroup()
                        .addComponent(jButton1Approve1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1Approve, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, 0))
        );
        jFrontLayerLayout.setVerticalGroup(
            jFrontLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrontLayerLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jLabel11)
                .addGap(3, 3, 3)
                .addComponent(jLabel12GuessWord)
                .addGap(7, 7, 7)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jFrontLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jFrontLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3Solutions, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jFrontLayerLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(5, 5, 5)
                .addComponent(jTextField1UserTranslation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrontLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1Approve, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1Approve1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(jFrontLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5MissedWords))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrontLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7IncorrectWords))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jFrontLayer.setLayer(jTextField1UserTranslation, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jFrontLayer.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jFrontLayer.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jFrontLayer.setLayer(jLabel3Solutions, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jFrontLayer.setLayer(jSeparator1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jFrontLayer.setLayer(jLabel4, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jFrontLayer.setLayer(jButton1Approve, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jFrontLayer.setLayer(jLabel5MissedWords, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jFrontLayer.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jFrontLayer.setLayer(jLabel7IncorrectWords, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jFrontLayer.setLayer(jSeparator3, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jFrontLayer.setLayer(jLabel11, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jFrontLayer.setLayer(jLabel12GuessWord, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jFrontLayer.setLayer(jButton1Approve1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jSettingsLayer.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel8.setText("Translate from language:");

        fromLanguageGroup.add(jRadioButton1Polish);
        jRadioButton1Polish.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jRadioButton1Polish.setSelected(true);
        jRadioButton1Polish.setText("polish");

        fromLanguageGroup.add(jRadioButton2English);
        jRadioButton2English.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jRadioButton2English.setText("english");

        fromLanguageGroup.add(jRadioButton3Random);
        jRadioButton3Random.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jRadioButton3Random.setText("random");

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jLabel9.setText("Show window after(h):");

        jTextField2SuspendTime.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField2SuspendTime.setText("1");

        jCheckBox1HideAfterSuccess.setFont(new java.awt.Font("Calibri", 0, 14)); // NOI18N
        jCheckBox1HideAfterSuccess.setSelected(true);
        jCheckBox1HideAfterSuccess.setText("Hide after success");
        jCheckBox1HideAfterSuccess.setMargin(new java.awt.Insets(2, 0, 2, 2));

        jButton4Apply.setText("Apply");
        jButton4Apply.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4ApplyMouseClicked(evt);
            }
        });

        jButton5Abort.setText("Abort");

        javax.swing.GroupLayout jSettingsLayerLayout = new javax.swing.GroupLayout(jSettingsLayer);
        jSettingsLayer.setLayout(jSettingsLayerLayout);
        jSettingsLayerLayout.setHorizontalGroup(
            jSettingsLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSettingsLayerLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jSettingsLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addGroup(jSettingsLayerLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(jSettingsLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton2English)
                            .addComponent(jRadioButton1Polish)
                            .addComponent(jRadioButton3Random)))
                    .addGroup(jSettingsLayerLayout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField2SuspendTime, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jCheckBox1HideAfterSuccess))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jSettingsLayerLayout.createSequentialGroup()
                .addComponent(jButton4Apply, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 264, Short.MAX_VALUE)
                .addComponent(jButton5Abort, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jSettingsLayerLayout.setVerticalGroup(
            jSettingsLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jSettingsLayerLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton1Polish)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2English)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3Random)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jSettingsLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField2SuspendTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jCheckBox1HideAfterSuccess)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jSettingsLayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4Apply, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5Abort, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jSettingsLayer.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSettingsLayer.setLayer(jRadioButton1Polish, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSettingsLayer.setLayer(jRadioButton2English, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSettingsLayer.setLayer(jRadioButton3Random, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSettingsLayer.setLayer(jLabel9, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSettingsLayer.setLayer(jTextField2SuspendTime, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSettingsLayer.setLayer(jCheckBox1HideAfterSuccess, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSettingsLayer.setLayer(jButton4Apply, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jSettingsLayer.setLayer(jButton5Abort, javax.swing.JLayeredPane.DEFAULT_LAYER);

        jButton3Settings.setText("Settings");
        jButton3Settings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3SettingsMouseClicked(evt);
            }
        });

        jButton2Hide.setText("Hide");
        jButton2Hide.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2HideMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jFrontLayer)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton3Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2Hide, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSeparator4)
                    .addContainerGap()))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jSettingsLayer)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2Hide, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3Settings, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFrontLayer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(54, 54, 54)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(243, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(52, 52, 52)
                    .addComponent(jSettingsLayer)
                    .addContainerGap()))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3SettingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3SettingsMouseClicked
        appLogic.viewElemStateChange.viewLayersActions.put(ViewTypeE.SETTINGS, ElementActionE.SHOW);
        appLogic.viewElemStateChange.viewLayersActions.put(ViewTypeE.FRONT, ElementActionE.HIDE);
        appLogic.viewElemStateChange.dynamicVElemsActions.put(DynamicViewElementE.BTN_SETTINGS, ElementActionE.HIDE);
        appLogic.notifyViews();
    }//GEN-LAST:event_jButton3SettingsMouseClicked

    private void jButton2HideMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2HideMouseClicked
        appLogic.changeDisplayingApp(false);
        appLogic.viewElemStateChange.viewLayersActions.put(ViewTypeE.APPLICATION, ElementActionE.HIDE);
        appLogic.notifyViews();
    }//GEN-LAST:event_jButton2HideMouseClicked

    private void jButton4ApplyMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4ApplyMouseClicked
        appLogic.appSettings.applySettings();
        appLogic.viewElemStateChange.viewLayersActions.put(ViewTypeE.SETTINGS, ElementActionE.HIDE);
        appLogic.viewElemStateChange.viewLayersActions.put(ViewTypeE.FRONT, ElementActionE.SHOW);
        appLogic.viewElemStateChange.dynamicVElemsActions.put(DynamicViewElementE.BTN_SETTINGS, ElementActionE.SHOW);
        appLogic.notifyViews();
    }//GEN-LAST:event_jButton4ApplyMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        appLogic = new BusinessLogic();
        View.setModel(appLogic);
        
        Map<ViewTypeE, View> appViewsMap = new HashMap<>();
        appViewsMap.put(ViewTypeE.APPLICATION, new ViewApplication());
        appViewsMap.put(ViewTypeE.FRONT, new ViewFront());
        appViewsMap.put(ViewTypeE.TOP_BAR, new ViewTopBar());
        appViewsMap.put(ViewTypeE.SETTINGS, new ViewSettings());
        
        Set set = appViewsMap.entrySet();
        Iterator it = set.iterator();
        while(it.hasNext()) {
            Map.Entry me = (Map.Entry)it.next();
            appLogic.addView((View)me.getValue());
        }
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
            java.util.logging.Logger.getLogger(WordsJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WordsJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WordsJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WordsJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dialog = new WordsJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup fromLanguageGroup;
    private javax.swing.JButton jButton1Approve;
    private javax.swing.JButton jButton1Approve1;
    private javax.swing.JButton jButton2Hide;
    public static javax.swing.JButton jButton3Settings;
    private javax.swing.JButton jButton4Apply;
    private javax.swing.JButton jButton5Abort;
    public static javax.swing.JCheckBox jCheckBox1HideAfterSuccess;
    public static javax.swing.JLayeredPane jFrontLayer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12GuessWord;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3Solutions;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5MissedWords;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7IncorrectWords;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    public static javax.swing.JRadioButton jRadioButton1Polish;
    public static javax.swing.JRadioButton jRadioButton2English;
    public static javax.swing.JRadioButton jRadioButton3Random;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    public static javax.swing.JLayeredPane jSettingsLayer;
    private javax.swing.JTextField jTextField1UserTranslation;
    public static javax.swing.JTextField jTextField2SuspendTime;
    // End of variables declaration//GEN-END:variables
}
