
package proyecto_u2;

import LibProU2.Fis;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Fisica extends JFrame implements ActionListener {
    JLabel tit1,tit2; 
    
    JButton btnaltp,btndfpa,btntp;
    JButton btnvi,btndfca,btnvf;
    
    JLabel ima1,ima2;
    ImageIcon imapro= new ImageIcon("C:\\Users\\Acer\\Downloads\\tipa.png");
    ImageIcon imaca= new ImageIcon("C:\\Users\\Acer\\Downloads\\ca.png");
    
    Fis f=new Fis();
    public Fisica(){
        super("Fisica");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(900,700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.CYAN);

        tit1=new JLabel("Tiro Parabolico");
        tit1.setBounds(325,50,250,50);//x,y,ancho, alto
        tit1.setFont(new Font("bodoni mt black",Font.PLAIN,30));
        ima1=new JLabel(imapro);
        ima1.setBounds(50,110,300,210); 
        btnaltp=new JButton("Altura Maxima");
        btnaltp.setBounds(375, 200, 150, 30);
        btnaltp.setBackground(Color.white);
        btndfpa=new JButton("Distancia Final");
        btndfpa.setBounds(550, 200, 150, 30);
        btndfpa.setBackground(Color.white);
        btntp=new JButton("Tiempo");
        btntp.setBounds(725, 200, 150, 30);
        btntp.setBackground(Color.white);
        
        tit2=new JLabel("Caida Libre");
        tit2.setBounds(350,350,200,50);//x,y,ancho, alto
        tit2.setFont(new Font("bodoni mt black",Font.PLAIN,30));
        ima2=new JLabel(imaca);
        ima2.setBounds(550,350,300,320); 
        btnvi=new JButton("Tiempo");
        btnvi.setBounds(25, 495, 150, 30);
        btnvi.setBackground(Color.white);
        btndfca=new JButton("Altura");
        btndfca.setBounds(200, 495, 150, 30);
        btndfca.setBackground(Color.white);
        btnvf=new JButton("Velocidad Final");
        btnvf.setBounds(375, 495, 150, 30);
        btnvf.setBackground(Color.white);
        
        
        this.add(tit1);
        this.add(ima1);
        this.add(btnaltp);
        this.add(btndfpa);
        this.add(btntp);
        this.add(tit2);
        this.add(ima2);
        this.add(btnvi);
        this.add(btndfca);
        this.add(btnvf);
        
        
        btnaltp.addActionListener(this);
        btndfpa.addActionListener(this);
        btntp.addActionListener(this);
        btnvi.addActionListener(this);
        btndfca.addActionListener(this);
        btnvf.addActionListener(this); 
    }
    
         public void actionPerformed(ActionEvent ev){
        
        //devuelve una referencia al objeto donde se genero el evento
       Object objeto=ev.getSource();
       if(objeto instanceof JButton){//si se pulso el boton

         if (objeto==btnaltp){
           double vi=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad inicial del tiro(m/s)"));
           double ang=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el angulo del tiro"));
           
          JOptionPane.showMessageDialog(null, "La altura maxima que alcanzara el proyectil es: "+f.alturapa(vi,ang)+" m");
         }
         else if(objeto==btndfpa){
           double vi=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad inicial del tiro(m/s)"));
           double t=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el angulo del tiro"));
           
          JOptionPane.showMessageDialog(null, "La distancia donde caera el proyectil es: "+f.disFinpa(vi,t)+" m");

         }
         else if(objeto==btntp){
           double vi=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad inicial del tiro(m/s)"));
           double ang=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el angulo del tiro"));

           JOptionPane.showMessageDialog(null, "La tiempo que el proyectil tardara en caer"
                   + " es: "+f.tiempotp(vi,ang)+" s");
         }
         else if(objeto==btnvi){
           
           double h=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la altura desde la cual el objeto cayo"));
           
           
           JOptionPane.showMessageDialog(null, "El tiempo que tarda el objeto en caer"
                   + " es: "+f.tiempoca(h)+" s");
           
         }else if(objeto==btndfca){
           
           
           double t=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo que el objeto tarda en caer(s)"));
           
           
           
           JOptionPane.showMessageDialog(null, "La altura de la cual cayo el objeto es"
                   + " es: "+f.altura(0,t));
         }
             else if(objeto==btnvf){
           double vi=Double.parseDouble(JOptionPane.showInputDialog("Ingrese la velocidad inicial del objeto(m/s)"));
           double t=Double.parseDouble(JOptionPane.showInputDialog("Ingrese el tiempo que el objeto tarda en caer(s)"));
           
           
           
           JOptionPane.showMessageDialog(null, "La velocidad final con la que cayo el objeto es"
                   + " es: "+f.velFin(vi,t));
         }
         }
         }
}
     


