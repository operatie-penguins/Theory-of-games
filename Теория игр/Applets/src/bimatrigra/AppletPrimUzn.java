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

public class AppletPrimUzn extends JApplet {
  private boolean isStandalone = false;
  JLabel jLabel1 = new JLabel();
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  JButton jButton3 = new JButton();
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  Panel_I jPanel1 = new Panel_I();
  Panel_R jPanel2 = new Panel_R();
  Border border1;
 int k=0,srok=0;
  JLabel jLabel4 = new JLabel();
  JLabel jLabel5 = new JLabel();
  JScrollBar jScrollBar2 = new JScrollBar();
  JLabel jLabel6 = new JLabel();
  JLabel jLabel7 = new JLabel();
  //Get a parameter value
  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }

  //Construct the applet
  public AppletPrimUzn() {
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
    jLabel1.setText("\"Дилемма узников\"");
    jLabel1.setBounds(new Rectangle(123, 5, 170, 30));
    this.getContentPane().setBackground(new Color(247, 247, 255));
    this.setForeground(new Color(130, 0, 80));
    this.setSize(new Dimension(397, 408));
     this.getContentPane().setLayout(null);
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setBounds(new Rectangle(53, 365, 87, 23));
    jButton1.setEnabled(false);
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setText("<==");
    jButton1.addActionListener(new AppletPrimUzn_jButton1_actionAdapter(this));
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setBounds(new Rectangle(151, 365, 92, 23));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 80));
    jButton2.setText("Обновить");
    jButton2.addActionListener(new AppletPrimUzn_jButton2_actionAdapter(this));
    jButton3.setBackground(new Color(220, 230, 255));
    jButton3.setBounds(new Rectangle(255, 365, 86, 23));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setText("==>");
    jButton3.addActionListener(new AppletPrimUzn_jButton3_actionAdapter(this));
    jLabel2.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel2.setForeground(new Color(180, 0, 60));
    jLabel2.setIconTextGap(4);
    jLabel2.setText("Иллюстрация:");
    jLabel2.setBounds(new Rectangle(16, 33, 96, 26));
    jLabel3.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel3.setForeground(new Color(180, 0, 60));
    jLabel3.setText("Решение:");
    jLabel3.setBounds(new Rectangle(19, 220, 77, 15));
    jPanel1.setBackground(Color.white);
    jPanel1.setBorder(border1);
    jPanel1.setBounds(new Rectangle(17, 53, 365, 144));

    jPanel2.setBackground(Color.white);
    jPanel2.setBorder(border1);
    jPanel2.setBounds(new Rectangle(18, 236, 364, 117));
    jLabel4.setFont(new java.awt.Font("Dialog", 1, 12));
    jLabel4.setForeground(new Color(130, 0, 80));
    jLabel4.setMaximumSize(new Dimension(6, 15));
    jLabel4.setOpaque(false);
    jLabel4.setText("0");
    jLabel4.setBounds(new Rectangle(240, 221, 14, 14));
    jLabel5.setFont(new java.awt.Font("Dialog", 1, 12));
    jLabel5.setForeground(new Color(130, 0, 80));
    jLabel5.setText("10");
    jLabel5.setBounds(new Rectangle(315, 222, 25, 15));
    jScrollBar2.setBlockIncrement(10);
    jScrollBar2.setMaximum(20);
    jScrollBar2.setOrientation(JScrollBar.HORIZONTAL);
    jScrollBar2.setBackground(new Color(247, 247, 255));
    jScrollBar2.setFont(new java.awt.Font("MS Sans Serif", 0, 11));
    jScrollBar2.setMaximumSize(new Dimension(32767, 17));
    jScrollBar2.setMinimumSize(new Dimension(5, 17));
    jScrollBar2.setToolTipText("");
    jScrollBar2.setBounds(new Rectangle(239, 203, 92, 19));
    jScrollBar2.addMouseMotionListener(new AppletPrimUzn_jScrollBar2_mouseMotionAdapter(this));
    jLabel6.setFont(new java.awt.Font("Dialog", 1, 12));
    jLabel6.setForeground(new Color(130, 0, 80));
    jLabel6.setText("");
    jLabel6.setBounds(new Rectangle(200, 201, 39, 18));
    jLabel7.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel7.setForeground(new Color(180, 0, 60));
    jLabel7.setText("Время ");
    jLabel7.setBounds(new Rectangle(138, 201, 56, 20));
    this.getContentPane().add(jLabel1, BorderLayout.NORTH);
    this.getContentPane().add(jLabel2, null);
    this.getContentPane().add(jPanel1, null);
    this.getContentPane().add(jPanel2, null);
    this.getContentPane().add(jLabel3, null);
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jButton3, null);
    this.getContentPane().add(jLabel6, null);
    this.getContentPane().add(jLabel4, null);
    this.getContentPane().add(jLabel5, null);
    this.getContentPane().add(jScrollBar2, null);
    this.getContentPane().add(jLabel7, null);
  }

  class Panel_I extends JPanel {
     public void paintComponent(Graphics g){
      super.paintComponent(g);
       Stringer.fonts[0]=new Font("Dialog", 1, 12);
        Stringer.setGraphics(g) ;
srok=jScrollBar2.getValue() ;
if (srok!=0)jLabel6.setText("t = "+srok) ;
      g.setColor(new Color(0,0,80)  ) ;
  if(k<=3){    if (k>=1){
                          Stringer.fonts[0]=new Font("Dialog", 1, 12);
                          g.setColor(new Color(0,0,80) ) ;
                           Stringer.drawString("Первый игрок",50,15) ;
                            Stringer.drawString("Второй игрок",200,15) ;
                      }
                      if (k>=3){
                                                Stringer.fonts[0]=new Font("Dialog",2, 14);
                                                g.setColor(new Color(130,0,80) ) ;
                                                 Stringer.drawString("Заговорят или будут молчать?",70,60) ;
                                                //  Stringer.drawString("Второй игрок",200,15) ;
                                            }}
 if (k<=9){       if (k>=4){
         Stringer.fonts[0]=new Font("Dialog",1, 12);
         g.setColor(new Color(130,0,80) ) ;
         g.drawLine(30,50,170,50) ;
        g.drawLine(45,40,45,100) ;
        g.drawLine(200,50,340,50) ;
        g.drawLine(215,40,215,100) ;  Stringer.drawString("Молчать(М) или говорить (Г)",100,15) ;
         g.setColor(new Color(0,0,80) ) ;
          Stringer.drawString("(М)                 (Г)",60,48) ;
          Stringer.drawString("(М)                 (Г)",230,48) ;
          Stringer.drawString("(М)",27,65) ;
           Stringer.drawString("(М)",197,65) ;
           Stringer.drawString("(Г)",27,90) ;
           Stringer.drawString("(Г)",197,90) ;
           Stringer.drawString("-1",65,65) ;
           Stringer.drawString("-1",235,65) ;
           Stringer.drawString("0",65,90) ;
           Stringer.drawString("-9",235,90) ;
           Stringer.drawString("-9",130,65) ;
          Stringer.drawString("0",300,65) ;
          Stringer.drawString("-6",130,90) ;
          Stringer.drawString("-6",300,90) ;
          Stringer.drawString("Первый игрок",50,130) ;
          Stringer.drawString("Второй игрок",200,130) ;

          //  Stringer.drawString("Второй игрок",200,15) ;
                            }
if (k==5){ g.setColor(Color.BLUE  ) ;
  g.drawRect(65,50,15,15) ;
  g.drawRect(235,50,15,15) ;
     }
     if (k==6){ g.setColor(Color.BLUE  ) ;
  g.drawRect(122,77,20,20) ;
  g.drawRect(297,77,20,20) ;
     }
     if (k==7){ g.setColor(Color.BLUE  ) ;
      g.drawRect(60,79,20,20) ;
     // g.drawRect(297,77,20,20) ;
         }
         if (k==8){ g.setColor(Color.BLUE  ) ;
              g.drawRect(234,77,20,20) ;
             // g.drawRect(297,77,20,20) ;
                 }

 }
 if (((k==10)||(k==11)||(k==12))&&(srok==1)){
          Stringer.fonts[0]=new Font("Dialog",1, 12);
          g.setColor(new Color(130,0,80) ) ;
          g.drawLine(30,50,170,50) ;
         g.drawLine(45,40,45,100) ;
         g.drawLine(200,50,340,50) ;
         g.drawLine(215,40,215,100) ;  Stringer.drawString("Молчать(М) или говорить (Г)",100,15) ;
          g.setColor(new Color(0,0,80) ) ;
           Stringer.drawString("(М)                 (Г)",60,48) ;
           Stringer.drawString("(М)                 (Г)",230,48) ;
           Stringer.drawString("(М)",27,65) ;
            Stringer.drawString("(М)",197,65) ;
            Stringer.drawString("(Г)",27,90) ;
            Stringer.drawString("(Г)",197,90) ;
            Stringer.drawString("-1",65,65) ;
            Stringer.drawString("-1",235,65) ;
            Stringer.drawString("0",65,90) ;
            Stringer.drawString("-2",235,90) ;
            Stringer.drawString("-2",130,65) ;
           Stringer.drawString("0",300,65) ;
           Stringer.drawString("-1",130,90) ;
           Stringer.drawString("-1",300,90) ;
           Stringer.drawString("Первый игрок",50,130) ;
           Stringer.drawString("Второй игрок",200,130) ;
 }
 if (((k==10)||(k==11)||(k==12))&&(srok==2)){
           Stringer.fonts[0]=new Font("Dialog",1, 12);
           g.setColor(new Color(130,0,80) ) ;
           g.drawLine(30,50,170,50) ;
          g.drawLine(45,40,45,100) ;
          g.drawLine(200,50,340,50) ;
          g.drawLine(215,40,215,100) ;  Stringer.drawString("Молчать(М) или говорить (Г)",100,15) ;
           g.setColor(new Color(0,0,80) ) ;
            Stringer.drawString("(М)                 (Г)",60,48) ;
            Stringer.drawString("(М)                 (Г)",230,48) ;
            Stringer.drawString("(М)",27,65) ;
             Stringer.drawString("(М)",197,65) ;
             Stringer.drawString("(Г)",27,90) ;
             Stringer.drawString("(Г)",197,90) ;
             Stringer.drawString("-1",65,65) ;
             Stringer.drawString("-1",235,65) ;
             Stringer.drawString("0",65,90) ;
             Stringer.drawString("-3",235,90) ;
             Stringer.drawString("-3",130,65) ;
            Stringer.drawString("0",300,65) ;
            Stringer.drawString("-2",130,90) ;
            Stringer.drawString("-2",300,90) ;
            Stringer.drawString("Первый игрок",50,130) ;
            Stringer.drawString("Второй игрок",200,130) ;
  }
  if (((k==10)||(k==11)||(k==12))&&(srok==3)){
             Stringer.fonts[0]=new Font("Dialog",1, 12);
             g.setColor(new Color(130,0,80) ) ;
             g.drawLine(30,50,170,50) ;
            g.drawLine(45,40,45,100) ;
            g.drawLine(200,50,340,50) ;
            g.drawLine(215,40,215,100) ;  Stringer.drawString("Молчать(М) или говорить (Г)",100,15) ;
             g.setColor(new Color(0,0,80) ) ;
              Stringer.drawString("(М)                 (Г)",60,48) ;
              Stringer.drawString("(М)                 (Г)",230,48) ;
              Stringer.drawString("(М)",27,65) ;
               Stringer.drawString("(М)",197,65) ;
               Stringer.drawString("(Г)",27,90) ;
               Stringer.drawString("(Г)",197,90) ;
               Stringer.drawString("-1",65,65) ;
               Stringer.drawString("-1",235,65) ;
               Stringer.drawString("0",65,90) ;
               Stringer.drawString("-4",235,90) ;
               Stringer.drawString("-4",130,65) ;
              Stringer.drawString("0",300,65) ;
              Stringer.drawString("-3",130,90) ;
              Stringer.drawString("-3",300,90) ;
              Stringer.drawString("Первый игрок",50,130) ;
              Stringer.drawString("Второй игрок",200,130) ;
    }
    if (((k==10)||(k==11)||(k==12))&&(srok==4)){
                 Stringer.fonts[0]=new Font("Dialog",1, 12);
                 g.setColor(new Color(130,0,80) ) ;
                 g.drawLine(30,50,170,50) ;
                g.drawLine(45,40,45,100) ;
                g.drawLine(200,50,340,50) ;
                g.drawLine(215,40,215,100) ;  Stringer.drawString("Молчать(М) или говорить (Г)",100,15) ;
                 g.setColor(new Color(0,0,80) ) ;
                  Stringer.drawString("(М)                 (Г)",60,48) ;
                  Stringer.drawString("(М)                 (Г)",230,48) ;
                  Stringer.drawString("(М)",27,65) ;
                   Stringer.drawString("(М)",197,65) ;
                   Stringer.drawString("(Г)",27,90) ;
                   Stringer.drawString("(Г)",197,90) ;
                   Stringer.drawString("-1",65,65) ;
                   Stringer.drawString("-1",235,65) ;
                   Stringer.drawString("0",65,90) ;
                   Stringer.drawString("-5",235,90) ;
                   Stringer.drawString("-5",130,65) ;
                  Stringer.drawString("0",300,65) ;
                  Stringer.drawString("-4",130,90) ;
                  Stringer.drawString("-4",300,90) ;
                  Stringer.drawString("Первый игрок",50,130) ;
                  Stringer.drawString("Второй игрок",200,130) ;
        }
   if (((k==10)||(k==11)||(k==12))&&(srok==5)){
                         Stringer.fonts[0]=new Font("Dialog",1, 12);
                         g.setColor(new Color(130,0,80) ) ;
                         g.drawLine(30,50,170,50) ;
                        g.drawLine(45,40,45,100) ;
                        g.drawLine(200,50,340,50) ;
                        g.drawLine(215,40,215,100) ;  Stringer.drawString("Молчать(М) или говорить (Г)",100,15) ;
                         g.setColor(new Color(0,0,80) ) ;
                          Stringer.drawString("(М)                 (Г)",60,48) ;
                          Stringer.drawString("(М)                 (Г)",230,48) ;
                          Stringer.drawString("(М)",27,65) ;
                           Stringer.drawString("(М)",197,65) ;
                           Stringer.drawString("(Г)",27,90) ;
                           Stringer.drawString("(Г)",197,90) ;
                           Stringer.drawString("-1",65,65) ;
                           Stringer.drawString("-1",235,65) ;
                           Stringer.drawString("0",65,90) ;
                           Stringer.drawString("-6",235,90) ;
                           Stringer.drawString("-6",130,65) ;
                          Stringer.drawString("0",300,65) ;
                          Stringer.drawString("-5",130,90) ;
                          Stringer.drawString("-5",300,90) ;
                          Stringer.drawString("Первый игрок",50,130) ;
                          Stringer.drawString("Второй игрок",200,130) ;
                }
   if (((k==10)||(k==11)||(k==12))&&(srok==6)){
                                        Stringer.fonts[0]=new Font("Dialog",1, 12);
                                        g.setColor(new Color(130,0,80) ) ;
                                        g.drawLine(30,50,170,50) ;
                                       g.drawLine(45,40,45,100) ;
                                       g.drawLine(200,50,340,50) ;
                                       g.drawLine(215,40,215,100) ;  Stringer.drawString("Молчать(М) или говорить (Г)",100,15) ;
                                        g.setColor(new Color(0,0,80) ) ;
                                         Stringer.drawString("(М)                 (Г)",60,48) ;
                                         Stringer.drawString("(М)                 (Г)",230,48) ;
                                         Stringer.drawString("(М)",27,65) ;
                                          Stringer.drawString("(М)",197,65) ;
                                          Stringer.drawString("(Г)",27,90) ;
                                          Stringer.drawString("(Г)",197,90) ;
                                          Stringer.drawString("-1",65,65) ;
                                          Stringer.drawString("-1",235,65) ;
                                          Stringer.drawString("0",65,90) ;
                                          Stringer.drawString("-7",235,90) ;
                                          Stringer.drawString("-7",130,65) ;
                                         Stringer.drawString("0",300,65) ;
                                         Stringer.drawString("-6",130,90) ;
                                         Stringer.drawString("-6",300,90) ;
                                         Stringer.drawString("Первый игрок",50,130) ;
                                         Stringer.drawString("Второй игрок",200,130) ;
                               }
 if (((k==10)||(k==11)||(k==12))&&(srok==7)){
                                                       Stringer.fonts[0]=new Font("Dialog",1, 12);
                                                       g.setColor(new Color(130,0,80) ) ;
                                                       g.drawLine(30,50,170,50) ;
                                                      g.drawLine(45,40,45,100) ;
                                                      g.drawLine(200,50,340,50) ;
                                                      g.drawLine(215,40,215,100) ;  Stringer.drawString("Молчать(М) или говорить (Г)",100,15) ;
                                                       g.setColor(new Color(0,0,80) ) ;
                                                        Stringer.drawString("(М)                 (Г)",60,48) ;
                                                        Stringer.drawString("(М)                 (Г)",230,48) ;
                                                        Stringer.drawString("(М)",27,65) ;
                                                         Stringer.drawString("(М)",197,65) ;
                                                         Stringer.drawString("(Г)",27,90) ;
                                                         Stringer.drawString("(Г)",197,90) ;
                                                         Stringer.drawString("-1",65,65) ;
                                                         Stringer.drawString("-1",235,65) ;
                                                         Stringer.drawString("0",65,90) ;
                                                         Stringer.drawString("-8",235,90) ;
                                                         Stringer.drawString("-8",130,65) ;
                                                        Stringer.drawString("0",300,65) ;
                                                        Stringer.drawString("-6",130,90) ;
                                                        Stringer.drawString("-6",300,90) ;
                                                        Stringer.drawString("Первый игрок",50,130) ;
                                                        Stringer.drawString("Второй игрок",200,130) ;
                                              }
if (((k==10)||(k==11)||(k==12))&&(srok==8)){
 Stringer.fonts[0]=new Font("Dialog",1, 12);
  g.setColor(new Color(130,0,80) ) ;
   g.drawLine(30,50,170,50) ;
   g.drawLine(45,40,45,100) ;
   g.drawLine(200,50,340,50) ;
   g.drawLine(215,40,215,100) ;  Stringer.drawString("Молчать(М) или говорить (Г)",100,15) ;
   g.setColor(new Color(0,0,80) ) ;
    Stringer.drawString("(М)                 (Г)",60,48) ;
     Stringer.drawString("(М)                 (Г)",230,48) ;
      Stringer.drawString("(М)",27,65) ;
      Stringer.drawString("(М)",197,65) ;
      Stringer.drawString("(Г)",27,90) ;
      Stringer.drawString("(Г)",197,90) ;
      Stringer.drawString("-1",65,65) ;
      Stringer.drawString("-1",235,65) ;
      Stringer.drawString("0",65,90) ;
      Stringer.drawString("-9",235,90) ;
      Stringer.drawString("-9",130,65) ;
      Stringer.drawString("0",300,65) ;
      Stringer.drawString("-6",130,90) ;
      Stringer.drawString("-6",300,90) ;
      Stringer.drawString("Первый игрок",50,130) ;
      Stringer.drawString("Второй игрок",200,130) ;
      }
      if (((k==10)||(k==11)||(k==12))&&(srok==9)){
       Stringer.fonts[0]=new Font("Dialog",1, 12);
        g.setColor(new Color(130,0,80) ) ;
         g.drawLine(30,50,170,50) ;
         g.drawLine(45,40,45,100) ;
         g.drawLine(200,50,340,50) ;
         g.drawLine(215,40,215,100) ;  Stringer.drawString("Молчать(М) или говорить (Г)",100,15) ;
         g.setColor(new Color(0,0,80) ) ;
          Stringer.drawString("(М)                 (Г)",60,48) ;
           Stringer.drawString("(М)                 (Г)",230,48) ;
            Stringer.drawString("(М)",27,65) ;
            Stringer.drawString("(М)",197,65) ;
            Stringer.drawString("(Г)",27,90) ;
            Stringer.drawString("(Г)",197,90) ;
            Stringer.drawString("-1",65,65) ;
            Stringer.drawString("-1",235,65) ;
            Stringer.drawString("0",65,90) ;
            Stringer.drawString("-10",235,90) ;
            Stringer.drawString("-10",130,65) ;
            Stringer.drawString("0",300,65) ;
            Stringer.drawString("-6",130,90) ;
            Stringer.drawString("-6",300,90) ;
            Stringer.drawString("Первый игрок",50,130) ;
            Stringer.drawString("Второй игрок",200,130) ;
            }
   if (((k==10)||(k==11)||(k==12))&&(srok==10)){
                  Stringer.fonts[0]=new Font("Dialog",1, 12);
                   g.setColor(new Color(130,0,80) ) ;
                    g.drawLine(30,50,170,50) ;
                    g.drawLine(45,40,45,100) ;
                    g.drawLine(200,50,340,50) ;
                    g.drawLine(215,40,215,100) ;  Stringer.drawString("Молчать(М) или говорить (Г)",100,15) ;
                    g.setColor(new Color(0,0,80) ) ;
                     Stringer.drawString("(М)                 (Г)",60,48) ;
                      Stringer.drawString("(М)                 (Г)",230,48) ;
                       Stringer.drawString("(М)",27,65) ;
                       Stringer.drawString("(М)",197,65) ;
                       Stringer.drawString("(Г)",27,90) ;
                       Stringer.drawString("(Г)",197,90) ;
                       Stringer.drawString("-1",65,65) ;
                       Stringer.drawString("-1",235,65) ;
                       Stringer.drawString("0",65,90) ;
                       Stringer.drawString("-11",235,90) ;
                       Stringer.drawString("-11",130,65) ;
                       Stringer.drawString("0",300,65) ;
                       Stringer.drawString("-6",130,90) ;
                       Stringer.drawString("-6",300,90) ;
                       Stringer.drawString("Первый игрок",50,130) ;
                       Stringer.drawString("Второй игрок",200,130) ;
                       }

    }
      }
 class Panel_R extends JPanel {
             public void paintComponent(Graphics g){
              super.paintComponent(g);
              Stringer.setGraphics(g) ;
            srok=jScrollBar2.getValue() ;
 if (k==0){
                          Stringer.fonts[0]=new Font("Dialog", 1, 12);
                          g.setColor(new Color(0,0,80) ) ;
                           Stringer.drawString("Рассмотрим следующую ситуацию.",20,15) ;
                      }
 if(k<=3){           if (k>=1){
                                           Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                           g.setColor(new Color(0,0,80) ) ;
                                            Stringer.drawString("Игроками являются два узника,",20,15) ;
 }  if (k>=2){
        Stringer.fonts[0]=new Font("Dialog", 1, 12);
         g.setColor(new Color(0,0,80) ) ;
         Stringer.drawString("находящихся в предвари-",210,15) ;
          Stringer.drawString("тельном заключении по подозрению в совершении преступ-",10,30) ;
           Stringer.drawString("ления.",10,45) ;
          }
          if (k>=3){
               Stringer.fonts[0]=new Font("Dialog", 1, 12);
                g.setColor(new Color(0,0,80) ) ;
                Stringer.drawString("При отсутствии прямых улик возможность их осуж- ",50,45) ;
                 Stringer.drawString("дения в большей степени зависит от того, заговорят они ",10,60) ;
                  Stringer.drawString("или будут молчать.",10,75) ;
                 }
 }
 if (k==4){Stringer.fonts[0]=new Font("Dialog", 2, 14);
g.setColor(new Color(180,0,60)  ) ;
Stringer.drawString("1.",8,15) ;
               Stringer.fonts[0]=new Font("Dialog", 1, 12);
                g.setColor(new Color(0,0,80) ) ;
                Stringer.drawString("Выигрыши игроков А и В соответственно описываются  ",20,15) ;
                 Stringer.drawString("так: ",10,30) ;
                  }
 if (k==5){Stringer.fonts[0]=new Font("Dialog", 2, 14);
g.setColor(new Color(180,0,60)  ) ;
Stringer.drawString("2.",8,15) ;

               Stringer.fonts[0]=new Font("Dialog", 1, 12);
                g.setColor(new Color(0,0,80) ) ;
                Stringer.drawString("Если оба будут молчать, то наказанием будет лишь срок ",20,15) ;
                 Stringer.drawString("предварительного заключения (потери каждого из узников ",10,45) ;
                  Stringer.drawString("составят (-1)).",10,75) ;
                 }
                 if (k==6){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                g.setColor(new Color(180,0,60)  ) ;
                Stringer.drawString("3.",8,15) ;
                               Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                g.setColor(new Color(0,0,80) ) ;
                                Stringer.drawString("Если cознаются, то получат срок, учитывающий призна- ",20,15) ;
                                 Stringer.drawString("ние как смягчающее обстоятельство (потери каждого из  ",10,45) ;
                                  Stringer.drawString("узников составят (-6)).",10,75) ;
             }
                  if (k==7){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                                g.setColor(new Color(180,0,60)  ) ;
                                                Stringer.drawString("4.",8,15) ;
                                                               Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                                                g.setColor(new Color(0,0,80) ) ;
                                                                Stringer.drawString("Если же заговорит только один из узников, а другой будет ",20,15) ;
                                                                 Stringer.drawString("молчать, то в этом случае заговоривший будет выпущен",10,45) ;
                                                                  Stringer.drawString("на свободу (его потери равны (0)).",10,75) ;
                                                                 }
                                                                 if (k==8){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                                                                                                g.setColor(new Color(180,0,60)  ) ;
                                           Stringer.drawString("5.",8,15) ;

                          Stringer.fonts[0]=new Font("Dialog", 1, 12);
                          g.setColor(new Color(0,0,80) ) ;
                          Stringer.drawString("А сохранивший молчание получит максимально возмож-",20,15) ;
                          Stringer.drawString("ное наказание (его потери равны (-9))",10,45) ;
                             }
  if (k==9){Stringer.fonts[0]=new Font("Dialog", 2, 14);
   g.setColor(new Color(180,0,60)  ) ;
   Stringer.drawString("5.",8,15) ;
   Stringer.fonts[0]=new Font("Dialog", 1, 12);
   g.setColor(new Color(0,0,80) ) ;
   Stringer.drawString("Эта конфликтная ситуация приводит к биматричной игре, ",20,15) ;
   Stringer.drawString(" в которой каждый из игроков имеет по две стратегии -",10,45) ;
    Stringer.drawString("молчать или говорить.",10,75) ;
     }
     if (k==10){Stringer.fonts[0]=new Font("Dialog", 2, 14);
       g.setColor(new Color(180,0,60)  ) ;
       Stringer.drawString("6.",8,15) ;
       Stringer.fonts[0]=new Font("Dialog", 1, 12);
       g.setColor(new Color(0,0,80) ) ;
       Stringer.drawString("Теперь проанализируем задачу при наличии времени, т.е. ",20,15) ;
       Stringer.drawString("срока заключения.",10,45) ;
      if(srok==0)Stringer.drawString("Выберите срок заключения.",10,75) ;
        if(srok==1)   Stringer.drawString("Срок заключения равен "+srok + " год.",10,75) ;
        if((srok==2)||(srok==3)||(srok==4))   Stringer.drawString("Срок заключения равен "+srok + " года.",10,75) ;
     if((srok==5)||(srok==6)||(srok==7)||(srok==8)||(srok==9)||(srok==10))   Stringer.drawString("Срок заключения равен "+srok +  " лет.",10,75) ;
      }
if ((k==11)&&(srok==1)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
             g.setColor(new Color(180,0,60)  ) ;
             Stringer.drawString("7.",8,15) ;

             Stringer.fonts[0]=new Font("Dialog", 1, 12);
             g.setColor(new Color(0,0,80) ) ;
             Stringer.drawString("При этом сроке заключения максимальное наказание -2. ",20,15) ;
                             Stringer.drawString("Для получения наименьшего проигрыша обоим игрокам ",10,30) ;
                             Stringer.drawString("стоит признаться или сохранять молчание. Проигрыш в обо-",10,45) ;
                             Stringer.drawString("их случаях равен (-1). Для каждого отдельно будет выгод- ",10,60) ;
              Stringer.drawString("но в случае признания выйти на свободу, но это только при",10,75) ;
             Stringer.drawString(" условии, что второй промолчит ( промолчавший получит ",10,90) ;
             Stringer.drawString(" максимальное наказание - самая невыгодная стратегия).",10,105) ;
}
   if ((k==12)&&(srok==1)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                     g.setColor(new Color(180,0,60)  ) ;
                     Stringer.drawString("8.",8,15) ;
                     Stringer.fonts[0]=new Font("Dialog", 1, 12);
                     g.setColor(new Color(0,0,80) ) ;
                     Stringer.drawString("Поэтому они могут признаться при сроке заключения 1 ",20,15) ;
                      Stringer.drawString("год. Признание будет учитываться как смягчающее обстоя-  ",10,30) ;
                     Stringer.drawString("тельство, значит общий срок заключения будет невелик. ",10,45);
   }
   if ((k==11)&&(srok==2)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                g.setColor(new Color(180,0,60)  ) ;
                Stringer.drawString("7.",8,15) ;

                Stringer.fonts[0]=new Font("Dialog", 1, 12);
                g.setColor(new Color(0,0,80) ) ;
                Stringer.drawString("При этом сроке заключения максимальное наказание -3. ",20,15) ;
                               Stringer.drawString("Для получения наименьшего проигрыша обоим игрокам ",10,30) ;
                                Stringer.drawString("стоит сохранять молчание. Проигрыш равен (-1). Для",10,45) ;
                                Stringer.drawString("каждого отдельно будет выгодно в случае признания ",10,60) ;
                 Stringer.drawString("выйти на свободу, но это только при условии, что" ,10,75) ;
                Stringer.drawString(" второй промолчит ( промолчавший получит максимальное",10,90) ;
                Stringer.drawString(" наказание - самая невыгодная стратегия).",10,105) ;



    }
      if ((k==12)&&(srok==2)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                        g.setColor(new Color(180,0,60)  ) ;
                        Stringer.drawString("8.",8,15) ;

                        Stringer.fonts[0]=new Font("Dialog", 1, 12);
                        g.setColor(new Color(0,0,80) ) ;
                        Stringer.drawString("Если они признаются при сроке заключения 2 года, ",20,15) ;
                         Stringer.drawString("признание будет учитываться как смягчающее обстоятель-  ",10,30) ;
                        Stringer.drawString("ство, значит общий срок заключения будет больше года. ",10,45);
      }
 if ((k==11)&&(srok==3)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                     g.setColor(new Color(180,0,60)  ) ;
                     Stringer.drawString("7.",8,15) ;

                     Stringer.fonts[0]=new Font("Dialog", 1, 12);
                     g.setColor(new Color(0,0,80) ) ;
                     Stringer.drawString("При этом сроке заключения максимальное наказание (-4). ",20,15) ;
                                     Stringer.drawString("Для получения наименьшего проигрыша обоим игрокам ",10,30) ;
                                     Stringer.drawString("стоит сохранять молчание. Проигрыш равен (-1). Для",10,45) ;
                                     Stringer.drawString("каждого отдельно будет выгодно в случае признания ",10,60) ;
                      Stringer.drawString("выйти на свободу, но это только при условии, что второй" ,10,75) ;
                     Stringer.drawString(" промолчит ( промолчавший получит максимальное",10,90) ;
                    Stringer.drawString(" наказание - самая невыгодная стратегия).",10,105) ;
         }
  if ((k==12)&&(srok==3)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                             g.setColor(new Color(180,0,60)  ) ;
                             Stringer.drawString("8.",8,15) ;
                             Stringer.fonts[0]=new Font("Dialog", 1, 12);
                             g.setColor(new Color(0,0,80) ) ;
                             Stringer.drawString("Если они признаются при сроке заключения 3 года, ",20,15) ;
                              Stringer.drawString("признание будет учитываться как смягчающее обстоятель-  ",10,30) ;
                             Stringer.drawString("ство, значит общий срок заключения будет больше 2 лет. ",10,45);
                             Stringer.drawString("Это не лучшая стратегия.",10,60);
           }
 if ((k==11)&&(srok==4)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                         g.setColor(new Color(180,0,60)  ) ;
                         Stringer.drawString("7.",8,15) ;
                         Stringer.fonts[0]=new Font("Dialog", 1, 12);
                         g.setColor(new Color(0,0,80) ) ;
                         Stringer.drawString("Максимальное наказание равно (-5). Если оба заключен - ",20,15) ;
                         Stringer.drawString( "ных будут сохранять молчание, это будет их наилучшей  ",10,30) ;
                         Stringer.drawString("совместной стратегией. Проигрыш равен (-1). Но если каж - ",10,45) ;
                         Stringer.drawString("дый будет действовать отдельно,то ему выгодно признать- ",10,60) ;
                         Stringer.drawString("ся но это только при условии, что второй промолчит (про -  " ,10,75) ;
                         Stringer.drawString("молчавший получит максимальное наказание  - самая ",10,90) ;
                         Stringer.drawString(" невыгодная стратегия). ",10,105) ;
                    }
 if ((k==12)&&(srok==4)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                         g.setColor(new Color(180,0,60)  ) ;
                         Stringer.drawString("8.",8,15) ;
                         Stringer.fonts[0]=new Font("Dialog", 1, 12);
                         g.setColor(new Color(0,0,80) ) ;
                         Stringer.drawString("При сроке заключения 4 года признаваться обоим не  ",20,15) ;
                         Stringer.drawString("выгодно. Это не лучшая стратегия.",10,30) ;
                         Stringer.drawString(" ",10,45);
                         Stringer.drawString("",10,45);
                      }
  if ((k==11)&&(srok==5)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
   g.setColor(new Color(180,0,60)  ) ;
    Stringer.drawString("7.",8,15) ;
    Stringer.fonts[0]=new Font("Dialog", 1, 12);
    g.setColor(new Color(0,0,80) ) ;
    Stringer.drawString("Если оба заключенных будут сохранять молчание, это ",20,15) ;
    Stringer.drawString( "будет их наилучшей совместной стратегией. Проигрыш при",10,30) ;
    Stringer.drawString("этом равен (-1). Но если каждый будет действовать отдель-",10,45) ;
    Stringer.drawString("но,то ему выгодно признаться, но это только при условии,",10,60) ;
    Stringer.drawString("что второй промолчит (промолчавший получит максималь- " ,10,75) ;
    Stringer.drawString("ное наказание (-6) - самая невыгодная стратегия).",10,90) ;
    Stringer.drawString("  ",10,105) ;
     }
   if ((k==12)&&(srok==5)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
   g.setColor(new Color(180,0,60)  ) ;
   Stringer.drawString("8.",8,15) ;
   Stringer.fonts[0]=new Font("Dialog", 1, 12);
   g.setColor(new Color(0,0,80) ) ;
   Stringer.drawString("При сроке заключения 5 года признаваться обоим не  ",20,15) ;
   Stringer.drawString("выгодно. Это не лучшая стратегия.",10,30) ;
   Stringer.drawString(" ",10,45);
   Stringer.drawString("",10,45);
   }

   if ((k==11)&&(srok==6)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                          g.setColor(new Color(180,0,60)  ) ;
                          Stringer.drawString("7.",8,15) ;
                          Stringer.fonts[0]=new Font("Dialog", 1, 12);
                          g.setColor(new Color(0,0,80) ) ;
                          Stringer.drawString("Максимальное наказание равно (-7). Если оба заключен - ",20,15) ;
                          Stringer.drawString( "ных будут сохранять молчание, это будет их наилучшей  ",10,30) ;
                          Stringer.drawString("совместной стратегией. Проигрыш равен (-1). Но если каж - ",10,45) ;
                          Stringer.drawString("дый будет действовать отдельно,то ему выгодно признать- ",10,60) ;
                          Stringer.drawString("ся но это только при условии, что второй промолчит (про -  " ,10,75) ;
                          Stringer.drawString("молчавший получит максимальное наказание  - самая ",10,90) ;
                          Stringer.drawString(" невыгодная стратегия). ",10,105) ;
                     }
  if ((k==12)&&(srok==6)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                          g.setColor(new Color(180,0,60)  ) ;
                          Stringer.drawString("8.",8,15) ;
                          Stringer.fonts[0]=new Font("Dialog", 1, 12);
                          g.setColor(new Color(0,0,80) ) ;
                          Stringer.drawString("При сроке заключения 6 лет признаваться обоим не  ",20,15) ;
                          Stringer.drawString("выгодно. Это не лучшая стратегия.",10,30) ;
                          Stringer.drawString(" ",10,45);
                          Stringer.drawString("",10,45);
                       }


  if ((k==11)&&(srok==7)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                            g.setColor(new Color(180,0,60)  ) ;
                             Stringer.drawString("7.",8,15) ;
                             Stringer.fonts[0]=new Font("Dialog", 1, 12);
                             g.setColor(new Color(0,0,80) ) ;
                             Stringer.drawString("Если оба заключенных будут сохранять молчание, это ",20,15) ;
                             Stringer.drawString( "будет их наилучшей совместной стратегией. Проигрыш при",10,30) ;
                             Stringer.drawString("этом равен (-1). Но если каждый будет действовать отдель-",10,45) ;
                             Stringer.drawString("но,то ему выгодно признаться, но это только при условии,",10,60) ;
                             Stringer.drawString("что второй промолчит (промолчавший получит максималь- " ,10,75) ;
                             Stringer.drawString("ное наказание (-8) - самая невыгодная стратегия).",10,90) ;
                             Stringer.drawString("  ",10,105) ;
                              }
if ((k==12)&&(srok==7)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                            g.setColor(new Color(180,0,60)  ) ;
                            Stringer.drawString("8.",8,15) ;
                            Stringer.fonts[0]=new Font("Dialog", 1, 12);
                            g.setColor(new Color(0,0,80) ) ;
                            Stringer.drawString("При сроке заключения 7 лет признаваться обоим не  ",20,15) ;
                            Stringer.drawString("выгодно. Это не лучшая стратегия.",10,30) ;
                            Stringer.drawString(" ",10,45);
                            Stringer.drawString("",10,45);
                            }

  if ((k==11)&&(srok==8)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                                    g.setColor(new Color(180,0,60)  ) ;
                                                    Stringer.drawString("7.",8,15) ;
                                                    Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                                    g.setColor(new Color(0,0,80) ) ;
                                                    Stringer.drawString("Максимальное наказание равно (-9). Если оба заключен - ",20,15) ;
                                                    Stringer.drawString( "ных будут сохранять молчание, это будет их наилучшей  ",10,30) ;
                                                    Stringer.drawString("совместной стратегией. Проигрыш равен (-1). Но если каж - ",10,45) ;
                                                    Stringer.drawString("дый будет действовать отдельно,то ему выгодно признать- ",10,60) ;
                                                    Stringer.drawString("ся но это только при условии, что второй промолчит (про -  " ,10,75) ;
                                                    Stringer.drawString("молчавший получит максимальное наказание  - самая ",10,90) ;
                                                    Stringer.drawString(" невыгодная стратегия). ",10,105) ;
                                               }
if ((k==12)&&(srok==8)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                                    g.setColor(new Color(180,0,60)  ) ;
                                                    Stringer.drawString("8.",8,15) ;
                                                    Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                                    g.setColor(new Color(0,0,80) ) ;
                                                    Stringer.drawString("При сроке заключения 8 лет признаваться обоим не  ",20,15) ;
                                                    Stringer.drawString("выгодно. Это не лучшая стратегия.",10,30) ;
                                                    Stringer.drawString(" ",10,45);
                                                    Stringer.drawString("",10,45);
                                                 }
  if ((k==11)&&(srok==9)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                                                             g.setColor(new Color(180,0,60)  ) ;
                                                                              Stringer.drawString("7.",8,15) ;
                                                                              Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                                                              g.setColor(new Color(0,0,80) ) ;
                                                                              Stringer.drawString("Если оба заключенных будут сохранять молчание, это ",20,15) ;
                                                                              Stringer.drawString( "будет их наилучшей совместной стратегией. Проигрыш при",10,30) ;
                                                                              Stringer.drawString("этом равен (-1). Но если каждый будет действовать отдель-",10,45) ;
                                                                              Stringer.drawString("но,то ему выгодно признаться, но это только при условии,",10,60) ;
                                                                              Stringer.drawString("что второй промолчит (промолчавший получит максималь- " ,10,75) ;
                                                                              Stringer.drawString("ное наказание (-9) - самая невыгодная стратегия).",10,90) ;
                                                                              Stringer.drawString("  ",10,105) ;
                                                                               }
 if ((k==12)&&(srok==9)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                                                             g.setColor(new Color(180,0,60)  ) ;
                                                                             Stringer.drawString("8.",8,15) ;
                                                                             Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                                                             g.setColor(new Color(0,0,80) ) ;
                                                                             Stringer.drawString("При сроке заключения 9 лет признаваться обоим не  ",20,15) ;
                                                                             Stringer.drawString("выгодно. Это не лучшая стратегия.",10,30) ;
                                                                             Stringer.drawString(" ",10,45);
                                                                             Stringer.drawString("",10,45);
                                                                             }


    if ((k==11)&&(srok==10)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                                                          g.setColor(new Color(180,0,60)  ) ;
                                                                          Stringer.drawString("7.",8,15) ;
                                                                          Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                                                          g.setColor(new Color(0,0,80) ) ;
                                                                          Stringer.drawString("Максимальное наказание равно (-11). Если оба заключен - ",20,15) ;
                                                                          Stringer.drawString( "ных будут сохранять молчание, это будет их наилучшей  ",10,30) ;
                                                                          Stringer.drawString("совместной стратегией. Проигрыш равен (-1). Но если каж - ",10,45) ;
                                                                          Stringer.drawString("дый будет действовать отдельно,то ему выгодно признать- ",10,60) ;
                                                                          Stringer.drawString("ся но это только при условии, что второй промолчит (про -  " ,10,75) ;
                                                                          Stringer.drawString("молчавший получит максимальное наказание  - самая ",10,90) ;
                                                                          Stringer.drawString(" невыгодная стратегия). ",10,105) ;
    } if ((k==12)&&(srok==10)){Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                                                          g.setColor(new Color(180,0,60)  ) ;
                                                                          Stringer.drawString("8.",8,15) ;
                                                                          Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                                                          g.setColor(new Color(0,0,80) ) ;
                                                                          Stringer.drawString("При сроке заключения 10 лет признаваться обоим не  ",20,15) ;
                                                                          Stringer.drawString("выгодно. Это не лучшая стратегия.",10,30) ;
                                                                          Stringer.drawString(" ",10,45);
                                                                          Stringer.drawString("",10,45);
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
    k=0;
               jButton3.setEnabled(true) ;
               jButton1.setEnabled(false) ;
               repaint();

  }

  void jButton3_actionPerformed(ActionEvent e) {
    k++;
                 if (k>0) jButton1.setEnabled(true) ;
                 if (k>=12) jButton3.setEnabled(false) ;
                 jPanel1.repaint();
                 jPanel2.repaint();

  }

  void jScrollBar1_mouseDragged(MouseEvent e) {
jPanel1.repaint() ;
  }

  void jScrollBar2_mouseDragged(MouseEvent e) {
jPanel1.repaint() ;jPanel2.repaint() ;
  }

  void jScrollBar2_mouseMoved(MouseEvent e) {
jPanel1.repaint() ;jPanel2.repaint() ;
  }
}

class AppletPrimUzn_jButton1_actionAdapter implements java.awt.event.ActionListener {
  AppletPrimUzn adaptee;

  AppletPrimUzn_jButton1_actionAdapter(AppletPrimUzn adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}

class AppletPrimUzn_jButton2_actionAdapter implements java.awt.event.ActionListener {
  AppletPrimUzn adaptee;

  AppletPrimUzn_jButton2_actionAdapter(AppletPrimUzn adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}

class AppletPrimUzn_jButton3_actionAdapter implements java.awt.event.ActionListener {
  AppletPrimUzn adaptee;

  AppletPrimUzn_jButton3_actionAdapter(AppletPrimUzn adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton3_actionPerformed(e);
  }
}

class AppletPrimUzn_jScrollBar2_mouseMotionAdapter extends java.awt.event.MouseMotionAdapter {
  AppletPrimUzn adaptee;

  AppletPrimUzn_jScrollBar2_mouseMotionAdapter(AppletPrimUzn adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseDragged(MouseEvent e) {
    adaptee.jScrollBar2_mouseDragged(e);
  }
  public void mouseMoved(MouseEvent e) {
    adaptee.jScrollBar2_mouseMoved(e);
  }
}
