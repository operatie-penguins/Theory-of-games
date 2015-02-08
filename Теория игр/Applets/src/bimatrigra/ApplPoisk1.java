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

public class ApplPoisk1 extends Applet {
  private boolean isStandalone = false;
  JLabel jLabel1 = new JLabel();
  JButton jButton_pred = new JButton();
  JButton jButton_new = new JButton();
  JButton jButton_next = new JButton();
  Panel_I jPanel1 = new Panel_I();
  Panel_R jPanel2 = new Panel_R();
  Border border1;
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JCheckBox jCheckBox1 = new JCheckBox();
  Panel_M jPanel_mat = new Panel_M();
int k=0,shag=0;
  int matA[][]=new int[3][3];int matB[][]=new int[3][3];

    //Get a parameter value
  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }

  //Construct the applet
  public ApplPoisk1() {
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
    jCheckBox1.setBackground(new Color(247, 247, 255));
    jCheckBox1.setFont(new java.awt.Font("Dialog", 3, 12));
    jCheckBox1.setForeground(new Color(180, 0, 60));
    jCheckBox1.setText("Исходные  матрицы");
    jCheckBox1.setBounds(new Rectangle(327, 230, 155, 16));
    jCheckBox1.addActionListener(new ApplPoisk1_jCheckBox1_actionAdapter(this));
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setText("Пример ");
    jLabel1.setBounds(new Rectangle(204, 0, 82, 31));
    jButton_pred.setBackground(new Color(220, 230, 255));
    jButton_pred.setBounds(new Rectangle(102, 354, 71, 23));
    jButton_pred.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton_pred.setForeground(new Color(0, 0, 80));
    jButton_pred.setText("<==");
    jButton_pred.setSelected(false) ;
    jButton_pred.addActionListener(new ApplPoisk1_jButton_pred_actionAdapter(this));
    jButton_new.setBackground(new Color(220, 230, 255));
    jButton_new.setBounds(new Rectangle(197, 355, 104, 23));
    jButton_new.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton_new.setForeground(new Color(0, 0, 80));
    jButton_new.setRolloverEnabled(true);
    jButton_new.setText("Обновить");
    jButton_new.addActionListener(new ApplPoisk1_jButton_new_actionAdapter(this));
    jButton_next.setBackground(new Color(220, 230, 255));
    jButton_next.setBounds(new Rectangle(322, 355, 71, 23));
    jButton_next.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton_next.setForeground(new Color(0, 0, 80));
    jButton_next.setText("==>");
    jButton_next.addActionListener(new ApplPoisk1_jButton_next_actionAdapter(this));
    jPanel1.setBackground(Color.white);
    jPanel1.setBorder(border1);
    jPanel1.setBounds(new Rectangle(16, 38, 464, 191));
    this.setBackground(new Color(247, 247, 255));
    jPanel2.setBackground(Color.white);
    jPanel2.setBorder(border1);
    jPanel2.setBounds(new Rectangle(16, 246, 464, 95));
    jLabel2.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel2.setForeground(new Color(180, 0, 60));
    jLabel2.setText("Иллюстрация:");
    jLabel2.setBounds(new Rectangle(18, 22, 108, 15));
    jLabel3.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel3.setForeground(new Color(180, 0, 60));
    jLabel3.setMaximumSize(new Dimension(47, 15));
    jLabel3.setText("Решение:");
    jLabel3.setBounds(new Rectangle(14, 228, 189, 20));
    jPanel_mat.setBackground(Color.white);
    jPanel_mat.setBorder(border1);
    jPanel_mat.setVisible(false) ;
    jPanel_mat.setBounds(new Rectangle(345, 37, 136, 131));
    this.add(jLabel2, null);
    this.add(jLabel1, null);
    this.add(jPanel2, null);
    this.add(jCheckBox1, null);
    this.add(jLabel3, null);
    this.add(jButton_next, null);
    this.add(jButton_new, null);
    this.add(jButton_pred, null);
    this.add(jPanel_mat, null);
    this.add(jPanel1, null);
    this.setLayout(null) ;
  }
  class Panel_M extends JPanel {
         public void paintComponent(Graphics g){
          super.paintComponent(g);
           Stringer.fonts[0]=new Font("Dialog", 1, 12);
            Stringer.setGraphics(g) ;
          g.setColor(new Color(0,0,80)  ) ;
            matA[0][0]=2; matA[0][1]=2; matA[0][2]=0;
            matA[1][0]=0; matA[1][1]=3; matA[1][2]=0;
            matA[2][0]=3; matA[2][1]=0; matA[2][2]=1;
            matB[0][0]=3; matB[0][1]=0; matB[0][2]=2;
            matB[1][0]=0; matB[1][1]=3; matB[1][2]=2;
            matB[2][0]=0; matB[2][1]=0; matB[2][2]=1;

          Stringer.drawString(" А  =   " +matA[1][0] +"     " + matA[1][1] +"     " + matA[1][2],18,35);
          Stringer.drawString("           " +matA[0][0] +"     " + matA[0][1] +"     " + matA[0][2],18,20);
          Stringer.drawString("           " +matA[2][0] +"     " + matA[2][1] +"     " + matA[2][2],18,50);
          Stringer.drawString(" B  =   0" +"     3" + "     2" ,18,100);
          Stringer.drawString("           3"  +"     0" + "     2",18,85);
          Stringer.drawString("           0"  +"     0" + "    1 " ,18,115);
          Stringer.drawString("",8,30) ;
          Stringer.fonts[0]=new Font("Dialog", 1, 30);    Stringer.drawString("\u0028",40,37) ; Stringer.drawString("\u0028",40,102) ;
 Stringer.drawString("\u0029",105,37) ; Stringer.drawString("\u0029",105,102) ; } }
  class Panel_I extends JPanel {
           public void paintComponent(Graphics g){
            super.paintComponent(g);
             Stringer.fonts[0]=new Font("Dialog", 1, 12);
              Stringer.setGraphics(g) ;
              matA[0][0]=2; matA[0][1]=2; matA[0][2]=0;
            matA[1][0]=0; matA[1][1]=3; matA[1][2]=0;
            matA[2][0]=3; matA[2][1]=0; matA[2][2]=1;
            matB[0][0]=3; matB[0][1]=0; matB[0][2]=0;
            matB[1][0]=0; matB[1][1]=3; matB[1][2]=0;
            matB[2][0]=2; matB[2][1]=2; matB[2][2]=1;

            if (shag==0)   {    matB[0][0]=3; matB[0][1]=0; matB[0][2]=2;
            matB[1][0]=0; matB[1][1]=3; matB[1][2]=2;
            matB[2][0]=0; matB[2][1]=0; matB[2][2]=1;


              g.setColor(Color.gray  ) ;
                         g.drawLine(20+32,30+32,210,30+32) ;
                         g.drawLine(20+32*2+12,30+32*2,210,30+32*2) ;
                        g.drawLine(20+32*2+12,30+32*3,210,30+32*3) ;
                        g.drawLine(20+32,30+32*4+1,210,30+32*4+1) ;
                         g.drawLine(210,30+32,210,159) ;g.drawLine(210-38,30+32,210-38,159) ;
                         g.drawLine(210-38*2,30+32,210-38*2,159) ;
                          g.drawLine(210-38*3,30+32,210-38*3,159) ;
                         g.drawLine(210-38*4-4,30+32,210-38*4-4,159) ;
                         g.drawLine(444-190+38,30+32,444,30+32) ;
                         g.drawLine(444-190+38*2,30+32*2,444,30+32*2) ;
                        g.drawLine(444-190+38*2,30+32*3,444,30+32*3) ;
                        g.drawLine(444-190+38,30+32*4+1,444,30+32*4+1) ;
                         g.drawLine(444,30+32,444,159) ;g.drawLine(444-38,30+32,444-38,159) ;
                         g.drawLine(444-38*2,30+32,444-38*2,159) ;
                          g.drawLine(444-38*3,30+32,444-38*3,159) ;
                         g.drawLine(444-38*4,30+32,444-38*4,159) ;
                        // g.drawLine(210-38*5,30+32,210-38*5,160) ;
                      g.setColor(new Color(0,0,80)  ) ;
                      Stringer.drawString("A",37+38,86+32) ;
                        Stringer.drawString(""+matA[0][0],37+38*2,86);Stringer.drawString(""+matA[1][0],37+38*2,86+32);
                        Stringer.drawString(""+matA[2][0],37+38*2,86+32*2);
                        Stringer.drawString(""+matA[0][1],37+38*3,86);Stringer.drawString(""+matA[1][1],37+38*3,86+32);
                        Stringer.drawString(""+matA[2][1],37+38*3,86+32*2);
                        Stringer.drawString(""+matA[0][2],37+38*4,86);Stringer.drawString(""+matA[1][2],37+38*4,86+32);
                        Stringer.drawString(""+matA[2][2],37+38*4,86+32*2);
                        Stringer.drawString("B",268+38,86+32) ;
                       Stringer.drawString(""+matB[0][0],268+38*2,86);Stringer.drawString(""+matB[1][0],268+38*2,86+32);
                       Stringer.drawString(""+matB[2][0],268+38*2,86+32*2);
                       Stringer.drawString(""+matB[0][1],268+38*3,86);Stringer.drawString(""+matB[1][1],268+38*3,86+32);
                       Stringer.drawString(""+matB[2][1],268+38*3,86+32*2);
                       Stringer.drawString(""+matB[0][2],268+38*4,86);Stringer.drawString(""+matB[1][2],268+38*4,86+32);
                       Stringer.drawString(""+matB[2][2],268+38*4,86+32*2);
  //  g.setColor(Color.blue ) ;
    //g.drawRect(30,20,190,150) ;
  }
  if(shag>0){
    g.setColor(Color.gray  ) ;g.drawLine(20,30+32,210,30+32) ;
               // g.drawLine(20+38*2,30,210,30) ;
               g.drawLine(20,30+32*2,210,30+32*2) ;
               g.drawLine(20,30+32*3,210,30+32*3) ;
               g.drawLine(20,30+32*4+1,210,30+32*4+1) ;
                g.drawLine(210,30,210,159) ;g.drawLine(210-38,30,210-38,159) ;
                g.drawLine(210-38*2,30,210-38*2,159) ;
                 g.drawLine(210-38*3,30,210-38*3,159) ;
                g.drawLine(210-38*4,30+32,210-38*4,159) ;
                g.drawLine(444-190,30+32,444,30+32) ;
               // g.drawLine(20+38*2,30,210,30) ;
               g.drawLine(444-190,30+32*2,444,30+32*2) ;
               g.drawLine(444-190,30+32*3,444,30+32*3) ;
               g.drawLine(444-190,30+32*4+1,444,30+32*4+1) ;
                g.drawLine(444,30,444,159) ;g.drawLine(444-38,30,444-38,159) ;
                g.drawLine(444-38*2,30,444-38*2,159) ;
                 g.drawLine(444-38*3,30,444-38*3,159) ;
                g.drawLine(444-38*4,30+32,444-38*4,159) ;
               // g.drawLine(210-38*5,30+32,210-38*5,160) ;
              g.setColor(new Color(0,0,80)  ) ;
               Stringer.drawString("Таблица 1 ",100,15);
               Stringer.drawString("Таблица 2",340,15) ;

}
   if (shag==1||shag==2)   {
              g.setColor(new Color(0,0,80)  ) ;
             Stringer.drawString("- v_{ 1} ",104,50); Stringer.drawString("- v_{ 2} ",142,50);
             Stringer.drawString("- v_{ 3} ",142+38,50);
             Stringer.drawString("\u03C7_{ 1} ",37,86);Stringer.drawString("\u03C7_{ 2} ",37,86+32);
             Stringer.drawString("\u03C7_{ 3} ",37,86+32*2);
             Stringer.drawString("1 ",37+38,86);Stringer.drawString("1 ",37+38,86+32);
             Stringer.drawString("1 ",37+38,86+32*2);
             Stringer.drawString(""+matA[0][0],37+38*2,86);Stringer.drawString(""+matA[1][0],37+38*2,86+32);
             Stringer.drawString(""+matA[2][0],37+38*2,86+32*2);
             Stringer.drawString(""+matA[0][1],37+38*3,86);Stringer.drawString(""+matA[1][1],37+38*3,86+32);
             Stringer.drawString(""+matA[2][1],37+38*3,86+32*2);
             Stringer.drawString(""+matA[0][2],37+38*4,86);Stringer.drawString(""+matA[1][2],37+38*4,86+32);
             Stringer.drawString(""+matA[2][2],37+38*4,86+32*2);

             Stringer.drawString("- u_{ 1} ",254+38*2+10,50); Stringer.drawString("- u_{ 2} ",254+38*3+10,50);
            Stringer.drawString("- u_{ 3} ",254+38*4+10,50);
            Stringer.drawString("y_{ 1} ",268,86);Stringer.drawString("y_{ 2} ",268,86+32);
            Stringer.drawString("y_{ 3} ",268,86+32*2);
            Stringer.drawString("1 ",268+38,86);Stringer.drawString("1 ",268+38,86+32);
            Stringer.drawString("1 ",268+38,86+32*2);
            Stringer.drawString(""+matB[0][0],268+38*2,86);Stringer.drawString(""+matB[1][0],268+38*2,86+32);
            Stringer.drawString(""+matB[2][0],268+38*2,86+32*2);
            Stringer.drawString(""+matB[0][1],268+38*3,86);Stringer.drawString(""+matB[1][1],268+38*3,86+32);
            Stringer.drawString(""+matB[2][1],268+38*3,86+32*2);
            Stringer.drawString(""+matB[0][2],268+38*4,86);Stringer.drawString(""+matB[1][2],268+38*4,86+32);
            Stringer.drawString(""+matB[2][2],268+38*4,86+32*2);
              g.setColor(Color.blue ) ;
   if(shag==2) {g.drawRect(37+38*2-10,86+32*2-15,25,20) ;
   g.drawRect(268+38*4-8,86+32*2-15,25,20) ;}}
if(shag==3)
      {  g.setColor(new Color(0,0,80)  ) ;
                   Stringer.drawString("-\u03C7_{ 3} ",104,50); Stringer.drawString("- v_{ 2} ",142,50);
                   Stringer.drawString("- v_{ 3} ",142+38,50);
                   Stringer.drawString("\u03C7_{ 1} ",37,86);Stringer.drawString("\u03C7_{ 2} ",37,86+32);
                   Stringer.drawString("v_{ 1} ",37,86+32*2);
                  Stringer.drawString("1 ",37+38,86+32);

                   Stringer.drawString(""+matA[1][0],37+38*2,86+32);

                   Stringer.drawString(""+matA[0][1],37+38*3,86);Stringer.drawString(""+matA[1][1],37+38*3,86+32);
                   Stringer.drawString(""+matA[2][1],37+38*3,86+32*2);
                  Stringer.drawString(""+matA[1][2],37+38*4,86+32);
                    Stringer.drawString("- u_{ 1} ",254+38*2+10,50); Stringer.drawString("- u_{ 2} ",254+38*3+10,50);
                  Stringer.drawString("- y_{ 3} ",254+38*4+10,50);
                  Stringer.drawString("y_{ 1} ",268,86);Stringer.drawString("y_{ 2} ",268,86+32);
                  Stringer.drawString("u_{ 3} ",268,86+32*2);
                  Stringer.drawString("1 ",268+38,86);Stringer.drawString("1 ",268+38,86+32);
                  Stringer.drawString("1 ",268+38,86+32*2);
                  Stringer.drawString(""+matB[0][0],268+38*2,86);Stringer.drawString(""+matB[1][0],268+38*2,86+32);
                  Stringer.drawString(""+matB[2][0],268+38*2,86+32*2);
                  Stringer.drawString(""+matB[0][1],268+38*3,86);Stringer.drawString(""+matB[1][1],268+38*3,86+32);
                  Stringer.drawString(""+matB[2][1],268+38*3,86+32*2);
                  Stringer.drawString(""+matB[0][2],268+38*4,86);Stringer.drawString(""+matB[1][2],268+38*4,86+32);
                  Stringer.drawString(""+matB[2][2],268+38*4,86+32*2);
             Stringer.fonts[0]=new Font("Dialog", 1, 13);
 Stringer.drawString("\u2153 ",37+38,86);Stringer.drawString("\u2153",37+38,86+32*2);
 Stringer.drawString("-\u2154",37+38*2,86);
  Stringer.drawString("-\u2154",37+38*4,86);
    Stringer.drawString("\u2153",37+38*2,86+32*2);
 Stringer.drawString("\u2153",37+38*4,86+32*2);
 g.setColor(Color.blue ) ;
   g.drawRect(37+38*4-10,86+32*2-15,25,20) ;
   g.drawRect(268+38*3-8,86+32-15,25,20) ;
}
if(shag==4){
   g.setColor(new Color(0,0,80)  ) ;
                Stringer.drawString("- \u03C7_{ 3} ",104,50); Stringer.drawString("- v_{ 2} ",142,50);
                Stringer.drawString("- v_{ 1} ",142+38,50);
                Stringer.drawString("\u03C7_{ 1} ",37,86);Stringer.drawString("\u03C7_{ 2} ",37,86+32);
                Stringer.drawString("v_{ 3} ",37,86+32*2);
                Stringer.drawString("1 ",37+38,86);Stringer.drawString("1 ",37+38,86+32);
                Stringer.drawString("1 ",37+38,86+32*2);
                Stringer.drawString("0",37+38*2,86);Stringer.drawString("0",37+38*2,86+32);
                Stringer.drawString("1",37+38*2,86+32*2);
                Stringer.drawString(""+matA[0][1],37+38*3,86);Stringer.drawString("3",37+38*3,86+32);
                Stringer.drawString("0",37+38*3,86+32*2);
                Stringer.drawString("2",37+38*4,86);Stringer.drawString(""+matA[1][2],37+38*4,86+32);
                Stringer.drawString("3",37+38*4,86+32*2);
                Stringer.drawString("- u_{ 1} ",254+38*2+10,50); Stringer.drawString("- u_{ 2} ",254+38*3+10,50);
               Stringer.drawString("- y_{ 3} ",254+38*4+10,50);
               Stringer.drawString("y_{ 1} ",268,86);Stringer.drawString("y_{ 2} ",268,86+32);
               Stringer.drawString("u_{ 3} ",268,86+32*2);
               Stringer.drawString("1 ",268+38,86);Stringer.drawString("1 ",268+38,86+32);
               Stringer.drawString("1 ",268+38,86+32*2);
               Stringer.drawString(""+matB[0][0],268+38*2,86);Stringer.drawString(""+matB[1][0],268+38*2,86+32);
               Stringer.drawString(""+matB[2][0],268+38*2,86+32*2);
               Stringer.drawString(""+matB[0][1],268+38*3,86);Stringer.drawString(""+matB[1][1],268+38*3,86+32);
               Stringer.drawString(""+matB[2][1],268+38*3,86+32*2);
               Stringer.drawString(""+matB[0][2],268+38*4,86);Stringer.drawString(""+matB[1][2],268+38*4,86+32);
               Stringer.drawString(""+matB[2][2],268+38*4,86+32*2);
                 g.setColor(Color.blue ) ;
g.drawRect(37+38*3-10,86+32-15,25,20) ; g.drawRect(268+38*3-8,86+32-15,25,20) ;
}
 if(shag==5){
   Stringer.drawString("- \u03C7_{ 3} ",104,50); Stringer.drawString("- \u03C7_{ 2} ",142,50);
                   Stringer.drawString("- v_{ 1} ",142+38,50);
                   Stringer.drawString("\u03C7_{ 1} ",37,86);Stringer.drawString("v_{ 2} ",37,86+32);
                   Stringer.drawString("v_{ 3} ",37,86+32*2);
                   Stringer.drawString("1 ",37+38,86+32*2);
                   Stringer.drawString("0",37+38*2,86);Stringer.drawString("0",37+38*2,86+32);
                   Stringer.drawString("1",37+38*2,86+32*2);
                    Stringer.drawString("0",37+38*3,86+32*2);
                   Stringer.drawString("2",37+38*4,86);Stringer.drawString(""+matA[1][2],37+38*4,86+32);
                   Stringer.drawString("3",37+38*4,86+32*2);
                   Stringer.drawString("- u_{ 1} ",254+38*2+10,50); Stringer.drawString("- y_{ 2} ",254+38*3+10,50);
                  Stringer.drawString("- y_{ 3} ",254+38*4+10,50);
                  Stringer.drawString("y_{ 1} ",268,86);Stringer.drawString("u_{ 2} ",268,86+32);
                  Stringer.drawString("u_{ 3} ",268,86+32*2);
                  Stringer.drawString("1 ",268+38,86);

                  Stringer.drawString(""+matB[0][0],268+38*2,86);Stringer.drawString(""+matB[1][0],268+38*2,86+32);
                  Stringer.drawString(""+matB[2][0],268+38*2,86+32*2);
                  Stringer.drawString(""+matB[0][1],268+38*3,86);
                  Stringer.drawString("0",268+38*4,86);Stringer.drawString("0",268+38*4,86+32);
                  Stringer.drawString("1",268+38*4,86+32*2);
                  Stringer.fonts[0]=new Font("Dialog", 1, 13);
                  Stringer.drawString("\u2153 ",37+38,86);Stringer.drawString("\u2153",37+38,86+32);
                  Stringer.drawString("-\u2154",37+38*3,86);Stringer.drawString("\u2153",37+38*3,86+32);
                 Stringer.drawString("\u2153 ",268+38,86+32);  Stringer.drawString("\u2153 ",268+38,86+32*2);
                 Stringer.drawString("\u2153",268+38*3,86+32);
                  Stringer.drawString("-\u2154",268+38*3,86+32*2);  g.setColor(Color.blue ) ;

 }
   } }
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
               Stringer.drawString("Даны две матрицы А и В. Найти решение системы, используя",20,15) ;
               Stringer.drawString("предложенный алгоритм. В задаче m = n = 3.",20,35) ;
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
                      Stringer.drawString("Используя матрицы, заполним начальные таблицы.",20,15) ;

                        }
    if(shag==2) { Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                      g.setColor(new Color(180,0,60)  ) ;
                                     Stringer.drawString("2.",8,15) ;
                                     Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                     g.setColor(new Color(0,0,80) ) ;
                                     Stringer.drawString("Если мы поменяем в Таблице 1 v_{ 1} на \u03C7_{ 3}, а в Таблице 2 поменяем u_{3} на y_{3}.",20,15) ;
                                     Stringer.drawString("При этом помним, что при замене используем Жорданово преобразование.",20,35) ;
                                     Stringer.drawString("",20,55) ;
                              }
    if(shag==3) { Stringer.fonts[0]=new Font("Dialog", 2, 14);
     g.setColor(new Color(180,0,60)  ) ;
     Stringer.drawString("3.",8,15) ;
     Stringer.fonts[0]=new Font("Dialog", 1, 12);
     g.setColor(new Color(0,0,80) ) ;
     Stringer.drawString("Получили следующие таблицы. Теперь мы имеем j_{ 1} = 1, i_{ 1} = 3, j_{ 2} = 3 \u2260 j_{ 1}.",20,15) ;
     Stringer.drawString("Поэтому в Таблице 1 меняем v_{ 3} c v_{ 1}. ",20,35) ;
     Stringer.drawString("",20,55) ;
      }
      if(shag==4) { Stringer.fonts[0]=new Font("Dialog", 2, 14);
         g.setColor(new Color(180,0,60)  ) ;
         Stringer.drawString("3.",8,15) ;
         Stringer.fonts[0]=new Font("Dialog", 1, 12);
         g.setColor(new Color(0,0,80) ) ;
         Stringer.drawString("На этом этапе можем остановиться и получим решение u^{ T} = v^{ T} = (0,0,1)^{ T}.",20,15) ;
         Stringer.drawString("Также мы можем продолжить и поменять v_{ 2} c \u03C7_{ 2} в Таблице 1 и u_{ 2} c y_{ 2}  ",20,35) ;
         Stringer.drawString("в Таблице 2.",20,55) ;
          }
  if(shag==5) { Stringer.fonts[0]=new Font("Dialog", 2, 14);
                   g.setColor(new Color(180,0,60)  ) ;
                   Stringer.drawString("4.",8,15) ;
                   Stringer.fonts[0]=new Font("Dialog", 1, 12);
                   g.setColor(new Color(0,0,80) ) ;
                   Stringer.drawString("Из полученных таблиц выделяем решение u^{ T}  = (0, \u2153 , \u2153)^{ T} и v^{ T} = (0, \u2153, 1)^{ T}",20,15) ;
                   Stringer.drawString(" - решение системы.",20,35) ;
                   Stringer.drawString("Некоторое решение найдено, начиная с j_{ 1} = 2 и j_{ 1} = 3. Но начиная с j_{ 1} = 2",20,55) ;
                    Stringer.drawString(" мы получили расширенное решение u^{ T} = v^{ T} =(0, \u2153 ,1)^{ T}.",20,75) ;
                    }



    } }


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

  void jButton_pred_actionPerformed(ActionEvent e) {
    shag--;
           if(shag==0) jButton_pred.setEnabled(false) ;
               if(shag!=0 & shag!=8) jButton_next.setEnabled(true) ;
       jPanel1.repaint() ;
           jPanel2.repaint() ;

  }

  void jCheckBox1_actionPerformed(ActionEvent e) {
    k++; if(k%2==0) {jPanel_mat.setVisible(false) ;
                        jPanel2.setVisible(true) ;
                         jPanel1.setVisible(true) ;
                        }
    if(k%2!=0) {jPanel_mat.setVisible(true) ;
                                            jPanel2.setVisible(true) ;jPanel1.setVisible(true) ;
                                            }


  }

  void jButton_new_actionPerformed(ActionEvent e) {
   shag=0;jButton_pred.setEnabled(false) ;
         jButton_next.setEnabled(true) ;
        jPanel2.repaint() ;jPanel1.repaint() ;

  }

  void jButton_next_actionPerformed(ActionEvent e) {
    if (shag<5){shag++; jButton_pred.setEnabled(true) ;
           jPanel2.repaint() ;jPanel1.repaint() ;}
       if(shag==5)jButton_next.setEnabled(false) ;}


}

class ApplPoisk1_jButton_pred_actionAdapter implements java.awt.event.ActionListener {
  ApplPoisk1 adaptee;

  ApplPoisk1_jButton_pred_actionAdapter(ApplPoisk1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton_pred_actionPerformed(e);
  }
}

class ApplPoisk1_jCheckBox1_actionAdapter implements java.awt.event.ActionListener {
  ApplPoisk1 adaptee;

  ApplPoisk1_jCheckBox1_actionAdapter(ApplPoisk1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jCheckBox1_actionPerformed(e);
  }
}

class ApplPoisk1_jButton_new_actionAdapter implements java.awt.event.ActionListener {
  ApplPoisk1 adaptee;

  ApplPoisk1_jButton_new_actionAdapter(ApplPoisk1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton_new_actionPerformed(e);
  }
}

class ApplPoisk1_jButton_next_actionAdapter implements java.awt.event.ActionListener {
  ApplPoisk1 adaptee;

  ApplPoisk1_jButton_next_actionAdapter(ApplPoisk1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton_next_actionPerformed(e);
  }
}
