package mini;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.Vector;





public class SWN3 {
        private String pathToSWN = "C:/Users/Barkha/Documents/sentiwordnet.txt";
    private HashMap<String, String> _dict;

    public SWN3(){

        _dict = new HashMap<String, String>();
        HashMap<String, Vector<Double>> _temp = new HashMap<String, Vector<Double>>();
        try{
            BufferedReader csv =  new BufferedReader(new FileReader(pathToSWN));
            String line = "";           
            while((line = csv.readLine()) != null)
            {
                String[] data = line.split("\t");
                Double score = Double.parseDouble(data[2])-Double.parseDouble(data[3]);
                String[] words = data[4].split(" ");
                for(String w:words)
                {
                    String[] w_n = w.split("#");
                    w_n[0] += "#"+data[0];
                    int index = Integer.parseInt(w_n[1])-1;
                    if(_temp.containsKey(w_n[0]))
                    {
                        Vector<Double> v = _temp.get(w_n[0]);
                        if(index>v.size())
                            for(int i = v.size();i<index; i++)
                                v.add(0.0);
                        v.add(index, score);
                        _temp.put(w_n[0], v);
                    }
                    else
                    {
                        Vector<Double> v = new Vector<Double>();
                        for(int i = 0;i<index; i++)
                            v.add(0.0);
                        v.add(index, score);
                        _temp.put(w_n[0], v);
                    }
                }
            }
            Set<String> temp = _temp.keySet();
            for (Iterator<String> iterator = temp.iterator(); iterator.hasNext();) {
                String word = (String) iterator.next();
                Vector<Double> v = _temp.get(word);
                double score = 0.0;
                double sum = 0.0;
                for(int i = 0; i < v.size(); i++)
                    score += ((double)1/(double)(i+1))*v.get(i);
                for(int i = 1; i<=v.size(); i++)
                    sum += (double)1/(double)i;
                score /= sum;
                String sent = "";               
                if(score>=0.75)
                    sent = "strong_positive";
                else
                if(score > 0.25 && score<=0.5)
                    sent = "positive";
                else
                if(score > 0 && score>=0.25)
                    sent = "weak_positive";
                else
                if(score < 0 && score>=-0.25)
                    sent = "weak_negative";
                else
                if(score < -0.25 && score>=-0.5)
                    sent = "negative";
                else
                if(score<=-0.75)
                    sent = "strong_negative";
                _dict.put(word, sent);
            }
        }
        catch(Exception e){e.printStackTrace();}        
    }

    public Double extract(String word)
{
    Double total = new Double(0);
    if(_dict.get(word+"#n") != null)
         total = _dict.get(word+"#n") + total;
    if(_dict.get(word+"#a") != null)
        total = _dict.get(word+"#a") + total;
    if(_dict.get(word+"#r") != null)
        total = _dict.get(word+"#r") + total;
    if(_dict.get(word+"#v") != null)
        total = _dict.get(word+"#v") + total;
    return total;
}

    public String classifytweet(){
        String[] words = twit.split("\\s+"); 
        double totalScore = 0, averageScore;
        for(String word : words) {
            word = word.replaceAll("([^a-zA-Z\\s])", "");
            if (_sw.extract(word) == null)
                continue;
            totalScore += _sw.extract(word);
        }
        Double AverageScore = totalScore;

        if(averageScore>=0.75)
            return "very positive";
        else if(averageScore > 0.25 && averageScore<0.5)
            return  "positive";
        else if(averageScore>=0.5)
            return  "positive";
        else if(averageScore < 0 && averageScore>=-0.25)
            return "negative";
        else if(averageScore < -0.25 && averageScore>=-0.5)
            return "negative";
        else if(averageScore<=-0.75)
            return "very negative";
        return "neutral";
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
    }