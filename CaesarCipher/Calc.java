import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.util.LinkedList;

public class Calc extends Frame implements ActionListener, WindowListener {
	Button but1, but2, but3, but4, but5, but6, but7, but8, but9, but10, add,
			sub, mul, div, modulo, dot, equal, clear, delete, replay;
	BorderLayout b = new BorderLayout();
	GridLayout g = new GridLayout(5, 4);
	Panel mainpan, displaypan, numberpan, numpan2, numpan3;
	TextField display;
	Panel span;
	String input, inside, output, input1, input2, input3, input4, input5,
			inputop;
	int set, get, index;
	LinkedList<String> li = new LinkedList<String>();

	public Calc() {
		mainpan = new Panel();
		displaypan = new Panel();
		numberpan = new Panel();
		numpan2 = new Panel();
		numpan3 = new Panel();
		display = new TextField(50);
		but1 = new Button("1");
		but1.addActionListener(this);
		but2 = new Button("2");
		but2.addActionListener(this);
		but3 = new Button("3");
		but3.addActionListener(this);
		but4 = new Button("4");
		but4.addActionListener(this);
		but5 = new Button("5");
		but5.addActionListener(this);
		but6 = new Button("6");
		but6.addActionListener(this);
		but7 = new Button("7");
		but7.addActionListener(this);
		but8 = new Button("8");
		but8.addActionListener(this);
		but9 = new Button("9");
		but9.addActionListener(this);
		but10 = new Button("0");
		but10.addActionListener(this);
		add = new Button("+");
		add.addActionListener(this);
		sub = new Button("-");
		sub.addActionListener(this);
		mul = new Button("*");
		mul.addActionListener(this);
		div = new Button("/");
		div.addActionListener(this);
		modulo = new Button("%");
		modulo.addActionListener(this);
		dot = new Button(".");
		dot.addActionListener(this);
		equal = new Button("=");
		equal.addActionListener(this);
		replay = new Button("<<");
		replay.addActionListener(this);
		clear = new Button("C");
		clear.addActionListener(this);
		delete = new Button("D");
		delete.addActionListener(this);
		// ac=new Button("AC");
		// ac.addActionListener(this);
		// off=new Button("OFF");
		// off.addActionListener(this);

		mainpan.setLayout(b);
		numberpan.setLayout(g);
		displaypan.add(display);
		// numberpan.add(off);
		numberpan.add(replay);
		numberpan.add(clear);
		numberpan.add(delete);
		numberpan.add(modulo);
		numberpan.add(but9);
		numberpan.add(but8);
		numberpan.add(but7);
		numberpan.add(div);
		numberpan.add(but6);
		numberpan.add(but5);
		numberpan.add(but4);
		numberpan.add(mul);
		numberpan.add(but1);
		numberpan.add(but2);
		numberpan.add(but3);
		numberpan.add(sub);
		numberpan.add(but10);
		numberpan.add(dot);
		numberpan.add(equal);
		numberpan.add(add);

		mainpan.add(displaypan, BorderLayout.NORTH);
		mainpan.add(numberpan, BorderLayout.CENTER);
		add(mainpan);
		setSize(500, 300);
		setVisible(true);
		// span=new Panel();
		// span.setLayout(new BorderLayout());
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == but1) {
			input = display.getText();
			inside = "1";
			output = input + inside;
			display.setText(output);
		}
		if (e.getSource() == but2) {
			input = display.getText();
			inside = "2";
			output = input + inside;
			display.setText(output);
		}
		if (e.getSource() == but3) {
			input = display.getText();
			inside = "3";
			output = input + inside;
			display.setText(output);
		}
		if (e.getSource() == but4) {
			input = display.getText();
			inside = "4";
			output = input + inside;
			display.setText(output);
		}
		if (e.getSource() == but5) {
			input = display.getText();
			inside = "5";
			output = input + inside;
			display.setText(output);
		}
		if (e.getSource() == but6) {
			input = display.getText();
			inside = "6";
			output = input + inside;
			display.setText(output);
		}
		if (e.getSource() == but7) {
			input = display.getText();
			inside = "7";
			output = input + inside;
			display.setText(output);
		}
		if (e.getSource() == but8) {
			input = display.getText();
			inside = "8";
			output = input + inside;
			display.setText(output);
		}
		if (e.getSource() == but9) {
			input = display.getText();
			inside = "9";
			output = input + inside;
			display.setText(output);
		}
		if (e.getSource() == but10) {
			input = display.getText();
			inside = "0";
			output = input + inside;
			display.setText(output);
		}
		if (e.getSource() == dot) {
			input = display.getText();
			inside = ".";
			output = input + inside;
			display.setText(output);
		}
		if (e.getSource() == add) {
			input1 = display.getText();
			li.add(input1);
			index++;
			display.setText("");
			set = 1;
		}
		if (e.getSource() == sub) {
			input2 = display.getText();
			li.add(input2);
			index++;
			display.setText("");
			set = 2;
		}
		if (e.getSource() == mul) {
			input3 = display.getText();
			li.add(input3);
			index++;
			display.setText("");
			set = 3;
		}
		if (e.getSource() == div) {
			input4 = display.getText();
			li.add(input4);
			index++;
			display.setText("");
			set = 4;
		}
		if (e.getSource() == modulo) {
			input5 = display.getText();
			li.add(input5);
			index++;
			display.setText("");
			set = 5;
		}
		if (e.getSource() == equal) {
			inputop = display.getText();
			if (e.getSource() == equal) {
				inputop = display.getText();
				if (set == 1) {
					get = Integer.parseInt(input1) + Integer.parseInt(inputop);
					display.setText(String.valueOf(get));
				} else if (set == 2) {
					get = Integer.parseInt(input2) - Integer.parseInt(inputop);
					display.setText(String.valueOf(get));
				} else if (set == 3) {
					get = Integer.parseInt(input3) * Integer.parseInt(inputop);
					display.setText(String.valueOf(get));
				}
				if (set == 4) {
					try {
						int p = Integer.parseInt(inputop);
						if (p != 0) {
							get = Integer.parseInt(input4)
									/ Integer.parseInt(inputop);
							display.setText(String.valueOf(get));
						} else
							display.setText("infinity");
					} catch (Exception exp) {
						System.out.println("Error:" + exp);
					}
				}
				if (set == 5) {
					try {
						int p = Integer.parseInt(inputop);
						if (p != 0) {
							get = Integer.parseInt(input5)
									% Integer.parseInt(inputop);
							display.setText(String.valueOf(get));
						} else
							display.setText("infinity");
					} catch (Exception exp) {
						System.out.println("Error:" + exp);
					}
				}

				if (e.getSource() == clear)
					System.exit(0);
				if (e.getSource() == replay) {
					display.setText(li.get(index - 1));
					index--;
				}
				if (e.getSource() == delete) {
					dispose();

				}
			}
		}

	}

	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowClosed(WindowEvent arg0) {
		System.exit(0);

	}

	public void windowClosing(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public static void main(String[] args) {
		new Calc();
	}

}
