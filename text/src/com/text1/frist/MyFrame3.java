 package com.text1.frist;
import java.awt.*;
import java.awt.event.*;
public class MyFrame3 extends Frame {
	private static final long serialVersionUID = 1L;
	Button bt1,bt2,bt3,bt4;
    Label bl1,bl2,bl3;
    TextField tx1,tx2,tx3;
    Panel p1,p2,p3,p4;
    public MyFrame3(){
        setTitle("布局管理器示例");
        setLayout(new GridLayout(4,1));
        bl1=new Label("操作数1");
        bl2=new Label("操作数2");
        bl3=new Label("运算结果");
        tx1=new TextField(20);
        tx2=new TextField(20);
        tx3=new TextField(20);
        tx3.setEditable(false);
        p1=new Panel();p1.add(bl1);p1.add(tx1);
        p2=new Panel();p2.add(bl2);p2.add(tx2);
        p3=new Panel();p3.add(bl3);p3.add(tx3);
        bt1=new Button("   +    ");
        bt2=new Button("   -    ");
        bt3=new Button("   *    ");
        bt4=new Button("   /    ");
        p4=new Panel();p4.add(bt1);p4.add(bt2);p4.add(bt3);p4.add(bt4);
        add(p1);add(p2);add(p3);add(p4);
        setSize(500,300);
        setBackground(Color.WHITE);
        setVisible(true);  
        tx1.addTextListener(new CheckText(tx1));
        tx2.addTextListener(new CheckText(tx2));
        bt1.addActionListener(new Calculator());
        bt2.addActionListener(new Calculator());
        bt3.addActionListener(new Calculator());
        bt4.addActionListener(new Calculator());
       this.addWindowListener(new CloseWindow());
    }
     public class CloseWindow implements WindowListener {
        public void windowClosing(WindowEvent e){
            dispose();
        }
        public void windowOpened(WindowEvent e){}
        public void windowIconified(WindowEvent e){}
        public void windowDeiconified(WindowEvent e){}
        public void windowClosed(WindowEvent e){}
        public void windowActivated(WindowEvent e){}
        public void windowDeactivated(WindowEvent e){}
    }
    public static void main(String[]args){
        new MyFrame3();
    }

    class Calculator implements ActionListener{
        public void actionPerformed(ActionEvent e){
            Button bt=(Button)e.getSource();
            String s1=tx1.getText();
            String s2=tx2.getText();
            String s3="";
            double d1=Double.parseDouble(s1);
            double d2=Double.parseDouble(s2);
            double d3=0.0;
            if(bt==bt1){
                d3=d1+d2;
            }
            else if(bt==bt2){
                d3=d1-d2;
            }
            else if(bt==bt3){
                d3=d1*d2;
            }
            else if(bt==bt4){
                if(d2==0)
                    s3="Chu shu wei ling cuo wu !";
                else
                    d3=d1/d2;
            }
            s3=s3+String.valueOf(d3);
            tx3.setText(s3);
        }
    }

}

class CheckText implements TextListener{
    TextField tx;
    CheckText(TextField tx){
        this.tx=tx;
    }
    public void textValueChanged(TextEvent e){
        int i=tx.getCaretPosition();
        if(i>0){
            StringBuffer s=new StringBuffer(tx.getText());
            char ch=s.charAt(i-1);//光标前一个字符位置
            if((ch<'0'||ch>'9')&&(ch!='.')){
                s.deleteCharAt(i-1);
                tx.setText(s.toString());
                tx.setCaretPosition(i-1);
            }

        }
    }
}