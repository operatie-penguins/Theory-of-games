package bimatrigra;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2006</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class ApplSemSpor extends Applet {
  private boolean isStandalone = false;
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  Panel_M jPanel1 = new Panel_M();
  JLabel jLabel1 = new JLabel();
  Border border1;
  JScrollBar jScrollBar1 = new JScrollBar();
  JScrollBar jScrollBar2 = new JScrollBar();
  Panel_R jPanel2 = new Panel_R();
int a=0,b=0;int shag=0, a1,a2,b1,b2;
  float param_a,param_b,viigr_m,viigr_g;
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel4 = new JLabel();
  JLabel jLabel5 = new JLabel();
  JButton jButton3 = new JButton();
  //Get a parameter value
  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }
 double Kas(double x)
      { double K;
        K=10/(x+a);//-((t*x)/5.1);
        return K;
      }

  //Construct the applet
  public ApplSemSpor() {
  }

  //Initialize the applet
  public void init() {
    try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }

  //Component initialization
  private void jbInit() throws Exception {
    border1 = BorderFactory.createLineBorder(new Color(147, 187, 255),1);
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setBounds(new Rectangle(58, 348, 79, 21));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setText("<==");
    jButton1.addActionListener(new ApplSemSpor_jButton1_actionAdapter(this));
    this.setBackground(new Color(247, 247, 255));
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setBounds(new Rectangle(152, 349, 98, 21));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setText("Обновить");
    jButton2.addActionListener(new ApplSemSpor_jButton2_actionAdapter(this));

    jPanel1.setBackground(Color.white);
    jPanel1.setBorder(border1);
    jPanel1.setBounds(new Rectangle(20, 34, 384, 150));
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 60));
    jLabel1.setMinimumSize(new Dimension(80, 15));
    jLabel1.setText("Семейный спор");
    jLabel1.setBounds(new Rectangle(130, 5, 190, 22));
    jScrollBar2.setMaximum(39);
    jScrollBar2.setMinimum(5);
    jScrollBar2.setOrientation(JScrollBar.HORIZONTAL);
    jScrollBar2.setBackground(new Color(247, 247, 255));
    jScrollBar2.setBounds(new Rectangle(253, 203, 127, 17));
    jScrollBar2.addMouseMotionListener(new ApplSemSpor_jScrollBar2_mouseMotionAdapter(this));
    jScrollBar1.setMaximum(20);
    jScrollBar1.setMinimum(4);
    jScrollBar1.setOrientation(JScrollBar.HORIZONTAL);
    jScrollBar1.setBackground(new Color(247, 247, 255));
    jScrollBar1.setBounds(new Rectangle(60, 203, 132, 17));
    jScrollBar1.addMouseMotionListener(new ApplSemSpor_jScrollBar1_mouseMotionAdapter(this));
    jPanel2.setBackground(Color.white);
    jPanel2.setBorder(border1);
    jPanel2.setBounds(new Rectangle(20, 240, 381, 100));
    jLabel2.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel2.setForeground(new Color(180, 0, 60));
    jLabel2.setMaximumSize(new Dimension(103, 15));
    jLabel2.setText("Мера удовольствия:");
    jLabel2.setBounds(new Rectangle(22, 185, 182, 15));
    jLabel3.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel3.setForeground(new Color(180, 0, 60));
    jLabel3.setText("Муж:");
    jLabel3.setBounds(new Rectangle(21, 205, 34, 15));
    jLabel4.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel4.setForeground(new Color(180, 0, 60));
    jLabel4.setText("Жена:");
    jLabel4.setBounds(new Rectangle(214, 206, 40, 15));
    jLabel5.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel5.setForeground(new Color(180, 0, 60));
    jLabel5.setOpaque(false);
    jLabel5.setText("Решение:");
    jLabel5.setBounds(new Rectangle(20, 225, 160, 15));
    jButton3.addActionListener(new ApplSemSpor_jButton3_actionAdapter(this));
    jButton3.setText("==>");
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton3.setBounds(new Rectangle(263, 349, 78, 21));
    jButton3.setBackground(new Color(220, 230, 255));
    this.add(jPanel1, null);
    this.add(jLabel1, null);
    this.add(jPanel2, null);
    this.add(jScrollBar2, null);
    this.add(jLabel4, null);
    this.add(jScrollBar1, null);
    this.add(jLabel3, null);
    this.add(jLabel5, null);
    this.add(jLabel2, null);
    this.add(jButton1, null);
    this.add(jButton2, null);
    this.add(jButton3, null);
    this.setLayout(null) ;
  }
  class Panel_M extends JPanel {
         public void paintComponent(Graphics g){
          super.paintComponent(g);
           Stringer.fonts[0]=new Font("Dialog", 1, 12);
            Stringer.setGraphics(g) ;
            int		startAngle = 0;
            int		endAngle = 45;
            boolean	filled = false;
            Font	font = new java.awt.Font("Courier", Font.BOLD, 12);
a=jScrollBar1.getValue() ;
 b=jScrollBar2.getValue() ;
               Rectangle r = getBounds(new Rectangle(19, 34, 384, 192));
               int hlines = r.height / 10;
               int vlines = r.width / 10;

            /*   g.setColor(new Color(50,50,50) );
               for (int i = 1; i <= hlines; i++) {
                   g.drawLine(0, i * 10, r.width, i * 10);
               }
               for (int i = 1; i <= vlines; i++) {
                   g.drawLine(i * 10, 0, i * 10, r.height);
               }

               g.setColor(Color.red);


               g.setFont(font);
               g.drawLine(0, 141, r.width,141);
               g.drawLine(r.width/ 2-102, 0,90, r.height);
               /*double ddx=0.001;
                     double t=0;
                     while (t<=6.14)
                       {
                        g.drawLine((int)(429+24*t),(int)(209-20*Math.sin(t)),(int)(429+24*(t+ddx)),(int)(209-20*Math.sin(t+ddx)));
                        g.drawLine((int)(429+24*t),(int)(209-1-20*Math.sin(t)),(int)(429+24*(t+ddx)),(int)(209-1-20*Math.sin(t+ddx)));
                        t=t+ddx;
                       }
                      t=-3;
                     while (t<=4.5)
                       {
                        g.drawLine((int)(486+20*t),(int)(224+15*Math.sin(0.5*t*t)),(int)(486+20*(t+ddx)),(int)(224+15*Math.sin(0.5*(t+ddx)*(t+ddx))));
                        g.drawLine((int)(486+20*t),(int)(224-1+15*Math.sin(0.5*t*t)),(int)(486+20*(t+ddx)),(int)(224-1+15*Math.sin(0.5*(t+ddx)*(t+ddx))));
                        t=t+ddx;
                       }

       double ddx=0.001,t;
                      t=0.1;
                      while (t<=394)
                      {
                       // g.drawLine((int)(90-10*t),(int)(141-10*Kas(t)),(int)(90-10*(t+ddx)),(int)(141-10*Kas(ddx+t)));
                       g.drawLine((int)(90+10*t),(int)(141-10*Kas(t)),(int)(90+10*(t+ddx)),(int)(141-10*Kas(ddx+t)));

                      //  g.drawLine((int)(528-15*t),(int)(487-15*Fun(t)),(int)(528-15*(t+ddx)),(int)(487-15*Fun(t+ddx)));
                        t=t+ddx;
                       }*/
 g.setColor(new Color(0,0,80) ) ;
Stringer.drawString("Муж",90,15) ;
Stringer.drawString("Жена",280,15) ;
Stringer.drawString("Б",285,60) ;Stringer.drawString("Ф",285+57,60) ;
Stringer.drawString("Б",92,60) ;Stringer.drawString("Ф",92+57,60) ;
Stringer.drawString("Б",30,92) ;Stringer.drawString("Ф",30,92+38) ;
Stringer.drawString("Б",265-38,92) ;Stringer.drawString("Ф",265-38,92+38) ;
Stringer.drawString(""+a,30+57,92) ;Stringer.drawString("0",30+57,92+38) ;
Stringer.drawString("0",30+57*2,92) ;Stringer.drawString(""+a*3,30+57*2,92+38) ;
Stringer.drawString(""+b,265-38+57,92) ;Stringer.drawString("0",265-38+57,92+38) ;
Stringer.drawString("0",265-38+57*2,92) ;Stringer.drawString(""+b/3,265-38+57*2,92+38) ;
g.setColor(Color.GRAY ) ;
g.drawRect(10,30,170,115) ;
g.drawRect(202,30,170,115) ;
g.drawLine(10,38+30,180,38+30) ;g.drawLine(10,38*2+30,180,38*2+30) ;
g.drawLine(67,30,67,145) ;g.drawLine(10+57*2,30,10+57*2,145) ;
g.drawLine(202,38+30,372,38+30) ;g.drawLine(202,38*2+30,372,38*2+30) ;
g.drawLine(202+57,30,57+202,145) ;g.drawLine(202+57*2,30,202+57*2,145) ;

         }}
class Panel_R extends JPanel {
              public void paintComponent(Graphics g){
               super.paintComponent(g);
                Stringer.fonts[0]=new Font("Dialog", 1, 12);
                 Stringer.setGraphics(g) ;
                 a=jScrollBar1.getValue() ;   b=jScrollBar2.getValue() ;
   if (shag==0){
                             Stringer.fonts[0]=new Font("Dialog", 2, 14);
                             g.setColor(new Color(180,0,60)  ) ;
                             Stringer.fonts[0]=new Font("Dialog", 1, 12);
                             g.setColor(new Color(0,0,80) ) ;
                             Stringer.drawString("Рассмотрим игру 'Cемейный спор.'",20,15) ;
                         }
  if (shag==1){
   Stringer.fonts[0]=new Font("Dialog", 2, 14);
   g.setColor(new Color(180,0,60)  ) ; Stringer.drawString("1.",8,15) ;
   Stringer.fonts[0]=new Font("Dialog", 1, 12);
   g.setColor(new Color(0,0,80) ) ;
   Stringer.drawString("Муж и жена ( соответственно игроки 1 и 2 ) независимо ре-",20,15) ;
   Stringer.drawString("шают, куда пойти вечером - на балет (Б) или на футбол (Ф).",20,30) ;
   Stringer.drawString(" ",20,45) ;
   }
   if (shag==2){
     Stringer.fonts[0]=new Font("Dialog", 2, 14);
     g.setColor(new Color(180,0,60)  ) ; Stringer.drawString("2.",8,15) ;
     Stringer.fonts[0]=new Font("Dialog", 1, 12);
     g.setColor(new Color(0,0,80) ) ;
     Stringer.drawString("Если они вместе пойдут на футбол, то муж получит больше ",20,15) ;
     Stringer.drawString("удовольствия, чем жена; если оба на балет, то - жена.",20,30) ;
     Stringer.drawString("Если окажутся в разных местах, то не получат никакого ",20,45) ;
      Stringer.drawString("удовольствия. ",20,60) ;
     }
     if (shag==3){
         Stringer.fonts[0]=new Font("Dialog", 2, 14);
         g.setColor(new Color(180,0,60)  ) ; Stringer.drawString("3.",8,15) ;
         Stringer.fonts[0]=new Font("Dialog", 1, 12);
         g.setColor(new Color(0,0,80) ) ;
         Stringer.drawString("Рассмотрим игровую модель этого спора.В задаче предс- ",20,15) ;
         Stringer.drawString("тавлены два игрока. Игроки имеют одинаковые возможности ",13,30) ;
         Stringer.drawString("действий: пойти на футбол или пойти на балет. ",13,45) ;
          Stringer.drawString("Их множества действий равны X1 = X2 = ( Ф, Б ). ",13,60) ;
         }
       if (shag==4){
                 Stringer.fonts[0]=new Font("Dialog", 2, 14);
                 g.setColor(new Color(180,0,60)  ) ; Stringer.drawString("4.",8,15) ;
                 Stringer.fonts[0]=new Font("Dialog", 1, 12);
                 g.setColor(new Color(0,0,80) ) ;
                 Stringer.drawString("Обозначим числом  \u03B1  -  меру удовольствия,что получает ",20,15) ;
                 Stringer.drawString("муж от совместного посещения футбола. ",13,30) ;
                 Stringer.drawString("\u03B2  -  мера удовольствия, что получает жена от совместного ",13,45) ;
                  Stringer.drawString("посещения балета. ",13,60) ;
                 }
       if (shag==5){
        Stringer.fonts[0]=new Font("Dialog", 2, 14);
         g.setColor(new Color(180,0,60)  ) ; Stringer.drawString("5.",8,15) ;
          Stringer.fonts[0]=new Font("Dialog", 1, 12);
 a1=a-0-0+a*3;a2=a*3-0;param_a=(float)a2/a1;// param_a=(float)((int)(param_a*10000)/10000);
 b1=b-0-0+b/3;b2=b/3-0;param_b=(float)b2/b1;//param_b=((int)(param_b*100)/100);
 viigr_m=(param_b*a+(1-param_b)*0)*param_a+ (param_b*0+(1-param_b))*(a*3)*(1-param_a);
 viigr_m=(float)((int)(viigr_m*100)/100);
 viigr_g=(param_b*b+(1-param_b)*0)*param_a+ (param_b*0+(1-param_b))*(b/3)*(1-param_a);
 viigr_g=(float)((int)(viigr_g*100))/100;
// float vivod=param_b=((int)(param_b*1000)/10000);
         g.setColor(new Color(0,0,80) ) ;
           Stringer.drawString("Получим приемлемые стратегии для игроков:",20,15) ;
            Stringer.drawString("Для первого игрока:" +param_a,13,30) ;
             Stringer.drawString("Поэтому выигрыш первого игрока (мужа) равен "+viigr_m,13,45) ;
             Stringer.drawString("Соответственно выигрыш второго игрока (жены) := "+viigr_g,13,60) ;
             Stringer.drawString("Для второго игрока: "+param_b,170,30) ;
             //Stringer.drawString("q= ",100,60) ;
             }
     if (shag==6){
       a1=a-0-0+a*3;a2=a*3-0;param_a=(float)a2/a1;
      b1=b-0-0+b/3;b2=b/3-0;param_b=(float)b2/b1;
      viigr_m=(param_b*a+(1-param_b)*0)*param_a+ (param_b*0+(1-param_b))*(a*3)*(1-param_a);
      viigr_m=(float)((int)(viigr_m*100))/100;
      viigr_g=(param_b*b+(1-param_b)*0)*param_a+ (param_b*0+(1-param_b))*(b/3)*(1-param_a);
      viigr_g=(float)((int)(viigr_g*100))/100;
                             Stringer.fonts[0]=new Font("Dialog", 2, 14);
                              g.setColor(new Color(180,0,60)  ) ; Stringer.drawString("6.",8,15) ;
                              Stringer.fonts[0]=new Font("Dialog", 1, 12);
                              g.setColor(new Color(0,0,80) ) ;
     if (viigr_m>viigr_g)  {                      Stringer.drawString("Выигрыш мужа больше, значит он получает больше удоволь- ",20,15) ;
                              Stringer.drawString("ствия, чем жена. Следовательно, семье рекомендуется совместно  ",13,40) ;
                           Stringer.drawString("посетить футбол. ",13,65) ; }
      else{                        Stringer.drawString("Выигрыш жены больше,значит она получает больше удоволь-",20,15) ;
                               Stringer.drawString("ствия, чем муж. Следовательно, семье рекомендуется совместно ",13,40) ;
                           Stringer.drawString("посетить балет. ",13,65) ;}

              }
      if (shag==7){
                     Stringer.fonts[0]=new Font("Dialog", 2, 14);
                     g.setColor(new Color(180,0,60)  ) ; Stringer.drawString("4.",8,15) ;
                     Stringer.fonts[0]=new Font("Dialog", 1, 12);
                     g.setColor(new Color(0,0,80) ) ;
                     Stringer.drawString("Игровая модель данной задачи является бескоалиционной ",20,15) ;
                     Stringer.drawString("игрой, но это не антагонистическая игра,т.к. совместное  посе-",13,30) ;
                     Stringer.drawString("щение одного мероприятия даёт положительную меру ",13,45) ;
                      Stringer.drawString("удовольствия каждому,а раздельное проведение времени ",13,60) ;
                      Stringer.drawString("нулевое удовольствие.",13,75) ;
                     }



            }}
  //Start the applet
  public void start() {
  }

  //Stop the applet
  public void stop() {
  }

  //Destroy the applet
  public void destroy() {
  }

  //Get Applet information
  public String getAppletInfo() {
    return "Applet Information";
  }

  //Get parameter info
  public String[][] getParameterInfo() {
    return null;
  }

  void jButton2_actionPerformed(ActionEvent e) {
    shag=0;jButton1.setEnabled(false) ;
         jButton3.setEnabled(true) ;
        jPanel2.repaint() ;
  }

  void jButton1_actionPerformed(ActionEvent e) {
    shag--;
     if(shag==0) jButton1.setEnabled(false) ;
         if(shag!=0) jButton3.setEnabled(true) ;
      jPanel2.repaint() ;



  }

  void jButton3_actionPerformed(ActionEvent e) {
    if(shag<=6){shag++; jButton1.setEnabled(true) ;
      //jButton_next.setEnabled(true) ;
      jPanel2.repaint() ;}
    else jButton3.setEnabled(false) ;

  }

  void jScrollBar1_mouseDragged(MouseEvent e) {
jPanel1.repaint() ;jPanel2.repaint() ;
  }

  void jScrollBar1_mouseMoved(MouseEvent e) {
jPanel1.repaint() ;jPanel2.repaint() ;
  }

  void jScrollBar2_mouseDragged(MouseEvent e) {
jPanel1.repaint() ;jPanel2.repaint() ;
  }

  void jScrollBar2_mouseMoved(MouseEvent e) {
jPanel1.repaint() ;jPanel2.repaint() ;
  }




}

class ApplSemSpor_jButton2_actionAdapter implements java.awt.event.ActionListener {
  ApplSemSpor adaptee;

  ApplSemSpor_jButton2_actionAdapter(ApplSemSpor adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}

class ApplSemSpor_jButton1_actionAdapter implements java.awt.event.ActionListener {
  ApplSemSpor adaptee;

  ApplSemSpor_jButton1_actionAdapter(ApplSemSpor adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}

class ApplSemSpor_jButton3_actionAdapter implements java.awt.event.ActionListener {
  ApplSemSpor adaptee;

  ApplSemSpor_jButton3_actionAdapter(ApplSemSpor adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton3_actionPerformed(e);
  }

}

class ApplSemSpor_jScrollBar1_mouseMotionAdapter extends java.awt.event.MouseMotionAdapter {
  ApplSemSpor adaptee;

  ApplSemSpor_jScrollBar1_mouseMotionAdapter(ApplSemSpor adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseDragged(MouseEvent e) {
    adaptee.jScrollBar1_mouseDragged(e);
  }
  public void mouseMoved(MouseEvent e) {
    adaptee.jScrollBar1_mouseMoved(e);
  }
}

class ApplSemSpor_jScrollBar2_mouseMotionAdapter extends java.awt.event.MouseMotionAdapter {
  ApplSemSpor adaptee;

  ApplSemSpor_jScrollBar2_mouseMotionAdapter(ApplSemSpor adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseDragged(MouseEvent e) {
    adaptee.jScrollBar2_mouseDragged(e);
  }
  public void mouseMoved(MouseEvent e) {
    adaptee.jScrollBar2_mouseMoved(e);
  }
}
