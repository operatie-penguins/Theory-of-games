package funcallarc;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Graphics;

public class AppFuncAllArc extends JApplet {
  int ds=6;

  Panel_paint drawpanel = new Panel_paint();
  Panel_paint2 drawpanel2 = new Panel_paint2();
  Panel_paint3 drawpanel3 = new Panel_paint3();
  Panel_paint4 drawpanel4 = new Panel_paint4();
  Color color1=new Color(100,100,200);
  Color color2=new Color(100,200,100);
  Font FontText=new java.awt.Font("Dialog",1,12);
  Color ColorText=new Color(0,0,80);
  JLabel label_tit=new JLabel();
  JLabel label_title=new JLabel();
  JLabel label_uz=new JLabel();
  JLabel label_gi=new JLabel();
  JLabel label_o=new JLabel();
  JLabel label_r=new JLabel();
  JLabel label_a=new JLabel();
  JLabel label_b=new JLabel();
  JLabel a=new JLabel();
  JLabel b=new JLabel();


  JButton button=new JButton("Обновить");
  JButton button1=new JButton("<=");
  JButton button2=new JButton("=>");
  int za=1,zb=1,za2=1,zb2=1,za3=1,zb3=1,za4=1,zb4=1;
  int f1=0,f2=0,f3=0,f4=0,step=0,st=0;
  int[] mass= new int[3];
  int[] mass1=new int[3];

//------------------------------------------------------------------------------
  /**Initialize the applet*/
  public void init() {
  Graphics gr=drawpanel.getGraphics();
  gr.setFont(new java.awt.Font("SansSerif", 1, 14));
  FontMetrics F=gr.getFontMetrics();
  String s="Идея поиска минимума функции методом Флетчера-Ривса";
  if (F.stringWidth(s)<=430){ds=12;}
                       else {ds=10;}
  Stringer.font1=new Font("Dialog", 1, ds);
  Stringer.Lab_v=new Font("Dialog", 1, ds);
  Stringer.Lab_k=new Font("Dialog", 3, ds);
  Stringer.font_lab=new Font("Dialog", 1, ds-2);
  Stringer.fonts[0]=new Font("SansSerif", 1, ds);
  Stringer.fonts[1]=new Font("SansSerif", 1, ds-3);
  Stringer.fonts[2]=new Font("SansSerif", 1, ds-3);

  Stringer.setColor(drawpanel);
  Stringer.setColor(drawpanel2);
  Stringer.setColor(drawpanel3);
  Stringer.setColor(drawpanel4);

  Stringer.setColor(label_title,"title");
  Stringer.setColor(button);
  //Stringer.setColor(button1);
  //Stringer.setColor(button2);
  }
//------------------------------------------------------------------------------
  /**Construct the applet*/
  public AppFuncAllArc() {
   try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
//------------------------------------------------------------------------------
  /**Component initialization*/
  private void jbInit() throws Exception {
  Container cont=getContentPane();
  cont.setLayout(null);
  Stringer.setColor(cont);

  drawpanel.setBounds(15,42,660,160+70-115);

    button1.setEnabled(false);
    button1.setToolTipText("");
    button1.setActionCommand("<=");
    button1.setText("<=");
    cont.add(drawpanel);
  drawpanel2.setBounds(15,167+60+70-115,325,200-40);
  cont.add(drawpanel2);
  drawpanel3.setBounds(365,167+60+70-115,310,200-40);
  cont.add(drawpanel3);
  drawpanel4.setBounds(15,392+60+30-115,660,125);
  cont.add(drawpanel4);
  label_tit.setForeground(new Color(130,0, 80));
  label_tit.setFont(new Font("Dialog", 1, 16));
  label_tit.setBounds(new Rectangle(95, 5, 500, 20));
  label_tit.setText("  Дуэль");
  label_tit.setVerticalAlignment(SwingConstants.TOP);
  label_tit.setHorizontalAlignment(SwingConstants.CENTER);
  cont.add(label_tit);
  label_gi.setForeground(new Color(180,0, 60));
  label_gi.setFont(new Font("Dialog", 3, 12));
  label_gi.setBounds(new Rectangle(15, 147+60+70-115, 500, 20));
  label_gi.setText(" Графическая иллюстрация: ");
  cont.add(label_gi);
  label_uz.setForeground(new Color(180,0, 60));
  label_uz.setFont(new Font("Dialog", 3, 12));
  label_uz.setBounds(new Rectangle(15, 20, 500, 20));
  label_uz.setText(" Условия задачи: ");
  cont.add(label_uz);
  label_o.setForeground(new Color(180,0, 60));
  label_o.setFont(new Font("Dialog", 3, 12));
  label_o.setBounds(new Rectangle(365, 147+60+70-115, 500, 20));
  label_o.setText(" Обозначения: ");
  cont.add(label_o);
  label_r.setForeground(new Color(180,0, 60));
  label_r.setFont(new Font("Dialog", 3, 12));
  label_r.setBounds(new Rectangle(15, 372+60+30-115, 500, 20));
  label_r.setText(" Построение модели: ");
  cont.add(label_r);

  //button1.setForeground(new Color(220,230,255));
  button1.setFont(new Font("Dialog", 1, 14));
  button1.setBackground(new Color(220,230,255));

// button2.setForeground(new Color(220,230, 255));
  button2.setFont(new Font("Dialog", 1, 14));
  button2.setBackground(new Color(220,230,255));
  button.setBounds(new Rectangle(305,620-115,100,23));
  cont.add(button);
  button.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent e) {
     f1=0;f2=0;f3=0;f4=0;st=0;step=0;
     button1.setEnabled(false);
     button2.setEnabled(true);
     repaint();
  }});

  button1.setBounds(new Rectangle(180,620-115,100,23));
   cont.add(button1);
   button1.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent e) {
    f1=0;f2=0;f3=0;f4=0;
    if (st>0)
      st-=1;
    if (st==0)
  button1.setEnabled(false);

  button2.setEnabled(true);
    repaint();
 }});
    button2.setBounds(new Rectangle(430,620-115,100,23));
     cont.add(button2);
     button2.addMouseListener(new MouseAdapter() {
       public void mouseClicked(MouseEvent e) {
        f1=0;f2=0;f3=0;f4=0;
        if(st<16)
         st+=1;
     button1.setEnabled(true);
     if (st==16)
     button2.setEnabled(false);
        repaint();
  }});



  }

//==============================================================================
class  Panel_paint extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Stringer.setGraphics(g);
          g.setColor(ColorText);
          g.setFont(FontText);


        Stringer.drawString("Каждый из двух игроков может произвести один выстрел.  Игроки сходятся с постоянной скоростью.  В ",10,15);
        Stringer.drawString("момент t=0 игроки достаточно далеко друг от друга, ",10,30);

        if (st>0){
          Stringer.drawString(" а в момент t=1 сходятся вплотную.",315,30);
        }
        if (st>1){
          Stringer.drawString("  Задана ",525,30);
      Stringer.drawString("действительная функция \u03b1_{i} на отрезке [0,1], измеряющая меткость игрока i, i=1,2.",10,45);

      //  Stringer.drawString("Выигрыш (игрока 1) равен +1, если первый игрок поражает второго до того, как сам будет поражен;",10,105);
    }
        if (st>2){
        Stringer.drawString(" Значение \u03b1_{i}(t) есть",490,45);
        Stringer.drawString("вероятность того, что игрок i поразит игрока j, если будет стрелять в момент t. Предположим, что \u03b1_{i} не ",10,60);
        Stringer.drawString("убывает, непрерывна и удовлетворяет краевым условиям \u03b1_{i}(0)=0 и \u03b1_{i}(1)=1. ",10,75);
        }
        if (st>3){
        Stringer.drawString("Выигрыш (игрока 1) равен +1, если первый игрок поражает второго до того, как сам будет поражен;",10,90);
        }
        if (st>4){
      //  Stringer.drawString(" -1 в ",600,90);
        Stringer.drawString("-1 в симметричном случае ",10,105);}
        if (st>5){
        Stringer.drawString(" и 0, если ни один не поражен, либо оба поражены одновременно.",165,105);}

}}

  class  Panel_paint2 extends JPanel {
      public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Dialog", 1, 12));
         Stringer.setGraphics(g);
  //______________ ___________________человек________________________________________________


 //  g.setColor(new Color(160,10, 40));
 //   else
   //      g.setColor(Color.DARK_GRAY);

   if(st==0){
      g.setColor(Color.DARK_GRAY);
   g.drawArc(100-40,124,12,12,360,360);
   g.drawLine(106-40,136,106-40,126+20);
   g.drawLine(106-40,146,103-40,158);
   g.drawLine(106-40,146,109-40,158);
   g.drawLine(106-40,138,102-40,144);
   g.drawLine(106-40,138,112-40,138);
g.fillRect(128,154,4,6);

    g.drawLine(111-40,140,112-40,136);
    g.drawLine(110-40,140,111-40,136);
    g.drawLine(112-40,137,120-40,137);
    g.drawLine(112-40,136,120-40,136);

g.setColor(ColorText);
 Stringer.drawString("t = 0",148,50);

g.fillRect(99-40,127-3,6+8,3);
g.fillRect(101-40,120-3,4+6,9);
 }
       if(st==1){
          g.setColor(Color.DARK_GRAY);
  g.drawArc(100+10,124,12,12,360,360);
  g.drawLine(106+10,136,106+10,126+20);
  g.drawLine(106+10,146,103+10,158);
  g.drawLine(106+10,146,109+10,158);
  g.drawLine(106+10,138,102+10,144);
  g.drawLine(106+10,138,112+10,138);

  g.drawLine(111+10,140,112+10,136);
  g.drawLine(110+10,140,111+10,136);
  g.drawLine(112+10,137,120+10,137);
  g.drawLine(112+10,136,120+10,136);

  g.fillRect(128,154,4,6);

 g.fillRect(99+10,127-3,6+8,3);
g.fillRect(101+10,120-3,4+6,9);
  g.setColor(ColorText);
  Stringer.drawString("t = 1",148,50);
}
       if(st==2 || st==3 || st==4 || st==8  || st==10 || st==12 || st==13 || st==14){
   g.setColor(Color.DARK_GRAY);
   if(st==2)
  Stringer.drawString("игрок 1",100-10,110);
    if(st==3)
      Stringer.drawString("\u03b1_{1}(t) = 1",110-20,110);
      if(st==4)
        Stringer.drawString("+ 1",115-15,115);
         g.drawArc(100,124,12,12,360,360);
  g.drawLine(106,136,106,126+20);
  g.drawLine(106,146,103,158);
  g.drawLine(106,146,109,158);
  g.drawLine(106,138,102,144);
  g.drawLine(106,138,112,138);

  g.fillRect(99,127-3,6+8,3);
  g.fillRect(101,120-3,4+6,9);

g.fillRect(128,154,4,6);
  g.drawLine(111,140,112,136);
  g.drawLine(110,140,111,136);
  g.drawLine(112,137,112+8,137);
  g.drawLine(112,136,112+8,136);
  ///////////////////////////////////////////////
  if(st!=2){
     g.setColor(Color.blue);
  g.drawLine(123,135,121,134);
  g.drawLine(121,134,123,133);
  g.drawLine(123,133,121,132);
  g.drawLine(121,132,123,131);
  g.drawLine(123,131,123,129);}
///////////////////////////////////////////////////

  if (st==8){
    g.setColor(ColorText);
    Stringer.drawString("t = x_{i}",148,50);
  }
  if( st==10)
  {g.setColor(Color.DARK_GRAY);
    Stringer.drawString("+ 1",115-15,91);
  Stringer.drawString("\u03b1_{1} (x_{1})(1 - \u03b1_{2} (x_{1}))",75-15,110);
  }
}
      if(st==5 || st==6 || st==11 || st==15){
         g.setColor(Color.DARK_GRAY);
       if(st==5)
         Stringer.drawString("- 1",85,115);
       if(st==6)
         {Stringer.drawString("0",90,77);
        Stringer.drawString("0",90,87+50);}

        g.fillRect(128,154,4,6);
 g.drawArc(90-20,146+2,12,9,360,360);
 g.drawLine(102-20,152+2,110-20,152+2);
 g.drawLine(110-20,152+2,132-20,151+2);
 g.drawLine(110-20,152+2,132-20,154+2);
 g.drawLine(104-20,152+2,114-20,150+2);
 g.drawLine(104-20,152+2,114-20,155+2);

 g.fillRect(99-10-20,123-3+27,3,4+8);
 g.fillRect(91-10-20,125-3+27,9,2+6);


 g.setColor(Color.red);
 g.fillArc(107-20,153,4,4,360,360);
 g.setColor(Color.DARK_GRAY);
 if (st==11){
   Stringer.drawString("- 1",115-20,91);
  Stringer.drawString("\u03b1_{2} (x_{2})(1 - \u03b1_{1} (x_{1}))",75-20,110);
   }

}

       if(st==6){
         g.setColor(ColorText);
      g.drawLine(100,59,210,59);
          Stringer.drawString("или",150,107);
          g.setColor(Color.DARK_GRAY);
        g.drawArc(100+10,24,12,12,360,360);
        g.drawLine(106+10,36,106+10,26+20);
        g.drawLine(106+10,46,103+10,58);
        g.drawLine(106+10,46,109+10,58);
        g.drawLine(106+10,38,102+10,44);
        g.drawLine(106+10,38,112+10,38);

        g.fillRect(99+10,27-3,6+8,3);
        g.fillRect(101+10,20-3,4+6,9);

g.fillRect(128,154,4,6);
g.fillRect(128,54,4,5);
      g.drawLine(101+20,40,102+20,36);
      g.drawLine(100+20,40,101+20,36);
      g.drawLine(102+20,37,102+28,37);
      g.drawLine(102+20,36,102+28,36);
 g.setColor(Color.blue);
      g.drawLine(153-20,35,151-20,34);
      g.drawLine(151-20,34,153-20,33);
      g.drawLine(153-20,33,151-20,32);
      g.drawLine(151-20,32,153-20,31);
      g.drawLine(153-20,31,153-20,29);

       }
      if(st==9){// || st==10){
        g.setColor(ColorText);
         Stringer.drawString("t = 1",148,50);
           g.setColor(Color.DARK_GRAY);
     g.drawArc(100+10,124,12,12,360,360);
     g.drawLine(106+10,136,106+10,126+20);
     g.drawLine(106+10,146,103+10,158);
     g.drawLine(106+10,146,109+10,158);
     g.drawLine(106+10,138,102+10,144);
     g.drawLine(106+10,138,112+10,138);
     g.fillRect(99+10,127-3,6+8,3);
     g.fillRect(101+10,120-3,4+6,9);

g.fillRect(128,154,4,6);
     g.drawLine(111+10,140,112+10,136);
     g.drawLine(110+10,140,111+10,136);
     g.drawLine(112+10,137,112+18,137);
     g.drawLine(112+10,136,112+18,136);
 g.setColor(Color.blue);
  g.drawLine(153-20,135,151-20,134);
  g.drawLine(151-20,134,153-20,133);
  g.drawLine(153-20,133,151-20,132);
  g.drawLine(151-20,132,153-20,131);
  g.drawLine(153-20,131,153-20,129);

   }
if(st==16)
{ g.setColor(ColorText);
//  Stringer.drawString("\u03b1_{1} (t) + \u03b1_{2} (t) = 1",120,80);
  Stringer.drawString("\u03b1_{1} (t) = 1 ",35,110-70);
  Stringer.drawString("\u03b1_{2} (t) = 1",235,110);
    Stringer.drawString("или",8,91);
    g.drawLine(35,88,315-20,88);
  g.setColor(Color.DARK_GRAY);
    g.drawArc(20+80,124-70,12,12,360,360);
    g.drawLine(26+80,136-70,26+80,126+20-70);
    g.drawLine(26+80,146-70,23+80,158-70);
    g.drawLine(26+80,146-70,29+80,158-70);
    g.drawLine(26+80,138-70,22+80,144-70);
    g.drawLine(26+80,138-70,32+80,138-70);

    g.drawLine(31+80,140-70,32+80,136-70);
    g.drawLine(30+80,140-70,31+80,136-70);
    g.drawLine(32+80,137-70,40+80,137-70);
    g.drawLine(32+80,136-70,40+80,136-70);

    g.fillRect(99,27-3+30,6+8,3);
    g.fillRect(101,20-3+30,4+6,9);

 g.setColor(Color.blue);
    g.drawLine(43+80,135-70,41+80,134-70);
    g.drawLine(41+80,134-70,43+80,133-70);
    g.drawLine(43+80,133-70,41+80,132-70);
    g.drawLine(41+80,132-70,43+80,131-70);
    g.drawLine(43+80,131-70,43+80,129-70);

 g.setColor(Color.DARK_GRAY);
g.fillRect(128,83,4,6);
g.fillRect(128,154,4,6);
    g.drawArc(90-20,146+2,12,9,360,360);
     g.drawLine(102-20,152+2,110-20,152+2);
     g.drawLine(110-20,152+2,132-20,151+2);
     g.drawLine(110-20,152+2,132-20,154+2);
     g.drawLine(104-20,152+2,114-20,150+2);
     g.drawLine(104-20,152+2,114-20,155+2);


     g.fillRect(99-10-20,123-3+27,3,4+8);
     g.fillRect(91-10-20,125-3+27,9,2+6);

     g.setColor(Color.red);
     g.fillArc(207-100-20,153,4,4,360,360);


}


//______________________________________________________________________________________________________

   g.setColor(Color.blue);
    //  g.setColor(new Color(160,10, 40));
    //   else
      //      g.setColor(Color.DARK_GRAY);
    if(st==0){

      g.drawArc(100+100+40,124,12,12,360,360);
      g.drawLine(106+100+40,136,106+100+40,126+20);
      g.drawLine(106+100+40,146,103+100+40,158);
      g.drawLine(106+100+40,146,109+100+40,158);
      g.drawLine(106+100+40,138,100+100+40,138);
      g.drawLine(106+100+40,138,110+100+40,144);

      g.drawLine(101+100+40,140,99+100+40,136);
      g.drawLine(100+100+40,140,98+100+40,136);
      g.drawLine(99+92+40,137,99+100+40,137);
      g.drawLine(99+92+40,136,99+100+40,136);
      g.fillRect(183,154,4,6);


 ///////////////////////////////////////////////////////////////////////////////
     mass[0]=252; mass1[0]=118;
     mass[1]=233; mass1[1]=127;
     mass[2]=255; mass1[2]=127;

 g.fillPolygon(mass,mass1,3);
     // g.drawLine(100+100+40-2,124-3+1,100+100+40+9,130+1);
     // g.drawLine(100+100+40-2,124-3+1,100+100+40+14,124-3+1);
     // g.drawLine(100+100+40+9,130+1,100+100+40+14,124-3+1);
     // g.drawLine(100+100+40-2+1,124-2+1,100+100+40+14-1,124-2+1);
     //g.drawLine(100+100+40-2+2,124-1+1,100+100+40+14-2,124-1+1);
     //g.drawLine(100+100+40-2+3,124+1,100+100+40+14-3,124+1);
     //g.drawLine(100+100+40-2+5,125+1,100+100+40+14-2,125+1);
     //g.drawLine(100+100+40-2+7,126+1,100+100+40+14-3,126+1);
     //g.drawLine(100+100+40-2+8,127+1,100+100+40+14-4,127+1);
     //g.drawLine(100+100+40-2+9,128+1,100+100+40+14-5,128+1);
     //g.drawLine(100+100+40-2+10,129+1,100+100+40+14-5,129+1);
////////////////////////////////////////////////////////////////////////////////




    }
     if(st==1){
       g.drawArc(100+70+20,124,12,12,360,360);
      g.drawLine(106+70+20,136,106+70+20,126+20);
      g.drawLine(106+70+20,146,103+70+20,158);
      g.drawLine(106+70+20,146,109+70+20,158);
      g.drawLine(106+70+20,138,100+70+20,138);
      g.drawLine(106+70+20,138,110+70+20,144);

    g.drawLine(101+70+20,140,99+70+20,136);
    g.drawLine(100+70+20,140,98+70+20,136);
    g.drawLine(99+62+20,137,99+70+20,137);
    g.drawLine(99+62+20,136,99+70+20,136);
    g.fillRect(183,154,4,6);




     mass[0]=252-50; mass1[0]=118;
     mass[1]=233-50; mass1[1]=127;
     mass[2]=255-50; mass1[2]=127;

      g.fillPolygon(mass,mass1,3);


     }
    if(st==9){ //|| st==10){
     g.drawArc(100+70+20,124,12,12,360,360);
     g.drawLine(106+70+20,136,106+70+20,126+20);
     g.drawLine(106+70+20,146,103+70+20,158);
     g.drawLine(106+70+20,146,109+70+20,158);
     g.drawLine(106+70+20,138,102+70+20,144);
     g.drawLine(106+70+20,138,110+70+20,144);

   g.drawLine(101+70+20,144,99+70+20,152);
   g.drawLine(100+70+20,144,98+70+20,152);
   g.drawLine(101+70+20,144,104+70+20,143);
   g.drawLine(101+70+20,145,104+70+20,144);

   g.fillRect(183,154,4,6);



     mass[0]=252-50; mass1[0]=118;
     mass[1]=233-50; mass1[1]=127;
     mass[2]=255-50; mass1[2]=127;

      g.fillPolygon(mass,mass1,3);


   }
    if(st==2 || st==5 || st==11 || st==15){
      if(st==2)
    Stringer.drawString("игрок 2",165+15,110);
      if(st==5)
      Stringer.drawString("+ 1",175+15,115);
    g.drawArc(100+80+20,124,12,12,360,360);
    g.drawLine(106+80+20,136,106+80+20,126+20);
    g.drawLine(106+80+20,146,103+80+20,158);
    g.drawLine(106+80+20,146,109+80+20,158);
    g.drawLine(106+80+20,138,100+80+20,138);
    g.drawLine(106+80+20,138,110+80+20,144);

    g.drawLine(101+80+20,140,99+80+20,136);
    g.drawLine(100+80+20,140,98+80+20,136);
    g.drawLine(99+72+20,137,99+80+20,137);
    g.drawLine(99+72+20,136,99+80+20,136);
    g.fillRect(183,154,4,6);


    mass[0]=252-40; mass1[0]=118;
    mass[1]=233-40; mass1[1]=127;
    mass[2]=255-40; mass1[2]=127;

     g.fillPolygon(mass,mass1,3);


    if(st!=2){
  g.drawLine(173-5+20,135,175-5+20,134);
  g.drawLine(175-5+20,134,173-5+20,133);
  g.drawLine(173-5+20,133,175-5+20,132);
  g.drawLine(175-5+20,132,173-5+20,131);
  g.drawLine(173-5+20,131,173-5+20,129);
    }
  }
  if(st==3 || st==4 || st==6  || st==10 ||  st==14){
    if(st==4)
        Stringer.drawString("- 1",202,115);
      if(st==6){
        Stringer.drawString("0",215,77);
        Stringer.drawString("0",215,87+50);}

      g.drawArc(97+110+20,146+2,12,9,360,360);
      g.drawLine(100+100+20,152+2,97+110+20,152+2);
      g.drawLine(100+100+20,152+2,78+100+20,151+2);
      g.drawLine(100+100+20,152+2,78+100+20,154+2);
      g.drawLine(120+100-14+20,152+2,110+100-14+20,150+2);
      g.drawLine(120+100-14+20,152+2,110+100-14+20,155+2);
      g.fillRect(183,154,4,6);

      g.setColor(Color.red);
      g.fillArc(200+20,153,4,4,360,360);
      g.setColor(Color.blue);


       mass[0]=236; mass1[0]=114+30;
       mass[1]=245; mass1[1]=125+30;
       mass[2]=236; mass1[2]=128+30;


      g.fillPolygon(mass,mass1,3);



    }
     if(st==6)
     {
      g.drawArc(100+70+20,24,12,12,360,360);
      g.drawLine(106+70+20,36,106+70+20,26+20);
      g.drawLine(106+70+20,46,103+70+20,58);
      g.drawLine(106+70+20,46,109+70+20,58);
      g.drawLine(106+70+20,38,100+70+20,38);
      g.drawLine(106+70+20,38,110+70+20,44);

      g.drawLine(101+70+20,40,99+70+20,36);
      g.drawLine(100+70+20,40,98+70+20,36);
      g.drawLine(99+62+20,37,99+70+20,37);
      g.drawLine(99+62+20,36,99+70+20,36);
  g.drawLine(163-5+20,35,165-5+20,34);
  g.drawLine(165-5+20,34,163-5+20,33);
  g.drawLine(163-5+20,33,165-5+20,32);
  g.drawLine(165-5+20,32,163-5+20,31);
  g.drawLine(163-5+20,31,163-5+20,29);

g.fillRect(183,154,4,6);
g.fillRect(183,54,4,5);

       //  g.drawLine(100+100-2-10,124-3+1-100,100+100+9-10,130+1-100);
       //  g.drawLine(100+100-2-10,124-3+1-100,100+100+14-10,124-3+1-100);
       //  g.drawLine(100+100+9-10,130+1-100,100+100+14-10,124-3+1-100);
       //  g.drawLine(100+100-2+1-10,124-2+1-100,100+100+14-1-10,124-2+1-100);
       // g.drawLine(100+100-2+2-10,124-1+1-100,100+100+14-2-10,124-1+1-100);
       // g.drawLine(100+100-2+3-10,124+1-100,100+100+14-3-10,124+1-100);
       // g.drawLine(100+100-2+5-10,125+1-100,100+100+14-2-10,125+1-100);
       // g.drawLine(100+100-2+7-10,126+1-100,100+100+14-3-10,126+1-100);
       // g.drawLine(100+100-2+8-10,127+1-100,100+100+14-4-10,127+1-100);
       // g.drawLine(100+100-2+9-10,128+1-100,100+100+14-5-10,128+1-100);
       // g.drawLine(100+100-2+10-10,129+1-100,100+100+14-5-10,129+1-100);

       mass[0]=252-50; mass1[0]=118-100;
       mass[1]=233-50; mass1[1]=127-100;
       mass[2]=255-50; mass1[2]=127-100;

       g.fillPolygon(mass,mass1,3);

     }
     if(st==8 || st==12 || st==13){
        g.drawArc(100+80+20,124,12,12,360,360);
        g.drawLine(106+80+20,136,106+80+20,126+20);
        g.drawLine(106+80+20,146,103+80+20,158);
        g.drawLine(106+80+20,146,109+80+20,158);
        g.drawLine(106+80+20,138,100+80+20,138);
        g.drawLine(106+80+20,138,110+80+20,144);

        g.drawLine(101+80+20,140,99+80+20,136);
        g.drawLine(100+80+20,140,98+80+20,136);
        g.drawLine(99+72+20,137,99+80+20,137);
        g.drawLine(99+72+20,136,99+80+20,136);


        mass[0]=252-40; mass1[0]=118;
        mass[1]=233-40; mass1[1]=127;
        mass[2]=255-40; mass1[2]=127;

      g.fillPolygon(mass,mass1,3);


g.fillRect(183,154,4,6);
     }
if(st==16)
     {g.drawArc(100+90+10,124,12,12,360,360);
    g.drawLine(106+90+10,136,106+90+10,126+20);
    g.drawLine(106+90+10,146,103+90+10,158);
    g.drawLine(106+90+10,146,109+90+10,158);
    g.drawLine(106+90+10,138,100+90+10,138);
    g.drawLine(106+90+10,138,110+90+10,144);

    g.drawLine(101+90+10,140,99+90+10,136);
    g.drawLine(100+90+10,140,98+90+10,136);
    g.drawLine(99+82+10,137,99+90+10,137);
    g.drawLine(99+82+10,136,99+90+10,136);

    g.drawLine(180-2+10,135,182-2+10,134);
    g.drawLine(182-2+10,134,180-2+10,133);
    g.drawLine(180-2+10,133,182-2+10,132);
    g.drawLine(182-2+10,132,180-2+10,131);
    g.drawLine(180-2+10,131,180-2+10,129);






    g.drawArc(97+20+110,146+2-70,12,9,360,360);
    g.drawLine(100+10+110,152+2-70,97+11+110,152+2-70);
    g.drawLine(100+10+110,152+2-70,78+10+110,151+2-70);
    g.drawLine(100+10+110,152+2-70,78+10+110,154+2-70);
    g.drawLine(120+10-14+110,152+2-70,110+10-14+110,150+2-70);
    g.drawLine(120+10-14+110,152+2-70,110+10-14+110,155+2-70);
g.fillRect(183,83,4,6);
g.fillRect(183,154,4,6);
    g.setColor(Color.red);
    g.fillArc(110+110,153-70,4,4,360,360);
  g.setColor(Color.blue);


     mass[0]=252-40; mass1[0]=118;
     mass[1]=233-40; mass1[1]=127;
     mass[2]=255-40; mass1[2]=127;

      g.fillPolygon(mass,mass1,3);




      mass[0]=236; mass1[0]=114-40;
      mass[1]=245; mass1[1]=125-40;
      mass[2]=236; mass1[2]=128-40;

      g.fillPolygon(mass,mass1,3);


            }
 //_________________________________события________________________________________________
         if (st==0 || st==3 || st==4 || st==7)
          g.setColor(Color.DARK_GRAY);
    // g.setColor(new Color(160,10, 40));
    else
          g.setColor(Color.blue);

   //______________________________________________________________________________________________________





      }}
    class  Panel_paint3 extends JPanel {
          public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Stringer.setGraphics(g);
            g.setColor(ColorText);
            g.setFont(FontText);
            g.setColor(Color.DARK_GRAY);
          g.fillArc(10,15-3,6,6,360,360);

            g.setColor(Color.blue);
          g.fillArc(100,15-3,6,6,360,360);

            g.setColor(ColorText);
            g.setFont(FontText);
 Stringer.drawString(" -  игрок 1 ",20,20-3);
 Stringer.drawString(" -  игрок 2 ",110,20-3);
 if (st>2){
   Stringer.drawString("\u03b1_{i} (t) - вероятность того, что игрок  i поразит",10,35-3);
   Stringer.drawString("игрока j, если будет стрелять в момент времени t",10,50-3);
 }

if(st>6){
Stringer.drawString("x_{i} - множество стратегий \u2208 [0, 1]",10,65-3);
}

 if(st>8){
 Stringer.drawString("u_{1} (x_{1}, x_{2}) - нормальная форма игры",10,80-3);
  }

 if(st>9){
 Stringer.drawString("Выйгрышу +1 соответствует вероятность",10,95-3);
 Stringer.drawString("\u03b1_{1} (x_{1})(1 - \u03b1_{2} (x_{1}))",10,110-3);
 }
 if(st>10){
  Stringer.drawString("Выйгрышу -1 соответствует вероятность",10,125-3);
  Stringer.drawString("\u03b1_{2} (x_{2})(1 - \u03b1_{1} (x_{1}))",10,140-3);
  }
if(st>13){
  Stringer.drawString("I = P_{i} (u_{i}) множество осторожных стратегий.",10,155-3);
}
          }}
     class  Panel_paint4 extends JPanel {
         public void paintComponent(Graphics g) {
           super.paintComponent(g);
           Stringer.setGraphics(g);
           g.setColor(ColorText);
           g.setFont(FontText);

              if (st>6 && st<10)
                step=1;
                 if (st>6 && step==1)
              Stringer.drawString("Множества стратегий суть X_{1} = X_{2} = [0, 1]. Стратегия x_{i} игрока i означает:",10,20);
                 if (st>7 && step==1)
              Stringer.drawString("'Я буду стрелять в момент t=x_{i}, если противник не выстрелит раньше.",10,35);
                 if (st>8 && step==1){
              Stringer.drawString(" Если же он выстрелит, но промахнется,",420,35);
              Stringer.drawString("то я для надежности буду стрелять в момент t=1'.    Следовательно, нормальная форма игры имеет вид ",10,50);
              Stringer.drawString(" (X_{1}, X_{2}, u_{1}),   где",10,65);

              Stringer.drawString("u_{1}(x_{1} , x_{2}) = ",236,88);
             // g.setFont(new Font("Dialog", 0, 50));
             // g.setColor(new Color(0, 0, 80));
             // g.drawString("{",300,95);
             // g.setColor(ColorText);
            //  g.setFont(FontText);
            g.drawLine(303,65,308,65);
            g.drawLine(303,65,303,100);
            g.drawLine(303,100,308,100);

              Stringer.drawString(" 2 \u03b1_{1} (x_{1}) - 1,         если x_{1} < x_{2} ,",310,74);
              Stringer.drawString(" \u03b1_{1} (x_{1}) - \u03b1_{2} (x_{1}),   если x_{1} = x_{2} ,",310,87);
              Stringer.drawString(" 1 - 2 \u03b1_{2} (x_{2}),         если x_{2} < x_{1} .",310,100);
             step=2;}
               //if (st>9 && step==1){
             // Stringer.drawString("Например, пусть x_{1} = x_{2}. ",10,117);
              //step=2;
               //}



              if (st>9 && st<14)
                step=2;

                 if (st>9 && step==2){
              Stringer.drawString("Например, пусть x_{1} = x_{2}. Тогда выигрышу +1 соответствует вероятность \u03b1_{1} (x_{1})(1 - \u03b1_{2} (x_{1})), т. е. игрок 1 попал,",10,20);
              Stringer.drawString(" а его противник   промахнулся. ",10,35);
            }
               if (st>10 && step==2)
               { Stringer.drawString("  Выигрышу -1 соответствует вероятность \u03b1_{2} (x_{2})(1 - \u03b1_{1} (x_{1})).",197,35);
                 Stringer.drawString("  Вычислим осторожные стратегии игрока 1. Легко проверить, что для любого x_{1} \u2208 [0, 1]",10,50);
               Stringer.drawString("\u03c6_{1}(x_{1}) = inf u_{1}(x_{1}, x_{2}) = inf (2 \u03b1_{1} (x_{1}) - 1, 1 - 2 \u03b1_{2} (x_{1})).  x_{2} \u2208 [0, 1]",150,65);
               }
               if (st>11 && step==2){
                 Stringer.drawString("Пусть I есть отрезок, принадлежащий [0, 1] (возможно, и точка), определяемый из условия",10,80);
                Stringer.drawString("I = (x_{1} \u2208 [0, 1] | 2 \u03b1_{1} (x_{1}) - 1 = 1 - 2 \u03b1_{2} (x_{1})).",220,95);
               }
               if (st>12 && step==2){
             Stringer.drawString("Функция \u03c6_{1} возрастает до I, постоянна на I и убывает после I.  ",10,110);
        //   Stringer.drawString("осторожных стратегий игрока 1. Гарантированный выигрыш игрока 1 \u03b1_{1} = sup_{x_{1}} inf_{x_{2}} u_{1} есть общее значение",10,128);
         step=3;
         }
                 if (st>13)
                step=3;
                 if (st==14 && step==3) {
                   Stringer.drawString("Поэтому I = P_{1} (u_{1}) является множеством осторожных стратегий игрока 1. Гарантированный выигрыш игрока 1 ",10,20);
           Stringer.drawString("\u03b1_{1} = sup_{x_{1}} inf_{x_{2}} u_{1} есть общее значение функции 2 \u03b1_{1} - 1 и 1 - 2 \u03b1_{2} на  I.",10,35);
               //  Stringer.drawString("функции 2 \u03b1_{1} - 1 и 1 - 2 \u03b1_{2} на  I. ",10, 20);
                 }
                 if (st>15 && step==3){
                   Stringer.drawString("Поэтому I = P_{1} (u_{1}) является множеством осторожных стратегий игрока 1. Гарантированный выигрыш игрока 1 ",10,20);
                   Stringer.drawString("\u03b1_{1} = sup_{x_{1}} inf_{x_{2}} u_{1} есть общее значение функции 2 \u03b1_{1} - 1 и 1 - 2 \u03b1_{2} на  I.",10,35);
               //  Stringer.drawString("функции 2 \u03b1_{1} - 1 и 1 - 2 \u03b1_{2} на  I. ",10, 20);
                 }

                 if(st==15 && step==3){
                   Stringer.drawString("Аналогично можно показать, что I = P_{2} (u_{2}) и гарантированный проигрыш второго игрока равен \u03b1_{1}. ",10, 20);
                   Stringer.drawString("Следовательно,  \u03b1_{1} есть цена игры, а  I - множество оптимальных стратегий для обоих игроков.",10,35);
                 }
             if (st>15 && step==3){
               Stringer.drawString("Аналогично можно показать, что I = P_{2} (u_{2}) и гарантированный проигрыш второго игрока равен \u03b1_{1}. ",10, 50);
            Stringer.drawString("Следовательно,  \u03b1_{1} есть цена игры, а  I - множество оптимальных стратегий для обоих игроков.",10,65);
            //Stringer.drawString("",10,80);
                            }
              if (st>15 && step==3){
              Stringer.drawString("Каждый стреляет оптимально, когда \u03b1_{1} (t) + \u03b1_{2} (t) = 1.",10,80);
              }

           }}


}
