package duel;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.Graphics;
import javax.swing.border.*;

public class AppDuel extends JApplet {
  int ds=18;

  Panel_paint drawpanel = new Panel_paint();
  Panel_paint2 drawpanel2 = new Panel_paint2();
  Panel_paint3 drawpanel3 = new Panel_paint3();
  Panel_paint4 drawpanel4 = new Panel_paint4();
  Color color1=new Color(100,100,200);
  Color color2=new Color(100,200,100);
  Font FontText=new java.awt.Font("Dialog",1,12);
  Color ColorText=new Color(0,0,80);
  JLabel label_tit=new JLabel();
  JLabel label_title=new JLabel();
  JLabel label_uz=new JLabel();
  JLabel label_gi=new JLabel();
  JLabel label_o=new JLabel();
  JLabel label_r=new JLabel();
  JLabel label_a=new JLabel();
  JLabel label_b=new JLabel();
  JLabel a=new JLabel();
  JLabel b=new JLabel();
  JTextPane txpHelp = new JTextPane();

  JButton button=new JButton("��������");
  JButton button1=new JButton("<=");
  JButton button2=new JButton("=>");
  int za=1,zb=1,za2=1,zb2=1,za3=1,zb3=1,za4=1,zb4=1;
  int f1=0,f2=0,f3=0,f4=0,step=0,st=0,pr;
  int[] mass= new int[3];
  int[] mass1=new int[3];
  JCheckBox cbHelp = new JCheckBox();
  TitledBorder titledBorder1;


//------------------------------------------------------------------------------
  /**Initialize the applet*/
  public void init() {
  Graphics gr=drawpanel.getGraphics();
  gr.setFont(new java.awt.Font("SansSerif", 1, 14));
  FontMetrics F=gr.getFontMetrics();
  String s="���� ������ �������� ������� ������� ��������-�����";
  if (F.stringWidth(s)<=430){ds=12;}
                       else {ds=10;}
  Stringer.font1=new Font("Times New Roman", 1, 14);
  Stringer.Lab_v=new Font("Times New Roman", 1, 14);
  Stringer.Lab_k=new Font("Times New Roman", 3, 14);
  Stringer.font_lab=new Font("Times New Roman", 1, 14);
  Stringer.fonts[0]=new Font("Times New Roman", 1, 14);
  Stringer.fonts[1]=new Font("Times New Roman", 1, 14-5);
  Stringer.fonts[2]=new Font("Times New Roman", 1, 14);

  Stringer.setColor(drawpanel);
  Stringer.setColor(drawpanel2);
  Stringer.setColor(drawpanel3);
  Stringer.setColor(drawpanel4);

  Stringer.setColor(label_title,"title");
  Stringer.setColor(button);
  //Stringer.setColor(button1);
  //Stringer.setColor(button2);
  }
//------------------------------------------------------------------------------
  /**Construct the applet*/
  public AppDuel() {
   try {
      jbInit();
    }
    catch(Exception e) {
      e.printStackTrace();
    }
  }
//------------------------------------------------------------------------------
  /**Component initialization*/
  private void jbInit() throws Exception {
  Container cont=getContentPane();
  titledBorder1 = new TitledBorder("");
    cont.setLayout(null);
  Stringer.setColor(cont);

  drawpanel.setBounds(15,42,660,330);

    button1.setEnabled(false);
    button1.setToolTipText("");
    button1.setActionCommand("<=");
    button1.setText("<=");
    drawpanel.setLayout(null);
      drawpanel.add(cbHelp,null);
      drawpanel.add(txpHelp,null);

    txpHelp.setBackground(SystemColor.activeCaptionBorder);
    txpHelp.setBorder(BorderFactory.createRaisedBevelBorder());
    cont.add(cbHelp);
    cbHelp.setText("");
    cont.add(drawpanel);
  drawpanel2.setBounds(15,167+60+70-115,325,200-40);
  cont.add(drawpanel2);
  drawpanel3.setBounds(365,167+60+70-115,310,200-40);
  cont.add(drawpanel3);
  drawpanel4.setBounds(15,392+60+30-115+15,660,125-15);
  cont.add(drawpanel4);


  txpHelp.setText("");
  txpHelp.setVisible(false);
  txpHelp.setBounds(new Rectangle(0, 0, 50, 50));
  cbHelp.setVisible(false);
  cbHelp.setBounds(new Rectangle(60, 0, 20, 20));



  label_tit.setForeground(new Color(130,0, 80));
  label_tit.setFont(new Font("Dialog", 1, 16));
  label_tit.setBounds(new Rectangle(95, 5, 500, 20));

  label_tit.setVerticalAlignment(SwingConstants.TOP);
  label_tit.setHorizontalAlignment(SwingConstants.CENTER);
  cont.add(label_tit);
  label_gi.setForeground(new Color(180,0, 60));
  label_gi.setFont(new Font("Dialog", 3, 12));
  label_gi.setBounds(new Rectangle(15, 147+60+70-115, 500, 20));

  cont.add(label_gi);
  label_uz.setForeground(new Color(180,0, 60));
  label_uz.setFont(new Font("Dialog", 3, 12));
  label_uz.setBounds(new Rectangle(15, 20, 500, 20));

  cont.add(label_uz);
  label_o.setForeground(new Color(180,0, 60));
  label_o.setFont(new Font("Dialog", 3, 12));
  label_o.setBounds(new Rectangle(365, 147+60+70-115, 500, 20));

  cont.add(label_o);
  label_r.setForeground(new Color(180,0, 60));
  label_r.setFont(new Font("Dialog", 3, 12));
  label_r.setBounds(new Rectangle(15, 372+60+30-115, 500, 20));

  cont.add(label_r);

  //button1.setForeground(new Color(220,230,255));
  button1.setFont(new Font("Dialog", 1, 14));
  button1.setBackground(new Color(220,230,255));

// button2.setForeground(new Color(220,230, 255));
  button2.setFont(new Font("Dialog", 1, 14));
  button2.setBackground(new Color(220,230,255));
  button.setBounds(new Rectangle(305,620-115,100,23));
  cont.add(button);
  button.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent e) {
     f1=0;f2=0;f3=0;f4=0;st=0;step=0;
     button1.setEnabled(false);
     button2.setEnabled(true);
     repaint();
  }});

  button1.setBounds(new Rectangle(180,620-115,100,23));
   cont.add(button1);
   button1.addMouseListener(new MouseAdapter() {
    public void mouseClicked(MouseEvent e) {
    f1=0;f2=0;f3=0;f4=0;
    if (st>0)
      st-=1;
    if (st==0)
  button1.setEnabled(false);

  button2.setEnabled(true);
    repaint();
 }});
    button2.setBounds(new Rectangle(430,620-115,100,23));
     cont.add(button2);
    cont.add(txpHelp, null);
    cont.add(cbHelp, null);
     button2.addMouseListener(new MouseAdapter() {
       public void mouseClicked(MouseEvent e) {
        f1=0;f2=0;f3=0;f4=0;
        if(st<20)
         st+=1;
     button1.setEnabled(true);
     if (st==20)
     button2.setEnabled(false);
        repaint();
  }});



  }

//==============================================================================
class  Panel_paint extends JPanel {
    public void paintComponent(Graphics g) {
      super.paintComponent(g);
      Stringer.setGraphics(g);


      if (pr==0){
if(st==0){
          label_tit.setText("����������� ����");
        }
if(st>=1 && st<=400){
          label_tit.setText("������ � 2.");
        }
label_gi.setText(" ����������� �����������: ");
label_uz.setText(" ");
label_o.setText(" �����������: ");
label_r.setText(" ���������� ������: ");}

 if (pr==1){
label_tit.setText("  Duel");
label_gi.setText(" Graphic illustration: ");
label_uz.setText(" Task: ");
label_o.setText(" Designations: ");
label_r.setText(" Construction of model: ");
 }
if(st>=0 && st<=400){
  g.setFont(new Font("Times New Roman", 1, 14));
  g.setColor(Color.black);
}


   if(st==0){
     g.setFont(new Font("Serif", 1, 28));
     g.setColor(new Color(130, 0, 80));
     g.drawString("                         ������ ������������", 15, 170);
   }

 if(st>=1 && st<=8){
   if (st >= 1) {
     if (st == 1)
       g.setColor(new Color(0, 0, 120));
     g.setFont(new Font("Times New Roman", 1, 14));

     g.drawString("�������  ��  ��,  ���  �  �  ����������  �������,  �����  ������  -  �����  �  ��  �����",
                  35, 20);
     g.drawString("���������, ��������� ������� � �� 1-� ����.", 15, 40);
     //Stringer.drawString("�_{1} - '������� x = 1',                  �_{2} - '������� x = 2'.",95,190);

     g.setColor(Color.LIGHT_GRAY);
     g.fillOval(536, 396 - 100 + 55 - 180, 34, 34);
     g.fillOval(566, 346 - 100 + 55 - 180, 34, 34);
     g.fillOval(506, 346 - 100 + 55 - 180, 34, 34);
     g.fillRect(523, 346 - 100 + 10 + 55 - 180, 60, 14);

     g.setColor(Color.white);
     g.fillOval(540, 400 - 100 + 55 - 180, 25, 25);
     g.fillOval(570, 350 - 100 + 55 - 180, 25, 25);
     g.fillOval(510, 350 - 100 + 55 - 180, 25, 25);

     g.setColor(new Color(0, 0, 0));
     g.drawOval(540, 400 - 100 + 55 - 180, 25, 25);

     g.drawOval(570, 350 - 100 + 55 - 180, 25, 25);
     g.drawOval(510, 350 - 100 + 55 - 180, 25, 25);

     g.drawOval(593, 310 - 100 + 55 - 180, 10, 10);
     g.drawOval(563, 310 - 100 + 55 - 180, 10, 10);
     g.drawOval(533, 310 - 100 + 55 - 180, 10, 10);
     g.drawOval(503, 310 - 100 + 55 - 180, 10, 10);

     g.drawLine(560, 403 - 100 + 55 - 180, 576, 373 - 100 + 55 - 180);
     g.drawLine(545, 403 - 100 + 55 - 180, 530, 373 - 100 + 55 - 180);

     g.drawLine(586, 351 - 100 + 55 - 180, 597, 320 - 100 + 55 - 180);
     g.drawLine(580, 351 - 100 + 55 - 180, 569, 320 - 100 + 55 - 180);
     g.drawLine(526, 351 - 100 + 55 - 180, 537, 320 - 100 + 55 - 180);
     g.drawLine(520, 351 - 100 + 55 - 180, 509, 320 - 100 + 55 - 180);

     g.drawString("�", 547, 418 - 100 + 55 - 180);

     g.drawString("�", 577, 368 - 100 + 55 - 180);
     g.drawString("�", 517, 368 - 100 + 55 - 180);

     g.drawString("1", 529, 397 - 100 + 55 - 180);
     g.drawString("2", 574, 397 - 100 + 55 - 180);

     g.drawString("1", 565, 344 - 100 + 55 - 180);
     g.drawString("2", 596, 344 - 100 + 55 - 180);

     g.drawString("1", 505, 344 - 100 + 55 - 180);
     g.drawString("2", 536, 344 - 100 + 55 - 180);

     g.drawString("2", 596, 304 - 100 + 55 - 180);
     g.drawString("-1", 531, 304 - 100 + 55 - 180);
     g.drawString("-2", 560, 304 - 100 + 55 - 180);
     g.drawString("1", 505, 304 - 100 + 55 - 180);

     /*g.setColor(new Color(0, 0, 0));
           g.drawString("                  -1", 250, 60);*/
   }

   if (st >= 2) {
     if (st == 2)
       g.setColor(new Color(0, 0, 120));

     g.setFont(new Font("Times New Roman", 1, 14));
     g.drawString("��������� ������ � �������� �� ��:", 35, 60);
     Stringer.drawString(
         "�_{1} - '������� x = 1',                  �_{2} - '������� x = 2'.",
         95, 90);
   }
   if (st >= 3) {
     if (st == 3)
       g.setColor(new Color(0, 0, 120));

     g.setFont(new Font("Times New Roman", 1, 14));
     g.drawString(
         "��� ��� ������ � ����� ������ � ����������, �� ���� ����� �", 35,
         120);
     g.drawString(
         "�� �����, � ����� ������ �� 2-� ������� �� ��������� (��.���.),",
         15, 140);
     g.drawString("�� � ���� �� �� ��� ���������:", 15, 200);
     Stringer.drawString(
         "�_{1} - '������� y = 1',                  �_{2} - '������� y = 2'.",
         95, 170);
   }

   if (st >= 4) {
     if (st == 4)
       g.setColor(new Color(0, 0, 120));

     g.setFont(new Font("Times New Roman", 1, 14));

     g.drawString("���������� ��������� �������� ����.", 35, 220);
   }
   if (st >= 5) {
     if (st == 5)
       g.setColor(new Color(0, 0, 120));

     g.setFont(new Font("Times New Roman", 1, 14));

     g.drawString("�������� ����� �.", 35, 240);
     g.setColor(Color.LIGHT_GRAY);
     g.fillOval(536, 396 - 45 - 180, 34, 34);
     g.fillOval(566, 346 - 45 - 180, 34, 34);
     g.fillOval(506, 346 - 45 - 180, 34, 34);
     //g.fillRect(523,325-230+15-4+240,60,34);
     g.setColor(Color.white);
     g.fillOval(540, 400 - 45 - 180, 25, 25);
     g.fillOval(570, 350 - 45 - 180, 25, 25);
     g.fillOval(510, 350 - 45 - 180, 25, 25);

     g.setColor(new Color(0, 0, 0));
     g.drawOval(540, 400 - 45 - 180, 25, 25);

     g.drawOval(570, 350 - 45 - 180, 25, 25);
     g.drawOval(510, 350 - 45 - 180, 25, 25);

     g.drawOval(593, 310 - 45 - 180, 10, 10);
     g.drawOval(563, 310 - 45 - 180, 10, 10);
     g.drawOval(533, 310 - 45 - 180, 10, 10);
     g.drawOval(503, 310 - 45 - 180, 10, 10);

     g.drawLine(560, 403 - 45 - 180, 576, 373 - 45 - 180);
     g.drawLine(545, 403 - 45 - 180, 530, 373 - 45 - 180);

     g.drawLine(586, 351 - 45 - 180, 597, 320 - 45 - 180);
     g.drawLine(580, 351 - 45 - 180, 569, 320 - 45 - 180);
     g.drawLine(526, 351 - 45 - 180, 537, 320 - 45 - 180);
     g.drawLine(520, 351 - 45 - 180, 509, 320 - 45 - 180);

     g.drawString("�", 547, 418 - 45 - 180);

     g.drawString("�", 577, 368 - 45 - 180);
     g.drawString("�", 517, 368 - 45 - 180);

     g.drawString("1", 529, 397 - 45 - 180);
     g.drawString("2", 574, 397 - 45 - 180);

     g.drawString("1", 565, 344 - 45 - 180);
     g.drawString("2", 596, 344 - 45 - 180);

     g.drawString("1", 505, 344 - 45 - 180);
     g.drawString("2", 536, 344 - 45 - 180);

     g.drawString("2", 596, 304 - 45 - 180);
     g.drawString("-1", 531, 304 - 45 - 180);
     g.drawString("-2", 560, 304 - 45 - 180);
     g.drawString("1", 505, 304 - 45 - 180);

     g.setColor(new Color(200, 0, 0));
     g.drawOval(540, 400 - 45 - 180, 25, 25);
     g.drawString("�", 547, 418 - 45 - 180);
     g.setColor(new Color(0, 0, 0));
   }
   if (st >= 6) {
     if (st == 6)
       g.setColor(new Color(0, 0, 120));

     g.setFont(new Font("Times New Roman", 1, 14));

     Stringer.drawString(
         "��  ����  ���������  ���������  ��  ��������  �_{1}  -  '������� x = 1'.",
         35, 260);
     g.setColor(new Color(200, 0, 0));
     g.drawLine(545, 403 - 45 - 180, 530, 373 - 45 - 180);
     g.drawString("1", 529, 397 - 45 - 180);
     g.setColor(new Color(0, 0, 0));
   }
   if (st >= 7) {
     if (st == 7)
       g.setColor(new Color(0, 0, 120));

     g.setFont(new Font("Times New Roman", 1, 14));

     Stringer.drawString("��� ������ �. (���  ���  ��  ��  �����  �����������  ����, ��  ��������������  ���������",
                         35, 280);
     Stringer.drawString("�������� ���.)", 15, 300);
     //Stringer.drawString("������ �.",15,180);
     g.setColor(Color.white);
     //g.fillOval(536, 396 - 45, 34, 34);
     //g.fillOval(566, 346 - 45, 34, 34);
     //g.fillOval(506, 346 - 45, 34, 34);
     //g.fillRect(523,325-230+15-4+240,60,34);
     //g.setColor(Color.white);
     //g.fillOval(540, 400 - 45, 25, 25);
     //g.fillOval(570, 350 - 45, 25, 25);
     //g.fillOval(510, 350 - 45, 25, 25);

     g.setColor(Color.LIGHT_GRAY);
     //g.drawOval(540, 400 - 45, 25, 25);

     //g.drawOval(570, 350 - 45, 25, 25);
     //g.drawOval(510, 350 - 45, 25, 25);

     //g.drawOval(593, 310 - 45, 10, 10);
     //g.drawOval(563, 310 - 45, 10, 10);
     //g.drawOval(533, 310 - 45, 10, 10);
     //g.drawOval(503, 310 - 45, 10, 10);

     g.drawLine(560, 403 - 45 - 180, 576, 373 - 45 - 180);
     //g.drawLine(545, 403 - 45, 530, 373 - 45);

     //g.drawLine(586, 351 - 45, 597, 320 - 45);
     //g.drawLine(580, 351 - 45, 569, 320 - 45);
     //g.drawLine(526, 351 - 45, 537, 320 - 45);
     //g.drawLine(520, 351 - 45, 509, 320 - 45);

     //g.drawString("�", 547, 418 - 45);

     //g.drawString("�", 577, 368 - 45);
     //g.drawString("�", 517, 368 - 45);

     //g.drawString("1", 529, 397 - 45);
     g.drawString("2", 574, 397 - 45 - 180);

     //g.drawString("1", 565, 344 - 45);
     //g.drawString("2", 596, 344 - 45);

     //g.drawString("1", 505, 344 - 45);
     //g.drawString("2", 536, 344 - 45);

     //g.drawString("2", 596, 304 - 45);
     //g.drawString("-1", 531, 304 - 45);
     //g.drawString("-2", 560, 304 - 45);
     //g.drawString("1", 505, 304 - 45);
     g.setColor(Color.LIGHT_GRAY);
     g.fillOval(536, 396 - 45 - 180, 34, 34);
     g.fillOval(566, 346 - 45 - 180, 34, 34);
     g.setColor(Color.white);
     g.fillOval(540, 400 - 45 - 180, 25, 25);
     g.fillOval(570, 350 - 45 - 180, 25, 25);
     g.setColor(new Color(200, 0, 0));
     g.drawOval(570, 350 - 45 - 180, 25, 25);
     g.drawString("�", 577, 368 - 45 - 180);
     g.drawString("�", 517, 368 - 45 - 180);
     g.drawOval(510, 350 - 45 - 180, 25, 25);
     g.drawString("�", 547, 418 - 45 - 180);
     g.drawOval(540, 400 - 45 - 180, 25, 25);
     g.drawLine(545, 403 - 45 - 180, 530, 373 - 45 - 180);
     g.setColor(new Color(0, 0, 0));
     g.drawLine(586, 351 - 45 - 180, 597, 320 - 45 - 180);
     g.drawLine(580, 351 - 45 - 180, 569, 320 - 45 - 180);

   }
   if (st >= 8) {
     if (st == 8)
       g.setColor(new Color(0, 0, 120));

     g.setFont(new Font("Times New Roman", 1, 14));

     Stringer.drawString(
         "��������, �� ���� ����� ��������� �� �������� ���������  �_{1} (�.�.  y = 1).",
         35, 320);
     g.setColor(new Color(200, 0, 0));
     g.drawLine(520, 351 - 45 - 180, 509, 320 - 45 - 180);
     g.drawString("1", 505, 344 - 45 - 180);
     g.drawLine(580, 351 - 45 - 180, 569, 320 - 45 - 180);
     g.drawString("1", 565, 344 - 45 - 180);
     g.setColor(new Color(0, 0, 0));
   }
 }
 if(st>=9 && st<=17){
     if (st >= 9) {
       if (st == 9)
         g.setColor(new Color(0, 0, 120));
       Stringer.drawString("� ���� ������ ������� ������  �  �����  1.",
                           15 + 20, 340-320);
       g.setColor(Color.LIGHT_GRAY);
     g.fillOval(536, 396 - 100 + 55 - 180, 34, 34);
     g.fillOval(566, 346 - 100 + 55 - 180, 34, 34);
     g.fillOval(506, 346 - 100 + 55 - 180, 34, 34);
     g.fillRect(523, 346 - 100 + 10 + 55 - 180, 60, 14);
     g.drawLine(560, 403 - 45 - 180, 576, 373 - 45 - 180);
     g.drawString("2", 574, 397 - 45 - 180);
     g.setColor(Color.white);
     g.fillOval(540, 400 - 100 + 55 - 180, 25, 25);
     g.fillOval(570, 350 - 100 + 55 - 180, 25, 25);
     g.fillOval(510, 350 - 100 + 55 - 180, 25, 25);




       g.setColor(Color.LIGHT_GRAY);
       g.drawOval(593, 310 - 45 - 180, 10, 10);
       g.drawOval(563, 310 - 45 - 180, 10, 10);
       g.drawOval(533, 310 - 45 - 180, 10, 10);
       g.drawLine(586, 351 - 45 - 180, 597, 320 - 45 - 180);
       g.drawLine(580, 351 - 45 - 180, 569, 320 - 45 - 180);
       g.drawLine(526, 351 - 45 - 180, 537, 320 - 45 - 180);
       g.drawString("1", 565, 344 - 45 - 180);
       g.drawString("2", 596, 344 - 45 - 180);
       g.drawString("2", 536, 344 - 45 - 180);
       g.drawString("2", 596, 304 - 45 - 180);
       g.drawString("-1", 531, 304 - 45 - 180);
       g.drawString("-2", 560, 304 - 45 - 180);

       g.setColor(new Color(200, 0, 0));
       g.drawLine(520, 351 - 45 - 180, 509, 320 - 45 - 180);
       g.drawOval(510, 350 - 45 - 180, 25, 25);
       g.drawString("�", 517, 368 - 45 - 180);
       g.drawOval(503, 310 - 45 - 180, 10, 10);
       g.drawString("1", 505, 304 - 45 - 180);
       g.drawLine(545, 403 - 45 - 180, 530, 373 - 45 - 180);
       g.drawOval(540, 400 - 45 - 180, 25, 25);
       g.drawOval(570, 350 - 45 - 180, 25, 25);
       g.drawString("�", 547, 418 - 45 - 180);
       g.drawString("�", 577, 368 - 45 - 180);
       g.drawString("1", 529, 397 - 45 - 180);
       g.drawString("1", 505, 344 - 45 - 180);
       g.setColor(new Color(0, 0, 0));

     }

     if (st >= 10) {
       if (st == 10)
         g.setColor(new Color(0, 0, 120));
       Stringer.drawString("����  ��  �����  �  ��  �����  ����  �������  ���������  �_{2}  (��  ����  y = 2),",
                           35, 360-320);
       g.setColor(new Color(0, 0, 0));
       g.drawOval(533, 310 - 45 - 180, 10, 10);
       g.drawString("-1", 531, 304 - 45 - 180);
       g.drawOval(503, 310 - 45 - 180, 10, 10);
       g.drawString("1", 505, 304 - 45 - 180);
       g.drawLine(520, 351 - 45 - 180, 509, 320 - 45 - 180);
       g.drawString("1", 505, 344 - 45 - 180);
       g.setColor(new Color(200, 0, 0));
       g.drawString("2", 536, 344 - 45 - 180);
       g.drawLine(526, 351 - 45 - 180, 537, 320 - 45 - 180);
       g.drawString("2", 596, 344 - 45 - 180);
       g.drawLine(586, 351 - 45 - 180, 597, 320 - 45 - 180);
       g.setColor(new Color(0, 0, 0));

       g.drawLine(580, 351 - 45 - 180, 569, 320 - 45 - 180);
       g.drawString("2", 596, 304 - 45 - 180);
       g.drawString("-1", 531, 304 - 45 - 180);
       g.drawString("-2", 560, 304 - 45 - 180);
       g.drawString("1", 565, 344 - 45 - 180);

       g.drawOval(593, 310 - 45 - 180, 10, 10);
       g.drawOval(563, 310 - 45 - 180, 10, 10);

     }

     if (st >= 11) {
       if (st == 11)
         g.setColor(new Color(0, 0, 120));
       Stringer.drawString("�� � ���� ������ ", 530, 360-320);
       Stringer.drawString("������� ������  �  �����  -1.", 15, 380-320);

       g.setColor(Color.LIGHT_GRAY);
       g.fillOval(506, 346 - 45 - 180, 34, 34);
       g.fillOval(566, 346 - 45 - 180, 34, 34);
       g.drawOval(593, 310 - 45 - 180, 10, 10);
       g.drawOval(563, 310 - 45 - 180, 10, 10);
       g.drawOval(503, 310 - 45 - 180, 10, 10);
       g.drawLine(586, 351 - 45 - 180, 597, 320 - 45 - 180);
       g.drawLine(580, 351 - 45 - 180, 569, 320 - 45 - 180);
       g.drawString("2", 596, 304 - 45 - 180);
       g.drawString("-2", 560, 304 - 45 - 180);
       g.drawString("1", 505, 304 - 45 - 180);
       g.drawLine(520, 351 - 45 - 180, 509, 320 - 45 - 180);
       g.drawString("1", 565, 344 - 45 - 180);
       g.drawString("2", 596, 344 - 45 - 180);
       g.drawString("1", 505, 344 - 45 - 180);

       g.setColor(Color.white);
       g.fillOval(510, 350 - 45 - 180, 25, 25);
       g.fillOval(570, 350 - 45 - 180, 25, 25);

       g.setColor(new Color(200, 0, 0));
       g.drawOval(570, 350 - 45 - 180, 25, 25);
       g.drawString("�", 577, 368 - 45 - 180);
       g.drawOval(510, 350 - 45 - 180, 25, 25);
       g.drawString("�", 517, 368 - 45 - 180);
       g.drawString("2", 536, 344 - 45 - 180);
       g.drawLine(545, 403 - 45 - 180, 530, 373 - 45 - 180);
       g.drawLine(526, 351 - 45 - 180, 537, 320 - 45 - 180);
       g.drawOval(533, 310 - 45 - 180, 10, 10);
       g.drawString("-1", 531, 304 - 45 - 180);
       g.setColor(new Color(0, 0, 0));
     }

     if (st >= 12) {
       if (st == 12)
         g.setColor(new Color(0, 0, 120));
       Stringer.drawString(
           "������ ���������� ������,  ����� �����  �  �������� ���������",
           35, 400-320);
       Stringer.drawString("�_{2}  -  '������� x = 2'.", 15, 420-320);

       g.setColor(Color.LIGHT_GRAY);
       g.fillOval(536, 396 - 45 - 180, 34, 34);
       g.fillOval(566, 346 - 45 - 180, 34, 34);
       g.fillOval(506, 346 - 45 - 180, 34, 34);
       //g.fillRect(523,325-230+15-4+240,60,34);
       g.setColor(Color.white);
       g.fillOval(540, 400 - 45 - 180, 25, 25);
       g.fillOval(570, 350 - 45 - 180, 25, 25);
       g.fillOval(510, 350 - 45 - 180, 25, 25);

       g.setColor(new Color(0, 0, 0));
       g.drawOval(540, 400 - 45 - 180, 25, 25);

       g.drawOval(570, 350 - 45 - 180, 25, 25);
       g.drawOval(510, 350 - 45 - 180, 25, 25);

       g.drawOval(593, 310 - 45 - 180, 10, 10);
       g.drawOval(563, 310 - 45 - 180, 10, 10);
       g.drawOval(533, 310 - 45 - 180, 10, 10);
       g.drawOval(503, 310 - 45 - 180, 10, 10);

       g.drawLine(560, 403 - 45 - 180, 576, 373 - 45 - 180);
       g.drawLine(545, 403 - 45 - 180, 530, 373 - 45 - 180);

       g.drawLine(586, 351 - 45 - 180, 597, 320 - 45 - 180);
       g.drawLine(580, 351 - 45 - 180, 569, 320 - 45 - 180);
       g.drawLine(526, 351 - 45 - 180, 537, 320 - 45 - 180);
       g.drawLine(520, 351 - 45 - 180, 509, 320 - 45 - 180);

       g.drawString("�", 547, 418 - 45 - 180);

       g.drawString("�", 577, 368 - 45 - 180);
       g.drawString("�", 517, 368 - 45 - 180);

       g.drawString("1", 529, 397 - 45 - 180);
       g.drawString("2", 574, 397 - 45 - 180);

       g.drawString("1", 565, 344 - 45 - 180);
       g.drawString("2", 596, 344 - 45 - 180);

       g.drawString("1", 505, 344 - 45 - 180);
       g.drawString("2", 536, 344 - 45 - 180);

       g.drawString("2", 596, 304 - 45 - 180);
       g.drawString("-1", 531, 304 - 45 - 180);
       g.drawString("-2", 560, 304 - 45 - 180);
       g.drawString("1", 505, 304 - 45 - 180);

       g.setColor(new Color(200, 0, 0));
       g.drawOval(540, 400 - 45 - 180, 25, 25);
       g.drawString("�", 547, 418 - 45 - 180);
       g.drawString("2", 574, 397 - 45 - 180);
       g.drawLine(560, 403 - 45 - 180, 576, 373 - 45 - 180);
       g.setColor(new Color(0, 0, 0));

     }
     if (st >= 13) {
       if (st == 13)
         g.setColor(new Color(0, 0, 120));
       Stringer.drawString("��� ������ �.", 35, 440-320);
       g.setColor(new Color(200, 0, 0));
       g.drawOval(570, 350 - 45 - 180, 25, 25);
       g.drawString("�", 577, 368 - 45 - 180);
       g.setColor(new Color(0, 0, 0));
       g.setColor(Color.white);
       //g.fillOval(536, 396 - 45, 34, 34);
       //g.fillOval(566, 346 - 45, 34, 34);
       //g.fillOval(506, 346 - 45, 34, 34);
       //g.fillRect(523,325-230+15-4+240,60,34);
       /*g.setColor(Color.white);
            g.fillOval(540, 400 - 45, 25, 25);
            g.fillOval(570, 350 - 45, 25, 25);
            g.fillOval(510, 350 - 45, 25, 25);*/

       g.setColor(Color.LIGHT_GRAY);
       //g.drawOval(540, 400 - 45, 25, 25);

       //g.drawOval(570, 350 - 45, 25, 25);
       //g.drawOval(510, 350 - 45, 25, 25);

       //g.drawOval(593, 310 - 45, 10, 10);
       //g.drawOval(563, 310 - 45, 10, 10);
       //g.drawOval(533, 310 - 45, 10, 10);
       //g.drawOval(503, 310 - 45, 10, 10);

       //g.drawLine(560, 403 - 45, 576, 373 - 45);
       g.drawLine(545, 403 - 45 - 180, 530, 373 - 45 - 180);

       //g.drawLine(586, 351 - 45, 597, 320 - 45);
       //g.drawLine(580, 351 - 45, 569, 320 - 45);
       //g.drawLine(526, 351 - 45, 537, 320 - 45);
       //g.drawLine(520, 351 - 45, 509, 320 - 45);

       //g.drawString("�", 547, 418 - 45);

       //g.drawString("�", 577, 368 - 45);
       //g.drawString("�", 517, 368 - 45);

       g.drawString("1", 529, 397 - 45 - 180);
       //g.drawString("2", 574, 397 - 45);

       //g.drawString("1", 565, 344 - 45);
       //g.drawString("2", 596, 344 - 45);

       //g.drawString("1", 505, 344 - 45);
       //g.drawString("2", 536, 344 - 45);

       //g.drawString("2", 596, 304 - 45);
       //g.drawString("-1", 531, 304 - 45);
       //g.drawString("-2", 560, 304 - 45);
       //g.drawString("1", 505, 304 - 45);

       g.setColor(Color.LIGHT_GRAY);
       g.fillOval(536, 396 - 45 - 180, 34, 34);
       g.fillOval(506, 346 - 45 - 180, 34, 34);
       g.setColor(Color.white);
       g.fillOval(540, 400 - 45 - 180, 25, 25);
       g.fillOval(510, 350 - 45 - 180, 25, 25);
       g.setColor(new Color(200, 0, 0));
       g.drawOval(510, 350 - 45 - 180, 25, 25);
       g.drawString("�", 517, 368 - 45 - 180);
       g.drawLine(560, 403 - 45 - 180, 576, 373 - 45 - 180);
       g.drawString("�", 547, 418 - 45 - 180);
       g.drawOval(540, 400 - 45 - 180, 25, 25);

       g.setColor(new Color(0, 0, 0));
       g.drawLine(526, 351 - 45 - 180, 537, 320 - 45 - 180);
       g.drawLine(520, 351 - 45 - 180, 509, 320 - 45 - 180);
     }



   if (st >= 14) {
     if (st == 14)
       g.setColor(new Color(0, 0, 120));
     Stringer.drawString("����� ��� ��, ��������, �� ���� ����� ��������� �����  � ",35,20+120);
     Stringer.drawString("�������� ���������  �_{1} (�.�.  y = 1).", 15,160);
     //Stringer.drawString("���  �_{3} (�.�.  y = 1).",15,320+80);
     g.setColor(Color.LIGHT_GRAY);
     g.fillOval(536, 396 - 45 - 180, 34, 34);
     g.fillOval(566, 346 - 45 - 180, 34, 34);
     g.fillOval(506, 346 - 45 - 180, 34, 34);
     g.fillRect(523, 346 - 100 + 10 + 55 - 180, 60, 14);
     g.drawLine(545, 403 - 45 - 180, 530, 373 - 45 - 180);
     g.drawString("1", 529, 397 - 45 - 180);
     g.setColor(Color.white);
     g.fillOval(540, 400 - 45 - 180, 25, 25);
     g.fillOval(570, 350 - 45 - 180, 25, 25);
     g.fillOval(510, 350 - 45 - 180, 25, 25);

     g.setColor(new Color(0, 0, 0));
     g.drawOval(540, 400 - 45 - 180, 25, 25);

     g.drawOval(570, 350 - 45 - 180, 25, 25);
     g.drawOval(510, 350 - 45 - 180, 25, 25);

     g.drawOval(593, 310 - 45 - 180, 10, 10);
     g.drawOval(563, 310 - 45 - 180, 10, 10);
     g.drawOval(533, 310 - 45 - 180, 10, 10);
     g.drawOval(503, 310 - 45 - 180, 10, 10);

     g.drawLine(560, 403 - 45 - 180, 576, 373 - 45 - 180);

     g.drawLine(586, 351 - 45 - 180, 597, 320 - 45 - 180);
     g.drawLine(580, 351 - 45 - 180, 569, 320 - 45 - 180);
     g.drawLine(526, 351 - 45 - 180, 537, 320 - 45 - 180);
     g.drawLine(520, 351 - 45 - 180, 509, 320 - 45 - 180);

     g.drawString("�", 547, 418 - 45 - 180);

     g.drawString("�", 577, 368 - 45 - 180);
     g.drawString("�", 517, 368 - 45 - 180);

     g.drawString("2", 574, 397 - 45 - 180);

     g.drawString("1", 565, 344 - 45 - 180);
     g.drawString("2", 596, 344 - 45 - 180);

     g.drawString("1", 505, 344 - 45 - 180);
     g.drawString("2", 536, 344 - 45 - 180);

     g.drawString("2", 596, 304 - 45 - 180);
     g.drawString("-1", 531, 304 - 45 - 180);
     g.drawString("-2", 560, 304 - 45 - 180);
     g.drawString("1", 505, 304 - 45 - 180);

     g.setColor(new Color(200, 0, 0));
     g.drawOval(540, 400 - 45 - 180, 25, 25);
     g.drawString("�", 547, 418 - 45 - 180);
     g.drawString("2", 574, 397 - 45 - 180);
     g.drawLine(560, 403 - 45 - 180, 576, 373 - 45 - 180);
     g.setColor(new Color(0, 0, 0));
     g.setColor(Color.LIGHT_GRAY);
     g.fillOval(536, 396 - 45 - 180, 34, 34);
     g.fillOval(506, 346 - 45 - 180, 34, 34);
     g.setColor(Color.white);
     g.fillOval(540, 400 - 45 - 180, 25, 25);
     g.fillOval(510, 350 - 45 - 180, 25, 25);
     g.setColor(new Color(200, 0, 0));
     g.drawOval(510, 350 - 45 - 180, 25, 25);
     g.drawString("�", 517, 368 - 45 - 180);
     g.drawLine(560, 403 - 45 - 180, 576, 373 - 45 - 180);
     g.drawString("�", 547, 418 - 45 - 180);
     g.drawOval(540, 400 - 45 - 180, 25, 25);
     g.drawOval(570, 350 - 45 - 180, 25, 25);
     g.drawString("�", 577, 368 - 45 - 180);
     g.setColor(new Color(0, 0, 0));
     g.drawLine(526, 351 - 45 - 180, 537, 320 - 45 - 180);
     g.drawLine(520, 351 - 45 - 180, 509, 320 - 45 - 180);

     g.setColor(new Color(200, 0, 0));
     g.drawLine(520, 351 - 45 - 180, 509, 320 - 45 - 180);
     g.drawString("1", 505, 344 - 45 - 180);
     g.drawLine(580, 351 - 45 - 180, 569, 320 - 45 - 180);
     g.drawString("1", 565, 344 - 45 - 180);
     g.setColor(new Color(0, 0, 0));
   }

   if (st >= 15) {
     if (st == 15)
       g.setColor(new Color(0, 0, 120));
     Stringer.drawString("� ���� ������ ������� ������  �  �����  -2.", 35,
                         40+140);
     g.setColor(Color.white);
     g.drawLine(526, 351 - 45-180, 537, 320 - 45-180);
     g.drawLine(520, 351 - 45-180, 509, 320 - 45-180);
     g.drawOval(533, 310 - 45-180, 10, 10);
     g.drawOval(503, 310 - 45-180, 10, 10);
     g.drawString("-1", 531, 304 - 45-180);
     g.drawString("1", 505, 304 - 45-180);
     g.drawString("1", 505, 344 - 45-180);
     g.drawString("2", 536, 344 - 45-180);

     g.drawLine(586, 351 - 45-180, 597, 320 - 45-180);
     g.drawOval(593, 310 - 45-180, 10, 10);
     g.drawString("2", 596, 304 - 45-180);
     g.drawString("2", 596, 344 - 45-180);
     g.setColor(Color.LIGHT_GRAY);
     g.fillOval(566, 346 - 45-180, 34, 34);
     g.fillOval(506, 346 - 45-180, 34, 34);
     g.drawOval(593, 310 - 45 - 180, 10, 10);
     g.drawOval(533, 310 - 45 - 180, 10, 10);
     g.drawOval(503, 310 - 45 - 180, 10, 10);
     g.drawLine(586, 351 - 45 - 180, 597, 320 - 45 - 180);
     g.drawLine(526, 351 - 45 - 180, 537, 320 - 45 - 180);
     g.drawLine(520, 351 - 45 - 180, 509, 320 - 45 - 180);
     g.drawString("2", 596, 344 - 45 - 180);
     g.drawString("1", 505, 344 - 45 - 180);
     g.drawString("2", 536, 344 - 45 - 180);

     g.drawString("2", 596, 304 - 45 - 180);
     g.drawString("-1", 531, 304 - 45 - 180);
     g.drawString("1", 505, 304 - 45 - 180);
     g.setColor(Color.white);
     g.fillOval(570, 350 - 45-180, 25, 25);
     g.fillOval(510, 350 - 45-180, 25, 25);
     g.setColor(new Color(200, 0, 0));
     g.drawString("�", 517, 368 - 45-180);
     g.drawOval(510, 350 - 45-180, 25, 25);
     g.drawOval(570, 350 - 45-180, 25, 25);
     g.drawString("�", 577, 368 - 45-180);
     g.drawOval(563, 310 - 45-180, 10, 10);
     g.drawString("-2", 560, 304 - 45-180);
     g.drawLine(580, 351 - 45-180, 569, 320 - 45-180);
     g.drawString("1", 565, 344 - 45-180);
     g.drawLine(560, 403 - 45-180, 576, 373 - 45-180);
     g.setColor(new Color(0, 0, 0));
   }
   if (st >= 16) {
     if (st == 16)
       g.setColor(new Color(0, 0, 120));
     Stringer.drawString("����   ��  �����   �   �������  ���������   �_{2}  (�.�.  y = 2),",
                         35, 60+140);
     g.setColor(new Color(0, 0, 0));

     g.drawString("-1", 531, 304 - 45-180);

     g.drawString("1", 505, 304 - 45-180);
     g.drawString("1", 505, 344 - 45-180);
     g.drawOval(533, 310 - 45-180, 10, 10);
     g.drawOval(503, 310 - 45-180, 10, 10);
     g.drawString("2", 596, 304 - 45-180);
     g.drawLine(520, 351 - 45-180, 509, 320 - 45-180);
     g.drawLine(586, 351 - 45-180, 597, 320 - 45-180);
     g.drawOval(593, 310 - 45-180, 10, 10);
     g.drawOval(563, 310 - 45-180, 10, 10);
     g.drawString("-2", 560, 304 - 45-180);
     g.drawLine(580, 351 - 45-180, 569, 320 - 45-180);
     g.drawString("1", 565, 344 - 45-180);
     g.setColor(new Color(200, 0, 0));

     g.drawString("2", 536, 344 - 45-180);
     g.drawLine(526, 351 - 45-180, 537, 320 - 45-180);
     g.drawLine(586, 351 - 45-180, 597, 320 - 45-180);
     g.drawString("2", 596, 344 - 45-180);
     g.setColor(new Color(0, 0, 0));
   }
   if (st >= 17) {
     if (st == 17)
       g.setColor(new Color(0, 0, 120));
     Stringer.drawString("�� � ����", 415, 60+140);
     Stringer.drawString("������  �������  ������  �  �����  2.", 15, 80+140);
     g.setColor(Color.LIGHT_GRAY);
     g.drawString("-1", 531, 304 - 45-180);
     g.drawString("1", 505, 304 - 45-180);
     g.drawString("1", 505, 344 - 45-180);
     g.drawOval(533, 310 - 45-180, 10, 10);
     g.drawOval(503, 310 - 45-180, 10, 10);
     g.drawLine(520, 351 - 45-180, 509, 320 - 45-180);
     g.drawLine(526, 351 - 45-180, 537, 320 - 45-180);
     g.drawString("2", 536, 344 - 45-180);
     g.drawOval(563, 310 - 45-180, 10, 10);
     g.drawString("-2", 560, 304 - 45-180);
     g.drawLine(580, 351 - 45-180, 569, 320 - 45-180);
     g.drawString("1", 565, 344 - 45-180);
     g.setColor(Color.LIGHT_GRAY);
     g.fillOval(566, 346 - 45-180, 34, 34);
     g.fillOval(506, 346 - 45-180, 34, 34);
     g.setColor(Color.white);
     g.fillOval(570, 350 - 45-180, 25, 25);
     g.fillOval(510, 350 - 45-180, 25, 25);
     g.setColor(new Color(200, 0, 0));
     g.drawOval(510, 350 - 45-180, 25, 25);
     g.drawString("�", 517, 368 - 45-180);
     g.drawOval(570, 350 - 45-180, 25, 25);
     g.drawString("�", 577, 368 - 45-180);
     g.drawLine(586, 351 - 45-180, 597, 320 - 45-180);
     g.drawString("2", 596, 344 - 45-180);
     g.drawOval(593, 310 - 45-180, 10, 10);
     g.drawString("2", 596, 304 - 45-180);
     g.drawLine(560, 403 - 45-180, 576, 373 - 45-180);
     g.setColor(new Color(0, 0, 0));
   }
 }

 if(st>=18 && st<=20){
   if (st >= 18) {
     if (st == 18)
       g.setColor(new Color(0, 0, 120));
     g.drawString("��������������� ������� ��������� ������ � ����� ���:",35, 100-80);
     /*g.setColor(Color.LIGHT_GRAY);
     g.fillOval(536, 396 - 45-180-80, 34, 34);
     g.fillOval(566, 346 - 45-180-80, 34, 34);
     g.fillOval(506, 346 - 45-180-80, 34, 34);
     g.fillRect(523,346-35-180-80,60,14);
     g.setColor(Color.white);
     g.fillOval(540, 400 - 45-180-80, 25, 25);
     g.fillOval(570, 350 - 45-180-80, 25, 25);
     g.fillOval(510, 350 - 45-180-80, 25, 25);

     g.setColor(new Color(0, 0, 0));
     g.drawOval(540, 400 - 45-180, 25, 25);

     g.drawOval(570, 350 - 45-180, 25, 25);
     g.drawOval(510, 350 - 45-180, 25, 25);

     g.drawOval(593, 310 - 45-180, 10, 10);
     g.drawOval(563, 310 - 45-180, 10, 10);
     g.drawOval(533, 310 - 45-180, 10, 10);
     g.drawOval(503, 310 - 45-180, 10, 10);

     g.drawLine(560, 403 - 45-180, 576, 373 - 45-180);
     g.drawLine(545, 403 - 45-180, 530, 373 - 45-180);

     g.drawLine(586, 351 - 45-180, 597, 320 - 45-180);
     g.drawLine(580, 351 - 45-180, 569, 320 - 45-180);
     g.drawLine(526, 351 - 45-180, 537, 320 - 45-180);
     g.drawLine(520, 351 - 45-180, 509, 320 - 45-180);

     g.drawString("�", 547, 418 - 45-180);
     g.drawString("�", 577, 368 - 45-180);
     g.drawString("�", 517, 368 - 45-180);

     g.drawString("1", 529, 397 - 45-180);
     g.drawString("2", 574, 397 - 45-180);

     g.drawString("1", 565, 344 - 45-180);
     g.drawString("2", 596, 344 - 45-180);

     g.drawString("1", 505, 344 - 45-180);
     g.drawString("2", 536, 344 - 45-180);

     g.drawString("2", 596, 304 - 45-180);
     g.drawString("-1", 531, 304 - 45-180);
     g.drawString("-2", 560, 304 - 45-180);
     g.drawString("1", 505, 304 - 45-180);*/


     g.setColor(new Color(0, 0, 0));
     ////�������
     g.drawRect(10 + 120+120, 400-125-100-100, 155, 40);
     g.drawLine(10 + 120+120, 420-125-100-100, 165 + 120+120, 420-125-100-100);
     g.drawLine(65 + 120+120, 360-125-100-100, 165 + 120+120, 360-125-100-100);
     g.drawLine(65 + 120+120, 380-125-100-100, 165 + 120+120, 380-125-100-100);
     g.drawLine(30 + 120+120, 400-125-100-100, 30 + 120+120, 440-125-100-100);
     g.drawLine(65 + 120+120, 360-125-100-100, 65 + 120+120, 440-125-100-100);
     g.drawLine(115 + 120+120, 360-125-100-100, 115 + 120+120, 440-125-100-100);
     g.drawLine(165 + 120+120, 360-125-100-100, 165 + 120+120, 440-125-100-100);

     Stringer.drawString("�_{1}", 14 + 120+120, 414-125-100-100);
     Stringer.drawString("�_{2}", 14 + 120+120, 434-125-100-100);
     Stringer.drawString("x = 1", 34 + 120+120, 415-125-100-100);
     Stringer.drawString("x = 2", 34 + 120+120, 435-125-100-100);
     Stringer.drawString("     1", 68 + 120+120, 415-125-100-100);
     Stringer.drawString("    -2", 68 + 120+120, 435-125-100-100);
     Stringer.drawString("    -1", 118 + 120+120, 415-125-100-100);
     Stringer.drawString("     2", 118 + 120+120, 435-125-100-100);

     Stringer.drawString("y = 1", 75 + 120+120, 395-125-100-100);
     Stringer.drawString("y = 2", 125 + 120+120, 395-125-100-100);

     Stringer.drawString("�_{1}", 85 + 120+120, 374-125-100-100);
     Stringer.drawString("�_{2}", 135 + 120+120, 374-125-100-100);





   }
   if(st>=19){
     if(st==19)
       g.setColor(new Color(0, 0, 120));
     g.setFont(new Font("Times New Roman", 1, 14));
     g.drawString("��������������� ������� ���� ����� ���:",35, 260-100);
     //////�������
     g.setColor(new Color(0, 0, 0));
     g.drawArc(365-170+100, 380-30-60-110, 15, 45, 100, 160);
     g.drawArc(415-170+100, 379-30-60-110, 15, 45, 280, 160);
     g.setFont(new Font("Times New Roman", 1, 14));
     g.drawString("  1     -1", 30 + 50  + 120+100, 400-30-60-110);
     g.drawString(" -2      2", 30 + 50  + 120+100, 420-30-60-110);


   }
   if (st >= 20) {
       if (st == 20)
         g.setColor(new Color(0, 0, 120));
       g.drawString("���������� ������� �������� ����� �� �����. ����������� ��������� ��������� �������:",35, 380-120);
       g.drawString("                                                   P = { -,  - }  �  Q = { -, - }.",15+30, 410-120);
       g.drawString("����  ����  v = 0.", 35, 440-120);
       g.setFont(new Font("Times New Roman", 1, 11));
       g.drawString("2    1                       1  1", 252+30, 405-120);
       g.drawString("3    3                       2  2", 252+30, 416-120);
     }

 }


///////////////////////////////////////////////////////////////////////////////////////////////////////////////
 if (st >= 510 && st <= 570) {
   if (st >= 51) {
     if (st == 51)
       g.setColor(new Color(0, 0, 120));
     g.setFont(new Font("Times New Roman", 1, 14));
     g.drawString("����������  ����  �������  ��  �����������  ����  ���������  ���������  ����  �  ����,", 35, 20);
     g.drawString("����� �������, ������ ����������� ����������� ���. ", 15, 40);
   }

         if (st >= 52) {
       if (st == 52)
         g.setColor(new Color(0, 0, 120));
       g.setFont(new Font("Times New Roman", 1, 14));
       g.drawString("����������  ������  ���������  ��������  ��������  �  ���������  �����  �����������  ���,",
                    35, 60);
       g.drawString("���������  ��  ����  �����,  ������������  ���  ����  ��������  ��������  ��  �����  ��  ��������",
                    15, 80);
       g.drawString(
           "������������� ����� ������������ - �������� ��������� �������.",
           15, 100);
     }
     if (st >= 53) {
       if (st == 53)
         g.setColor(new Color(0, 0, 120));
       g.setFont(new Font("Times New Roman", 3, 15));
       g.drawString("������ 3:", 15, 120);
       g.setFont(new Font("Times New Roman", 1, 14));
       g.drawString("1-� ��� ������ ����� �:  ��  ��������  �����  x", 90,
                    120);
       g.drawString("��  ���������  ����  �����  {1, 2}.", 15, 140);

       g.setColor(Color.LIGHT_GRAY);
       g.fillOval(496, 415 - 155 - 4, 34, 34);
       g.setColor(Color.white);
       g.fillOval(500, 415 - 155, 25, 25);

       g.setColor(new Color(0, 0, 0));
       g.drawOval(500, 415 - 155, 25, 25);

       g.drawOval(560, 375 - 155, 25, 25);
       g.drawOval(440, 375 - 155, 25, 25);

       g.drawOval(590, 325 - 155, 25, 25);
       g.drawOval(530, 325 - 155, 25, 25);
       g.drawOval(470, 325 - 155, 25, 25);
       g.drawOval(410, 325 - 155, 25, 25);

       g.drawOval(613, 285 - 155, 10, 10);
       g.drawOval(583, 285 - 155, 10, 10);

       g.drawOval(553, 285 - 155, 10, 10);
       g.drawOval(523, 285 - 155, 10, 10);

       g.drawOval(493, 285 - 155, 10, 10);
       g.drawOval(463, 285 - 155, 10, 10);

       g.drawOval(433, 285 - 155, 10, 10);
       g.drawOval(403, 285 - 155, 10, 10);

       g.drawLine(523, 421 - 155, 562, 394 - 155);
       g.drawLine(502, 421 - 155, 464, 394 - 155);

       g.drawLine(580, 378 - 155, 596, 348 - 155);
       g.drawLine(565, 378 - 155, 550, 348 - 155);

       g.drawLine(460, 378 - 155, 476, 348 - 155);
       g.drawLine(445, 378 - 155, 430, 348 - 155);

       g.drawLine(606, 326 - 155, 617, 295 - 155);
       g.drawLine(600, 326 - 155, 589, 295 - 155);

       //2
       g.drawLine(546, 326 - 155, 557, 295 - 155);
       g.drawLine(540, 326 - 155, 529, 295 - 155);
       //3
       g.drawLine(486, 326 - 155, 497, 295 - 155);
       g.drawLine(480, 326 - 155, 469, 295 - 155);
       //4
       g.drawLine(426, 326 - 155, 437, 295 - 155);
       g.drawLine(420, 326 - 155, 409, 295 - 155);

       g.drawString("A", 507, 433 - 155);

       g.drawString("B", 447, 393 - 155);
       g.drawString("B", 567, 393 - 155);

       g.drawString("A", 417, 343 - 155);
       g.drawString("A", 477, 343 - 155);
       g.drawString("A", 597, 343 - 155);
       g.drawString("A", 537, 343 - 155);

       g.drawString("1", 477, 421 - 155);
       g.drawString("2", 548, 421 - 155);

       g.drawString("1", 429, 372 - 155);
       g.drawString("2", 474, 372 - 155);
       g.drawString("1", 549, 372 - 155);
       g.drawString("2", 594, 372 - 155);

       g.drawString("1", 585, 319 - 155);
       g.drawString("2", 616, 319 - 155);

       g.drawString("1", 525, 319 - 155);
       g.drawString("2", 556, 319 - 155);

       g.drawString("1", 465, 319 - 155);
       g.drawString("2", 496, 319 - 155);

       g.drawString("1", 405, 319 - 155);
       g.drawString("2", 436, 319 - 155);

     }
     if (st >= 54) {
       if (st == 54)
         g.setColor(new Color(0, 0, 120));
       g.setFont(new Font("Times New Roman", 3, 15));
       g.drawString("������ 3:", 15, 120);
       g.setFont(new Font("Times New Roman", 1, 14));
       g.drawString("2-� ��� ������ ����� �: ���� ��������� ������� �", 15,
                    160);
       g.drawString("����� x, �� �������� �����  y  �� ��������� ����", 15,
                    180);
       g.drawString("����� {1, 2}.", 15, 200);

       g.setColor(Color.LIGHT_GRAY);
       g.fillOval(556, 375 - 155 - 4, 34, 34);
       g.fillOval(436, 375 - 155 - 4, 34, 34);
       g.setColor(Color.white);
       g.fillOval(560, 375 - 155, 25, 25);
       g.fillOval(440, 375 - 155, 25, 25);
       g.setColor(new Color(0, 0, 0));
       g.drawOval(560, 375 - 155, 25, 25);
       g.drawOval(440, 375 - 155, 25, 25);
       g.drawLine(523, 421 - 155, 562, 394 - 155);
       g.drawLine(502, 421 - 155, 464, 394 - 155);

       g.drawString("B", 447, 393 - 155);
       g.drawString("B", 567, 393 - 155);

       g.drawLine(580, 378 - 155, 596, 348 - 155);
       g.drawLine(565, 378 - 155, 550, 348 - 155);

       g.drawLine(460, 378 - 155, 476, 348 - 155);
       g.drawLine(445, 378 - 155, 430, 348 - 155);

     }
     if (st >= 55) {
       if (st == 55)
         g.setColor(new Color(0, 0, 120));
       g.setFont(new Font("Times New Roman", 3, 15));
       g.drawString("������ 3:", 15, 120);
       g.setFont(new Font("Times New Roman", 1, 14));
       g.drawString("3-�  ���  ������  �����  �:  ��  ����  �  ���������",
                    15, 220);
       g.drawString("������� � �����  y  �� 2-� ����  �  ����� ���������",
                    15, 240);
       g.drawString("�� ����� �� 1-� ���� ����� x, �� �������� �����  z",
                    15, 260);
       g.drawString("�� ��������� ���� ����� {1, 2}.", 15, 280);

       g.setColor(Color.LIGHT_GRAY);
       g.fillOval(586, 325 - 155 - 4, 34, 34);
       g.fillOval(526, 325 - 155 - 4, 34, 34);
       g.fillOval(466, 325 - 155 - 4, 34, 34);
       g.fillOval(406, 325 - 155 - 4, 34, 34);
       g.fillRect(423, 325 - 155 - 4 + 10, 180, 14);

       g.setColor(Color.white);
       g.fillOval(590, 325 - 155, 25, 25);
       g.fillOval(530, 325 - 155, 25, 25);
       g.fillOval(470, 325 - 155, 25, 25);
       g.fillOval(410, 325 - 155, 25, 25);

       g.setColor(new Color(0, 0, 0));
       g.drawOval(590, 325 - 155, 25, 25);
       g.drawOval(530, 325 - 155, 25, 25);
       g.drawOval(470, 325 - 155, 25, 25);
       g.drawOval(410, 325 - 155, 25, 25);
       g.drawLine(580, 378 - 155, 596, 348 - 155);
       g.drawLine(565, 378 - 155, 550, 348 - 155);

       g.drawLine(460, 378 - 155, 476, 348 - 155);
       g.drawLine(445, 378 - 155, 430, 348 - 155);

       g.drawLine(606, 326 - 155, 617, 295 - 155);
       g.drawLine(600, 326 - 155, 589, 295 - 155);

       //2
       g.drawLine(546, 326 - 155, 557, 295 - 155);
       g.drawLine(540, 326 - 155, 529, 295 - 155);
       //3
       g.drawLine(486, 326 - 155, 497, 295 - 155);
       g.drawLine(480, 326 - 155, 469, 295 - 155);
       //4
       g.drawLine(426, 326 - 155, 437, 295 - 155);
       g.drawLine(420, 326 - 155, 409, 295 - 155);

       g.drawString("A", 417, 343 - 155);
       g.drawString("A", 477, 343 - 155);
       g.drawString("A", 597, 343 - 155);
       g.drawString("A", 537, 343 - 155);

     }
     if (st >= 56) {
       if (st == 56)
         g.setColor(new Color(0, 0, 120));
       g.setFont(new Font("Times New Roman", 3, 15));
       g.drawString("������ 3:", 15, 120);
       g.setFont(new Font("Times New Roman", 1, 14));
       g.drawString(
           "����� ����� ����� � �������� �������������� W(x, y, z)", 15,
           300);
       g.drawString("�� ���� ������ �, �������� �����:", 15, 320);
       g.drawString(
           "             W(1, 1, 1) = -2,              W(2, 1, 1) =  3",
           15, 350);
       g.drawString(
           "             W(1, 1, 2) =  4,              W(2, 1, 2) =  0",
           15, 370);
       g.drawString(
           "             W(1, 2, 1) =  1,              W(2, 2, 1) = -3",
           15, 390);
       g.drawString(
           "             W(1, 2, 2) = -4,              W(2, 2, 2) =  5",
           15, 410);
     }
     if (st >= 57) {
       if (st == 57)
         g.setColor(new Color(0, 0, 120));
       g.setFont(new Font("Times New Roman", 3, 15));
       g.drawString("������ 3:", 15, 120);
       g.setFont(new Font("Times New Roman", 1, 14));
       g.drawString(
           "�� ������� �������� ������ ���� � �������������� ���������.",
           35, 440);

     }
   }
   if (st >= 580 && st <= 630) {
     if (st >= 58) {
       if (st == 58)
         g.setColor(new Color(0, 0, 120));
       g.drawString("����������� ��� ����.", 35, 20);
     }
     if (st >= 59) {
       if (st == 59)
         g.setColor(new Color(0, 0, 120));
       g.drawString("��������� ������  �  ����� ������  �  �� 1-� ����  ��������,  ��  �  ������  �  -  4  ���������:",
                    35, 40);
       Stringer.drawString(
           "B_{1} - [1, 1],    B_{2} - [1, 2],    B_{3} - [2, 1],    B_{4} - [2, 2].",
           180, 60);
     }
     if (st >= 60) {
       if (st == 60)
         g.setColor(new Color(0, 0, 120));
       g.drawString("�����  �  �� 3-� ���� �� ����� ���������� ������� - �� ��������  x, �� ��������  y. �������",
                    35, 80);
       g.drawString("������  ���  ���������  �������  ������  ��  ����  �����  (x, z),  ���  x (x = 1, 2)  -  ������������,",
                    15, 100);
       g.drawString("���������� �������  �  ��  1-�  ����, �  z (z = 1, 2) - ������������, ���������� �������  �  ��",
                    15, 120);
       g.drawString("3-� ����.", 15, 140);
     }
     if (st >= 61) {
       if (st == 61)
         g.setColor(new Color(0, 0, 120));
       g.drawString("��������, ����� �������  �  ��������� (2, 1) ��������, ��� ��  1-�  ����  ��  �������� x = 2,",
                    35, 160);
       g.drawString("� ��  3-�  ����  -  z = 1.", 15, 180);
       g.drawString("����� ������� � ������  �  ������ ���������:", 165,
                    180);
       Stringer.drawString(
           "�_{1} - (1, 1),    �_{2} - (1, 2),    �_{3} - (2, 1),    �_{4} - (2, 2).",
           180, 200);
     }

     if (st >= 62) {
       if (st == 62)
         g.setColor(new Color(0, 0, 120));
       Stringer.drawString("�����, ��������, �����  �  ������ ��������� A_{2}  -  (1, 2), � �����  �  -  ���������  �_{3}  -  [2, 1].",
                           35, 220);
       g.drawString("�����  x = 1,  ������ ��������, ���  y = 2.  ��������  z = 2  ������� �������  �  ����������  ��",
                    15, 240);
       g.drawString("������ ������  �.  �������� �������� ������� ��������� ��� ����� ������, ��������:",
                    15, 260);
       g.drawString("W (x, y, z) = W (1, 2, 2) = -4.", 250, 280);
     }
     if (st >= 63) {
       if (st == 63)
         g.setColor(new Color(0, 0, 120));
       g.drawString("������� ��������� 15 ���������, ������ ������� ��������� ������  �  � ������� ����.",
                    35, 300);
       g.setColor(new Color(0, 0, 0));

       g.drawRect(10, 360, 295, 80);
       g.drawLine(10, 420, 305, 420);
       //g.drawLine(65+120,360,305+120,360);
       g.drawLine(10, 400, 305, 400);
       g.drawLine(10, 380, 305, 380);
       g.drawLine(30, 360, 30, 440);
       g.drawLine(65, 320, 305, 320);
       g.drawLine(65, 340, 305, 340);
       g.drawLine(65, 320, 65, 440);
       g.drawLine(125, 320, 125, 440);
       g.drawLine(185, 320, 185, 440);
       g.drawLine(245, 320, 245, 440);
       g.drawLine(305, 320, 305, 440);

       Stringer.drawString("�_{1}", 14, 374);
       Stringer.drawString("�_{2}", 14, 394);
       Stringer.drawString("�_{3}", 14, 414);
       Stringer.drawString("�_{4}", 14, 434);
       Stringer.drawString("(1, 1)", 32, 375);
       Stringer.drawString("(1, 2)", 32, 395);
       Stringer.drawString("(2, 1)", 32, 415);
       Stringer.drawString("(2, 2)", 32, 435);

       g.setFont(new Font("Times New Roman", 1, 12));
       g.drawString("W (1, 1, 1)", 70, 375);
       g.drawString("W (1, 1, 2)", 70, 395);
       g.drawString("W (1, 1, 1)", 130, 375);
       g.drawString("W (1, 1, 2)", 130, 395);
       g.drawString("W (1, 2, 1)", 190, 375);
       g.drawString("W (1, 2, 2)", 190, 395);
       g.drawString("W (1, 2, 1)", 250, 375);
       g.drawString("W (1, 2, 2)", 250, 395);

       g.drawString("W (2, 1, 1)", 70, 415);
       g.drawString("W (2, 1, 2)", 70, 435);
       g.drawString("W (2, 2, 1)", 130, 415);
       g.drawString("W (2, 2, 2)", 130, 435);
       g.drawString("W (2, 1, 1)", 190, 415);
       g.drawString("W (2, 1, 2)", 190, 435);
       g.drawString("W (2, 2, 1)", 250, 415);
       g.drawString("W (2, 2, 2)", 250, 435);
       g.setFont(new Font("Times New Roman", 1, 14));

       Stringer.drawString("[1, 1]", 80, 355);
       Stringer.drawString("[1, 2]", 140, 355);
       Stringer.drawString("[2, 1]", 200, 355);
       Stringer.drawString("[2, 2]", 260, 355);

       Stringer.drawString("�_{1}", 90, 334);
       Stringer.drawString("�_{2}", 150, 334);
       Stringer.drawString("�_{3}", 210, 334);
       Stringer.drawString("�_{4}", 270, 334);

       //////�������
       g.drawArc(365 + 40 + 30, 380 - 50, 30, 90, 100, 160);
       g.drawArc(415 + 50 + 40 + 30, 379 - 50, 30, 90, 280, 160);
       g.setFont(new Font("Times New Roman", 1, 14));
       g.drawString(" -2     -2      1      1", 370 + 40 + 30, 400 - 50);
       g.drawString("  4      4     -4     -4", 370 + 40 + 30, 420 - 50);
       g.drawString("  3     -3      3     -3", 370 + 40 + 30, 440 - 50);
       g.drawString("  0      5      0      5", 370 + 40 + 30, 460 - 50);

     }
   }







          /* if (pr==0){
        Stringer.drawString("������ �� ���� ������� ����� ���������� ���� �������.  ������ �������� � ���������� ���������.  � ",10,15);
        Stringer.drawString("������ t=0 ������ ���������� ������ ���� �� �����, ",10,30);
         }
         if (pr==1){
       Stringer.drawString("Each of two players can make one shot. The players converge with constant speed. At the moment t=0 the players",10,15);
       Stringer.drawString("it is enough far apart, ",10,30);
        }*/

        /*if (st>0){
          if (pr==0)
          Stringer.drawString(" � � ������ t=1 �������� ��������.",315,30);
          if (pr==1)
          Stringer.drawString(" and at the moment t=1 converge closely.",135,30);
        }
        if (st>1){
          if (pr==0){
          Stringer.drawString("  ������ ",525,30);
          Stringer.drawString("�������������� ������� \u03b1_{i} �� ������� [0,1], ���������� �������� ������ i, i=1,2.",10,45);
          }
          if (pr==1){
         Stringer.drawString("  The valid function \u03b1_{i} on a piece is given [0,1],",525-155,30);
         Stringer.drawString("which measures accuracy of the player i, i=1,2.",10,45);
         }

      //  Stringer.drawString("������� (������ 1) ����� +1, ���� ������ ����� �������� ������� �� ����, ��� ��� ����� �������;",10,105);
    }
        if (st>2){
           if (pr==0){
        Stringer.drawString(" �������� \u03b1_{i}(t) ����",490,45);
        Stringer.drawString("����������� ����, ��� ����� i ������� ������ j, ���� ����� �������� � ������ t. �����������, ��� \u03b1_{i} �� ",10,60);
        Stringer.drawString("�������, ���������� � ������������� ������� �������� \u03b1_{i}(0)=0 � \u03b1_{i}(1)=1. ",10,75);
        }
          if (pr==1){
          Stringer.drawString(" The meaning  \u03b1_{i} (t) is probability that the player i will amaze the",490-208,45);
          Stringer.drawString("player j, if will shoot at the moment t. Let's assume, that \u03b1_{i} does not decrease, is continuous and satisfies to",10,60);
          Stringer.drawString("regional conditions \u03b1_{i} (0)=0 and \u03b1_{i} (1)=1.  ",10,75);
          }

      }
        if (st>3){
          if (pr==0)
        Stringer.drawString("������� (������ 1) ����� +1, ���� ������ ����� �������� ������� �� ����, ��� ��� ����� �������;",10,90);
          if (pr==1)
        Stringer.drawString("The prize (player 1) is equal +1, if the first player amazes second, how itself will be struck;",10,90);
        }
        if (st>4){
      //  Stringer.drawString(" -1 � ",600,90);
       if (pr==0)
        Stringer.drawString("-1 � ������������ ������ ",10,105);
      if (pr==1)
      //  Stringer.drawString("-1 in a symmetric case ",10,105);
         Stringer.drawString("-1 in a symmetric case ",490+30,90);
      }
        if (st>5){
          if (pr==0)
        Stringer.drawString(" � 0, ���� �� ���� �� �������, ���� ��� �������� ������������.",165,105);
      if (pr==1)
        Stringer.drawString(" and 0, if any is not struck, or both are struck simultaneously.",10,105);
    }*/

}}

  class  Panel_paint2 extends JPanel {
      public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setFont(new Font("Dialog", 1, 12));
         Stringer.setGraphics(g);
  //______________ ___________________�������________________________________________________


 //  g.setColor(new Color(160,10, 40));
 //   else
   //      g.setColor(Color.DARK_GRAY);

   if(st==0){
      g.setColor(Color.DARK_GRAY);
   g.drawArc(100-40,124,12,12,360,360);
   g.drawLine(106-40,136,106-40,126+20);
   g.drawLine(106-40,146,103-40,158);
   g.drawLine(106-40,146,109-40,158);
   g.drawLine(106-40,138,102-40,144);
   g.drawLine(106-40,138,112-40,138);
g.fillRect(128,154,4,6);

    g.drawLine(111-40,140,112-40,136);
    g.drawLine(110-40,140,111-40,136);
    g.drawLine(112-40,137,120-40,137);
    g.drawLine(112-40,136,120-40,136);

g.setColor(ColorText);
 Stringer.drawString("t = 0",148,50);

g.fillRect(99-40,127-3,6+8,3);
g.fillRect(101-40,120-3,4+6,9);
 }
       if(st==1){
          g.setColor(Color.DARK_GRAY);
  g.drawArc(100+10,124,12,12,360,360);
  g.drawLine(106+10,136,106+10,126+20);
  g.drawLine(106+10,146,103+10,158);
  g.drawLine(106+10,146,109+10,158);
  g.drawLine(106+10,138,102+10,144);
  g.drawLine(106+10,138,112+10,138);

  g.drawLine(111+10,140,112+10,136);
  g.drawLine(110+10,140,111+10,136);
  g.drawLine(112+10,137,120+10,137);
  g.drawLine(112+10,136,120+10,136);

  g.fillRect(128,154,4,6);

 g.fillRect(99+10,127-3,6+8,3);
g.fillRect(101+10,120-3,4+6,9);
  g.setColor(ColorText);
  Stringer.drawString("t = 1",148,50);
}
       if(st==2 || st==3 || st==4 || st==8  || st==10 || st==12 || st==13 || st==14){
   g.setColor(Color.DARK_GRAY);
   if(st==2){
      if (pr==0)
  Stringer.drawString("����� 1",100-10,110);
      if (pr==1)
  Stringer.drawString("player 1",100-10,110);
}
    if(st==3)
      Stringer.drawString("\u03b1_{1}(t) = 1",110-20,110);
      if(st==4)
        Stringer.drawString("+ 1",115-15,115);
         g.drawArc(100,124,12,12,360,360);
  g.drawLine(106,136,106,126+20);
  g.drawLine(106,146,103,158);
  g.drawLine(106,146,109,158);
  g.drawLine(106,138,102,144);
  g.drawLine(106,138,112,138);

  g.fillRect(99,127-3,6+8,3);
  g.fillRect(101,120-3,4+6,9);

g.fillRect(128,154,4,6);
  g.drawLine(111,140,112,136);
  g.drawLine(110,140,111,136);
  g.drawLine(112,137,112+8,137);
  g.drawLine(112,136,112+8,136);
  ///////////////////////////////////////////////
  if(st!=2){
     g.setColor(Color.blue);
  g.drawLine(123,135,121,134);
  g.drawLine(121,134,123,133);
  g.drawLine(123,133,121,132);
  g.drawLine(121,132,123,131);
  g.drawLine(123,131,123,129);}
///////////////////////////////////////////////////

  if (st==8){
    g.setColor(ColorText);
    Stringer.drawString("t = x_{i}",148,50);
  }
  if( st==10)
  {g.setColor(Color.DARK_GRAY);
    Stringer.drawString("+ 1",115-15,91);
  Stringer.drawString("\u03b1_{1} (x_{1})(1 - \u03b1_{2} (x_{1}))",75-15,110);
  }
}
      if(st==5 || st==6 || st==11 || st==15){
         g.setColor(Color.DARK_GRAY);
       if(st==5)
         Stringer.drawString("- 1",85,115);
       if(st==6)
         {Stringer.drawString("0",90,77);
        Stringer.drawString("0",90,87+50);}

        g.fillRect(128,154,4,6);
 g.drawArc(90-20,146+2,12,9,360,360);
 g.drawLine(102-20,152+2,110-20,152+2);
 g.drawLine(110-20,152+2,132-20,151+2);
 g.drawLine(110-20,152+2,132-20,154+2);
 g.drawLine(104-20,152+2,114-20,150+2);
 g.drawLine(104-20,152+2,114-20,155+2);

 g.fillRect(99-10-20,123-3+27,3,4+8);
 g.fillRect(91-10-20,125-3+27,9,2+6);


 g.setColor(Color.red);
 g.fillArc(107-20,153,4,4,360,360);
 g.setColor(Color.DARK_GRAY);
 if (st==11){
   Stringer.drawString("- 1",115-20,91);
  Stringer.drawString("\u03b1_{2} (x_{2})(1 - \u03b1_{1} (x_{1}))",75-20,110);
   }

}

       if(st==6){
         g.setColor(ColorText);
      g.drawLine(100,59,210,59);
          if (pr==0)
          Stringer.drawString("���",150,107);
          if (pr==1)
          Stringer.drawString("or",150,107);
          g.setColor(Color.DARK_GRAY);
        g.drawArc(100+10,24,12,12,360,360);
        g.drawLine(106+10,36,106+10,26+20);
        g.drawLine(106+10,46,103+10,58);
        g.drawLine(106+10,46,109+10,58);
        g.drawLine(106+10,38,102+10,44);
        g.drawLine(106+10,38,112+10,38);

        g.fillRect(99+10,27-3,6+8,3);
        g.fillRect(101+10,20-3,4+6,9);

g.fillRect(128,154,4,6);
g.fillRect(128,54,4,5);
      g.drawLine(101+20,40,102+20,36);
      g.drawLine(100+20,40,101+20,36);
      g.drawLine(102+20,37,102+28,37);
      g.drawLine(102+20,36,102+28,36);
 g.setColor(Color.blue);
      g.drawLine(153-20,35,151-20,34);
      g.drawLine(151-20,34,153-20,33);
      g.drawLine(153-20,33,151-20,32);
      g.drawLine(151-20,32,153-20,31);
      g.drawLine(153-20,31,153-20,29);

       }
      if(st==9){// || st==10){
        g.setColor(ColorText);
         Stringer.drawString("t = 1",148,50);
           g.setColor(Color.DARK_GRAY);
     g.drawArc(100+10,124,12,12,360,360);
     g.drawLine(106+10,136,106+10,126+20);
     g.drawLine(106+10,146,103+10,158);
     g.drawLine(106+10,146,109+10,158);
     g.drawLine(106+10,138,102+10,144);
     g.drawLine(106+10,138,112+10,138);
     g.fillRect(99+10,127-3,6+8,3);
     g.fillRect(101+10,120-3,4+6,9);

g.fillRect(128,154,4,6);
     g.drawLine(111+10,140,112+10,136);
     g.drawLine(110+10,140,111+10,136);
     g.drawLine(112+10,137,112+18,137);
     g.drawLine(112+10,136,112+18,136);
 g.setColor(Color.blue);
  g.drawLine(153-20,135,151-20,134);
  g.drawLine(151-20,134,153-20,133);
  g.drawLine(153-20,133,151-20,132);
  g.drawLine(151-20,132,153-20,131);
  g.drawLine(153-20,131,153-20,129);

   }
if(st==16)
{ g.setColor(ColorText);
//  Stringer.drawString("\u03b1_{1} (t) + \u03b1_{2} (t) = 1",120,80);
  Stringer.drawString("\u03b1_{1} (t) = 1 ",35,110-70);
  Stringer.drawString("\u03b1_{2} (t) = 1",235,110);
  if (pr==0)
    Stringer.drawString("���",8,91);
  if (pr==1)
    Stringer.drawString("or",8+5,91);

    g.drawLine(35,88,315-20,88);
  g.setColor(Color.DARK_GRAY);
    g.drawArc(20+80,124-70,12,12,360,360);
    g.drawLine(26+80,136-70,26+80,126+20-70);
    g.drawLine(26+80,146-70,23+80,158-70);
    g.drawLine(26+80,146-70,29+80,158-70);
    g.drawLine(26+80,138-70,22+80,144-70);
    g.drawLine(26+80,138-70,32+80,138-70);

    g.drawLine(31+80,140-70,32+80,136-70);
    g.drawLine(30+80,140-70,31+80,136-70);
    g.drawLine(32+80,137-70,40+80,137-70);
    g.drawLine(32+80,136-70,40+80,136-70);

    g.fillRect(99,27-3+30,6+8,3);
    g.fillRect(101,20-3+30,4+6,9);

 g.setColor(Color.blue);
    g.drawLine(43+80,135-70,41+80,134-70);
    g.drawLine(41+80,134-70,43+80,133-70);
    g.drawLine(43+80,133-70,41+80,132-70);
    g.drawLine(41+80,132-70,43+80,131-70);
    g.drawLine(43+80,131-70,43+80,129-70);

 g.setColor(Color.DARK_GRAY);
g.fillRect(128,83,4,6);
g.fillRect(128,154,4,6);
    g.drawArc(90-20,146+2,12,9,360,360);
     g.drawLine(102-20,152+2,110-20,152+2);
     g.drawLine(110-20,152+2,132-20,151+2);
     g.drawLine(110-20,152+2,132-20,154+2);
     g.drawLine(104-20,152+2,114-20,150+2);
     g.drawLine(104-20,152+2,114-20,155+2);


     g.fillRect(99-10-20,123-3+27,3,4+8);
     g.fillRect(91-10-20,125-3+27,9,2+6);

     g.setColor(Color.red);
     g.fillArc(207-100-20,153,4,4,360,360);


}


//______________________________________________________________________________________________________

   g.setColor(Color.blue);
    //  g.setColor(new Color(160,10, 40));
    //   else
      //      g.setColor(Color.DARK_GRAY);
    if(st==0){

      g.drawArc(100+100+40,124,12,12,360,360);
      g.drawLine(106+100+40,136,106+100+40,126+20);
      g.drawLine(106+100+40,146,103+100+40,158);
      g.drawLine(106+100+40,146,109+100+40,158);
      g.drawLine(106+100+40,138,100+100+40,138);
      g.drawLine(106+100+40,138,110+100+40,144);

      g.drawLine(101+100+40,140,99+100+40,136);
      g.drawLine(100+100+40,140,98+100+40,136);
      g.drawLine(99+92+40,137,99+100+40,137);
      g.drawLine(99+92+40,136,99+100+40,136);
      g.fillRect(183,154,4,6);


 ///////////////////////////////////////////////////////////////////////////////
     mass[0]=252; mass1[0]=118;
     mass[1]=233; mass1[1]=127;
     mass[2]=255; mass1[2]=127;

 g.fillPolygon(mass,mass1,3);
     // g.drawLine(100+100+40-2,124-3+1,100+100+40+9,130+1);
     // g.drawLine(100+100+40-2,124-3+1,100+100+40+14,124-3+1);
     // g.drawLine(100+100+40+9,130+1,100+100+40+14,124-3+1);
     // g.drawLine(100+100+40-2+1,124-2+1,100+100+40+14-1,124-2+1);
     //g.drawLine(100+100+40-2+2,124-1+1,100+100+40+14-2,124-1+1);
     //g.drawLine(100+100+40-2+3,124+1,100+100+40+14-3,124+1);
     //g.drawLine(100+100+40-2+5,125+1,100+100+40+14-2,125+1);
     //g.drawLine(100+100+40-2+7,126+1,100+100+40+14-3,126+1);
     //g.drawLine(100+100+40-2+8,127+1,100+100+40+14-4,127+1);
     //g.drawLine(100+100+40-2+9,128+1,100+100+40+14-5,128+1);
     //g.drawLine(100+100+40-2+10,129+1,100+100+40+14-5,129+1);
////////////////////////////////////////////////////////////////////////////////




    }
     if(st==1){
       g.drawArc(100+70+20,124,12,12,360,360);
      g.drawLine(106+70+20,136,106+70+20,126+20);
      g.drawLine(106+70+20,146,103+70+20,158);
      g.drawLine(106+70+20,146,109+70+20,158);
      g.drawLine(106+70+20,138,100+70+20,138);
      g.drawLine(106+70+20,138,110+70+20,144);

    g.drawLine(101+70+20,140,99+70+20,136);
    g.drawLine(100+70+20,140,98+70+20,136);
    g.drawLine(99+62+20,137,99+70+20,137);
    g.drawLine(99+62+20,136,99+70+20,136);
    g.fillRect(183,154,4,6);




     mass[0]=252-50; mass1[0]=118;
     mass[1]=233-50; mass1[1]=127;
     mass[2]=255-50; mass1[2]=127;

      g.fillPolygon(mass,mass1,3);


     }
    if(st==9){ //|| st==10){
     g.drawArc(100+70+20,124,12,12,360,360);
     g.drawLine(106+70+20,136,106+70+20,126+20);
     g.drawLine(106+70+20,146,103+70+20,158);
     g.drawLine(106+70+20,146,109+70+20,158);
     g.drawLine(106+70+20,138,102+70+20,144);
     g.drawLine(106+70+20,138,110+70+20,144);

   g.drawLine(101+70+20,144,99+70+20,152);
   g.drawLine(100+70+20,144,98+70+20,152);
   g.drawLine(101+70+20,144,104+70+20,143);
   g.drawLine(101+70+20,145,104+70+20,144);

   g.fillRect(183,154,4,6);



     mass[0]=252-50; mass1[0]=118;
     mass[1]=233-50; mass1[1]=127;
     mass[2]=255-50; mass1[2]=127;

      g.fillPolygon(mass,mass1,3);


   }
    if(st==2 || st==5 || st==11 || st==15){
      if(st==2){
  if (pr==0)
        Stringer.drawString("����� 2",165+15,110);
      if (pr==1)
        Stringer.drawString("player 2",165+15,110);
  }
      if(st==5)
      Stringer.drawString("+ 1",175+15,115);
    g.drawArc(100+80+20,124,12,12,360,360);
    g.drawLine(106+80+20,136,106+80+20,126+20);
    g.drawLine(106+80+20,146,103+80+20,158);
    g.drawLine(106+80+20,146,109+80+20,158);
    g.drawLine(106+80+20,138,100+80+20,138);
    g.drawLine(106+80+20,138,110+80+20,144);

    g.drawLine(101+80+20,140,99+80+20,136);
    g.drawLine(100+80+20,140,98+80+20,136);
    g.drawLine(99+72+20,137,99+80+20,137);
    g.drawLine(99+72+20,136,99+80+20,136);
    g.fillRect(183,154,4,6);


    mass[0]=252-40; mass1[0]=118;
    mass[1]=233-40; mass1[1]=127;
    mass[2]=255-40; mass1[2]=127;

     g.fillPolygon(mass,mass1,3);


    if(st!=2){
  g.drawLine(173-5+20,135,175-5+20,134);
  g.drawLine(175-5+20,134,173-5+20,133);
  g.drawLine(173-5+20,133,175-5+20,132);
  g.drawLine(175-5+20,132,173-5+20,131);
  g.drawLine(173-5+20,131,173-5+20,129);
    }
  }
  if(st==3 || st==4 || st==6  || st==10 ||  st==14){
    if(st==4)
        Stringer.drawString("- 1",202,115);
      if(st==6){
        Stringer.drawString("0",215,77);
        Stringer.drawString("0",215,87+50);}

      g.drawArc(97+110+20,146+2,12,9,360,360);
      g.drawLine(100+100+20,152+2,97+110+20,152+2);
      g.drawLine(100+100+20,152+2,78+100+20,151+2);
      g.drawLine(100+100+20,152+2,78+100+20,154+2);
      g.drawLine(120+100-14+20,152+2,110+100-14+20,150+2);
      g.drawLine(120+100-14+20,152+2,110+100-14+20,155+2);
      g.fillRect(183,154,4,6);

      g.setColor(Color.red);
      g.fillArc(200+20,153,4,4,360,360);
      g.setColor(Color.blue);


       mass[0]=236; mass1[0]=114+30;
       mass[1]=245; mass1[1]=125+30;
       mass[2]=236; mass1[2]=128+30;


      g.fillPolygon(mass,mass1,3);



    }
     if(st==6)
     {
      g.drawArc(100+70+20,24,12,12,360,360);
      g.drawLine(106+70+20,36,106+70+20,26+20);
      g.drawLine(106+70+20,46,103+70+20,58);
      g.drawLine(106+70+20,46,109+70+20,58);
      g.drawLine(106+70+20,38,100+70+20,38);
      g.drawLine(106+70+20,38,110+70+20,44);

      g.drawLine(101+70+20,40,99+70+20,36);
      g.drawLine(100+70+20,40,98+70+20,36);
      g.drawLine(99+62+20,37,99+70+20,37);
      g.drawLine(99+62+20,36,99+70+20,36);
  g.drawLine(163-5+20,35,165-5+20,34);
  g.drawLine(165-5+20,34,163-5+20,33);
  g.drawLine(163-5+20,33,165-5+20,32);
  g.drawLine(165-5+20,32,163-5+20,31);
  g.drawLine(163-5+20,31,163-5+20,29);

g.fillRect(183,154,4,6);
g.fillRect(183,54,4,5);

       //  g.drawLine(100+100-2-10,124-3+1-100,100+100+9-10,130+1-100);
       //  g.drawLine(100+100-2-10,124-3+1-100,100+100+14-10,124-3+1-100);
       //  g.drawLine(100+100+9-10,130+1-100,100+100+14-10,124-3+1-100);
       //  g.drawLine(100+100-2+1-10,124-2+1-100,100+100+14-1-10,124-2+1-100);
       // g.drawLine(100+100-2+2-10,124-1+1-100,100+100+14-2-10,124-1+1-100);
       // g.drawLine(100+100-2+3-10,124+1-100,100+100+14-3-10,124+1-100);
       // g.drawLine(100+100-2+5-10,125+1-100,100+100+14-2-10,125+1-100);
       // g.drawLine(100+100-2+7-10,126+1-100,100+100+14-3-10,126+1-100);
       // g.drawLine(100+100-2+8-10,127+1-100,100+100+14-4-10,127+1-100);
       // g.drawLine(100+100-2+9-10,128+1-100,100+100+14-5-10,128+1-100);
       // g.drawLine(100+100-2+10-10,129+1-100,100+100+14-5-10,129+1-100);

       mass[0]=252-50; mass1[0]=118-100;
       mass[1]=233-50; mass1[1]=127-100;
       mass[2]=255-50; mass1[2]=127-100;

       g.fillPolygon(mass,mass1,3);

     }
     if(st==8 || st==12 || st==13){
        g.drawArc(100+80+20,124,12,12,360,360);
        g.drawLine(106+80+20,136,106+80+20,126+20);
        g.drawLine(106+80+20,146,103+80+20,158);
        g.drawLine(106+80+20,146,109+80+20,158);
        g.drawLine(106+80+20,138,100+80+20,138);
        g.drawLine(106+80+20,138,110+80+20,144);

        g.drawLine(101+80+20,140,99+80+20,136);
        g.drawLine(100+80+20,140,98+80+20,136);
        g.drawLine(99+72+20,137,99+80+20,137);
        g.drawLine(99+72+20,136,99+80+20,136);


        mass[0]=252-40; mass1[0]=118;
        mass[1]=233-40; mass1[1]=127;
        mass[2]=255-40; mass1[2]=127;

      g.fillPolygon(mass,mass1,3);


g.fillRect(183,154,4,6);
     }
if(st==16)
     {g.drawArc(100+90+10,124,12,12,360,360);
    g.drawLine(106+90+10,136,106+90+10,126+20);
    g.drawLine(106+90+10,146,103+90+10,158);
    g.drawLine(106+90+10,146,109+90+10,158);
    g.drawLine(106+90+10,138,100+90+10,138);
    g.drawLine(106+90+10,138,110+90+10,144);

    g.drawLine(101+90+10,140,99+90+10,136);
    g.drawLine(100+90+10,140,98+90+10,136);
    g.drawLine(99+82+10,137,99+90+10,137);
    g.drawLine(99+82+10,136,99+90+10,136);

    g.drawLine(180-2+10,135,182-2+10,134);
    g.drawLine(182-2+10,134,180-2+10,133);
    g.drawLine(180-2+10,133,182-2+10,132);
    g.drawLine(182-2+10,132,180-2+10,131);
    g.drawLine(180-2+10,131,180-2+10,129);






    g.drawArc(97+20+110,146+2-70,12,9,360,360);
    g.drawLine(100+10+110,152+2-70,97+11+110,152+2-70);
    g.drawLine(100+10+110,152+2-70,78+10+110,151+2-70);
    g.drawLine(100+10+110,152+2-70,78+10+110,154+2-70);
    g.drawLine(120+10-14+110,152+2-70,110+10-14+110,150+2-70);
    g.drawLine(120+10-14+110,152+2-70,110+10-14+110,155+2-70);
g.fillRect(183,83,4,6);
g.fillRect(183,154,4,6);
    g.setColor(Color.red);
    g.fillArc(110+110,153-70,4,4,360,360);
  g.setColor(Color.blue);


     mass[0]=252-40; mass1[0]=118;
     mass[1]=233-40; mass1[1]=127;
     mass[2]=255-40; mass1[2]=127;

      g.fillPolygon(mass,mass1,3);




      mass[0]=236; mass1[0]=114-40;
      mass[1]=245; mass1[1]=125-40;
      mass[2]=236; mass1[2]=128-40;

      g.fillPolygon(mass,mass1,3);


            }
 //_________________________________�������________________________________________________
         if (st==0 || st==3 || st==4 || st==7)
          g.setColor(Color.DARK_GRAY);
    // g.setColor(new Color(160,10, 40));
    else
          g.setColor(Color.blue);

   //______________________________________________________________________________________________________





      }}
    class  Panel_paint3 extends JPanel {
          public void paintComponent(Graphics g) {
            super.paintComponent(g);
            Stringer.setGraphics(g);
            g.setColor(ColorText);
            g.setFont(FontText);
            g.setColor(Color.DARK_GRAY);
          g.fillArc(10,15-3,6,6,360,360);

            g.setColor(Color.blue);
          g.fillArc(100,15-3,6,6,360,360);

            g.setColor(ColorText);
            g.setFont(FontText);
             if (pr==0){
 Stringer.drawString(" -  ����� 1 ",20,20-3);
 Stringer.drawString(" -  ����� 2 ",110,20-3);}
      if (pr==1){
     Stringer.drawString(" -  player 1 ",20,20-3);
     Stringer.drawString(" -  player 2 ",110,20-3);}

 if (st>2){
   if (pr==0){
   Stringer.drawString("\u03b1_{i} (t) - ����������� ����, ��� �����  i �������",10,35-3);
   Stringer.drawString("������ j, ���� ����� �������� � ������ ������� t",10,50-3);}
  if (pr==1){
  Stringer.drawString("\u03b1_{i} (t) - probability that the player i will amaze",10,35-3);
  Stringer.drawString("player j, if will shoot at the moment of time t",10,50-3);}

 }

if(st>6){
   if (pr==0)
Stringer.drawString("x_{i} - ��������� ��������� \u2208 [0, 1]",10,65-3);
   if (pr==1)
Stringer.drawString("x_{i} - set of strategy \u2208 [0, 1]",10,65-3);
}

 if(st>8){
    if (pr==0)
 Stringer.drawString("u_{1} (x_{1}, x_{2}) - ���������� ����� ����",10,80-3);
  if (pr==1)
 Stringer.drawString("u_{1} (x_{1}, x_{2}) - normal form of game",10,80-3);
  }

 if(st>9){
    if (pr==0){
 Stringer.drawString("�������� +1 ������������� �����������:",10,95-3);
 Stringer.drawString("\u03b1_{1} (x_{1})(1 - \u03b1_{2} (x_{1}))",10,110-3);}
        if (pr==1){
     Stringer.drawString("The prize +1 there corresponds probability:",10,95-3);
     Stringer.drawString("\u03b1_{1} (x_{1})(1 - \u03b1_{2} (x_{1}))",10,110-3);}

 }
 if(st>10){
   if (pr==0){
  Stringer.drawString("�������� -1 ������������� �����������:",10,125-3);
  Stringer.drawString("\u03b1_{2} (x_{2})(1 - \u03b1_{1} (x_{1}))",10,140-3);}
if (pr==1){
  Stringer.drawString("The prize -1 there corresponds probability:",10,125-3);
  Stringer.drawString("\u03b1_{2} (x_{2})(1 - \u03b1_{1} (x_{1}))",10,140-3);}

  }
if(st>13){
  if (pr==0)
  Stringer.drawString("F = P_{i} (u_{i}) ��������� ���������� ���������.",10,155-3);
  if (pr==1)
  Stringer.drawString("F = P_{i} (u_{i}) set of cautious strategy.",10,155-3);
}
          }}
     class  Panel_paint4 extends JPanel {
         public void paintComponent(Graphics g) {
           super.paintComponent(g);
           Stringer.setGraphics(g);
           g.setColor(ColorText);
           g.setFont(FontText);
           g.setFont(new Font("Times New Roman", 1, 14));
           g.drawString("���������� ������:",10,15);
           g.drawString("1-� ���.   �����   �   ��������  �����   x   ��  ���������  ����  �����  {1, 2}.",150,15);
           g.drawString("2-� ���.   �����   �   �������� �����   y   �� ��������� ���� �����  {1, 2},  �� ���� �����  �����  x",10,30);
           g.drawString("�������  �.",10,45);
           g.drawString("�������  W (x, y) ������ ������  �  �� ���� ������  �  �������� ���",10,60);
           g.drawString("W (1, 1) =  1,                      W (2, 1) = -2,",190,75);
           g.drawString("W (1, 2) = -1,                      W (2, 2) =  2.",190,90);
           if(st>=1)
             g.drawString("�� ������� �������� ������ ���� � �������������� ���������.",10,105);
         }}



}
