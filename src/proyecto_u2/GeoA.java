
package proyecto_u2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import LibProU2.*;

public class GeoA extends JFrame implements ActionListener {
   
    
    JLabel tit1,tit2,tit3,pc,sc,x1,y1,x2,y2,resu,resu2,resu3;
    JTextField x11,y11,x22,y22;
    
    JButton res1,res2,res3;
    
    JLabel plano,form,form2,form3;
    ImageIcon imapla= new ImageIcon("C:\\Users\\Acer\\Downloads\\plano.png");
    ImageIcon imafor= new ImageIcon("C:\\Users\\Acer\\Downloads\\fdp.png");
    ImageIcon imafor2= new ImageIcon("C:\\Users\\Acer\\Downloads\\pms3.png");
    ImageIcon imafor3= new ImageIcon("C:\\Users\\Acer\\Downloads\\p2.png");
    
    GeoAn ga= new GeoAn();
    public GeoA(){
        super("Geometria Analitica");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(900,700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.CYAN);

        plano=new JLabel(imapla);
        plano.setBounds(50,70,300,300);
        form=new JLabel(imafor);
        form.setBounds(525,220,200,50);
        form2=new JLabel(imafor2);
        form2.setBounds(562,420,120,100);
        form3=new JLabel(imafor3);
        form3.setBounds(140,470,115,50);
        
        tit1=new JLabel("Distancia Entre Dos Puntos");
        tit1.setBounds(400,170,450,50);//x,y,ancho, alto
        tit1.setFont(new Font("bodoni mt black",Font.PLAIN,30));
        pc=new JLabel("Ingrese Primera Coordenada");
        pc.setBounds(400,50,200,30);//x,y,ancho, alto
        sc=new JLabel("Ingrese Segunda Coordenada");
        sc.setBounds(650,50,200,30);//x,y,ancho, alto
        x1=new JLabel("x1:");
        x1.setBounds(475,100,50,30);//x,y,ancho, alto
        x11=new JTextField();
        x11.setBounds(500,105,20,20);//x,y,ancho, alto
        y1=new JLabel("y1:");
        y1.setBounds(475,130,50,30);//x,y,ancho, alto
        y11=new JTextField();
        y11.setBounds(500,135,20,20);//x,y,ancho, alto
        x2=new JLabel("x2:");
        x2.setBounds(725,100,50,30);//x,y,ancho, alto
        x22=new JTextField();
        x22.setBounds(750,105,20,20);//x,y,ancho, alto
        y2=new JLabel("y2:");
        y2.setBounds(725,130,50,30);//x,y,ancho, alto
        y22=new JTextField();
        y22.setBounds(750,135,20,20);//x,y,ancho, alto
        res1=new JButton("Resultado");
        res1.setBounds(575, 270, 100, 30);
        resu=new JLabel("");
        resu.setBounds(450, 320,450, 30);
        tit2=new JLabel("Punto Medio de un Segmento");
        tit2.setBounds(400,370,450,50);//x,y,ancho, alto
        tit2.setFont(new Font("bodoni mt black",Font.PLAIN,30));
        res2=new JButton("Resultado");
        res2.setBounds(575, 530, 100, 30);
        resu2=new JLabel("");
        resu2.setBounds(450, 580,450, 30);
        tit3=new JLabel("Pendiente de una Recta");
        tit3.setBounds(20,420,450,50);//x,y,ancho, alto
        tit3.setFont(new Font("bodoni mt black",Font.PLAIN,30));
        res3=new JButton("Resultado");
        res3.setBounds(145, 530, 100, 30);
        resu3=new JLabel("");
        resu3.setBounds(20, 580,400, 30);

        this.add(plano);
        this.add(tit1);
        this.add(tit2);
        this.add(form);
        this.add(pc);
        this.add(sc);
        this.add(x1);
        this.add(y1);
        this.add(x2);
        this.add(y2);
        this.add(x11);
        this.add(y11);
        this.add(x22);
        this.add(y22);
        this.add(res1);
        this.add(resu);
        this.add(form2);
        this.add(res2);
        this.add(resu2);
        this.add(tit3);
        this.add(form3);
        this.add(res3);
        this.add(resu3);
        
        res1.addActionListener(this);
        res2.addActionListener(this);
        res3.addActionListener(this);
    }
    
         public void actionPerformed(ActionEvent ev){
        
        //devuelve una referencia al objeto donde se genero el evento
       Object objeto=ev.getSource();
       if(objeto instanceof JButton){//si se pulso el boton

         if (objeto==res1){
             
             
            int x1=Integer.parseInt(x11.getText());
            int y1=Integer.parseInt(y11.getText());
            int x2=Integer.parseInt(x22.getText());
            int y2=Integer.parseInt(y22.getText());
            
            double res=ga.disPuntos(x1,y1,x2,y2);
            
            String resul=String.valueOf(res);
            
            resu.setText("El resultado de la distancia entre la coordenada("+x1+","+y1+") y ("+x2+","+y2+") es "+resul);
            
            
         }
         else if (objeto==res2){
             
             
            int x1=Integer.parseInt(x11.getText());
            int y1=Integer.parseInt(y11.getText());
            int x2=Integer.parseInt(x22.getText());
            int y2=Integer.parseInt(y22.getText());
                                   
            String resul=ga.punMe(x1,y1,x2,y2);
            
            resu2.setText("El punto medio entre la coordenada("+x1+","+y1+") y ("+x2+","+y2+") es "+resul);
            
            
         }
         else if (objeto==res3){
             
             
            int x1=Integer.parseInt(x11.getText());
            int y1=Integer.parseInt(y11.getText());
            int x2=Integer.parseInt(x22.getText());
            int y2=Integer.parseInt(y22.getText());
                                   
            String resul=ga.penRec(x1,y1,x2,y2);
            
            resu3.setText("La pendiente de la recta entre la coordenada("+x1+","+y1+") y ("+x2+","+y2+") es "+resul);
            
            
         }
         
     }
}    
    
}
