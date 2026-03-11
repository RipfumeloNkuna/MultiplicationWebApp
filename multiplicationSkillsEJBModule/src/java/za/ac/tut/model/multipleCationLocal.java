/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.model;

import javax.ejb.Local;
import za.ac.tut.exception.NumberRangeException;

/**
 *
 * @author ripfu
 */
@Local
public interface multipleCationLocal {

    String multipleQuestion();

    int checkAnswer(int userAnswer)throws NumberRangeException;
    
}
