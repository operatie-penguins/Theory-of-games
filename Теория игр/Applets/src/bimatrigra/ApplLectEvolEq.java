package bimatrigra;

import java.awt.*;
import java.awt.event.*;
import java.applet.*;
import javax.swing.*;
import java.beans.*;

public class ApplLectEvolEq extends JApplet {
  boolean isStandalone = false;
  Panel_paint pnlForm1 = new Panel_paint();
  Panel_paint1  pnlForm2= new Panel_paint1();
  JButton btnNext=new JButton("==>");
  JButton btnNew=new JButton("Обновить");
  JButton btnPreceding = new JButton("<==");
  JCheckBox cbFormula = new JCheckBox();
  Font font12=new Font("Dialog", 1, 12);
  Font font14=new java.awt.Font("Dialog", 1, 14);
  Font font11=new Font("Dialog", 3, 14);
  int step=0;
  int fr=0;
  double k1=8,m=0,s=1;

  /**Get a parameter value*/
  public String getParameter(String key, String def) {
    return isStandalone ? System.getProperty(key, def) :
      (getParameter(key) != null ? getParameter(key) : def);
  }

  /**Construct the applet*/
  public ApplLectEvolEq() {
  }
  /**Initialize the applet*/
  public void init() {
    this.getContentPane().setBackground(new Color(247, 247, 255));
   // this.setSize(new Dimension(700, 381));

   pnlForm1.setBackground(new Color(0, 0, 130));
   pnlForm1.setBackground(new Color(247, 247, 255));
   pnlForm1.setLayout(null);
   pnlForm1.setVisible(true);

   pnlForm2.setBackground(new Color(247, 247, 255));
   this.getContentPane().add(pnlForm1, BorderLayout.CENTER);
  // pnlForm1.add(pnlForm2, null);
   pnlForm2.setLayout(null);
   pnlForm2.setBounds(135, 100, 400, 270);
   pnlForm2.setVisible(false);

   btnPreceding.setBackground(new Color(220, 230, 255));
   btnPreceding.setFont(new java.awt.Font("Dialog", 1, 14));
   btnPreceding.setForeground(new Color(0, 0, 60));
   btnPreceding.setBounds(130, 515, 100, 23);
   btnPreceding.setEnabled(false);
   pnlForm1.add(btnPreceding, null);
   btnPreceding.addMouseListener(new java.awt.event.MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
       if (step > 0) {
         step--;
         btnNext.setEnabled(true);
       }
       if (step == 0) btnPreceding.setEnabled(false);
       repaint();
     }
   });


    btnNew.setBackground(new Color(167, 213, 255));
    btnNew.setFont(new java.awt.Font("Dialog", 1, 12));
    btnNew.setForeground(new Color(0, 0, 130));
    pnlForm1.add(btnNew,null);
    btnNew.setBounds(280,515,127,23);
    btnNew.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
            cbFormula.setVisible(false);
            cbFormula.setSelected(false);
           // pnlForm2.setVisible(false);
            btnPreceding.setEnabled(false);
            fr=0;
            step=0;repaint();
      }
    });
    btnNext.setBackground(new Color(167, 213, 255));
    btnNext.setFont(new java.awt.Font("Dialog", 1, 14));
    btnNext.setForeground(new Color(0, 0, 130));
    btnNext.setBounds(430,515,127,23);
    pnlForm1.add(btnNext,null);
    btnNext.addMouseListener(new java.awt.event.MouseAdapter() {
     public void mouseClicked(MouseEvent e) {
            if(step<14){step++;btnPreceding.setEnabled(true);}else btnNext.setEnabled(false);
            repaint();
      }
    });
    cbFormula.setBackground(Color.white);
    cbFormula.setFont(new java.awt.Font("Dialog", 1, 14));
    cbFormula.setForeground(new Color(130, 0, 60));
    cbFormula.setBounds(540,483,120,22);
  //  pnlForm1.add(cbFormula,null);
    cbFormula.setVisible(false);
   // cbFormula.setText("Формулы");
    cbFormula.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(ItemEvent e) {
            if(e.getStateChange()==1)
             {
             fr=1;
             repaint();
             }
            else
             {
              fr=0;
              repaint();
              }
      }
    });
}

class  Panel_paint1 extends JPanel {
  public void paintComponent(Graphics g1) {
          super.paintComponent(g1);
          g1.setColor(new Color(167, 213, 255));
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
         g1.setColor(new Color(0, 0, 80));
         g1.setFont(font14);


  }
}

class  Panel_paint extends JPanel {
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
//==========Fon==================================
    g.setColor(new Color(150, 150, 213));
    g.fill3DRect(12, 13, 655, 500, true);
    g.setColor(Color.white);
    g.fill3DRect(10, 10, 651, 496, true);

//---------------закрашивание---------------------------
//         g.setColor(new Color(0, 0, 130));
    g.setColor(new Color(150, 150, 213));
      for (int i = 0; i < 57; i++)
        for (int j = 0; j < 57; j++) {
          if (Math.sqrt( (j - 9 - 57) * (j - 9 - 57) +
                        (i - 9 - 57) * (i - 9 - 57)) > 60);
           g.drawRect(i, j, 1, 1);
        }

      g.setColor(new Color(150, 150, 213));
      g.drawLine(58, 9, 663, 9);
      g.drawArc(9, 9, 96, 96, 90, 90);
      g.drawLine(9, 58, 9, 509);
      g.setColor(new Color(150, 150, 213));
      g.drawLine(58, 10, 663, 10);
      g.drawArc(10, 10, 96, 96, 90, 90);
      g.drawLine(10, 58, 10, 509);

      for (int i = 1; i <= 22; i++) {
        g.setColor(new Color(92, 92, 150)); //------------цвет дырок
        g.fillOval(41 + i * 25, 16, 8, 8);
        g.drawArc(35 + i * 25, 1, 20, 20, 9, 270);
        g.drawArc(34 + i * 25, 0, 20, 20, 5, 270);
        g.setColor(new Color(100, 100, 100)); //---------кольца на фоне
        g.drawArc(41 + i * 25, 17, 6, 6, 270, 90);
        g.drawArc(41 + i * 25, 17, 5, 5, 220, 180);
        g.drawArc(36 + i * 25, 2, 19, 19, 10, 60);

        g.drawArc(33 + i * 25, -1, 23, 23, 110, 70);
      }
      g.setColor(new Color(213, 225, 255)); //-------------цвет клеток

    for (int i = 5; i < 46; i++)
      g.drawLine(40, 30 + i * 10, 630, 30 + i * 10);

    for (int i = 0; i < 60; i++)
      g.drawLine(40 + i * 10, 80, 40 + i * 10, 480);
    if (step != 14)
      btnNext.setEnabled(true);
    else
      btnNext.setEnabled(false);
    if (step == 0) {
      g.setColor(new Color(0, 0, 160));
      g.setFont(new Font("Dialog", 1, 26));
   //   g.drawString("Тема лекции:", 250, 170);
      g.setColor(new Color(130, 0, 60));
      g.setFont(new Font("Dialog", 1, 16));
      g.drawString("ЭВОЛЮЦИОННО - УСТОЙЧИВОЕ РАВНОВЕСИЕ ИГРЫ", 135, 250);
      g.setFont(new Font("Dialog", 1, 18));
      g.setColor(new Color(60, 0, 250));
      g.drawLine(80, 260, 600, 260);
      g.drawLine(80, 260, 600, 260);
      g.drawLine(160, 270, 520, 270);
      g.drawLine(160, 270, 520, 270);
      g.setColor(new Color(0, 0, 10));
      g.drawLine(160, 271, 520, 271);
      g.drawLine(80, 261, 600, 261);
      g.setColor(new Color(40, 70, 170));
      g.drawRect(40, 80, 590, 400);
    }
    else
    if (step != 14) {

      g.setFont(new Font("Dialog", 1, 17));
      g.setColor(new Color(130, 0, 60));
      g.drawString("Эволюционно-устойчивое равновесие игры", 135, 50);
      g.setColor(new Color(100, 80, 255));
      g.drawLine(130, 57, 510, 57);
      g.drawLine(220, 66, 430, 66);
      g.setColor(new Color(0, 0, 0));
      g.drawLine(150, 58, 500, 58);
      g.drawLine(220, 67, 430, 67);
    }

    if (step > 2 && step < 14) {
      cbFormula.setVisible(true);
      if (fr == 1) {
        pnlForm2.setVisible(true);
        repaint();
      }
      else {
        pnlForm2.setVisible(false);
        repaint();
      }
    }
    else cbFormula.setVisible(false);
    g.setColor(new Color(0, 0, 80));

    switch (step) {

case 10:{
        if (step == 9)
          g.setColor(new Color(0, 0, 160));
        OptimizationBasic.drawFormula(g,
          " Построением математи-",
                                    435, 420, font14, font12);
      OptimizationBasic.drawFormula(g,
          "ческих моделей таких ситуаций и разработкой методов их решения занимается ",
                                    50, 440, font14, font12);
     g.setColor(new Color(250, 0, 0));
      OptimizationBasic.drawFormula(g,
          "теория игр.",
                                    50, 460, font11, font12);
      g.setColor(new Color(0, 0, 80));

      }
      case 9: {
        if (step == 9)
          g.setColor(new Color(0, 0, 160));
        OptimizationBasic.drawFormula(g,
            "Ситуации такого типа называются конкурентными. ",
                                      70, 420, font14, font12);
        g.setColor(new Color(0, 0, 80));
      }
      case 8: {
        if (step == 8)

          g.setColor(new Color(0, 0, 160));
          OptimizationBasic.drawFormula(g, "В последнем случае может оказаться невыгодным сообщать другим", 50, 350, font14, font12);
          OptimizationBasic.drawFormula(g, "участникам свои решения, так как кто-нибудь из них сможет воспользоваться", 50, 370, font14, font12);
          OptimizationBasic.drawFormula(g, "знанием чужих решений и получит большой выигрыш за счёт других участников.", 50, 390, font14, font12);

          g.setColor(new Color(0, 0, 80));
      }
 case 7:{
   if (step == 6)
            g.setColor(new Color(0, 0, 160));

      OptimizationBasic.drawFormula(g, "- интересы участников не совпадают.", 50, 330,
                                    font14, font12);
       g.setColor(new Color(0, 0, 80));
 }
       case 6: {
         if (step == 6)
            g.setColor(new Color(0, 0, 160));
          OptimizationBasic.drawFormula(g, "- интересы участников совпадают, и они могут договориться о совместных", 50, 290,
                                  font14, font12);
    OptimizationBasic.drawFormula(g, "действиях;", 50, 310,
                                  font14, font12);
            g.setColor(new Color(0, 0, 80));
       }
      case 5: {
        if (step == 5)
          g.setColor(new Color(0, 0, 160));
        OptimizationBasic.drawFormula(g, "Все ситуации, когда эффективность действия одного из участников", 70, 250,
                                      font14, font12);
        OptimizationBasic.drawFormula(g, "зависит от действий других, можно разбить на два типа:", 50, 270,
                                      font14, font12);

         g.setColor(new Color(0, 0, 80));
      }
      case 4:{
         if (step == 4)
           g.setColor(new Color(0, 0, 160));

         OptimizationBasic.drawFormula(g, "Или, при выборе ассортимента товаров, выпускаемых", 170, 200,
                                       font14, font12);
         OptimizationBasic.drawFormula(g, "предприятием, нужно учитывать ассортимент товаров других предприятий.", 50, 220,
                                       font14, font12);
         g.setColor(new Color(0, 0, 80));

      }
      case 3: {

       if (step == 3)
        g.setColor(new Color(0, 0, 160));
        OptimizationBasic.drawFormula(g, "Например, доход предприятия от продажи изделия зависит не только от", 70, 160,
                                      font14, font12);
        OptimizationBasic.drawFormula(g, "установленной на него цены, но и от количества приобретенных покупа-", 50, 180,
                                      font14, font12);
        OptimizationBasic.drawFormula(g, "телем изделий. ", 50, 200,
                                       font14, font12);
         g.setColor(new Color(0, 0, 80));
      }
      case 2: {
        if (step == 2)
          g.setColor(new Color(0, 0, 160));
        OptimizationBasic.drawFormula(g,"Иногда приходится сталкиваться с ситуацией, когда при наличии многих",
                                      70, 100, font14, font12);
        OptimizationBasic.drawFormula(g,"участников эффективность решения одного из них зависит от того,", 50, 120, font14, font12);
        OptimizationBasic.drawFormula(g,"какие решения приняли другие участники.", 50, 140, font14, font12);
        g.setColor(new Color(0, 0, 80));
        break;
      }
    }
    switch (step) {
      case 13: {
             if (step == 13)
               g.setColor(new Color(0, 0, 160));
               g.setColor(new Color(250, 0, 0));
               OptimizationBasic.drawFormula(g,"Оптимальной", 70, 220, font11, font12);
               g.setColor(new Color(0, 0, 160));
               OptimizationBasic.drawFormula(g,"называется стратегия, которая при многократном повторении", 180, 220, font14, font12);
               OptimizationBasic.drawFormula(g,"игры обеспечивает данному игроку максимально возможный средний выигрыш.", 48, 240, font14, font12);
              // OptimizationBasic.drawFormula(g," игры обеспечивает данному игроку максимально возможный средний выигрыш.", 50, 240, font14, font12);
               g.setColor(new Color(0, 0, 80));
           }

      case 12: {
             if (step == 12)
               g.setColor(new Color(0, 0, 160));
               g.setColor(new Color(250, 0, 0));
               OptimizationBasic.drawFormula(g,"Стратегией игрока", 70, 150, font11, font12);
               g.setColor(new Color(0, 0, 160));
               OptimizationBasic.drawFormula(g,"называется система правил, однозначно определяющих", 220, 150, font14, font12);
               OptimizationBasic.drawFormula(g,"поведение игрока на каждом ходе в зависимости от ситуации, сложившейся", 50, 170, font14, font12);
               OptimizationBasic.drawFormula(g,"в процессе игры.", 50, 190, font14, font12);
               g.setColor(new Color(0, 0, 80));
           }

      case 11: {
        if (step == 11)
          g.setColor(new Color(0, 0, 160));
          g.setColor(new Color(250, 0, 0));
          OptimizationBasic.drawFormula(g,"Задачей теории игр", 70, 100, font11, font12);
          g.setColor(new Color(0, 0, 160));
          OptimizationBasic.drawFormula(g,"является выработка рекомендаций для игроков,", 220, 100, font14, font12);
          OptimizationBasic.drawFormula(g,"т.е. определение для них оптимальной стратегии.", 50, 120, font14, font12);
          g.setColor(new Color(0, 0, 80));
           break;
      }
    }

      if (step == 14) {
        g.setFont(new Font("Dialog", 1, 28));
        g.setColor(new Color(130, 0, 60));
        g.drawString("конец ", 300, 250);
      }

    }
  }

  /**Component initialization*/
  private void jbInit() throws Exception {
  }

  /**Get Applet information*/
  public String getAppletInfo() {
    return "Applet Information";
  }

  /**Get parameter info*/
  public String[][] getParameterInfo() {
    return null;
  }

  //static initializer for setting look & feel
  static {
    try {
      //UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
      //UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
    }
    catch (Exception e) {
    }
  }
}

