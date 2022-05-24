
package proyecto_u2;

import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import javax.swing.*;
import LibProU2.MatDisc;

public class MatDis extends JFrame implements ActionListener  {
    
    JLabel tit,tits;
    
    JLabel ns,nss,nr,nrr,nm,nmm,nd,ndd;
    JLabel sis,sir,sim,sid;
    JLabel ra1,ra2,ra3,ra4;
    JLabel res1,res2,res3,res4;
    JLabel nd1,nd2,nd3,nd4,nd5,nd6,nd7,nd8;
    JButton btnsu,btnres,btnmul,btndiv;
    
    //ssegunda parte
    JLabel ttabla,p,q,ope,resul;
    JComboBox cp,cq,cope;
    JButton agre,resu;
    
    String [] pp={"Seleccione una opción","El numero 2 es par","El cuadrado tiene 3 lados","Hoy es miercoles","Estamos en marzo"
            + "","El numero 11 no es primo","Tengo 20 años"};
    String [] opee={"Seleccione el operador"," ^ "," v "," -> "," <--> "};
    String [] qq={"Seleccione una opción","El numero 3 es impar ","El triangulo tiene 3 lados","El numero 11 es par","Mañana es"
            + " jueves","El proximo mes es Abril","Naci en el 2000"};
    
    
    MatDisc md= new MatDisc();
    public MatDis(){
        super("Matematicas Discretas");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(900,700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        this.getContentPane().setBackground(Color.CYAN);

        tit=new JLabel("Operaciones con Numeros Binarios");
        tit.setBounds(175,20,550,50);//x,y,ancho, alto
        tit.setFont(new Font("arial",Font.PLAIN,35));   
        tits=new JLabel("Seleccione la operacion que desee realizar");
        tits.setBounds(250,100,400,50);//x,y,ancho, alto
        tits.setFont(new Font("arial",Font.PLAIN,20));
        btnsu=new JButton("Suma");
        btnsu.setBounds(60, 200, 150, 30);   
        btnsu.setBackground(Color.white);
        btnres=new JButton("Resta");
        btnres.setBounds(270, 200, 150, 30);  
        btnres.setBackground(Color.white);
        btnmul=new JButton("Multiplicación");
        btnmul.setBounds(480, 200, 150, 30);   
        btnmul.setBackground(Color.white);
        btndiv=new JButton("Division");
        btndiv.setBounds(690, 200, 150, 30); 
        btndiv.setBackground(Color.white);
        nd1=new JLabel("");
        nd2=new JLabel("");
        nd3=new JLabel("");
        nd4=new JLabel("");
        nd5=new JLabel("");
        nd6=new JLabel("");
        nd7=new JLabel("");
        nd8=new JLabel("");
        ns=new JLabel("");
        nss=new JLabel("");
        nr=new JLabel("");
        nrr=new JLabel("");
        nm=new JLabel("");
        nmm=new JLabel("");
        nd=new JLabel("");
        ndd=new JLabel("");
        sis=new JLabel("");
        sir=new JLabel("");
        sim=new JLabel("");
        sid=new JLabel("");
        ra1=new JLabel("");
        ra2=new JLabel("");
        ra3=new JLabel("");
        ra4=new JLabel("");
        res1=new JLabel("");
        res2=new JLabel("");
        res3=new JLabel("");
        res4=new JLabel("");
        
        //segunda parte
        ttabla=new JLabel("Tablas de Verdad");
        ttabla.setBounds(300,370,300,50);//x,y,ancho, alto
        ttabla.setFont(new Font("arial",Font.PLAIN,35)); 
        p=new JLabel("p");
        p.setBounds(180,440,50,30);//x,y,ancho, alto
        p.setFont(new Font("arial",Font.PLAIN,20)); 
        ope=new JLabel("Operador");
        ope.setBounds(410,440,100,30);//x,y,ancho, alto
        ope.setFont(new Font("arial",Font.PLAIN,20)); 
        q=new JLabel("q");
        q.setBounds(710,440,50,30);//x,y,ancho, alto
        q.setFont(new Font("arial",Font.PLAIN,20)); 
        cp=new JComboBox(pp);
        cp.setBounds(85,470,200,30);
        cope=new JComboBox(opee);
        cope.setBounds(370,470,160,30);
        cq=new JComboBox(qq);
        cq.setBounds(615,470,200,30);
        resul=new JLabel("");
        resul.setBounds(85,520,730,30);//x,y,ancho, alto
        resul.setBorder(BorderFactory.createLineBorder (Color.black));
        resul.setBackground(Color.WHITE);
        resul.setOpaque(true);
        agre=new JButton("Agregar");
        agre.setBounds(200, 570, 150, 30);
        agre.setBackground(Color.white);
        resu=new JButton("Resultado");
        resu.setBounds(550, 570, 150, 30);
        resu.setBackground(Color.white);
        
        this.add(resu);
        this.add(agre);
        this.add(cp);
        this.add(cope);
        this.add(cq);
        this.add(p);
        this.add(ope);
        this.add(q);
        this.add(resul);
        this.add(ttabla);
        this.add(tit);
        this.add(tits);
        this.add(btnsu);
        this.add(btnres);
        this.add(btnmul);
        this.add(btndiv);
        this.add(nd1);
        this.add(nd2);
        this.add(nd3);
        this.add(nd4);
        this.add(nd5);
        this.add(nd6);
        this.add(nd7);
        this.add(nd8);  
        this.add(ns);
        this.add(nss);
        this.add(nr);
        this.add(nrr);
        this.add(nm);
        this.add(nmm);
        this.add(nd);
        this.add(ndd);
        this.add(sis);
        this.add(sir);
        this.add(sid);
        this.add(sim);
        this.add(ra1);
        this.add(ra2);
        this.add(ra3);
        this.add(ra4);
        this.add(res1);
        this.add(res2);
        this.add(res3);
        this.add(res4);
        
        btnres.addActionListener(this);
        btnsu.addActionListener(this);
        btnmul.addActionListener(this);
        btndiv.addActionListener(this);
        resu.addActionListener(this);
        agre.addActionListener(this);
    }
    
     public void actionPerformed(ActionEvent ev){
        
        //devuelve una referencia al objeto donde se genero el evento
       Object objeto=ev.getSource();
       if(objeto instanceof JButton){//si se pulso el boton

         if (objeto==btnsu){
           int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer sumando"));
           int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo sumando"));
           
           int resu=num1+num2;
           
           String bin1=md.Binario(num1);
           String bin2=md.Binario(num2);
           String binr=md.Binario(resu);
           
           nd1.setText("Primer Sumando: "+num1);
           nd1.setBounds(60, 240, 150, 30); 
           nd2.setText("Segundo Sumando: "+num2);
           nd2.setBounds(60, 270,150, 30); 
           
           ns.setText(bin1);
           ns.setBounds(90, 310, 150, 30); 
           sis.setText("+");
           sis.setBounds(70, 320, 150, 30);
           nss.setText(bin2);
           nss.setBounds(90, 330,150, 30); 
           ra1.setText("_______________");
           ra1.setBounds(90, 330,150, 30);
           res1.setText(binr);
           res1.setBounds(90, 345,150, 30);
           
            
         }else if (objeto==btnres){
           int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el minuendo"));
           int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el sustraendo"));
           
           int resu=num1-num2;
           
           String bin1=md.Binario(num1);
           String bin2=md.Binario(num2);
           String binr=md.Binario(resu);
           
           nd3.setText("Minuendo: "+num1);
           nd3.setBounds(270, 240, 150, 30); 
           nd4.setText("Sustraendo: "+num2);
           nd4.setBounds(270, 270,150, 30); 
           
           nr.setText(bin1);
           nr.setBounds(300, 310, 150, 30); 
           sir.setText("-");
           sir.setBounds(280, 320, 150, 30);
           nrr.setText(bin2);
           nrr.setBounds(300, 330,150, 30); 
           ra2.setText("_______________");
           ra2.setBounds(300, 330,150, 30);
           res2.setText(binr);
           res2.setBounds(300, 345,150, 30);
           
         }else if(objeto==btnmul){
           int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer factor"));
           int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo factor"));
           
           int resu=num1*num2;
           
           String binr=md.Binario(resu);
           String bin1=md.Binario(num1);
           String bin2=md.Binario(num2);
           
           nd5.setText("Primer Factor: "+num1);
           nd5.setBounds(480, 240, 150, 30); 
           nd6.setText("Segundo Factor: "+num2);
           nd6.setBounds(480, 270,150, 30); 

           nm.setText(bin1);
           nm.setBounds(510, 310, 150, 30); 
           sim.setText("*");
           sim.setBounds(490, 320, 150, 30);
           nmm.setText(bin2);
           nmm.setBounds(510, 330,150, 30); 
           ra3.setText("_______________");
           ra3.setBounds(510, 330,150, 30);
           res3.setText(binr);
           res3.setBounds(510, 345,150, 30);

         }else if(objeto==btndiv){
           int num1=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el dividendo"));
           int num2=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el divisor"));
           
           int resu=num1/num2;
           
           String bin1=md.Binario(num1);
           String bin2=md.Binario(num2);
           String binr=md.Binario(resu);
           
           nd7.setText("Dividendo: "+num1);
           nd7.setBounds(690, 240, 150, 30); 
           nd8.setText("Divisor: "+num2);
           nd8.setBounds(690, 270,150, 30); 
           
           nd.setText(bin1);
           nd.setBounds(720, 310, 150, 30); 
           sid.setText("/");
           sid.setBounds(700, 320, 150, 30);
           ndd.setText(bin2);
           ndd.setBounds(720, 330,150, 30); 
           ra4.setText("_______________");
           ra4.setBounds(720, 330,150, 30);
           res4.setText(binr);
           res4.setBounds(720, 345,150, 30);
           
         }else if(objeto==agre){
             int a=0,b=0,c=0;
             String p1=(String) cp.getSelectedItem();
             String op1=(String) cope.getSelectedItem();
             String q1=(String) cq.getSelectedItem();
             
             int copp=cp.getSelectedIndex();
             int copq=cq.getSelectedIndex();
             
             if(op1.equals(" ^ ")){
                 resul.setText(p1+" y "+q1);
                 c=3;
             }else if(op1.equals(" v ")){
                 resul.setText(p1+" o "+q1);
                 c=4;
             } else if(op1.equals(" -> ")){
                 resul.setText("Si "+p1+" entonces "+q1);
                 c=5;
             }else if(op1.equals(" <--> ")){
                 resul.setText(p1+" si y solo si "+q1);
                 c=6;
             }

             
         }else if(objeto==resu){
                          int a=0,b=0,c=0;
             String p1=(String) cp.getSelectedItem();
             String op1=(String) cope.getSelectedItem();
             String q1=(String) cq.getSelectedItem();
             
             int copp=cp.getSelectedIndex();
             int copq=cq.getSelectedIndex();
             
             if(op1.equals(" ^ ")){
             
                 c=3;
             }else if(op1.equals(" v ")){
                 
                 c=4;
             } else if(op1.equals(" -> ")){
                
                 c=5;
             }else if(op1.equals(" <--> ")){
                
                 c=6;
             }
             
             if(copp==1){
               a=1;  
             }if(copp==2){
              a=0;
             }if(copp==3){
               a=1;  
             }if(copp==4){
               a=1;  
             }if(copp==5){
               a=0;  
             }if(copp==6){
               a=1;  
             }
             if(copq==1){
              b=1;
             }if(copq==2){
              b=1;
             }if(copq==3){
              b=0;
             }if(copq==4){
              b=1;
             }if(copq==5){
              b=1;
             }if(copq==6){
              b=1;
             }
             
             boolean resta= md.tablaVer(a,b,c);
             
             if(resta==true){
                 resul.setText("");
                 resul.setText("Verdadero");
             }else if(resta==false){
                 resul.setText("");
                 resul.setText("Falso");
             }
         }
         
     }
}
     

}


