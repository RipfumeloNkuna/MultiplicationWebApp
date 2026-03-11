/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

import java.util.Random;
import javax.ejb.Stateless;
import za.ac.tut.exception.NumberRangeException;

/**
 *
 * @author ripfu
 */
@Stateless
public class multipleCation implements multipleCationLocal {

    public int userAnswer;
    int rand1,rand2;
       
     Random r=new Random();
     
    @Override
    public String multipleQuestion() {
       
        
        rand1=r.nextInt(12)+1;
        rand2=r.nextInt(12)+1;
        
        return rand1+" * "+rand2;
    }


    @Override
    public int checkAnswer(int userAnswer)throws NumberRangeException{
        
        if(userAnswer < 100)
        {
            
        
        int answer=rand1*rand2;
        String message="";
        if(userAnswer==answer)
        {
            message="Correct";
        }
        else{
            message="Wrong";
        }
        return answer;
        
        }
        else {
            throw new NumberRangeException("number must be between 1 and 99");
        }
    }
    
}
