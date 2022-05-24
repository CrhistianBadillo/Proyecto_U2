
package proyecto_u2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import LibProU2.GeoTri;

public class GeoT extends JFrame implements ActionListener{
    JLabel lbltri,lblcua,lblrec,lblpen,lblhex,lblrom;
    JLabel bt,at,bc,ac,br,ar,bp,ap,bh,ah,dma,dme;
    JLabel aat,aac,aar,aap,aah,aaro;
    JButton restri,rescua,resrec,respen,reshex,resrom,trig;
    JLabel tit,flecha;
    JTextField basetri,alttri,basecua,altcua,baserec,altrec,basepen,altpen,basehex,althex,baserom,altrom;

    ImageIcon imatri= new ImageIcon("C:\\Users\\Acer\\Downloads\\tri2.png");
    ImageIcon imacua= new ImageIcon("C:\\Users\\Acer\\Downloads\\cua2.png");
    ImageIcon imarec= new ImageIcon("C:\\Users\\Acer\\Downloads\\rec2.png");
    ImageIcon imapen= new ImageIcon("C:\\Users\\Acer\\Downloads\\pen.png");
    ImageIcon imahex= new ImageIcon("C:\\Users\\Acer\\Downloads\\hex.png");
    ImageIcon imarom= new ImageIcon("C:\\Users\\Acer\\Downloads\\rom.png");
    ImageIcon imafle= new ImageIcon("C:\\Users\\Acer\\Downloads\\flecha.png");
    
    GeoTri gt= new GeoTri();
    
    public GeoT(){
        super("Geometria y Trigonometria");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(900,700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);

        
        tit=new JLabel("Geometria");
        tit.setBounds(350,20,200,50);//x,y,ancho, alto
        tit.setFont(new Font("arial",Font.PLAIN,35));
        trig=new JButton(null,imafle);
        trig.setBounds(780,0,100,100);//x,y,ancho, alto
        trig.setBackground(Color.cyan);
        trig.setBorderPainted(false);
        lbltri=new JLabel(imatri);
        lbltri.setBounds(70,100,200,150);//x,y,ancho, alto
        lblcua=new JLabel(imacua);
        lblcua.setBounds(340,100,150,150);//x,y,ancho, alto
        lblrec=new JLabel(imarec);
        lblrec.setBounds(560,100,270,150);//x,y,ancho, alto
        lblpen=new JLabel(imapen);
        lblpen.setBounds(105,400,161,150);//x,y,ancho, alto
        lblhex=new JLabel(imahex);
        lblhex.setBounds(370,400,170,150);//x,y,ancho, alto
        lblrom=new JLabel(imarom);
        lblrom.setBounds(645,400,152,150);//x,y,ancho, alto
        
        bt=new JLabel("Base:");
        bt.setBounds(135,245,50,30);//x,y,ancho, alto
        at=new JLabel("Altura:");
        at.setBounds(135,270,50,30);//x,y,ancho, alto
        basetri=new JTextField();
        basetri.setBounds(185,250,40,20);//x,y,ancho, alto
        alttri=new JTextField();
        alttri.setBounds(185,275,40,20);//x,y,ancho, alto
        aat=new JLabel("");
        aat.setBounds(135,175,100,30);//x,y,ancho, alto
        aat.setFont(new Font("arial",Font.PLAIN,20));
        //cuadrado        
        bc=new JLabel("Base:");
        bc.setBounds(370,245,50,30);//x,y,ancho, alto
        ac=new JLabel("Altura:");
        ac.setBounds(370,270,50,30);//x,y,ancho, alto
        basecua=new JTextField();
        basecua.setBounds(420,250,40,20);//x,y,ancho, alto
        altcua=new JTextField();
        altcua.setBounds(420,275,40,20);//x,y,ancho, alto
        aac=new JLabel("");
        aac.setBounds(380,165,100,30);//x,y,ancho, alto
        aac.setFont(new Font("arial",Font.PLAIN,20));
        //rectangulo
        br=new JLabel("Base:");
        br.setBounds(650,245,50,30);//x,y,ancho, alto
        ar=new JLabel("Altura:");
        ar.setBounds(650,270,50,30);//x,y,ancho, alto
        baserec=new JTextField();
        baserec.setBounds(700,250,40,20);//x,y,ancho, alto
        altrec=new JTextField();
        altrec.setBounds(700,275,40,20);//x,y,ancho, alto
        aar=new JLabel("");
        aar.setBounds(660,165,100,30);//x,y,ancho, alto
        aar.setFont(new Font("arial",Font.PLAIN,20));
        //pentagono
        bp=new JLabel("Lado:");
        bp.setBounds(150,545,50,30);//x,y,ancho, alto
        ap=new JLabel("Apotema:");
        ap.setBounds(130,570,70,30);//x,y,ancho, alto
        basepen=new JTextField();
        basepen.setBounds(200,550,40,20);//x,y,ancho, alto
        altpen=new JTextField();
        altpen.setBounds(200,575,40,20);//x,y,ancho, alto
        aap=new JLabel("");
        aap.setBounds(150,460,100,30);//x,y,ancho, alto
        aap.setFont(new Font("arial",Font.PLAIN,20));
        //hexagono
        bh=new JLabel("Lado:");
        bh.setBounds(420,545,50,30);//x,y,ancho, alto
        ah=new JLabel("Apotema:");
        ah.setBounds(400,570,70,30);//x,y,ancho, alto
        basehex=new JTextField();
        basehex.setBounds(470,550,40,20);//x,y,ancho, alto
        althex=new JTextField();
        althex.setBounds(470,575,40,20);//x,y,ancho, alto
        aah=new JLabel("");
        aah.setBounds(420,460,100,30);//x,y,ancho, alto
        aah.setFont(new Font("arial",Font.PLAIN,20));
        //rombo
        dma=new JLabel("Diagonal Mayor:");
        dma.setBounds(650,545,100,30);//x,y,ancho, alto
        dme=new JLabel("Diagonal Menor:");
        dme.setBounds(650,570,100,30);//x,y,ancho, alto
        baserom=new JTextField();
        baserom.setBounds(750,550,40,20);//x,y,ancho, alto
        altrom=new JTextField();
        altrom.setBounds(750,575,40,20);//x,y,ancho, alto   
        aaro=new JLabel("");
        aaro.setBounds(690,460,100,30);//x,y,ancho, alto
        aaro.setFont(new Font("arial",Font.PLAIN,20));
        
        restri=new JButton("Resultado");
        restri.setBounds(130, 300, 100, 30);
        rescua=new JButton("Resultado");
        rescua.setBounds(365, 300, 100, 30);
        resrec=new JButton("Resultado");
        resrec.setBounds(645, 300, 100, 30);
        respen=new JButton("Resultado");
        respen.setBounds(135, 600, 100, 30);
        reshex=new JButton("Resultado");
        reshex.setBounds(405, 600, 100, 30);
        resrom=new JButton("Resultado");
        resrom.setBounds(670, 600, 100, 30);
        
        this.add(tit);
        this.add(trig);
        this.add(lbltri);
        this.add(lblcua);
        this.add(lblrec);
        this.add(lblpen);
        this.add(lblhex);
        this.add(lblrom);
        this.add(restri);
        this.add(rescua);
        this.add(resrec);
        this.add(respen);
        this.add(reshex);
        this.add(resrom);    
        this.add(alttri);
        this.add(basetri);
        this.add(altcua);
        this.add(basecua);
        this.add(altrec);
        this.add(baserec);
        this.add(altpen);
        this.add(basepen);
        this.add(althex);
        this.add(basehex);
        this.add(altrom);
        this.add(baserom);
        this.add(bt);
        this.add(at);
        this.add(bc);
        this.add(ac);
        this.add(br);
        this.add(ar);
        this.add(bp);
        this.add(ap);
        this.add(bh);
        this.add(ah);
        this.add(dma);
        this.add(dme);
        this.add(aat);
        this.add(aac);
        this.add(aar);
        this.add(aap);
        this.add(aah);
        this.add(aaro);
        
        restri.addActionListener(this);
        rescua.addActionListener(this);
        resrec.addActionListener(this);
        respen.addActionListener(this);
        reshex.addActionListener(this);
        resrom.addActionListener(this);
        trig.addActionListener(this);
        
        this.getContentPane().setBackground(Color.CYAN);
    }
    
    
         public void actionPerformed(ActionEvent ev){
        
        //devuelve una referencia al objeto donde se genero el evento
       Object objeto=ev.getSource();
       if(objeto instanceof JButton){//si se pulso el boton

         if (objeto==restri){
               int a=Integer.parseInt(alttri.getText());
               int b=Integer.parseInt(basetri.getText());
               
               double area=gt.areaTri(a,b);
               String aarea=String.valueOf(area);
               aat.setText("a="+aarea);     

         }
         else if(objeto==rescua){
               int a=Integer.parseInt(altcua.getText());
               int b=Integer.parseInt(basecua.getText());
               
               double area=gt.areaCua(a);
               String aarea=String.valueOf(area);
               aac.setText("a="+aarea);    

         }
         else if(objeto==resrec){
               int a=Integer.parseInt(altrec.getText());
               int b=Integer.parseInt(baserec.getText());
               
               double area=gt.areaRec(a,b);
               String aarea=String.valueOf(area);
               aar.setText("a="+aarea);   

         }
         else if(objeto==respen){
               int a=Integer.parseInt(altpen.getText());
               int b=Integer.parseInt(basepen.getText());
               
               double area=gt.areaPen(a,b);
               String aarea=String.valueOf(area);
               aap.setText("a="+aarea);   

         }else if(objeto==reshex){
               int a=Integer.parseInt(althex.getText());
               int b=Integer.parseInt(basehex.getText());
               
               double area=gt.areaHex(a,b);
               String aarea=String.valueOf(area);
               aah.setText("a="+aarea);   
         
         }else if(objeto==resrom){
               int a=Integer.parseInt(altrom.getText());
               int b=Integer.parseInt(baserom.getText());
               
               double area=gt.areaRom(a,b);
               String aarea=String.valueOf(area);
               aaro.setText("a="+aarea);   
         }else if(objeto==trig){
             Trig obj= new Trig();
         }
             
    
}
     }
    


}
