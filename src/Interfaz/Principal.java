/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import CapaLogica.Materias;
import CapaLogica.Profesores;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author alons
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setSize(680, 460);
        this.setLocationRelativeTo(null);
        Ocultar();
        paneltitulos.setVisible(true);
    }
    
    public void Ocultar(){
        //OBJETOS DE PROFESORES
        panelprofesores.setVisible(false);
        paneltitulos.setVisible(false);
        PanelConsultaProfesores.setVisible(false);
        PanelMaterias.setVisible(false);
        PanelConsultaMaterias.setVisible(false);
        PanelConsultaDosMaterias.setVisible(false);
        PanelConsultaProfesorInfo.setVisible(false);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelprofesores = new javax.swing.JPanel();
        LBidp = new javax.swing.JLabel();
        LBnombrep = new javax.swing.JLabel();
        LBgradop = new javax.swing.JLabel();
        LBsueldop = new javax.swing.JLabel();
        LBtitulop = new javax.swing.JLabel();
        TFidp = new javax.swing.JTextField();
        TFnombrep = new javax.swing.JTextField();
        TFsueldop = new javax.swing.JTextField();
        BTlimpiarp = new javax.swing.JButton();
        BTinsertarp = new javax.swing.JButton();
        BTeliminarp = new javax.swing.JButton();
        TFgradop = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        TFbuscap = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        paneltitulos = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        PanelConsultaProfesores = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaP = new javax.swing.JTable();
        PanelMaterias = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        TFidprom = new javax.swing.JComboBox<>();
        TFidbuscarm = new javax.swing.JTextField();
        TFidm = new javax.swing.JTextField();
        TFnombrem = new javax.swing.JTextField();
        TFcreditosm = new javax.swing.JSpinner();
        BTbuscarm = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        PanelConsultaMaterias = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaM = new javax.swing.JTable();
        PanelConsultaDosMaterias = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaMatDos = new javax.swing.JTable();
        PanelConsultaProfesorInfo = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TableInfo = new javax.swing.JTable();
        menu = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelprofesores.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        panelprofesores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LBidp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBidp.setText("ID DEL PROFESOR");
        panelprofesores.add(LBidp, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        LBnombrep.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBnombrep.setText("NOMBRE ");
        panelprofesores.add(LBnombrep, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, -1));

        LBgradop.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBgradop.setText("GRADO");
        panelprofesores.add(LBgradop, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        LBsueldop.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        LBsueldop.setText("SUELDO");
        panelprofesores.add(LBsueldop, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        LBtitulop.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        LBtitulop.setText("FORMULARIO GENERAL");
        panelprofesores.add(LBtitulop, new org.netbeans.lib.awtextra.AbsoluteConstraints(155, 11, -1, -1));

        TFidp.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TFidp.setMinimumSize(new java.awt.Dimension(200, 28));
        TFidp.setPreferredSize(new java.awt.Dimension(200, 28));
        panelprofesores.add(TFidp, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 170, -1, 40));

        TFnombrep.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TFnombrep.setMinimumSize(new java.awt.Dimension(200, 28));
        TFnombrep.setPreferredSize(new java.awt.Dimension(200, 28));
        panelprofesores.add(TFnombrep, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 220, -1, 40));

        TFsueldop.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TFsueldop.setToolTipText("");
        TFsueldop.setMinimumSize(new java.awt.Dimension(200, 28));
        TFsueldop.setPreferredSize(new java.awt.Dimension(200, 28));
        TFsueldop.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TFsueldopKeyTyped(evt);
            }
        });
        panelprofesores.add(TFsueldop, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 320, -1, 40));

        BTlimpiarp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BTlimpiarp.setText("LIMPIAR");
        BTlimpiarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTlimpiarpActionPerformed(evt);
            }
        });
        panelprofesores.add(BTlimpiarp, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, -1, -1));

        BTinsertarp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BTinsertarp.setText("INSERTAR");
        BTinsertarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTinsertarpActionPerformed(evt);
            }
        });
        panelprofesores.add(BTinsertarp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 240, -1, -1));

        BTeliminarp.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BTeliminarp.setText("ELIMINAR");
        BTeliminarp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTeliminarpActionPerformed(evt);
            }
        });
        panelprofesores.add(BTeliminarp, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 310, -1, -1));

        TFgradop.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TFgradop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Licenciatura", "Maestría", "Doctorado" }));
        TFgradop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFgradopActionPerformed(evt);
            }
        });
        panelprofesores.add(TFgradop, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 200, 40));

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        panelprofesores.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("ID DEL PROFESOR");
        panelprofesores.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        TFbuscap.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        panelprofesores.add(TFbuscap, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 70, 200, 40));
        panelprofesores.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 680, 20));

        getContentPane().add(panelprofesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 380));

        paneltitulos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 48)); // NOI18N
        jLabel1.setText("PACTICA 1.3");
        paneltitulos.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("CLAUDIO ALONSO DOMINGUEZ ROMAN");
        paneltitulos.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, 480, -1));

        getContentPane().add(paneltitulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 380));

        PanelConsultaProfesores.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("CONSULTA GENEREAL ");
        PanelConsultaProfesores.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel5.setText("DE LOS PROFESORES");
        PanelConsultaProfesores.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, -1, 40));

        TablaP.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(TablaP);

        PanelConsultaProfesores.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 630, 170));

        getContentPane().add(PanelConsultaProfesores, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 380));

        PanelMaterias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("FORMULARIO GENERAL");
        PanelMaterias.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("ID DE MATERIA");
        PanelMaterias.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("NOMBRE");
        PanelMaterias.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("CREDITOS");
        PanelMaterias.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("ID FE PROFESOR");
        PanelMaterias.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("ID DE MATERIA");
        PanelMaterias.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 100, -1, -1));
        PanelMaterias.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 142, 680, 20));

        TFidprom.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PanelMaterias.add(TFidprom, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 190, 40));

        TFidbuscarm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PanelMaterias.add(TFidbuscarm, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 90, 190, 40));

        TFidm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TFidm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFidmActionPerformed(evt);
            }
        });
        PanelMaterias.add(TFidm, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 190, 40));

        TFnombrem.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PanelMaterias.add(TFnombrem, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 190, 40));

        TFcreditosm.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        PanelMaterias.add(TFcreditosm, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 50, 40));

        BTbuscarm.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        BTbuscarm.setText("BUSCAR");
        BTbuscarm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTbuscarmActionPerformed(evt);
            }
        });
        PanelMaterias.add(BTbuscarm, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 90, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("LIMPIAR");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        PanelMaterias.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 160, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton3.setText("INSERTAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        PanelMaterias.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton4.setText("ACTUALIZAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        PanelMaterias.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 260, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton5.setText("ELIMINAR");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        PanelMaterias.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, -1, -1));

        getContentPane().add(PanelMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 380));

        PanelConsultaMaterias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel12.setText("CONSULTA GENEREAL ");
        PanelConsultaMaterias.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel13.setText("DE LAS MATERIAS");
        PanelConsultaMaterias.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 40));

        TablaM.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(TablaM);

        PanelConsultaMaterias.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 620, 190));

        getContentPane().add(PanelConsultaMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 380));

        PanelConsultaDosMaterias.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel14.setText("CONSULTA DE LOS PROFESORES ");
        PanelConsultaDosMaterias.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel15.setText("CON DOS O MAS MATERIAS");
        PanelConsultaDosMaterias.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        TablaMatDos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(TablaMatDos);

        PanelConsultaDosMaterias.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, 470, 160));

        getContentPane().add(PanelConsultaDosMaterias, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 380));

        PanelConsultaProfesorInfo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel16.setText("CONSULTA DE LOS PROFESORES ");
        PanelConsultaProfesorInfo.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel17.setText("INFORME DE MATERIAS");
        PanelConsultaProfesorInfo.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 60, -1, -1));

        TableInfo.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(TableInfo);

        PanelConsultaProfesorInfo.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 600, 180));

        getContentPane().add(PanelConsultaProfesorInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 380));

        jMenu1.setText("PROFESORES");

        jMenuItem7.setText("INICIO");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem7);

        jMenuItem1.setText("FORMULARIO");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("CONSULTA PROFESORES");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        menu.add(jMenu1);

        jMenu2.setText("MATERIAS");

        jMenuItem3.setText("FORMULARIO");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("CONSULTA MATERIAS");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        menu.add(jMenu2);

        jMenu3.setText("OTRAS CONSULTA");

        jMenuItem5.setText("PROFESORES CON DOS MATERIAS");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("INFORME DE PROFEESORES Y MATERIAS");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        menu.add(jMenu3);

        setJMenuBar(menu);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
        Ocultar();
        panelprofesores.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        Ocultar();
        PanelConsultaProfesores.setVisible(true);
        Profesores P = new Profesores();
        TablaP = P.ConsultaGeneral(TablaP);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        // TODO add your handling code here:
        Ocultar();
        PanelConsultaMaterias.setVisible(true);
        Materias M = new Materias();
        TablaM = M.ConsultaGeneral(TablaM);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
        Ocultar();
        PanelConsultaDosMaterias.setVisible(true);
        Profesores P = new Profesores();
        TablaMatDos = P.ConsultaMaterias(TablaMatDos);
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // TODO add your handling code here:
        Ocultar();
        PanelConsultaProfesorInfo.setVisible(true);
        Profesores P = new Profesores();
        TableInfo = P.ConsultaInfo(TableInfo);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // TODO add your handling code here:
        Ocultar();
        paneltitulos.setVisible(true);
        
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void BTinsertarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTinsertarpActionPerformed
          // TODO add your handling code here:
        if(TFidp.getText().isEmpty()||TFnombrep.getText().isEmpty()||TFgradop.getItemAt(TFgradop.getSelectedIndex()).isEmpty()|| TFsueldop.getText().isEmpty()){
             JOptionPane.showMessageDialog (null,"ERROR HAY CAMPOS VACIOS");
        }else{
            Profesores P = new Profesores(TFidp.getText(),TFnombrep.getText(),TFgradop.getItemAt(TFgradop.getSelectedIndex()),TFsueldop.getText());
            P.InsertaProfesores(P);
            TFidp.setText("");
            TFnombrep.setText("");
            TFsueldop.setText("");
        }

    }//GEN-LAST:event_BTinsertarpActionPerformed

    private void BTeliminarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTeliminarpActionPerformed
        // TODO add your handling code here:
        Profesores P = new Profesores(TFidp.getText());
        P=P.BuscarProfesores(P);
            if(P.getID_Prof().isEmpty()||P.getNombre().isEmpty() || P.getGrado().isEmpty() ||  String.valueOf(P.getSueldo()).isEmpty() ){
                JOptionPane.showMessageDialog (null,"ERROR REGISTRO NO ENCONTRADO");
            }else{
                int res = JOptionPane.showConfirmDialog(null,"SEGURO DECEA ELIMINAR AL \n PROFESOR CON NOMBRE "+P.getNombre());
                if(res == JOptionPane.YES_OPTION){
                P.EliminaProfesores(P);
                TFidp.setText("");
                TFnombrep.setText("");
                TFsueldop.setText("");
                TFbuscap.setText("");
                }
            }
    }//GEN-LAST:event_BTeliminarpActionPerformed

    private void TFsueldopKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TFsueldopKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
        if(c<'0' || c>'9') evt.consume();
    }//GEN-LAST:event_TFsueldopKeyTyped

    private void BTlimpiarpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTlimpiarpActionPerformed
        // TODO add your handling code here:
        TFidp.setText("");
        TFnombrep.setText("");
        TFsueldop.setText("");
    }//GEN-LAST:event_BTlimpiarpActionPerformed

    private void TFgradopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFgradopActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFgradopActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(TFbuscap.getText().isEmpty()){
            JOptionPane.showMessageDialog (null,"ERROR HAY CAMPO VACIO");
        }else{
            Profesores P = new Profesores(TFbuscap.getText());
            P=P.BuscarProfesores(P);
            if(P.getID_Prof().isEmpty()||P.getNombre().isEmpty() || P.getGrado().isEmpty() ||  String.valueOf(P.getSueldo()).isEmpty() ){
                JOptionPane.showMessageDialog (null,"ERROR REGISTRO NO ENCONTRADO");
            }else{
                TFidp.setText(P.getID_Prof());
                TFnombrep.setText(P.getNombre());   
                TFsueldop.setText(P.getSueldo());
                TFgradop.setSelectedItem(P.getGrado());
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TFidmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFidmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFidmActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Materias M = new Materias(TFidm.getText());
        M=M.BuscarMaterias(M);
            if(M.getID_Mat().isEmpty()||M.getNombre().isEmpty() || M.getCreditos().isEmpty() ||  String.valueOf(M.getID_Prof()).isEmpty() ){
                JOptionPane.showMessageDialog (null,"ERROR REGISTRO NO ENCONTRADO");
            }else{
                int res = JOptionPane.showConfirmDialog(null,"SEGURO DECEA ELIMINAR LA \n MATERIA CON NOMBRE "+M.getNombre());
                if(res == JOptionPane.YES_OPTION){
                M.EliminaMaterias(M);
                TFidm.setText("");
                TFnombrem.setText("");
                TFcreditosm.setValue(1);
                TFidbuscarm.setText("");
                }
            }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        TFidm.setText("");
        TFnombrem.setText("");
        TFcreditosm.setValue(1);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        Ocultar();
        PanelMaterias.setVisible(true);
        TFcreditosm.setValue(1);
        Materias M = new Materias();
        ArrayList<String> Lista = new ArrayList <String>();
        Lista = M.llenar();
        for(int i= 0; i<Lista.size();i++){
            TFidprom.addItem(Lista.get(i));
        }
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(TFidm.getText().isEmpty()||TFnombrem.getText().isEmpty()||TFcreditosm.getValue().equals("")|| TFidprom.getItemAt(TFidprom.getSelectedIndex()).isEmpty()){
             JOptionPane.showMessageDialog (null,"ERROR HAY CAMPOS VACIOS");
        }else{
            Materias M = new Materias(TFidm.getText(),TFnombrem.getText(),String.valueOf(TFcreditosm.getValue()),TFidprom.getItemAt(TFidprom.getSelectedIndex()));
            M.InsertaMaterias(M);
            TFidm.setText("");
            TFnombrem.setText("");
            TFcreditosm.setValue(1);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void BTbuscarmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTbuscarmActionPerformed
        // TODO add your handling code here:
        if(TFidbuscarm.getText().isEmpty()){
            JOptionPane.showMessageDialog (null,"ERROR HAY CAMPO VACIO");
        }else{
            Materias M = new Materias(TFidbuscarm.getText());
            M=M.BuscarMaterias(M);
            if(M.getID_Mat().isEmpty()||M.getNombre().isEmpty() || M.getCreditos().isEmpty() ||  String.valueOf(M.getID_Prof()).isEmpty() ){
                JOptionPane.showMessageDialog (null,"ERROR REGISTRO NO ENCONTRADO");
            }else{
                TFidm.setText(M.getID_Mat());
                TFnombrem.setText(M.getNombre());   
                TFcreditosm.setValue(Integer.parseInt(M.getCreditos()));
                TFidprom.setSelectedItem(M.getID_Prof());
            }
        }
    }//GEN-LAST:event_BTbuscarmActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(TFidm.getText().isEmpty()||TFnombrem.getText().isEmpty()||TFcreditosm.getValue().equals("")||TFidprom.getItemAt(TFidprom.getSelectedIndex()).isEmpty() ){
             JOptionPane.showMessageDialog (null,"ERROR HAY CAMPOS VACIOS");
        }else{
            Materias M = new Materias(TFidbuscarm.getText(),TFnombrem.getText(),String.valueOf(TFcreditosm.getValue()),TFidprom.getItemAt(TFidprom.getSelectedIndex()));
            String newclave = M.ActualizaMaterias(M,TFidm.getText());
            TFidbuscarm.setText(newclave);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTbuscarm;
    private javax.swing.JButton BTeliminarp;
    private javax.swing.JButton BTinsertarp;
    private javax.swing.JButton BTlimpiarp;
    private javax.swing.JLabel LBgradop;
    private javax.swing.JLabel LBidp;
    private javax.swing.JLabel LBnombrep;
    private javax.swing.JLabel LBsueldop;
    private javax.swing.JLabel LBtitulop;
    private javax.swing.JPanel PanelConsultaDosMaterias;
    private javax.swing.JPanel PanelConsultaMaterias;
    private javax.swing.JPanel PanelConsultaProfesorInfo;
    private javax.swing.JPanel PanelConsultaProfesores;
    private javax.swing.JPanel PanelMaterias;
    private javax.swing.JTextField TFbuscap;
    private javax.swing.JSpinner TFcreditosm;
    private javax.swing.JComboBox<String> TFgradop;
    private javax.swing.JTextField TFidbuscarm;
    private javax.swing.JTextField TFidm;
    private javax.swing.JTextField TFidp;
    private javax.swing.JComboBox<String> TFidprom;
    private javax.swing.JTextField TFnombrem;
    private javax.swing.JTextField TFnombrep;
    private javax.swing.JTextField TFsueldop;
    private javax.swing.JTable TablaM;
    private javax.swing.JTable TablaMatDos;
    private javax.swing.JTable TablaP;
    private javax.swing.JTable TableInfo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuBar menu;
    private javax.swing.JPanel panelprofesores;
    private javax.swing.JPanel paneltitulos;
    // End of variables declaration//GEN-END:variables
}
