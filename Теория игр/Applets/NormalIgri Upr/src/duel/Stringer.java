package duel;

import java.awt.*;
import java.awt.geom.*;
import java.awt.font.*;
import javax.swing.*;
import java.util.*;

public class Stringer {
	static Graphics2D g2d;
	static Font[] fonts = {
		new Font("Dialog", 1, 12),	// �������� �����
		new Font("Dialog", 1, 10),   // ������� ������
		new Font("Dialog", 1, 10)     // ������ �������
	};
	static FontRenderContext[] frcs = new FontRenderContext[3];
        //���� �������
	public static Color color_font=new Color(247, 247, 255);

        //���� ������ ComboBox
        public static Color color1=new Color(220, 230, 255);

        //���� ������ �� ������ ComboBox
        public static Color color2=new Color(0, 0, 60);

        //����� �� JScrollBar JRadioButton JButton
        public static Font font1=new Font("Dialog", 1, 12);

        //����� �� ������� Lable
        public static Font Lab_v=new Font("Dialog", 1, 16);

        //����� �� Lable c ��������
        public static Font Lab_k=new Font("Dialog", 3, 12);

        //����� �� Lable �������
        public static Font font_lab=new Font("Dialog", 1, 12);

public static void Strelka(Graphics g,int SM, int SM2)
{
            g.setColor(Color.red);
            g.drawLine(346+SM,101+SM2,365+SM,120+SM2);
            g.drawLine(346+SM,102+SM2,365+SM,121+SM2);
            ///-----1------
            g.drawLine(356+SM,121+SM2,365+SM,121+SM2);
            g.drawLine(358+SM,120+SM2,365+SM,120+SM2);
            g.drawLine(360+SM,119+SM2,365+SM,119+SM2);
            ///-----2------
            g.drawLine(365+SM,111+SM2,365+SM,121+SM2);
            g.drawLine(364+SM,113+SM2,364+SM,121+SM2);
            g.drawLine(363+SM,116+SM2,363+SM,121+SM2);
}//end Strelka


public static void drawColorStr(Graphics g, String str[],
Color c[],Font fs, int count, int xx, int yy)
{
 int size=0;
 for(int i=0; i<=count; i++)
 {
  g.setFont(fs);
  FontMetrics F=g.getFontMetrics();
  if (i==0) size=0;
  if (i>=1) size=size+F.stringWidth(str[i-1]);
  g.setColor(c[i]);
  g.drawString(str[i],xx+size,yy);
 }
}

public static double round(double x,int k){return Math.round(x*Math.pow(10,k))/Math.pow(10,k);}
public static double round(double x){return Math.round(x*Math.pow(10,3))/Math.pow(10,3);}

public static void setColor(JScrollBar obj){
		obj.setFont(font1);
		obj.setBackground(color_font);
}

public static void setColor(Container obj){
		obj.setBackground(color_font);
}

public static void setColor(JRadioButton obj){
		obj.setFont(font1);
		obj.setBackground(Color.white);
}

public static void setColor(JComboBox obj){
    obj.setBackground(color1);
    obj.setForeground(color2);
}


public static void setColor(JButton obj){
    obj.setBackground(color1);
    obj.setForeground(color2);
    obj.setFont(font1);
}

public static void setColor(JPanel obj){
    obj.setBorder(BorderFactory.createLineBorder(new Color(157, 187, 255)));
   //obj.setBorder(BorderFactory.createLineBorder(new Color(157, 187, 0)));
    obj.setBackground(Color.white);
   // obj.setForeground(color2);
   //? obj.setFont(font1);
}

public static void setColor(JLabel obj, String s){
		int k=0;if (s.equals("title")) k=1;
		if (s.equals("show_info")) k=2;
		switch (k){
		case 1:
			obj.setVerticalAlignment(SwingConstants.TOP);
			obj.setHorizontalAlignment(SwingConstants.CENTER);
			obj.setFont(Lab_v);
			obj.setForeground(new Color(130, 0, 80));
			break;
		case 2:
			obj.setVerticalAlignment(SwingConstants.TOP);
			obj.setFont(Lab_k);
			obj.setForeground(new Color(180, 0, 80));
			break;
			default:
			obj.setVerticalAlignment(SwingConstants.TOP);
			//obj.setFont(font1);
			obj.setForeground(new Color(130, 0, 80));
			break;
		}
}

public static void setColor(JLabel obj){
			obj.setVerticalAlignment(SwingConstants.TOP);
			obj.setFont(font_lab);
			obj.setForeground(new Color(0, 0, 80));
			obj.setBorder(BorderFactory.createLineBorder(new Color(157, 187, 255)));
			obj.setBackground(Color.white);
}

        public static void setGraphics(Graphics g) {
		g2d = (Graphics2D) g;
		for (int i = 0; i < 3; ++i) {
			g2d.setFont(fonts[i]);
			frcs[i] = g2d.getFontRenderContext();
		}
	}

	public static void drawString(String s, int x, int y) {
		drawSubstring(s, x, y, 0);
	}

	private static int drawSubstring(String s, int x, int y, int sy) {
//		System.out.println(s);
		String text, text1, text2;
		char sym;
		int i, dy, iEnd, index = 0;
		Rectangle2D r;
		int fontIndex = 0;

		if (sy == 1 || sy == -1) {
			fontIndex = 1;
		}
		else if (sy != 0) {
			fontIndex = 2;
		}

		while(true) {
			i = s.indexOf("{", index);
			if (i == -1) i = s.length() + 1;
			if (index >= i - 1) return x;
			text = s.substring(index, i - 1);
			g2d.setFont(fonts[fontIndex]);
			g2d.drawString(text, x, y);
			r = fonts[fontIndex].getStringBounds(text, frcs[fontIndex]);
			x += r.getWidth();
			if (i == s.length() + 1) return x;
			sym = s.charAt(i - 1);
			iEnd = getEnd(s, i + 1);//s.indexOf("}", i);
			index = iEnd + 1;
			if (sym == '_') {
				text1 = s.substring(i + 1, iEnd);
				dy = 5;
				x = drawSubstring(text1, x, y + dy, sy + 1);
			}
			else if (sym == '^') {
				text1 = s.substring(i + 1, iEnd);
				dy = -5;
				x = drawSubstring(text1, x, y + dy, sy + 1);
			}
			else if (sym == '&') {
				text1 = s.substring(i + 1, iEnd);
				i = iEnd + 2; //{f}{g}
				iEnd = getEnd(s, i);
				index = iEnd + 1;
				text2 = s.substring(i, iEnd);
				dy = 5;
				int x1 = drawSubstring(text1, x, y + dy, sy + 1);
				x = drawSubstring(text2, x, y - dy, sy + 1);
				if (x1 > x) x = x1;
			}
		}
	}
	private static int getEnd(String s, int from) {
		int j, i = s.indexOf("}", from);
		// nSkip = count {
		int nSkip = 0, iSkip = from;
		do {
			j = s.indexOf("{", iSkip);
			if (j > i || j == -1) break;
			iSkip = j + 1;
			nSkip++;
		} while (true);

		from=i+1;
		for (int k = 0; k < nSkip; ++k) {
			i = s.indexOf("}", from);
			from = i + 1;
		}

		//System.out.println("{" + nSkip + "}");
		return i;
	}
}
