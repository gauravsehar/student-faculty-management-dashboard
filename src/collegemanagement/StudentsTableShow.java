/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collegemanagement;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author Gaurav Sehar
 */
public class StudentsTableShow extends javax.swing.JFrame {

    /**
     * Creates new form TableShow
     */
    public StudentsTableShow() {
        initComponents();
        this.getContentPane().setBackground(Color.WHITE);
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        this.setLocation(dim.width/2-this.getSize().width/2, dim.height/2-this.getSize().height/2);    
    }

    boolean isWindowMax = false;
    
    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        entityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("Gaurav_Sehar_CMS?zeroDateTimeBehavior=convertToNullPU").createEntityManager();
        studentsQuery = java.beans.Beans.isDesignTime() ? null : entityManager.createQuery("SELECT s FROM Students s");
        studentsList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : studentsQuery.getResultList();
        MinimizeImg = new javax.swing.JLabel();
        CloseImg = new javax.swing.JLabel();
        RestoreMaximizeImg = new javax.swing.JLabel();
        TitleLabel = new javax.swing.JLabel();
        TableScrollPane = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Students Record Table");
        setIconImage(Toolkit.getDefaultToolkit().getImage(SplashScreen.class.getResource("/default_icons/AppIcon.png")));
        setMinimumSize(new java.awt.Dimension(1280, 720));
        setUndecorated(true);

        MinimizeImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/default_icons/Minimise.png"))); // NOI18N
        MinimizeImg.setMaximumSize(new java.awt.Dimension(20, 25));
        MinimizeImg.setMinimumSize(new java.awt.Dimension(20, 25));
        MinimizeImg.setPreferredSize(new java.awt.Dimension(20, 25));
        MinimizeImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MinimizeImgMouseClicked(evt);
            }
        });

        CloseImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/default_icons/Close.png"))); // NOI18N
        CloseImg.setMaximumSize(new java.awt.Dimension(20, 25));
        CloseImg.setMinimumSize(new java.awt.Dimension(20, 25));
        CloseImg.setPreferredSize(new java.awt.Dimension(20, 25));
        CloseImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CloseImgMouseClicked(evt);
            }
        });

        RestoreMaximizeImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/default_icons/Maximise.png"))); // NOI18N
        RestoreMaximizeImg.setMaximumSize(new java.awt.Dimension(20, 25));
        RestoreMaximizeImg.setMinimumSize(new java.awt.Dimension(20, 25));
        RestoreMaximizeImg.setPreferredSize(new java.awt.Dimension(20, 25));
        RestoreMaximizeImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RestoreMaximizeImgMouseClicked(evt);
            }
        });

        TitleLabel.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        TitleLabel.setText("Students Record Table");

        Table.setAutoCreateRowSorter(true);

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, studentsList, Table);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${enrollmentNo}"));
        columnBinding.setColumnName("Enrollment No");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${name}"));
        columnBinding.setColumnName("Name");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${gender}"));
        columnBinding.setColumnName("Gender");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${dob}"));
        columnBinding.setColumnName("Dob");
        columnBinding.setColumnClass(java.util.Date.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${MOBILENo}"));
        columnBinding.setColumnName("MOBILENo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${email}"));
        columnBinding.setColumnName("Email");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${address}"));
        columnBinding.setColumnName("Address");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${pincode}"));
        columnBinding.setColumnName("Pincode");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${course}"));
        columnBinding.setColumnName("Course");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${MName}"));
        columnBinding.setColumnName("MName");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${MMOBILENo}"));
        columnBinding.setColumnName("MMOBILENo");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${FName}"));
        columnBinding.setColumnName("FName");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${FMOBILENo}"));
        columnBinding.setColumnName("FMOBILENo");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        TableScrollPane.setViewportView(Table);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 1268, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(TitleLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(MinimizeImg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(RestoreMaximizeImg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addComponent(CloseImg, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TitleLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(MinimizeImg, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(RestoreMaximizeImg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CloseImg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(0, 0, 0)
                .addComponent(TableScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 681, Short.MAX_VALUE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MinimizeImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MinimizeImgMouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_MinimizeImgMouseClicked

    private void CloseImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CloseImgMouseClicked
        this.dispose();
    }//GEN-LAST:event_CloseImgMouseClicked

    private void RestoreMaximizeImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RestoreMaximizeImgMouseClicked
        if(!isWindowMax){
            this.setExtendedState( this.getExtendedState()|JFrame.MAXIMIZED_BOTH );
            RestoreMaximizeImg.setIcon(new ImageIcon("src/default_icons/Restore.png"));
            isWindowMax = true;
        }
        else{
            this.setExtendedState(JFrame.NORMAL);
            RestoreMaximizeImg.setIcon(new ImageIcon("src/default_icons/Maximise.png"));
            isWindowMax = false;
        }
        
    }//GEN-LAST:event_RestoreMaximizeImgMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CloseImg;
    private javax.swing.JLabel MinimizeImg;
    private javax.swing.JLabel RestoreMaximizeImg;
    private javax.swing.JTable Table;
    private javax.swing.JScrollPane TableScrollPane;
    private javax.swing.JLabel TitleLabel;
    private javax.persistence.EntityManager entityManager;
    private java.util.List<collegemanagement.Students> studentsList;
    private javax.persistence.Query studentsQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}