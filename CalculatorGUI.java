import java.awt.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.event.*;
public class CalculatorGUI extends JFrame{
	StringBuilder s=new StringBuilder();
	StringBuilder s2=new StringBuilder();
	CalculatorGUI()
	{
		JPanel p1=new JPanel();
		Font f1=new Font("Metro",Font.BOLD,20);
		JTextField textField =new JTextField("Enter Expression");
		textField.setFont(f1);
		textField.setBackground(Color.GREEN);
		textField.setForeground(Color.BLACK);
		textField.setCursor(new Cursor(Cursor.TEXT_CURSOR));
		textField.setBorder(new LineBorder(Color.BLACK,2));
		textField.setPreferredSize(new Dimension(250,50));

		JButton jbt0=new JButton(""+0);
		jbt0.setBackground(Color.GREEN);
		jbt0.setForeground(Color.BLACK);
		jbt0.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				s.append(0);
				s2.append(0);
				textField.setText(s.toString());
			}
		});
		jbt0.setToolTipText("Press to Type 0 ");

		JButton jbt1=new JButton(""+1);
		jbt1.setBackground(Color.GREEN);
		jbt1.setForeground(Color.BLACK);
		jbt1.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				s.append(1);
				s2.append(1);
				textField.setText(s.toString());
			}
		});
		jbt1.setToolTipText("Press to Type 1 ");

		JButton jbt2=new JButton(""+2);
		jbt2.setBackground(Color.GREEN);
		jbt2.setForeground(Color.BLACK);
		jbt2.setToolTipText("Press to Type 2 ");
		jbt2.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				s.append(2);
				s2.append(2);
				textField.setText(s.toString());
			}
		});

		JButton jbt3=new JButton(""+3);
		jbt3.setBackground(Color.GREEN);
		jbt3.setForeground(Color.BLACK);
		jbt3.setToolTipText("Press to Type 3");
		jbt3.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				s.append(3);
				s2.append(3);
				textField.setText(s.toString());
			}
		});

		JButton jbt4=new JButton(""+4);
		jbt4.setBackground(Color.GREEN);
		jbt4.setForeground(Color.BLACK);
		jbt4.setToolTipText("Press to Type 4 ");
		jbt4.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				s.append(4);
				s2.append(4);
				textField.setText(s.toString());
			}
		});

		JButton jbt5=new JButton(""+5);
		jbt5.setBackground(Color.GREEN);
		jbt5.setForeground(Color.BLACK);
		jbt5.setToolTipText("Press To Type 5");
		jbt5.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				s.append(5);
				s2.append(5);
				textField.setText(s.toString());
			}
		});

		JButton jbt6=new JButton(""+6);
		jbt6.setBackground(Color.GREEN);
		jbt6.setForeground(Color.BLACK);
		jbt6.setToolTipText("Press to Type 6 ");
		jbt6.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				s.append(6);
				s2.append(6);
				textField.setText(s.toString());
			}
		});

		JButton jbt7=new JButton(""+7);
		jbt7.setBackground(Color.GREEN);
		jbt7.setForeground(Color.BLACK);
		jbt7.setToolTipText("Press to Type 7 ");
		jbt7.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				s.append(7);
				s2.append(7);
				textField.setText(s.toString());
			}
		});

		JButton jbt8=new JButton(""+8);
		jbt8.setBackground(Color.GREEN);
		jbt8.setForeground(Color.BLACK);
		jbt8.setToolTipText("Press to Type 8 ");
		jbt8.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				s.append(8);
				s2.append(8);
				textField.setText(s.toString());
			}
		});

		JButton jbt9=new JButton(""+9);
		jbt9.setBackground(Color.GREEN);
		jbt9.setForeground(Color.BLACK);
		jbt9.setToolTipText("Press to Type 9 ");
		p1.setLayout(new GridLayout(4,3,5,5));
		jbt9.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				s.append(9);
				s2.append(9);
				textField.setText(s.toString());
			}
		});

		JButton jbt10=new JButton("+\n");
		jbt10.setFont(f1);
		jbt10.setBackground(Color.GREEN);
		jbt10.setForeground(Color.BLACK);
		jbt10.setToolTipText("Press to Type + ");
		jbt10.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				s.append(" + ");
				s2.append(",+,");
				textField.setText(s.toString());
			}
		});

		JButton jbt11=new JButton("-");
		jbt11.setFont(f1);
		jbt11.setBackground(Color.GREEN);
		jbt11.setForeground(Color.BLACK);
		jbt11.setToolTipText("Press to Type - ");
		jbt11.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				s.append(" -  ");
				s2.append(",-,");
				textField.setText(s.toString());
			}
		});

		JButton jbt12=new JButton("*");
		jbt12.setFont(f1);
		jbt12.setBackground(Color.GREEN);
		jbt12.setForeground(Color.BLACK);
		jbt12.setToolTipText("Press to *");
		jbt12.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				s.append(" * ");
				s2.append(",*,");
				textField.setText(s.toString());
			}
		});

		JButton jbt13=new JButton("/");
		jbt13.setFont(f1);
		jbt13.setBackground(Color.GREEN);
		jbt13.setForeground(Color.BLACK);
		jbt13.setToolTipText("Press to *");
		jbt13.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				s.append(" / ");
				s2.append(",/,");
				textField.setText(s.toString());
			}
		});

		JButton jbtPow=new JButton("^");
		jbtPow.setFont(f1);
		jbtPow.setBackground(Color.GREEN);
		jbtPow.setForeground(Color.BLACK);
		jbtPow.setToolTipText("Function to be decided");
		jbtPow.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				s.append(" ^ ");
				s2.append(",^,");
				textField.setText(s.toString());
			}
		});

		JButton jbtSquare=new JButton("^2");
		jbtSquare.setFont(f1);
		jbtSquare.setBackground(Color.GREEN);
		jbtSquare.setForeground(Color.BLACK);
		jbtSquare.setToolTipText("Function to be decided");
		jbtSquare.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				s.append(" ^2 ");
				s2.append(",^,2");
				textField.setText(s.toString());
			}
		});
		JButton jbtPoint=new JButton(".");
		jbtPoint.setFont(f1);
		jbtPoint.setBackground(Color.GREEN);
		jbtPoint.setForeground(Color.BLACK);
		jbtPoint.setToolTipText("Press to .");
		jbtPoint.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				s.append(".");
				s2.append(".");
				textField.setText(s.toString());
			}
		});

		JButton jbtEqual=new JButton("=");
		jbtEqual.setFont(f1);
		jbtEqual.setBackground(Color.GREEN);
		jbtEqual.setForeground(Color.BLACK);
		jbtEqual.setToolTipText("Press to calculate");
		jbtEqual.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				String a=s2.toString();
				String [] part =a.split(",");
				double val1=Double.parseDouble(part[0]);
				double val2=Double.parseDouble(part[2]);
				s=new StringBuilder();
				s2=new StringBuilder();
				switch(part[1].charAt(0))
				{
				case '+':
					s.append(Calculator.add(val1,val2));
					s2.append(Calculator.add(val1,val2));
					break;
				case '-':
					s.append(Calculator.sub(val1,val2));
					s2.append(Calculator.add(val1,val2));
					break;
				case '*':
					s.append(Calculator.mul(val1,val2));
					s2.append(Calculator.add(val1,val2));
					break;
				case '/':
					s.append(Calculator.div(val1,val2));
					s2.append(Calculator.add(val1,val2));
					break;
				case '^':
					s.append(Calculator.pow(val1,val2));
					s2.append(Calculator.pow(val1,val2));
					break;
				default:
					s.append("Math Error");
					s2.append("Math Error");
				}
				textField.setText(s.toString());
			}
		});

		JButton jbtDel=new JButton("Del");
		jbtDel.setFont(f1);
		jbtDel.setBackground(Color.GREEN);
		jbtDel.setForeground(Color.BLACK);
		jbtDel.setToolTipText("Press to DEl");
		jbtDel.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				if(s.length()>1)
				{
					s.deleteCharAt(s.length()-1);
					if(s2.length()>1)
					s2.deleteCharAt(s2.length()-1);
				}
				else
				{
					s=new StringBuilder();
					s2=new StringBuilder();
				}
				textField.setText(s.toString());
			}
		});

		JButton jbtClr=new JButton("Clr");
		jbtClr.setFont(f1);
		jbtClr.setBackground(Color.GREEN);
		jbtClr.setForeground(Color.BLACK);
		jbtClr.setToolTipText("Press to Clear");
		jbtClr.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e)
			{
				s=new StringBuilder();
				s2=new StringBuilder();
				textField.setText(s.toString());
			}
		});

		p1.setBorder(new TitledBorder("Keypad"));
		p1.setCursor(new Cursor(Cursor.HAND_CURSOR));
		p1.setLayout(new GridLayout(5,4,5,5));
		p1.add(jbtClr);
		p1.add(jbtDel);
		p1.add(jbtPow);
		p1.add(jbtSquare);
		p1.add(jbt7);
		p1.add(jbt8);
		p1.add(jbt9);
		p1.add(jbt13);
		p1.add(jbt4);
		p1.add(jbt5);
		p1.add(jbt6);
		p1.add(jbt12);
		p1.add(jbt1);
		p1.add(jbt2);
		p1.add(jbt3);
		p1.add(jbt10);
		p1.add(jbtPoint);
		p1.add(jbt0);
		p1.add(jbtEqual);
		p1.add(jbt11);

		setLayout(new BorderLayout());
		add(textField,BorderLayout.NORTH);
		add(p1,BorderLayout.CENTER);
	}

	public static void main(String [] args)
	{
		CalculatorGUI c1=new CalculatorGUI();
		c1.setTitle("My Phone");
		c1.setSize(300,400);
		c1.setLocationRelativeTo(null);
		c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		c1.setVisible(true);
	}
}