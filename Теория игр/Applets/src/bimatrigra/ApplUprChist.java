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

public class ApplUprChist extends Applet {
  private boolean isStandalone = false;
  JLabel jLabel1 = new JLabel();
  JLabel jLabel4 = new JLabel();
  JLabel jLabel2 = new JLabel();
  JLabel jLabel6 = new JLabel();
  JLabel jLabel7 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel5 = new JLabel();
  Panel_Z jPanel1 = new Panel_Z();
  Panel_M jPanel2 = new Panel_M();
  Panel_O jPanel3 = new Panel_O();
  Panel_F jPanel4 = new Panel_F();
  Panel_R jPanel5 = new Panel_R();
  Border border1;
  JRadioButton jRadioButton1 = new JRadioButton();
  JRadioButton jRadioButton2 = new JRadioButton();
  JRadioButton jRadioButton3 = new JRadioButton();
  JButton jButton2 = new JButton();
  int shag = 0;
  public int[] Mist_under = new int[15];
  int kolmist_under = 0;
 int variant=1;
  JButton jButton1 = new JButton();
  ButtonGroup buttonGroup1 = new ButtonGroup();
  JRadioButton jRadioButton4 = new JRadioButton();
  //Get a parameter value
  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }

  //Construct the applet
  public ApplUprChist() {
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
    jLabel1.setText("jLabel1");
    jLabel4.setBounds(new Rectangle(227, 113, 150, 18));
    jLabel4.setText("Обозначения:");
    jLabel4.setForeground(new Color(180, 0, 60));
    jLabel4.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel2.setBounds(new Rectangle(13, 42, 66, 14));
    jLabel2.setText("Задача:");
    jLabel2.setForeground(new Color(180, 0, 60));
    jLabel2.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel6.setBounds(new Rectangle(12, 338, 147, 20));
    jLabel6.setText("Решение:");
    jLabel6.setPreferredSize(new Dimension(58, 16));
    jLabel6.setForeground(new Color(180, 0, 60));
    jLabel6.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel7.setBounds(new Rectangle(185, 5, 107, 24));
    jLabel7.setText("Упражнение");
    jLabel7.setPreferredSize(new Dimension(62, 21));
    jLabel7.setRequestFocusEnabled(true);
    jLabel7.setIconTextGap(4);
    jLabel7.setForeground(new Color(130, 0, 80));
    jLabel7.setFont(new java.awt.Font("Dialog", 1, 16));
    jLabel7.setBackground(new Color(130, 0, 80));
    jLabel3.setBounds(new Rectangle(12, 114, 132, 13));
    jLabel3.setText("Матрицы:");
    jLabel3.setOpaque(false);
    jLabel3.setForeground(new Color(180, 0, 60));
    jLabel3.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel5.setBounds(new Rectangle(229, 218, 156, 16));
    jLabel5.setText("Формулы:");
    jLabel5.setForeground(new Color(180, 0, 60));
    jLabel5.setFont(new java.awt.Font("Dialog", 3, 12));
    jPanel1.setBackground(Color.white);
    jPanel1.setBorder(border1);
    jPanel1.setBounds(new Rectangle(11, 58, 426, 55));
    jPanel2.setBackground(Color.white);
    jPanel2.setBorder(border1);
    jPanel2.setBounds(new Rectangle(12, 130, 200, 209));
    jPanel3.setBackground(Color.white);
    jPanel3.setBorder(border1);
    jPanel3.setBounds(new Rectangle(226, 131, 212, 89));
    jPanel4.setBackground(Color.white);
    jPanel4.setBorder(border1);
    jPanel4.setBounds(new Rectangle(228, 235, 210, 104));
    jPanel5.setBackground(Color.white);
    jPanel5.setBorder(border1);
    jPanel5.setBounds(new Rectangle(13, 355, 425, 96));
    this.setBackground(new Color(247, 247, 255));
    jButton1.setBounds(new Rectangle(263, 464, 71, 23));
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 80));
    jButton1.setText("==>");
    jButton1.addActionListener(new ApplUprChist_jButton1_actionAdapter(this));
    jRadioButton3.setBackground(Color.white);
    jRadioButton3.setVisible(false) ;
    jRadioButton2.setVisible(false) ;
    jRadioButton1.setVisible(false) ;
    jRadioButton3.setBounds(190,70,120,15) ;
    jRadioButton3.addMouseListener(new ApplUprChist_jRadioButton3_mouseAdapter(this));
    jRadioButton2.setBackground(Color.white);
    jRadioButton2.setBounds(120,70,100,15) ;
    jRadioButton2.addMouseListener(new ApplUprChist_jRadioButton2_mouseAdapter(this));
    jRadioButton2.setText("");
    jRadioButton1.setBackground(Color.white);
    jRadioButton1.setBounds(50,70,120,15) ;
    jRadioButton1.addMouseListener(new ApplUprChist_jRadioButton1_mouseAdapter(this));
    jRadioButton1.setText("");
    jRadioButton4.setText("");
     jRadioButton4.setSelected(true) ;
      jRadioButton4.setVisible(false) ;

    jRadioButton4.setBounds(new Rectangle(11, 472, 91, 23));
    jPanel5.add(jRadioButton1, null);
    jPanel5.add(jRadioButton2, null);
      jPanel5.add(jRadioButton3,null) ;

    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setBounds(new Rectangle(144, 464, 104, 23));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 80));
    jButton2.setText("Обновить");
    jButton2.addActionListener(new ApplUprChist_jButton2_actionAdapter(this));
    this.add(jLabel1, null);
    this.add(jPanel1, null);
    this.add(jPanel2, null);
    this.add(jPanel3, null);
    this.add(jPanel4, null);
    this.add(jPanel5, null);
    jPanel5.add(jRadioButton1, null);
    jPanel5.add(jRadioButton2, null);
    jPanel5.add(jRadioButton3, null);
    this.add(jLabel5, null);
    this.add(jLabel3, null);
    this.add(jLabel7, null);
    this.add(jLabel6, null);
    this.add(jLabel4, null);
    this.add(jLabel2, null);
    this.add(jButton2, null);
    this.add(jButton1, null);
    this.add(jRadioButton4, null);
    this.setLayout(null) ;
    buttonGroup1.add(jRadioButton1);
    buttonGroup1.add(jRadioButton2);
    buttonGroup1.add(jRadioButton3);
    buttonGroup1.add(jRadioButton4);
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
      }}
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
          Stringer.drawString("6",70,37) ;
           Stringer.drawString("0",120,37) ;
           Stringer.drawString("5",170,37) ;
           Stringer.drawString("2",70,87) ;
           Stringer.drawString("2",120,87) ;
           Stringer.drawString("3",170,87) ;

           Stringer.drawString("6",70,137) ;
           Stringer.drawString("2",120,137) ;
           Stringer.drawString("1",170,137) ;

           Stringer.drawString("0",70,187) ;
           Stringer.drawString("7",120,187) ;
           Stringer.drawString("8",170,187) ;
           }}
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
                                       {

                                                        Stringer.drawString("a_{i j* }\u2264 a_{i* j* }",7,34);
                                      Stringer.drawString("b_{i* j }\u2264 a_{i* j* }",7,51);

                                                }
                                    }}
   class Panel_R extends JPanel {
    public void paintComponent(Graphics g){
      super.paintComponent(g);
       Stringer.setGraphics(g) ;
        Stringer.fonts[0]=new Font("Dialog", 1, 12);
         g.setColor(new Color(0,0,80)  ) ;
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
                   if(shag==1) {jRadioButton2.setSelected(false);
                    jRadioButton1.setSelected(false);
                     jRadioButton3.setSelected(false);

                   jButton1.setEnabled(false) ;
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
jRadioButton4.setSelected(true)  ;
                        // jRadioButton4.setEnabled(false);
                        Stringer.drawString("Правильно",250,55) ;
                        jButton1.setEnabled(true) ;   }

                  if (jRadioButton2.isSelected()) {
                     g.setColor(Color.red  ) ;
                     Mist_under[1]=1;
                     Stringer.drawString("Неправильно",250,55) ;
                  jRadioButton1.setEnabled(true) ;
               jRadioButton2.setEnabled(true) ; }
             }

                 if(shag==2) {
                   jRadioButton2.setSelected(false);
                  jRadioButton1.setSelected(false);
                   jRadioButton3.setSelected(false);

                   Stringer.fonts[0]=new Font("Dialog", 2, 16);
                   g.setColor(new Color(180,0,60)  ) ;
                   Stringer.drawString("2.",10,17) ;
                   Stringer.fonts[0]=new Font("Dialog", 1, 12);
                   g.setColor(new Color(0,0,80)  ) ;
                   Stringer.drawString("Какое из этих условий не выполняется для пары ( 1, 1)? ",23,17) ;
                   Stringer.drawString("1. a_{21}<=a_{11}    2. b_{23}<=b_{11}      3. b_{13}<=b_{11}",10,34) ;
                   jRadioButton1.setText("   1") ;
                                         jRadioButton1.setLocation(70,60) ;
                                         jRadioButton2.setLocation(170,60) ;
                                         jRadioButton3.setLocation(270,60) ;
                                         jRadioButton1.setVisible(true) ;
                                         jRadioButton1.setEnabled(true) ;jRadioButton2.setEnabled(true) ;
                                         jRadioButton2.setText("  2") ;jRadioButton3.setEnabled(true) ;
                                         jRadioButton3.setText("  3 ") ;
                                         jRadioButton2.setVisible(true) ;
                                          jRadioButton3.setVisible(true) ;
                                     if (jRadioButton2.isSelected()) {
                                           jRadioButton2.setEnabled(false)  ;
                                            g.setColor(Color.blue  ) ;
                                            jRadioButton1.setSelected(false);
                                            jRadioButton1.setEnabled(false);
                                            jRadioButton3.setEnabled(false);
                                            jRadioButton3.setSelected(false);
                                      jRadioButton4.setSelected(true)  ;
                                             Stringer.drawString("Правильно",250,50) ;
                                           jButton1.setEnabled(true) ;   }

                                     if (jRadioButton1.isSelected()) {
                                        g.setColor(Color.red  ) ;
                                        Mist_under[2]=1;
                                        Stringer.drawString("Неправильно",250,50) ;
                                      jRadioButton1.setEnabled(true) ;
                                    jRadioButton2.setEnabled(true) ;jRadioButton3.setEnabled(true) ;}
         if (jRadioButton3.isSelected()) {
             g.setColor(Color.red  ) ;
                 Mist_under[2]=1;
             Stringer.drawString("Неправильно",250,50) ;
          jRadioButton1.setEnabled(true) ;jRadioButton2.setEnabled(true) ;
        jRadioButton3.setEnabled(true) ;}
                 }
                if(shag==3) {
                  jRadioButton2.setSelected(false);
                  jRadioButton1.setSelected(false);
                   jRadioButton3.setSelected(false);
                  Stringer.fonts[0]=new Font("Dialog", 2, 16);
                 g.setColor(new Color(180,0,60)  ) ;
                 Stringer.drawString("3.",10,17) ;
                 Stringer.fonts[0]=new Font("Dialog", 1, 12);
                 g.setColor(new Color(0,0,80)  ) ;
                 Stringer.drawString("В какой стратегии кроме чистой существует решение игры? ",23,17) ;

                  jRadioButton1.setText("Равновесной") ;
                  jRadioButton1.setEnabled(true) ;jRadioButton2.setEnabled(true) ;
                    jRadioButton3.setEnabled(true) ;
                                                      jRadioButton1.setLocation(50,60) ;
                                                      jRadioButton2.setLocation(170,60) ;
                                                      jRadioButton3.setLocation(290,60) ;
                                                      jRadioButton1.setVisible(true) ;
                                                      jRadioButton2.setText("Смешанной") ;
                                                      jRadioButton3.setText("Не существует") ;
                                                      jRadioButton2.setVisible(true) ;
                                                       jRadioButton3.setVisible(true) ;
                                                  if (jRadioButton2.isSelected()) {
                                                        jRadioButton2.setEnabled(false)  ;
                                                         g.setColor(Color.blue  ) ;
                                                         jRadioButton1.setSelected(false);
                                                         jRadioButton3.setSelected(false);
                                                         jRadioButton4.setSelected(true)  ;jRadioButton1.setEnabled(false);
                                                         jRadioButton3.setEnabled(false);
                                                          Stringer.drawString("Правильно",250,50) ;
                                                        jButton1.setEnabled(true) ;   }

                                                  if (jRadioButton1.isSelected()) {
                                                     g.setColor(Color.red  ) ;
                                                     Mist_under[3]=1;
                                                     Stringer.drawString("Неправильно",250,50) ;
                                                  jRadioButton1.setEnabled(true) ;jRadioButton2.setEnabled(true) ;
                                                jRadioButton3.setEnabled(true) ;}
                      if (jRadioButton3.isSelected()) {
                          g.setColor(Color.red  ) ;
                              Mist_under[3]=1;
                          Stringer.drawString("Неправильно",250,50) ;
                       jRadioButton1.setEnabled(true) ;jRadioButton2.setEnabled(true) ;
                    jRadioButton3.setEnabled(true) ; }}
   if(shag==4){
      for(int i=1; i<=3; i++) { kolmist_under=kolmist_under+Mist_under[i];}

                   //g.drawString(""+kolmist_under,290, 400);
                         jPanel5.setBounds(50,100,350,300) ;
                         jPanel4.setVisible(false) ;jPanel3.setVisible(false) ;
                         jPanel2.setVisible(false) ;jPanel1.setVisible(false) ;
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
                       g.drawString("Количество вопросов:3",125, 130);
                       g.drawString("Количество правильных ответов:" + ( 3-kolmist_under),50,145);
                       g.drawString("Количество допущенных ошибок:" + kolmist_under,50,160);
                       g.drawString("Результат выполнения упражнения:" + ( 3-kolmist_under)*100/3+ " %",50, 175);


               }
         }}}

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



  void jButton3_actionPerformed(ActionEvent e) {
   shag++;jRadioButton2.setSelected(false);
                      jRadioButton1.setSelected(false);
                       jRadioButton3.setSelected(false);
jRadioButton4.setSelected(true)  ;
  jRadioButton2.setVisible(false);jRadioButton1.setVisible(false);
                          jRadioButton3.setVisible(false);
   //if(k>0)jButton1.setEnabled(//) ;
   if(shag>=4)jButton1.setEnabled(false) ;
   if (shag==4)  jPanel5.setBounds(50,100,350,300) ;
    else  jPanel5.setBounds(new Rectangle(13, 355, 425, 96));

    jPanel1.repaint() ;
      jPanel2.repaint() ;
      jPanel3.repaint() ;
      jPanel4.repaint() ;
      jPanel5.repaint() ;


  }

  void jButton2_actionPerformed(ActionEvent e) {
    if (shag==4)  jPanel5.setBounds(50,100,350,300) ;
      else  jPanel5.setBounds(new Rectangle(13, 355, 425, 96));
    if (shag==4) jPanel3.setVisible(false) ;
 jPanel1.setVisible(true) ;
 jPanel2.setVisible(true) ;
 jPanel3.setVisible(true) ;
 jPanel4.setVisible(true) ;
 jPanel5.setVisible(true) ;

     shag=0;
      jRadioButton2.setVisible(false);jRadioButton1.setVisible(false);
                            jRadioButton3.setVisible(false);
     jRadioButton2.setSelected(false);jRadioButton1.setSelected(false);
                            jRadioButton3.setSelected(false);
                            jRadioButton4.setSelected(true)  ;

       jRadioButton2.setEnabled(true) ;
       jRadioButton1.setEnabled(true) ; jRadioButton3.setEnabled(true) ;
      jButton1.setEnabled(true) ;
      jPanel1.repaint() ;
      jPanel2.repaint() ;
      jPanel3.repaint() ;
      jPanel4.repaint() ;
      jPanel5.repaint() ;

  }

  void jButton1_actionPerformed(ActionEvent e) {
    shag++;jRadioButton2.setSelected(false);
                          jRadioButton1.setSelected(false);
                           jRadioButton3.setSelected(false);
                           jRadioButton4.setSelected(true)  ;

      jRadioButton2.setVisible(false);jRadioButton1.setVisible(false);
                              jRadioButton3.setVisible(false);
       //if(k>0)jButton1.setEnabled(//) ;
       if(shag>=4)jButton1.setEnabled(false) ;
       if (shag==4)  jPanel5.setBounds(50,100,350,300) ;
        else  jPanel5.setBounds(new Rectangle(13, 355, 425, 96));
      if (shag==4) jPanel3.setVisible(false) ;


        jPanel1.repaint() ;
          jPanel2.repaint() ;
          jPanel3.repaint() ;
          jPanel4.repaint() ;
          jPanel5.repaint() ;

  }

  void jRadioButton1_mouseClicked(MouseEvent e) {
repaint();
  }

  void jRadioButton2_mouseClicked(MouseEvent e) {
repaint();
  }

  void jRadioButton3_mouseClicked(MouseEvent e) {
repaint();
  }
}

class ApplUprChist_jButton2_actionAdapter implements java.awt.event.ActionListener {
  ApplUprChist adaptee;

  ApplUprChist_jButton2_actionAdapter(ApplUprChist adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}

class ApplUprChist_jButton1_actionAdapter implements java.awt.event.ActionListener {
  ApplUprChist adaptee;

  ApplUprChist_jButton1_actionAdapter(ApplUprChist adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}

class ApplUprChist_jRadioButton1_mouseAdapter extends java.awt.event.MouseAdapter {
  ApplUprChist adaptee;

  ApplUprChist_jRadioButton1_mouseAdapter(ApplUprChist adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.jRadioButton1_mouseClicked(e);
  }
}

class ApplUprChist_jRadioButton2_mouseAdapter extends java.awt.event.MouseAdapter {
  ApplUprChist adaptee;

  ApplUprChist_jRadioButton2_mouseAdapter(ApplUprChist adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.jRadioButton2_mouseClicked(e);
  }
}

class ApplUprChist_jRadioButton3_mouseAdapter extends java.awt.event.MouseAdapter {
  ApplUprChist adaptee;

  ApplUprChist_jRadioButton3_mouseAdapter(ApplUprChist adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.jRadioButton3_mouseClicked(e);
  }
}
