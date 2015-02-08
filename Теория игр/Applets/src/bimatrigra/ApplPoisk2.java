package bimatrigra;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * <p>Title: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2008</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class ApplPoisk2 extends Applet {
  private boolean isStandalone = false;
  JLabel jLabel1 = new JLabel();
  JButton jButton_pred = new JButton();
  JButton jButton_new = new JButton();
  JButton jButton_next = new JButton();
  Panel_M jPanel3 = new Panel_M();
  Panel_R jPanel2 = new Panel_R();
  Panel_I jPanel1 = new Panel_I();
  Border border1;
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JCheckBox jCheckBox1 = new JCheckBox();
 int k=0,shag=0;
 int matA[][]=new int[3][2];int matB[][]=new int[2][3];
  //Get a parameter value
  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }

  //Construct the applet
  public ApplPoisk2() {
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
    jLabel1.setMaximumSize(new Dimension(62, 21));
    jLabel1.setOpaque(false);
    jLabel1.setText("Пример");
    jLabel1.setBounds(new Rectangle(194, 0, 90, 35));
    this.setBackground(new Color(247, 247, 255));
    this.setLayout(null) ;
    jButton_pred.setBackground(new Color(220, 230, 255));
    jButton_pred.setBounds(new Rectangle(98, 326, 71, 23));
    jButton_pred.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton_pred.setForeground(new Color(0, 0, 60));
    jButton_pred.setText("<==");
    jButton_pred.setSelected(false) ;
    jButton_pred.addActionListener(new ApplPoisk2_jButton_pred_actionAdapter(this));
    jButton_new.setBackground(new Color(220, 230, 255));
    jButton_new.setBounds(new Rectangle(192, 326, 95, 23));
    jButton_new.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton_new.setForeground(new Color(0, 0, 60));
    jButton_new.setText("Обновить");
    jButton_new.addActionListener(new ApplPoisk2_jButton_new_actionAdapter(this));
    jButton_next.setBackground(new Color(220, 230, 255));
    jButton_next.setBounds(new Rectangle(306, 326, 71, 23));
    jButton_next.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton_next.setForeground(new Color(0, 0, 60));
    jButton_next.setText("==>");
    jButton_next.addActionListener(new ApplPoisk2_jButton_next_actionAdapter(this));
    jPanel1.setBackground(Color.white);
    jPanel1.setBorder(border1);
    jPanel1.setBounds(new Rectangle(23, 35, 429, 166));
    jPanel2.setBackground(Color.white);
    jPanel2.setBorder(border1);
    jPanel2.setBounds(new Rectangle(21, 220, 429, 95));
    jPanel3.setBackground(Color.white);
    jPanel3.setBorder(border1);
    jPanel3.setBounds(new Rectangle(294, 38, 154, 120));
    jLabel2.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel2.setForeground(new Color(180, 0, 60));
    jLabel2.setText("Иллюстрация:");
    jLabel2.setBounds(new Rectangle(25, 22, 155, 15));
    jLabel3.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel3.setForeground(new Color(180, 0, 60));
    jLabel3.setText("Решение:");
    jLabel3.setBounds(new Rectangle(23, 205, 95, 15));
    jCheckBox1.setBackground(new Color(247, 247, 255));
    jCheckBox1.setFont(new java.awt.Font("Dialog", 3, 12));
    jCheckBox1.setForeground(new Color(180, 0, 60));
    jCheckBox1.setText("Исходные матрицы:");
    jCheckBox1.setBounds(new Rectangle(296, 201, 153, 17));
    jCheckBox1.addActionListener(new ApplPoisk2_jCheckBox1_actionAdapter(this));
    this.add(jLabel1, null);
    this.add(jPanel1, null);
    this.add(jPanel2, null);
    this.add(jLabel2, null);
    this.add(jCheckBox1, null);
    this.add(jLabel3, null);
    this.add(jButton_pred, null);
    this.add(jButton_new, null);
    this.add(jButton_next, null);
    this.add(jPanel3, null);
  }
  class Panel_M extends JPanel {
           public void paintComponent(Graphics g){
            super.paintComponent(g);
             Stringer.fonts[0]=new Font("Dialog", 1, 12);
              Stringer.setGraphics(g) ;
            g.setColor(new Color(0,0,80)  ) ;
              matA[0][0]=-1; matA[0][1]=5;
              matA[1][0]=1; matA[1][1]=4;
              matA[2][0]=2; matA[2][1]=2;
              matB[0][0]=0; matB[0][1]=-1; matB[0][2]=3;
              matB[1][0]=1; matB[1][1]=1; matB[1][2]=2;

            Stringer.drawString(" А  =   " +matA[1][0] +"     " + matA[1][1] +"     " ,18,35);
            Stringer.drawString("           " +matA[0][0] +"     " + matA[0][1] ,18,20);
            Stringer.drawString("           " +matA[2][0] +"     " + matA[2][1] ,18,50);
            Stringer.drawString(" B  =   " ,18,100);
            Stringer.drawString("           0"  +"     -1" + "     3",18,85);
            Stringer.drawString("           -1"  +"     1" + "    2 " ,18,115);
            Stringer.drawString("",8,30) ;
            Stringer.fonts[0]=new Font("Dialog", 1, 30);    Stringer.drawString("\u0028",40,37) ; Stringer.drawString("\u0028",40,102) ;
   Stringer.drawString("\u0029",85,37) ; Stringer.drawString("\u0029",105,102) ; } }
  class Panel_I extends JPanel {
            public void paintComponent(Graphics g){
             super.paintComponent(g);
              Stringer.fonts[0]=new Font("Dialog", 1, 12);
               Stringer.setGraphics(g) ;
               matA[0][0]=1; matA[0][1]=7;
             matA[1][0]=3; matA[1][1]=6;
             matA[2][0]=4; matA[2][1]=4;
             matB[0][0]=2; matB[0][1]=1; matB[0][2]=5;
             matB[1][0]=1; matB[1][1]=3; matB[1][2]=4;

     if(shag==0){ matA[0][0]=-1; matA[0][1]=5;
                         matA[1][0]=1; matA[1][1]=4;
                         matA[2][0]=2; matA[2][1]=2;
                         matB[0][0]=0; matB[0][1]=-1; matB[0][2]=3;
                         matB[1][0]=1; matB[1][1]=1; matB[1][2]=2;

                         g.setColor(Color.gray  ) ;g.drawLine(20+38,30+32,210-38,30+32) ;
                  // g.drawLine(20+38*2,30,210,30) ;
                  g.drawLine(20+38*2,30+32*2,210-38,30+32*2) ;
                  g.drawLine(20+38*2,30+32*3,210-38,30+32*3) ;
                g.drawLine(20+38,30+32*4+1,210-38,30+32*4+1) ;
                   g.drawLine(210-38,30+32,210-38,159) ;//g.drawLine(210-38,30,210-38,159) ;
                   g.drawLine(210-38*2,30+32,210-38*2,159) ;
                    g.drawLine(210-38*3,30+32,210-38*3,159) ;
                   g.drawLine(210-38*4,30+32,210-38*4,159) ;
                  g.drawLine(404-190+38,30+32,404,30+32) ;

                  g.drawLine(404-190+38*2,30+32*2,404,30+32*2) ;
                  g.drawLine(404-190+38,30+32*3,404,30+32*3) ;
                  //g.drawLine(404-190,30+32*4+1,404,30+32*4+1) ;
                   g.drawLine(404,30+32,404,159-33) ;g.drawLine(404-38,30+32,404-38,159-33) ;
                   g.drawLine(404-38*2,30+32,404-38*2,159-33) ;
                    g.drawLine(404-38*3,30+32,404-38*3,159-33) ;
                   g.drawLine(404-38*4,30+32,404-38*4,159-33) ;
                  // g.drawLine(210-38*5,30+32,210-38*5,160) ;
                 g.setColor(new Color(0,0,80)  ) ;

                     g.setColor(new Color(0,0,80)  ) ;
                       Stringer.drawString("A",37+38,86+32) ;
                       Stringer.drawString(""+matA[0][0],37+38*2,86);Stringer.drawString(""+matA[1][0],37+38*2,86+32);
            Stringer.drawString(""+matA[2][0],37+38*2,86+32*2);
            Stringer.drawString(""+matA[0][1],37+38*3,86);Stringer.drawString(""+matA[1][1],37+38*3,86+32);
            Stringer.drawString(""+matA[2][1],37+38*3,86+32*2);

                         Stringer.drawString("B",268,86+32-20) ;
                         Stringer.drawString(""+matB[0][0],268+38*2-40,86);Stringer.drawString(""+matB[1][0],268+38*2-40,86+32);
               Stringer.drawString(""+matB[0][1],268+38*3-40,86);Stringer.drawString(""+matB[1][1],268+38*3-40,86+32);
               Stringer.drawString(""+matB[0][2],268+38*4-40,86);Stringer.drawString(""+matB[1][2],268+38*4-40,86+32);


   //  g.setColor(Color.blue ) ;
     //g.drawRect(30,20,190,150) ;*/
   }
   if(shag>0){
       g.setColor(Color.gray  ) ;g.drawLine(20,30+32,210-38,30+32) ;
                  // g.drawLine(20+38*2,30,210,30) ;
                  g.drawLine(20,30+32*2,210-38,30+32*2) ;
                  g.drawLine(20,30+32*3,210-38,30+32*3) ;
                g.drawLine(20,30+32*4+1,210-38,30+32*4+1) ;
                   g.drawLine(210-38,30,210-38,159) ;//g.drawLine(210-38,30,210-38,159) ;
                   g.drawLine(210-38*2,30,210-38*2,159) ;
                    g.drawLine(210-38*3,30,210-38*3,159) ;
                   g.drawLine(210-38*4,30+32,210-38*4,159) ;
                   g.drawLine(404-190,30+32,404,30+32) ;
                  // g.drawLine(20+38*2,30,210,30) ;
                  g.drawLine(404-190,30+32*2,404,30+32*2) ;
                  g.drawLine(404-190,30+32*3,404,30+32*3) ;
                  //g.drawLine(404-190,30+32*4+1,404,30+32*4+1) ;
                   g.drawLine(404,30,404,159-33) ;g.drawLine(404-38,30,404-38,159-33) ;
                   g.drawLine(404-38*2,30,404-38*2,159-33) ;
                    g.drawLine(404-38*3,30,404-38*3,159-33) ;
                   g.drawLine(404-38*4,30+32,404-38*4,159-33) ;
                  // g.drawLine(210-38*5,30+32,210-38*5,160) ;
                 g.setColor(new Color(0,0,80)  ) ;
                  Stringer.drawString("Таблица 1 ",100,15);
                  Stringer.drawString("Таблица 2",340,15) ;

   }
   if (shag==1||shag==2)   {
               g.setColor(new Color(0,0,80)  ) ;
              Stringer.drawString("- v_{ 1} ",104,50); Stringer.drawString("- v_{ 2} ",142,50);
              Stringer.drawString("\u03C7_{ 1} ",37,86);Stringer.drawString("\u03C7_{ 2} ",37,86+32);
              Stringer.drawString("\u03C7_{ 3} ",37,86+32*2);
              Stringer.drawString("1 ",37+38,86);Stringer.drawString("1 ",37+38,86+32);
              Stringer.drawString("1 ",37+38,86+32*2);
              Stringer.drawString(""+matA[0][0],37+38*2,86);Stringer.drawString(""+matA[1][0],37+38*2,86+32);
              Stringer.drawString(""+matA[2][0],37+38*2,86+32*2);
              Stringer.drawString(""+matA[0][1],37+38*3,86);Stringer.drawString(""+matA[1][1],37+38*3,86+32);
              Stringer.drawString(""+matA[2][1],37+38*3,86+32*2);
              Stringer.drawString("- u_{ 1} ",254+38*2+10-40,50); Stringer.drawString("- u_{ 2} ",254+38*3+10-40,50);
             Stringer.drawString("- u_{ 3} ",254+38*4+10-40,50);
             Stringer.drawString("y_{ 1} ",268-40,86);Stringer.drawString("y_{ 2} ",268-40,86+32);
             Stringer.drawString("1 ",268+38-40,86);Stringer.drawString("1 ",268+38-40,86+32);
             Stringer.drawString(""+matB[0][0],268+38*2-40,86);Stringer.drawString(""+matB[1][0],268+38*2-40,86+32);
             Stringer.drawString(""+matB[0][1],268+38*3-40,86);Stringer.drawString(""+matB[1][1],268+38*3-40,86+32);
             Stringer.drawString(""+matB[0][2],268+38*4-40,86);Stringer.drawString(""+matB[1][2],268+38*4-40,86+32);
              g.setColor(Color.blue ) ;
    if(shag==2) {g.drawRect(37+38*3-10,86-15,25,20) ;
      g.drawRect(37+38*2-10,86+32*2-15,25,20) ;
    g.drawRect(268+38*2-8-40,86-15,25,20) ;g.drawRect(268-40+38*4-8,86-15,25,20) ;
    Stringer.fonts[0]=new Font("Dialog", 1, 12);
      Stringer.drawString("j_{ 1} = 2 ",40,50);
      Stringer.drawString("i_{ 1} = 1 ",254,50);
}}
if (shag==3)   {
               g.setColor(new Color(0,0,80)  ) ;
              Stringer.drawString("- v_{ 1} ",104,50); Stringer.drawString("- \u03C7_{ 1} ",142,50);
              Stringer.drawString("v_{ 2} ",37,86);Stringer.drawString("\u03C7_{ 2} ",37,86+32);
              Stringer.drawString("\u03C7_{ 3} ",37,86+32*2);
              Stringer.drawString("1/7 ",37+38,86);Stringer.drawString("1/7 ",37+38,86+32);
              Stringer.drawString("3/7 ",37+38,86+32*2);
              Stringer.drawString("1/7",37+38*2-3,86);Stringer.drawString("15/7",37+38*2-3,86+32);
              Stringer.drawString("24/7",37+38*2-3,86+32*2);
              Stringer.drawString("1/7",37+38*3-3,86);Stringer.drawString("-6/7",37+38*3-3,86+32);
              Stringer.drawString("-4/7",37+38*3-3,86+32*2);
              Stringer.drawString("- y_{ 1} ",254+38*2+10-40,50); Stringer.drawString("- u_{ 2} ",254+38*3+10-40,50);
             Stringer.drawString("- u_{ 3} ",254+38*4+10-40,50);
             Stringer.drawString("u_{ 1} ",268-40,86);Stringer.drawString("y_{ 2} ",268-40,86+32);
             Stringer.drawString("5/2",268+38*3-40,86+32);
             Stringer.drawString("5/2",268+38*4-40,86);Stringer.drawString("3/2",268+38*4-40,86+32);
             Stringer.fonts[0]=new Font("Dialog", 1, 16);
             Stringer.drawString("\u00BD ",268+38-40,86);Stringer.drawString("\u00BD ",268+38-40,86+32);
              Stringer.drawString("\u00BD",268+38*2-40,86);Stringer.drawString("-\u00BD",268+38*2-40,86+32);
              Stringer.drawString("\u00BD",268+38*3-40,86);
              g.setColor(Color.blue ) ;
   g.drawRect(37+38*2-10,86+32-15,28,20) ; g.drawRect(268+38*3-40-10,86+32-15,28,20) ;
    Stringer.fonts[0]=new Font("Dialog", 1, 12);
    Stringer.drawString("j_{ 2} = 1 ",40,50);
    Stringer.drawString("i_{ 2} = 2 ",254,50);
}
  if (shag==4)   {
                 g.setColor(new Color(0,0,80)  ) ;
                Stringer.drawString("- \u03C7_{ 2} ",104,50); Stringer.drawString("- \u03C7_{ 1} ",142,50);
                Stringer.drawString("v_{ 2} ",37,86);Stringer.drawString("v_{ 1} ",37,86+32);
                Stringer.drawString("\u03C7_{ 3} ",37,86+32*2);
                Stringer.drawString("2/15 ",37+38,86);Stringer.drawString("7/15 ",37+38,86+32);
                Stringer.drawString("1/5 ",37+38,86+32*2);
                Stringer.drawString("-1/15",37+38*2-3,86);Stringer.drawString("7/15",37+38*2-3,86+32);
                Stringer.drawString("-8/5",37+38*2-3,86+32*2);
                Stringer.drawString("1/5",37+38*3-3,86);Stringer.drawString("-2/5",37+38*3-3,86+32);
                Stringer.drawString("4/5",37+38*3-3,86+32*2);
                Stringer.drawString("- y_{ 1} ",254+38*2+10-40,50); Stringer.drawString("- y_{ 2} ",254+38*3+10-40,50);
               Stringer.drawString("- u_{ 3} ",254+38*4+10-40,50);
               Stringer.drawString("u_{ 1} ",268-40,86);Stringer.drawString("u_{ 2} ",268-40,86+32);
               Stringer.drawString("2/5",268+38*3-40,86+32);
               Stringer.drawString("11/5",268+38*4-40,86);Stringer.drawString("3/5",268+38*4-40,86+32);

               Stringer.drawString("2/5 ",268+38-40,86);Stringer.drawString("1/5",268+38-40,86+32);
                Stringer.drawString("3/5",268+38*2-40,86);Stringer.drawString("-1/5",268+38*2-40,86+32);
                Stringer.drawString("-1/5",268+38*3-40,86);
                g.setColor(Color.blue ) ;

      Stringer.fonts[0]=new Font("Dialog", 1, 12);
      Stringer.drawString("j_{ 3} = 1 = j_{ 1} ",40,50);
      Stringer.drawString("i_{ 3} = 2 = i_{ 2}",254-20,50);
  }
 if(shag==5||shag==6) {g.setColor(new Color(0,0,80)  ) ;
                Stringer.drawString("- \u03C7_{ 3} ",104,50); Stringer.drawString("- v_{ 2} ",142,50);
                Stringer.drawString("\u03C7_{ 1} ",37,86);Stringer.drawString("\u03C7_{ 2} ",37,86+32);
                Stringer.drawString("v_{ 1} ",37,86+32*2);
                Stringer.drawString("3/4 ",37+38,86);Stringer.drawString("1/4 ",37+38,86+32);
                Stringer.drawString("1/4 ",37+38,86+32*2);
                Stringer.drawString("-1/4",37+38*2,86);Stringer.drawString("-3/4",37+38*2,86+32);
                Stringer.drawString("1/4",37+38*2,86+32*2);
                Stringer.drawString("6",37+38*3,86);Stringer.drawString("3",37+38*3,86+32);
                Stringer.drawString("1",37+38*3,86+32*2);
                Stringer.drawString("- u_{ 1} ",254+38*2+10-40,50); Stringer.drawString("- u_{ 2} ",254+38*3+10-40,50);
               Stringer.drawString("- y_{ 1} ",254+38*4+10-40,50);
               Stringer.drawString("u_{ 3} ",268-40,86);Stringer.drawString("y_{ 2} ",268-40,86+32);
               Stringer.drawString("1/5 ",268+38-40,86);Stringer.drawString("1/5 ",268+38-40,86+32);
               Stringer.drawString("2/5",268+38*2-40,86);Stringer.drawString("-3/5",268+38*2-40,86+32);
               Stringer.drawString("1/5",268+38*3-40,86);Stringer.drawString("11/5",268+38*3-40,86+32);
               Stringer.drawString("1/5",268+38*4-40,86);Stringer.drawString("-4/5",268+38*4-40,86+32);
                g.setColor(Color.blue ) ;
        Stringer.fonts[0]=new Font("Dialog", 1, 12);
        Stringer.drawString("j_{ 2} = 1 = j_{ 1} ",40,50);
        Stringer.drawString("i_{ 2} = 3 = i_{ 1}",254-20,50);
      }
}}

  class Panel_R extends JPanel {
             public void paintComponent(Graphics g){
              super.paintComponent(g);
               Stringer.fonts[0]=new Font("Dialog", 1, 12);
                Stringer.setGraphics(g) ;
              g.setColor(new Color(0,0,80)  ) ;
         if(shag==0) { Stringer.fonts[0]=new Font("Dialog", 2, 14);
                 g.setColor(new Color(180,0,60)  ) ;
                Stringer.drawString("",8,15) ;
                Stringer.fonts[0]=new Font("Dialog", 1, 12);
                g.setColor(new Color(0,0,80) ) ;
                 Stringer.drawString("=                           +",40,65) ;
                 Stringer.drawString("\u03C7^{ T}u^{ T} = 0 , y^{ T}v^{ T} = 0.",200,65) ;
                Stringer.drawString("Даны две матрицы А и В. Найти решение представленной системы, ",20,15) ;
                Stringer.drawString("используя некотрое к>0. В задаче m = 3, n = 2.",20,35) ;
               Stringer.drawString("\u03C7          0    -A      u^{ T}       e^{m}",20,55) ;
               Stringer.drawString("y          -B     0      v^{ T}       e^{n}",20,75) ;
            Stringer.fonts[0]=new Font("Dialog", 1, 22);
            Stringer.drawString("\u0028",8,65) ; Stringer.drawString("\u0028",47,65) ;
            Stringer.drawString("\u0029",32,65) ; Stringer.drawString("\u0029",88,65) ;
            Stringer.drawString("\u0028",95,65) ; Stringer.drawString("\u0029",120,65) ;
            Stringer.drawString("\u0028",134,65) ; Stringer.drawString("\u0029",158,65) ;

         }
         if(shag==1) { Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                     g.setColor(new Color(180,0,60)  ) ;
                                    Stringer.drawString("1.",8,15) ;
                                    Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                    g.setColor(new Color(0,0,80) ) ;
                                    Stringer.drawString("Возьмем k = 2, тогда получим матрицы: ",20,15) ;
     Stringer.drawString("A + k E =   3  6     ,        B + k E^{ T} =    ",20,50) ;
     Stringer.drawString("1  7     ",77,40) ;  Stringer.drawString("2  1  5     ",210,43) ;
     Stringer.drawString("4  4     ",77,60) ;  Stringer.drawString("1  3  4     ",210,55) ;
     Stringer.fonts[0]=new Font("Dialog", 1, 22);
     Stringer.drawString("\u0028",70,50) ; Stringer.drawString("\u0028",200,50) ;
     Stringer.drawString("\u0029",100,50) ; Stringer.drawString("\u0029",245,50) ;
   }

   if(shag==2) { Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                g.setColor(new Color(180,0,60)  ) ;
                               Stringer.drawString("2.",8,15) ;
                               Stringer.fonts[0]=new Font("Dialog", 1, 12);
                               g.setColor(new Color(0,0,80) ) ;
                               Stringer.drawString("Используя полученные матрицы, заполним начальные таблицы.",20,15) ;
  Stringer.drawString("Здесь j_{ 1} = 2 , i_{ 1} = 1 , если начнем преобразование с этих j и i ,",20,35) ;
Stringer.drawString("тогда в Таблице 1 поменяем v_{ 2} c \u03C7_{ 1}. В таблице 2 поменяем u_{ 1} с y_{ 3}. ",20,55) ;
}
if(shag==3) { Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                g.setColor(new Color(180,0,60)  ) ;
                               Stringer.drawString("3.",8,15) ;
                               Stringer.fonts[0]=new Font("Dialog", 1, 12);
                               g.setColor(new Color(0,0,80) ) ;
                               Stringer.drawString("Если в Таблице 1 выбрать j_{ 3} = 2 = j_{ 1} и i_{ 3} = 2 = i_{ 2},",20,15) ;

Stringer.drawString("тогда в Таблице 1 поменяем v_{ 1} c \u03C7_{ 2}. В таблице 2 поменяем u_{ 2} с y_{ 2}. ",20,35) ;
}
if(shag==4) { Stringer.fonts[0]=new Font("Dialog", 2, 14);
 g.setColor(new Color(180,0,60)  ) ;
  Stringer.drawString("4.",8,15) ;
   Stringer.fonts[0]=new Font("Dialog", 1, 12);
    g.setColor(new Color(0,0,80) ) ;
     Stringer.drawString("Процедура закончена, получено решение cистемы ",20,15) ;
     Stringer.drawString("1     2",120,30) ;  Stringer.drawString("15  15",120,43) ;
      Stringer.drawString("2  1",45,30) ;  Stringer.drawString("5  5",45,43) ;
     Stringer.drawString("u = ( - , - ,0) , v = (  --  ,    --  ). ",20,35) ;
 Stringer.drawString("Если выбрать j_{ 1} = 1 и i_{ 3} = 3 и в начальной Таблице 1 поменять ",20,60) ;
 Stringer.drawString("v_{ 1} c \u03C7_{ 3},а в начальной Таблице 2 поменять u_{ 3} на y_{ 1}.",20,75) ;
   }
   if(shag==5) { Stringer.fonts[0]=new Font("Dialog", 2, 14);
    g.setColor(new Color(180,0,60)  ) ;
     Stringer.drawString("5.",8,15) ;
      Stringer.fonts[0]=new Font("Dialog", 1, 12);
       g.setColor(new Color(0,0,80) ) ;
        Stringer.drawString("Процедура закончена, получено решение cистемы ",20,15) ;
        Stringer.drawString("1   ",125,30) ;  Stringer.drawString("4",125,43) ;
         Stringer.drawString("1",76,30) ;  Stringer.drawString("5",76,43) ;
        Stringer.drawString("u = ( 0 , 0 , - ) , v = (  - , 0 ). ",20,35) ;


  }
  if(shag==6) { Stringer.fonts[0]=new Font("Dialog", 2, 14);
   g.setColor(new Color(180,0,60)  ) ;
    Stringer.drawString("6.",8,15) ;
     Stringer.fonts[0]=new Font("Dialog", 1, 12);
      g.setColor(new Color(0,0,80) ) ;
        Stringer.drawString("1   ",138,30) ;  Stringer.drawString("7",138,43) ;
        Stringer.drawString("1",64,30) ;  Stringer.drawString("3",64,43) ;
       Stringer.drawString("u = ( 0 , - , 0 ) , v = ( 0 , - ). ",20,35) ;
   Stringer.drawString("Если начать процедуру с начальной Таблицы 2 получим решения: ",20,15) ;
  Stringer.drawString("1   ",125,50) ;  Stringer.drawString("4",125,63) ;
           Stringer.drawString("1",76,50) ;  Stringer.drawString("5",76,63) ;
          Stringer.drawString("u = ( 0 , 0 , - ) , v = (  - , 0 ). ",20,55) ;

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

  void jCheckBox1_actionPerformed(ActionEvent e) {
    k++; if(k%2==0) {jPanel3.setVisible(false) ;
                          jPanel2.setVisible(true) ;
                           jPanel1.setVisible(true) ;
                          }
      if(k%2!=0) {jPanel3.setVisible(true) ;
      jPanel2.setVisible(true) ;jPanel1.setVisible(false) ;
      }

 }

  void jButton_pred_actionPerformed(ActionEvent e) {
    shag--;
               if(shag==0) jButton_pred.setEnabled(false) ;
                   if(shag!=0 & shag!=8) jButton_next.setEnabled(true) ;
           jPanel1.repaint() ;
               jPanel2.repaint() ;jPanel3.repaint() ;

  }

  void jButton_new_actionPerformed(ActionEvent e) {
    shag=0;jButton_pred.setEnabled(false) ;
            jButton_next.setEnabled(true) ;
           jPanel2.repaint() ;jPanel1.repaint() ;
jPanel3.repaint() ;
  }

  void jButton_next_actionPerformed(ActionEvent e) {
    if (shag<6){shag++; jButton_pred.setEnabled(true) ;
          jPanel2.repaint() ;jPanel1.repaint() ;jPanel3.repaint() ;}
      if(shag==6)jButton_next.setEnabled(false) ;}



  }

class ApplPoisk2_jCheckBox1_actionAdapter implements java.awt.event.ActionListener {
  ApplPoisk2 adaptee;

  ApplPoisk2_jCheckBox1_actionAdapter(ApplPoisk2 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jCheckBox1_actionPerformed(e);
  }
}

class ApplPoisk2_jButton_pred_actionAdapter implements java.awt.event.ActionListener {
  ApplPoisk2 adaptee;

  ApplPoisk2_jButton_pred_actionAdapter(ApplPoisk2 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton_pred_actionPerformed(e);
  }
}

class ApplPoisk2_jButton_new_actionAdapter implements java.awt.event.ActionListener {
  ApplPoisk2 adaptee;

  ApplPoisk2_jButton_new_actionAdapter(ApplPoisk2 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton_new_actionPerformed(e);
  }
}

class ApplPoisk2_jButton_next_actionAdapter implements java.awt.event.ActionListener {
  ApplPoisk2 adaptee;

  ApplPoisk2_jButton_next_actionAdapter(ApplPoisk2 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton_next_actionPerformed(e);
  }
}
