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

public class AppPrimChistStr extends JApplet {
  private boolean isStandalone = false;
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  JButton jButton3 = new JButton();
  JLabel jLabel1 = new JLabel();
  JLabel jLabel2 = new JLabel();
  Panel_Z jPanelZad = new Panel_Z();
  Panel_M jPanelMatr = new Panel_M();
  Panel_O jPanelObozn = new Panel_O();
  Panel_F jPanelForm = new Panel_F();
  Panel_R jPanelReshen = new Panel_R();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel4 = new JLabel();
  JLabel jLabel5 = new JLabel();
  JLabel jLabel6 = new JLabel();
  Border border1;
  int k=0;
  int [][]masA={{2,0,5},{2,2,3}};
   int [][]masB={{2,2,1},{0,7,8}};

  //Get a paraeter value
  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }

  //Construct the applet
  public AppPrimChistStr() {
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
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setBounds(new Rectangle(85, 457, 73, 22));
    jButton1.setEnabled(false);
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setText("<==");
    jButton1.addActionListener(new AppPrimChistStr_jButton1_actionAdapter(this));
    this.getContentPane().setBackground(new Color(247, 247, 255));
    this.setSize(new Dimension(453, 489));
    this.getContentPane().setLayout(null);
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setBounds(new Rectangle(176, 457, 94, 23));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setText("Обновить");
    jButton2.addActionListener(new AppPrimChistStr_jButton2_actionAdapter(this));
    jButton3.setBackground(new Color(220, 230, 255));
    jButton3.setBounds(new Rectangle(289, 457, 71, 23));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setText("==>");
    jButton3.addActionListener(new AppPrimChistStr_jButton3_actionAdapter(this));
    jLabel1.setBackground(new Color(130, 0, 80));
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setPreferredSize(new Dimension(62, 21));
    jLabel1.setText("Пример");
    jLabel1.setBounds(new Rectangle(172, 12, 107, 24));
    jLabel2.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel2.setForeground(new Color(180, 0, 60));
    jLabel2.setText("Задача:");
    jLabel2.setBounds(new Rectangle(11, 38, 66, 24));
    jPanelZad.setBackground(Color.white);
    jPanelZad.setBorder(border1);
    jPanelZad.setBounds(new Rectangle(11, 58, 426, 55));
    jPanelMatr.setBackground(Color.white);
    jPanelMatr.setBorder(border1);
    jPanelMatr.setBounds(new Rectangle(12, 130, 199, 209));
    jPanelObozn.setBackground(Color.white);
    jPanelObozn.setBorder(border1);
    jPanelObozn.setBounds(new Rectangle(226, 131, 212, 89));
    jPanelForm.setBackground(Color.white);
    jPanelForm.setBorder(border1);
    jPanelForm.setBounds(new Rectangle(228, 235, 210, 104));
    jPanelReshen.setBackground(Color.white);
    jPanelReshen.setBorder(border1);
    jPanelReshen.setBounds(new Rectangle(13, 355, 425, 96));
    jLabel3.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel3.setForeground(new Color(180, 0, 60));
    jLabel3.setOpaque(false);
    jLabel3.setText("Матрицы:");
    jLabel3.setBounds(new Rectangle(13, 115, 132, 13));
    jLabel4.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel4.setForeground(new Color(180, 0, 60));
    jLabel4.setText("Обозначения:");
    jLabel4.setBounds(new Rectangle(229, 113, 194, 20));
    jLabel5.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel5.setForeground(new Color(180, 0, 60));
    jLabel5.setText("Формулы:");
    jLabel5.setBounds(new Rectangle(229, 219, 156, 16));
    jLabel6.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel6.setForeground(new Color(180, 0, 60));
    jLabel6.setPreferredSize(new Dimension(58, 16));
    jLabel6.setText("Решение:");
    jLabel6.setBounds(new Rectangle(16, 339, 147, 16));
    this.getContentPane().add(jButton1, BorderLayout.SOUTH);
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jLabel1, null);
    this.getContentPane().add(jLabel2, null);
    this.getContentPane().add(jPanelZad, null);
    this.getContentPane().add(jPanelObozn, null);
    this.getContentPane().add(jPanelReshen, null);
    this.getContentPane().add(jPanelForm, null);
    this.getContentPane().add(jPanelMatr, null);
    this.getContentPane().add(jLabel3, null);
    this.getContentPane().add(jLabel4, null);
    this.getContentPane().add(jLabel5, null);
    this.getContentPane().add(jLabel6, null);
    this.getContentPane().add(jButton3, null);
  }
  class Panel_Z extends JPanel {
     public void paintComponent(Graphics g){
      super.paintComponent(g);
       Stringer.fonts[0]=new Font("Dialog", 1, 12);
       //g.setFont(new Font("Dialog",1, 14));
      //g.drawString("Решить биматричную игру.Функции выигрыша игроков представлены в виде матриц.",20,20) ;
      Stringer.setGraphics(g) ;
     // Stringer.fonts(new Font("Dialog", 0, 12));
      g.setColor(new Color(0,0,80)  ) ;
      Stringer.drawString(" Функции выигрыша двух игроков представлены в виде матриц A и B.",8,15);
      // g.setColor( Color.black ) ;
      Stringer.drawString("Найти  решение  биматричной  игры  в  чистой стратегии.",8,30) ;
  /* if((k==1)&(k<20)) {  Stringer.drawString("Данное уравнение является ДУ первого порядка.",10,15) ;}
   if((k==2)&(k<20)) {  Stringer.drawString("Оно удовлетворяет всем условиям Теоремы Коши,",10,35) ;
      Stringer.drawString("так как функция f(x,y)=3x^{2} и f '_{y}(x,y)=0",10,55) ;
    //  g.drawLine(80,51,93,51) ;
    //  g.setColor(new Color(180,0,60)  ) ;
       Stringer.drawString("определены и непрерывны на всей плоскости Oxy.",10,75);}
      // g.setColor( Color.black ) ;
     //  Stringer.drawString("",105,100) ;
    if(k==3){  Stringer.drawString("Легко проверить, что функция y=x^{3}+C, где C=const,",10,95) ;
    /  * Stringer.drawString("является общим решением данного уравнения во ",10,115) ;
    // Stringer.drawString("стратегиях.",8,45) ;
*/
    }
      }
    class Panel_M extends JPanel {
         public void paintComponent(Graphics g){
          super.paintComponent(g);
          Stringer.setGraphics(g) ;
          Stringer.fonts[0]=new Font("Dialog", 1, 14);
         // Stringer.fonts[1]=new Font("Dialog", 1, 12);
          FontMetrics Fm=g.getFontMetrics(new Font("SansSerif", 1, 14));
          FontMetrics Fm1=g.getFontMetrics(new Font("SansSerif", 1, 11));
          g.setColor(new Color(0,0,80)  ) ;
          g.setFont(new Font("SansSerif",1, 14));
         g.drawString("A",15,55);
         g.drawString("B",15,160) ;
          g.setColor( Color.black ) ;
         // g.drawRect(20,10,100,80);
            for(int i=0;i<6;i++)
            {
              g.drawLine(0+i*50,0,0+i*50,209) ;
              //g.drawLine(20,50,120,50) ;
             }
        //  g.drawRect(20,100,100,80);
             for(int i=0;i<4;i++)
              {
                if(i==1||i==3) g.drawLine(50,0+i*50,200,0+i*50) ;
                   else g.drawLine(0,0+i*50,200,0+i*50) ;

              }
        Stringer.drawString("2",70,37) ;
         Stringer.drawString("0",120,37) ;
         Stringer.drawString("5",170,37) ;
         Stringer.drawString("2",70,87) ;
         Stringer.drawString("2",120,87) ;
         Stringer.drawString("3",170,87) ;

         Stringer.drawString("2",70,137) ;
         Stringer.drawString("2",120,137) ;
         Stringer.drawString("1",170,137) ;

         Stringer.drawString("0",70,187) ;
         Stringer.drawString("7",120,187) ;
         Stringer.drawString("8",170,187) ;//2 matr

        //g.setFont(new Font("Dialog",1, 14));
       if(k==2)
         {g.setColor(Color.red );
            Stringer.drawString("2",70,37) ;
             Stringer.drawString("2",70,137) ;
         }


        }
          }
   class Panel_O extends JPanel {
             public void paintComponent(Graphics g){
              super.paintComponent(g);
              Stringer.setGraphics(g) ;
              Stringer.fonts[0]=new Font("Dialog", 1, 12);
//   Stringer2.fonts[1]=new Font("Dialog", 1, ds-5);
              g.setColor(new Color(0,0,80)  ) ;
             // Stringer.drawString("v_{1},  v_{2} -  выигрыши  игроков в",05,13);
              // g.setColor( Color.black ) ;
             // Stringer.drawString(" ситуации  равновесия (x,y)",8,25) ;
              Stringer.drawString("a_{i} (b_{j}) - строки(столбцы)",7,17) ;
              Stringer.drawString(" матрицы A(B)",7,34) ;

            }
              }
      class Panel_F extends JPanel {
                 public void paintComponent(Graphics g){
                  super.paintComponent(g);
                  Stringer.setGraphics(g) ;
                   Stringer.fonts[0]=new Font("Dialog", 1, 12);
                  g.setColor(new Color(0,0,80)  ) ;
                   Stringer.drawString("Cитуация равновесия  по Нэшу:",7,17);
                  Stringer.drawString("a_{i j* }\u2264 a_{i* j* }",7,34);
                   Stringer.drawString("b_{i* j }\u2264 a_{i* j* }",7,51);

                  // Stringer.drawString("Оптимальная стратегия:",05,82);
                    Stringer.drawString("i=1..m",07,68);
                    Stringer.drawString("j=1..n",07,85);
                    if(k==2) {
                                     g.setColor(Color.red );
                                     Stringer.drawString("a_{i j* }\u2264 a_{i* j* }",7,34);
                   Stringer.drawString("b_{i* j }\u2264 a_{i* j* }",7,51);

                             }
              // g.setColor( Color.black ) ;
          /*       // Stringer.drawString("Решим  уравение  y' = 3x^{2} ",8,15) ;
               if((k==1)&(k<20)) {  Stringer.drawString("Данное уравнение является ДУ первого порядка.",10,15) ;}
               if((k==2)&(k<20)) {  Stringer.drawString("Оно удовлетворяет всем условиям Теоремы Коши,",10,35) ;
                  Stringer.drawString("так как функция f(x,y)=3x^{2} и f '_{y}(x,y)=0",10,55) ;
                //  g.drawLine(80,51,93,51) ;
                //  g.setColor(new Color(180,0,60)  ) ;
                   Stringer.drawString("определены и непрерывны на всей плоскости Oxy.",10,75);}
                  // g.setColor( Color.black ) ;
                 //  Stringer.drawString("",105,100) ;
                if(k==3){  Stringer.drawString("Легко проверить, что функция y=x^{3}+C, где C=const,",10,95) ;
                  Stringer.drawString("является общим решением данного уравнения во ",10,115) ;
                  Stringer.drawString("всей плоскости Oxy.",10,135) ;}
     */
                }
                  }
       class Panel_R extends JPanel {
                     public void paintComponent(Graphics g){
                      super.paintComponent(g);
                     Stringer.setGraphics(g) ;
                      Stringer.fonts[0]=new Font("Dialog", 1, 12);
                      g.setColor(new Color(0,0,80)  ) ;
                      //Stringer.drawString("",10,10);
                      // g.setColor( Color.black ) ;
                     // Stringer.drawString("Решим  уравение  y' = 3x^{2} ",8,15) ;
                   if(k==1) {
                       Stringer.fonts[0]=new Font("Dialog", 2, 16);
                       g.setColor(new Color(180,0,60)  ) ;
                       Stringer.drawString("1.",10,17) ;
                       Stringer.fonts[0]=new Font("Dialog", 1, 12);
                        g.setColor(new Color(0,0,80)  ) ;
                        Stringer.drawString("Найдем   ситуации   равновесия  по  Нэшу в чистых стратегиях.",23,17) ;
                        Stringer.drawString("",10,34) ;
                   }

                   if(k==2) {
                     Stringer.fonts[0]=new Font("Dialog", 2, 16);
                     g.setColor(new Color(180,0,60)  ) ;
                     Stringer.drawString("2.",10,17) ;
                     Stringer.fonts[0]=new Font("Dialog", 1, 12);
                     g.setColor(new Color(0,0,80)  ) ;
                     Stringer.drawString("Согласно определению получаем, что пара (1,1) является ",23,17) ;
                     Stringer.drawString("ситуацией по Нэшу в чистых стратегиях.",10,34) ;


                   }
                   if(k==3) {
                     Stringer.fonts[0]=new Font("Dialog", 2, 16);
                     g.setColor(new Color(180,0,60)  ) ;
                     Stringer.drawString("3.",10,17) ;
                     Stringer.fonts[0]=new Font("Dialog", 1, 12);
                     g.setColor(new Color(0,0,80)  ) ;
                     Stringer.drawString("Для данных матриц: i=1,2  ;  j=1..3 ",23,17) ;
                     Stringer.drawString("Подставляя элементы матриц в неравенства будем иметь:",10,34) ;
                     Stringer.drawString("a_{ i * j * } = 2  ;  b_{ i * j * } = 2",10,51) ;
                      Stringer.drawString("a_{ 2 1 } = 2 \u2264 2 = a_{ 1 1 } ",10,68) ;
                      Stringer.drawString("b_{ 1 2 } = 2 \u2264 2 = b_{ 1 1 }",200,51) ;
                     Stringer.drawString("b_{ 1 3 } = 1 \u2264 2 = b_{ 1 1 }",200,68) ;
                     // Stringer.drawString("a_{ 2 1 } = 2 \u2264 2 ",100,68) ;

                   }
                   if(k==4) {
                                        Stringer.fonts[0]=new Font("Dialog", 2, 16);
                                        g.setColor(new Color(180,0,60)  ) ;
                                        Stringer.drawString("4.",10,17) ;
                                        Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                        g.setColor(new Color(0,0,80)  ) ;
                                        Stringer.drawString("Полученные неравенства выполняются для любых i=1,2 и j=1..3.",23,17) ;
                                        Stringer.drawString("Cледовательно, действительно, пара (1,1) является ситуацией по ",10,34) ;
                                        Stringer.drawString("Нэшу в чистых стратегиях.",10,51) ;
                   }
                     }
       }
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

  void jButton3_actionPerformed(ActionEvent e) {
 k++;
 if(k>0)jButton1.setEnabled(true) ;
 if(k==4) jButton3.setEnabled(false) ;
    else jButton3.setEnabled(true) ;
  jPanelZad.repaint() ;
  jPanelMatr.repaint() ;
  jPanelObozn.repaint() ;
  jPanelForm.repaint() ;
  jPanelReshen.repaint() ;

  }

  void jButton1_actionPerformed(ActionEvent e) {
k--;
if(k==0) jButton1.setEnabled(false) ;
     if(k<=4) jButton3.setEnabled(true) ;
    jPanelZad.repaint() ;
  jPanelMatr.repaint() ;
  jPanelObozn.repaint() ;
  jPanelForm.repaint() ;
  jPanelReshen.repaint() ;


  }

  void jButton2_actionPerformed(ActionEvent e) {
  k=0;jButton1.setEnabled(false) ;
  jButton3.setEnabled(true) ;
  jPanelZad.repaint() ;
  jPanelMatr.repaint() ;
  jPanelObozn.repaint() ;
  jPanelForm.repaint() ;
  jPanelReshen.repaint() ;

  }
}

class AppPrimChistStr_jButton3_actionAdapter implements java.awt.event.ActionListener {
  AppPrimChistStr adaptee;

  AppPrimChistStr_jButton3_actionAdapter(AppPrimChistStr adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton3_actionPerformed(e);
  }
}

class AppPrimChistStr_jButton1_actionAdapter implements java.awt.event.ActionListener {
  AppPrimChistStr adaptee;

 AppPrimChistStr_jButton1_actionAdapter(AppPrimChistStr adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}

class AppPrimChistStr_jButton2_actionAdapter implements java.awt.event.ActionListener {
  AppPrimChistStr adaptee;

  AppPrimChistStr_jButton2_actionAdapter(AppPrimChistStr adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}
