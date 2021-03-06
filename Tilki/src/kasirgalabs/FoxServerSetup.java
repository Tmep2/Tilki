package kasirgalabs;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates and open the template
 * in the editor.
 */
/**
 *
 * @author baturay
 */
public class FoxServerSetup extends javax.swing.JFrame {

    private ArrayList<Exam> examList;
    private ArrayList<Exam> examList2;
    private FoxClientUtilities fcu;
    private JLabel jLabel2;
    private String examName;
    private String examDescription;
    private String examKey;
    private Boolean examStatus;
    private File exam;

    /**
     * Creates new form FoxServerSetup
     */
    public FoxServerSetup() {

        this.jLabel2 = new JLabel("sa");
        fcu = new FoxClientUtilities();
        initComponents();

        URL url = getClass().getResource("images/Tilki.png");
        if(url != null) {
            ImageIcon img = new ImageIcon(url);
            setIconImage(img.getImage());
            setLocationRelativeTo(null);
        }
        try {
            examList = fcu.availableExams();
            examList2 = new ArrayList<Exam>(); 
            
            for(int i=0; i< examList.size() ; i++) 
	        		if(!examList.get(i).getExamStatus()) 
	        			examList2.add(examList.get(i));
        
	        for(Exam e: examList2)
	        		examList.remove(e);
            	
            jList6.setModel(new ExamListModel(examList));
            jList7.setModel(new ExamListModel(examList2));
        }
        catch(IOException e) {
            examList = null;
            jList6.setModel(new ExamListModel(examList));
            jLabel19.setText("Ba\u011Flanamad\u0131.");
            jLabel19.setVisible(true);
        }
        catch(ClassNotFoundException e) {
            examList = null;
            jLabel19.setText("Eksik dosya.");
            jLabel19.setVisible(true);
        }
        jTextArea7.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane12 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane13 = new javax.swing.JScrollPane();
        jScrollPane14 = new javax.swing.JScrollPane();
        jList6 = new javax.swing.JList<>();
        jList7 = new javax.swing.JList<>();
        jLabel20 = new javax.swing.JLabel();
        jLabel20_1 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPasswordField1 = new javax.swing.JPasswordField();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Tilki");

        jLabel1.setText("S\u0131nav Ad\u0131");

        jLabel3.setText("G\u00F6zetmen \u015Eifresi");

        jButton7.setText("Yenile");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Durum");
        jLabel2.setVisible(false);

        jTextArea7.setEditable(false);
        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jScrollPane12.setViewportView(jTextArea7);

        jList6.setName("jList1"); // NOI18N
        jList6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList6MouseClicked(evt);
        			jList7.clearSelection();
            }
        });
        
        jList7.setName("jList2"); // NOI18N
        jList7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
            		jList7MouseClicked(evt);
            		jList6.clearSelection();
            }
        });
        
        jScrollPane13.setViewportView(jList6);
        jScrollPane14.setViewportView(jList7);

        jLabel20.setText("Aktif s\u0131navlar");
        jLabel20_1.setText("Pasif s\u0131navlar");


        jLabel21.setText("A\u00E7\u0131klamalar");

        jLabel4.setText("S\u0131nav A\u00E7\u0131klamas\u0131");

        jSeparator2.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jButton1.setText("S\u0131nav Olu\u015Ftur");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("S\u0131nav\u0131 Kald\u0131r");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("D\u00FCzenle");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        
        	jButton8.setText("S\u0131nav Pasif");
        		jButton8.addActionListener(new java.awt.event.ActionListener() {
        			public void actionPerformed(java.awt.event.ActionEvent evt) {
        				jButton8ActionPerformed(evt);
        	            }
        	        });
        		
        	jButton9.setText("S\u0131nav Aktif");
        		jButton9.addActionListener(new java.awt.event.ActionListener() {
        			public void actionPerformed(java.awt.event.ActionEvent evt) {
        				jButton9ActionPerformed(evt);
        				}
        	        });
        

        jRadioButton1.setText("\u015Eifreyi G\u00F6ster");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("<html>S\u0131nav olu\u015Fturmak i\u00E7in sol paneli, var olan <br> bir s\u0131nav\u0131 kald\u0131rmak ya da d\u00FCzenlemek i\u00E7in <br> sa\u011Fa paneli kullanabilirsiniz. </html>");

        jButton4.setText("De\u011Fi\u015Fiklikleri Uygula");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel6.setText("S\u0131nav Olu\u015Fturma Modu");

        jButton5.setText("Vazge\u00E7");
        jButton5.setEnabled(false);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton1)
                    .addComponent(jScrollPane1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jPasswordField1)
                    .addComponent(jTextField1)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addGap(25, 25, 25)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5))
                    .addComponent(jScrollPane13, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane14, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel21, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING,layout.createSequentialGroup()
                    		.addComponent(jButton8))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING,layout.createSequentialGroup()
                    		.addComponent(jButton9))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING,layout.createSequentialGroup()
                    		.addComponent(jLabel20_1))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jRadioButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel20)
                        .addGap(5, 5, 5)
                        .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        		.addComponent(jScrollPane13, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        		.addComponent(jButton8)
                        		.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE))
                        .addComponent(jLabel20_1)
                        .addGap(5, 5, 5)
                        .addComponent(jScrollPane14, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel21)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton5)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton4)))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addComponent(jSeparator2)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        // TODO add your handling code here:
        try {
            examList = fcu.availableExams();
            examList2 = new ArrayList<Exam>();

            for(int i=0; i<examList.size() ; i++)
	        		if(!examList.get(i).getExamStatus()) 
	        			examList2.add(examList.get(i));
            
            for(Exam e : examList2)
            		examList.remove(e);

            jList6.setModel(new ExamListModel(examList));
            jList6.clearSelection();
            jList7.setModel(new ExamListModel(examList2));
            jList7.clearSelection();
            
            jLabel19.setVisible(false);
        }
        catch(IOException e) {
            examList = null;
            examList2 = null;
            jLabel19.setText("Ba\u011Flanamad\u0131.");
            jLabel19.setVisible(true);
        }
        catch(ClassNotFoundException e) {
            examList = null;
            examList2 = null;
            jLabel19.setText("Eksik dosya.");
            jLabel19.setVisible(true);
        }

        jTextArea7.setText("");
    }//GEN-LAST:event_jButton7MouseClicked

    private void jList6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList6MouseClicked
        // TODO add your handling code here:
        int location = jList6.locationToIndex(evt.getPoint());
        if(examList != null && location >= 0) {
            jTextArea7.setText(examList.get(location).getDescription());
        }
    }//GEN-LAST:event_jList6MouseClicked
    
    private void jList7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList7MouseClicked
        // TODO add your handling code here:
        int location = jList7.locationToIndex(evt.getPoint());
        if(examList2 != null && location >= 0) {
            jTextArea7.setText(examList2.get(location).getDescription());
        }
    }//GEN-LAST:event_jList7MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "S\u0131nav\u0131 olu\u015Fturmak istedi\u011Finize emin" +
                " misiniz?", "Tilki", 1);
        if(dialogResult == JOptionPane.YES_OPTION) {
            examName = jTextField1.getText();
            examKey = new String(jPasswordField1.getPassword());
            examDescription = jTextArea1.getText();
            examStatus = true;
            String filePath = new File("").getAbsolutePath();
            exam = new File(examName);
            exam.mkdir();

            try(PrintWriter out = new PrintWriter(new BufferedWriter(
                    new FileWriter(filePath + "/exam_list.txt", true)))) {
                PrintWriter out1 = new PrintWriter(new BufferedWriter(
                        new FileWriter(exam.getAbsolutePath() + "/exam_description.txt",
                        			true)));
                PrintWriter out2 = new PrintWriter(new BufferedWriter(
                        new FileWriter(exam.getAbsolutePath() + "/exam_key.txt",
                                true)));
                PrintWriter out3 = new PrintWriter(new BufferedWriter(
                        new FileWriter(exam.getAbsolutePath() + "/exam_status.txt",
                                true)));
                out.println(examName);
                out1.println(examDescription);
                out2.println(examKey);
                out3.println(examStatus);
                out.close();
                out1.close();
                out2.close();
                out3.close();
                JOptionPane.showMessageDialog(null,
                        "S\u0131nav basar\u0131yla olusturuldu.",
                        "Tilki", 1);
            }
            catch(IOException e) {
                JOptionPane.showMessageDialog(null,
                        "S\u0131nav olu\u015Fturulamad\u0131.",
                        "Tilki", 1);
                System.err.println(e);
            }
            finally {
                jButton7.doClick();
                reset();
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private static boolean deleteDirectory(File directory) {
        if(directory.exists()) {
            File[] files = directory.listFiles();
            if(null != files) {
                for(int i = 0; i < files.length; i++) {
                    if(files[i].isDirectory()) {
                        deleteDirectory(files[i]);
                    }
                    else {
                        files[i].delete();
                    }
                }
            }
        }
        return (directory.delete());
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jList6.getSelectedIndex() < 0) {
            return;
        }
        String lineToRemove = examList.get(jList6.getSelectedIndex()).getName();
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "Se\u00E7ili s\u0131nav\u0131 kald\u0131rmak" + 
                " istedi\u011Finize emin misiniz?", "Tilki", 1);
        exam = new File("");
        if(dialogResult == JOptionPane.YES_OPTION) {
            File file = new File(exam.getAbsolutePath() + "/" + examList.get(jList6.
                    getSelectedIndex()).getName());
            if(deleteDirectory(file)) {
                JOptionPane.showMessageDialog(null,
                        "Silme i\u015Flemi ba\u015Far\u0131l\u0131.",
                        "Tilki", 1);
            }
            else {
                JOptionPane.
                        showMessageDialog(null,
                                "Silme i\u015Flemi ba\u015Far\u0131lamad\u0131."
                                ,"Tilki", 1);
            }
        }
        jButton7.doClick();

        File inputFile = new File(exam.getAbsolutePath() + "/exam_list.txt");
        File tempFile = new File(exam.getAbsolutePath() + "/temp_exam_list" + 
                ".txt");

        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(inputFile));
        }
        catch(FileNotFoundException ex) {
            Logger.getLogger(FoxServerSetup.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter(tempFile));
        }
        catch(IOException ex) {
            Logger.getLogger(FoxServerSetup.class.getName()).log(Level.SEVERE,
                    null, ex);
        }

        String currentLine;

        try {
            while((currentLine = reader.readLine()) != null) {
                // trim newline when comparing with lineToRemove
                String trimmedLine = currentLine.trim();
                if(trimmedLine.equals(lineToRemove)) {
                    continue;
                }
                try {
                    writer.write(currentLine + System.getProperty(
                            "line.separator"));
                }
                catch(IOException ex) {
                    Logger.getLogger(FoxServerSetup.class.getName()).log(
                            Level.SEVERE, null, ex);
                }
            }
        }
        catch(IOException ex) {
            Logger.getLogger(FoxServerSetup.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        try {
            writer.close();
        }
        catch(IOException ex) {
            Logger.getLogger(FoxServerSetup.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        try {
            reader.close();
        }
        catch(IOException ex) {
            Logger.getLogger(FoxServerSetup.class.getName()).log(Level.SEVERE,
                    null, ex);
        }

        boolean successful = tempFile.renameTo(inputFile);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        if(jRadioButton1.isSelected()) {
            jPasswordField1.setEchoChar((char) 0);
        }
        else {
            jPasswordField1.setEchoChar('*');
        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        jButton2.setEnabled(false);
        jLabel3.setText("G\u00F6zetmen \u015Eifresi (\u015Eifre Ekle)");
        jButton5.setEnabled(true);
        jTextField1.setEnabled(false);
        jList6.setEnabled(false);
        jButton4.setEnabled(true);
        jLabel6.setText("S\u0131nav D\u00FCzenleme Modu");
        jButton1.setEnabled(false);
        reset();

        try {
            jTextField1.setText(fcu.availableExams().get(jList6.getSelectedIndex()).
                    getName());
            jTextArea1.setText(fcu.availableExams().get(jList6.getSelectedIndex()).
                    getDescription());
        }
        catch(IOException ex) {
            Logger.getLogger(FoxServerSetup.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
        catch(ClassNotFoundException ex) {
            Logger.getLogger(FoxServerSetup.class.getName()).log(Level.SEVERE,
                    null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton8ActionPerformed
	    	if(jList6.getSelectedIndex() < 0) {
	            return;
	        }
	    
	    	try {
	    	 	exam = new File(examList.get(jList6.getSelectedIndex()).getName() + "/exam_status.txt");
		    	BufferedWriter writer = new BufferedWriter(new FileWriter(exam));
		    writer.write("false");
		    writer.close();

	    	} catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	
//	    	examList.get(jList6.getSelectedIndex()).setExamStatus(false);
	    	examList2.add(examList.get(jList6.getSelectedIndex()));
	    	examList.remove(jList6.getSelectedIndex());
	    	jList6.setModel(new ExamListModel(examList));
	    	jList7.setModel(new ExamListModel(examList2));
	    	
    	}//GEN-LAST:event_jButton8ActionPerformed
    
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) { //GEN-FIRST:event_jButton9ActionPerformed
	    	if(jList7.getSelectedIndex() < 0) {
	            return;
	        }
	    	
	    	try {
	    	 	exam = new File(examList2.get(jList7.getSelectedIndex()).getName() + "/exam_status.txt");
		    	BufferedWriter writer = new BufferedWriter(new FileWriter(exam));
		    writer.write("true");
		    writer.close();

	    	} catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	
	    	examList.add(examList2.get(jList7.getSelectedIndex()));
	    	examList2.remove(jList7.getSelectedIndex());
	    	jList7.setModel(new ExamListModel(examList2));
	    	jList6.setModel(new ExamListModel(examList));
    	
	}//GEN-LAST:event_jButton9ActionPerformed
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        jButton2.setEnabled(true);
        jLabel3.setText("G\u00F6zetmen \u015Eifresi");
        jList6.setEnabled(true);
        reset();
        jButton1.setEnabled(true);
        jButton4.setEnabled(false);
        jLabel6.setText("S\u0131nav Olu\u015Fturma Modu");
        jTextField1.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int dialogResult = JOptionPane.showConfirmDialog(null,
                "De\u011Fi\u015Fiklikleri uygulamak istedi\u011Finize" + 
                " emin misiniz?", "Tilki", 1);
        if(dialogResult == JOptionPane.YES_OPTION) {
            jButton1.setEnabled(true);
            jLabel6.setText("S\u0131nav Olu\u015Fturma Modu");
            jLabel3.setText("G\u00F6zetmen \u015Eifresi");
            jList6.setEnabled(true);
            jTextField1.setEnabled(true);
            jButton5.setEnabled(false);
            jButton2.setEnabled(true);
            String newPas = new String(jPasswordField1.getPassword());
            String newDesc = jTextArea1.getText();
            exam = new File("");

            try {
                PrintWriter out1 = new PrintWriter(new BufferedWriter(
                        new FileWriter(
                                exam.getAbsolutePath() + "/" + jTextField1.
                                getText() + "/exam_key.txt", true)));
                PrintWriter out2 = new PrintWriter(new BufferedWriter(
                        new FileWriter(
                                exam.getAbsolutePath() + "/" + jTextField1.
                                getText() + "/exam_description.txt", false)));
                out1.println(newPas);
                out2.println(newDesc);
                out1.close();
                out2.close();
            }
            catch(IOException ex) {
                Logger.getLogger(FoxServerSetup.class.getName()).log(
                        Level.SEVERE, null, ex);
            }
            jButton7.doClick();
            reset();
        }

    }//GEN-LAST:event_jButton4ActionPerformed

    private void reset() {
        examName = "";
        examDescription = "";
        examKey = "";
        jTextField1.setText("");
        jPasswordField1.setText("");
        jTextArea1.setText("");
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for(javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.
                    getInstalledLookAndFeels()) {
                if("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        }
        catch(ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FoxServerSetup.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch(InstantiationException ex) {
            java.util.logging.Logger.getLogger(FoxServerSetup.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch(IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FoxServerSetup.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        }
        catch(javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FoxServerSetup.class.getName()).
                    log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FoxServerSetup().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel20_1;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList6;
    private javax.swing.JList<String> jList7;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane12;
    private javax.swing.JScrollPane jScrollPane13;
    private javax.swing.JScrollPane jScrollPane14;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
