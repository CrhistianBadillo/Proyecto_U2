
package proyecto_u2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import LibProU2.ProEst;
import java.util.Random;

public class Proba extends JFrame implements ActionListener {
   //primera parte
    JLabel lbln,lblr,lbln2,lblr2,lblp,lblc,lblFor,lblFor2,lblPer,lblCom,lblnf,lblnf2,lblnb,lblres,lbldiv,lblig,lblig2;
    JLabel lblnb2,lblres2,lbldiv2,lblnbb2;
    JTextField txtn,txtr,txtn2,txtr2;
    JButton btnres, btnres2;
    ImageIcon imapro= new ImageIcon("C:\\Users\\Acer\\Downloads\\For.png");
    ImageIcon imapro2= new ImageIcon("C:\\Users\\Acer\\Downloads\\For2.png");
    
        String nf,nb;
        int n;
        int r;
        int nr;
     //segunda parte
    JLabel lbltit,lbltit2,lblale,lbling,lblmoda,lblpro,lblmed;  
    JButton btnale,btning;
        
     ProEst pro= new ProEst();
    public Proba(){
     super("Probabilidad y Estadistica");
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        this.setSize(600,700);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(false);
        this.setVisible(true);
        
        //primera parte
        lblPer=new JLabel("Permutación");
        lblPer.setBounds(100,10,200,50);//x,y,ancho, alto
        lblPer.setFont(new Font("arial",Font.PLAIN,20));
        lblFor=new JLabel(imapro);
        lblFor.setBounds(50,50,200,100);//x,y,ancho, alto
        txtn=new JTextField();
        txtn.setBounds(55,175,20,20);//x,y,ancho, alto
        lblp=new JLabel("P");
        lblp.setBounds(75,175,20,20);//x,y,ancho, alto
        lblp.setFont(new Font("arial",Font.PLAIN,20));
        txtr=new JTextField();
        txtr.setBounds(90,175,20,20);//x,y,ancho, alto
        btnres=new JButton("Resultado");
        btnres.setBounds(100,250, 100, 30);
        
        lblCom=new JLabel("Combinación");
        lblCom.setBounds(400,10,200,50);//x,y,ancho, alto
        lblCom.setFont(new Font("arial",Font.PLAIN,20));
        lblFor2=new JLabel(imapro2);
        lblFor2.setBounds(350,50,200,100);//x,y,ancho, alto
        txtn2=new JTextField();
        txtn2.setBounds(355,175,20,20);//x,y,ancho, alto
        lblc=new JLabel("C");
        lblc.setBounds(375,175,20,20);//x,y,ancho, alto
        lblc.setFont(new Font("arial",Font.PLAIN,20));
        txtr2=new JTextField();
        txtr2.setBounds(390,175,20,20);//x,y,ancho, alto
        btnres2=new JButton("Resultado");
        btnres2.setBounds(400, 250, 100, 30);
        //Permutacion        
        lblig=new JLabel("=");
        lblig.setBounds(120,175,20,20);//x,y,ancho, alto
        lblig.setFont(new Font("arial",Font.PLAIN,20));
        lblnf=new JLabel("");
        lblnf.setBounds(180,160,20,20);//x,y,ancho, alto
        lbldiv=new JLabel("__________");
        lbldiv.setBounds(150,130,100,100);//x,y,ancho, alto
        lblnb=new JLabel("");
        lblnb.setBounds(180,200,20,20);//x,y,ancho, alto
        lblres=new JLabel("");
        lblres.setBounds(230,175,100,20);//x,y,ancho, alto
        //Combinacion
        lblig2=new JLabel("=");
        lblig2.setBounds(420,175,20,20);//x,y,ancho, alto
        lblig2.setFont(new Font("arial",Font.PLAIN,20));
        lblnf2=new JLabel("");
        lblnf2.setBounds(480,160,20,20);//x,y,ancho, alto
        lbldiv2=new JLabel("__________");
        lbldiv2.setBounds(450,130,100,100);//x,y,ancho, alto
        lblnb2=new JLabel("");
        lblnb2.setBounds(470,200,20,20);//x,y,ancho, alto
        lblnbb2=new JLabel("");
        lblnbb2.setBounds(490,200,20,20);//x,y,ancho, alto
        lblres2=new JLabel("");
        lblres2.setBounds(530,175,100,20);//x,y,ancho, alto
        
        this.add(lblig);
        this.add(lblPer);
        this.add(lblFor);
        this.add(txtn);
        this.add(lblp);
        this.add(txtr);
        this.add(btnres);
        this.add(lblnf);
        this.add(lblnb);
        this.add(lbldiv);
        this.add(lblres);
        
        this.add(lblCom);
        this.add(lblFor2);
        this.add(txtn2);
        this.add(lblc);
        this.add(txtr2);
        this.add(btnres2);
        this.add(lblig2);
        this.add(lbldiv2);
        this.add(lblnf2);
        this.add(lblnb2);
        this.add(lblnbb2);
        this.add(lblres2);
        
        
        btnres.addActionListener(this);
        btnres2.addActionListener(this);
        
        
        
        //Segunda parte
        lbltit=new JLabel("Media Aritmetica, Moda y Mediana en Datos no Agrupados");
        lbltit.setBounds(25,300,550,50);//x,y,ancho, alto
        lbltit.setFont(new Font("arial",Font.PLAIN,20));
        lbltit2=new JLabel("¿Qué desea realizar?");
        lbltit2.setBounds(200,350,200,50);//x,y,ancho, alto
        lbltit2.setFont(new Font("arial",Font.PLAIN,20));
        btnale=new JButton("Generar números");
        btnale.setBounds(100, 400, 150, 30);
        btning=new JButton("Ingresar números");
        btning.setBounds(350, 400, 150, 30);
        lblale=new JLabel("");
        lblale.setBounds(100, 500, 500, 30);
        lbling=new JLabel("");
        lbling.setBounds(100, 600, 500, 30);
        lblpro=new JLabel("");
        lblpro.setBounds(75, 600, 100, 30);
        lblmoda=new JLabel("");
        lblmoda.setBounds(250, 600, 100, 30);
        lblmed=new JLabel("");
        lblmed.setBounds(425, 600, 100, 30);
        
        this.add(lbltit);
        this.add(lbltit2);
        this.add(btnale);
        this.add(btning);
        this.add(lblale);
        this.add(lbling);
        this.add(lblmoda);
        this.add(lblpro);
        this.add(lblmed);
        
        btnale.addActionListener(this);
        btning.addActionListener(this);
        
        
        this.getContentPane().setBackground(Color.CYAN);
    }
    
         public void actionPerformed(ActionEvent ev){
        
        //devuelve una referencia al objeto donde se genero el evento
       Object objeto=ev.getSource();
       if(objeto instanceof JButton){//si se pulso el boton

         if (objeto==btnres){
            int n=Integer.parseInt(txtn.getText());
            String nfac=Integer.toString(n);
            int r=Integer.parseInt(txtr.getText());
            int nr=(n-r);
            String nrfac=Integer.toString(nr);
            int nf=pro.Factorial(n);
            String nfs=Integer.toString(nf);
            int nra=pro.Factorial(nr);
            String nras=Integer.toString(nra);
            int resP=(nf/nra);
            String resps=Integer.toString(resP);
            lblnf.setFont(new Font("arial",Font.PLAIN,20));
            lblnf.setText(nfac+"!");
            lblnb.setFont(new Font("arial",Font.PLAIN,20));
            lblnb.setText(nrfac+"!");
            lblres.setFont(new Font("arial",Font.PLAIN,20));
            lblres.setText("="+resps);
            lblres.setFont(new Font("arial",Font.PLAIN,20));

         }else if (objeto==btnres2){
            int n=Integer.parseInt(txtn2.getText());
            String nfac=Integer.toString(n);
            int r=Integer.parseInt(txtr2.getText());
            int nr=(n-r);
            String nrfac=Integer.toString(nr);
            int nf=pro.Factorial(n);
            String nfs=Integer.toString(nf);
            int nra=pro.Factorial(nr);
            String nras=Integer.toString(nra);
            int nrf=pro.Factorial(r);
            int nmul=(nra*nrf);
            int resP=(nf/nmul);
            String resps=Integer.toString(resP);
            lblnf2.setFont(new Font("arial",Font.PLAIN,20));
            lblnf2.setText(nfac+"!");
            lblnb2.setFont(new Font("arial",Font.PLAIN,20));
            lblnb2.setText(nrfac+"!");
            lblnbb2.setFont(new Font("arial",Font.PLAIN,20));
            lblnbb2.setText(txtr2.getText()+"!");
            lblres2.setFont(new Font("arial",Font.PLAIN,20));
            lblres2.setText("="+resps);
            lblres2.setFont(new Font("arial",Font.PLAIN,20));

         }else if(objeto==btning){
             int can=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos números va a ingresar"));
             int num[]=new int [can];
             String todo="";
        
        for (int x=0;x<can;x++){
            int nume=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero"));
            num[x]=nume;
            todo+=num[x]+" ";
        }
            String ord=pro.Ordenar(num);
            int total=pro.sumaVectores(num);
            int moda=pro.Moda(num);
            double prome=pro.Promedio(total,can);
            String med=pro.Mediana(ord);
            lblale.setText("Numeros: "+todo+"       Numeros ordenados: "+ord);
            lblpro.setText("Promedio: "+prome);
            lblmoda.setText("Moda: "+moda);
            lblmed.setText("Mediana: "+med);

         }else if(objeto==btnale){
             int can=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos números va a generar"));
             int ran=Integer.parseInt(JOptionPane.showInputDialog("Ingrese el rango maximo del numero que generara"));
             Random r= new Random();
               int num[]=new int [can];
               String todo="";
        
            for (int x=0;x<can;x++){
            num[x]=r.nextInt(ran)+1;
            todo+=num[x]+" ";
            }
            
            String ord=pro.Ordenar(num);
            int total=pro.sumaVectores(num);
            double prome=pro.Promedio(total,can);
            int moda=pro.Moda(num);
            String med=pro.Mediana(ord);
            lblale.setText("Numeros: "+todo+"       Numeros ordenados: "+ord);
            lblpro.setText("Promedio: "+prome);
            lblmoda.setText("Moda: "+moda);
            lblmed.setText("Mediana: "+med);
         }
         
     }
}
}
