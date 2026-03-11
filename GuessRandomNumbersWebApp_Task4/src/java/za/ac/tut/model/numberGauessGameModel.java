/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

import exception.NumberRangeException;
import java.util.Random;

/**
 *
 * @author ripfu
 */
public class numberGauessGameModel {
    
  
    public int userNumber;
    public int computerNumber;
    
    
    public int guessComputer (int userNumber) throws NumberRangeException
    {
        
       
        
        if(!isvalid(userNumber))
        {
           throw new NumberRangeException("the number must be between 1 and 10");
        }
        
         computerNumber=0;
        
        Random rand=new Random();
        
        computerNumber=rand.nextInt(10)+1;
        
        return computerNumber;
    }
    
    public boolean isvalid(int userNumber)
    {
        boolean valid=false;
        if(userNumber>0 && userNumber<=10)
        {
           valid=true; 
        }
        
        return valid;
    }
}

