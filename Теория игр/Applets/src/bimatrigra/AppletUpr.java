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

public class  AppletUpr extends JApplet {
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
  int k=0;int a;int b;
  int [][]masA={{2,0,5},{2,2,3}};
   int [][]masB={{2,2,1},{0,7,8}};
  JRadioButton jRadioButton1 = new JRadioButton();
  JRadioButton jRadioButton2 = new JRadioButton();
  JRadioButton jRadioButton3 = new JRadioButton();
  JRadioButton jRadioButton4 = new JRadioButton();
  ButtonGroup buttonGroup1 = new ButtonGroup();
  public int[] Mist_under=new int [15];
   int kolmist_under=0;
   int variant=1;
  JTextField jTextField1 = new JTextField();
  JButton jButton4 = new JButton();
  //Get a paraeter value
  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }

  //Construct the applet
  public  AppletUpr() {
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
    jButton1.setVisible(false);
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setText("<==");
    jButton1.addActionListener(new  AppletUpr_jButton1_actionAdapter(this));
    this.getContentPane().setBackground(new Color(247, 247, 255));
    this.setSize(new Dimension(453, 489));
    this.getContentPane().setLayout(null);
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setBounds(new Rectangle(129, 458, 94, 23));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setText("Обновить");
    jButton2.addActionListener(new  AppletUpr_jButton2_actionAdapter(this));
    jButton3.setBackground(new Color(220, 230, 255));
    jButton3.setBounds(new Rectangle(240, 458, 71, 23));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setText("==>");
    jButton3.addActionListener(new  AppletUpr_jButton3_actionAdapter(this));
    jLabel1.setBackground(new Color(130, 0, 80));
    jLabel1.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel1.setForeground(new Color(130, 0, 80));
    jLabel1.setPreferredSize(new Dimension(62, 21));
    jLabel1.setText("Упражнение");
    jLabel1.setBounds(new Rectangle(161, 11, 142, 25));
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
    jRadioButton1.setText("");
    jRadioButton2.setText("");
    jTextField1.setBounds(new Rectangle(315, 409, 62, 20));
    jButton4.setBounds(new Rectangle(310, 425, 96, 21));
    jButton4.setFont(new java.awt.Font("Dialog", 1, 11));
    jButton4.setForeground(new Color(0, 0, 60));
    jButton4.setText("Проверить");
    jPanelReshen.add(jRadioButton1,null) ;
     jPanelReshen.add(jRadioButton2,null) ;
      jPanelReshen.add(jRadioButton3,null) ;
       jPanelReshen.add(jRadioButton4,null) ;
       jPanelReshen.add(jTextField1) ;
        jPanelReshen.add(jButton4) ;
       jTextField1.setVisible(false) ;
     jButton4.setVisible(false) ;
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
    jRadioButton1.setBackground(Color.white);
    jRadioButton1.setForeground(new Color(0, 0, 80));
    jRadioButton1.setBounds(new Rectangle(40, 418, 65, 23));
    jRadioButton2.setSelected(false);
                        jRadioButton1.setSelected(false);
                         jRadioButton3.setSelected(false);

    jRadioButton1.addActionListener(new AppletUpr_jRadioButton1_actionAdapter(this));
    jRadioButton2.setBackground(Color.white);
    jRadioButton2.setForeground(new Color(0, 0, 80));
    jRadioButton2.setBounds(new Rectangle(141, 419, 100, 23));
    jRadioButton2.addActionListener(new AppletUpr_jRadioButton2_actionAdapter(this));
    jRadioButton3.setBackground(Color.white);
    jRadioButton3.setForeground(new Color(0, 0, 80));
    jRadioButton3.setBounds(new Rectangle(249, 420, 49, 23));
    jRadioButton3.addActionListener(new AppletUpr_jRadioButton3_actionAdapter(this));
    jRadioButton4.setBackground(Color.white);
    jRadioButton4.setEnabled(true);
    jRadioButton4.setSelected(true);
    jRadioButton4.setBounds(new Rectangle(333, 420, 64, 23));
     jRadioButton4.setVisible(false) ;
     jRadioButton3.setVisible(false) ;
      jRadioButton2.setVisible(false) ;
       jRadioButton1.setVisible(false) ;
    jRadioButton4.addActionListener(new AppletUpr_jRadioButton4_actionAdapter(this));
    this.getContentPane().add(jButton1, BorderLayout.SOUTH);
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
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jButton3, null);
   // this.getContentPane().add(jButton4, null);
  //  this.getContentPane().add(jTextField1, null);
    //this.getContentPane().add(jRadioButton1, null);
   // this.getContentPane().add(jRadioButton3, null);
   // this.getContentPane().add(jRadioButton2, null);
   // this.getContentPane().add(jRadioButton4, null);
    buttonGroup1.add(jRadioButton1);
    buttonGroup1.add(jRadioButton2);
    buttonGroup1.add(jRadioButton3);
    buttonGroup1.add(jRadioButton4);
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
          Stringer.fonts[0]=new Font("Dialog", 1, 14);//jComboBox1.gets ;
       //    if (jComboBox1.getSelectedItemo("2"))  g.drawString("Работает",15,55);
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
              if(variant==1){
         Stringer.drawString("2",70,32) ;
         Stringer.drawString("0",120,32) ;
         Stringer.drawString("5",170,32) ;
         Stringer.drawString("2",70,67) ;
         Stringer.drawString("2",120,67) ;
         Stringer.drawString("3",170,67) ;
         Stringer.drawString("2",70,102) ;
         Stringer.drawString("0",120,102) ;
         Stringer.drawString("5",170,102) ;//1 matr
         Stringer.drawString("2",70,137) ;
         Stringer.drawString("2",120,137) ;
         Stringer.drawString("1",170,137) ;
         Stringer.drawString("0",70,172) ;
         Stringer.drawString("7",120,172) ;
         Stringer.drawString("8",170,172) ;
         Stringer.drawString("1",70,207) ;
         Stringer.drawString("1",120,207) ;
         Stringer.drawString("4",170,207) ;//2 matr

        //g.setFont(new Font("Dialog",1, 14));
       if(k==1)
         {g.setColor(Color.red );
            Stringer.drawString("2",70,32) ;
           Stringer.drawString("2",70,137) ;
         }}
       if(variant==3){
        Stringer.drawString("5",70,32) ;
        Stringer.drawString("0",120,32) ;
        Stringer.drawString("2",170,32) ;
        Stringer.drawString("0",70,67) ;
        Stringer.drawString("4",120,67) ;
        Stringer.drawString("2",170,67) ;
        Stringer.drawString("6",70,102) ;
        Stringer.drawString("0",120,102) ;
        Stringer.drawString("0",170,102) ;//1 matr
        Stringer.drawString("5",70,137) ;
        Stringer.drawString("0",120,137) ;
        Stringer.drawString("6",170,137) ;
        Stringer.drawString("0",70,172) ;
        Stringer.drawString("4",120,172) ;
        Stringer.drawString("0",170,172) ;
        Stringer.drawString("2",70,207) ;
        Stringer.drawString("2",120,207) ;
        Stringer.drawString("0",170,207) ;//2 matr

       //g.setFont(new Font("Dialog",1, 14));
      if(k==1)
        {g.setColor(Color.red );
            Stringer.drawString("4",120,67) ;
          Stringer.drawString("4",120,172) ;
        }}
      if(variant==2){
            Stringer.drawString("4",70,32) ;
            Stringer.drawString("2",120,32) ;
            Stringer.drawString("3",170,32) ;
            Stringer.drawString("3",70,67) ;
            Stringer.drawString("4",120,67) ;
            Stringer.drawString("2",170,67) ;
            Stringer.drawString("2",70,102) ;
            Stringer.drawString("3",120,102) ;
            Stringer.drawString("4",170,102) ;//1 matr
            Stringer.drawString("3",70,137) ;
            Stringer.drawString("2",120,137) ;
            Stringer.drawString("4",170,137) ;
            Stringer.drawString("4",70,172) ;
            Stringer.drawString("3",120,172) ;
            Stringer.drawString("2",170,172) ;
            Stringer.drawString("2",70,207) ;
            Stringer.drawString("4",120,207) ;
            Stringer.drawString("3",170,207) ;//2 matr

           //g.setFont(new Font("Dialog",1, 14));
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
                    if((k>=3)||(k<=6)) {
                                     g.setColor(Color.red );
                                     Stringer.drawString("x=v_{2}uB^{-1}",5,30);
                                     Stringer.drawString("y=v_{1}A^{-1}u",5,48);
                                     Stringer.drawString("v_{1}=(uA^{-1}u)^{-1}",85,30);
                                     Stringer.drawString("v_{2}=(uB^{-1}u)^{-1}",85,48);

                             }
                         }
                  }
       class Panel_R extends JPanel {
                     public void paintComponent(Graphics g){
                      super.paintComponent(g);
                     Stringer.setGraphics(g) ;
                     g.setColor(Color.white);
                     Stringer.fonts[0]=new Font("Dialog", 1, 12);
                      g.setColor(new Color(0,0,80)  ) ;
                     if(k==0) { Stringer.drawString("При нажатии кнопки 'Обновить' происходит смена варианта.",10,15);
                      Stringer.drawString(" ",10,10);}
 if(variant==1){
       int ii; g.setColor(Color.white );
       for (ii=0;ii<10;ii++) g.drawString(""+ii,290, 400);


       kolmist_under=0;

 // {
                      Stringer.fonts[0]=new Font("Dialog", 1, 12);
                      g.setColor(new Color(0,0,80)  ) ;
                      //Stringer.drawString("",10,10);
                      // g.setColor( Color.black ) ;
                     // Stringer.drawString("Решим  уравение  y' = 3x^{2} ",8,15) ;
                   if(k==1) {jButton3.setEnabled(false) ;
                       Stringer.fonts[0]=new Font("Dialog", 2, 16);
                       g.setColor(new Color(180,0,60)  ) ;
                       Stringer.drawString("1.",10,17) ;
                       Stringer.fonts[0]=new Font("Dialog", 1, 12);
                        g.setColor(new Color(0,0,80)  ) ;
                        Stringer.drawString("Для данной игры пара (1,1) по определению является ситуацией",23,17) ;
                        Stringer.drawString("по Нэшу в чистых стратегиях. Верно ли это?",10,34) ;
                        jRadioButton1.setText("верно") ;
                        jRadioButton1.setLocation(70,60) ;
                        jRadioButton2.setLocation(170,60) ;
                        jRadioButton1.setVisible(true) ;
                        jRadioButton2.setText("не верно") ;
                        jRadioButton2.setVisible(true) ;
                    if (jRadioButton1.isSelected()) {
                          jRadioButton2.setEnabled(false)  ;
                           g.setColor(Color.blue  ) ;
                           jRadioButton2.setSelected(false);
                           jRadioButton3.setSelected(false);
                           jRadioButton4.setSelected(true);
                          // jRadioButton4.setEnabled(false);
                          Stringer.drawString("Правильно",250,75) ;
                          jButton3.setEnabled(true) ;   }

                    if (jRadioButton2.isSelected()) {
                       g.setColor(Color.red  ) ;
                       Mist_under[1]=1;
                       Stringer.drawString("Неправильно",250,75) ;  }
               }

                   if(k==2) { jRadioButton1.setVisible(false) ;
                     jRadioButton2.setVisible(false) ;jRadioButton3.setVisible(false) ;
                     Stringer.fonts[0]=new Font("Dialog", 2, 16);
                     g.setColor(new Color(180,0,60)  ) ;
                     Stringer.drawString("2.",10,17) ;
                     Stringer.fonts[0]=new Font("Dialog", 1, 12);
                     g.setColor(new Color(0,0,80)  ) ;
                     Stringer.drawString("Выясним, имеет ли эта игра ситуацию равновесия в смешанных ",23,17) ;
                     Stringer.drawString("стратегиях.",10,34) ;


                   }



                  if(k==3) {
                    jRadioButton2.setSelected(false);
                    jRadioButton1.setSelected(false);
                     jRadioButton3.setSelected(false);
                     jRadioButton4.setSelected(true);
                    jRadioButton1.setVisible(false) ;
                     jRadioButton2.setVisible(false) ;jRadioButton3.setVisible(false) ;
                   Stringer.fonts[0]=new Font("Dialog", 2, 16);
                   g.setColor(new Color(180,0,60)  ) ;
                   Stringer.drawString("3.",10,17) ;
                   Stringer.fonts[0]=new Font("Dialog", 1, 12);
                   g.setColor(new Color(0,0,80)  ) ;
                   Stringer.drawString("Будем искать решение  матричными средствами, используя ",23,17) ;
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
                 if(k==4) {
                   //jRadioButton2.setSelected(false);
                    //jRadioButton1.setSelected(false);
                     //jRadioButton3.setSelected(false);
                       jButton3.setEnabled(false) ;
                   Stringer.fonts[0]=new Font("Dialog", 2, 16);
                   g.setColor(new Color(180,0,60)  ) ;
                   Stringer.drawString("4.",10,17) ;
                   Stringer.fonts[0]=new Font("Dialog", 1, 12);
                   g.setColor(new Color(0,0,80)  ) ;
                   //Stringer.drawString("Найти решение можно и матричными средствами, используя ",23,17) ;
                   Stringer.drawString("Имеем: ",23,17) ;
                   Stringer.drawString("1     (1,1,1)                    (1,1,1)^{T} ; ",10,34) ;
                                   g.drawLine(10,35,18,35)  ; Stringer.drawString("=",17,37) ;
                                    Stringer.drawString("v_{1}",10,45) ;
                                    Stringer.drawString("2 2 3",80,34) ;
                                 Stringer.drawString("2 0 5   ^{-1}",80,23) ;
                                     Stringer.drawString("2 0 5",80,45) ;
                                      Stringer.fonts[0]=new Font("Dialog", 0,30);
                                      Stringer.drawString("(",67,36) ;
                                      Stringer.drawString(")",110,36) ;
                        Stringer.fonts[0]=new Font("Dialog", 1,12);
                       /* jTextField1.setVisible(true) ;
                        jButton4.setVisible(true) ;
                        jButton4.setLocation(270,60) ;
                        jButton4.setBackground(new Color(220,230,255)) ;
                       jTextField1.setBackground(new Color(247,247,255)) ;
                        jTextField1.setLocation(285,23) ;
                        jTextField1.setSize(30,20);*/
                  Stringer.drawString("если",190,34) ;
                // Stringer.drawString("v_{1}=  ",270,34) ;
                  Stringer.drawString("1",220,34) ;
                  Stringer.drawString("\u005F\u005F",220,35) ;
                   Stringer.drawString("v_{1}",220,46) ;
                    Stringer.drawString("= 0.5 ,",240,35) ;
                     Stringer.drawString("тогда  v_{1}=...",280,34) ;
                    jRadioButton1.setEnabled(true)  ;
                    jRadioButton2.setEnabled(true)  ;
                    jRadioButton3.setEnabled(true)  ;
                    jRadioButton1.setText("1") ;jRadioButton3.setText("0.5") ;
                         jRadioButton1.setLocation(70,60) ;
                         jRadioButton3.setLocation(270,60) ;
                         jRadioButton2.setLocation(170,60) ;
                         jRadioButton1.setVisible(true) ;
                         jRadioButton3.setVisible(true) ;
                         jRadioButton2.setText("2") ;
                         jRadioButton2.setVisible(true) ;
                     if (jRadioButton2.isSelected()) {
                           jRadioButton1.setEnabled(false)  ;
                           jRadioButton3.setEnabled(false)  ;
                           jRadioButton2.setSelected(false);
                    jRadioButton1.setSelected(false);
                     jRadioButton3.setSelected(false);
                     jRadioButton4.setSelected(true);

                          // сjRadioButton2.setSelected(false);
                            g.setColor(new Color(255,255,255)  ) ;
                            g.fillRect(280,20,200,50) ;
                            g.setColor(Color.blue  ) ;
                           Stringer.drawString("Правильно",250,60) ;

                             Stringer.drawString("              v_{1}= 2",280,33) ;
                           jButton3.setEnabled(true) ;   }

                     if ((jRadioButton1.isSelected())||(jRadioButton3.isSelected())) {
                        g.setColor(Color.red  ) ;
                        Mist_under[2]=1;
                        Stringer.drawString("Неправильно",250,60) ;  }

                 }
                 if(k==5) { jButton3.setEnabled(false) ;
                                    Stringer.fonts[0]=new Font("Dialog", 2, 16);
                                    g.setColor(new Color(180,0,60)  ) ;
                                    Stringer.drawString("5.",10,17) ;
                                    Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                    g.setColor(new Color(0,0,80)  ) ;
                                    Stringer.drawString("Аналогично находим и v_{2}.",23,17) ;
                                    Stringer.drawString(" ",23,17) ;
                                    Stringer.drawString("1     (1,1,1)                    (1,1,1)^{T} , ",10,51) ;
                                    g.drawLine(10,53,18,53)  ; Stringer.drawString("=",17,55) ;
                                     Stringer.drawString("v_{2}",10,63) ;
                                     Stringer.drawString("0 7 8",80,51) ;
                                    Stringer.drawString("2 2 1   ^{-1}",80,40) ;
                                      Stringer.drawString("1 1 4",80,60) ;
                                      Stringer.fonts[0]=new Font("Dialog", 0,30);
                                       Stringer.drawString("(",67,51) ;
                                       Stringer.drawString(")",110,51) ;
                                       Stringer.fonts[0]=new Font("Dialog", 1,12);
                                       Stringer.drawString("если",190,51) ;
                       // Stringer.drawString("v_{1}=  ",270,34) ;
                         Stringer.drawString("1",220,51) ;
                         Stringer.drawString("\u005F\u005F",220,52) ;
                          Stringer.drawString("v_{2}",220,63) ;
                           Stringer.drawString("= 0.5 ,",240,52) ;
                            Stringer.drawString("тогда  v_{2}=...",280,51) ;
                           jRadioButton1.setEnabled(true)  ;
                           jRadioButton2.setEnabled(true)  ;
                           jRadioButton3.setEnabled(true)  ;
                           jRadioButton1.setText("2") ;jRadioButton3.setText("0.5") ;
                                jRadioButton1.setLocation(70,60) ;
                                jRadioButton3.setLocation(270,60) ;
                                jRadioButton2.setLocation(170,60) ;
                                jRadioButton1.setVisible(true) ;
                                jRadioButton3.setVisible(true) ;
                                jRadioButton2.setText("1") ;
                                jRadioButton2.setVisible(true) ;
                            if (jRadioButton1.isSelected()) {
                                  jRadioButton1.setEnabled(false)  ;
                                  jRadioButton3.setEnabled(false)  ;
                                  jRadioButton2.setSelected(false);
                    jRadioButton1.setSelected(false);
                     jRadioButton3.setSelected(false);
                     jRadioButton4.setSelected(true);

                                 // сjRadioButton2.setSelected(false);
                                   g.setColor(new Color(255,255,255)  ) ;
                                   g.fillRect(280,40,200,50) ;
                                   g.setColor(Color.blue  ) ;
                                  Stringer.drawString("Правильно",350,70) ;

                                    Stringer.drawString("              v_{2}= 2",280,51) ;
                                  jButton3.setEnabled(true) ;   }

                            if ((jRadioButton2.isSelected())||(jRadioButton3.isSelected())) {
                               g.setColor(Color.red  ) ;
                               Mist_under[3]=1;
                               Stringer.drawString("Неправильно",340,70) ;  }

                               }
         if(k==6) {jButton3.setEnabled(false) ;
          Stringer.fonts[0]=new Font("Dialog", 2, 16);
           g.setColor(new Color(180,0,60)  ) ;
            Stringer.drawString("6.",10,17) ;
             Stringer.fonts[0]=new Font("Dialog", 1, 12);
             g.setColor(new Color(0,0,80)  ) ;
             // Stringer.drawString("x = v_{2} u B^{-1} ",23,70) ;
             Stringer.drawString("Получаем x = (1 , 0, 0). Тогда при нахождении х выигрыш какого",20,34) ;
              Stringer.drawString(" игрока мы используем ? ",17,51) ;
              jRadioButton1.setEnabled(true)  ;
                             jRadioButton2.setEnabled(true)  ;
                             //jRadioButton3.setEnabled(true)  ;
                             jRadioButton1.setText("Первого игрока (А)") ;
                                  jRadioButton1.setLocation(50,60) ;
                                  jRadioButton2.setLocation(200,60) ;
                                  jRadioButton1.setVisible(true) ;
                                 jRadioButton3.setVisible(false) ;
                                  jRadioButton2.setText("Второго игрока (В)") ;
                                  jRadioButton2.setVisible(true) ;
                              if (jRadioButton2.isSelected()) {
                                    jRadioButton1.setEnabled(false)  ;

                                    jRadioButton1.setSelected(false);
                                   jRadioButton3.setSelected(false);
                                   jRadioButton4.setSelected(true);
                                   // сjRadioButton2.setSelected(false);
                                     g.setColor(new Color(255,255,255)  ) ;
                                     g.fillRect(280,40,200,50) ;
                                     g.setColor(Color.blue  ) ;
                                    Stringer.drawString("Правильно",350,70) ;


                                    jButton3.setEnabled(true) ;   }

                              if (jRadioButton1.isSelected()) {
                                 g.setColor(Color.red  ) ;
                                 Mist_under[4]=1;
                                 Stringer.drawString("Неправильно",340,70) ;  }


                           }
                           if(k==7) {jButton3.setEnabled(false) ;
                                    Stringer.fonts[0]=new Font("Dialog", 2, 16);
                                     g.setColor(new Color(180,0,60)  ) ;
                                      Stringer.drawString("7.",10,17) ;
                                       Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                       g.setColor(new Color(0,0,80)  ) ;
                                       // Stringer.drawString("x = v_{2} u B^{-1} ",23,70) ;
                                       Stringer.drawString("Далее находим  y = (1 , 0, 0). Тогда пара ( х, y ) называется?",20,17) ;
                                      //  Stringer.drawString(" ",17,51) ;
                                        jRadioButton1.setEnabled(true)  ;
                                                       jRadioButton2.setEnabled(true)  ;
                                                       jRadioButton3.setEnabled(true)  ;
                                                       jRadioButton1.setText("Ситуация равновесия") ;
                                                            jRadioButton1.setLocation(50,40) ;
                                                            jRadioButton2.setLocation(200,40) ; jRadioButton3.setLocation(100,60) ;
                                                            jRadioButton1.setVisible(true) ;
                                                           jRadioButton3.setVisible(true) ;
                                                            jRadioButton2.setText("Вектор выигрышей") ;
                                                            jRadioButton3.setText("Оптимальная стратегия") ;
                                                            jRadioButton2.setVisible(true) ;
                                                        if (jRadioButton1.isSelected()) {
                                                              jRadioButton1.setEnabled(false)  ;
                          jRadioButton2.setEnabled(false)  ;jRadioButton3.setEnabled(false)  ;
                          jRadioButton2.setSelected(false);
jRadioButton1.setSelected(false);
jRadioButton3.setSelected(false);
jRadioButton4.setSelected(true);

                                                             // сjRadioButton2.setSelected(false);
                                                               g.setColor(new Color(255,255,255)  ) ;
                                                               g.fillRect(280,40,200,50) ;
                                                               g.setColor(Color.blue  ) ;
                                                              Stringer.drawString("Правильно",350,70) ;


                                                              jButton3.setEnabled(true) ;   }

                                                        if (jRadioButton2.isSelected()||jRadioButton3.isSelected()) {
                                                           g.setColor(Color.red  ) ;
                                                           Mist_under[5]=1;
                                                           Stringer.drawString("Неправильно",340,70) ;  }}


       if(k==8) {jButton3.setEnabled(false) ;
        Stringer.fonts[0]=new Font("Dialog", 2, 16);
         g.setColor(new Color(180,0,60)  ) ;
          Stringer.drawString("8.",10,17) ;
            Stringer.fonts[0]=new Font("Dialog", 1, 12);
              g.setColor(new Color(0,0,80)  ) ;
               // Stringer.drawString("x = v_{2} u B^{-1} ",23,70) ;
                Stringer.drawString("Cитуация равновесия является смешанной?",20,17) ;
                 //  Stringer.drawString(" ",17,51) ;
                  jRadioButton1.setEnabled(true)  ;
                  jRadioButton2.setEnabled(true)  ;
                  jRadioButton3.setEnabled(true)  ;
                  jRadioButton1.setText("Не является") ;
                  jRadioButton1.setLocation(50,40) ;
                  jRadioButton2.setLocation(200,40) ; jRadioButton3.setLocation(100,60) ;
                  jRadioButton1.setVisible(true) ;
                 jRadioButton3.setVisible(true) ;
                 jRadioButton2.setText("Является частично") ;
                 jRadioButton3.setText("Является") ;
                 jRadioButton2.setVisible(true) ;
                 if (jRadioButton3.isSelected()) {
                  jRadioButton1.setEnabled(false)  ;
                  jRadioButton2.setEnabled(false)  ;jRadioButton3.setEnabled(false)  ;
                  jRadioButton2.setSelected(false);
                   jRadioButton1.setSelected(false);
                    jRadioButton3.setSelected(false);
                    jRadioButton4.setSelected(true);

                      // сjRadioButton2.setSelected(false);
                            g.setColor(new Color(255,255,255)  ) ;
                            g.fillRect(280,40,200,50) ;
                            g.setColor(Color.blue  ) ;
                            Stringer.drawString("Правильно",350,70) ;


                            jButton3.setEnabled(true) ;   }

                             if (jRadioButton2.isSelected()||jRadioButton1.isSelected()) {
                               g.setColor(Color.red  ) ;
                                  Mist_under[6]=1;
                                    Stringer.drawString("Неправильно",340,70) ;  }


                                         }



            if(k==9) {
             Stringer.fonts[0]=new Font("Dialog", 2, 16);
              g.setColor(new Color(180,0,60)  ) ;
              Stringer.drawString("9.",10,17) ;
              Stringer.fonts[0]=new Font("Dialog", 1, 12);
              g.setColor(new Color(0,0,80)  ) ;
              Stringer.drawString("Таким образом, при полученном результате задача",30,17) ;
               Stringer.drawString(" имеет решения ... ",10,34) ;
               jRadioButton1.setEnabled(true)  ;
                  jRadioButton2.setEnabled(true)  ;
                  jRadioButton3.setEnabled(true)  ;
                  jRadioButton1.setText("Только в чистой стратегии") ;
                  jRadioButton1.setLocation(20,40) ;
                  jRadioButton2.setLocation(200,40) ; jRadioButton3.setLocation(100,60) ;
                  jRadioButton1.setVisible(true) ;
                 jRadioButton3.setVisible(true) ;
                 jRadioButton2.setText("В чистой и смешанной стратегиях") ;
                 jRadioButton3.setText("Только в  смешанной стратегии") ;
                 jRadioButton2.setVisible(true) ;
                 if (jRadioButton2.isSelected()) {
                  jRadioButton1.setEnabled(false)  ;
                  jRadioButton2.setEnabled(false)  ;jRadioButton3.setEnabled(false)  ;
                  jRadioButton2.setSelected(false);
                   jRadioButton1.setSelected(false);
                    jRadioButton3.setSelected(false);
                    jRadioButton4.setSelected(true);

                      // сjRadioButton2.setSelected(false);
                            g.setColor(new Color(255,255,255)  ) ;
                            g.fillRect(280,40,200,50) ;
                            g.setColor(Color.blue  ) ;
                            Stringer.drawString("Правильно",350,80) ;


                            jButton3.setEnabled(true) ;   }

                             if (jRadioButton1.isSelected()||jRadioButton3.isSelected()) {
                               g.setColor(Color.red  ) ;
                                  Mist_under[7]=1;
                                    Stringer.drawString("Неправильно",340,80) ;  }

            }

       for(int i=1; i<=7; i++) { kolmist_under=kolmist_under+Mist_under[i];}

                     //}
if (k==10)  jPanelReshen.setBounds(50,100,350,300) ;
  else  jPanelReshen.setBounds(new Rectangle(13, 355, 425, 96));
if (k==10) jPanelObozn.setVisible(false) ;
  else jPanelObozn.setVisible(true) ;
if (k==10) {//g.drawString(""+kolmist_under,290, 400);
  jPanelReshen.setBounds(50,100,350,300) ;
  jPanelObozn.setVisible(false) ;
g.setColor(new Color(192, 192, 192));
g.fillRect(26,106,300,115);
g.setColor(Color.white);
g.fillRect(20,100,300,115);
g.setColor(Color.blue);
g.drawRect(20,100,300,115);

g.setColor(new Color(180, 0, 60));
g.setFont(new java.awt.Font("Dialog", 3, 12));
g.drawString("Ваш результат:",155, 115);
g.setColor(new Color(0, 0, 80));
g.drawString("Количество вопросов:7",125, 130);
g.drawString("Количество правильных ответов:" + ( 7-kolmist_under),50,145);
g.drawString("Количество допущенных ошибок:" + kolmist_under,50,160);
g.drawString("Результат выполнения упражнения:" + ( 7-kolmist_under)*100/7+ " %",50, 175);
// g.drawString("%",125, 200);

}

 }
 if(variant==3){
       int ii;
       for (ii=0;ii<10;ii++) g.drawString(""+ii,290, 400);
       g.setColor(Color.white );

       kolmist_under=0;

 // {
                      Stringer.fonts[0]=new Font("Dialog", 1, 12);
                      g.setColor(new Color(0,0,80)  ) ;
                      //Stringer.drawString("",10,10);
                      // g.setColor( Color.black ) ;
                     // Stringer.drawString("Решим  уравение  y' = 3x^{2} ",8,15) ;
                   if(k==1) {jButton3.setEnabled(false) ;
                       Stringer.fonts[0]=new Font("Dialog", 2, 16);
                       g.setColor(new Color(180,0,60)  ) ;
                       Stringer.drawString("1.",10,17) ;
                       Stringer.fonts[0]=new Font("Dialog", 1, 12);
                        g.setColor(new Color(0,0,80)  ) ;
                        Stringer.drawString("Для данной игры пара (2,2) по определению является ситуацией",23,17) ;
                        Stringer.drawString("по Нэшу в чистых стратегиях. Верно ли это?",10,34) ;
                        jRadioButton1.setText("верно") ;
                        jRadioButton1.setLocation(70,60) ;
                        jRadioButton2.setLocation(170,60) ;
                        jRadioButton1.setVisible(true) ;
                        jRadioButton2.setText("не верно") ;
                        jRadioButton2.setVisible(true) ;
                    if (jRadioButton1.isSelected()) {
                          jRadioButton2.setEnabled(false)  ;
                           g.setColor(Color.blue  ) ;
                           jRadioButton2.setSelected(false);
                    jRadioButton1.setSelected(false);
                     jRadioButton3.setSelected(false);
                     jRadioButton4.setSelected(true);

                          // jRadioButton4.setEnabled(false);
                          Stringer.drawString("Правильно",250,75) ;
                          jButton3.setEnabled(true) ;   }

                    if (jRadioButton2.isSelected()) {
                       g.setColor(Color.red  ) ;
                       Mist_under[1]=1;
                       Stringer.drawString("Неправильно",250,75) ;  }
               }

                   if(k==2) { jRadioButton1.setVisible(false) ;
                     jRadioButton2.setVisible(false) ;jRadioButton3.setVisible(false) ;
                     Stringer.fonts[0]=new Font("Dialog", 2, 16);
                     g.setColor(new Color(180,0,60)  ) ;
                     Stringer.drawString("2.",10,17) ;
                     Stringer.fonts[0]=new Font("Dialog", 1, 12);
                     g.setColor(new Color(0,0,80)  ) ;
                     Stringer.drawString("Выясним, имеет ли эта игра ситуацию равновесия в смешанных ",23,17) ;
                     Stringer.drawString("стратегиях.",10,34) ;


                   }



                  if(k==3) {
                    jRadioButton1.setVisible(false) ;
                     jRadioButton2.setVisible(false) ;jRadioButton3.setVisible(false) ;
                   Stringer.fonts[0]=new Font("Dialog", 2, 16);
                   g.setColor(new Color(180,0,60)  ) ;
                   Stringer.drawString("3.",10,17) ;
                   Stringer.fonts[0]=new Font("Dialog", 1, 12);
                   g.setColor(new Color(0,0,80)  ) ;
                   Stringer.drawString("Будем искать решение  матричными средствами, используя ",23,17) ;
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
                 if(k==4) {
                   //jRadioButton2.setSelected(false);
                    //jRadioButton1.setSelected(false);
                     //jRadioButton3.setSelected(false);
                       jButton3.setEnabled(false) ;
                   Stringer.fonts[0]=new Font("Dialog", 2, 16);
                   g.setColor(new Color(180,0,60)  ) ;
                   Stringer.drawString("4.",10,17) ;
                   Stringer.fonts[0]=new Font("Dialog", 1, 12);
                   g.setColor(new Color(0,0,80)  ) ;
                   //Stringer.drawString("Найти решение можно и матричными средствами, используя ",23,17) ;
                   Stringer.drawString("Имеем: ",23,17) ;
                   Stringer.drawString("1     (1,1,1)                    (1,1,1)^{T} ; ",10,34) ;
                                   g.drawLine(10,35,18,35)  ; Stringer.drawString("=",17,37) ;
                                    Stringer.drawString("v_{1}",10,45) ;
                                    Stringer.drawString("0 4 2",80,34) ;
                                 Stringer.drawString("5 0 2   ^{-1}",80,23) ;
                                     Stringer.drawString("6 0 0",80,45) ;
                                      Stringer.fonts[0]=new Font("Dialog", 0,30);
                                      Stringer.drawString("(",67,36) ;
                                      Stringer.drawString(")",110,36) ;
                        Stringer.fonts[0]=new Font("Dialog", 1,12);
                       /* jTextField1.setVisible(true) ;
                        jButton4.setVisible(true) ;
                        jButton4.setLocation(270,60) ;
                        jButton4.setBackground(new Color(220,230,255)) ;
                       jTextField1.setBackground(new Color(247,247,255)) ;
                        jTextField1.setLocation(285,23) ;
                        jTextField1.setSize(30,20);*/
                  Stringer.drawString("если",190,34) ;
                // Stringer.drawString("v_{1}=  ",270,34) ;
                  Stringer.drawString("1",220,34) ;
                  Stringer.drawString("\u005F\u005F",220,35) ;
                   Stringer.drawString("v_{1}",220,46) ;
                    Stringer.drawString("= 0.458 ,",240,35) ;
                     Stringer.drawString("тогда  v_{1}=...",280,34) ;
                    jRadioButton1.setEnabled(true)  ;
                    jRadioButton2.setEnabled(true)  ;
                    jRadioButton3.setEnabled(true)  ;
                    jRadioButton1.setText("2.182") ;jRadioButton3.setText("2.184") ;
                         jRadioButton1.setLocation(70,60) ;
                         jRadioButton3.setLocation(270,60) ;
                         jRadioButton2.setLocation(170,60) ;
                         jRadioButton1.setVisible(true) ;
                         jRadioButton3.setVisible(true) ;
                         jRadioButton2.setText("2.183") ;
                         jRadioButton2.setVisible(true) ;
                     if (jRadioButton2.isSelected()) {
                           jRadioButton1.setEnabled(false)  ;
                           jRadioButton3.setEnabled(false)  ;
                           jRadioButton2.setSelected(false);
                    jRadioButton1.setSelected(false);
                     jRadioButton3.setSelected(false);
                     jRadioButton4.setSelected(true);

                          // сjRadioButton2.setSelected(false);
                            g.setColor(new Color(255,255,255)  ) ;
                            g.fillRect(280,20,200,50) ;
                            g.setColor(Color.blue  ) ;
                           Stringer.drawString("Правильно",250,60) ;

                             Stringer.drawString("              v_{1}= 2.183",280,33) ;
                           jButton3.setEnabled(true) ;   }

                     if ((jRadioButton1.isSelected())||(jRadioButton3.isSelected())) {
                        g.setColor(Color.red  ) ;
                        Mist_under[2]=1;
                        Stringer.drawString("Неправильно",250,60) ;  }

                 }
                 if(k==5) { jButton3.setEnabled(false) ;
                                    Stringer.fonts[0]=new Font("Dialog", 2, 16);
                                    g.setColor(new Color(180,0,60)  ) ;
                                    Stringer.drawString("5.",10,17) ;
                                    Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                    g.setColor(new Color(0,0,80)  ) ;
                                    Stringer.drawString("Аналогично находим и v_{2}.",23,17) ;
                                    Stringer.drawString(" ",23,17) ;
                                    Stringer.drawString("1     (1,1,1)                    (1,1,1)^{T} , ",10,51) ;
                                    g.drawLine(10,53,18,53)  ; Stringer.drawString("=",17,55) ;
                                     Stringer.drawString("v_{2}",10,63) ;
                                     Stringer.drawString("0 4 0",80,51) ;
                                    Stringer.drawString("5 0 6   ^{-1}",80,40) ;
                                      Stringer.drawString("2 2 0",80,60) ;
                                      Stringer.fonts[0]=new Font("Dialog", 0,30);
                                       Stringer.drawString("(",67,51) ;
                                       Stringer.drawString(")",110,51) ;
                                       Stringer.fonts[0]=new Font("Dialog", 1,12);
                                       Stringer.drawString("если",190,51) ;
                       // Stringer.drawString("v_{1}=  ",270,34) ;
                         Stringer.drawString("1",220,51) ;
                         Stringer.drawString("\u005F\u005F",220,52) ;
                          Stringer.drawString("v_{2}",220,63) ;
                           Stringer.drawString("= 0.458 ,",240,52) ;
                            Stringer.drawString("тогда  v_{2}=...",280,51) ;
                           jRadioButton1.setEnabled(true)  ;
                           jRadioButton2.setEnabled(true)  ;
                           jRadioButton3.setEnabled(true)  ;
                           jRadioButton1.setText("2.183") ;jRadioButton3.setText("2.182") ;
                                jRadioButton1.setLocation(70,60) ;
                                jRadioButton3.setLocation(270,60) ;
                                jRadioButton2.setLocation(170,60) ;
                                jRadioButton1.setVisible(true) ;
                                jRadioButton3.setVisible(true) ;
                                jRadioButton2.setText("2.181") ;
                                jRadioButton2.setVisible(true) ;
                            if (jRadioButton1.isSelected()) {
                                  jRadioButton1.setEnabled(false)  ;
                                  jRadioButton3.setEnabled(false)  ;
                                  jRadioButton2.setSelected(false);
                     jRadioButton1.setSelected(false);
                      jRadioButton3.setSelected(false);
                      jRadioButton4.setSelected(true);

                                 // сjRadioButton2.setSelected(false);
                                   g.setColor(new Color(255,255,255)  ) ;
                                   g.fillRect(280,40,200,50) ;
                                   g.setColor(Color.blue  ) ;
                                  Stringer.drawString("Правильно",350,70) ;

                                    Stringer.drawString("              v_{2}= 2",280,51) ;
                                  jButton3.setEnabled(true) ;   }

                            if ((jRadioButton2.isSelected())||(jRadioButton3.isSelected())) {
                               g.setColor(Color.red  ) ;
                               Mist_under[3]=1;
                               Stringer.drawString("Неправильно",340,70) ;  }

                               }
         if(k==6) {jButton3.setEnabled(false) ;
          Stringer.fonts[0]=new Font("Dialog", 2, 16);
           g.setColor(new Color(180,0,60)  ) ;
            Stringer.drawString("6.",10,17) ;
             Stringer.fonts[0]=new Font("Dialog", 1, 12);
             g.setColor(new Color(0,0,80)  ) ;
             // Stringer.drawString("x = v_{2} u B^{-1} ",23,70) ;
             Stringer.drawString("Получаем x = (0.364 , 0.455, 0.182). Тогда при нахождении х выигрыш какого",20,34) ;
              Stringer.drawString(" игрока мы используем ? ",17,51) ;
              jRadioButton1.setEnabled(true)  ;
                             jRadioButton2.setEnabled(true)  ;
                             //jRadioButton3.setEnabled(true)  ;
                             jRadioButton1.setText("Первого игрока (А)") ;
                                  jRadioButton1.setLocation(50,60) ;
                                  jRadioButton2.setLocation(200,60) ;
                                  jRadioButton1.setVisible(true) ;
                                 jRadioButton3.setVisible(false) ;
                                  jRadioButton2.setText("Второго игрока (В)") ;
                                  jRadioButton2.setVisible(true) ;
                              if (jRadioButton2.isSelected()) {
                                    jRadioButton1.setEnabled(false)  ;

                                    jRadioButton2.setSelected(false);
                     jRadioButton1.setSelected(false);
                      jRadioButton3.setSelected(false);
                      jRadioButton4.setSelected(true);

                                   // сjRadioButton2.setSelected(false);
                                     g.setColor(new Color(255,255,255)  ) ;
                                     g.fillRect(280,40,200,50) ;
                                     g.setColor(Color.blue  ) ;
                                    Stringer.drawString("Правильно",350,70) ;


                                    jButton3.setEnabled(true) ;   }

                              if (jRadioButton1.isSelected()) {
                                 g.setColor(Color.red  ) ;
                                 Mist_under[4]=1;
                                 Stringer.drawString("Неправильно",340,70) ;  }


                           }
                           if(k==7) {jButton3.setEnabled(false) ;
                                    Stringer.fonts[0]=new Font("Dialog", 2, 16);
                                     g.setColor(new Color(180,0,60)  ) ;
                                      Stringer.drawString("7.",10,17) ;
                                       Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                       g.setColor(new Color(0,0,80)  ) ;
                                       // Stringer.drawString("x = v_{2} u B^{-1} ",23,70) ;
                                       Stringer.drawString("Далее находим  y = (0.364 , 0.455, 0.182). Тогда пара ( х, y ) ",20,17) ;
                                        Stringer.drawString("называется? ",17,34) ;
                                        jRadioButton1.setEnabled(true)  ;
                                                       jRadioButton2.setEnabled(true)  ;
                                                       jRadioButton3.setEnabled(true)  ;
                                                       jRadioButton1.setText("Ситуация равновесия") ;
                                                            jRadioButton1.setLocation(50,40) ;
                                                            jRadioButton2.setLocation(200,40) ; jRadioButton3.setLocation(100,60) ;
                                                            jRadioButton1.setVisible(true) ;
                                                           jRadioButton3.setVisible(true) ;
                                                            jRadioButton2.setText("Вектор выигрышей") ;
                                                            jRadioButton3.setText("Оптимальная стратегия") ;
                                                            jRadioButton2.setVisible(true) ;
                                                        if (jRadioButton1.isSelected()) {
                                                              jRadioButton1.setEnabled(false)  ;
                          jRadioButton2.setEnabled(false)  ;jRadioButton3.setEnabled(false)  ;
                          jRadioButton2.setSelected(false);
                          jRadioButton1.setSelected(false);
                          jRadioButton3.setSelected(false);
                          jRadioButton4.setSelected(true);

                                                             // сjRadioButton2.setSelected(false);
                                                               g.setColor(new Color(255,255,255)  ) ;
                                                               g.fillRect(280,40,200,50) ;
                                                               g.setColor(Color.blue  ) ;
                                                              Stringer.drawString("Правильно",350,70) ;


                                                              jButton3.setEnabled(true) ;   }

                                                        if (jRadioButton2.isSelected()||jRadioButton3.isSelected()) {
                                                           g.setColor(Color.red  ) ;
                                                           Mist_under[5]=1;
                                                           Stringer.drawString("Неправильно",340,70) ;  }}


       if(k==8) {jButton3.setEnabled(false) ;
        Stringer.fonts[0]=new Font("Dialog", 2, 16);
         g.setColor(new Color(180,0,60)  ) ;
          Stringer.drawString("8.",10,17) ;
            Stringer.fonts[0]=new Font("Dialog", 1, 12);
              g.setColor(new Color(0,0,80)  ) ;
               // Stringer.drawString("x = v_{2} u B^{-1} ",23,70) ;
                Stringer.drawString("Cитуация равновесия является смешанной?",20,17) ;
                 //  Stringer.drawString(" ",17,51) ;
                  jRadioButton1.setEnabled(true)  ;
                  jRadioButton2.setEnabled(true)  ;
                  jRadioButton3.setEnabled(true)  ;
                  jRadioButton1.setText("Не является") ;
                  jRadioButton1.setLocation(50,40) ;
                  jRadioButton2.setLocation(200,40) ; jRadioButton3.setLocation(100,60) ;
                  jRadioButton1.setVisible(true) ;
                 jRadioButton3.setVisible(true) ;
                 jRadioButton2.setText("Является частично") ;
                 jRadioButton3.setText("Является") ;
                 jRadioButton2.setVisible(true) ;
                 if (jRadioButton3.isSelected()) {
                  jRadioButton1.setEnabled(false)  ;
                  jRadioButton2.setEnabled(false)  ;jRadioButton3.setEnabled(false)  ;
                  jRadioButton2.setSelected(false);
                   jRadioButton1.setSelected(false);
                    jRadioButton3.setSelected(false);
                    jRadioButton4.setSelected(true);

                      // сjRadioButton2.setSelected(false);
                            g.setColor(new Color(255,255,255)  ) ;
                            g.fillRect(280,40,200,50) ;
                            g.setColor(Color.blue  ) ;
                            Stringer.drawString("Правильно",350,70) ;


                            jButton3.setEnabled(true) ;   }

                             if (jRadioButton2.isSelected()||jRadioButton1.isSelected()) {
                               g.setColor(Color.red  ) ;
                                  Mist_under[6]=1;
                                    Stringer.drawString("Неправильно",340,70) ;  }


                                         }



            if(k==9) {
             Stringer.fonts[0]=new Font("Dialog", 2, 16);
              g.setColor(new Color(180,0,60)  ) ;
              Stringer.drawString("9.",10,17) ;
              Stringer.fonts[0]=new Font("Dialog", 1, 12);
              g.setColor(new Color(0,0,80)  ) ;
              Stringer.drawString("Таким образом, при полученном результате задача",30,17) ;
               Stringer.drawString(" имеет решения ... ",10,34) ;
               jRadioButton1.setEnabled(true)  ;
                  jRadioButton2.setEnabled(true)  ;
                  jRadioButton3.setEnabled(true)  ;
                  jRadioButton1.setText("Только в чистой стратегии") ;
                  jRadioButton1.setLocation(20,40) ;
                  jRadioButton2.setLocation(200,40) ; jRadioButton3.setLocation(100,60) ;
                  jRadioButton1.setVisible(true) ;
                 jRadioButton3.setVisible(true) ;
                 jRadioButton2.setText("В чистой и смешанной стратегиях") ;
                 jRadioButton3.setText("Только в  смешанной стратегии") ;
                 jRadioButton2.setVisible(true) ;
                 if (jRadioButton2.isSelected()) {
                  jRadioButton1.setEnabled(false)  ;
                  jRadioButton2.setEnabled(false)  ;jRadioButton3.setEnabled(false)  ;
                  jRadioButton2.setSelected(false);
                   jRadioButton1.setSelected(false);
                    jRadioButton3.setSelected(false);
                    jRadioButton4.setSelected(true);

                      // сjRadioButton2.setSelected(false);
                            g.setColor(new Color(255,255,255)  ) ;
                            g.fillRect(280,40,200,50) ;
                            g.setColor(Color.blue  ) ;
                            Stringer.drawString("Правильно",350,80) ;


                            jButton3.setEnabled(true) ;   }

                             if (jRadioButton1.isSelected()||jRadioButton3.isSelected()) {
                               g.setColor(Color.red  ) ;
                                  Mist_under[7]=1;
                                    Stringer.drawString("Неправильно",340,80) ;  }

            }

       for(int i=1; i<=7; i++) { kolmist_under=kolmist_under+Mist_under[i];}

                     //}
if (k==10)  jPanelReshen.setBounds(50,100,350,300) ;
  else  jPanelReshen.setBounds(new Rectangle(13, 355, 425, 96));
if (k==10) jPanelObozn.setVisible(false) ;
  else jPanelObozn.setVisible(true) ;
if (k==10) {//g.drawString(""+kolmist_under,290, 400);
  jPanelReshen.setBounds(50,100,350,300) ;
  jPanelObozn.setVisible(false) ;
g.setColor(new Color(192, 192, 192));
g.fillRect(26,106,300,115);
g.setColor(Color.white);
g.fillRect(20,100,300,115);
g.setColor(Color.blue);
g.drawRect(20,100,300,115);

g.setColor(new Color(180, 0, 60));
g.setFont(new java.awt.Font("Dialog", 3, 12));
g.drawString("Ваш результат:",155, 115);
g.setColor(new Color(0, 0, 80));
g.drawString("Количество вопросов:7",125, 130);
g.drawString("Количество правильных ответов:" + ( 7-kolmist_under),50,145);
g.drawString("Количество допущенных ошибок:" + kolmist_under,50,160);
g.drawString("Результат выполнения упражнения:" + ( 7-kolmist_under)*100/7+ " %",50, 175);
// g.drawString("%",125, 200);

}

 }
 if(variant==2){
        int ii;
        for (ii=0;ii<10;ii++) g.drawString(""+ii,290, 400);
        g.setColor(Color.white );

        kolmist_under=0;

  // {
                       Stringer.fonts[0]=new Font("Dialog", 1, 12);
                       g.setColor(new Color(0,0,80)  ) ;
                       //Stringer.drawString("",10,10);
                       // g.setColor( Color.black ) ;
                      // Stringer.drawString("Решим  уравение  y' = 3x^{2} ",8,15) ;
                    if(k==1) {jButton3.setEnabled(false) ;
                        Stringer.fonts[0]=new Font("Dialog", 2, 16);
                        g.setColor(new Color(180,0,60)  ) ;
                        Stringer.drawString("1.",10,17) ;
                        Stringer.fonts[0]=new Font("Dialog", 1, 12);
                         g.setColor(new Color(0,0,80)  ) ;
                         Stringer.drawString("Для данной игры cуществует по определению ситуация равновесия",23,17) ;
                         Stringer.drawString("по Нэшу в чистых стратегиях. Верно ли это?",10,34) ;
                         jRadioButton1.setText("верно") ;
                         jRadioButton1.setLocation(70,60) ;
                         jRadioButton2.setLocation(170,60) ;
                         jRadioButton1.setVisible(true) ;
                         jRadioButton2.setText("не верно") ;
                         jRadioButton2.setVisible(true) ;
                     if (jRadioButton2.isSelected()) {
                           jRadioButton1.setEnabled(false)  ;
                            g.setColor(Color.blue  ) ;
                            jRadioButton2.setSelected(false);
                     jRadioButton1.setSelected(false);
                      jRadioButton3.setSelected(false);
                      jRadioButton4.setSelected(true);

                           Stringer.drawString("Правильно",250,75) ;
                           jButton3.setEnabled(true) ;   }

                     if (jRadioButton1.isSelected()) {
                        g.setColor(Color.red  ) ;
                        Mist_under[1]=1;
                        Stringer.drawString("Неправильно",250,75) ;  }
                }

                    if(k==2) {
                      jRadioButton2.setSelected(false);
                     jRadioButton1.setSelected(false);
                      jRadioButton3.setSelected(false);
                      jRadioButton4.setSelected(true);
 jRadioButton1.setVisible(false) ;
                      jRadioButton2.setVisible(false) ;jRadioButton3.setVisible(false) ;
                      Stringer.fonts[0]=new Font("Dialog", 2, 16);
                      g.setColor(new Color(180,0,60)  ) ;
                      Stringer.drawString("2.",10,17) ;
                      Stringer.fonts[0]=new Font("Dialog", 1, 12);
                      g.setColor(new Color(0,0,80)  ) ;
                      Stringer.drawString("Выясним, имеет ли эта игра ситуацию равновесия в смешанных ",23,17) ;
                      Stringer.drawString("стратегиях.",10,34) ;


                    }



                    if(k==3) {jRadioButton2.setSelected(false);
                     jRadioButton1.setSelected(false);
                      jRadioButton3.setSelected(false);
                      jRadioButton4.setSelected(true);

                     jRadioButton1.setVisible(false) ;
                      jRadioButton2.setVisible(false) ;jRadioButton3.setVisible(false) ;
                    Stringer.fonts[0]=new Font("Dialog", 2, 16);
                    g.setColor(new Color(180,0,60)  ) ;
                    Stringer.drawString("3.",10,17) ;
                    Stringer.fonts[0]=new Font("Dialog", 1, 12);
                    g.setColor(new Color(0,0,80)  ) ;
                    Stringer.drawString("Будем искать решение  матричными средствами, используя ",23,17) ;
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
                  if(k==4) {
                    //jRadioButton2.setSelected(false);
                     //jRadioButton1.setSelected(false);
                      //jRadioButton3.setSelected(false);
                        jButton3.setEnabled(false) ;
                    Stringer.fonts[0]=new Font("Dialog", 2, 16);
                    g.setColor(new Color(180,0,60)  ) ;
                    Stringer.drawString("4.",10,17) ;
                    Stringer.fonts[0]=new Font("Dialog", 1, 12);
                    g.setColor(new Color(0,0,80)  ) ;
                    //Stringer.drawString("Найти решение можно и матричными средствами, используя ",23,17) ;
                    Stringer.drawString("Имеем: ",23,17) ;
                    Stringer.drawString("1     (1,1,1)                    (1,1,1)^{T} ; ",10,34) ;
                                    g.drawLine(10,35,18,35)  ; Stringer.drawString("=",17,37) ;
                                     Stringer.drawString("v_{1}",10,45) ;
                                     Stringer.drawString("3 4 2",80,34) ;
                                  Stringer.drawString("4 2 3   ^{-1}",80,23) ;
                                      Stringer.drawString("2 3 4",80,45) ;
                                       Stringer.fonts[0]=new Font("Dialog", 0,30);
                                       Stringer.drawString("(",67,36) ;
                                       Stringer.drawString(")",110,36) ;
                         Stringer.fonts[0]=new Font("Dialog", 1,12);
                        /* jTextField1.setVisible(true) ;
                         jButton4.setVisible(true) ;
                         jButton4.setLocation(270,60) ;
                         jButton4.setBackground(new Color(220,230,255)) ;
                        jTextField1.setBackground(new Color(247,247,255)) ;
                         jTextField1.setLocation(285,23) ;
                         jTextField1.setSize(30,20);*/
                   Stringer.drawString("если",190,34) ;
                  Stringer.drawString("(точность 3 знака после запятой)",170,17) ;
                   Stringer.drawString("1",220,34) ;
                   Stringer.drawString("\u005F\u005F",220,35) ;
                    Stringer.drawString("v_{1}",220,46) ;
                     Stringer.drawString("= 0.3331 ,",240,35) ;
                      Stringer.drawString("тогда  v_{1}=...",295,34) ;
                     jRadioButton1.setEnabled(true)  ;
                     jRadioButton2.setEnabled(true)  ;
                     jRadioButton3.setEnabled(true)  ;
                     jRadioButton1.setText("2.9") ;jRadioButton3.setText("3.5") ;
                          jRadioButton1.setLocation(70,60) ;
                          jRadioButton3.setLocation(270,60) ;
                          jRadioButton2.setLocation(170,60) ;
                          jRadioButton1.setVisible(true) ;
                          jRadioButton3.setVisible(true) ;
                          jRadioButton2.setText("3") ;
                          jRadioButton2.setVisible(true) ;
                      if (jRadioButton2.isSelected()) {
                            jRadioButton1.setEnabled(false)  ;
                            jRadioButton3.setEnabled(false)  ;
                            jRadioButton2.setSelected(false);
                    jRadioButton1.setSelected(false);
                     jRadioButton3.setSelected(false);
                     jRadioButton4.setSelected(true);

                           // сjRadioButton2.setSelected(false);
                             g.setColor(new Color(255,255,255)  ) ;
                             g.fillRect(280,20,200,50) ;
                             g.setColor(Color.blue  ) ;
                            Stringer.drawString("Правильно",250,60) ;

                              Stringer.drawString("              v_{1}= 3",280,33) ;
                            jButton3.setEnabled(true) ;   }

                      if ((jRadioButton1.isSelected())||(jRadioButton3.isSelected())) {
                         g.setColor(Color.red  ) ;
                         Mist_under[2]=1;
                         Stringer.drawString("Неправильно",250,60) ;  }

                  }
                  if(k==5) { jButton3.setEnabled(false) ;
                                     Stringer.fonts[0]=new Font("Dialog", 2, 16);
                                     g.setColor(new Color(180,0,60)  ) ;
                                     Stringer.drawString("5.",10,17) ;
                                     Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                     g.setColor(new Color(0,0,80)  ) ;
                                     Stringer.drawString("Аналогично находим и v_{2}.",23,17) ;
                                     Stringer.drawString(" ",23,17) ;
                                     Stringer.drawString("1     (1,1,1)                    (1,1,1)^{T} , ",10,51) ;
                                     g.drawLine(10,53,18,53)  ; Stringer.drawString("=",17,55) ;
                                      Stringer.drawString("v_{2}",10,63) ;
                                      Stringer.drawString("4 3 2",80,51) ;
                                     Stringer.drawString("3 2 4   ^{-1}",80,40) ;
                                       Stringer.drawString("2 4 3",80,60) ;
                                       Stringer.fonts[0]=new Font("Dialog", 0,30);
                                        Stringer.drawString("(",67,51) ;
                                        Stringer.drawString(")",110,51) ;
                                        Stringer.fonts[0]=new Font("Dialog", 1,12);
                                        Stringer.drawString("если",190,51) ;
                        // Stringer.drawString("v_{1}=  ",270,34) ;
                          Stringer.drawString("1",220,51) ;
                          Stringer.drawString("\u005F\u005F",220,52) ;
                           Stringer.drawString("v_{2}",220,63) ;
                            Stringer.drawString("= 0.3331 ,",240,52) ;
                             Stringer.drawString("тогда  v_{2}=...",295,51) ;
                            jRadioButton1.setEnabled(true)  ;
                            jRadioButton2.setEnabled(true)  ;
                            jRadioButton3.setEnabled(true)  ;
                            jRadioButton1.setText("3") ;jRadioButton3.setText("3.2") ;
                                 jRadioButton1.setLocation(70,60) ;
                                 jRadioButton3.setLocation(270,60) ;
                                 jRadioButton2.setLocation(170,60) ;
                                 jRadioButton1.setVisible(true) ;
                                 jRadioButton3.setVisible(true) ;
                                 jRadioButton2.setText("2.9") ;
                                 jRadioButton2.setVisible(true) ;
                             if (jRadioButton1.isSelected()) {
                                   jRadioButton1.setEnabled(false)  ;
                                   jRadioButton3.setEnabled(false)  ;
                                   jRadioButton2.setSelected(false);
                    jRadioButton1.setSelected(false);
                     jRadioButton3.setSelected(false);
                     jRadioButton4.setSelected(true);

                                  // сjRadioButton2.setSelected(false);
                                    g.setColor(new Color(255,255,255)  ) ;
                                    g.fillRect(280,40,200,50) ;
                                    g.setColor(Color.blue  ) ;
                                   Stringer.drawString("Правильно",350,70) ;

                                     Stringer.drawString("              v_{2}= 3",280,51) ;
                                   jButton3.setEnabled(true) ;   }

                             if ((jRadioButton2.isSelected())||(jRadioButton3.isSelected())) {
                                g.setColor(Color.red  ) ;
                                Mist_under[3]=1;
                                Stringer.drawString("Неправильно",340,70) ;  }

                                }
          if(k==6) {jButton3.setEnabled(false) ;
           Stringer.fonts[0]=new Font("Dialog", 2, 16);
            g.setColor(new Color(180,0,60)  ) ;
             Stringer.drawString("6.",10,17) ;
              Stringer.fonts[0]=new Font("Dialog", 1, 12);
              g.setColor(new Color(0,0,80)  ) ;
              // Stringer.drawString("x = v_{2} u B^{-1} ",23,70) ;
              Stringer.drawString("Получаем x = (0.333 , 0.333, 0.333). Тогда при нахождении х ",20,34) ;
               Stringer.drawString("выигрыш какого игрока мы используем ? ",17,51) ;
               jRadioButton1.setEnabled(true)  ;
                              jRadioButton2.setEnabled(true)  ;
                              //jRadioButton3.setEnabled(true)  ;
                              jRadioButton1.setText("Второго игрока (В)") ;
                                   jRadioButton1.setLocation(50,60) ;
                                   jRadioButton2.setLocation(200,60) ;
                                   jRadioButton1.setVisible(true) ;
                                  jRadioButton3.setVisible(false) ;
                                   jRadioButton2.setText("Первого игрока (А)") ;
                                   jRadioButton2.setVisible(true) ;
                               if (jRadioButton1.isSelected()) {
                                     jRadioButton1.setEnabled(false)  ;

                                     jRadioButton2.setSelected(false);
                    jRadioButton1.setSelected(false);
                     jRadioButton3.setSelected(false);
                     jRadioButton4.setSelected(true);

                                    // сjRadioButton2.setSelected(false);
                                      g.setColor(new Color(255,255,255)  ) ;
                                      g.fillRect(280,40,200,50) ;
                                      g.setColor(Color.blue  ) ;
                                     Stringer.drawString("Правильно",350,70) ;


                                     jButton3.setEnabled(true) ;   }

                               if (jRadioButton2.isSelected()) {
                                  g.setColor(Color.red  ) ;
                                  Mist_under[4]=1;
                                  Stringer.drawString("Неправильно",340,70) ;  }


                            }
                            if(k==7) {jButton3.setEnabled(false) ;
                                     Stringer.fonts[0]=new Font("Dialog", 2, 16);
                                      g.setColor(new Color(180,0,60)  ) ;
                                       Stringer.drawString("7.",10,17) ;
                                        Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                        g.setColor(new Color(0,0,80)  ) ;
                                        // Stringer.drawString("x = v_{2} u B^{-1} ",23,70) ;
                                        Stringer.drawString("Далее находим  y = (0.333 , 0.333, 0.333). Тогда пара ( х, y ) называ-",20,17) ;
                                         Stringer.drawString("ется?",17,34) ;
                                         jRadioButton1.setEnabled(true)  ;
                                                        jRadioButton2.setEnabled(true)  ;
                                                        jRadioButton3.setEnabled(true)  ;
                                                        jRadioButton1.setText("Ситуация равновесия") ;
                                                             jRadioButton1.setLocation(50,40) ;
                                                             jRadioButton2.setLocation(200,40) ; jRadioButton3.setLocation(100,60) ;
                                                             jRadioButton1.setVisible(true) ;
                                                            jRadioButton3.setVisible(true) ;
                                                             jRadioButton2.setText("Вектор выигрышей") ;
                                                             jRadioButton3.setText("Оптимальная стратегия") ;
                                                             jRadioButton2.setVisible(true) ;
                                                         if (jRadioButton1.isSelected()) {
                                                               jRadioButton1.setEnabled(false)  ;
                           jRadioButton2.setEnabled(false)  ;jRadioButton3.setEnabled(false)  ;
                           jRadioButton2.setSelected(false);
                           jRadioButton1.setSelected(false);
                           jRadioButton3.setSelected(false);
                           jRadioButton4.setSelected(true);

                                                              // сjRadioButton2.setSelected(false);
                                                                g.setColor(new Color(255,255,255)  ) ;
                                                                g.fillRect(280,40,200,50) ;
                                                                g.setColor(Color.blue  ) ;
                                                               Stringer.drawString("Правильно",350,70) ;


                                                               jButton3.setEnabled(true) ;   }

                                                         if (jRadioButton2.isSelected()||jRadioButton3.isSelected()) {
                                                            g.setColor(Color.red  ) ;
                                                            Mist_under[5]=1;
                                                            Stringer.drawString("Неправильно",340,70) ;  }}


        if(k==8) {jButton3.setEnabled(false) ;
         Stringer.fonts[0]=new Font("Dialog", 2, 16);
          g.setColor(new Color(180,0,60)  ) ;
           Stringer.drawString("8.",10,17) ;
             Stringer.fonts[0]=new Font("Dialog", 1, 12);
               g.setColor(new Color(0,0,80)  ) ;
                // Stringer.drawString("x = v_{2} u B^{-1} ",23,70) ;
                 Stringer.drawString("Cитуация равновесия является смешанной?",20,17) ;
                  //  Stringer.drawString(" ",17,51) ;
                   jRadioButton1.setEnabled(true)  ;
                   jRadioButton2.setEnabled(true)  ;
                   jRadioButton3.setEnabled(true)  ;
                   jRadioButton1.setText("Не является") ;
                   jRadioButton1.setLocation(50,40) ;
                   jRadioButton2.setLocation(200,40) ; jRadioButton3.setLocation(100,60) ;
                   jRadioButton1.setVisible(true) ;
                  jRadioButton3.setVisible(true) ;
                  jRadioButton2.setText("Является частично") ;
                  jRadioButton3.setText("Является") ;
                  jRadioButton2.setVisible(true) ;
                  if (jRadioButton3.isSelected()) {
                   jRadioButton1.setEnabled(false)  ;
                   jRadioButton2.setEnabled(false)  ;jRadioButton3.setEnabled(false)  ;
                   jRadioButton2.setSelected(false);
                   jRadioButton1.setSelected(false);
                    jRadioButton3.setSelected(false);
                    jRadioButton4.setSelected(true);

                       // сjRadioButton2.setSelected(false);
                             g.setColor(new Color(255,255,255)  ) ;
                             g.fillRect(280,40,200,50) ;
                             g.setColor(Color.blue  ) ;
                             Stringer.drawString("Правильно",350,70) ;


                             jButton3.setEnabled(true) ;   }

                              if (jRadioButton2.isSelected()||jRadioButton1.isSelected()) {
                                g.setColor(Color.red  ) ;
                                   Mist_under[6]=1;
                                     Stringer.drawString("Неправильно",340,70) ;  }


                                          }



             if(k==9) {
              Stringer.fonts[0]=new Font("Dialog", 2, 16);
               g.setColor(new Color(180,0,60)  ) ;
               Stringer.drawString("9.",10,17) ;
               Stringer.fonts[0]=new Font("Dialog", 1, 12);
               g.setColor(new Color(0,0,80)  ) ;
               Stringer.drawString("Таким образом, при полученном результате задача",30,17) ;
                Stringer.drawString(" имеет решения ... ",10,34) ;
                jRadioButton1.setEnabled(true)  ;
                   jRadioButton2.setEnabled(true)  ;
                   jRadioButton3.setEnabled(true)  ;
                   jRadioButton1.setText("Только в чистой стратегии") ;
                   jRadioButton1.setLocation(20,40) ;
                   jRadioButton2.setLocation(200,40) ; jRadioButton3.setLocation(100,60) ;
                   jRadioButton1.setVisible(true) ;
                  jRadioButton3.setVisible(true) ;
                  jRadioButton2.setText("В чистой и смешанной стратегиях") ;
                  jRadioButton3.setText("Только в  смешанной стратегии") ;
                  jRadioButton2.setVisible(true) ;
                  if (jRadioButton3.isSelected()) {
                   jRadioButton1.setEnabled(false)  ;
                   jRadioButton2.setEnabled(false)  ;jRadioButton3.setEnabled(false)  ;
                   jRadioButton2.setSelected(false);
                    jRadioButton1.setSelected(false);
                     jRadioButton3.setSelected(false);
                     jRadioButton4.setSelected(true);

                       // сjRadioButton2.setSelected(false);
                             g.setColor(new Color(255,255,255)  ) ;
                             g.fillRect(280,40,200,50) ;
                             g.setColor(Color.blue  ) ;
                             Stringer.drawString("Правильно",350,80) ;


                             jButton3.setEnabled(true) ;   }

                              if (jRadioButton2.isSelected()||jRadioButton1.isSelected()) {
                                g.setColor(Color.red  ) ;
                                   Mist_under[7]=1;
                                     Stringer.drawString("Неправильно",340,80) ;  }

             }

        for(int i=1; i<=7; i++) { kolmist_under=kolmist_under+Mist_under[i];}

                      //}
 if (k==10)  jPanelReshen.setBounds(50,100,350,300) ;
   else  jPanelReshen.setBounds(new Rectangle(13, 355, 425, 96));
 if (k==10) jPanelObozn.setVisible(false) ;
   else jPanelObozn.setVisible(true) ;
 if (k==10) {//g.drawString(""+kolmist_under,290, 400);
   jPanelReshen.setBounds(50,100,350,300) ;
   jPanelObozn.setVisible(false) ;
 g.setColor(new Color(192, 192, 192));
 g.fillRect(26,106,300,115);
 g.setColor(Color.white);
 g.fillRect(20,100,300,115);
 g.setColor(Color.blue);
 g.drawRect(20,100,300,115);

 g.setColor(new Color(180, 0, 60));
 g.setFont(new java.awt.Font("Dialog", 3, 12));
 g.drawString("Ваш результат:",155, 115);
 g.setColor(new Color(0, 0, 80));
 g.drawString("Количество вопросов:7",125, 130);
 g.drawString("Количество правильных ответов:" + ( 7-kolmist_under),50,145);
 g.drawString("Количество допущенных ошибок:" + kolmist_under,50,160);
 g.drawString("Результат выполнения упражнения:" + ( 7-kolmist_under)*100/7+ " %",50, 175);
// g.drawString("%",125, 200);

 }

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
    k++;jRadioButton2.setSelected(false);
                    jRadioButton1.setSelected(false);
                     jRadioButton3.setSelected(false);
                     jRadioButton4.setSelected(true);

jRadioButton2.setVisible(false);jRadioButton1.setVisible(false);
                        jRadioButton3.setVisible(false);
 //if(k>0)jButton1.setEnabled(//) ;
 if(k>=10)jButton3.setEnabled(false) ;
 if (k==10)  jPanelReshen.setBounds(50,100,350,300) ;
  else  jPanelReshen.setBounds(new Rectangle(13, 355, 425, 96));
if (k==10) jPanelObozn.setVisible(false) ;
  else jPanelObozn.setVisible(true) ;

  jPanelZad.repaint() ;
  jPanelMatr.repaint() ;
  jPanelObozn.repaint() ;
  jPanelForm.repaint() ;
  jPanelReshen.repaint() ;

  }

  void jButton1_actionPerformed(ActionEvent e) {
    k--;jRadioButton2.setVisible(false);jRadioButton1.setVisible(false);
                        jRadioButton3.setVisible(false);
if(k==0) jButton1.setEnabled(false) ;
    if(k!=0) jButton3.setEnabled(true) ;
    jPanelZad.repaint() ;
  jPanelMatr.repaint() ;
  jPanelObozn.repaint() ;
  jPanelForm.repaint() ;
  jPanelReshen.repaint() ;


  }

  void jButton2_actionPerformed(ActionEvent e) {
 if (variant<3)  variant++;
  else variant=1;
  if (k==10)  jPanelReshen.setBounds(50,100,350,300) ;
  else  jPanelReshen.setBounds(new Rectangle(13, 355, 425, 96));
if (k==10) jPanelObozn.setVisible(false) ;
  else jPanelObozn.setVisible(true) ;

  k=0;jButton1.setEnabled(false) ;
  jRadioButton2.setVisible(false);jRadioButton1.setVisible(false);
                        jRadioButton3.setVisible(false);
 jRadioButton2.setSelected(false);jRadioButton1.setSelected(false);
                        jRadioButton3.setSelected(false);
                          jRadioButton4.setSelected(true);
   jRadioButton2.setEnabled(true) ;
   jRadioButton1.setEnabled(true) ;
  jButton3.setEnabled(true) ;
  jPanelZad.repaint() ;
  jPanelMatr.repaint() ;
  jPanelObozn.repaint() ;
  jPanelForm.repaint() ;
  jPanelReshen.repaint() ;

  }
  void jButton4_actionPerformed(ActionEvent e) {
 a=(Integer.parseInt((jTextField1.getText())) );
 if (a==2)  b=2;
  if (a!=2)  b=1;
    jPanelZad.repaint() ;
    jPanelMatr.repaint() ;
    jPanelObozn.repaint() ;
    jPanelForm.repaint() ;
    jPanelReshen.repaint() ;

    }


  void jComboBox1_actionPerformed(ActionEvent e) {
repaint();
  }

  void jRadioButton1_actionPerformed(ActionEvent e) {
repaint();
  }

  void jRadioButton2_actionPerformed(ActionEvent e) {
repaint();
  }

  void jRadioButton3_actionPerformed(ActionEvent e) {
repaint();
  }

  void jRadioButton4_actionPerformed(ActionEvent e) {
repaint();
  }
}

class  AppletUpr_jButton3_actionAdapter implements java.awt.event.ActionListener {
  AppletUpr adaptee;

   AppletUpr_jButton3_actionAdapter( AppletUpr adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton3_actionPerformed(e);
  }
}

class  AppletUpr_jButton1_actionAdapter implements java.awt.event.ActionListener {
   AppletUpr adaptee;

   AppletUpr_jButton1_actionAdapter( AppletUpr adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}

class  AppletUpr_jButton2_actionAdapter implements java.awt.event.ActionListener {
   AppletUpr adaptee;

   AppletUpr_jButton2_actionAdapter( AppletUpr adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}

class AppletUpr_jRadioButton1_actionAdapter implements java.awt.event.ActionListener {
  AppletUpr adaptee;

  AppletUpr_jRadioButton1_actionAdapter(AppletUpr adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jRadioButton1_actionPerformed(e);
  }
}

class AppletUpr_jRadioButton2_actionAdapter implements java.awt.event.ActionListener {
  AppletUpr adaptee;

  AppletUpr_jRadioButton2_actionAdapter(AppletUpr adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jRadioButton2_actionPerformed(e);
  }
}

class AppletUpr_jRadioButton3_actionAdapter implements java.awt.event.ActionListener {
  AppletUpr adaptee;

  AppletUpr_jRadioButton3_actionAdapter(AppletUpr adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jRadioButton3_actionPerformed(e);
  }
}

class AppletUpr_jRadioButton4_actionAdapter implements java.awt.event.ActionListener {
  AppletUpr adaptee;

  AppletUpr_jRadioButton4_actionAdapter(AppletUpr adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jRadioButton4_actionPerformed(e);
  }
}
