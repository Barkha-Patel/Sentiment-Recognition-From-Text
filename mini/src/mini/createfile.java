/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini;

/**
 *
 * @author Barkha
 */
//class to actually createfile 
public class createfile {
    public static void main(String args[])
    {
        positive po = new positive();
        po.openFile();
        po.addRecords();
        po.closeFile();
        
        negative ne = new negative();
        ne.openFilee();
        ne.addRecordss();
        ne.closeFilee();
    }
    
}
