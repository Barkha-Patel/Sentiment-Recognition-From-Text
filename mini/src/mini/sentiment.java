/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mini;
import java.io.IOException;
import edu.stanford.nlp.tagger.maxent.MaxentTagger;
import java.util.*; 
/**
 *
 * @author Barkha
 */
public class sentiment {
    
public static void main(String[] args) throws IOException,
ClassNotFoundException {
 
// Initialize the tagger
MaxentTagger tagger = new MaxentTagger("taggers/english-left3words-distsim.tagger");
 
// The sample string
String s = new String();
        String key= new String();
        String sample=new String();
        //reading string 
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the text");
        s=in.nextLine();
        List<String> lemmas = new LinkedList<String>();
       norm nm = new norm();
        lemmas=nm.lemmatize(s);
        sample=lemmas.toString();
        System.out.println(sample);

System.out.println("Input: " + sample);
sample=sample.toLowerCase();
sample=sample.replaceAll("[^a-zA-Z\\s]"," ");
String tagged = tagger.tagString(sample);
StringTokenizer st=new StringTokenizer(tagged," ");

String cat = new String(" ");

System.out.println("Output: ");
while(st.hasMoreTokens())
{
    key=st.nextToken();
    System.out.println(key);
    
}
    //output the tagged sample string onto your console
    
    


}
}
