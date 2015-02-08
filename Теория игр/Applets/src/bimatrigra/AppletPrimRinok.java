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

public class AppletPrimRinok extends JApplet {
  private boolean isStandalone = false;
  JLabel jLabel1 = new JLabel();
  Panel_G jPanel1 = new Panel_G();
  Panel_R jPanel2 = new Panel_R();
  Border border1;
  JButton jButton1 = new JButton();
  JButton jButton2 = new JButton();
  JButton jButton3 = new JButton();
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
int k=1;
  //Get a parameter value
  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }

  //Construct the applet
  public AppletPrimRinok() {
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
    jLabel1.setText("\"������ �� �����\"");
    jLabel1.setBounds(new Rectangle(130, 0, 163, 31));
    this.getContentPane().setBackground(new Color(247, 247, 255));
    this.setFont(new java.awt.Font("MS Sans Serif", 0, 11));
    this.setForeground(new Color(247, 247, 255));
    this.setSize(new Dimension(460, 472));
     this.getContentPane().setLayout(null);
    jPanel1.setBackground(Color.white);
    jPanel1.setBorder(border1);
    jPanel1.setBounds(new Rectangle(16, 41, 429, 293));
    jPanel2.setBackground(Color.white);
    jPanel2.setBorder(border1);
    jPanel2.setBounds(new Rectangle(17, 352, 428, 72));
    jButton1.setBackground(new Color(220, 230, 255));
    jButton1.setBounds(new Rectangle(95, 435, 81, 23));
    jButton1.setEnabled(false);
    jButton1.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton1.setForeground(new Color(0, 0, 60));
    jButton1.setSelected(false);
    jButton1.setText("<==");
    jButton1.addActionListener(new AppletPrimRinok_jButton1_actionAdapter(this));
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setBounds(new Rectangle(190, 435, 95, 23));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 60));
    jButton2.setSelected(false);
    jButton2.setText("��������");
    jButton2.addActionListener(new AppletPrimRinok_jButton2_actionAdapter(this));
    jButton3.setBackground(new Color(220, 230, 255));
    jButton3.setBounds(new Rectangle(298, 434, 79, 23));
    jButton3.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton3.setForeground(new Color(0, 0, 60));
    jButton3.setOpaque(true);
    jButton3.setText("==>");
    jButton3.addActionListener(new AppletPrimRinok_jButton3_actionAdapter(this));
    jLabel2.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel2.setForeground(new Color(180, 0, 60));
    jLabel2.setText("������:");
    jLabel2.setBounds(new Rectangle(19, 336, 113, 17));
    jLabel3.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel3.setForeground(new Color(180, 0, 60));
    jLabel3.setText("�����������:");
    jLabel3.setBounds(new Rectangle(17, 26, 103, 15));

    this.getContentPane().add(jLabel1, BorderLayout.NORTH);
    this.getContentPane().add(jPanel1, null);
    this.getContentPane().add(jPanel2, null);
    this.getContentPane().add(jButton1, null);
    this.getContentPane().add(jButton2, null);
    this.getContentPane().add(jButton3, null);
    this.getContentPane().add(jLabel2, null);
    this.getContentPane().add(jLabel3, null);
  }

  class Panel_G extends JPanel {
     public void paintComponent(Graphics g){
      super.paintComponent(g);
      Stringer.setGraphics(g) ;

       if (k>=1){
         g.setColor(new Color(131,69,62)  ) ;
     g.fillRect(30,70,100,40) ;
      g.fillRect(65,50,30,20) ;

      g.setColor(new Color(0,0,0)  ) ;
       g.drawRect(30,70,35,40) ;
      g.drawRect(95,70,35,40) ;
      g.drawLine(65,50,65,110) ;
      g.drawLine(95,50,95,110) ;
      g.drawLine(15,110,145,110) ;
      g.drawLine(65,50,95,50) ;
       g.fillRect(40,80,5,5) ;
        g.fillRect(105,80,5,5) ;
         g.fillRect(70,80,5,5) ;
         g.fillRect(40,95,5,5) ;
         g.fillRect(105,95,5,5) ;
         g.fillRect(70,95,5,5) ;
         g.fillRect(55,80,5,5) ;
         g.fillRect(120,80,5,5) ;
         g.fillRect(85,80,5,5) ;
         g.fillRect(55,95,5,5) ;
         g.fillRect(120,95,5,5) ;
         g.fillRect(85,95,5,5) ;
         g.fillRect(70,65,5,5) ;
         g.fillRect(85,65,5,5) ;

          Stringer.fonts[0]=new Font("Dialog", 1, 12);
          g.setColor(new Color(0,0,80) ) ;
           Stringer.drawString("����� �",50,130) ;
      }
      if(k<=14){
      if (k>=3){
        g.setColor(new Color(150,150,150)  ) ;
          g.fillRect(180,30,80,40) ;
          g.fillRect(180,120,80,40) ;
          g.setColor(new Color(0,0,0)  ) ;
          g.drawRect(180,30,80,40) ;
           g.drawRect(180,120,80,40) ;
        //  g.setColor(new Color(255,255,255)  ) ;
          g.drawRect(190,50,20,10) ;
          g.drawRect(230,50,20,10) ;
          g.drawRect(180,40,80,3) ;
          g.drawRect(190,130,20,20) ;
          g.drawRect(230,130,20,20) ;
         g.drawLine(165,70,275,70) ;
         g.drawLine(165,160,275,160) ;

               Stringer.fonts[0]=new Font("Dialog", 1, 12);
             g.setColor(new Color(0,0,80) ) ;
              Stringer.drawString("����� �1",195,85) ;
              Stringer.drawString("����� �2",195,175) ;
         }}
         if (k>=4){
           //2
         g.setColor(new Color(131,69,62)  ) ;
         g.fillRect(300,70,100,40) ;
          g.fillRect(330,50,70,20) ;
          g.fillRect(360,40,40,20) ;
           g.setColor(new Color(0,0,0)  ) ;
          g.drawLine(285,110,415,110) ;
          g.drawRect(300,70,30,40) ;
          g.drawRect(330,50,30,60) ;
           g.drawRect(360,40,40,70) ;
           g.fillRect(310,80,5,5) ;
         g.fillRect(340,80,5,5) ;
         g.fillRect(370,80,5,5) ;
         g.fillRect(310,95,5,5) ;
         g.fillRect(340,95,5,5) ;
         g.fillRect(370,95,5,5) ;
        g.fillRect(320,80,5,5) ;
         g.fillRect(385,80,5,5) ;
         g.fillRect(350,80,5,5) ;
         g.fillRect(320,95,5,5) ;
         g.fillRect(385,95,5,5) ;
         g.fillRect(350,95,5,5) ;
         g.fillRect(370,65,5,5) ;
         g.fillRect(385,65,5,5) ;
         g.fillRect(340,65,5,5) ;
         g.fillRect(350,65,5,5) ;
         g.fillRect(370,50,5,5) ;
         g.fillRect(385,50,5,5) ;

                              Stringer.fonts[0]=new Font("Dialog", 1, 12);
                              g.setColor(new Color(0,0,80) ) ;
                                Stringer.drawString("����� �",330,130) ;
                          }
                          if (k==10) {
                            Stringer.fonts[0]=new Font("Dialog", 1, 50);
                                      g.setColor(new Color(130,0,80) ) ;
                                      g.drawRect(160,20,120,170) ;
                                        Stringer.drawString("?",205,120);Stringer.fonts[0]=new Font("Dialog", 1, 12);}
             if (k>=15) { Stringer.fonts[0]=new Font("Dialog", 1, 12);
                              g.setColor(new Color(0,0,80) ) ;
                              Stringer.drawString("���������:",180,140) ;
                               Stringer.drawString("A _{1} - ����� ����� �1",20,160) ;
                               Stringer.drawString("A _{2} - ����� ����� �2",20,190) ;
                               Stringer.drawString("B _{1} - ����� ����� �1",290,160) ;
                               Stringer.drawString("B _{2} - ����� ����� �2",290,190) ;
                            }
            if(k>=16) { g.setColor(new Color(0,0,80) ) ;
                   Stringer.drawString("A = ",20,230) ;
                    Stringer.drawString("-10    2",45,220) ;
                     Stringer.drawString("  1    -1",45,240) ;
                   Stringer.fonts[0]=new Font("Dialog", 0, 25);
                       Stringer.drawString("(",38,230) ;
                         Stringer.drawString(")",85,230) ;Stringer.fonts[0]=new Font("Dialog", 1, 12);
                         Stringer.drawString("B = ",290,230) ;
                    Stringer.drawString("  5    -2",315,220) ;
                     Stringer.drawString(" -1     1",315,240) ;
                   Stringer.fonts[0]=new Font("Dialog", 0, 25);
                       Stringer.drawString("(",308,230) ;
                         Stringer.drawString(")",355,230) ;

                    }
   if (k==18) {g.setColor(new Color(180,0,60) ) ;
            g.drawRect(315,210,20,15) ;
            g.drawRect(342,225,20,15) ;
             }
  if (k==19) {g.setColor(new Color(180,0,60) ) ;
                       g.drawRect(45,210,20,15) ;
                       g.drawRect(67,225,20,15) ;
                        }
           if (k==20) {g.setColor(new Color(180,0,60) ) ;
            g.drawRect(45,225,20,15) ;
             g.drawRect(67,210,20,15) ;
             g.drawRect(340,210,20,15) ;
             g.drawRect(315,225,20,15) ;
             }

      }}

class Panel_R extends JPanel {
       public void paintComponent(Graphics g){
        super.paintComponent(g);
        Stringer.setGraphics(g) ;
if (k<=5){
        if (k>=1){
            Stringer.fonts[0]=new Font("Dialog", 2, 14);
            g.setColor(new Color(180,0,60)  ) ;
           // Stringer.drawString("1.",8,15) ;
            Stringer.fonts[0]=new Font("Dialog", 1, 12);
            g.setColor(new Color(0,0,80) ) ;
             Stringer.drawString("��������� ����� (����� �) ",20,15) ;
        }
        if (k>=2){
             Stringer.fonts[0]=new Font("Dialog", 2, 14);
             g.setColor(new Color(180,0,60)  ) ;
             //Stringer.drawString("1.",8,15) ;
             Stringer.fonts[0]=new Font("Dialog", 1, 12);
             g.setColor(new Color(0,0,80) ) ;
              Stringer.drawString("�������� ����� ������ ������",189,15) ;
         }
         if (k>=3){
                      Stringer.fonts[0]=new Font("Dialog", 2, 14);
                      g.setColor(new Color(180,0,60)  ) ;
                     // Stringer.drawString("1.",8,15) ;
                      Stringer.fonts[0]=new Font("Dialog", 1, 12);
                      g.setColor(new Color(0,0,80) ) ;
                       Stringer.drawString("��",380,15) ;
                       Stringer.drawString("����� �� ���� ������,",10,30) ;
                  }
                  if (k>=4){
                                       Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                       g.setColor(new Color(180,0,60)  ) ;
                                  //     Stringer.drawString("1.",8,15) ;
                                       Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                       g.setColor(new Color(0,0,80) ) ;
                                       // Stringer.drawString("��",380,15) ;
                                        Stringer.drawString("�������������� ������, ����� ������� ���-",150,30) ;
                                        Stringer.drawString("��� (����� �).",10,45) ;
                                   }
         if (k>=5){
         Stringer.fonts[0]=new Font("Dialog", 2, 14);
         g.setColor(new Color(180,0,60)  ) ;
        // Stringer.drawString("1.",8,15) ;
         Stringer.fonts[0]=new Font("Dialog", 1, 12);
         g.setColor(new Color(0,0,80) ) ;
        Stringer.drawString("��� ����� ����� � ������ ����������� �� ����� ��",95,45) ;
           Stringer.drawString("������ ��������������� ������������� ( ��������, ����������",10,60) ;
           }
}
         if (k<=8){
           if (k>=6){
              Stringer.fonts[0]=new Font("Dialog", 2, 14);
              g.setColor(new Color(180,0,60)  ) ;
             // Stringer.drawString("1.",8,15) ;
              Stringer.fonts[0]=new Font("Dialog", 1, 12);
              g.setColor(new Color(0,0,80) ) ;
               Stringer.drawString("��������� ��������).  ",10,15) ;
          }
          if (k>=7){
                     Stringer.fonts[0]=new Font("Dialog", 2, 14);
                     g.setColor(new Color(180,0,60)  ) ;
                    // Stringer.drawString("1.",8,15) ;
                     Stringer.fonts[0]=new Font("Dialog", 1, 12);
                     g.setColor(new Color(0,0,80) ) ;
                      Stringer.drawString("�������������� �� ������ ����� � ����� ",155,15) ;
                  Stringer.drawString("���������� ����������������� �����, ������ �� ����� �� ������",10,30) ;
                     Stringer.drawString("����������������� ���� (����������, � ������ ������ ). ",10,45) ;
                }
         if (k>=8){
                                    Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                    g.setColor(new Color(180,0,60)  ) ;
                                   // Stringer.drawString("1.",8,15) ;
                                    Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                    g.setColor(new Color(0,0,80) ) ;
                                     Stringer.drawString("�� �������� ��������������� �� �����, ����� � ����������� ���; ",10,60) ;

        }}  if(k<=10){
                               if (k>=9){
                                 g.setColor(new Color(0,0,80) ) ;
                                    Stringer.drawString("��� ������� ����������� - ������ ���������.",10,15) ;
                                   //Stringer.drawString("����������������� ���� (����������, � ������ ������ ). ",10,45) ;
                                                              }
               if (k>=10){
               g.setColor(new Color(0,0,80) ) ;
                 Stringer.drawString("����� ��������� ��������� ������ �� ���� ��� ���������� ����� ",10,30) ;
                  Stringer.drawString(" ����� ?",10,45) ;
                              }
        }

   if (k>10)  jLabel2.setText("�������:");
      else  jLabel2.setText("������:");
   if (k==11){
             Stringer.fonts[0]=new Font("Dialog", 2, 14);
             g.setColor(new Color(180,0,60)  ) ;
             Stringer.drawString("1.",8,15) ;
             Stringer.fonts[0]=new Font("Dialog", 1, 12);
             g.setColor(new Color(0,0,80) ) ;
             Stringer.drawString("����� ������� ��� ��������������, ��� ������������� ����� �",20,15) ;
             Stringer.drawString("�� ������ ����� ����� ������� ��� ���, ������ �������������",10,30) ;
             Stringer.drawString("�� ������.",10,45) ;
           }
           if (k==12){
                     Stringer.fonts[0]=new Font("Dialog", 2, 14);
                     g.setColor(new Color(180,0,60)  ) ;
                     Stringer.drawString("2.",8,15) ;
                     Stringer.fonts[0]=new Font("Dialog", 1, 12);
                     g.setColor(new Color(0,0,80) ) ;
                     Stringer.drawString("����������� ����� �������, ��� � ������ �� ������ ����� ���������",20,15) ;
                      Stringer.drawString("�������� ������� �������.",10,30) ;   }
            if (k==13){
             Stringer.fonts[0]=new Font("Dialog", 2, 14);
             g.setColor(new Color(180,0,60)  ) ;
             Stringer.drawString("3.",8,15) ;
             Stringer.fonts[0]=new Font("Dialog", 1, 12);
             g.setColor(new Color(0,0,80) ) ;
             Stringer.drawString("��������, ������ ����� � �� ������ ����� �������� �� �����",20,15) ;
              Stringer.drawString("������� �������, ��� ������ �� ������, �� ���� � ��������� ���",10,30) ;
             Stringer.drawString("������� ��������� �� ������ ����� ��������� ������� �� � �������" ,10,45) ;
            Stringer.drawString("�� ����������.",10,60) ; }
          if (k==14){
                   Stringer.fonts[0]=new Font("Dialog", 2, 14);
                   g.setColor(new Color(180,0,60)  ) ;
                   Stringer.drawString("4.",8,15) ;
                   Stringer.fonts[0]=new Font("Dialog", 1, 12);
                   g.setColor(new Color(0,0,80) ) ;
                   Stringer.drawString("��� �� �������� ������� �����, �� ��� ��������� ������ ����� ��",20,15) ;
                    Stringer.drawString("����� ������������, �� � ������ �������� ��������� �������.",10,30) ;
                   //Stringer.drawString("������� ��������� �� ������ ����� ��������� ������� �� � �������" ,10,45) ;
                   }
                   if (k==15){
                                Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                g.setColor(new Color(180,0,60)  ) ;
                                Stringer.drawString("5.",8,15) ;
                                Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                g.setColor(new Color(0,0,80) ) ;
                                Stringer.drawString("����� �������, � ���� ���������� ���������� ��������� :",20,15) ;
                                 }
                   if (k==16){
                   Stringer.fonts[0]=new Font("Dialog", 2, 14);
                   g.setColor(new Color(180,0,60)  ) ;
                   Stringer.drawString("6.",8,15) ;
                   Stringer.fonts[0]=new Font("Dialog", 1, 12);
                   g.setColor(new Color(0,0,80) ) ;
                   Stringer.drawString("��� ����, ����� ��������� ��������� ������� ������� ����� ���-",20,15) ;
                   Stringer.drawString("������ �������������� ����������, ������� �� �������� �����",10,30) ;
                   Stringer.drawString("� �������� ��������:",10,45) ;

                 }
                 if (k==17){
                                 Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                 g.setColor(new Color(180,0,60)  ) ;
                                 Stringer.drawString("7.",8,15) ;
                                 Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                 g.setColor(new Color(0,0,80) ) ;
                                 Stringer.drawString("�������� �� ���������� ������� ������. �� ���������� ����",20,15) ;
                                 Stringer.drawString("����, ���� ��� ������ ������� ���� � ��� �� �����, �� ������ ����-",10,30) ;
                                 Stringer.drawString("����� �� ����� ������� ������ �.",10,45) ;

                               }
                 if (k==18){
                 Stringer.fonts[0]=new Font("Dialog", 2, 14);
                 g.setColor(new Color(180,0,60)  ) ;
                 Stringer.drawString("8.",8,15) ;
                 Stringer.fonts[0]=new Font("Dialog", 1, 12);
                 Stringer.drawString("����������:",20,15) ;
                 g.setColor(new Color(0,0,80) ) ;
                 Stringer.drawString("��, ��� � �������� (A_{1} , B_{1}) ������� ������ � ����� 5, ",110,15) ;
                 Stringer.drawString("� � �������� (A_{2} , B_{2}) - 1, ������������, ��� ������ ����� ����� ����- ",10,30) ;
                 Stringer.drawString("��� (������ ����������, ���� �������� � �.�.), ��� ������.",10,45) ;

                  }
                  if (k==19){
                                  Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                  g.setColor(new Color(180,0,60)  ) ;
                                  Stringer.drawString("9.",8,15) ;
                                  Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                   g.setColor(new Color(0,0,80) ) ;
                                  Stringer.drawString("������� (-10) ������ � � �������� (A_{1} , B_{1}) (� ������, ��������) � ��- ",20,15) ;
                                  Stringer.drawString("����������� � ��� ��������� (-1) � �������� (A_{2} , B_{2}) �������� ����-  ",10,30) ;
                                  Stringer.drawString("�� �������������.",10,45) ;

                                   }

                   if (k==20){
                    Stringer.fonts[0]=new Font("Dialog", 2, 14);
                     g.setColor(new Color(180,0,60)  ) ;
                     Stringer.drawString("10.",8,15) ;
                     Stringer.fonts[0]=new Font("Dialog", 1, 12);
                     g.setColor(new Color(0,0,80) ) ;
                     Stringer.drawString("��������, ����� ����� ������� �������� ������ ������ (A_{1} , B_{2})",25,15) ;
                     Stringer.drawString("�  (A_{2} , B_{1}), �� ����� ����� � ���� ��������� �������, ������� ��  ",10,30) ;
                     Stringer.drawString("����� �������� �����. ������ ��� ����  ����� � ����� ���������-",10,45) ;
                     Stringer.drawString("�����.",10,60) ;
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
    if (k==1) jButton1.setEnabled(false);
         else {jButton1.setEnabled(true);
         jButton3.setEnabled(true);}
          if (k>1) k--;
       repaint();

  }

  void jButton2_actionPerformed(ActionEvent e) {
    k=1;
        jButton3.setEnabled(true) ;
        jButton1.setEnabled(false) ;
        repaint();

  }

  void jButton3_actionPerformed(ActionEvent e) {
    k++;
          if (k>1) jButton1.setEnabled(true) ;
          if (k>=20) jButton3.setEnabled(false) ;
          jPanel1.repaint();
          jPanel2.repaint();
          }
}

class AppletPrimRinok_jButton1_actionAdapter implements java.awt.event.ActionListener {
  AppletPrimRinok adaptee;

  AppletPrimRinok_jButton1_actionAdapter(AppletPrimRinok adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton1_actionPerformed(e);
  }
}

class AppletPrimRinok_jButton2_actionAdapter implements java.awt.event.ActionListener {
  AppletPrimRinok adaptee;

  AppletPrimRinok_jButton2_actionAdapter(AppletPrimRinok adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}

class AppletPrimRinok_jButton3_actionAdapter implements java.awt.event.ActionListener {
  AppletPrimRinok adaptee;

  AppletPrimRinok_jButton3_actionAdapter(AppletPrimRinok adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton3_actionPerformed(e);
  }
}
