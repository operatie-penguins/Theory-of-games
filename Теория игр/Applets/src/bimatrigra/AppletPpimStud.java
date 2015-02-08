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

public class AppletPpimStud extends JApplet {
  private boolean isStandalone = false;
  JLabel jLabel1 = new JLabel();
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  JButton jButton3 = new JButton();
  Panel_G jPanel1 = new Panel_G();
  Panel_R jPanel2 = new Panel_R();
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  Border border1;
int k=0;Image pic;int c,c1,c2,d,d1,d2;float a,b,f11,f12,f21,f22;

  //Get a parameter value
  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }

  //Construct the applet
  public AppletPpimStud() {
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
    border1 = BorderFactory.createLineBorder(new Color(157, 187, 255),1);
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setText("\"Студент-преподаватель\"");
    jLabel1.setBounds(new Rectangle(124, 4, 226, 24));
    this.getContentPane().setBackground(new Color(247, 247, 255));
    this.setSize(new Dimension(469, 457));
     this.getContentPane().setLayout(null);
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setBounds(new Rectangle(68, 423, 90, 23));
    jButton1.setEnabled(false);
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setText("<==");
    jButton1.addActionListener(new AppletPpimStud_jButton1_actionAdapter(this));
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setBounds(new Rectangle(169, 423, 118, 23));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setText("Обновить");
    jButton2.addActionListener(new AppletPpimStud_jButton2_actionAdapter(this));
    jButton3.setBackground(new Color(220, 230, 255));
    jButton3.setBounds(new Rectangle(298, 422, 102, 23));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setText("==>");
    jButton3.addActionListener(new AppletPpimStud_jButton3_actionAdapter(this));
    jPanel1.setBackground(Color.white);
    jPanel1.setBorder(border1);
    jPanel1.setBounds(new Rectangle(23, 39, 419, 294));
    jPanel2.setBackground(Color.white);
    jPanel2.setBorder(border1);
    jPanel2.setBounds(new Rectangle(22, 350, 420, 60));
    jLabel2.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel2.setForeground(new Color(180, 0, 60));
    jLabel2.setHorizontalAlignment(SwingConstants.LEADING);
    jLabel2.setText("Иллюстрация:");
    jLabel2.setBounds(new Rectangle(25, 23, 130, 16));
    jLabel3.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel3.setForeground(new Color(180, 0, 60));
    jLabel3.setPreferredSize(new Dimension(40, 15));
    jLabel3.setToolTipText("");
    jLabel3.setText("Задача:");
    jLabel3.setBounds(new Rectangle(25, 335, 65, 14));
    this.getContentPane().add(jLabel1, BorderLayout.NORTH);
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(jButton3, null);
    this.getContentPane().add(jPanel1, null);
    this.getContentPane().add(jPanel2, null);
    this.getContentPane().add(jLabel2, null);
    this.getContentPane().add(jLabel3, null);
  }
  class Panel_G extends JPanel {
         public void paintComponent(Graphics g){
          super.paintComponent(g);
          Stringer.setGraphics(g) ;
  if (k<=6){
    if (k>=1){  pic=getImage(getCodeBase(), "Stud.GIF");
              g.drawImage(pic,70,30,jPanel1);
              g.setColor(new Color(0,0,80) ) ;
              Stringer.drawString("Игрок А",75,20) ;
          }
          if (k>=3){  pic=getImage(getCodeBase(), "Pr.GIF");
              g.drawImage(pic,270,30,jPanel1);
              g.setColor(new Color(0,0,80) ) ;
              Stringer.drawString("Игрок B",275,20) ;
          }
          if (k>=4){   g.setColor(new Color(180,0,118) ) ;
                       Stringer.drawString("Стратегии:",170,130) ; g.setColor(new Color(0,0,80) ) ;
                        Stringer.drawString("(+) - подготовиться в зачету",35,150) ;
                         Stringer.drawString("(-) - не подготовиться к зачету",35,180) ;
                   }
                   if (k>=5){   g.setColor(new Color(0,0,80) ) ;
                                         // Stringer.drawString("Стратегии:",270,150) ;
                                           Stringer.drawString("(+) - поставить зачет",230,150) ;
                                            Stringer.drawString("(-) - не поставить зачета",230,180) ;
                   }}
             if (k<=8){
                   if (k>=7){  g.setColor(new Color(173,0,83) ) ;

           Stringer.drawString("Выигрыш Студента",150,30) ;
            g.setColor(new Color(0,0,80) ) ;
            Stringer.drawString("+",145,45) ;
              Stringer.drawString("-",265,45) ;
              g.drawLine(60,50,360,50) ;
               g.drawLine(80,35,80,90) ;
               Stringer.drawString("+",70,66) ;
              Stringer.drawString("-",70,86) ;
              Stringer.drawString("оценка заслужена",84,66) ;
              Stringer.drawString("очень обидно",225,66) ;
              Stringer.drawString("удалось обмануть",84,86) ;
              Stringer.drawString("оценка заслужена",225,86) ;
               }
               if (k>=8){  g.setColor(new Color(173,0,83) ) ;
                Stringer.drawString("Выигрыш Преподавателя",140,150) ;
                  g.setColor(new Color(0,0,80) ) ;
                 Stringer.drawString("+",145,165) ;
                   Stringer.drawString("-",265,165) ;
                   g.drawLine(60,170,360,170) ;
                    g.drawLine(80,155,80,210) ;
                    Stringer.drawString("+",70,186) ;
                   Stringer.drawString("-",70,206) ;
                   Stringer.drawString("все нормально",84,186) ;
                   Stringer.drawString("был неправ",225,186) ;
                   Stringer.drawString("дал себя обмануть",84,206) ;
                   Stringer.drawString("опять придет",225,206) ;}
                    }
                    if (k<=10){
                    if (k>=9){
                                   g.setColor(new Color(180,0,118) ) ;
                                  Stringer.drawString("Выигрыш Студента",150,30) ;
                                  g.setColor(new Color(0,0,80) ) ;
          Stringer.drawString("+",145,45) ;
            Stringer.drawString("-",265,45) ;
            g.drawLine(60,50,360,50) ;
             g.drawLine(80,35,80,90) ;
             Stringer.drawString("+",70,66) ;
            Stringer.drawString("-",70,86) ;
            Stringer.drawString("2",145,66) ;
            Stringer.drawString("-1",263,66) ;
            Stringer.drawString("1",145,86) ;
            Stringer.drawString("0",265,86) ;
                 }
                 if (k>=9){   g.setColor(new Color(180,0,118) ) ;
                                Stringer.drawString("Выигрыш Преподавателя",140,150) ;
                                g.setColor(new Color(0,0,80) ) ;
                                 Stringer.drawString("+",145,165) ;
                                   Stringer.drawString("-",265,165) ;
                                   g.drawLine(60,170,360,170) ;
                                    g.drawLine(80,155,80,210) ;
                                    Stringer.drawString("+",70,186) ;
                                   Stringer.drawString("-",70,206) ;
                                   Stringer.drawString("1",145,186) ;
                                   Stringer.drawString("-3",263,186) ;
                                   Stringer.drawString("-2",143,206) ;
                                   Stringer.drawString("-1",263,206) ;}

                    }


  }}
class Panel_R extends JPanel {
       public void paintComponent(Graphics g){
        super.paintComponent(g);
        Stringer.setGraphics(g) ;
        if (k==0){
                    Stringer.fonts[0]=new Font("Dialog", 1, 12);
                    g.setColor(new Color(0,0,80) ) ;
                     Stringer.drawString("Рассмотрим следующую ситуацию.",20,15) ;
                }
if(k<=3){
        if (k>=1){
            Stringer.fonts[0]=new Font("Dialog", 2, 14);
            g.setColor(new Color(180,0,60)  ) ;
           // Stringer.drawString("1.",8,15) ;
            Stringer.fonts[0]=new Font("Dialog", 1, 12);
            g.setColor(new Color(0,0,80) ) ;
             Stringer.drawString("Студент (игрок А) ",20,15) ;
        }
        if (k>=2){
                    Stringer.fonts[0]=new Font("Dialog", 1, 12);
                    g.setColor(new Color(0,0,80) ) ;
                     Stringer.drawString("готовится к зачету,",135,15) ;
                }
          if (k>=3){
                                  Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                  g.setColor(new Color(0,0,80) ) ;
                                   Stringer.drawString("который принимает Препо-",250,15) ;
                                     Stringer.drawString("даватель (игрок В). ",15,30) ;
                              }}

         if(k<=11){jLabel3.setText("Решение:");
           if (k==4){Stringer.fonts[0]=new Font("Dialog", 2, 14);
g.setColor(new Color(180,0,60)  ) ;
Stringer.drawString("1.",8,15) ;

            Stringer.fonts[0]=new Font("Dialog", 1, 12);
            g.setColor(new Color(0,0,80) ) ;
             Stringer.drawString("Можно считать, что у Студента две стратегии - подготовиться",20,15) ;
               Stringer.drawString("к сдаче зачета (+) и не подготовиться (-).",15,30) ;
                }

                if (k==5){Stringer.fonts[0]=new Font("Dialog", 2, 14);
g.setColor(new Color(180,0,60)  ) ;
Stringer.drawString("2.",8,15) ;

                  Stringer.fonts[0]=new Font("Dialog", 1, 12);
                  g.setColor(new Color(0,0,80) ) ;
                  Stringer.drawString("У Преподавателя также две стратегии - поставить зачет (+) и не ",20,15) ;
                  Stringer.drawString("поставить зачета (-).",15,30) ;
    }
    if (k==6){Stringer.fonts[0]=new Font("Dialog", 2, 14);
g.setColor(new Color(180,0,60)  ) ;
Stringer.drawString("3.",8,15) ;

                      Stringer.fonts[0]=new Font("Dialog", 1, 12);
                      g.setColor(new Color(0,0,80) ) ;
                      Stringer.drawString("В основу значений функций выигрыша игроков положим ",20,15) ;
                      Stringer.drawString("следующие соображения:",15,30) ;

    }
    if (k==7){Stringer.fonts[0]=new Font("Dialog", 2, 14);
g.setColor(new Color(180,0,60)  ) ;
Stringer.drawString("4.",8,15) ;

                        Stringer.fonts[0]=new Font("Dialog", 1, 12);
                        g.setColor(new Color(0,0,80) ) ;
                        Stringer.drawString("Выигрыш Студента:",20,15) ;
                      //  Stringer.drawString("следующие соображения:",15,30) ;
      }
      if (k==8){Stringer.fonts[0]=new Font("Dialog", 2, 14);
g.setColor(new Color(180,0,60)  ) ;
Stringer.drawString("5.",8,15) ;

                             Stringer.fonts[0]=new Font("Dialog", 1, 12);
                             g.setColor(new Color(0,0,80) ) ;
                             Stringer.drawString("Выигрыш Преподавателя:",20,15) ;}
     if (k==9){jPanel2.setBounds(new Rectangle(22, 350, 420, 60));
       Stringer.fonts[0]=new Font("Dialog", 2, 14);
g.setColor(new Color(180,0,60)  ) ;
Stringer.drawString("6.",8,15) ;

     Stringer.fonts[0]=new Font("Dialog", 1, 12);
       g.setColor(new Color(0,0,80) ) ;
         Stringer.drawString("Количественно это можно выразить, например, так :",20,15) ;
     }
    if (k==10){jPanel2.setBounds(new Rectangle(22, 350, 420, 70));
   int a11=2,a12=-1,a21=1,a22=0,b11=1,b12=-3,b21=-2,b22=-1;
   c=a11-a12-a21+a22;c1=a22-a12;c2=a22-a21;d=b11-b12-b21+b22;d1=b22-b12;d2=b22-b21;
   float p1=(float)1/5,p2=(float)4/5,q1=(float)1/2,q2=(float)1/2;
f11=(float)c*p1*q1-c1*p1-c2*q1+a22;f12=(float)c*p2*q2-c1*p2-c2*q2+a22;
f21=(float)d*p1*q1-d1*p1-d2*q1+b22;f22=(float)d*p2*q2-d1*p2-d2*q2+b22;
       Stringer.fonts[0]=new Font("Dialog", 2, 14);
g.setColor(new Color(180,0,60)  ) ;
Stringer.drawString("7.",8,15) ;

     Stringer.fonts[0]=new Font("Dialog", 1, 12);
       g.setColor(new Color(0,0,80) ) ;
         Stringer.drawString("Максимальный выигрыш "+f11+" будет соответствовать стратегии (+)(+):",20,15) ;
          Stringer.drawString("Студент-подготовиться к зачету, преподаватель- поставить зачет.",20,30) ;
         Stringer.drawString("Минимальный выигрыш "+f21+"-cтратегии (+)(-) :",20,45) ;
         Stringer.drawString("Студент-подготовиться к зачету, преподаватель-не поставить зачет.",20,60) ;
    //     Stringer.drawString("f21:"+f21,80,45) ;
  //    Stringer.drawString("f22:"+f22,150,45) ;
     }

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

  //static initializer for setting look & feel
  static {
    try {
      //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    }
    catch(Exception e) {
    }
  }

  void jButton1_actionPerformed(ActionEvent e) {
    if (k==0) jButton1.setEnabled(false);
            else {jButton1.setEnabled(true);
            jButton3.setEnabled(true);}
             if (k>0) k--;
          repaint();

  }

  void jButton2_actionPerformed(ActionEvent e) {
    k=0;jPanel2.setBounds(new Rectangle(22, 350, 420, 60));
           jButton3.setEnabled(true) ;
           jButton1.setEnabled(false) ;
           repaint();

  }

  void jButton3_actionPerformed(ActionEvent e) {
    k++;
              if (k>0) jButton1.setEnabled(true) ;
              if (k>=10) jButton3.setEnabled(false) ;
              jPanel1.repaint();
              jPanel2.repaint();

  }
}

class AppletPpimStud_jButton1_actionAdapter implements java.awt.event.ActionListener {
  AppletPpimStud adaptee;

  AppletPpimStud_jButton1_actionAdapter(AppletPpimStud adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}

class AppletPpimStud_jButton2_actionAdapter implements java.awt.event.ActionListener {
  AppletPpimStud adaptee;

  AppletPpimStud_jButton2_actionAdapter(AppletPpimStud adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}

class AppletPpimStud_jButton3_actionAdapter implements java.awt.event.ActionListener {
  AppletPpimStud adaptee;

  AppletPpimStud_jButton3_actionAdapter(AppletPpimStud adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton3_actionPerformed(e);
  }
}
