/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_u2;

/**
 *
 * @author Acer
 */
public class MenuP extends javax.swing.JFrame {
    
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JButton jButton5;
    public javax.swing.JButton jButton6;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JLabel jLabel2;
    public javax.swing.JLabel jLabel3;
    public javax.swing.JPanel jPanel1;
        public MenuP() {
//        initComponents();
        setSize(595,610);
        setLocationRelativeTo(null);
        
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102), 4));
        jPanel1.setLayout(null);

       // jButton1.setBackground(new java.awt.Color(255, 255, 255));
        //jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("C:\\Users\\Acer\\Downloads\\fotos\\Quejas.png"))); // NOI18N
        //jButton1.setBorder(null);
        //jButton1.setBorderPainted(false);
        jButton1.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("C:\\Users\\Acer\\Downloads\\fotos\\Quejas1.png"))); // NOI18N
        jPanel1.add(jButton1);
        jButton1.setBounds(150, 430, 310, 50);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("C:\\Users\\Acer\\Downloads\\fotos\\Evalua.png"))); // NOI18N
        jButton2.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("C:\\Users\\Acer\\Downloads\\fotos\\Evalua1.png"))); // NOI18N
        jPanel1.add(jButton2);
        jButton2.setBounds(150, 500, 310, 60);

        jButton3.setBackground(new java.awt.Color(255, 255, 255));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("C:\\Users\\Acer\\Downloads\\fotos\\Hora.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("C:\\Users\\Acer\\Downloads\\fotos\\Hora1.png"))); // NOI18N
        jPanel1.add(jButton3);
        jButton3.setBounds(150, 240, 310, 50);

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("C:\\Users\\Acer\\Downloads\\fotos\\Calen.png"))); // NOI18N
        jButton4.setBorder(null);
        jButton4.setBorderPainted(false);
        jButton4.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("C:\\Users\\Acer\\Downloads\\fotos\\Calen1.png"))); // NOI18N
        jPanel1.add(jButton4);
        jButton4.setBounds(150, 300, 310, 50);

        jButton5.setBackground(new java.awt.Color(255, 255, 255));
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("C:\\Users\\Acer\\Downloads\\fotos\\Biblio.png"))); // NOI18N
        jButton5.setBorder(null);
        jButton5.setBorderPainted(false);
        jButton5.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("C:\\Users\\Acer\\Downloads\\fotos\\Biblio1.png"))); // NOI18N
        jPanel1.add(jButton5);
        jButton5.setBounds(150, 360, 310, 50);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 102));
        jLabel1.setText("Seleccione una opción:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(210, 120, 220, 29);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 25)); // NOI18N
        jLabel2.setText("¡ B I E N V E N I D O  A L U M N O !");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(100, 80, 430, 29);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("C:\\Users\\Acer\\Downloads\\fotos\\sep1.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(10, 10, 160, 60);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("C:\\Users\\Acer\\Downloads\\fotos\\Calif.png"))); // NOI18N
        jButton6.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("C:\\Users\\Acer\\Downloads\\fotos\\Calif1.png"))); // NOI18N
        jPanel1.add(jButton6);
        jButton6.setBounds(150, 170, 310, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 580, 570);
    }
        
        public static void main(String[] args) {
        MenuP obj=new MenuP();
               obj.setVisible(true);
    }
}
