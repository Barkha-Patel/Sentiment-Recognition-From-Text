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
//Creating file of positive words
public class positive {
     Formatter x;
     String pp = new String();
    String p="Absolutely Abundant Accept \n" +
"Acclaimed Accomplishment Achievement \n" +
"Action Active Activist \n" +
"Acumen Adjust Admire \n" +
"Adopt Adorable Adored \n" +
"Adventure Affirmation Affirmative \n" +
"Affluent Agree Airy \n" +
"Alive Alliance Ally \n" +
"Alter Amaze Amity \n" +
"Animated Answer Appreciation \n" +
"Approve Aptitude Artistic \n" +
"Assertive Astonish Astounding \n" +
"Astute Attractive Authentic \n" +
"Basic Beaming Beautiful \n" +
"Believe Benefactor Benefit \n" +
"Bighearted Blessed Bliss \n" +
"Bloom Bountiful Bounty \n" +
"Brave Bright Brilliant \n" +
"Bubbly Bunch Burgeon \n" +
"Calm Care Celebrate \n" +
"Certain Change Character \n" +
"Charitable Charming Cheer \n" +
"Cherish Clarity Classy \n" +
"Clean Clever Closeness \n" +
"Commend Companionship Complete \n" +
"Comradeship Confident Connect \n" +
"Connected Constant Content \n" +
"Conviction Copious Core \n" +
"Coupled Courageous Creative \n" +
"Cuddle Cultivate Cure \n" +
"Curious Cute Dazzling \n" +
"Delight Direct Discover \n" +
"Distinguished Divine Donate \n" +
"Each Day Eager Earnest \n" +
"Easy Ecstasy Effervescent \n" +
"Efficient Effortless Electrifying \n" +
"Elegance Embrace Encompassing \n" +
"Encourage Endorse Energized \n" +
"Energy Enjoy Enormous \n" +
"Enthuse Enthusiastic Entirely \n" +
"Essence Established Esteem \n" +
"Everyday Everyone Excited \n" +
"Exciting Exhilarating Expand \n" +
"Explore Express Exquisite \n" +
"Exultant Faith Familiar \n" +
"Family Famous Feat \n" +
"Fit Flourish Fortunate \n" +
"Fortune Freedom Fresh \n" +
"Friendship Full Funny \n" +
"Gather Generous Genius \n" +
"Genuine Give Glad \n" +
"Glow Good Gorgeous \n" +
"Grace Graceful Gratitude \n" +
"Green Grin Group \n" +
"Grow Handsome Happy \n" +
"Harmony Healed Healing \n" +
"Healthful Healthy Heart \n" +
"Hearty Heavenly Helpful \n" +
"Here Highest Good Hold \n" +
"Holy Honest Honor \n" +
"Hug affirm  allow \n" +
"willing Can \n" +
" create follow \n" +
" realize action  trust \n" +
"Idea Ideal Imaginative \n" +
"Increase Incredible Independent \n" +
"Ingenious Innate Innovate \n" +
"Inspire Instantaneous Instinct \n" +
"Intellectual Intelligence Intuitive \n" +
"Inventive Joined Jovial \n" +
"Joy Jubilation Keen \n" +
"Key Kind Kiss \n" +
"Knowledge Laugh Leader \n" +
"Learn Legendary Let Go \n" +
"Light Lively Love \n" +
"Loveliness Lucidity Lucrative \n" +
"Luminous Maintain Marvelous \n" +
"Master Meaningful Meditate \n" +
"Mend Metamorphosis Mind-Blowing \n" +
"Miracle Mission Modify \n" +
"Motivate Moving Natural \n" +
"Nature Nourish Nourished \n" +
"Novel Now Nurture \n" +
"Nutritious One Open \n" +
"Openhanded Optimistic Paradise \n" +
"Party Peace Perfect \n" +
"Phenomenon Pleasure Plenteous \n" +
"Plentiful Plenty Plethora \n" +
"Poise Polish Popular \n" +
"Positive Powerful Prepared \n" +
"Pretty Principle Productive \n" +
"Project Prominent Prosperous \n" +
"Protect Proud Purpose \n" +
"Quest Quick Quiet \n" +
"Ready Recognize Refinement \n" +
"Refresh Rejoice Rejuvenate \n" +
"Relax Reliance Rely \n" +
"Remarkable Renew Renowned \n" +
"Replenish Resolution Resound \n" +
"Resources Respect Restore \n" +
"Revere Revolutionize Rewarding \n" +
"Rich Robust Rousing \n" +
"Safe Secure See \n" +
"Sensation Serenity Shift \n" +
"Shine Show Silence \n" +
"Simple Sincerity Smart \n" +
"Smile Smooth Solution \n" +
"Soul Sparkling Spirit \n" +
"Spirited Spiritual Splendid \n" +
"Spontaneous Still Stir \n" +
"Strong Style Success \n" +
"Sunny Support Sure \n" +
"Surprise Sustain Synchronized \n" +
"Team Thankful Therapeutic \n" +
"Thorough Thrilled Thrive \n" +
"Today Together Tranquil \n" +
"Transform Triumph Trust \n" +
"Truth Unity Unusual \n" +
"Unwavering Upbeat Value \n" +
"Vary Venerate Venture \n" +
"Very Vibrant Victory \n" +
"Vigorous Vision Visualize \n" +
"Vital Vivacious Voyage \n" +
"Wealthy Welcome Well \n" +
"Whole Wholesome Willing \n" +
"Wonder Wonderful Wondrous \n" +
"Xanadu Yes Yippee \n" +
"Young Youth Youthful \n" +
"Zeal Zest Zing \n" +
"Zip Like";
    
    
   
     
    void openFile()
    {
        try{
        x = new Formatter("positive.txt");
        }
        catch (Exception e)
        {
            System.out.println("Error");
        }
    }
    
    void addRecords()
    {  StringTokenizer so = new StringTokenizer(p," \n");
        
        while(so.hasMoreTokens())
        {   pp=so.nextToken();
            pp=pp.toLowerCase();
            x.format("%s",pp);
            x.format("%s"," ");
        }
    }
    
    void closeFile()
    {
        x.close();
    }
    
  
}
    