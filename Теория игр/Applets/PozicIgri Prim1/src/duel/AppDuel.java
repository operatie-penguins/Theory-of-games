package duel;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Graphics;
import javax.swing.border.*;

public class AppDuel extends JApplet {
  int ds=18;

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
  JTextPane txpHelp = new JTextPane();

  JButton button=new JButton("Обновить");
  JButton button1=new JButton("<=");
  JButton button2=new JButton("=>");
  int za=1,zb=1,za2=1,zb2=1,za3=1,zb3=1,za4=1,zb4=1;
  int f1=0,f2=0,f3=0,f4=0,step=0,st=0,pr;
  int[] mass= new int[3];
  int[] mass1=new int[3];
  JCheckBox cbHelp = new JCheckBox();
  TitledBorder titledBorder1;


//------------------------------------------------------------------------------
  /**Initialize the applet*/
  public void init() {
  Graphics gr=drawpanel.getGraphics();
  gr.setFont(new java.awt.Font("SansSerif", 1, 14));
  FontMetrics F=gr.getFontMetrics();
  String s="Идея поиска минимума функции методом Флетчера-Ривса";
  if (F.stringWidth(s)<=430){ds=12;}
                       else {ds=10;}
  Stringer.font1=new Font("Times New Roman", 1, 14);
  Stringer.Lab_v=new Font("Times New Roman", 1, 14);
  Stringer.Lab_k=new Font("Times New Roman", 3, 14);
  Stringer.font_lab=new Font("Arial", 1, 10);
  Stringer.fonts[0]=new Font("Times New Roman", 1, 14);
  Stringer.fonts[1]=new Font("Times New Roman", 1, 14-5);
  Stringer.fonts[2]=new Font("Times New Roman", 1, 14);

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
  public AppDuel() {
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
  titledBorder1 = new TitledBorder("");
    cont.setLayout(null);
  Stringer.setColor(cont);

  drawpanel.setBounds(15,42,660,330);

    button1.setEnabled(false);
    button1.setToolTipText("");
    button1.setActionCommand("<=");
    button1.setText("<=");
    drawpanel.setLayout(null);
      //drawpanel.add(cbHelp,null);
      //drawpanel.add(txpHelp,null);

    txpHelp.setBackground(SystemColor.activeCaptionBorder);
    txpHelp.setFont(new java.awt.Font("Courier New", 1, 11));
    txpHelp.setBorder(BorderFactory.createRaisedBevelBorder());
    cont.add(cbHelp);
    cbHelp.setText("Постановка задачи");
    cbHelp.setBackground(new Color(247,247,255));
    cont.add(drawpanel);
  drawpanel2.setBounds(15,167+60+70-115,325,200-40);
  cont.add(drawpanel2);
  drawpanel3.setBounds(365,167+60+70-115,310,200-40);
  cont.add(drawpanel3);
  drawpanel4.setBounds(15,392+60+30-115+15,660,125-15);
  cont.add(drawpanel4);


  txpHelp.setText("13549684");
  txpHelp.setVisible(false);
  txpHelp.setBounds(new Rectangle(0, 0, 50, 50));
  cbHelp.setVisible(false);
  cbHelp.setFont(new Font("Dialog", 1, 10));
  cbHelp.setBounds(new Rectangle(555, 20, 121, 20));




  label_tit.setForeground(new Color(130,0, 80));
  label_tit.setFont(new Font("Dialog", 1, 16));
  label_tit.setBounds(new Rectangle(95, 5, 500, 20));

  label_tit.setVerticalAlignment(SwingConstants.TOP);
  label_tit.setHorizontalAlignment(SwingConstants.CENTER);
  cont.add(label_tit);
  label_gi.setForeground(new Color(180,0, 60));
  label_gi.setFont(new Font("Dialog", 3, 12));
  label_gi.setBounds(new Rectangle(15, 147+60+70-115, 500, 20));

  cont.add(label_gi);
  label_uz.setForeground(new Color(180,0, 60));
  label_uz.setFont(new Font("Dialog", 3, 12));
  label_uz.setBounds(new Rectangle(15, 20, 500, 20));

  cont.add(label_uz);
  label_o.setForeground(new Color(180,0, 60));
  label_o.setFont(new Font("Dialog", 3, 12));
  label_o.setBounds(new Rectangle(365, 147+60+70-115, 500, 20));

  cont.add(label_o);
  label_r.setForeground(new Color(180,0, 60));
  label_r.setFont(new Font("Dialog", 3, 12));
  label_r.setBounds(new Rectangle(15, 372+60+30-115, 500, 20));

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
    cont.add(txpHelp, null);
    cont.add(cbHelp, null);
     button2.addMouseListener(new MouseAdapter() {
       public void mouseClicked(MouseEvent e) {
        f1=0;f2=0;f3=0;f4=0;
        if(st<27)
         st+=1;
     button1.setEnabled(true);
     if (st==27)
     button2.setEnabled(false);
        repaint();
  }});



  }


//==============================================================================
class  Panel_paint extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Stringer.setGraphics(g);


      if (pr==0){
if(st==0){
          label_tit.setText("Позиционные игры");
        }
if(st>=1 && st<=400){
          label_tit.setText("Пример решения");
        }
label_gi.setText(" Графическая иллюстрация: ");
label_uz.setText(" ");
label_o.setText(" Обозначения: ");
label_r.setText(" Построение модели: ");}


if(st>=0 && st<=400){
  g.setFont(new Font("Times New Roman", 1, 14));
  g.setColor(Color.black);
}


   if(st==0){
     g.setFont(new Font("Serif", 1, 28));
     g.setColor(new Color(130, 0, 80));
     g.drawString("                         Пример решения игры", 15, 170);




   }


   if(st>=1){
     if(st==1)
       g.setColor(new Color(0, 0, 0));
     //g.drawString("Начинает игрок А.",35,160-120);


     //точки
     g.setFont(new Font("Comic Sans MS",0,11));
     //1
     g.setColor(Color.black);
     g.fillOval(215,30+15,5,5);
     g.drawString("(2;2)",200,27+15);
     //2
     g.fillOval(254,15+15,5,5);
     g.drawString("(5;3)",243,12+15);
     //3
     g.fillOval(290,60+15,5,5);
     g.drawString("(5;5)",280,57+15);
     //4
     g.fillOval(330,80+15,5,5);
     g.drawString("(-1;5)",315,76+15);
     //5
     g.fillOval(369,60+15,5,5);
     g.drawString("(1;4)",357,57+15);
     //6
     g.fillOval(440,30+15,5,5);
     g.drawString("(-1;1)",427,27+15);
     //7
     g.fillOval(470,70+15,5,5);
     g.drawString("(1;1)",477,75+15);
     //8
     g.fillOval(230,110+15,5,5);
     g.drawString("(2;6)",215,107+15);
     //9
     g.fillOval(445,115+15,5,5);
     g.drawString("(0;0)",435,110+15);
     //10
     g.fillOval(490,135+15,5,5);
     g.drawString("(2;7)",480,130+15);
     //11
     g.fillOval(120,180+15,5,5);
     g.drawString("(8;0)",93,180+15);
     //12
     g.fillOval(160,145+15,5,5);
     g.drawString("(8;4)",150,142+15);
     //13
     g.fillOval(530,175+15,5,5);
     g.drawString("(3;6)",520,170+15);
     //14
     g.fillOval(190,270+15,5,5);
     g.drawString("(2;5)",175,286+15);
     //15
     g.fillOval(480,280+15,5,5);
     g.drawString("(5;7)",475,296+15);
     //16
     g.fillOval(550,225+15,5,5);
     g.drawString("(3;5)",557,230+15);


     //линии
     //1.1-2.1
     g.fillOval(330,280+15,5,5);
     g.drawLine(332,282+15,255,250+15);
     g.fillOval(253,248+15,5,5);
     //1.1-2.2
     g.drawLine(332,282+15,332,210+15);
     g.fillOval(330,208+15,5,5);
     //1.1-2.3
     g.drawLine(332,282+15,410,250+15);
     g.fillOval(408,248+15,5,5);
     //2.1-1.2
     g.drawLine(255,250+15,187,212+15);
     g.fillOval(185,210+15,5,5);
     //2.1.1
     g.drawLine(255,250+15,192,272+15);
     //2.2-1.5
     g.drawLine(332,210+15,292,142+15);
     g.fillOval(290,140+15,5,5);
     //2.2-1.6
     g.drawLine(332,210+15,371,142+15);
     g.fillOval(369,140+15,5,5);
     //2.3-1.3
     g.drawLine(410,250+15,447,172+15);
     g.fillOval(445,170+15,5,5);
     //2.3-1.4
     g.drawLine(410,250+15,490,220+15);
     g.fillOval(488,218+15,5,5);
     //2.3.3
     g.drawLine(410,250+15,482,282+15);
     //1.2.1
     g.drawLine(187,212+15,122,182+15);
     //1.2.2
     g.drawLine(187,212+15,162,147+15);
     //1.3.1
     g.drawLine(447,172+15,447,117+15);
     //1.3.2
     g.drawLine(447,172+15,492,137+15);
     //1.4.1
     g.drawLine(490,220+15,532,177+15);
     //1.4.2
     g.drawLine(490,220+15,552,227+15);
     //1.5-2.4
     g.drawLine(292,142+15,256,72+15);
     g.fillOval(254,70+15,5,5);
     //1.5.1
     g.drawLine(292,142+15,232,112+15);
     //1.5.2
     g.drawLine(292,142+15,292,62+15);
     //1.6-2.5
     g.drawLine(371,142+15,408,72+15);
     g.fillOval(406,70+15,5,5);
     //1.6.1
     g.drawLine(371,142+15,332,82+15);
     //1.6.2
     g.drawLine(371,142+15,371,62+15);
     //2.4.1
     g.drawLine(256,72+15,217,32+15);
     //2.4.2
     g.drawLine(256,72+15,256,17+15);
     //2.5.1
     g.drawLine(408,72+15,442,32+15);
     //2.5.2
     g.drawLine(408,72+15,472,72+15);

     //возможные стратегии
     //1.1
     g.drawOval(320,270+15,25,25);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",290,280+15);
     g.drawString("2",322,250+15);
     g.drawString("3",367,280+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(1, 1)",318,305+15);
     //2.1
     g.drawRect(245,240+15,20,20);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",220,275+15);
     g.drawString("2",222,227+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(2, 1)",241,271+15);
     //2.2
     g.drawRect(322,200+15,20,20);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",305,185+15);
     g.drawString("2",354,185+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(2, 2)",290,215+15);
     //2.3
     g.drawRect(400,240+15,20,20);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",420,210+15);
     g.drawString("2",445,230+15);
     g.drawString("3",437,278+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(2, 3)",396,271+15);
     //1.2
     g.drawOval(175,200+15,25,25);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",147,207+15);
     g.drawString("2",175,175+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(1, 2)",173,235+15);
     //1.3
     g.drawOval(435,160+15,25,25);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",440,148+15);
     g.drawString("2",475,162+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(1, 3)",405,177+15);
     //1.4
     g.drawOval(478,208+15,25,25);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",505,195+15);
     g.drawString("2",517,233+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(1, 4)",475,243+15);
     //1.5
     g.drawOval(280,130+15,25,25);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",255,137+15);
     g.drawString("2",263,112+15);
     g.drawString("3",297,100+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(1, 5)",271,165+15);
     //1.6
     g.drawOval(359,130+15,25,25);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",343,120+15);
     g.drawString("2",363,102+15);
     g.drawString("3",390,120+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(1, 6)",328,145+15);
     //2.4
     g.drawRect(246,62+15,20,20);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",225,57+15);
     g.drawString("2",260,45+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(2, 4)",215,80+15);
     //2.5
     g.drawRect(398,62+15,20,20);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",422,47+15);
     g.drawString("2",440,83+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(2, 5)",405,92+15);



     g.setColor(new Color(0, 0, 0));
   }
   if(st>=2){
     if(st==2)
       g.setColor(new Color(200, 0, 0));
       //2.4
     g.drawRect(246,62+15,20,20);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",225,57+15);
     g.drawString("2",260,45+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(2, 4)",215,80+15);
     //2.5
     g.drawRect(398,62+15,20,20);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",422,47+15);
     g.drawString("2",440,83+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(2, 5)",405,92+15);
     //2.4.1
     g.drawLine(256,72+15,217,32+15);
     //2.4.2
     g.drawLine(256,72+15,256,17+15);
     //2.5.1
     g.drawLine(408,72+15,442,32+15);
     //2.5.2
     g.drawLine(408,72+15,472,72+15);

     g.setFont(new Font("Comic Sans MS",0,11));
     //1
     g.fillOval(215,30+15,5,5);
     g.drawString("(2;2)",200,27+15);
     //2
     g.fillOval(254,15+15,5,5);
     g.drawString("(5;3)",243,12+15);
     //6
     g.fillOval(440,30+15,5,5);
     g.drawString("(-1;1)",427,27+15);
     //7
     g.fillOval(470,70+15,5,5);
     g.drawString("(1;1)",477,75+15);

     g.fillOval(254,70+15,5,5);
     g.fillOval(406,70+15,5,5);


   }

   if(st>=3){
     if(st==3)
       g.setColor(new Color(200, 0, 0));
       //2.4
     g.drawRect(246,62+15,20,20);
     g.fillOval(254,70+15,5,5);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("2",260,45+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(2, 4)",215,80+15);
     //2.4.2
     g.drawLine(256,72+15,256,17+15);
     g.setFont(new Font("Comic Sans MS",0,11));
     g.fillOval(254,15+15,5,5);
     g.drawString("(5;3",243,12+15);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(5;",243,12+15);
   }
   if(st>=4){
     if(st==4)
       g.setColor(new Color(200, 0, 0));
       //2.4
     g.drawRect(246,62+15,20,20);
     g.fillOval(254,70+15,5,5);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("2",260,45+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(2, 4)",215,80+15);
     //2.4.2
     g.drawLine(256,72+15,256,17+15);
     g.setFont(new Font("Comic Sans MS",0,11));
     g.fillOval(254,15+15,5,5);
     g.drawString("(5",243,12+15);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(",243,12+15);
   }
   if(st>=5){
     if(st==5)
       g.setColor(new Color(200, 0, 0));
       //2.5
     g.drawRect(398,62+15,20,20);
     g.fillOval(406,70+15,5,5);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",422,47+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(2, 5)",405,92+15);
     //2.5.1
     g.drawLine(408,72+15,442,32+15);
     g.setFont(new Font("Comic Sans MS",0,11));
     //6
     g.fillOval(440,30+15,5,5);
     g.drawString("(-1;1",427,27+15);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(-1;",427,27+15);


   }
   if(st>=6){
     if(st==6)
       g.setColor(new Color(200, 0, 0));
       //2.5
     g.drawRect(398, 62 + 15, 20, 20);
     g.fillOval(406, 70 + 15, 5, 5);
     g.setFont(new Font("Timees New Roman", 1, 10));
     g.drawString("1", 422, 47 + 15);
     g.setFont(new Font("Courier New", 1, 9));
     g.drawString("(2, 5)", 405, 92 + 15);
     //2.5.1
     g.drawLine(408, 72 + 15, 442, 32 + 15);
     g.setFont(new Font("Comic Sans MS", 0, 11));
     //6
     g.fillOval(440, 30 + 15, 5, 5);
     g.drawString("(-1", 427, 27 + 15);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(", 427, 27 + 15);


   }
   if(st>=7){
     if(st==7)
       g.setColor(new Color(200, 0, 0));
       //1.2
     g.drawOval(175, 200 + 15, 25, 25);
     g.setFont(new Font("Timees New Roman", 1, 10));
     g.drawString("1", 147, 207 + 15);
     g.drawString("2", 175, 175 + 15);
     g.setFont(new Font("Courier New", 1, 9));
     g.drawString("(1, 2)", 173, 235 + 15);
     //1.2.1
     g.drawLine(187,212+15,122,182+15);
     //1.2.2
     g.drawLine(187,212+15,162,147+15);
     g.setFont(new Font("Comic Sans MS",0,11));
     //11
     g.fillOval(120,180+15,5,5);
     g.drawString("(8;0)",93,180+15);
     //12
     g.fillOval(160,145+15,5,5);
     g.drawString("(8;4)",150,142+15);


     //1.3
     g.drawOval(435,160+15,25,25);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",440,148+15);
     g.drawString("2",475,162+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(1, 3)",405,177+15);
     //1.3.1
     g.drawLine(447,172+15,447,117+15);
     //1.3.2
     g.drawLine(447,172+15,492,137+15);
     g.setFont(new Font("Comic Sans MS",0,11));
     //9
     g.fillOval(445,115+15,5,5);
     g.drawString("(0;0)",435,110+15);
     //10
     g.fillOval(490,135+15,5,5);
     g.drawString("(2;7)",480,130+15);


     //1.4
     g.drawOval(478,208+15,25,25);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",505,195+15);
     g.drawString("2",517,233+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(1, 4)",475,243+15);
     //1.4.1
     g.drawLine(490,220+15,532,177+15);
     //1.4.2
     g.drawLine(490,220+15,552,227+15);
     g.setFont(new Font("Comic Sans MS",0,11));
     //13
     g.fillOval(530,175+15,5,5);
     g.drawString("(3;6)",520,170+15);
     //16
     g.fillOval(550,225+15,5,5);
     g.drawString("(3;5)",557,230+15);


     //1.5
     g.drawOval(280,130+15,25,25);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",255,137+15);
     g.drawString("2",263,112+15);
     g.drawString("3",297,100+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(1, 5)",271,165+15);
     //1.5.1
     g.drawLine(292,142+15,232,112+15);
     //1.5.2
     g.drawLine(292,142+15,292,62+15);
     //1.5-2.4
     g.drawLine(292,142+15,256,72+15);
     g.fillOval(254,70+15,5,5);

     g.setFont(new Font("Comic Sans MS",0,11));
     //2
     g.fillOval(254,15+15,5,5);
     g.drawString("(5;3)",243,12+15);
     //3
     g.fillOval(290,60+15,5,5);
     g.drawString("(5;5)",280,57+15);
     //8
     g.fillOval(230,110+15,5,5);
     g.drawString("(2;6)",215,107+15);


     //1.6
     g.drawOval(359,130+15,25,25);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",343,120+15);
     g.drawString("2",363,102+15);
     g.drawString("3",390,120+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(1, 6)",328,145+15);
     //1.6-2.5
     g.drawLine(371,142+15,408,72+15);
     g.fillOval(406,70+15,5,5);
     //1.6.1
     g.drawLine(371,142+15,332,82+15);
     //1.6.2
     g.drawLine(371,142+15,371,62+15);

     g.setFont(new Font("Comic Sans MS",0,11));
     //4
     g.fillOval(330,80+15,5,5);
     g.drawString("(-1;5)",315,76+15);
     //5
     g.fillOval(369,60+15,5,5);
     g.drawString("(1;4)",357,57+15);
     //6
     g.fillOval(440,30+15,5,5);
     g.drawString("(-1;1)",427,27+15);





     g.fillOval(185,210+15,5,5);
     g.fillOval(445,170+15,5,5);
     g.fillOval(488,218+15,5,5);
     g.fillOval(254,70+15,5,5);
     g.fillOval(290,140+15,5,5);
     g.fillOval(369,140+15,5,5);
   }
   if(st>=8){
     if(st==8)
       g.setColor(new Color(200, 0, 0));
       //1.2
     g.drawOval(175, 200 + 15, 25, 25);
     g.setFont(new Font("Timees New Roman", 1, 10));
     g.drawString("1", 147, 207 + 15);

     g.setFont(new Font("Courier New", 1, 9));
     g.drawString("(1, 2)", 173, 235 + 15);
     //1.2.1
     g.drawLine(187, 212 + 15, 122, 182 + 15);

     g.setFont(new Font("Comic Sans MS", 0, 11));
     //11
     g.fillOval(120, 180 + 15, 5, 5);

     g.drawString("(8", 93, 180 + 15);

     g.fillOval(185,210+15,5,5);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(", 93, 180 + 15);



   }
   if(st>=9){
     if(st==9)
       g.setColor(new Color(200, 0, 0));
       //1.2
     g.drawOval(175, 200 + 15, 25, 25);
     g.setFont(new Font("Timees New Roman", 1, 10));
     g.drawString("1", 147, 207 + 15);

     g.setFont(new Font("Courier New", 1, 9));
     g.drawString("(1, 2)", 173, 235 + 15);
     //1.2.1
     g.drawLine(187, 212 + 15, 122, 182 + 15);

     g.setFont(new Font("Comic Sans MS", 0, 11));
     //11
     g.fillOval(120, 180 + 15, 5, 5);

     g.drawString("(8,0", 93, 180 + 15);

     g.fillOval(185,210+15,5,5);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(8,", 93, 180 + 15);



   }
   if(st>=10){
     if (st == 10)
       g.setColor(new Color(200, 0, 0));
       //1.3
     g.drawOval(435, 160 + 15, 25, 25);
     g.setFont(new Font("Timees New Roman", 1, 10));
     g.drawString("2", 475, 162 + 15);
     g.setFont(new Font("Courier New", 1, 9));
     g.drawString("(1, 3)", 405, 177 + 15);
     //1.3.2
     g.drawLine(447,172+15,492,137+15);
     //10
     g.setFont(new Font("Comic Sans MS",0,11));
     g.fillOval(490,135+15,5,5);
     g.drawString("(2",480,130+15);


     g.fillOval(445,170+15,5,5);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(",480,130+15);

   }
   if (st >= 11) {
     if (st == 11)
       g.setColor(new Color(200, 0, 0));
       //1.3
     g.drawOval(435, 160 + 15, 25, 25);
     g.setFont(new Font("Timees New Roman", 1, 10));
     g.drawString("2", 475, 162 + 15);
     g.setFont(new Font("Courier New", 1, 9));
     g.drawString("(1, 3)", 405, 177 + 15);
     //1.3.2
     g.drawLine(447,172+15,492,137+15);
     //10
     g.setFont(new Font("Comic Sans MS",0,11));
     g.fillOval(490,135+15,5,5);
     g.drawString("(2;7",480,130+15);


     g.fillOval(445,170+15,5,5);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(2;",480,130+15);

   }
   if (st >= 12) {
     if (st == 12)
       g.setColor(new Color(200, 0, 0));
       //1.4
     g.drawOval(478,208+15,25,25);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("2",517,233+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(1, 4)",475,243+15);
     //1.4.2
     g.drawLine(490,220+15,552,227+15);
     //16
     g.setFont(new Font("Comic Sans MS",0,11));
     g.fillOval(550,225+15,5,5);
     g.drawString("(3",557,230+15);


     g.fillOval(488,218+15,5,5);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(",557,230+15);
   }
   if (st >= 13) {
     if (st == 13)
       g.setColor(new Color(200, 0, 0));
       //1.4
     g.drawOval(478,208+15,25,25);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("2",517,233+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(1, 4)",475,243+15);
     //1.4.2
     g.drawLine(490,220+15,552,227+15);
     //16
     g.setFont(new Font("Comic Sans MS",0,11));
     g.fillOval(550,225+15,5,5);
     g.drawString("(3;5",557,230+15);


     g.fillOval(488,218+15,5,5);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(3;",557,230+15);


   }
   if (st >= 14) {
     if (st == 14)
       g.setColor(new Color(200, 0, 0));
       //1.5
     g.drawOval(280,130+15,25,25);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("2",263,112+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(1, 5)",271,165+15);
     //1.5-2.4
     g.drawLine(292,142+15,256,72+15);
     g.fillOval(254,70+15,5,5);

     //2
     g.setFont(new Font("Comic Sans MS",0,11));
     g.fillOval(254,15+15,5,5);
     g.drawString("(5",243,12+15);

     g.fillOval(290,140+15,5,5);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(",243,12+15);

   }


   if(st>=15){
     if(st==15)
       g.setColor(new Color(200, 0, 0));
       //1.5
     g.drawOval(280,130+15,25,25);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("2",263,112+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(1, 5)",271,165+15);
     //1.5-2.4
     g.drawLine(292,142+15,256,72+15);
     g.fillOval(254,70+15,5,5);

     //2
     g.setFont(new Font("Comic Sans MS",0,11));
     g.fillOval(254,15+15,5,5);
     g.drawString("(5;3",243,12+15);

     g.fillOval(290,140+15,5,5);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(5;",243,12+15);
   }
   if (st >= 16) {
     if (st == 16)
       g.setColor(new Color(200, 0, 0));
      //1.6
     g.drawOval(359, 130 + 15, 25, 25);
     g.setFont(new Font("Timees New Roman", 1, 10));
     g.drawString("2", 363, 102 + 15);
     g.setFont(new Font("Courier New", 1, 9));
     g.drawString("(1, 6)", 328, 145 + 15);
     //1.6.2
     g.drawLine(371,142+15,371,62+15);
     //5
     g.setFont(new Font("Comic Sans MS",0,11));
     g.fillOval(369,60+15,5,5);
     g.drawString("(1",357,57+15);

     g.fillOval(369,140+15,5,5);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(",357,57+15);

   }
   if (st >= 17) {
     if (st == 17)
       g.setColor(new Color(200, 0, 0));
      //1.6
     g.drawOval(359, 130 + 15, 25, 25);
     g.setFont(new Font("Timees New Roman", 1, 10));
     g.drawString("2", 363, 102 + 15);
     g.setFont(new Font("Courier New", 1, 9));
     g.drawString("(1, 6)", 328, 145 + 15);
     //1.6.2
     g.drawLine(371,142+15,371,62+15);
     //5
     g.setFont(new Font("Comic Sans MS",0,11));
     g.fillOval(369,60+15,5,5);
     g.drawString("(1;4",357,57+15);

     g.fillOval(369,140+15,5,5);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(1;",357,57+15);
   }
   if(st>=18){
     if(st==18)
       g.setColor(new Color(200, 0, 0));
       //2.1
     g.drawRect(245, 240 + 15, 20, 20);
     g.setFont(new Font("Timees New Roman", 1, 10));
     g.drawString("1", 220, 275 + 15);
     g.drawString("2", 222, 227 + 15);
     g.setFont(new Font("Courier New", 1, 9));
     g.drawString("(2, 1)", 241, 271 + 15);
     //2.2
     g.drawRect(322,200+15,20,20);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",305,185+15);
     g.drawString("2",354,185+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(2, 2)",290,215+15);
     //2.3
     g.drawRect(400,240+15,20,20);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",420,210+15);
     g.drawString("2",445,230+15);
     g.drawString("3",437,278+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(2, 3)",396,271+15);
     //2.1-1.2
     g.drawLine(255,250+15,187,212+15);
     g.fillOval(185,210+15,5,5);
     //2.1.1
     g.drawLine(255,250+15,192,272+15);
     //2.2-1.5
     g.drawLine(332,210+15,292,142+15);
     g.fillOval(290,140+15,5,5);
     //2.2-1.6
     g.drawLine(332,210+15,371,142+15);
     g.fillOval(369,140+15,5,5);
     //2.3-1.3
     g.drawLine(410,250+15,447,172+15);
     g.fillOval(445,170+15,5,5);
     //2.3-1.4
     g.drawLine(410,250+15,490,220+15);
     g.fillOval(488,218+15,5,5);
     //2.3.3
     g.drawLine(410,250+15,482,282+15);

     g.fillOval(253,248+15,5,5);
     g.fillOval(330,208+15,5,5);
     g.fillOval(408,248+15,5,5);
     g.setFont(new Font("Comic Sans MS",0,11));
     //2
     g.fillOval(254,15+15,5,5);
     g.drawString("(5;3)",243,12+15);
     //5
     g.fillOval(369,60+15,5,5);
     g.drawString("(1;4)",357,57+15);
     //10
     g.fillOval(490,135+15,5,5);
     g.drawString("(2;7)",480,130+15);
     //11
     g.fillOval(120,180+15,5,5);
     g.drawString("(8;0)",93,180+15);
     //14
     g.fillOval(190,270+15,5,5);
     g.drawString("(2;5)",175,286+15);
     //15
     g.fillOval(480,280+15,5,5);
     g.drawString("(5;7)",475,296+15);
     //16
     g.fillOval(550,225+15,5,5);
     g.drawString("(3;5)",557,230+15);


   }
   if(st>=19){
     if(st==19)
       g.setColor(new Color(200, 0, 0));
       //2.1
     g.drawRect(245, 240 + 15, 20, 20);
     g.setFont(new Font("Timees New Roman", 1, 10));
     g.drawString("1", 220, 275 + 15);
     g.setFont(new Font("Courier New", 1, 9));
     g.drawString("(2, 1)", 241, 271 + 15);
     //2.1.1
     g.drawLine(255,250+15,192,272+15);
     g.fillOval(253,248+15,5,5);
     //14
     g.setFont(new Font("Comic Sans MS",0,11));
     g.fillOval(190,270+15,5,5);
     g.drawString("(2;5",175,286+15);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(2;",175,286+15);
   }

   if(st>=20){
     if(st==20)
       g.setColor(new Color(200, 0, 0));
       //2.1
     g.drawRect(245, 240 + 15, 20, 20);
     g.setFont(new Font("Timees New Roman", 1, 10));
     g.drawString("1", 220, 275 + 15);
     g.setFont(new Font("Courier New", 1, 9));
     g.drawString("(2, 1)", 241, 271 + 15);
     //2.1.1
     g.drawLine(255,250+15,192,272+15);
     g.fillOval(253,248+15,5,5);
     //14
     g.setFont(new Font("Comic Sans MS",0,11));
     g.fillOval(190,270+15,5,5);
     g.drawString("(2",175,286+15);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(",175,286+15);

   }
   if(st>=21){
     if(st==21)
       g.setColor(new Color(200, 0, 0));
     g.drawRect(322,200+15,20,20);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("2",354,185+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(2, 2)",290,215+15);
     //2.2-1.6
     g.drawLine(332,210+15,371,142+15);
     g.fillOval(369,140+15,5,5);
     g.fillOval(330,208+15,5,5);
     //5
     g.setFont(new Font("Comic Sans MS",0,11));
     g.fillOval(369,60+15,5,5);
     g.drawString("(1;4",357,57+15);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(1;",357,57+15);

   }
   if(st>=22){
     if(st==22)
       g.setColor(new Color(200, 0, 0));
     g.drawRect(322,200+15,20,20);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("2",354,185+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(2, 2)",290,215+15);
     //2.2-1.6
     g.drawLine(332,210+15,371,142+15);
     g.fillOval(369,140+15,5,5);
     g.fillOval(330,208+15,5,5);
     //5
     g.setFont(new Font("Comic Sans MS",0,11));
     g.fillOval(369,60+15,5,5);
     g.drawString("(1",357,57+15);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(",357,57+15);

   }
   if(st>=23){
     if(st==23)
       g.setColor(new Color(200, 0, 0));
       //2.3
     g.drawRect(400,240+15,20,20);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",420,210+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(2, 3)",396,271+15);
     //2.3-1.3
     g.drawLine(410,250+15,447,172+15);
     g.fillOval(445,170+15,5,5);
     g.fillOval(408,248+15,5,5);
     //10
     g.setFont(new Font("Comic Sans MS",0,11));
     g.fillOval(490,135+15,5,5);
     g.drawString("(2;7",480,130+15);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(2;",480,130+15);


   }
   if(st>=24){
     if(st==24)
       g.setColor(new Color(200, 0, 0));
       //2.3
     g.drawRect(400,240+15,20,20);
     g.setFont(new Font("Timees New Roman",1,10));
     g.drawString("1",420,210+15);
     g.setFont(new Font("Courier New",1,9));
     g.drawString("(2, 3)",396,271+15);
     //2.3-1.3
     g.drawLine(410,250+15,447,172+15);
     g.fillOval(445,170+15,5,5);
     g.fillOval(408,248+15,5,5);
     //10
     g.setFont(new Font("Comic Sans MS",0,11));
     g.fillOval(490,135+15,5,5);
     g.drawString("(2",480,130+15);
     g.setColor(new Color(0, 0, 0));
     g.drawString("(",480,130+15);
   }

   if(st>=25){
     if(st==25)
       g.setColor(new Color(200, 0, 0));
       //1.1
     g.drawOval(320, 270 + 15, 25, 25);
     g.setFont(new Font("Timees New Roman", 1, 10));
     g.drawString("1", 290, 280 + 15);
     g.drawString("2", 322, 250 + 15);
     g.drawString("3", 367, 280 + 15);
     g.setFont(new Font("Courier New", 1, 9));
     g.drawString("(1, 1)", 318, 305 + 15);
     //1.1-2.1
     g.fillOval(330,280+15,5,5);
     g.drawLine(332,282+15,255,250+15);
     g.fillOval(253,248+15,5,5);
     //1.1-2.2
     g.drawLine(332,282+15,332,210+15);
     g.fillOval(330,208+15,5,5);
     //1.1-2.3
     g.drawLine(332,282+15,410,250+15);
     g.fillOval(408,248+15,5,5);
     g.setFont(new Font("Comic Sans MS",0,11));
     //5
     g.fillOval(369,60+15,5,5);
     g.drawString("(1;4)",357,57+15);
     //10
     g.fillOval(490,135+15,5,5);
     g.drawString("(2;7)",480,130+15);
     //14
     g.fillOval(190,270+15,5,5);
     g.drawString("(2;5)",175,286+15);


   }
   if(st>=26){
     if(st==26)
       g.setColor(new Color(200, 0, 0));
       //1.1
       g.drawOval(320, 270 + 15, 25, 25);
       g.setFont(new Font("Timees New Roman", 1, 10));
       g.drawString("1", 290, 280 + 15);
       g.setFont(new Font("Courier New", 1, 9));
       g.drawString("(1, 1)", 318, 305 + 15);
       //1.1-2.1
       g.fillOval(330,280+15,5,5);
       g.drawLine(332,282+15,255,250+15);
       g.fillOval(253,248+15,5,5);
       g.setFont(new Font("Comic Sans MS",0,11));
       //14
       g.fillOval(190,270+15,5,5);
       g.drawString("(2",175,286+15);
       g.setColor(new Color(0, 0, 0));
       g.drawString("(",175,286+15);


   }
   if(st>=27){
     if(st==27)
       g.setColor(new Color(200, 0, 0));
       //1.1
       g.drawOval(320, 270 + 15, 25, 25);
       g.setFont(new Font("Timees New Roman", 1, 10));
       g.drawString("1", 290, 280 + 15);
       g.setFont(new Font("Courier New", 1, 9));
       g.drawString("(1, 1)", 318, 305 + 15);
       //1.1-2.1
       g.fillOval(330,280+15,5,5);
       g.drawLine(332,282+15,255,250+15);
       g.fillOval(253,248+15,5,5);
       g.setFont(new Font("Comic Sans MS",0,11));
       //14
       g.fillOval(190,270+15,5,5);
       g.drawString("(2;5",175,286+15);
       g.setColor(new Color(0, 0, 0));
       g.drawString("(2;",175,286+15);

   }


}}

  class  Panel_paint2 extends JPanel {
      public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Dialog", 1, 12));
         Stringer.setGraphics(g);





      }}
    class  Panel_paint3 extends JPanel {
          public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Stringer.setGraphics(g);

          }}
     class  Panel_paint4 extends JPanel {
         public void paintComponent(Graphics g) {
           super.paintComponent(g);
           Stringer.setGraphics(g);
           g.setColor(ColorText);
           g.setFont(FontText);
           g.setFont(new Font("Times New Roman", 1, 14));

           if (st == 1) {
             g.setColor(new Color(0, 0, 0));
             g.drawString("Расссмотрим позиционную игру, дерево которой представлено на рисунке.",10, 15);
           }
           if(st>=2 && st<=6){
             if (st >= 2) {
               if (st == 2)
                 g.setColor(new Color(0, 0, 0));

               Stringer.drawString(" Сначала решаем подыгры  Г_{2,4} и Г_{2,5}. Выигрыши игроков:",73, 15);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));
             }
             if (st >= 3) {
               if (st == 3)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{2}(2,4) = 3", 100, 40);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));
             }
             if (st >= 4) {
               if (st == 4)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{1}(2,4) = 5", 250, 40);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));
             }
             if (st >= 5) {
               if (st == 5)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{2}(2,5) = 1", 100, 60);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));
             }

             if (st >= 6) {
               if (st == 6)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{1}(2,5) = -1", 250, 60);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));
             }
           }
           if(st>=7 && st<=17){
             if(st>=7){
               if(st==7)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString(" Далее решаем подыгры Г_{1,2}, Г_{1,3}, Г_{1,4}, Г_{1,5}, Г_{1,6}. Выигрыши игроков следующие:",73, 15);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));

             }
             if(st>=8){
               if(st==8)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{1}(1,2) = 8",100, 40);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));

             }
             if(st>=9){
               if(st==9)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{2}(1,2) = 0",250, 40);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));

             }

             if (st >= 10) {
               if (st == 10)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{1}(1,3) = 2", 100, 55);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));

             }
             if (st >= 11) {
               if (st == 11)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{2}(1,3) = 7", 250, 55);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));

             }
             if (st >= 12) {
               if (st == 12)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{1}(1,4) = 3", 100, 70);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));

             }
             if (st >= 13) {
               if (st == 13)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{2}(1,4) = 5", 250, 70);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));

             }
             if (st >= 14) {
               if (st == 14)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{1}(1,5) = 5", 100, 85);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));

             }
             if (st >= 15) {
               if (st == 15)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{2}(1,5) = 3", 250, 85);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));

             }
             if (st >= 16) {
               if (st == 16)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{1}(1,6) = 1", 100, 100);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));

             }
             if (st >= 17) {
               if (st == 17)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{2}(1,6) = 4", 250, 100);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));

             }
           }
           if(st>=18 && st<=24){
             if (st >= 18) {
               if (st == 18)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString(" Далее решаем подыгры Г_{2,1}, Г_{2,2} и Г_{2,3}. Выигрыши игроков следующие:",73, 15);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));
             }
             if(st>=19){
               if(st==19)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{2}(2,1) = 5",100, 40);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));
             }
             if(st>=20){
               if(st==20)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{1}(2,1) = 2",250, 40);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));

             }
             if(st>=21){
               if(st==21)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{2}(2,2) = 4",100, 60);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));

             }
             if(st>=22){
               if(st==22)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{1}(2,2) = 1",250, 60);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));

             }
             if(st>=23){
               if(st==23)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{2}(2,3) = 7",100, 80);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));

             }
             if(st>=24){
               if(st==24)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{1}(2,3) = 2",250, 80);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));

             }

           }
           if(st>=25 && st<=40){
             if(st>=25){
               if(st==25)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("Наконец рассмотрим игру Г = Г_{1,1}. Выигрыши игроков следующие:",73, 15);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));

             }
             if(st>=26){
               if(st==26)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{1}(1,1) = 2",100, 40);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));

             }
             if(st>=27){
               if(st==27)
                 g.setColor(new Color(0, 0, 0));
               Stringer.drawString("W_{2}(1,1) = 5",250, 40);
               g.setColor(new Color(160, 0, 0));
               g.drawString("Решение:", 10, 15);
               g.setColor(new Color(0, 0, 0));
             }
           }
           /*g.drawString("Постановка задачи:",10,15);
           g.drawString("1-й ход.   Игрок   А   выбирает  число   x   из  множества  двух  чисел  {1, 2}.",150,15);
           g.drawString("2-й ход.   Игрок   В   выбирает  число   y   из  множества  двух  чисел  {1, 2},  зная  выбор  числа  x",10,30);
           g.drawString("игроком  А.",10,45);
           g.drawString("Функция  W (x, y) выплат игроку  А  за счет игрока  В  задается так",10,60);
           g.drawString("W (1, 1) =  1,                      W (2, 1) = -2,",190,75);
           g.drawString("W (1, 2) = -1,                      W (2, 2) =  2.",190,90);
           if(st>=2 && st<=14)
             g.drawString("На рисунке показаны дерево игры и информационные множества.",10,105);
           if(st>=17)
             g.drawString("На рисунке показаны дерево игры и информационные множества.",10,105);*/
         }}

       void cbHelp_itemStateChanged(ItemEvent e) {

  }






}
