
package proyecto_u2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import LibProU2.GeoTri;
import static LibProU2.GeoTri.raiz;
public class Trig extends JFrame implements ActionListener{
    
    JLabel tri1,tri2,tri3,tri4,tit;
    JLabel arc,arc2,arc3,arc4;
    JLabel x1,x2,x3,h1,h2,h3;
    JLabel hipo1,ang1,hipo2,ang2,hipo3,ang3;
    JTextField hi1,an1,hi2,an2,hi3,an3;
    JButton res1,res2,res3;
    
    
    ImageIcon imatri= new ImageIcon("C:\\Users\\Acer\\Downloads\\teo.png");
    ImageIcon imaarc= new ImageIcon("C:\\Users\\Acer\\Downloads\\arc4.png");
      ImageIcon imaarc1= new ImageIcon("C:\\Users\\Acer\\Downloads\\cir.png");
   
      
      //parte dos
      JLabel tit2;
      JLabel a,b,x;
      JLabel a2,b2,xx2;
      JButton res4;
      JTextField aa,bb;
      GeoTri gt= new GeoTri();
    
    public Trig(){
        super("Geometria y Trigonometria");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(900,700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
       
        tit=new JLabel("Razones Trigonometricas");
        tit.setBounds(250,20,400,50);//x,y,ancho, alto
        tit.setFont(new Font("arial",Font.PLAIN,35));
        //tringulo 1
        tri1=new JLabel(imatri);
        tri1.setBounds(75,100,200,155);//x,y,ancho, alto
        arc=new JLabel(imaarc);
        arc.setBounds(220,224,25,25);//x,y,ancho, alto
        x1=new JLabel("x");
        x1.setBounds(60,165,25,30);//x,y,ancho, alto
        x1.setFont(new Font("arial",Font.PLAIN,15));
        h1=new JLabel("Hipotenusa");
        h1.setBounds(180,150,100,30);//x,y,ancho, alto
        h1.setFont(new Font("arial",Font.PLAIN,15));
        hipo1=new JLabel("Hipotenusa:");
        hipo1.setBounds(100,260,70,30);//x,y,ancho, alto
        ang1=new JLabel("Angulo:");
        ang1.setBounds(125,290,50,30);//x,y,ancho, alto
        hi1=new JTextField();
        hi1.setBounds(180,265,40,20);//x,y,ancho, alto
        an1=new JTextField();
        an1.setBounds(180,295,40,20);//x,y,ancho, alto
        res1=new JButton("Resultado");
        res1.setBounds(125,320,100,30);
        res1.setBackground(Color.white);
        //tringulo 2
        tri2=new JLabel(imatri);
        tri2.setBounds(350,100,200,155);//x,y,ancho, alto
        arc2=new JLabel(imaarc1);
        arc2.setBounds(360,125,25,25);//x,y,ancho, alto
        x2=new JLabel("C.A");
        x2.setBounds(330,165,25,30);//x,y,ancho, alto
        x2.setFont(new Font("arial",Font.PLAIN,15));
        h2=new JLabel("x");
        h2.setBounds(440,250,100,30);//x,y,ancho, alto
        h2.setFont(new Font("arial",Font.PLAIN,15));
        hipo2=new JLabel("Cateto Adyacente:");
        hipo2.setBounds(340,280,130,30);//x,y,ancho, alto
        ang2=new JLabel("Angulo:");
        ang2.setBounds(400,310,50,30);//x,y,ancho, alto
        hi2=new JTextField();
        hi2.setBounds(450,285,40,20);//x,y,ancho, alto
        an2=new JTextField();
        an2.setBounds(450,315,40,20);//x,y,ancho, alto
        res2=new JButton("Resultado");
        res2.setBounds(400,340,100,30);
        res2.setBackground(Color.white);
        //trinagulo 3
        tri3=new JLabel(imatri);
        tri3.setBounds(625,100,200,155);//x,y,ancho, alto
        arc3=new JLabel(imaarc);
        arc3.setBounds(770,224,25,25);//x,y,ancho, alto
        x3=new JLabel("x");
        x3.setBounds(725,240,25,30);//x,y,ancho, alto
        x3.setFont(new Font("arial",Font.PLAIN,15));
        h3=new JLabel("Hipotenusa");
        h3.setBounds(730,150,100,30);//x,y,ancho, alto
        h3.setFont(new Font("arial",Font.PLAIN,15));
        hipo3=new JLabel("Hipotenusa:");
        hipo3.setBounds(650,260,70,30);//x,y,ancho, alto
        ang3=new JLabel("Angulo:");
        ang3.setBounds(675,290,50,30);//x,y,ancho, alto
        hi3=new JTextField();
        hi3.setBounds(725,265,40,20);//x,y,ancho, alto
        an3=new JTextField();
        an3.setBounds(725,295,40,20);//x,y,ancho, alto
        res3=new JButton("Resultado");
        res3.setBounds(675,320,100,30);
        res3.setBackground(Color.white);
        

        //Segunda parte
        tit2=new JLabel("Teorema de Pitagoras");
        tit2.setBounds(300,400,400,50);//x,y,ancho, alto
        tit2.setFont(new Font("arial",Font.PLAIN,35));
        tri4=new JLabel(imatri);
        tri4.setBounds(200,500,200,155);//x,y,ancho, alto
        a=new JLabel("a");
        a.setFont(new Font("arial",Font.PLAIN,15));
        a.setBounds(180,570,50,30);//x,y,ancho, alto
        b=new JLabel("b");
        b.setFont(new Font("arial",Font.PLAIN,15));
        b.setBounds(300,645,50,30);//x,y,ancho, alto
        x=new JLabel("x");
        x.setFont(new Font("arial",Font.PLAIN,15));
        x.setBounds(310,550,50,30);//x,y,ancho, alto
        a2=new JLabel("Ingrese valor de a");
        a2.setFont(new Font("arial",Font.PLAIN,15));
        a2.setBounds(500,500,200,30);//x,y,ancho, alto
        aa=new JTextField();
        aa.setBounds(500,530,40,20);//x,y,ancho, alto
        b2=new JLabel("Ingrese valor de b");
        b2.setFont(new Font("arial",Font.PLAIN,15));
        b2.setBounds(500,560,200,30);//x,y,ancho, alto
        bb=new JTextField();
        bb.setBounds(500,590,40,20);//x,y,ancho, alto
        xx2=new JLabel("");
        xx2.setFont(new Font("arial",Font.PLAIN,15));
        xx2.setBounds(650,560,200,30);//x,y,ancho, alto
        res4=new JButton("Resultado");
        res4.setBounds(510, 620, 100, 30);
        res4.setBackground(Color.white);
        
        
        this.add(tit2);
        this.add(a);
        this.add(b);
        this.add(x);
        this.add(a2);
        this.add(b2);
        this.add(aa);
        this.add(bb);
        this.add(xx2);
        this.add(res4);
        this.add(tri1);
        this.add(tri2);
        this.add(tri3);
        this.add(tri4);
        this.add(arc);
        this.add(arc2);
        this.add(arc3);
        this.add(x1);
        this.add(h1);
        this.add(hipo1);
        this.add(ang1);
        this.add(hi1);
        this.add(an1);
        this.add(x2);
        this.add(h2);
        this.add(hipo2);
        this.add(ang2);
        this.add(hi2);
        this.add(an2);
        this.add(x3);
        this.add(h3);
        this.add(hipo3);
        this.add(ang3);
        this.add(hi3);
        this.add(an3);
        this.add(res1);
        this.add(res2);
        this.add(res3);
        this.add(tit);
        
        res1.addActionListener(this);
        res2.addActionListener(this);
        res3.addActionListener(this);
        res4.addActionListener(this);
        this.getContentPane().setBackground(Color.CYAN);
        
    }
    
     public void actionPerformed(ActionEvent ev){
        
        //devuelve una referencia al objeto donde se genero el evento
       Object objeto=ev.getSource();
       if(objeto instanceof JButton){//si se pulso el boton

         if (objeto==res1){
               int a=Integer.parseInt(hi1.getText());
               int b=Integer.parseInt(an1.getText());
               
               double seno=gt.seno(b);
               double x=seno* (double) a;
               
               x1.setBounds(10,165,60,30);//x,y,ancho, alto
               x1.setText("x="+x);

         } else if(objeto==res2){
             int a=Integer.parseInt(hi2.getText());
               int b=Integer.parseInt(an2.getText());
               
               double seno=gt.tangente(b);
               double x=seno* (double) a;
               
               h2.setBounds(400,250,100,30);//x,y,ancho, alto
               h2.setText("x="+x);
         
         
                  } else if(objeto==res3){
             int a=Integer.parseInt(hi3.getText());
               int b=Integer.parseInt(an3.getText());
               
               double seno=gt.coseno(b);
               double x=seno* (double) a;
               
               x3.setBounds(700,240,60,30);//x,y,ancho, alto
               x3.setText("x="+x);
         }else if(objeto==res4){
             int a=Integer.parseInt(aa.getText());
               int b=Integer.parseInt(bb.getText());
               
               double x=gt.teoPit(a,b);
               xx2.setText("El resultado de x es: "+x);
             
             
         }
         
             
    
}
     }
    

}
