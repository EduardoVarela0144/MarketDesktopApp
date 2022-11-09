package Interfaz;

import Hilos.HilosFecha;
import static Interfaz.MiniAbastos.produc;
import java.awt.BorderLayout;
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import static Interfaz.Login.lusuarios;
import static Interfaz.Login.rolito;

public class Dashboard extends javax.swing.JFrame {

    int xMouse;
    int yMouse;
    HilosFecha h;
    Connection reg;
    /**
     * Creates new form Dashboard
     */
    public Dashboard() {
        initComponents();
       
          h = new HilosFecha();
        h.recibeJLabel(jLabel6, jLabel17);
        h.start();
        
        
        
        fecha.setText("Hoy es ");
        Inicio p1 = new Inicio();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        Menu = new javax.swing.JPanel();
        btn_prin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_returns = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btn_users = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_books = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btn_reports = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        btn_lends = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        app_name = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        btn_reports1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        Title = new javax.swing.JPanel();
        red_squr = new javax.swing.JPanel();
        exit = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        content = new javax.swing.JPanel();
        Header = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        Background.setBackground(new java.awt.Color(255, 255, 255));
        Background.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Menu.setBackground(new java.awt.Color(47, 45, 46));
        Menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_prin.setBackground(new java.awt.Color(153, 153, 153));
        btn_prin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_prin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_prinMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_prinMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_prinMousePressed(evt);
            }
        });
        btn_prin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/home-outline.png"))); // NOI18N
        btn_prin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Principal");
        btn_prin.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_prin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 270, 50));

        btn_returns.setBackground(new java.awt.Color(153, 153, 153));
        btn_returns.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_returns.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_returns.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_returnsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_returnsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_returnsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_returnsMousePressed(evt);
            }
        });
        btn_returns.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/calendar-multiple-check.png"))); // NOI18N
        btn_returns.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Lista de productos");
        btn_returns.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_returns, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, -1));

        btn_users.setBackground(new java.awt.Color(153, 153, 153));
        btn_users.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_users.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_users.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_usersMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_usersMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_usersMousePressed(evt);
            }
        });
        btn_users.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/account-multiple.png"))); // NOI18N
        btn_users.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Clientes");
        btn_users.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_users, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, -1, -1));

        btn_books.setBackground(new java.awt.Color(153, 153, 153));
        btn_books.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_books.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_books.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_booksMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_booksMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_booksMousePressed(evt);
            }
        });
        btn_books.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/book-open-page-variant.png"))); // NOI18N
        btn_books.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Ventas");
        btn_books.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_books, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, -1, -1));

        btn_reports.setBackground(new java.awt.Color(153, 153, 153));
        btn_reports.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reports.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_reports.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reportsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_reportsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_reportsMousePressed(evt);
            }
        });
        btn_reports.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/file-chart.png"))); // NOI18N
        btn_reports.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Reporte de ventas");
        btn_reports.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_reports, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, -1, -1));

        btn_lends.setBackground(new java.awt.Color(153, 153, 153));
        btn_lends.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_lends.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_lends.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_lendsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_lendsMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_lendsMousePressed(evt);
            }
        });
        btn_lends.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/calendar-plus.png"))); // NOI18N
        btn_lends.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Control de productos");
        btn_lends.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_lends, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 180, -1, -1));

        app_name.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        app_name.setForeground(new java.awt.Color(255, 255, 255));
        app_name.setText("ABARROTES LA SOLEDAD");
        Menu.add(app_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        jSeparator1.setPreferredSize(new java.awt.Dimension(50, 5));
        Menu.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 220, 20));

        btn_reports1.setBackground(new java.awt.Color(153, 153, 153));
        btn_reports1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_reports1.setPreferredSize(new java.awt.Dimension(270, 51));
        btn_reports1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btn_reports1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btn_reports1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btn_reports1MousePressed(evt);
            }
        });
        btn_reports1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/account-multiple.png"))); // NOI18N
        btn_reports1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 30, 30));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Agregar Usuario");
        btn_reports1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, -1, 30));

        Menu.add(btn_reports1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, -1, -1));

        Background.add(Menu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 270, 640));

        Title.setBackground(new java.awt.Color(255, 255, 255));
        Title.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TitleMouseDragged(evt);
            }
        });
        Title.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TitleMousePressed(evt);
            }
        });

        red_squr.setBackground(new java.awt.Color(255, 255, 255));
        red_squr.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        red_squr.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                red_squrMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                red_squrMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                red_squrMousePressed(evt);
            }
        });

        exit.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        exit.setForeground(new java.awt.Color(102, 102, 102));
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                exitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout red_squrLayout = new javax.swing.GroupLayout(red_squr);
        red_squr.setLayout(red_squrLayout);
        red_squrLayout.setHorizontalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        red_squrLayout.setVerticalGroup(
            red_squrLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        fecha.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        fecha.setText("Hoy es ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        jLabel6.setText("Date");

        javax.swing.GroupLayout TitleLayout = new javax.swing.GroupLayout(Title);
        Title.setLayout(TitleLayout);
        TitleLayout.setHorizontalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addGap(278, 278, 278)
                .addComponent(fecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 725, Short.MAX_VALUE)
                .addComponent(red_squr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );
        TitleLayout.setVerticalGroup(
            TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(red_squr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TitleLayout.createSequentialGroup()
                .addGroup(TitleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        Background.add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, -1));

        content.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout contentLayout = new javax.swing.GroupLayout(content);
        content.setLayout(contentLayout);
        contentLayout.setHorizontalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 750, Short.MAX_VALUE)
        );
        contentLayout.setVerticalGroup(
            contentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        Background.add(content, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 170, 750, 430));

        Header.setBackground(new java.awt.Color(47, 45, 46));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Bienvenido");

        jLabel17.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Hora");

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 507, Short.MAX_VALUE)
                .addComponent(jLabel17)
                .addGap(31, 31, 31))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24))
        );

        Background.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 880, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowActivated

    private void TitleMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_TitleMouseDragged

    private void TitleMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TitleMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_TitleMousePressed

    private void exitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMousePressed
        this.dispose();
        Login l = new Login();
        l.setVisible(true);
        
    }//GEN-LAST:event_exitMousePressed

    private void btn_prinMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMousePressed
        setColor(btn_prin);
        resetColor(btn_lends);
        resetColor(btn_returns);
        resetColor(btn_users);
        resetColor(btn_books);
        resetColor(btn_reports);
        // Abrir sección
        Inicio p1 = new Inicio();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
    }//GEN-LAST:event_btn_prinMousePressed

   
    
    private void btn_lendsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lendsMousePressed
        
        Collections.sort(produc, new Comparator<Producto>() {
	@Override
	public int compare(Producto p1, Producto p2) {
		return new Integer(p1.getID()).compareTo(new Integer(p2.getID()));
	}
        });
        
        resetColor(btn_prin);
        setColor(btn_lends);
        resetColor(btn_returns);
        resetColor(btn_users);
        resetColor(btn_books);
        resetColor(btn_reports);
        
        if("Administrador".equals(rolito)){
        
        Agregar_Producto ag = new Agregar_Producto();
        ag.setSize(750, 430);
        ag.setLocation(0,0);
        content.removeAll();
        MiniAbastos.serializarObjetos();
        content.add(ag, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        }
         
        else{
                JOptionPane.showMessageDialog(null, "No tienes permisos de administrador");
                }
        
        
    }//GEN-LAST:event_btn_lendsMousePressed

    private void btn_returnsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnsMousePressed
        resetColor(btn_prin);
        resetColor(btn_lends);
        setColor(btn_returns);
        resetColor(btn_users);
        resetColor(btn_books);
        resetColor(btn_reports);
        
        
        Listar l = new Listar();
        l.setSize(750, 430);
        l.setLocation(0,0);
        
        content.removeAll();
        content.add(l, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
        
        
    }//GEN-LAST:event_btn_returnsMousePressed

    private void btn_usersMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMousePressed
        resetColor(btn_prin);
        resetColor(btn_lends);
        resetColor(btn_returns);
        setColor(btn_users);
        resetColor(btn_books);
        resetColor(btn_reports);
        try{
        if("Administrador".equals(rolito)){
        ImageIcon icon = new ImageIcon(Login.class.getResource("/Imagenes/oaxaca.png"));
      
        
        String answer = null;
        String respuesta = (JOptionPane.showInputDialog(null,"Selecciona el tipo de cliente","Seleccíon de cliente", 
                JOptionPane.PLAIN_MESSAGE,icon,new Object[] { "Selecciona","Empresa", "Público general" },
                "Selecciona")).toString();
        answer = respuesta;
      switch(answer){
             case "Empresa":
           Listar_Clientes_Empresa p1 = new Listar_Clientes_Empresa();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
                
                 break;
             case "Público general":
                 Listar_Clientes_General p2= new Listar_Clientes_General();
        p2.setSize(750, 430);
        p2.setLocation(0,0);
        
        content.removeAll();
        content.add(p2, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
                 break;
             
             
         
         }
        
       
        }
         
        else{
                JOptionPane.showMessageDialog(null, "No tienes permisos de administrador");
                }
        }
        catch(NullPointerException exception){
        
        }
        
        
    }//GEN-LAST:event_btn_usersMousePressed

    private void btn_booksMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_booksMousePressed
        resetColor(btn_prin);
        resetColor(btn_lends);
        resetColor(btn_returns);
        resetColor(btn_users);
        setColor(btn_books);
        resetColor(btn_reports);
        
         
         ImageIcon icon = new ImageIcon(Login.class.getResource("/Imagenes/oaxaca.png"));
      
        try{
        String answer = null;
        String respuesta = (JOptionPane.showInputDialog(null,"Selecciona el tipo de cliente","Seleccíon de cliente", 
                JOptionPane.PLAIN_MESSAGE,icon,new Object[] { "Selecciona","Empresa", "Público general" },
                "Selecciona")).toString();
        answer = respuesta;
      switch(answer){
             case "Empresa":
           venta_empresa p1 = new venta_empresa();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
                
                 break;
             case "Público general":
                 venta_publico p2= new venta_publico();
        p2.setSize(750, 430);
        p2.setLocation(0,0);
        
        content.removeAll();
        content.add(p2, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
                 break;
        
        
    }//GEN-LAST:event_btn_booksMousePressed
        }catch(NullPointerException exception){}
        }
    private void btn_reportsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMousePressed
        resetColor(btn_prin);
        resetColor(btn_lends);
        resetColor(btn_returns);
        resetColor(btn_users);
        resetColor(btn_books);
        setColor(btn_reports);
        // Abrir sección
        /*Reports p1 = new Reports();
        p1.setSize(750, 430);
        p1.setLocation(0,0);
        
        content.removeAll();
        content.add(p1, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();*/
    }//GEN-LAST:event_btn_reportsMousePressed

    private void red_squrMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMousePressed
        System.exit(0);
    }//GEN-LAST:event_red_squrMousePressed

    private void btn_lendsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lendsMouseEntered
        if(btn_lends.getBackground().getRGB() == -15574355)
            setColor(btn_lends);
    }//GEN-LAST:event_btn_lendsMouseEntered

    private void btn_lendsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_lendsMouseExited
        if(btn_prin.getBackground().getRGB() != -15574355 || btn_returns.getBackground().getRGB() != -15574355
            || btn_users.getBackground().getRGB() != -15574355 || btn_books.getBackground().getRGB() != -15574355 || btn_reports.getBackground().getRGB() != -15574355)
            resetColor(btn_lends);
    }//GEN-LAST:event_btn_lendsMouseExited

    private void btn_prinMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMouseEntered
        if(btn_prin.getBackground().getRGB() == -15574355)
            setColor(btn_prin);
    }//GEN-LAST:event_btn_prinMouseEntered

    private void btn_prinMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_prinMouseExited
        if(btn_lends.getBackground().getRGB() != -15574355 || btn_returns.getBackground().getRGB() != -15574355
            || btn_users.getBackground().getRGB() != -15574355 || btn_books.getBackground().getRGB() != -15574355 || btn_reports.getBackground().getRGB() != -15574355)
            resetColor(btn_prin);
    }//GEN-LAST:event_btn_prinMouseExited

    private void btn_returnsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnsMouseEntered
        if(btn_returns.getBackground().getRGB() == -15574355)
            setColor(btn_returns);
    }//GEN-LAST:event_btn_returnsMouseEntered

    private void btn_returnsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnsMouseExited
        if(btn_lends.getBackground().getRGB() != -15574355 || btn_prin.getBackground().getRGB() != -15574355
            || btn_users.getBackground().getRGB() != -15574355 || btn_books.getBackground().getRGB() != -15574355 || btn_reports.getBackground().getRGB() != -15574355)
            resetColor(btn_returns);
    }//GEN-LAST:event_btn_returnsMouseExited

    private void btn_usersMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMouseEntered
        if(btn_users.getBackground().getRGB() == -15574355)
            setColor(btn_users);
    }//GEN-LAST:event_btn_usersMouseEntered

    private void btn_usersMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_usersMouseExited
        if(btn_lends.getBackground().getRGB() != -15574355 || btn_prin.getBackground().getRGB() != -15574355
            || btn_returns.getBackground().getRGB() != -15574355 || btn_books.getBackground().getRGB() != -15574355 || btn_reports.getBackground().getRGB() != -15574355)
            resetColor(btn_users);
    }//GEN-LAST:event_btn_usersMouseExited

    private void btn_booksMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_booksMouseEntered
        if(btn_books.getBackground().getRGB() == -15574355)
            setColor(btn_books);
    }//GEN-LAST:event_btn_booksMouseEntered

    private void btn_booksMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_booksMouseExited
        if(btn_lends.getBackground().getRGB() != -15574355 || btn_prin.getBackground().getRGB() != -15574355
            || btn_returns.getBackground().getRGB() != -15574355 || btn_users.getBackground().getRGB() != -15574355 || btn_reports.getBackground().getRGB() != -15574355)
            resetColor(btn_books);
    }//GEN-LAST:event_btn_booksMouseExited

    private void btn_reportsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMouseEntered
        if(btn_reports.getBackground().getRGB() == -15574355)
            setColor(btn_reports);
    }//GEN-LAST:event_btn_reportsMouseEntered

    private void btn_reportsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reportsMouseExited
        if(btn_lends.getBackground().getRGB() != -15574355 || btn_prin.getBackground().getRGB() != -15574355
            || btn_returns.getBackground().getRGB() != -15574355 || btn_users.getBackground().getRGB() != -15574355 || btn_books.getBackground().getRGB() != -15574355)
            resetColor(btn_reports);
    }//GEN-LAST:event_btn_reportsMouseExited

    private void red_squrMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMouseEntered
        red_squr.setBackground(new Color(204,0,0));
        exit.setForeground(Color.white);
    }//GEN-LAST:event_red_squrMouseEntered

    private void red_squrMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_red_squrMouseExited
        red_squr.setBackground(new Color(255,255,255));
        exit.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_red_squrMouseExited

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered

        red_squr.setBackground(Color.red);
        exit.setForeground(Color.white);
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        red_squr.setBackground(new Color(255,255,255));
        exit.setForeground(new Color(102,102,102));
    }//GEN-LAST:event_exitMouseExited

    private void btn_reports1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reports1MouseEntered
        if(btn_reports1.getBackground().getRGB() == -15574355)
            setColor(btn_reports1);

        // TODO add your handling code here:
    }//GEN-LAST:event_btn_reports1MouseEntered

    private void btn_reports1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reports1MouseExited
        if(btn_lends.getBackground().getRGB() != -15574355 || btn_prin.getBackground().getRGB() != -15574355
            || btn_returns.getBackground().getRGB() != -15574355 || btn_users.getBackground().getRGB() != -15574355 || btn_books.getBackground().getRGB() != -15574355 || btn_reports.getBackground().getRGB() != -15574355 )
            resetColor(btn_reports1);

// TODO add your handling code here:
    }//GEN-LAST:event_btn_reports1MouseExited

    private void btn_reports1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_reports1MousePressed
        resetColor(btn_prin);
        resetColor(btn_lends);
        resetColor(btn_returns);
        resetColor(btn_users);
        resetColor(btn_books);
        resetColor(btn_reports);
        setColor(btn_reports1);
        if("Administrador".equals(rolito)){
         Agregar_Usuario us = new Agregar_Usuario();
        us.setSize(750, 430);
        us.setLocation(0,0);
        content.removeAll();
        MiniAbastos.serializarObjetos();
        content.add(us, BorderLayout.CENTER);
        content.revalidate();
        content.repaint();
       
        }
         
        else{
                JOptionPane.showMessageDialog(null, "No tienes permisos de administrador");
                }
       
// TODO add your handling code here:
    }//GEN-LAST:event_btn_reports1MousePressed

    private void btn_returnsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_returnsMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_returnsMouseClicked

    void setColor(JPanel panel){
        panel.setBackground(new Color(41, 112, 202));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(153, 153, 153));
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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Menu;
    private javax.swing.JPanel Title;
    private javax.swing.JLabel app_name;
    private javax.swing.JPanel btn_books;
    private javax.swing.JPanel btn_lends;
    private javax.swing.JPanel btn_prin;
    private javax.swing.JPanel btn_reports;
    private javax.swing.JPanel btn_reports1;
    private javax.swing.JPanel btn_returns;
    private javax.swing.JPanel btn_users;
    public static javax.swing.JPanel content;
    private javax.swing.JLabel exit;
    private javax.swing.JLabel fecha;
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
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel red_squr;
    // End of variables declaration//GEN-END:variables
}
