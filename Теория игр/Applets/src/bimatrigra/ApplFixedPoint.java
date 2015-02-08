package bimatrigra;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * <p>Title:Динамическая обработка игры </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2008</p>
 * <p>Company: MarGU</p>
 * @author Pm-53
 * @version 1.0
 */

public class ApplFixedPoint extends Applet {
  private boolean isStandalone = false;
  JLabel jLabel1 = new JLabel();
  JButton jButton_pred = new JButton();
  JButton jButton_new = new JButton();
  JButton jButton_next = new JButton();
  Panel_Z jPanel1 = new Panel_Z();
  Panel_M jPanel2 = new Panel_M();
  Panel_F jPanel3 = new Panel_F();
  Panel_R jPanel4 = new Panel_R();
  Border border1;
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel4 = new JLabel();
  JLabel jLabel5 = new JLabel();
 int matA[][]=new int [3][2];int matB[][]=new int[2][3];
 int E2AV,uAv,E1BU,vBu;float U,V;
 int Shag=0;
  //Get a parameter value
  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }

  //Construct the applet
  public ApplFixedPoint() {
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
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setText("Пример");
    jLabel1.setBounds(new Rectangle(184, 1, 112, 30));
    this.setBackground(new Color(247,247,255)) ;
    this.setLayout(null) ;
    jButton_pred.setBackground(new Color(220, 230, 255));
    jButton_pred.setBounds(new Rectangle(74, 371, 71, 23));
    jButton_pred.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton_pred.setForeground(new Color(0, 0, 60));
    jButton_pred.setText("<==");
    jButton_pred.addActionListener(new ApplFixedPoint_jButton_pred_actionAdapter(this));
    jButton_new.setBackground(new Color(220, 230, 255));
    jButton_new.setBounds(new Rectangle(164, 371, 96, 23));
    jButton_new.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton_new.setForeground(new Color(0, 0, 60));
    jButton_new.setAlignmentX((float) 0.0);
    jButton_new.setText("Обновить");
    jButton_new.addActionListener(new ApplFixedPoint_jButton_new_actionAdapter(this));
    jButton_next.setBackground(new Color(220, 230, 255));
    jButton_next.setBounds(new Rectangle(278, 372, 71, 23));
    jButton_next.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton_next.setForeground(new Color(0, 0, 60));
    jButton_next.setActionCommand("==>");
    jButton_next.setText("==>");
    jButton_next.addActionListener(new ApplFixedPoint_jButton_next_actionAdapter(this));
    jPanel1.setBackground(Color.white);
    jPanel1.setForeground(Color.white);
    jPanel1.setBorder(border1);
    jPanel1.setBounds(new Rectangle(11, 34, 411, 52));
    jPanel2.setBackground(Color.white);
    jPanel2.setForeground(Color.white);
    jPanel2.setBorder(border1);
    jPanel2.setBounds(new Rectangle(13, 100, 235, 138));
    jPanel3.setBackground(Color.white);
    jPanel3.setForeground(Color.white);
    jPanel3.setBorder(border1);
    jPanel3.setBounds(new Rectangle(266, 101, 156, 137));
    jPanel4.setBackground(Color.white);
    jPanel4.setForeground(Color.black);
    jPanel4.setBorder(border1);
    jPanel4.setBounds(new Rectangle(13, 254, 409, 98));
    jLabel2.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel2.setForeground(new Color(180, 0, 60));
    jLabel2.setText("Задача:");
    jLabel2.setBounds(new Rectangle(14, 20, 95, 15));
    jLabel3.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel3.setForeground(new Color(180, 0, 60));
    jLabel3.setText("Матрицы:");
    jLabel3.setBounds(new Rectangle(14, 85, 72, 15));
    jLabel4.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel4.setForeground(new Color(180, 0, 60));
    jLabel4.setText("Формулы:");
    jLabel4.setBounds(new Rectangle(265, 85, 111, 15));
    jLabel5.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel5.setForeground(new Color(180, 0, 60));
    jLabel5.setText("Решение:");
    jLabel5.setBounds(new Rectangle(16, 239, 109, 15));
    this.add(jLabel1, null);
    this.add(jPanel1, null);
    this.add(jPanel2, null);
    this.add(jPanel3, null);
    this.add(jPanel4, null);
    this.add(jLabel2, null);
    this.add(jButton_new, null);
    this.add(jButton_next, null);
    this.add(jButton_pred, null);
    this.add(jLabel4, null);
    this.add(jLabel5, null);
    this.add(jLabel3, null);
  }
 class Panel_Z extends JPanel {
        public void paintComponent(Graphics g){
         super.paintComponent(g);
          Stringer.fonts[0]=new Font("Dialog", 1, 12);
           Stringer.setGraphics(g) ;
         g.setColor(new Color(0,0,80)  ) ;
         Stringer.drawString(" Даны две матрицы А и В. Показать, что (e_{ 2}, e_{ 1}) асимптотически ",8,15);
         Stringer.drawString("стабильная устойчивая точка. Найти подмножества U и V.",8,30) ;
} }
 class Panel_F extends JPanel {
         public void paintComponent(Graphics g){
          super.paintComponent(g);
           Stringer.fonts[0]=new Font("Dialog", 1, 12);
            Stringer.setGraphics(g) ;g.setColor(new Color(0,0,80)  ) ;
       Stringer.drawString("e_{ k} A v^{ T} > u A v^{ T}   и ",5,15) ;
       Stringer.drawString("e_{ l} B u^{ T} > v B u^{ T}",5,30) ;
       Stringer.drawString("для всех ( u, v ) \u0404 U \u00D7 V ",20,45) ;
      Stringer.drawString("с u \u2260 e_{ k} и v \u2260 e_{ l}",20,60) ;
      if(Shag==8) g.setColor(Color.red  ) ;
      Stringer.drawString("( e_{ k}, e_{ l} )= lim f^{ t}( u , v ) ",5,80) ;
      Stringer.drawString(" для всех ( u , v ) \u0404  W ",20,105) ;
   Stringer.fonts[0]=new Font("Dialog", 1, 10);    Stringer.drawString("t \u2192 \u221E",62,90) ;
     }}
 class Panel_M extends JPanel {
         public void paintComponent(Graphics g){
          super.paintComponent(g);
             Stringer.setGraphics(g) ;
             g.setColor(new Color(50,50,50)  ) ;
 g.fillRect(0,28*2,235,2) ;//средняя линия
 g.drawLine(58,28,235,28) ;
 g.drawLine(58,28*3,235,28*3) ; g.drawLine(58,28*4,235,28*4) ; //g.drawLine(58,28,235,28) ;
 g.drawLine(58,0,58,138);g.drawLine(58*2,0,58*2,56);g.drawLine(58*3,0,58*3,56);
 g.drawLine((int)(235-58)/2+58,56,(int)(235-58)/2+58,138);
 g.setColor(new Color(0,0,80) ) ;Stringer.fonts[0]=new Font("Dialog", 1,12);
 Stringer.drawString("A",25,40) ;Stringer.drawString("B",25,110) ;
 Stringer.drawString("5",28+58,25);  Stringer.drawString("3",28+58*2,25); Stringer.drawString("1",28+58+58*2,25);
 Stringer.drawString("6",28+58,25+28); Stringer.drawString("4",28+58*2,25+28); Stringer.drawString("2",28+58+58*2,25+28);
 Stringer.drawString("4",58+78/2,25+28*2);  Stringer.drawString("3",58+78+55,25+28*2);
 Stringer.drawString("5",58+78/2,25+28*3);  Stringer.drawString("5",58+78+55,25+28*3);
 Stringer.drawString("6",58+78/2,23+28*4);  Stringer.drawString("1",58+78+55,23+28*4);
        }
  }
  class Panel_R extends JPanel {
        public void paintComponent(Graphics g){
         super.paintComponent(g);
          Stringer.fonts[0]=new Font("Dialog", 1, 12);
           Stringer.setGraphics(g) ;
          if (Shag==0){
                       Stringer.fonts[0]=new Font("Dialog", 2, 14);
                       g.setColor(new Color(180,0,60)  ) ;
                       Stringer.fonts[0]=new Font("Dialog", 1, 12);
                       g.setColor(new Color(0,0,80) ) ;
                        Stringer.drawString("Будем рассматривать задачу при m=2 , n=3.",20,15) ;
                   }
         if (Shag==1){
         Stringer.fonts[0]=new Font("Dialog", 2, 14);
         g.setColor(new Color(180,0,60)  ) ;
         Stringer.drawString("1.",8,15) ;
         Stringer.fonts[0]=new Font("Dialog", 1, 12);
         g.setColor(new Color(0,0,80) ) ;
        Stringer.drawString("Тогда исходя из теоремы следует: точка ( e_{ 2} , e_{ 1} ) \u0404 S_{ 1} \u00D7 S_{ 2}  ",20,15) ;
        Stringer.drawString("является точкой равновесия по Нэшу. Поэтому имеем:",13,35) ;
        Stringer.drawString(" S_{1}   = ( u \u0404  R^{ 2} | u_{ 1} \u2265 0 , u_{ 2} \u2265 0 , u_{ 1} + u_{ 2} = 1 ) ;",13,55) ;
        Stringer.drawString(" S_{2}   = ( v \u0404  R^{ 3} | v_{ 1} \u2265 0 , v_{ 2} \u2265 0 , v_{ 2} \u2265 0 , v_{ 1} + v_{ 2}+v_{ 3} = 1 ) ;",13,75) ;
         }
if (Shag==2){
              Stringer.fonts[0]=new Font("Dialog", 2, 14);
              g.setColor(new Color(180,0,60)  ) ;
              Stringer.drawString("2.",8,15) ;
              Stringer.fonts[0]=new Font("Dialog", 1, 12);
              g.setColor(new Color(0,0,80) ) ;
             Stringer.drawString("Далее мы получаем:",20,15) ;
             Stringer.drawString("e_{ 2} A v^{ T} = ( 0 , 1 )",13,35) ;
              Stringer.drawString(" = 6 v_{ 1} + 4 v_{ 2} +2 v_{ 3}",220,35) ;
             Stringer.drawString("5 v_{ 1} + 3 v_{ 2} +  v_{ 3}",115,30) ;
             Stringer.drawString("6 v_{ 1} + 4 v_{ 2} +2 v_{ 3}",115,45) ;
                  //Stringer.drawString(" S_{2}   = ( v \u0404  R^{ 3} | v_{ 1} \u2265 0 , v_{ 2} \u2265 0 , v_{ 2} \u2265 0 , v_{ 1} + v_{ 2}+v_{ 3} = 1 ) ;",13,75) ;
      Stringer.fonts[0]=new Font("Dialog", 1, 17);
        Stringer.drawString("\u0028",108,35) ; Stringer.drawString("\u0029",212,35) ;
                                 }
      if (Shag==3){
      Stringer.fonts[0]=new Font("Dialog", 2, 14);
      g.setColor(new Color(180,0,60)  ) ;
      Stringer.drawString("3.",8,15) ;
      Stringer.fonts[0]=new Font("Dialog", 1, 12);
      g.setColor(new Color(0,0,80) ) ;
      Stringer.drawString("И также: ",20,15) ;
      Stringer.drawString("u A v^{ T} = ( u_{ 1} , u_{ 2} )",13,35) ;
      Stringer.drawString(" = u_{ 1} * (5 v_{ 1} + 3 v_{ 2} + v_{ 3}) + ",230,35) ;
       Stringer.drawString(" + u_{ 2} * (6 v_{ 1} + 4 v_{ 2} +2 v_{ 3}) = 6 v_{ 1} + 4 v_{ 2} +2 v_{ 3} - u_{ 1} ",10,70) ;
      Stringer.drawString("5 v_{ 1} + 3 v_{ 2} +  v_{ 3}",125,30) ;
      Stringer.drawString("6 v_{ 1} + 4 v_{ 2} +2 v_{ 3}",125,45) ;
      //Stringer.drawString(" S_{2}   = ( v \u0404  R^{ 3} | v_{ 1} \u2265 0 , v_{ 2} \u2265 0 , v_{ 2} \u2265 0 , v_{ 1} + v_{ 2}+v_{ 3} = 1 ) ;",13,75) ;
      Stringer.fonts[0]=new Font("Dialog", 1, 17);
      Stringer.drawString("\u0028",118,35) ; Stringer.drawString("\u0029",224,35) ;
      }
      if (Shag==4){
                  Stringer.fonts[0]=new Font("Dialog", 2, 14);
                  g.setColor(new Color(180,0,60)  ) ;
                  Stringer.drawString("4.",8,15) ;
                  Stringer.fonts[0]=new Font("Dialog", 1, 12);
                  g.setColor(new Color(0,0,80) ) ;
                 Stringer.drawString("Следовательно:",20,15) ;
                 Stringer.drawString("e_{ 2} A v^{ T} - u A v^{ T} = u_{ 1} > 0, если u_{ 1} > 0.",50,35) ;  }
 if (Shag==5){
                                 Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                 g.setColor(new Color(180,0,60)  ) ;
                                 Stringer.drawString("5.",8,15) ;
                                 Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                 g.setColor(new Color(0,0,80) ) ;
                                Stringer.drawString("Вычислим:",20,15) ;
                                Stringer.drawString("e_{ 1} B u^{ T} = ( 1 , 0 , 0 ) *     5 u_{ 1} + 2_u_{ 2}",13,35) ;
                              Stringer.drawString(" = 4 u_{ 1} + 3 u_{ 2} = 3 + u_{ 1}",230,35) ;
                              Stringer.drawString("4 u_{ 1} + 3 u_{ 2}",150,22) ;
                         Stringer.drawString("6 u_{ 1} + u_{ 2}",150,47) ;
                         Stringer.fonts[0]=new Font("Dialog", 0, 24);
      Stringer.drawString("\u0028",135,35) ; Stringer.drawString("\u0029",215,35) ;}
    if (Shag==6){
                                     Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                     g.setColor(new Color(180,0,60)  ) ;
                                     Stringer.drawString("6.",8,15) ;
                                     Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                     g.setColor(new Color(0,0,80) ) ;
                                    Stringer.drawString("Теперь вычислим:",20,15) ;
                                    Stringer.drawString("v B u^{ T} = ( v_{ 1} , v_{ 2} , v_{ 3} ) *     5 u_{ 1} + 2_u_{ 2}       = ",13,35) ;
                                  Stringer.drawString(" = v_{ 1}( 4 u_{ 1} + 3 u_{ 2} ) + v_{ 2} ( 5 u_{ 1} + 2_u_{ 2} ) + v_{ 3} ( 6 u_{ 1} + u_{ 2}) = ",13,65) ;
                                   Stringer.drawString(" =3 v_{ 1}+2 v_{ 2} +  v_{ 3} +  u_{ 1} (2 v_{ 1} +3 v_{ 2} + 5 v_{ 3}).",13,80) ;
                                  Stringer.drawString("4 u_{ 1} + 3 u_{ 2}",165,22) ;
                             Stringer.drawString("6 u_{ 1} + u_{ 2}",165,47) ;
                             Stringer.fonts[0]=new Font("Dialog", 0, 24);
          Stringer.drawString("\u0028",155,35) ; Stringer.drawString("\u0029",230,35) ;}
   if (Shag==7){
                          Stringer.fonts[0]=new Font("Dialog", 2, 14);
                          g.setColor(new Color(180,0,60)  ) ;
                          Stringer.drawString("7.",8,15) ;
                          Stringer.fonts[0]=new Font("Dialog", 1, 12);
                          g.setColor(new Color(0,0,80) ) ;
                         Stringer.drawString("Следовательно:",20,15) ;
                         Stringer.drawString("e_{ 1} B u^{ T} - v B u^{ T} = 3 + u_{ 1} - 3 v_{ 1} - 2 v_{ 2} - v_{ 3} - u_{ 1} ( v_{ 1} + 3 v_{ 2} +  5 v_{ 3}) = ",13,35) ;
                       Stringer.drawString("= 3 + u_{ 1} ( - 2 v_{ 2} - 4 v_{ 3} ) - 3 v_{ 1} - 2 v_{ 2} -   v_{ 3} > ",13,55) ;
                     Stringer.drawString(" > 3 - 3 v_{ 1} - 3 v_{ 2} - 3 v_{ 3} = 0 , если u_{ 1} <   ",13,75) ;
  Stringer.fonts[0]=new Font("Dialog", 1, 16);
                     Stringer.drawString("\u00BD.",230,75) ;}
      if (Shag==8){
                                   Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                   g.setColor(new Color(180,0,60)  ) ;
                                   Stringer.drawString("8.",8,15) ;
                                   Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                   g.setColor(new Color(0,0,80) ) ;
                                  Stringer.drawString("Это показывает, что условию теоремы удовлетворяет выражение:",20,15) ;
                                  Stringer.drawString("U = ( u \u0404 S_{ 1} | 0 \u2264 u_{ 1} \u003C  \u00BD ) и V = S_{ 2}.",50,35) ;
                                Stringer.drawString("Из теоремы следует, что (e_{ 2}, e_{ 1}) асимптотически стабильная ",20,55);
 Stringer.drawString("устойчивая точка f. Мы получили, что выражение истинно для ",20,75);
 Stringer.drawString("для k=2, l=1 и W = U \u00D7 V.",20,95);
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

  void jButton_pred_actionPerformed(ActionEvent e) {
    Shag--;
       if(Shag==0) jButton_pred.setEnabled(false) ;
           if(Shag!=0 & Shag!=8) jButton_next.setEnabled(true) ;
   jPanel3.repaint() ;
       jPanel2.repaint() ;jPanel4.repaint() ;
  }

  void jButton_new_actionPerformed(ActionEvent e) {
    Shag=0;jButton_pred.setEnabled(false) ;
     jButton_next.setEnabled(true) ;
    jPanel2.repaint() ;jPanel3.repaint() ;jPanel4.repaint() ;

  }

  void jButton_next_actionPerformed(ActionEvent e) {
   if (Shag<8){Shag++; jButton_pred.setEnabled(true) ;
       jPanel2.repaint() ;jPanel3.repaint() ;jPanel4.repaint() ;}
   if(Shag==8)jButton_next.setEnabled(false) ;}
}

class ApplFixedPoint_jButton_pred_actionAdapter implements java.awt.event.ActionListener {
  ApplFixedPoint adaptee;

  ApplFixedPoint_jButton_pred_actionAdapter(ApplFixedPoint adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton_pred_actionPerformed(e);
  }
}

class ApplFixedPoint_jButton_new_actionAdapter implements java.awt.event.ActionListener {
  ApplFixedPoint adaptee;

  ApplFixedPoint_jButton_new_actionAdapter(ApplFixedPoint adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton_new_actionPerformed(e);
  }
}

class ApplFixedPoint_jButton_next_actionAdapter implements java.awt.event.ActionListener {
  ApplFixedPoint adaptee;

  ApplFixedPoint_jButton_next_actionAdapter(ApplFixedPoint adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton_next_actionPerformed(e);
  }
}
