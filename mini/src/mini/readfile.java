/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini;
import java.io.*;
import java.util.*;
import java.lang.*;


/**
 *
 * @author Barkha
 */
//class and methods to read the positive and negative file
public class readfile {
    
    Scanner z;
    Scanner w;
    void openFileP()
    {
        try{
        z =new Scanner (new File("positive.txt"));
        }
        catch (Exception e)
        {
            System.out.println("Error no such file");
        }
    }
    
    String readFileP()
    {
        String g = z.next();
        return g;
    }
    
    void closeFileP()
    {
        z.close();
    }
    
    void openFileN()
    {
        try{
        w =new Scanner (new File("negative.txt"));
        }
        catch (Exception e)
        {
            System.out.println("Error no such file");
        }
        
    }
    
    String readFileN()
    {
        String i = w.next();
        return i;
    }
    
    void closeFileN()
    {
        w.close();
    }
}
