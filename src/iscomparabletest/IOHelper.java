/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iscomparabletest;

import java.io.*;

/**
 *
 * @author Gaetano
 */
public class IOHelper {
    
    public static void save(tweets[] tweetsToSave){
        try {
           FileOutputStream  fos = new FileOutputStream("tweets.dat");
           ObjectOutputStream oos = new ObjectOutputStream(fos);
           oos.writeObject(tweetsToSave);
            } 
        catch (IOException ioe) 
        {
           System.out.println("Problem saving.");
           ioe.printStackTrace();
        }
    }
    
    public static tweets[] load(){
        
        //empty tweets array
        tweets[] myTweets = new tweets[0]; 
        
        try {
           FileInputStream  fis = new FileInputStream("tweets.dat");
           ObjectInputStream ois = new ObjectInputStream(fis);
           myTweets = (tweets[])ois.readObject();
            } 
        catch (Exception ioe) 
        {
           System.out.println("Problem reading from disk.");
           ioe.printStackTrace();
        }
        return myTweets;
    }
    
}
