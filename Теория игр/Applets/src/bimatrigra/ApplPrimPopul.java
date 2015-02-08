package bimatrigra;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.border.*;

/**
 * <p>Пример: </p>
 * <p>Description: </p>
 * <p>Copyright: Copyright (c) 2008</p>
 * <p>Company:MarGU </p>
 * @author not attributable
 * @version 1.0
 */

public class ApplPrimPopul extends Applet {
  private boolean isStandalone = false;
  JLabel jLabel1 = new JLabel();
  JButton jButton_pred = new JButton();
  JButton jButton2 = new JButton();
  JButton jButton_next = new JButton();
  Panel_Z jPanel1 = new Panel_Z();
  Panel_M jPanel2 = new Panel_M();
  JLabel jLabel2 = new JLabel();
  JLabel jLabel3 = new JLabel();
  JLabel jLabel4 = new JLabel();
  Panel_F jPanel3 = new Panel_F();
  Panel_R jPanel4 = new Panel_R();
  JLabel jLabel5 = new JLabel();
  JSlider jSlider_a = new JSlider();
  JSlider jSlider_b = new JSlider();
  JSlider jSlider_c = new JSlider();
  JSlider jSlider4 = new JSlider();
  Border border1;Image pic;
 int a=0,b=0,c=0,d=0;int Shag=0,k=0;int  c1,c2,d1,d2;
 float perem=0,u1,u2,v1,v2,f11,f12,f21,f22;double dd=0.0;
 float masU[]=new float[2],masV[]=new float[2],masmatUA[]=new float[2],masmatVB[]=new float[2];
float matUAV[]=new float[2],matVBU[]=new float[2];
 char masvrem[]=new char[10];
 //Панели:
      Color ColorPanelFon = new Color(255,255,255);//Цвет фона
      Color ColorPanelRamka = new Color(157,187,255);//Цвет обрамления
    //Кнопки:
      Color ColorBtnBackground = new Color(220,230,255);//Цвет фона кнопки
      Color ColorBtnForeground = new Color(0,0,60);//Цвет надписи на кнопке
      Font FontBtn= new java.awt.Font("Dialog", 1, 12);//Шрифт надписи на кнопке(кроме кнопок==> и <==)
      Font FontBtnStr= new java.awt.Font("Dialog", 1, 14);//Шрифт на кнопках ==> и <==
    //Заголовок:
      Color ColorTitle = new Color(130,0,80);//Цвет
      Font FontTitle= new java.awt.Font("Dialog", 1, 16);//Шрифт
    //Надписи (напр. "Графическая иллюстрация", "Решение", "Задача" и т.д.):
      Color ColorSubTitle = new Color(180,0,60);//Цвет
      Font FontSubTitle= new java.awt.Font("Dialog", 3, 12);//Шрифт
    //Поле "Решение":
      Color ColorSolutionText = new Color(0,0,80);//Цвет текста
      Font FontSolutionText= new java.awt.Font("Dialog", 1, 14);//Шрифт текста
      Font FontSolutionIndex= new java.awt.Font("Dialog", 1, 11);//Шрифт индексов
      Color ColorSolutionNumber = new Color(180,0,60);//Цвет номера шага
      Font FontSolutionNumber = new java.awt.Font("Dialog", 3, 16);//Шрифт номера шага
    //Поле "Формулы", "Величины":
      Color ColorFormulaText = new Color(0,0,80);//Цвет текста
      Font FontFormulaText= new java.awt.Font("Dialog", 1, 12);//Шрифт текста
      Font FontFormulaIndex= new java.awt.Font("Dialog", 1, 11);//Шрифт индексов
    //Поле "Графическая иллюстрация":
      Color ColorGraficXY = new Color(50,50,50);//Цвет системы координат
      Font FontGraficXY= new java.awt.Font("Dialog", 1, 10);//Шрифт надписей делений на системе кординат
      Font FontGraficText= new java.awt.Font("Dialog", 1, 12);//Шрифт текста
      Font FontGraficIndex= new java.awt.Font("Dialog", 1, 11);//Шрифт индексов
      Font FontDialog_1_10= new java.awt.Font("Dialog", 1, 10);//
      Font FontDialog_1_11= new java.awt.Font("Dialog", 1, 11);//
      //шрифт подписи графиков (напр. x^2,f(x); шрифт x и шрифт 2)
    //Поле "Задача":
      Color ColorTaskText = new Color(0,0,80);//Цвет системы координат
      Font FontTaskText= new java.awt.Font("Dialog", 1 ,14);//
      Font FontTaskIndex= new java.awt.Font("Dialog", 1, 11);

  //Get a parameter value
  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }


  //Construct the applet
  public ApplPrimPopul() {
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
    jLabel1.setToolTipText("");
    jLabel1.setVerifyInputWhenFocusTarget(true);
    jLabel1.setText("Пример");
    jLabel1.setBounds(new Rectangle(199, 3, 107, 28));
    this.setBackground(new Color(247, 247, 255));
    this.setLayout(null) ;
    jButton_pred.setBackground(new Color(220, 230, 255));
    jButton_pred.setBounds(new Rectangle(114, 427, 71, 23));
    jButton_pred.setEnabled(false);
    jButton_pred.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton_pred.setForeground(new Color(0, 0, 80));
    jButton_pred.setText("<==");
    jButton_pred.addActionListener(new ApplPrimPopul_jButton_pred_actionAdapter(this));
    jButton2.setBackground(new Color(220, 230, 255));
    jButton2.setBounds(new Rectangle(193, 427, 91, 23));
    jButton2.setFont(new java.awt.Font("Dialog", 1, 12));
    jButton2.setForeground(new Color(0, 0, 80));
    jButton2.setSelected(false);
    jButton2.setText("Обновить");
    jButton2.addActionListener(new ApplPrimPopul_jButton2_actionAdapter(this));
    jButton_next.setBackground(new Color(220, 230, 255));
    jButton_next.setBounds(new Rectangle(288, 427, 71, 23));
    jButton_next.setFont(new java.awt.Font("Dialog", 1, 14));
    jButton_next.setForeground(new Color(0, 0, 80));
    jButton_next.setVerifyInputWhenFocusTarget(true);
    jButton_next.setSelected(false);
    jButton_next.setText("==>");
    jButton_next.addActionListener(new ApplPrimPopul_jButton_next_actionAdapter(this));
    jPanel1.setBackground(Color.white);
    jPanel1.setBorder(border1);
    jPanel1.setBounds(new Rectangle(19, 40, 437, 70));
    jPanel2.setBackground(Color.white);
    jPanel2.setBorder(border1);
    jSb_b.setMinimum(1);
    jSb_b.setValue(2);
    jSb_b.setMaximumSize(new Dimension(32767, 17));
    jSb_c.setMinimum(1);
    jSb_c.setValue(15);
    //jLabel6.setForeground(Color.black);
    jSb_a.setValue(5);
    jSb_d.setValue(-5);
    jLabel6.setFont(new java.awt.Font("Dialog", 1, 11));
    jLabel6.setForeground(new Color(180, 0, 60));
    jLabel6.setText("-5");
    jLabel6.setBounds(new Rectangle(292, 154, 31, 15));
    jLabel7.setFont(new java.awt.Font("Dialog", 1, 11));
    jLabel7.setForeground(new Color(180, 0, 60));
    jLabel7.setText("25");
    jLabel7.setBounds(new Rectangle(433, 154, 17, 15));
    jLabel8.setFont(new java.awt.Font("Dialog", 1, 11));
    jLabel8.setForeground(new Color(180, 0, 60));
    jLabel8.setText("1");
    jLabel8.setBounds(new Rectangle(295, 190, 21, 15));
    jLabel9.setFont(new java.awt.Font("Dialog", 1, 11));
    jLabel9.setForeground(new Color(180, 0, 60));
    jLabel9.setText("25");
    jLabel9.setBounds(new Rectangle(431, 190, 19, 15));
    jLabel10.setFont(new java.awt.Font("Dialog", 1, 11));
    jLabel10.setForeground(new Color(180, 0, 60));
    jLabel10.setText("1");
    jLabel10.setBounds(new Rectangle(295, 225, 25, 15));
    jLabel11.setFont(new java.awt.Font("Dialog", 1, 11));
    jLabel11.setForeground(new Color(180, 0, 60));
    jLabel11.setRequestFocusEnabled(true);
    jLabel11.setText("25");
    jLabel11.setBounds(new Rectangle(432, 225, 18, 15));
    jLabel12.setFont(new java.awt.Font("Dialog", 1, 11));
    jLabel12.setForeground(new Color(180, 0, 60));
    jLabel12.setText("-6");
    jLabel12.setBounds(new Rectangle(291, 260, 21, 15));
    jLabel13.setFont(new java.awt.Font("Dialog", 1, 11));
    jLabel13.setForeground(new Color(180, 0, 60));
    jLabel13.setText("25");
    jLabel13.setBounds(new Rectangle(432, 262, 15, 14));
    jPanel2.add(jSb_a); jPanel2.add(jSb_b); jPanel2.add(jSb_c); jPanel2.add(jSb_d);
    jPanel2.setBounds(new Rectangle(21, 130, 260, 140));
    jSlider_b.addMouseMotionListener(new ApplPrimPopul_jSlider_b_mouseMotionAdapter(this));
    jSlider_c.addMouseMotionListener(new ApplPrimPopul_jSlider_c_mouseMotionAdapter(this));
    jSlider4.addMouseMotionListener(new ApplPrimPopul_jSlider4_mouseMotionAdapter(this));
    jCheckBox.setBackground(new Color(247, 247, 255));
    jCheckBox.setSelected(false);
    jCheckBox.setText("");
    jCheckBox.setBounds(new Rectangle(372, 112, 53, 20));
    jCheckBox.addMouseListener(new ApplPrimPopul_jCheckBox_mouseAdapter(this));
    jSlider_b.setMajorTickSpacing(0);
    jSlider_b.setMaximum(90);
    jSlider_b.setMinimum(0);
    jSlider_b.setFont(new java.awt.Font("MS Sans Serif", 0, 11));
    jSlider_c.setExtent(0);
    jSlider_c.setMaximum(100);
    jSlider_c.setMinimum(41);
    jSlider4.setInverted(false);
    jSlider4.setMaximum(50);
    jSlider4.setMinimum(1);
    jPanel3.setBackground(Color.white);
   // jPanel3.setEnabled(false);
    jPanel3.setVisible(false) ;
    jPanel3.setBorder(border1);
    jSb_a.setMaximum(25);
    jSb_a.setMinimum(-5);/*jSb_a.setVisible(false) ;jSb_b.setVisible(false) ;
    jSb_c.setVisible(false) ;jSb_d.setVisible(false) ;*/
    jSb_a.setOrientation(JScrollBar.HORIZONTAL);
    jSb_a.setBackground(new Color(247, 247, 255));
    jSb_a.setBounds(new Rectangle(292, 135, 158, 19));
    jSb_a.addMouseMotionListener(new ApplPrimPopul_jSb_a_mouseMotionAdapter(this));
    jSb_b.setMaximum(25);
    jSb_b.setOrientation(JScrollBar.HORIZONTAL);
    jSb_b.setBackground(new Color(247, 247, 255));
    jSb_b.setBounds(new Rectangle(292, 170, 158, 19));
    jSb_b.addMouseMotionListener(new ApplPrimPopul_jSb_b_mouseMotionAdapter(this));
    jSb_c.setMaximum(25);
    jSb_c.setOrientation(JScrollBar.HORIZONTAL);
    jSb_c.setBackground(new Color(247, 247, 255));
    jSb_c.setBounds(new Rectangle(292, 205, 158, 19));
    jSb_c.addMouseMotionListener(new ApplPrimPopul_jSb_c_mouseMotionAdapter(this));
    jSb_d.setMaximum(25);
    jSb_d.setMinimum(-6);
    jSb_d.setOrientation(JScrollBar.HORIZONTAL);
    jSb_d.setBackground(new Color(247, 247, 255));
    jSb_d.setBounds(new Rectangle(292, 240, 158, 19));
    jSb_d.addMouseMotionListener(new ApplPrimPopul_jSb_d_mouseMotionAdapter(this));
    jPanel2.add(jSlider_b) ;jPanel2.add(jSlider_a) ;
    jPanel2.add(jSlider_c) ;jPanel2.add(jSlider4) ;
    jLabel2.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel2.setForeground(new Color(180, 0, 60));
    jLabel2.setPreferredSize(new Dimension(54, 19));
    jLabel2.setText("Задача:");
    jLabel2.setBounds(new Rectangle(23, 25, 106, 15));
    jLabel3.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel3.setForeground(new Color(180, 0, 60));
    jLabel3.setMaximumSize(new Dimension(61, 16));
    jLabel3.setVerifyInputWhenFocusTarget(true);
    jLabel3.setText("Формулы:");
    jLabel3.setBounds(new Rectangle(303, 109, 108, 22));
    jLabel4.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel4.setForeground(new Color(180, 0, 60));
    jLabel4.setText("Матрицы:");
    jLabel4.setBounds(new Rectangle(25, 115, 157, 15));
    jPanel3.setBounds(new Rectangle(19, 133, 437, 135));
    jPanel4.setBackground(Color.white);
    jPanel4.setBorder(border1);
    jPanel4.setBounds(new Rectangle(19, 292, 437, 111));
    jLabel5.setFont(new java.awt.Font("Dialog", 3, 12));
    jLabel5.setForeground(new Color(180, 0, 60));
    jLabel5.setIconTextGap(4);
    jLabel5.setText("Решение:");
    jLabel5.setBounds(new Rectangle(20, 276, 111, 15));
    jSlider_a.setExtent(0);
    jSlider_a.setInverted(false);
    jSlider_a.setMaximum(50);
    jSlider_a.setMinimum(-5);
    jSlider_a.setPaintTrack(true);
    jSlider_a.setBackground(new Color(247, 247, 255));
    jSlider_a.setEnabled(true);
    jSlider_a.setDebugGraphicsOptions(0);
    jSlider_a.setDoubleBuffered(false);
    jSlider_a.setToolTipText("");
    jSlider_a.setVisible(false);
    jSlider_a.setBounds(new Rectangle(301, 158, 135, 24));
    jSlider_a.addMouseMotionListener(new ApplPrimPopul_jSlider_a_mouseMotionAdapter(this));
    jSlider_b.setBackground(new Color(247, 247, 255));jSlider_b.setVisible(false) ;
    jSlider_b.setBounds(new Rectangle(301, 190, 135, 24));
    jSlider_c.setBackground(new Color(247, 247, 255));jSlider_c.setVisible(false) ;
    jSlider_c.setBounds(new Rectangle(301, 216, 137, 24));
    jSlider4.setBackground(new Color(247, 247, 255));jSlider4.setVisible(false) ;
    jSlider4.setBounds(new Rectangle(301, 246, 142, 24));
    this.add(jLabel1, null);
    this.add(jButton_pred, null);
    this.add(jButton_next, null);
    this.add(jButton2, null);
    this.add(jPanel1, null);
    this.add(jPanel2, null);
    this.add(jLabel2, null);
    this.add(jLabel4, null);
    this.add(jPanel4, null);
    this.add(jLabel5, null);
    this.add(jSlider_a, null);
    this.add(jSlider4, null);
    this.add(jSlider_b, null);
    this.add(jSlider_c, null);
    this.add(jCheckBox, null);
    this.add(jLabel3, null);
    this.add(jSb_a, null);
    this.add(jSb_d, null);
    this.add(jSb_c, null);
    this.add(jSb_b, null);
    this.add(jLabel6, null);
    this.add(jLabel7, null);
    this.add(jLabel8, null);
    this.add(jLabel9, null);
    this.add(jLabel10, null);
    this.add(jLabel11, null);
    this.add(jLabel12, null);
    this.add(jLabel13, null);
    this.add(jPanel3, null);
  }
  class Panel_Z extends JPanel {
       public void paintComponent(Graphics g){
        super.paintComponent(g);
         Stringer.fonts[0]=new Font("Dialog", 1, 12);
          Stringer.setGraphics(g) ;

        g.setColor(new Color(0,0,80)  ) ;
        Stringer.drawString(" Найти ситуацию равновесия по Нэшу в борьбе полов,  происходящей ",8,15);

        Stringer.drawString("в  популяции животных, представленной женскими и мужскими особями.",8,30) ;

     Stringer.drawString("Матрицы A и B -  платежные матрицы для мужских и женских особей,",8,45) ;
   Stringer.drawString("соответственно.",8,60) ;
      }
        }
class Panel_F extends JPanel {
               public void paintComponent(Graphics g){
                super.paintComponent(g);
              Stringer.fonts[0]=new Font("Dialog", 3, 14);
              Stringer.setGraphics(g) ;
              g.setColor(new Color(0,0,60) ) ;
 Stringer.drawString(" S_{ 1} = { u = ( u_{ 1} , ... , u_{ m} |0 \u2264 u_{ i} \u2264 1 , i = 1 , ... , m , \u2211 u_{ i} = 1 }   ",8,20);
 Stringer.drawString(" S_{ 2} = { v = ( v_{ 1} , ... , v_{ n} |0 \u2264 u_{ j} \u2264 1 , j = 1 , ... , n , \u2211 v_{ j} = 1 }   ",8,45);

  Stringer.fonts[0]=new Font("Dialog", 3, 10);
 Stringer.drawString("i=1",210,28) ; Stringer.drawString("m",213,10) ;
 Stringer.drawString("j=1",210,28+25) ; Stringer.drawString("n",213,10+25) ;
  Stringer.fonts[0]=new Font("Dialog", 3, 14);
 Stringer.drawString(" u A v_{ T} = \u2211 \u2211 a_{ i j} u_{ i} v_{ j} ",8,70) ;
 Stringer.drawString(" v B u_{ T} = \u2211 \u2211 b_{ j i} u_{ i} v_{ j} ",8,95) ;
   Stringer.fonts[0]=new Font("Dialog", 3, 10);
Stringer.drawString("i=1 j=1",70,78) ; Stringer.drawString("m  n",75,60) ;
Stringer.drawString("j=1 i=1",70,78+25) ; Stringer.drawString("n  m",75,85) ;
   g.setColor(Color.black ) ; Stringer.fonts[0]=new Font("Dialog", 3, 14);
  Stringer.drawString("наборы стратегий",285,34) ;
  g.drawLine(272,25,280,30) ; g.drawLine(272,37,280,32) ;
  Stringer.drawString("средние платежи для u \u0404 S_{1} и v\u0404 S_{2}",165,84) ;
 g.drawLine(155,65,160,80) ; g.drawLine(155,93,160,82) ;

                }
}
  class  Panel_M extends JPanel {
  public void paintComponent(Graphics g) {
          super.paintComponent(g);
           Stringer.setGraphics(g) ;
          a=jSb_a.getValue() ;
           b=jSb_b.getValue() ;
           c=jSb_c.getValue() ; d=jSb_d.getValue() ;
          /* a=5 ;
           b=2 ;
           c=15 ; d=-5;*/
//if(Shag>=4) {jSb_a.setVisible(true) ;jSb_b.setVisible(true) ;jSb_c.setVisible(true) ;jSb_d.setVisible(true) ;}
  if(Shag>=4) {jLabel4.setText("Матрицы:") ;
           g.setColor(new Color(50,50,50)) ;
  g.drawLine(0,47,260,47);g.drawLine(0,140-47,260,140-47);g.drawLine(65,47,65,140);
  g.drawLine(130,0,130,140); g.drawLine(65,47,65,140);g.drawLine(195,47,195,140);
  Stringer.fonts[0]=new Font("Dialog", 1, 14);
 g.setColor(new Color(0,0,80)  ) ;  g.drawRect(129,0,2,140);
 Stringer.drawString("A",60,40) ; Stringer.drawString("B",190,40) ;
 Stringer.drawString(""+a,30,140-47-10) ;Stringer.drawString(""+b,95,140-47-10) ;
 Stringer.drawString(""+a,160,140-47-10) ;Stringer.drawString(""+b,160,140-10) ;
 Stringer.drawString(""+c,30,140-10) ;Stringer.drawString("0",95,140-10) ;
 Stringer.drawString(""+d,235,140-47-10) ;Stringer.drawString("0",235,140-10) ;}
  if(Shag==1) {;pic=getImage(getCodeBase(), "i11.JPG");
              g.drawImage(pic,00,40,jPanel2);jLabel4.setText("Иллюстрация:") ;
              pic=getImage(getCodeBase(), "i.JPG"); g.drawImage(pic,140,40,jPanel2);
              g.setColor(new Color(255,235,0));
              g.fillOval(105,-15,50,30) ; g.setColor(new Color(194,247,255));
              g.fillOval(190,10,50,20) ; g.fillOval(175,10,35,22) ;
               g.fillOval(30,15,40,20) ; g.fillOval(55,15,50,20) ;

            }
 if(Shag==2)  {pic=getImage(getCodeBase(), "i11.JPG");
              g.drawImage(pic,70,40,jPanel2);jLabel4.setText("Иллюстрация:") ;
             g.setColor(new Color(50,50,50));
             /*g.drawLine(130,70,180,60);
             g.drawLine(175,65,180,60); g.drawLine(173,58,180,60);
              g.drawLine(130,80,180,90);
              g.drawLine(175,87,180,90);g.drawLine(175,93,180,90);
              g.setColor(new Color(0,0,60) ) ;
              Stringer.drawString("I_{ 1}",190,65) ; Stringer.drawString("I_{ 2}",190,95) ;*/
            }
 if(Shag==3) {pic=getImage(getCodeBase(), "i.JPG"); g.drawImage(pic,80,40,jPanel2);
               jLabel4.setText("Иллюстрация:") ;
              /* g.setColor(new Color(50,50,50));
               g.drawLine(70,60,120,70); g.drawLine(70,60,75,63); g.drawLine(73,58,70,60);
               g.drawLine(70,90,120,80); g.drawLine(70,90,73,86); g.drawLine(70,90,76,93);
               g.setColor(new Color(0,0,60) ) ;
              Stringer.drawString("J_{ 1}",50,65) ; Stringer.drawString("J_{ 2}",50,95) ;*/
             }
        //  g.drawString("a="+a,5,20) ;
      //    g.drawString("b="+b,50,20) ;
         /* g1.setColor(new Color(167, 213, 255));
       // g1.fill3DRect(1, 1, 398, 298 - 30, true);
         g1.setColor(Color.white);
         g1.fillRect(20, 20, 360, 260 - 30);
         g1.setColor(new Color(213, 225, 255));
         for (int i = 0; i < 27 - 3; i++)
           g1.drawLine(20, 20 + i * 10, 380, 20 + i * 10);
         for (int i = 0; i < 37; i++)
           g1.drawLine(20 + i * 10, 20, 20 + i * 10, 280 - 30);
         g1.setColor(new Color(40, 70, 170));
         g1.drawRect(20, 20, 360, 260 - 30);
         g1.setColor(new Color(150, 0, 0));
         g1.setFont(new Font("Dialog", 1, 14));
       g1.drawString("Формулы:", 160, 40);
         g1.setColor(new Color(157, 187, 255));
         g1.drawLine(40, 21, 40, 249);
         g1.drawLine(45, 21, 45, 249);
         g1.setColor(new Color(0, 0, 80));*/
        // g1.setFont(font14);


  }
}
class Panel_R extends JPanel {
       public void paintComponent(Graphics g){
        super.paintComponent(g);
         Stringer.fonts[0]=new Font("Dialog", 1, 12);
          Stringer.setGraphics(g) ;
          a=jSb_a.getValue() ;
          b=jSb_b.getValue() ;
          c=jSb_c.getValue() ; d=jSb_d.getValue() ;
          int flag=0;
               if (flag==11){ g.setColor(new Color(180,0,60)  ) ;}
               if (flag==12){ g.setColor(Color.DARK_GRAY  ) ;}
               if (flag==21){ g.setColor(Color.blue) ;}
               if (flag==22){ g.setColor(Color.BLACK   ) ;}

         if (Shag==0){
                      Stringer.fonts[0]=new Font("Dialog", 2, 14);
                      g.setColor(new Color(180,0,60)  ) ;
                    // Stringer.drawString("1.",8,15) ;
                      Stringer.fonts[0]=new Font("Dialog", 1, 12);
                      g.setColor(new Color(0,0,80) ) ;
                       Stringer.drawString("Будем рассматривать задачу 'борьба полов' в популяции животных.",20,15) ;
                  }
        if (Shag==1){
                                  Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                  g.setColor(new Color(180,0,60)  ) ;
                                 Stringer.drawString("1.",8,15) ;
                                  Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                  g.setColor(new Color(0,0,80) ) ;
                                   Stringer.drawString("Имеем две популяции : популяцию мужских и популяцию женских  ",20,15) ;
                                Stringer.drawString("особей. ",13,35) ;
                                 }
    if (Shag==2){
             Stringer.fonts[0]=new Font("Dialog", 2, 14);
             g.setColor(new Color(180,0,60)  ) ;
             Stringer.drawString("2.",8,15) ;
             Stringer.fonts[0]=new Font("Dialog", 1, 12);
             g.setColor(new Color(0,0,80) ) ;
             Stringer.drawString("Популяция мужских особей имеет две стратегии: ",20,15) ;
             Stringer.drawString("I_{1}  -  быть преданным ;",13,35) ; Stringer.drawString("I_{2}  -  не быть преданным ;",13,55) ;
          }

   if (Shag==3){
                                           Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                           g.setColor(new Color(180,0,60)  ) ;
                                           Stringer.drawString("3.",8,15) ;
                                           Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                           g.setColor(new Color(0,0,80) ) ;
                                           Stringer.drawString("Популяция женских особей тоже имеет две стратегии: ",20,15) ;
                                           Stringer.drawString("J_{1}  -  быть согласной ;",13,35) ; Stringer.drawString("J_{2}  -  сопротивляться ;",13,55) ;
                                        }

  if (Shag==4){
   Stringer.fonts[0]=new Font("Dialog", 2, 14);
      g.setColor(new Color(180,0,60)  ) ;//пропустим построение
       Stringer.drawString("4.",8,15) ;
       Stringer.fonts[0]=new Font("Dialog", 1, 12);
       g.setColor(new Color(0,0,80) ) ;
       Stringer.drawString("Таким образом, получаем две матрицы:",20,15) ;
       Stringer.drawString("А -  платежная матрица для популяции мужских особей;",13,35) ; Stringer.drawString("В -  платежная матрица для популяции женских особей;",13,55) ;
       }
 if (Shag==5){
         Stringer.fonts[0]=new Font("Dialog", 2, 14);
            g.setColor(new Color(180,0,60)  ) ;
             Stringer.drawString("5.",8,15) ;
             Stringer.fonts[0]=new Font("Dialog", 1, 12);
             g.setColor(new Color(0,0,80) ) ;
             Stringer.drawString("Поэтому получаем следующие стратегии:",20,15) ;
             Stringer.drawString(" S_{1}  =  (  u = ( u_{1}, u_{2}) | 0 \u2264 u_{1}, u_{2} \u2264   и    u_{1} + u_{2} = 1 );",13,35) ;
             Stringer.drawString(" S_{2}   = (  v = ( v_{1}, v_{2}) | 0 \u2264 v_{1}, v_{2} \u2264   и    v_{1} + v_{2} = 1 );",13,55) ;
             }
   if (Shag==6){
                      Stringer.fonts[0]=new Font("Dialog", 2, 14);
                         g.setColor(new Color(180,0,60)  ) ;
                          Stringer.drawString("6.",8,15) ;
                          Stringer.fonts[0]=new Font("Dialog", 1, 12);
                          g.setColor(new Color(0,0,80) ) ;
                          Stringer.drawString("Первое неравенство из определения равновесия по Нэшу ",20,15) ;
                          // Stringer.fonts[0]=new Font("Dialog", 3, 14);
                          Stringer.drawString(" u A v^{ T}  \u2265  u A v^{ T}  для всех u \u0404 S_{ 1} эквивалентно выражению :",13,35) ;
                          Stringer.drawString("\u005E ",16,31) ;  Stringer.drawString("\u005E ",37,31) ;  Stringer.drawString("\u005E ",92,31) ;
                          Stringer.drawString(" u A v^{ T} - u A v^{ T} = "+"("+  b      + "+ (" +  (a-b-c)*(1)    +" ) v_{1} ) * (u_{1} - u_{1})  \u2265 0  для всех u \u0404 S_{ 1} ",13,60) ;
                         Stringer.drawString("\u005E ",16,56) ;  Stringer.drawString("\u005E ",37,56) ;  Stringer.drawString("\u005E ",82,56) ;
                         Stringer.drawString("\u005E ",161,56) ;      Stringer.drawString("\u005E ",196,56) ;
                       // Stringer.drawString(" S_{2}   = (  v = ( v_{1}, v_{2}) | 0 \u2264 v_{1}, v_{2} \u2264   и    v_{1} + v_{2} = 1 );",13,55) ;
                          }
   if (Shag==7){
                                  Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                     g.setColor(new Color(180,0,60)  ) ;
                                      Stringer.drawString("7.",8,15) ;
                                      Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                      g.setColor(new Color(0,0,80) ) ;
                                      String Str;
                                      /* public String normalize(double dd) {
                  dd = (int)(d*1000)*1./1000;
                  String s;
                  if(dd == (int)dd) {s = String.valueOf((int)dd);return s;}
                  else s = String.valueOf(dd);
                  if(s.length() <= 1) return s;
                  while (s.charAt(s.length() - 1) == '0'){
                    s = s.substring(0, s.length() - 1);
                  }
                  return s;                 */

                                      if((a-b-c)!=0) perem=(float)(-1)*b/(a-b-c);
                                      else  Stringer.drawString("Подберите другие значения.",13,55) ;
                                      /* Str=String.valueOf((float)perem);
                                       if(Str.length() <= 5)  Stringer.drawString(" v_{1}  =" +Str +";",13,35) ;

                 while (Str.charAt(Str.length() - 5) == '0'){
                    Str = Str.substring(0, Str.length() - 5);
                  }Stringer.drawString(" v_{1}dccc  =" +Str +";",13,35) ;
                     for(int j=0;j<Str.length();j++ )
                   {
                // Str.toCharArray(masvrem[]);
                     }//perem=Float.valueOf((String)Str) ;*/
                                      //str=StringOf(perem)
                                      v1=perem;
                                      v1=(float)((int)(v1*10000))/10000;
                                 if (v1>1&&v1<0 )   Stringer.drawString("Подберите другие значения.",13,55) ;
                                 else{

                                      Stringer.drawString("Решая последнее неравенство получаем :",20,15) ;
                                    Stringer.drawString(" v_{1}  =" +v1 +";",13,35) ;  Stringer.drawString(" \u005E ",13,31) ;
                                      g.drawString("",70,35) ;v2=(1-perem);  v2=(float)((int)(v2*10000))/10000;
                                      Stringer.drawString(" \u005E ",48,51) ;
                                      if((a-b-c)!=0)Stringer.drawString(" Тогда v_{2}  =  "+v2+ ";",13,55) ;
                                 }
                                      Stringer.drawString("Это дает нам :",13,75) ;
                                        Stringer.drawString("u A v^{ T} = u A v^{ T}  для всех u \u0404 S_{ 1}. ",100,75) ;
                                         Stringer.drawString("\u005E ",100,71) ; Stringer.drawString("\u005E ",120,71) ;
                                         Stringer.drawString("\u005E ",170,71) ;
                                    }

     if (Shag==8){
      Stringer.fonts[0]=new Font("Dialog", 2, 14);
     g.setColor(new Color(180,0,60)  ) ;
    Stringer.drawString("8.",8,15) ;
  Stringer.fonts[0]=new Font("Dialog", 1, 12);
  g.setColor(new Color(0,0,80) ) ;

   if((a-b-c)!=0) {perem=(float)(-1)*b/(a-b-c);

                      Stringer.drawString("Второе неравенство из определения равновесия по Нэшу ",20,15) ;
                        // Stringer.fonts[0]=new Font("Dialog", 3, 14);
                        Stringer.drawString(" v B u^{ T}  \u2265  v B u^{ T}  для всех v \u0404 S_{ 2} эквивалентно выражению :",13,35) ;
                        Stringer.drawString("\u005E ",16,31) ;  Stringer.drawString("\u005E ",37,31) ;  Stringer.drawString("\u005E ",92,31) ;
                        Stringer.drawString(" v B u^{ T} - v B u^{ T} = "+"(  "+  (a-d-b)  + " u_{1} + (" +  d  +")) * ( v_{1} - v_{1})  \u2265 0  для всех u \u0404 S_{ 2} ",13,60) ;
                       Stringer.drawString("\u005E ",16,56) ;  Stringer.drawString("\u005E ",37,56) ;  Stringer.drawString("\u005E ",82,56) ;
                       Stringer.drawString("\u005E ",140,56) ;      Stringer.drawString("\u005E ",205,56) ;}
else  Stringer.drawString("Подберите другие значения.",13,55) ;

  }
  if (Shag==9){
  Stringer.fonts[0]=new Font("Dialog", 2, 14);
  g.setColor(new Color(180,0,60)  ) ;
 Stringer.drawString("9.",8,15) ;
 Stringer.fonts[0]=new Font("Dialog", 1, 12);
 g.setColor(new Color(0,0,80) ) ;
 if((a-d-b)!=0) perem=(float)(-1)*d/(a-d-b);

 if(u1>1&&u1<0)  Stringer.drawString("Подберите другие значения.",13,55) ;
 else {u1=perem;  u1=(float)((int)(u1*10000))/10000;
 // perem=(double)50/8;

 Stringer.drawString("Решая  неравенство  получаем :",20,15) ;
  Stringer.drawString(" u_{1}  =" +u1 +";",13,35) ;Stringer.drawString(" \u005E ",13,31) ;
   g.drawString("",70,35) ;u2=1-u1;  u2=(float)((int)(u2*10000))/10000;Stringer.drawString(" \u005E ",48,51) ;
  if((a-d-b)!=0)   Stringer.drawString(" Тогда u_{2}  =  "+ u2 + ";",13,55) ;}

Stringer.drawString("Это дает нам :",13,75) ;
Stringer.drawString("v B u^{ T} = v B u^{ T}  для всех v \u0404 S_{ 2}. ",100,75) ;
Stringer.drawString("\u005E ",100,71) ; Stringer.drawString("\u005E ",120,71) ;
Stringer.drawString("\u005E ",170,71) ;
  }

if (Shag==10){
         Stringer.fonts[0]=new Font("Dialog", 2, 14);
         g.setColor(new Color(180,0,60)  ) ;
         Stringer.drawString("10.",8,15) ;
         Stringer.fonts[0]=new Font("Dialog", 1, 12);
         g.setColor(new Color(0,0,80) ) ;
if((a-d-b)!=0) {u1=(float)(-1)*d/(a-d-b);  u1=(float)((int)(v1*10000))/10000;
         u2=1-u1;  u2=(float)((int)(u2*10000))/10000;}
if((a-b-c)!=0) {v1=(float)(-1)*b/(a-b-c);  v1=(float)((int)(v1*10000))/10000;v2=1-v1;  v2=(float)((int)(v1*10000))/10000;}
         Stringer.drawString("Таким образом, пара ( u , v ) \u0404 S_{ 1} \u00D7 S_{ 2} со значениями ",28,15) ;
                           Stringer.drawString("\u005E ",160,11) ; Stringer.drawString("\u005E ",175,11) ;
                           Stringer.drawString("u = ( "+  u1 + " , " + u2 + " ) и   v = ( "+ v1 + " , "+ v2 +" )"  ,13,35) ;
                          // Stringer.drawString("\u005E ",13,31) ;
                           Stringer.drawString("дает нам равновесие по Нэшу.  ",13,55) ;
                           Stringer.drawString("Тогда средний платеж будет равен : ",13,75) ;
                           masmatUA[0]=u1*a+u2*c;masmatUA[1]=u1*b+u2*0;
                           matUAV[0]=masmatUA[0]*v1; matUAV[1]=masmatUA[1]*v2;
                           perem=matUAV[0]+matUAV[1];
                           perem=(float)((int)(perem*10000))/10000;
                           Stringer.drawString("u A v^{ T} = "+ perem,235,75) ;
                           Stringer.drawString("\u005E ",235,71) ; Stringer.drawString("\u005E ",255,71) ;
                           // Stringer.drawString("\u005E ",92,31) ;
                           masmatVB[0]=v1*a+v2*b;masmatVB[1]=v1*d+u2*0;
                           matVBU[0]=masmatVB[0]*u1; matVBU[1]=masmatVB[1]*u2;
                           perem=matVBU[0]+matVBU[1];
 perem=(float)((int)(perem*10000))/10000;
                           Stringer.drawString(" v B u^{ T} = "+perem+" .",13,95) ;
                           Stringer.drawString(" \u005E ",13,91) ; Stringer.drawString(" \u005E ",33,91) ;
                       //   Stringer.drawString("\u005E ",16,56) ;  Stringer.drawString("\u005E ",37,56) ;  Stringer.drawString("\u005E ",82,56) ;
                        //  Stringer.drawString("\u005E ",130,56) ;      Stringer.drawString("\u005E ",195,56) ;
     }
     if (Shag==11){
                                      Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                         g.setColor(new Color(180,0,60)  ) ;
                                          Stringer.drawString("11.",5,15) ;
                                          Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                          g.setColor(new Color(0,0,80) ) ;
 c1=0-b;c2=0-c;d1=0-d;d2=0-b;
 float p1,q1,p2,q2,maxf,f1,f2;
 if((a-d-b)!=0) {u1=(float)(-1)*d/(a-d-b);  u1=(float)((int)(u1*10000))/10000;
         u2=1-u1;  u2=(float)((int)(u2*10000))/10000;}
  else Stringer.drawString("",20,15) ;
if((a-b-c)!=0) {v1=(float)(-1)*b/(a-b-c);  v1=(float)((int)(v1*10000))/10000;v2=1-v1;  v2=(float)((int)(v2*10000))/10000;}
else Stringer.drawString("",20,15) ;
p1=v1;q1=v2;p2=u1;q2=u2;
if((a-b-c)!=0) {f11=(a-b-c)*p1*q1-c1*p1-c2*q1;f12=(a-b-c)*p2*q2-c1*p2-c2*q2;}else Stringer.drawString("",20,15) ;
 if((a-d-b)!=0) {f21=(a-d-b)*p1*q1-d1*p1-d2*q1;f22=(a-d-b)*p2*q2-d1*p2-d2*q2;}else Stringer.drawString("",20,15) ;
   f11=(float)((int)(f11*10000))/10000;  f21=(float)((int)(f21*10000))/10000;  f12=(float)((int)(f12*10000))/10000;
     f22=(float)((int)(f22*10000))/10000;
     if (flag==11){ g.setColor(new Color(180,0,60)  ) ;}
     if (flag==12){ g.setColor(Color.DARK_GRAY  ) ;}
     if (flag==21){ g.setColor(Color.blue) ;}
     if (flag==22){ g.setColor(Color.BLACK   ) ;}

 //Stringer.drawString(" f11 "+f11+" .",13,15) ;Stringer.drawString(" f12 "+f12+" .",13,30) ;
 //Stringer.drawString(" f21 "+f21+" .",13,45) ;Stringer.drawString(" f22 "+f22+" .",13,60) ;
 if (f11>f12 && f21>f22 && f11>f21)  {g.setColor(new Color(180,0,60)  ) ;Stringer.drawString("Максимальный выигрыш, равный "+f11+" соответствует стратегиям ",20,15) ;
  Stringer.drawString("I_{ 1} - быть преданным, J_{ 1}- быть согласной.",10,30) ;flag=11;}
if (f11>f12 && f21>f22 && f11<f21)  {g.setColor(Color.blue) ;Stringer.drawString("Максимальный выигрыш, равный "+f21+" соответствует стратегиям",20,15) ;
 Stringer.drawString("I_{2} - не быть преданным, J_{ 1}- быть согласной.",10,30) ;flag=21;}
if (f11>f12 && f21<f22 && f11>f22) {g.setColor(new Color(180,0,60)  ) ; Stringer.drawString("Максимальный выигрыш, равный "+f11+" соответствует стратегиям ",20,15) ;
Stringer.drawString("I_{ 1} - быть преданным, J_{ 1}- быть согласной.",10,30) ;flag=11;}
if (f11>f12 && f21<f22 && f11<f22) { g.setColor(Color.BLACK   ) ;Stringer.drawString("Максимальный выигрыш, равный "+f22+" соответствует стратегиям ",20,15) ;
Stringer.drawString("I_{ 2} - не быть преданным, J_{ 2}-не быть согласной.",10,30) ;flag=22;}
if (f11<f12 && f21>f22 && f12>f21) {  g.setColor(Color.DARK_GRAY  ) ;Stringer.drawString("Максимальный выигрыш, равный "+f12+" соответствует стратегиям ",20,15) ;
Stringer.drawString("I_{ 1} - быть преданным, J_{ 2}-не быть согласной.",10,30) ;flag=12;}
if (f11<f12 && f21>f22 && f12<f21) {g.setColor(Color.blue) ; Stringer.drawString("Максимальный выигрыш, равный "+f21+" соответствует стратегиям ",20,15) ;
Stringer.drawString("I_{ 2} - не быть преданным, J_{ 1}- быть согласной.",10,30) ;flag=21;}
 if (f11<f12 && f21<f22 && f12>f22) { g.setColor(Color.DARK_GRAY  ) ; Stringer.drawString("Максимальный выигрыш, равный "+f12+" соответствует стратегиям ",20,15) ;
Stringer.drawString("I_{ 1} - быть преданным, J_{ 2}-не быть согласной.",10,30) ;flag=12;}
 if (f11<f12 && f21<f22 && f12<f22)  {g.setColor(Color.BLACK   ) ;Stringer.drawString("Максимальный выигрыш, равный "+f22+" соответствует стратегиям ",20,15) ;
Stringer.drawString("I_{ 2} - не быть преданным, J_{ 2}-не быть согласной.",10,30) ;flag=22;}
  g.setColor(new Color(0,0,80) ) ;
 Stringer.drawString("Матрица А: "+a+", степень преданности м. особи при согласии ж.особи",10,45) ;
  Stringer.drawString("Матрица В: "+a+", степень согласия ж.особи при преданности м.особи",10,60) ;
Stringer.drawString("Матрица В: "+b+", степень непреданности м.особи при несогласии ж.особи",10,75) ;
 Stringer.drawString("Матрица А: "+b+", степень несогласии ж.особи при непреданности м.особи ",10,90) ;}
if (Shag==12){
       Stringer.fonts[0]=new Font("Dialog", 2, 14);
                                             g.setColor(new Color(180,0,60)  ) ;
                                              Stringer.drawString("12.",5,15) ;
                                              Stringer.fonts[0]=new Font("Dialog", 1, 12);
                                              g.setColor(new Color(0,0,80) ) ;
     c1=0-b;c2=0-c;d1=0-d;d2=0-b;
     float p1,q1,p2,q2,maxf,f1,f2;
     if((a-d-b)!=0) {u1=(float)(-1)*d/(a-d-b);  u1=(float)((int)(u1*10000))/10000;
             u2=1-u1;  u2=(float)((int)(u2*10000))/10000;}
      else Stringer.drawString("",20,15) ;
    if((a-b-c)!=0) {v1=(float)(-1)*b/(a-b-c);  v1=(float)((int)(v1*10000))/10000;v2=1-v1;  v2=(float)((int)(v2*10000))/10000;}
    else Stringer.drawString("",20,15) ;
    p1=v1;q1=v2;p2=u1;q2=u2;
    if((a-b-c)!=0) {f11=(a-b-c)*p1*q1-c1*p1-c2*q1;f12=(a-b-c)*p2*q2-c1*p2-c2*q2;}else Stringer.drawString("",20,15) ;
     if((a-d-b)!=0) {f21=(a-d-b)*p1*q1-d1*p1-d2*q1;f22=(a-d-b)*p2*q2-d1*p2-d2*q2;}else Stringer.drawString("",20,15) ;
     if((a-b-c)!=0) {f11=(a-b-c)*p1*q1-c1*p1-c2*q1;f12=(a-b-c)*p2*q2-c1*p2-c2*q2;}else Stringer.drawString("",20,15) ;
 if((a-d-b)!=0) {f21=(a-d-b)*p1*q1-d1*p1-d2*q1;f22=(a-d-b)*p2*q2-d1*p2-d2*q2;}else Stringer.drawString("",20,15) ;
 f11=(float)((int)(f11*10000))/10000;  f21=(float)((int)(f21*10000))/10000;  f12=(float)((int)(f12*10000))/10000;
     f22=(float)((int)(f22*10000))/10000;
     if (flag==11){ g.setColor(new Color(180,0,60)  ) ;}
     if (flag==12){ g.setColor(Color.DARK_GRAY  ) ;}
     if (flag==21){ g.setColor(Color.blue) ;}
     if (flag==22){ g.setColor(Color.BLACK   ) ;}
  if (f11<f12 && f21<f22 && f11<f21)  {flag=11;g.setColor(new Color(180,0,60)  ) ;Stringer.drawString("Минимальный выигрыш, равный "+f11+" соответствует стратегиям ",20,45) ;
   Stringer.drawString("I_{ 1} - быть преданным, J_{ 1}- быть согласной.",10,60) ;}
 if (f11<f12 && f21<f22 && f11>f21)  {flag=21;g.setColor(Color.blue) ;Stringer.drawString("Минимальный выигрыш, равный "+f21+" соответствует стратегиям",20,45) ;
  Stringer.drawString("I_{2} - не быть преданным, J_{ 1}- быть согласной.",10,60) ;}
 if (f11<f12 && f21>f22 && f11<f22) { flag=11;g.setColor(new Color(180,0,60)  ) ;Stringer.drawString("Минимальный выигрыш, равный "+f11+" соответствует стратегиям ",20,45) ;
 Stringer.drawString("I_{ 1} - быть преданным, J_{ 1}- быть согласной.",10,60) ;}
 if (f11<f12 && f21>f22 && f11>f22) { flag=22;g.setColor(Color.BLACK   ) ;Stringer.drawString("Минимальный выигрыш, равный "+f22+" соответствует стратегиям ",20,45) ;
 Stringer.drawString("I_{ 2} - не быть преданным, J_{ 2}-не быть согласной.",10,60) ;}
 if (f11>f12 && f21<f22 && f12<f21) { flag=12;g.setColor(Color.DARK_GRAY  ) ;Stringer.drawString("Минимальный выигрыш, равный "+f12+" соответствует стратегиям ",20,45) ;
 Stringer.drawString("I_{ 1} - быть преданным, J_{ 2}-не быть согласной.",10,60) ;}
 if (f11>f12 && f21<f22 && f12>f21) { flag=21;g.setColor(Color.blue) ;Stringer.drawString("Минимальный выигрыш, равный "+f21+" соответствует стратегиям ",20,45) ;
 Stringer.drawString("I_{ 2} - не быть преданным, J_{ 1}- быть согласной.",10,60) ;}
  if (f11>f12 && f21>f22 && f12<f22) { flag=12;g.setColor(Color.DARK_GRAY  ) ;Stringer.drawString("Минимальный выигрыш, равный "+f12+" соответствует стратегиям ",20,45) ;
 Stringer.drawString("I_{ 1} - быть преданным, J_{ 2}-не быть согласной.",10,60) ;}
  if (f11>f12 && f21>f22 && f12>f22)  {flag=22;g.setColor(Color.BLACK   ) ;Stringer.drawString("Минимальный выигрыш, равный "+f22+" соответствует стратегиям ",20,45) ;
 Stringer.drawString("I_{ 2} - не быть преданным, J_{ 2}-не быть согласной.",10,60) ;

}g.setColor(new Color(0,0,80) ) ;
        Stringer.drawString("Матрица А: "+c+", степень непреданности  м.особи при согласии ж.особи",10,75) ;
         Stringer.drawString("Матрица В: "+d+", степень согласия ж.особи при непреданности м.особи",10,90) ;
         Stringer.drawString("Матрица А и В - 0, степень непреданности и несогласия",10,105) ;


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

  void jSlider_a_mouseDragged(MouseEvent e) {
jPanel2.repaint();jPanel3.repaint() ;jPanel4.repaint() ;
  }



  void jSlider_b_mouseDragged(MouseEvent e) {
jPanel2.repaint();jPanel3.repaint() ;jPanel4.repaint() ;
  }

  void jSlider_c_mouseDragged(MouseEvent e) {
jPanel2.repaint();jPanel3.repaint() ;jPanel4.repaint() ;
  }

  void jSlider4_mouseDragged(MouseEvent e) {
jPanel2.repaint();jPanel3.repaint() ;jPanel4.repaint() ;
  }
  JCheckBox jCheckBox = new JCheckBox();
  JScrollBar jSb_a = new JScrollBar();
  JScrollBar jSb_b = new JScrollBar();
  JScrollBar jSb_c = new JScrollBar();
  JScrollBar jSb_d = new JScrollBar();
  JLabel jLabel6 = new JLabel();
  JLabel jLabel7 = new JLabel();
  JLabel jLabel8 = new JLabel();
  JLabel jLabel9 = new JLabel();
  JLabel jLabel10 = new JLabel();
  JLabel jLabel11 = new JLabel();
  JLabel jLabel12 = new JLabel();
  JLabel jLabel13 = new JLabel();

  void jButton_pred_actionPerformed(ActionEvent e) {
    Shag--;
    if(Shag==0) jButton_pred.setEnabled(false) ;
        if(Shag!=0) jButton_next.setEnabled(true) ;
jPanel3.repaint() ;
    jPanel2.repaint() ;jPanel4.repaint() ;

  }

  void jButton2_actionPerformed(ActionEvent e) {
    Shag=0;jButton_pred.setEnabled(false) ;
  jButton_next.setEnabled(true) ;
 jPanel2.repaint() ;jPanel3.repaint() ;jPanel4.repaint() ;
  }

  void jButton_next_actionPerformed(ActionEvent e) {
   if(Shag<12){Shag++; jButton_pred.setEnabled(true) ;
  //jButton_next.setEnabled(true) ;
  jPanel2.repaint() ;jPanel3.repaint() ;jPanel4.repaint() ;}
else jButton_next.setEnabled(false) ;
  }

  void jCheckBox_mouseClicked(MouseEvent e) {
    k++; if(k%2==0) {jPanel3.setVisible(false) ;
                     jPanel2.setVisible(true) ;
                     jSb_a.setVisible(true);
                     jSb_b.setVisible(true);
                     jSb_c.setVisible(true);
                     jSb_d.setVisible(true); jLabel4.setVisible(true) ;
                     jLabel6.setVisible(true) ;jLabel7.setVisible(true) ;jLabel8.setVisible(true) ;
                     jLabel9.setVisible(true) ;jLabel10.setVisible(true) ;jLabel11.setVisible(true) ;
                     jLabel12.setVisible(true) ;jLabel13.setVisible(true) ;
                    }
  if(k%2!=0) {jPanel3.setVisible(true) ;jPanel2.setVisible(false) ;
             jSb_a.setVisible(false);jSb_b.setVisible(false);jSb_c.setVisible(false);
       jSb_d.setVisible(false); jLabel4.setVisible(false) ; jLabel6.setVisible(false) ; jLabel7.setVisible(false) ; jLabel8.setVisible(false) ;
       jLabel9.setVisible(false) ; jLabel10.setVisible(false) ; jLabel11.setVisible(false) ; jLabel12.setVisible(false) ; jLabel13.setVisible(false) ;
     }
  }

  void jSb_a_mouseDragged(MouseEvent e) {
  jPanel2.repaint() ;jPanel3.repaint() ;jPanel4.repaint() ;
  }

  void jSb_a_mouseMoved(MouseEvent e) {
jPanel2.repaint() ;jPanel3.repaint() ;jPanel4.repaint() ;
  }

  void jSb_b_mouseDragged(MouseEvent e) {
jPanel2.repaint() ;jPanel3.repaint() ;jPanel4.repaint() ;
  }

  void jSb_b_mouseMoved(MouseEvent e) {
jPanel2.repaint() ;jPanel3.repaint() ;jPanel4.repaint() ;
  }

  void jSb_c_mouseDragged(MouseEvent e) {
jPanel2.repaint() ;jPanel3.repaint() ;jPanel4.repaint() ;
  }

  void jSb_c_mouseMoved(MouseEvent e) {
jPanel2.repaint() ;jPanel3.repaint() ;jPanel4.repaint() ;
  }

  void jSb_d_mouseDragged(MouseEvent e) {
jPanel2.repaint() ;jPanel3.repaint() ;jPanel4.repaint() ;
  }

  void jSb_d_mouseMoved(MouseEvent e) {
jPanel2.repaint() ;jPanel3.repaint() ;jPanel4.repaint() ;
  }
}

class ApplPrimPopul_jSlider_a_mouseMotionAdapter extends java.awt.event.MouseMotionAdapter {
  ApplPrimPopul adaptee;

  ApplPrimPopul_jSlider_a_mouseMotionAdapter(ApplPrimPopul adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseDragged(MouseEvent e) {
    adaptee.jSlider_a_mouseDragged(e);
  }
}

class ApplPrimPopul_jSlider_b_mouseMotionAdapter extends java.awt.event.MouseMotionAdapter {
  ApplPrimPopul adaptee;

  ApplPrimPopul_jSlider_b_mouseMotionAdapter(ApplPrimPopul adaptee) {
    this.adaptee = adaptee;
  }

  public void mouseDragged(MouseEvent e) {
    adaptee.jSlider_b_mouseDragged(e);
  }
}

class ApplPrimPopul_jSlider_c_mouseMotionAdapter extends java.awt.event.MouseMotionAdapter {
  ApplPrimPopul adaptee;

  ApplPrimPopul_jSlider_c_mouseMotionAdapter(ApplPrimPopul adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseDragged(MouseEvent e) {
    adaptee.jSlider_c_mouseDragged(e);
  }
}

class ApplPrimPopul_jSlider4_mouseMotionAdapter extends java.awt.event.MouseMotionAdapter {
  ApplPrimPopul adaptee;

  ApplPrimPopul_jSlider4_mouseMotionAdapter(ApplPrimPopul adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseDragged(MouseEvent e) {
    adaptee.jSlider4_mouseDragged(e);
  }
}

class ApplPrimPopul_jButton_pred_actionAdapter implements java.awt.event.ActionListener {
  ApplPrimPopul adaptee;

  ApplPrimPopul_jButton_pred_actionAdapter(ApplPrimPopul adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton_pred_actionPerformed(e);
  }
}

class ApplPrimPopul_jButton2_actionAdapter implements java.awt.event.ActionListener {
  ApplPrimPopul adaptee;

  ApplPrimPopul_jButton2_actionAdapter(ApplPrimPopul adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton2_actionPerformed(e);
  }
}

class ApplPrimPopul_jButton_next_actionAdapter implements java.awt.event.ActionListener {
  ApplPrimPopul adaptee;

  ApplPrimPopul_jButton_next_actionAdapter(ApplPrimPopul adaptee) {
    this.adaptee = adaptee;
  }
  public void actionPerformed(ActionEvent e) {
    adaptee.jButton_next_actionPerformed(e);
  }
}

class ApplPrimPopul_jCheckBox_mouseAdapter extends java.awt.event.MouseAdapter {
  ApplPrimPopul adaptee;

  ApplPrimPopul_jCheckBox_mouseAdapter(ApplPrimPopul adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseClicked(MouseEvent e) {
    adaptee.jCheckBox_mouseClicked(e);
  }
}

class ApplPrimPopul_jSb_a_mouseMotionAdapter extends java.awt.event.MouseMotionAdapter {
  ApplPrimPopul adaptee;

  ApplPrimPopul_jSb_a_mouseMotionAdapter(ApplPrimPopul adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseDragged(MouseEvent e) {
    adaptee.jSb_a_mouseDragged(e);
  }
  public void mouseMoved(MouseEvent e) {
    adaptee.jSb_a_mouseMoved(e);
  }
}

class ApplPrimPopul_jSb_b_mouseMotionAdapter extends java.awt.event.MouseMotionAdapter {
  ApplPrimPopul adaptee;

  ApplPrimPopul_jSb_b_mouseMotionAdapter(ApplPrimPopul adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseDragged(MouseEvent e) {
    adaptee.jSb_b_mouseDragged(e);
  }
  public void mouseMoved(MouseEvent e) {
    adaptee.jSb_b_mouseMoved(e);
  }
}

class ApplPrimPopul_jSb_c_mouseMotionAdapter extends java.awt.event.MouseMotionAdapter {
  ApplPrimPopul adaptee;

  ApplPrimPopul_jSb_c_mouseMotionAdapter(ApplPrimPopul adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseDragged(MouseEvent e) {
    adaptee.jSb_c_mouseDragged(e);
  }
  public void mouseMoved(MouseEvent e) {
    adaptee.jSb_c_mouseMoved(e);
  }
}

class ApplPrimPopul_jSb_d_mouseMotionAdapter extends java.awt.event.MouseMotionAdapter {
  ApplPrimPopul adaptee;

  ApplPrimPopul_jSb_d_mouseMotionAdapter(ApplPrimPopul adaptee) {
    this.adaptee = adaptee;
  }
  public void mouseDragged(MouseEvent e) {
    adaptee.jSb_d_mouseDragged(e);
  }
  public void mouseMoved(MouseEvent e) {
    adaptee.jSb_d_mouseMoved(e);
  }
}
