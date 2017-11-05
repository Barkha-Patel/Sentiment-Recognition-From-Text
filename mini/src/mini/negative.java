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
// creating file of negative words
public class negative {
     Formatter y;
    String n="abysmal\n" +
" adverse\n" +
" alarming\n" +
" angry\n" +
" annoy\n" +
" anxious\n" +
" apathy\n" +
" appalling\n" +
" atrocious\n" +
" awful\n" +
 "bye\n"+
" bad\n" +
" banal\n" +
" barbed\n" +
" belligerent\n" +
" bemoan\n" +
" beneath\n" +
" boring\n" +
" broken\n" +
" callous\n" +
" can't\n" +
" clumsy\n" +
" coarse\n" +
" cold\n" +
" coldhearted\n" +
" collapse\n" +
" confused\n" +
" contradictory\n" +
" contrary\n" +
" corrosive\n" +
" corrupt\n" +
" crazy\n" +
" creepy\n" +
" criminal\n" +
" cruel\n" +
" cry\n" +
" cutting\n" +
" dead\n" +
" decaying\n" +
" damage\n" +
" damaging\n" +
" dastardly\n" +
" deplorable\n" +
" depressed\n" +
" deprived\n" +
" deformed\n" +
" deny\n" +
" despicable\n" +
" detrimental\n" +
" dirty\n" +
" disease\n" +
" disgusting\n" +
" disheveled\n" +
" dishonest\n" +
" dishonorable\n" +
" dismal\n" +
" distress\n" +
" don't\n" +
" dreadful\n" +
" dreary\n" +
"E\n" +
" enraged\n" +
" eroding\n" +
" evil\n" +
" fail\n" +
" faulty\n" +
" fear\n" +
" feeble\n" +
" fight\n" +
" filthy\n" +
" foul\n" +
" frighten\n" +
" frightful\n" +
" gawky\n" +
" ghastly\n" +
" grave\n" +
" greed\n" +
" grim\n" +
" grimace\n" +
" gross\n" +
" grotesque\n" +
" gruesome\n" +
" guilty\n" +
" haggard\n" +
" hard\n" +
" hard-hearted\n" +
" harmful\n" +
" hate\n" +
" hideous\n" +
" homely\n" +
" horrendous\n" +
" horrible\n" +
" hostile\n" +
" hurt\n" +
" hurtful\n" +
" icky\n" +
" ignore\n" +
" ignorant\n" +
" ill\n" +
" immature\n" +
" imperfect\n" +
" impossible\n" +
" inane\n" +
" inelegant\n" +
" infernal\n" +
" injure\n" +
" injurious\n" +
" insane\n" +
" insidious\n" +
" insipid\n" +
" jealous\n" +
" junky\n" +
" lose\n" +
" lousy\n" +
" lumpy\n" +
" malicious\n" +
" mean\n" +
" menacing\n" +
" messy\n" +
" misshapen\n" +
" missing\n" +
" misunderstood\n" +
" moan\n" +
" moldy\n" +
" monstrous\n" +
" naive\n" +
" nasty\n" +
" naughty\n" +
" negate\n" +
" negative\n" +
" never\n" +
" no\n" +
" nobody\n" +
" nondescript\n" +
" nonsense\n" +
" not\n" +
" noxious\n" +
" objectionable\n" +
" odious\n" +
" offensive\n" +
" old\n" +
" oppressive\n" +
" pain\n" +
" perturb\n" +
" pessimistic\n" +
" petty\n" +
" plain\n" +
" poisonous\n" +
" poor\n" +
" prejudice\n" +
" questionable\n" +
" quirky\n" +
" quit\n" +
" reject\n" +
" renege\n" +
" repellant\n" +
" reptilian\n" +
" repulsive\n" +
" repugnant\n" +
" revenge\n" +
" revolting\n" +
" rocky\n" +
" rotten\n" +
" rude\n" +
" ruthless\n" +
" sad\n" +
" savage\n" +
" scare\n" +
" scary\n" +
" scream\n" +
" severe\n" +
" shoddy\n" +
" shocking\n" +
" sick\n" +
" sickening\n" +
" sinister\n" +
" slimy\n" +
" smelly\n" +
" sobbing\n" +
" sorry\n" +
" spiteful\n" +
" sticky\n" +
" stinky\n" +
" stormy\n" +
" stressful\n" +
" stuck\n" +
" stupid\n" +
" substandard\n" +
" suspect\n" +
" suspicious\n" +
" tense\n" +
" terrible\n" +
" terrifying\n" +
" threatening\n" +
" ugly\n" +
" undermine\n" +
" unfair\n" +
" unfavorable\n" +
" unhappy\n" +
" unhealthy\n" +
" unjust\n" +
" unlucky\n" +
" unpleasant\n" +
" upset\n" +
" unsatisfactory\n" +
" unsightly\n" +
" untoward\n" +
" unwanted\n" +
" unwelcome\n" +
" unwholesome\n" +
" unwieldy\n" +
" unwise\n" +
" upset\n" +
" vice\n" +
" vicious\n" +
" vile\n" +
" villainous\n" +
" vindictive\n" +
" wary\n" +
" weary\n" +
" wicked\n" +
" woeful\n" +
" worthless\n" +
" wound\n" +
" yell\n" +
" yucky" ;
    
    void openFilee()
    {
        try{
        y = new Formatter("negative.txt");
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
    }
    
    void addRecordss()
    {  
       y.format("%s",n);   
    }
    
    void closeFilee()
    {
        y.close();
    }
}
    