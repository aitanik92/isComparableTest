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
        
        System.out.println(tweet.getBody() + " - " + tweet.getDate().toString());
        System.out.println("---");
        System.out.println(otherTweet.getBody() + " - " + otherTweet.getDate().toString());
        
        //start comparing
        if (tweet != otherTweet) 
        {
            System.out.println("they are different.");
        }
        
        //sorting (COMMIT TEST)
        Arrays.sort(tweetArray);
    }
    
}
