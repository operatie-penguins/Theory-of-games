package bimatrigra;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * <p>Title:Пример биматричной игры </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2007</p>
 * <p>Company: </p>
 * @author not attributable
 * @version 1.0
 */

public class AppPrim1 extends JApplet {
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
  public AppPrim1() {
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
    jButton1.addActionListener(new AppPrim1_jButton1_actionAdapter(this));
    this.getContentPane().setBackground(new Color(247, 247, 255));
    this.setSize(new Dimension(453, 489));
    this.getContentPane().setLayout(null);
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setBounds(new Rectangle(176, 457, 94, 23));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setText("Обновить");
    jButton2.addActionListener(new AppPrim1_jButton2_actionAdapter(this));
    jButton3.setBackground(new Color(220, 230, 255));
    jButton3.setBounds(new Rectangle(289, 457, 71, 23));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setText("==>");
    jButton3.addActionListener(new AppPrim1_jButton3_actionAdapter(this));
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
        Stringer.setGraphics(g) ;

      g.setColor(new Color(0,0,80)  ) ;
      Stringer.drawString(" Функции выигрыша двух игроков представлены в виде матриц A и B.",8,15);

      Stringer.drawString("Найти  решение  биматричной  игры  в  чистой  и  смешанной",8,30) ;

   Stringer.drawString("стратегиях.",8,45) ;

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
             for(int i=0;i<6;i++)
              {
                if(i==1||i==2||i==4||i==5) g.drawLine(50,0+i*35,200,0+i*35) ;
                   else g.drawLine(0,0+i*35,200,0+i*35) ;

              }
         Stringer.drawString("6",70,32) ;
         Stringer.drawString("0",120,32) ;
         Stringer.drawString("2",170,32) ;
         Stringer.drawString("0",70,67) ;
         Stringer.drawString("4",120,67) ;
         Stringer.drawString("3",170,67) ;
         Stringer.drawString("7",70,102) ;
         Stringer.drawString("0",120,102) ;
         Stringer.drawString("0",170,102) ;//1 matr
         Stringer.drawString("6",70,137) ;
         Stringer.drawString("0",120,137) ;
         Stringer.drawString("7",170,137) ;
         Stringer.drawString("0",70,172) ;
         Stringer.drawString("4",120,172) ;
         Stringer.drawString("0",170,172) ;
         Stringer.drawString("2",70,207) ;
         Stringer.drawString("3",120,207) ;
         Stringer.drawString("0",170,207) ;//2 matr

        //g.setFont(new Font("Dialog",1, 14));
       if(k==1)
         {g.setColor(Color.red );
           Stringer.drawString("4",120,67) ;
           Stringer.drawString("4",120,172) ;}

       // if(k==1) g.fillRect(101,36,48,34);

     /*  if((k==1)&(k<20)) {  Stringer.drawString("Данное уравнение является ДУ первого порядка.",10,15) ;}
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
   class Panel_O extends JPanel {
             public void paintComponent(Graphics g){
              super.paintComponent(g);
              Stringer.setGraphics(g) ;
              Stringer.fonts[0]=new Font("Dialog", 1, 12);
//   Stringer2.fonts[1]=new Font("Dialog", 1, ds-5);
              g.setColor(new Color(0,0,80)  ) ;
              Stringer.drawString("v_{1},  v_{2} -  выигрыши  игроков в",05,13);
              // g.setColor( Color.black ) ;
              Stringer.drawString(" ситуации  равновесия (x,y)",8,25) ;
              Stringer.drawString("a_{i} (b_{j}) - строки(столбцы)",5,45) ;
              Stringer.drawString(" матрицы A(B)",5,60) ;
        /*   if((k==1)&(k<20)) {  Stringer.drawString("Данное уравнение является ДУ первого порядка.",10,15) ;}
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
      class Panel_F extends JPanel {
                 public void paintComponent(Graphics g){
                  super.paintComponent(g);
                  Stringer.setGraphics(g) ;
                   Stringer.fonts[0]=new Font("Dialog", 1, 12);
                  g.setColor(new Color(0,0,80)  ) ;
                   Stringer.drawString("Смешанная ситуация равновесия:",5,12);
                  Stringer.drawString("x=v_{2}uB^{-1}",5,30);
                   Stringer.drawString("y=v_{1}A^{-1}u",5,48);
                    Stringer.drawString("v_{1}=(uA^{-1}u)^{-1}",85,30);
                    Stringer.drawString("v_{2}=(uB^{-1}u)^{-1}",85,48);
                    Stringer.drawString("u=(1,1,1)",5,64);
                    Stringer.drawString("Оптимальная стратегия:",05,82);
                    Stringer.drawString("ya_{i}=v_{1}",05,96);
                    Stringer.drawString("xb^{j}=v_{2}",85,96);
                    if(k==6) {
                                     g.setColor(Color.red );
                                     Stringer.drawString("x=v_{2}uB^{-1}",5,30);
                                     Stringer.drawString("y=v_{1}A^{-1}u",5,48);
                                     Stringer.drawString("v_{1}=(uA^{-1}u)^{-1}",85,30);
                                     Stringer.drawString("v_{2}=(uB^{-1}u)^{-1}",85,48);

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
                        Stringer.drawString("Для данной игры пара (2,2) по определению является ситуацией",23,17) ;
                        Stringer.drawString("по Нэшу в чистых стратегиях.",10,34) ;
                   }

                   if(k==2) {
                     Stringer.fonts[0]=new Font("Dialog", 2, 16);
                     g.setColor(new Color(180,0,60)  ) ;
                     Stringer.drawString("2.",10,17) ;
                     Stringer.fonts[0]=new Font("Dialog", 1, 12);
                     g.setColor(new Color(0,0,80)  ) ;
                     Stringer.drawString("Выясним, имеет ли эта игра ситуацию равновесия в смешанных ",23,17) ;
                     Stringer.drawString("стратегиях.",10,34) ;


                   }
                   if(k==3) {
                     Stringer.fonts[0]=new Font("Dialog", 2, 16);
                     g.setColor(new Color(180,0,60)  ) ;
                     Stringer.drawString("3.",10,17) ;
                     Stringer.fonts[0]=new Font("Dialog", 1, 12);
                     g.setColor(new Color(0,0,80)  ) ;
                     Stringer.drawString("Для этого запишем системы уравнений:",23,17) ;
                     Stringer.drawString("6y_{1}+2y_{3}=v_{1}",15,34) ;
                     Stringer.drawString("4y_{2}+3y_{3}=v_{1}",15,51) ;
                     Stringer.drawString("7y_{1}        = v_{1}",15,68) ;
                     Stringer.drawString("y_{1}+y_{2}+y_{3}=1",15,85) ;
                     Stringer.drawString("6x_{1}+2x_{3}=v_{2}",155,34) ;
                     Stringer.drawString("4x_{2}+3x_{3}=v_{2}",155,51) ;
                     Stringer.drawString("7x_{1}        = v_{2}",155,68) ;
                     Stringer.drawString("x_{1}+x_{2}+x_{3}=1",155,85) ;
                      Stringer.drawString("и",105,60) ;
                       Stringer.fonts[0]=new Font("Dialog", 0, 40);
                     g.drawLine(10,25,10,90) ;
                     g.drawLine(10,25,13,25) ;
                     g.drawLine(10,90,13,90) ;
                     g.drawLine(150,25,150,90) ;
                     g.drawLine(150,25,153,25) ;
                      g.drawLine(150,90,153,90) ;
                       Stringer.fonts[0]=new Font("Dialog", 1, 12);
                   }
                   if(k==4) {
                    Stringer.fonts[0]=new Font("Dialog", 2, 16);
                    g.setColor(new Color(180,0,60)  ) ;
                    Stringer.drawString("4.",10,17) ;
                    Stringer.fonts[0]=new Font("Dialog", 1, 12);
                    g.setColor(new Color(0,0,80)  ) ;
                    Stringer.drawString("Решая данные системы уравнений получаем:",23,17) ;
                    Stringer.drawString("v_{1}=56",10,33) ;
                     Stringer.drawString("\u005F\u005F",28,34) ;
                     Stringer.drawString("23",28,45) ;
                    Stringer.drawString("y=( 8 , 11 , 4   )",10,60) ;
                    Stringer.drawString("\u005F\u005F",28,61) ;
                     Stringer.drawString("23",28,72) ;
                     Stringer.drawString("\u005F\u005F",48,61) ;
                     Stringer.drawString("23",48,72) ;
                     Stringer.drawString("\u005F\u005F",68,61) ;
                     Stringer.drawString("23",68,72) ;
                    Stringer.drawString("v_{2}=56",150,34) ;
                     Stringer.drawString("\u005F\u005F",168,34) ;
                      Stringer.drawString("23",168,45) ;
                    Stringer.drawString("x=( 8 , 11 , 4   )",150,60) ;
                    Stringer.drawString("\u005F\u005F",168,61) ;
                    Stringer.drawString("23",168,72) ;
                    Stringer.drawString("\u005F\u005F",188,61) ;
                    Stringer.drawString("23",188,72) ;
                    Stringer.drawString("\u005F\u005F",208,61) ;
                    Stringer.drawString("23",208,72) ;




                  }
                  if(k==5) {
                    Stringer.fonts[0]=new Font("Dialog", 2, 16);
                    g.setColor(new Color(180,0,60)  ) ;
                    Stringer.drawString("5.",10,17) ;
                    Stringer.fonts[0]=new Font("Dialog", 1, 12);
                    g.setColor(new Color(0,0,80)  ) ;
                    Stringer.drawString("Исходя из полученных значений v_{1} и v_{2}, можем сделать вывод, что ",23,17) ;
                    Stringer.drawString("эта ситуация является и вполне смешанной ситуацией равновесия ",10,34) ;
                    Stringer.drawString(" по Нэшу.",10,51) ;
                    Stringer.drawString("",10,68) ;
                    Stringer.drawString("",10,85) ;



                  }
                  if(k==6) {
                   Stringer.fonts[0]=new Font("Dialog", 2, 16);
                   g.setColor(new Color(180,0,60)  ) ;
                   Stringer.drawString("6.",10,17) ;
                   Stringer.fonts[0]=new Font("Dialog", 1, 12);
                   g.setColor(new Color(0,0,80)  ) ;
                   Stringer.drawString("Найти решение можно и матричными средствами, используя ",23,17) ;
                    Stringer.drawString("вышеприведенные формулы. ",23,34) ;
                   /*Stringer.drawString("1 =uA^{-1}u^{T}",10,51) ;
                   g.drawLine(10,52,18,52)  ;
                    Stringer.drawString("v_{1}",10,61) ;
                   Stringer.drawString("1 =uB^{-1}u^{T}",10,82) ;
                   g.drawLine(10,83,18,83)  ;
                    Stringer.drawString("v_{2}",10,92) ;
                    Stringer.drawString("x=v_{2}uB^{-1}",150,51) ;
                    Stringer.drawString("y=v_{1}A^{-1}u^{T}",150,67) ;*/
                }
                 if(k==7) {
                   Stringer.fonts[0]=new Font("Dialog", 2, 16);
                   g.setColor(new Color(180,0,60)  ) ;
                   Stringer.drawString("7.",10,17) ;
                   Stringer.fonts[0]=new Font("Dialog", 1, 12);
                   g.setColor(new Color(0,0,80)  ) ;
                   //Stringer.drawString("Найти решение можно и матричными средствами, используя ",23,17) ;
                   Stringer.drawString("Имеем: ",23,17) ;
                   Stringer.drawString("1     (1,1,1)                    (1,1,1)^{T} , ",10,34) ;
                                   g.drawLine(10,35,18,35)  ; Stringer.drawString("=",17,37) ;
                                    Stringer.drawString("v_{1}",10,45) ;
                                    Stringer.drawString("0 4 3",80,34) ;
                                 Stringer.drawString("6 0 2   ^{-1}",80,23) ;
                                     Stringer.drawString("7 0 0",80,45) ;
                                      Stringer.fonts[0]=new Font("Dialog", 0,30);
                                      Stringer.drawString("(",67,36) ;
                                      Stringer.drawString(")",110,36) ;
                        Stringer.fonts[0]=new Font("Dialog", 1,12);
                  Stringer.drawString("откуда",200,34) ;
                 Stringer.drawString("v_{1}=56",270,34) ;
                  Stringer.drawString("\u005F\u005F",288,34) ;
                   Stringer.drawString("23",288,45) ;
                 }
                 if(k==8) {
                                    Stringer.fonts[0]=new Font("Dialog", 2, 16);
                                    g.setColor(new Color(180,0,60)  ) ;
                                    Stringer.drawString("8.",10,17) ;
                                    Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                    g.setColor(new Color(0,0,80)  ) ;
                                    //Stringer.drawString("Найти решение можно и матричными средствами, используя ",23,17) ;
                                    Stringer.drawString(" ",23,17) ;
                                    Stringer.drawString("1     (1,1,1)                    (1,1,1)^{T} , ",10,34) ;
                                    g.drawLine(10,35,18,35)  ; Stringer.drawString("=",17,37) ;
                                     Stringer.drawString("v_{2}",10,45) ;
                                     Stringer.drawString("0 4 0",80,34) ;
                                  Stringer.drawString("6 0 7   ^{-1}",80,23) ;
                                      Stringer.drawString("2 3 0",80,45) ;
                                       Stringer.fonts[0]=new Font("Dialog", 0,30);
                                       Stringer.drawString("(",67,36) ;
                                       Stringer.drawString(")",110,36) ;
                                       Stringer.fonts[0]=new Font("Dialog", 1,12);
                                   Stringer.drawString("откуда",200,34) ;
                                  Stringer.drawString("v_{2}=56",270,34) ;
                                   Stringer.drawString("\u005F\u005F",288,34) ;
                                    Stringer.drawString("23",288,45) ;
                                  }
         if(k==9) {
          Stringer.fonts[0]=new Font("Dialog", 2, 16);
           g.setColor(new Color(180,0,60)  ) ;
            Stringer.drawString("9.",10,17) ;
             Stringer.fonts[0]=new Font("Dialog", 1, 12);
             g.setColor(new Color(0,0,80)  ) ;
             // Stringer.drawString("x = v_{2} u B^{-1} ",23,70) ;
             Stringer.drawString("x     56   (1,1,1)                     , ",10,34) ;
              Stringer.drawString("=",17,37) ;
             // Stringer.drawString("v_{2}",10,45) ;
              Stringer.drawString("0 4 0",110,34) ;
               Stringer.drawString("6 0 7   ^{-1}",110,23) ;
               Stringer.drawString("2 3 0",110,45) ;
               Stringer.drawString("\u005F\u005F",30,34) ;
              Stringer.drawString("23",30,45) ;
              Stringer.fonts[0]=new Font("Dialog", 0,30);
                 Stringer.drawString("(",97,36) ;
                  Stringer.drawString(")",140,36) ;
                   Stringer.fonts[0]=new Font("Dialog", 1,12);
                   Stringer.drawString("x=( 8 , 11 , 4  )",200,34) ;
                   Stringer.drawString("\u005F\u005F",218,35) ;
                   Stringer.drawString("23",218,46) ;
                   Stringer.drawString("\u005F\u005F",238,35) ;
                   Stringer.drawString("23",238,46) ;
                   Stringer.drawString("\u005F\u005F",258,35) ;
                   Stringer.drawString("23",258,46) ;

                           }
                           if(k==10) {
                                    Stringer.fonts[0]=new Font("Dialog", 2, 16);
                                     g.setColor(new Color(180,0,60)  ) ;
                                      Stringer.drawString("10.",10,17) ;
                                       Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                       g.setColor(new Color(0,0,80)  ) ;
                                      //  Stringer.drawString("y = v_{1} A^{-1} u^{T} ",23,70) ;
                                       Stringer.drawString("y     56                      (1,1,1)^{T} , ",10,34) ;
                                        Stringer.drawString("=",17,37) ;
                                       // Stringer.drawString("v_{2}",10,45) ;
                                        Stringer.drawString("0 4 3",60,34) ;
                                         Stringer.drawString("6 0 2   ^{-1}",60,23) ;
                                         Stringer.drawString("7 0 0",60,45) ;
                                         Stringer.drawString("\u005F\u005F",30,34) ;
                                        Stringer.drawString("23",30,45) ;
                                        Stringer.fonts[0]=new Font("Dialog", 0,30);
                                           Stringer.drawString("(",47,36) ;
                                           Stringer.drawString(")",90,36) ;
                                             Stringer.fonts[0]=new Font("Dialog", 1,12);
                                             Stringer.drawString("     ( 8 , 11 , 4  )",200,34) ;
                                             Stringer.drawString("\u005F\u005F",218,35) ;
                                             Stringer.drawString("23",218,46) ;
                                             Stringer.drawString("\u005F\u005F",238,35) ;
                                             Stringer.drawString("23",238,46) ;
                                             Stringer.drawString("\u005F\u005F",258,35) ;
                                             Stringer.drawString("23",258,46) ; Stringer.drawString("y = ",190,35) ;

                                                     }
            if(k==11) {
             Stringer.fonts[0]=new Font("Dialog", 2, 16);
              g.setColor(new Color(180,0,60)  ) ;
              Stringer.drawString("11.",10,17) ;
              Stringer.fonts[0]=new Font("Dialog", 1, 12);
              g.setColor(new Color(0,0,80)  ) ;
              Stringer.drawString("Таким образом, независимо от способа решения результат ",30,17) ;
               Stringer.drawString("одинаков. Задача имеет решения в чистой и смешанной стратегиях. ",10,34) ;
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
 if(k>=11)jButton3.setEnabled(false) ;
  jPanelZad.repaint() ;
  jPanelMatr.repaint() ;
  jPanelObozn.repaint() ;
  jPanelForm.repaint() ;
  jPanelReshen.repaint() ;

  }

  void jButton1_actionPerformed(ActionEvent e) {
k--;
if(k==0) jButton1.setEnabled(false) ;
    if(k!=0) jButton3.setEnabled(true) ;
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

class AppPrim1_jButton3_actionAdapter implements java.awt.event.ActionListener {
  AppPrim1 adaptee;

  AppPrim1_jButton3_actionAdapter(AppPrim1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton3_actionPerformed(e);
  }
}

class AppPrim1_jButton1_actionAdapter implements java.awt.event.ActionListener {
  AppPrim1 adaptee;

  AppPrim1_jButton1_actionAdapter(AppPrim1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}

class AppPrim1_jButton2_actionAdapter implements java.awt.event.ActionListener {
  AppPrim1 adaptee;

  AppPrim1_jButton2_actionAdapter(AppPrim1 adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}
