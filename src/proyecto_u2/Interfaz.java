
package proyecto_u2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Interfaz extends JFrame implements ActionListener{
    JLabel tit1,tit2,tit3;
    JLabel lblpro, lblgeoa,lblgeot,lblmat,lblfis;
    JButton btnpro, btngeoa, btngeot, btnmat,btnfis,btn;
    
    ImageIcon imapro= new ImageIcon("C:\\Users\\Acer\\Downloads\\pro.png");
    ImageIcon imageoa= new ImageIcon("C:\\Users\\Acer\\Downloads\\geoa.png");
    ImageIcon imageot= new ImageIcon("C:\\Users\\Acer\\Downloads\\geot.png");
    ImageIcon imamat= new ImageIcon("C:\\Users\\Acer\\Downloads\\mat.png");
    ImageIcon imafis= new ImageIcon("C:\\Users\\Acer\\Downloads\\fisica.png");
    
    public Interfaz(){
        super("Math For Everyone");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(1000,750);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        
        tit1=new JLabel("Math");
        tit1.setBounds(400,200,200,100);//x,y,ancho, alto
        tit2=new JLabel("For");
        tit2.setBounds(430,300,200,100);//x,y,ancho, alto
        tit3=new JLabel("Everyone");
        tit3.setBounds(330,400,400,100);//x,y,ancho, alto
        tit1.setFont(new Font("bodoni mt black",Font.PLAIN,70));
        tit2.setFont(new Font("bodoni mt black",Font.PLAIN,70));
        tit3.setFont(new Font("bodoni mt black",Font.PLAIN,70));
        
        lblpro=new JLabel(imapro);
        lblpro.setBounds(75,100,150,150);        
        btnpro=new JButton("Probabilidad y Estadistica");
        btnpro.setBounds(50,250,200,30);//x,y,ancho, alto
        btnpro.setBackground(Color.white);
        lblgeoa=new JLabel(imageoa);
        lblgeoa.setBounds(75,350,150,140);
        btngeoa=new JButton("Geometria Analitica");
        btngeoa.setBounds(50,500,200,30);//x,y,ancho, alto
        btngeoa.setBackground(Color.white);
        lblgeot=new JLabel(imageot);
        lblgeot.setBounds(425,500,150,150);
        btngeot=new JButton("Geometria y Trigonometria");
        btngeot.setBounds(400,650,200,30);//x,y,ancho, alto
        btngeot.setBackground(Color.white);
         lblmat=new JLabel(imamat);
        lblmat.setBounds(775,100,150,150);
        btnmat=new JButton("Matematicas Discretas");
        btnmat.setBounds(750,250,200,30);//x,y,ancho, alto
        btnmat.setBackground(Color.white);
        lblfis=new JLabel(imafis);
        lblfis.setBounds(775,350,150,150);
        btnfis=new JButton("Fisica");
        btnfis.setBounds(750,500,200,30);//x,y,ancho, alto
        btnfis.setBackground(Color.white);

        
        this.add(tit1);
        this.add(tit2);
        this.add(tit3);
        this.add(lblpro);
        this.add(btnpro);
        this.add(lblgeoa);
        this.add(btngeoa);
        this.add(lblgeot);
        this.add(btngeot);
        this.add(lblmat);
        this.add(btnmat);
        this.add(lblfis);
        this.add(btnfis);

        
        btnpro.addActionListener(this);
        btngeoa.addActionListener(this);
        btngeot.addActionListener(this);
        btnmat.addActionListener(this);
        btnfis.addActionListener(this);
        
        this.getContentPane().setBackground(Color.CYAN);
        
    }
    
     public void actionPerformed(ActionEvent ev){
        
        //devuelve una referencia al objeto donde se genero el evento
       Object objeto=ev.getSource();
       if(objeto instanceof JButton){//si se pulso el boton

         if (objeto==btnpro){
               Proba obj= new Proba();

         }
         else if(objeto==btngeoa){
               GeoA obj= new GeoA();

         }
         else if(objeto==btngeot){
               GeoT obj= new GeoT();




         }
         else if(objeto==btnmat){
               MatDis obj= new MatDis();

         }else if(objeto==btnfis){
               Fisica obj= new Fisica();
         }
             
    
}
     }
}
