import java.awt.Color;
import java.awt.LayoutManager;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

class picpuzzle21 extends JFrame implements ActionListener {
   JButton b1;
   JButton b2;
   JButton b3;
   JButton b4;
   JButton b5;
   JButton b6;
   JButton b7;
   JButton b8;
   JButton b9;
   JButton sample;
   JButton starB;
   Icon star;
   Icon ic0 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\01.jpg");
   Icon ic20 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\Hazeera.jpg");
   Icon samicon1 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\main.jpg");
   Icon samicon3 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\Hazeera.jpg");
   Icon ic1 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\WhatsApp Image 2024-08-08 at 21.25.13_610025e6.jpg");
   Icon ic2 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\WhatsApp Image 2024-08-08 at 21.43.16_4c90522f.jpg");
   Icon ic3 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\12.jpg");
   Icon ic4 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\WhatsApp Image 2024-08-08 at 21.43.17_676ca869.jpg");
   Icon ic5 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\WhatsApp Image 2024-08-08 at 21.43.18_68596ad3.jpg");
   Icon ic6 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\13.jpg");
   Icon ic7 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\14.jpg");
   Icon ic8 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\WhatsApp Image 2024-08-08 at 21.43.19_1fcb1ae8.jpg");
   Icon ic9 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\16.jpg");
   Icon ic21 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\001.jpg");
   Icon ic22 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\002.jpg");
   Icon ic23 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\003.jpg");
   Icon ic24 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\004.jpg");
   Icon ic25 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\005.jpg");
   Icon ic26 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\006.jpg");
   Icon ic27 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\007.jpg");
   Icon ic28 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\008.jpg");
   Icon ic29 = new ImageIcon("C:\\Users\\Acer\\Desktop\\projects\\009.jpg");

   picpuzzle21() {
      super("pic puzzle(created by HAZEERA)");
      this.b1 = new JButton(this.ic1);
      this.b1.setBounds(10, 100, 200, 200);
      this.b2 = new JButton(this.ic2);
      this.b2.setBounds(210, 100, 200, 200);
      this.b3 = new JButton(this.ic3);
      this.b3.setBounds(410, 100, 200, 200);
      this.b4 = new JButton(this.ic4);
      this.b4.setBounds(10, 300, 200, 200);
      this.b5 = new JButton(this.ic5);
      this.b5.setBounds(210, 300, 200, 200);
      this.b6 = new JButton(this.ic6);
      this.b6.setBounds(410, 300, 200, 200);
      this.b7 = new JButton(this.ic7);
      this.b7.setBounds(10, 500, 200, 200);
      this.b8 = new JButton(this.ic8);
      this.b8.setBounds(210, 500, 200, 200);
      this.b9 = new JButton(this.ic9);
      this.b9.setBounds(410, 500, 200, 200);
      this.sample = new JButton(this.samicon1);
      this.sample.setBounds(800, 110, 600, 600);
      this.b1 = new JButton(this.ic21);
      this.b1.setBounds(10, 100, 200, 200);
      this.b2 = new JButton(this.ic22);
      this.b2.setBounds(210, 100, 200, 200);
      this.b3 = new JButton(this.ic23);
      this.b3.setBounds(410, 100, 200, 200);
      this.b4 = new JButton(this.ic24);
      this.b4.setBounds(10, 300, 200, 200);
      this.b5 = new JButton(this.ic25);
      this.b5.setBounds(210, 300, 200, 200);
      this.b6 = new JButton(this.ic26);
      this.b6.setBounds(410, 300, 200, 200);
      this.b7 = new JButton(this.ic27);
      this.b7.setBounds(10, 500, 200, 200);
      this.b8 = new JButton(this.ic28);
      this.b8.setBounds(210, 500, 200, 200);
      this.b9 = new JButton(this.ic29);
      this.b9.setBounds(410, 500, 200, 200);
      this.sample = new JButton(this.samicon3);
      this.sample.setBounds(800, 110, 600, 600);
      JLabel var1 = new JLabel("Sample:");
      var1.setBounds(330, 200, 200, 20);
      JLabel var2 = new JLabel("icon has power to swap with neighbour icon=");
      var2.setBounds(5, 15, 500, 20);
      JLabel var3 = new JLabel(" puzzle:");
      var3.setBounds(680, 320, 200, 200);
      var3.setForeground(Color.red);
      this.starB = new JButton(this.ic0);
      this.starB.setBounds(330, 5, 50, 50);
      this.star = this.b9.getIcon();
      this.add(this.b1);
      this.add(this.b2);
      this.add(this.b3);
      this.add(this.b4);
      this.add(this.b5);
      this.add(this.b6);
      this.add(this.b7);
      this.add(this.b8);
      this.add(this.b9);
      this.add(this.sample);
      this.add(var1);
      this.add(var2);
      this.add(this.starB);
      this.add(var3);
      this.b1.addActionListener(this);
      this.b2.addActionListener(this);
      this.b3.addActionListener(this);
      this.b4.addActionListener(this);
      this.b5.addActionListener(this);
      this.b6.addActionListener(this);
      this.b7.addActionListener(this);
      this.b8.addActionListener(this);
      this.b9.addActionListener(this);
      this.sample.addActionListener(this);
      this.setLayout((LayoutManager)null);
      this.setSize(1000, 1000);
      this.setVisible(true);
      this.setDefaultCloseOperation(3);
   }

   public void actionPerformed(ActionEvent var1) {
      Icon var2;
      if (var1.getSource() == this.b1) {
         var2 = this.b1.getIcon();
         if (this.b2.getIcon() == this.star) {
            this.b2.setIcon(var2);
            this.b1.setIcon(this.star);
         } else if (this.b4.getIcon() == this.star) {
            this.b4.setIcon(var2);
            this.b1.setIcon(this.star);
         }
      }

      if (var1.getSource() == this.b2) {
         var2 = this.b2.getIcon();
         if (this.b1.getIcon() == this.star) {
            this.b1.setIcon(var2);
            this.b2.setIcon(this.star);
         } else if (this.b5.getIcon() == this.star) {
            this.b5.setIcon(var2);
            this.b2.setIcon(this.star);
         } else if (this.b3.getIcon() == this.star) {
            this.b3.setIcon(var2);
            this.b2.setIcon(this.star);
         }
      }

      if (var1.getSource() == this.b3) {
         var2 = this.b3.getIcon();
         if (this.b2.getIcon() == this.star) {
            this.b2.setIcon(var2);
            this.b3.setIcon(this.star);
         } else if (this.b6.getIcon() == this.star) {
            this.b6.setIcon(var2);
            this.b3.setIcon(this.star);
         }
      }

      if (var1.getSource() == this.b4) {
         var2 = this.b4.getIcon();
         if (this.b1.getIcon() == this.star) {
            this.b1.setIcon(var2);
            this.b4.setIcon(this.star);
         } else if (this.b5.getIcon() == this.star) {
            this.b5.setIcon(var2);
            this.b4.setIcon(this.star);
         } else if (this.b7.getIcon() == this.star) {
            this.b7.setIcon(var2);
            this.b4.setIcon(this.star);
         }
      }

      if (var1.getSource() == this.b5) {
         var2 = this.b5.getIcon();
         if (this.b2.getIcon() == this.star) {
            this.b2.setIcon(var2);
            this.b5.setIcon(this.star);
         } else if (this.b4.getIcon() == this.star) {
            this.b4.setIcon(var2);
            this.b5.setIcon(this.star);
         } else if (this.b6.getIcon() == this.star) {
            this.b6.setIcon(var2);
            this.b5.setIcon(this.star);
         } else if (this.b8.getIcon() == this.star) {
            this.b8.setIcon(var2);
            this.b5.setIcon(this.star);
         }
      }

      if (var1.getSource() == this.b6) {
         var2 = this.b6.getIcon();
         if (this.b3.getIcon() == this.star) {
            this.b3.setIcon(var2);
            this.b6.setIcon(this.star);
         } else if (this.b5.getIcon() == this.star) {
            this.b5.setIcon(var2);
            this.b6.setIcon(this.star);
         } else if (this.b9.getIcon() == this.star) {
            this.b9.setIcon(var2);
            this.b6.setIcon(this.star);
         }
      }

      if (var1.getSource() == this.b7) {
         var2 = this.b7.getIcon();
         if (this.b4.getIcon() == this.star) {
            this.b4.setIcon(var2);
            this.b7.setIcon(this.star);
         } else if (this.b8.getIcon() == this.star) {
            this.b8.setIcon(var2);
            this.b7.setIcon(this.star);
         }
      }

      if (var1.getSource() == this.b8) {
         var2 = this.b8.getIcon();
         if (this.b7.getIcon() == this.star) {
            this.b7.setIcon(var2);
            this.b8.setIcon(this.star);
         } else if (this.b5.getIcon() == this.star) {
            this.b5.setIcon(var2);
            this.b8.setIcon(this.star);
         } else if (this.b9.getIcon() == this.star) {
            this.b9.setIcon(var2);
            this.b8.setIcon(this.star);
         }
      }

      if (var1.getSource() == this.b9) {
         var2 = this.b9.getIcon();
         if (this.b8.getIcon() == this.star) {
            this.b8.setIcon(var2);
            this.b9.setIcon(this.star);
         } else if (this.b6.getIcon() == this.star) {
            this.b6.setIcon(var2);
            this.b9.setIcon(this.star);
         }
      }

      if (var1.getSource() == this.sample) {
         var2 = this.sample.getIcon();
         if (var2 == this.samicon3) {
            this.sample.setIcon(this.samicon1);
            this.b1.setIcon(this.ic1);
            this.b2.setIcon(this.ic2);
            this.b3.setIcon(this.ic3);
            this.b4.setIcon(this.ic4);
            this.b5.setIcon(this.ic5);
            this.b6.setIcon(this.ic6);
            this.b7.setIcon(this.ic7);
            this.b8.setIcon(this.ic8);
            this.b9.setIcon(this.ic9);
            this.star = this.b9.getIcon();
            this.starB.setIcon(this.ic0);
         } else {
            this.sample.setIcon(this.samicon3);
            this.b1.setIcon(this.ic21);
            this.b2.setIcon(this.ic22);
            this.b3.setIcon(this.ic23);
            this.b4.setIcon(this.ic24);
            this.b5.setIcon(this.ic25);
            this.b6.setIcon(this.ic26);
            this.b7.setIcon(this.ic27);
            this.b8.setIcon(this.ic28);
            this.b9.setIcon(this.ic29);
            this.star = this.b6.getIcon();
            this.starB.setIcon(this.ic20);
         }
      }

   }

   public static void main(String[] var0) {
      new picpuzzle21();
   }
}
