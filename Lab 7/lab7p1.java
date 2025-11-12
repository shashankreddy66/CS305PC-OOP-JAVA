import java.awt.Button;
import java.awt.event.ActionListener;
import java.awt.*;

class Lab7P1{
    public static void main(String[] args) {
    	  Frame f = new Frame()
        Button b  = new Button("click");
        b.addActionListener(new ActionListener() {
            @Override	
            public void actionPerfomed(ActionPerfomed a){
                System.out.println("hello");
            }  	
        });
    }
