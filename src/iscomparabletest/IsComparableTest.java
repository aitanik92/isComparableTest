/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iscomparabletest;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.Collections;
import java.util.List;


/**
 *
 * @author Gaetano
 */
public class IsComparableTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Program started, generating tweets...");
        tweets tweet = new tweets("THIS IS THE FIRST TWEET", new Date());
        
//sleep
        try {
            Thread.sleep(4000);
        } catch (InterruptedException ex) {
            Logger.getLogger(IsComparableTest.class.getName()).log(Level.SEVERE, null, ex);
        }
//other tweet after 4 seconds
        tweets otherTweet = new tweets("THIS IS THE SECOND TWEET", new Date());
        
        tweets[] tweetArray = new tweets[2];
        
        tweetArray[0] = tweet;
        tweetArray[1] = otherTweet;
        
        
        System.out.println("Tweets before sorting:");
        System.out.println(tweetArray[0].getBody() + " - " + tweetArray[0].getDate().toString());
        System.out.println("---");
        System.out.println(tweetArray[1].getBody() + " - " + tweetArray[1].getDate().toString());
        
        //reversing array (very n00b way)
        tweets tempTweet = tweetArray[0];
        tweetArray[0] = tweetArray[1];
        tweetArray[1] = tempTweet;
        
        //sorting
        Arrays.sort(tweetArray);
        
        System.out.println();
        System.out.println();
        System.out.println("Tweets after sorting:");
        System.out.println(tweetArray[0].getBody() + " - " + tweetArray[0].getDate().toString());
        System.out.println("---");
        System.out.println(tweetArray[1].getBody() + " - " + tweetArray[1].getDate().toString());
        
        //serializing and saving class to disk (tweets.dat)
        IOHelper.save(tweetArray);
        
        //trying to reload from disk
        tweetArray = IOHelper.load();
        
    }
    
}
