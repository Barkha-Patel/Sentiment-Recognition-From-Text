/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates                               
 * and open the template in the editor.
 */
package mini;
import java.util.*; 

/**
 *
 * @author Barkha
 */

// The Whole Logical Code to Determine Emotion
public class emotion
{
    public static void main(String ars[])
    {
        int psentiment=0 ,nsentiment=0,f;
        String s = new String();
        String key= new String();
        //reading string 
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the text");
        s=in.nextLine();
        readfile rf = new readfile();
        
        
        
        //tokenizing text
        StringTokenizer st = new StringTokenizer(s," =,;!?");
        while(st.hasMoreTokens())
        {
             f=0;
             key=st.nextToken();
             key=key.toLowerCase();
             System.out.println(key);
             
            
             
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
            System.out.println("The overall sentiment of the text is POSITIVE");
       else if (psentiment==0 && nsentiment==0)
            System.out.println("There is NO EMOTION");
       else if (psentiment==nsentiment)
            System.out.println("The overall sentiment of text is MIXED, as same positive and negative notions");
        else
            System.out.println("The overall sentiment of text is NEGATIVE");
     }
}
    
    
    
    



    
