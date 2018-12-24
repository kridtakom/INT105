/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import array.NewClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Kridtakom
 */
public class ExamCheckingTest {
    private NewClass testEx;
    private char[] stdAnswer;
    private char[] solAnswer;
    public ExamCheckingTest() {
       testEx=new NewClass();
    }
    @Test
    public void allStudentAnswerIncorrect(){
        stdAnswer = new char [] {'D', 'B', 'C', 'A', 'A'};
        solAnswer = new char[] {'B', 'C', 'D', 'B', 'B'};
        int expectResult=-5;
        int result=NewClass.examChecking(stdAnswer, solAnswer);
        assertEquals(expectResult, result);
    }

    @Test
    public void allStudentAnswerCorrect(){
        stdAnswer = new char [] {'C', 'D', 'A','E','D'};
        solAnswer = new char[] {'C', 'D', 'A','E','D'};
        int expectResult=10;
        int result=NewClass.examChecking(stdAnswer, solAnswer);
        assertEquals(expectResult, result);
    }
    
    @Test
    public void someStudentAnswerCorrect(){
        stdAnswer = new char [] {'B', 'B', 'C', 'D', 'A'};
        solAnswer = new char[] {'B', 'C', 'D', 'A', 'A'};
        int expectResult=1;
        int result=NewClass.examChecking(stdAnswer, solAnswer);
        assertEquals(expectResult, result);
    }
  
    @Test
    public void notEquallyNumberOfExam1(){
        stdAnswer = new char [] {'A', 'D', 'C'};
        solAnswer = new char[] {'A', 'D', 'C', 'D', 'A'};
        int expectResult=4;
        int result=NewClass.examChecking(stdAnswer, solAnswer);
        assertEquals(expectResult, result);  
    }
    
    @Test
    public void notEquallyNumberOfExam2(){
        stdAnswer = new char [] {'B', 'D', 'A'};
        solAnswer = new char[] {'B', 'D', 'C', 'D', 'A'};
        int expectResult=1;
        int result=NewClass.examChecking(stdAnswer, solAnswer);
        assertEquals(expectResult, result);  
    }
}