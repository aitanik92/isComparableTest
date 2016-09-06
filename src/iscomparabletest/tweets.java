/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iscomparabletest;
import java.util.Date;
import java.io.*;
/**
 *
 * @author Gaetano
 */
public class tweets implements Comparable<tweets>, Serializable{
    private String mBody;
    private Date mDate;
    
    public tweets(String body, Date datew) 
    {
        mBody = body;
        mDate = datew;
    }
    
    public String getBody(){
        return mBody;
    }
    
    public Date getDate(){
        return mDate;
    }
    
    @Override
    public int compareTo(tweets other)
    {        
        //
        if (equals(other))
        {
            return 0;
        }
       return mDate.compareTo(other.mDate);
}
    
}

