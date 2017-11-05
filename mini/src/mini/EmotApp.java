/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini;

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

import java.util.StringTokenizer;


/*
 */
//Applet to make the process interactive
public class EmotApp extends Applet implements ActionListener {

    
    TextArea ta;
    Button sub;
    String msg;
    public void init() {
        
        String val ="Enter Text To Determine Sentiment";
         ta = new TextArea(val,50,50);
         Font font = new Font(Font.SERIF,Font.PLAIN, 40); 
         ta.setFont(font);
         ta.selectAll();
         add(ta);
         
         sub = new Button("Submit");
         sub.setPreferredSize(new Dimension(300, 100));
         Font fontt = new Font(Font.SERIF, Font.BOLD, 36); 
         sub.setFont(fontt);
        add(sub);
       
        sub.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent ae)
    {
        String temp=ta.getText();
        
        int psentiment=0 ,nsentiment=0,f;
        
        String key;
        //reading string 
        
        readfile rf = new readfile();
        
        
        
        //tokenizing text
        StringTokenizer st = new StringTokenizer(temp," =,;!?");
        while(st.hasMoreTokens())
        {
             f=0;
             key=st.nextToken();
             key=key.toLowerCase();
             
            
             
             rf.openFileP();
               while(rf.z.hasNext())
                     {
                         if(key.equals(rf.readFileP()))
                         {
                             
                             psentiment++;
                             f=1;
                             break;
                         }
                       
                     }
                      rf.closeFileP();
             
             
                         if(f!=1)
                         {
                             rf.openFileN();
                             while(rf.w.hasNext())
                             {
                             if(key.equals(rf.readFileN()))
                             {
                                
                               nsentiment++;
                               break;
                             }
                             }
                             rf.closeFileN();
                         }
                         
        }
        if (psentiment>nsentiment)
            msg="The overall sentiment of the text is POSITIVE";
         else if (psentiment==0 && nsentiment==0)
            msg="There is NO EMOTION";
        else if (psentiment==nsentiment)
            msg="The overall sentiment of text is MIXED";
        else
            msg="The overall sentiment of text is NEGATIVE";
        repaint();
     }
    
    public void paint(Graphics g)
    {
        Font fonts = new Font(Font.SERIF, Font.BOLD, 40); 
        g.setFont(fonts);
        
        g.drawString(msg,6,60);
    }
}
     
