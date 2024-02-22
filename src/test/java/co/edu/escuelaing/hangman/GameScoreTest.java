package co.edu.escuelaing.hangman;

import static org.junit.Assert.*;
import org.junit.Test;
import co.edu.escuelaing.hangman.model.*;

/**
 * ClasesEquivalencia: El numero de letras correctas no es menor a 0, el numero de letras incorrectas no es menor a cero, 
 * el numero de letras correctas es menor a 0 y el numero de letras incorrectas es menor a cero.
 * CondicionesFrontera: Numero de letras incorrectas es -1 y 0, numero de letras correctas es -1 y 0.
 * @author Nicolas Bernal
 */
public class GameScoreTest {
	
	/*
	 * Pruebas de BonusScore
	 */
    @Test
    public void validateItThrowsAnExceptionWhenNumberOfCorrectLettersIsMinusOneBonusScore() {
        try { 
        	BonusScore score = new BonusScore();
        	score.calculateScore(-1, 5);
            fail("No lanzo ninguna excepcion");
        } catch (HangmanException e) {
            assertEquals(HangmanException.CORRECT_LETTERS_INVALID, e.getMessage());
        }  
    } 
    
    @Test
    public void validateItThrowsAnExceptionWhenNumberOfIncorrectLettersIsMinusOneBonusScore() {
        try { 
        	BonusScore score = new BonusScore();
        	score.calculateScore(5, -1);
            fail("No lanzo ninguna excepcion");
        } catch (HangmanException e) {
            assertEquals(HangmanException.INCORRECT_LETTERS_INVALID, e.getMessage());
        }  
    } 
    
    @Test
    public void validateScoreIs35With6CorrectLettersAnd5IncorrectLettersBonusScore() {
    	try {
    		BonusScore score = new BonusScore();
			assertEquals(score.calculateScore(6, 5), 35);
		} catch (HangmanException e) {
			fail("Lanzo una excepcion");
		} 
    } 
    
    @Test
    public void validateItDoesNotThrowsAnExceptionWhenNumberOfCorrectLettersIsZeroBonusScore() {
    	try {
    		BonusScore score = new BonusScore();
			assertEquals(score.calculateScore(0, 5), -20);
		} catch (HangmanException e) {
			fail("Lanzo una excepcion");
		} 
    } 
    
    @Test
    public void validateItDoesNotThrowsAnExceptionWhenNumberOfIncorrectLettersIsZeroBonusScore() {
    	try {
    		BonusScore score = new BonusScore();
			assertEquals(score.calculateScore(5, 0), 80);
		} catch (HangmanException e) {
			fail("Lanzo una excepcion");
		} 
    }
    
    /*
	 * Pruebas de OriginalScore
	 */ 
    @Test
    public void validateItThrowsAnExceptionWhenNumberOfCorrectLettersIsMinusOneOriginalScore() {
        try { 
        	OriginalScore score = new OriginalScore();
        	score.calculateScore(-1, 5);
            fail("No lanzo ninguna excepcion");
        } catch (HangmanException e) {
            assertEquals(HangmanException.CORRECT_LETTERS_INVALID, e.getMessage());
        }  
    } 
    
    @Test
    public void validateItThrowsAnExceptionWhenNumberOfIncorrectLettersIsMinusOneOriginalScore() {
        try { 
        	OriginalScore score = new OriginalScore();
        	score.calculateScore(5, -1);
            fail("No lanzo ninguna excepcion");
        } catch (HangmanException e) {
            assertEquals(HangmanException.INCORRECT_LETTERS_INVALID, e.getMessage());
        }  
    } 
    
    @Test
    public void validateScoreIs50With3CorrectLettersAnd5IncorrectLettersOriginalScore() {
    	try {
    		OriginalScore score = new OriginalScore();
			assertEquals(score.calculateScore(3, 5), 50);
		} catch (HangmanException e) {
			fail("Lanzo una excepcion");
		} 
    } 
    
    @Test
    public void validateItDoesNotThrowsAnExceptionWhenNumberOfCorrectLettersIsZeroOriginalScore() {
    	try {
    		OriginalScore score = new OriginalScore();
			assertEquals(score.calculateScore(0, 5), 50);
		} catch (HangmanException e) {
			fail("Lanzo una excepcion");
		} 
    } 
    
    @Test
    public void validateItDoesNotThrowsAnExceptionWhenNumberOfIncorrectLettersIsZeroOriginalScore() {
    	try {
    		OriginalScore score = new OriginalScore();
			assertEquals(score.calculateScore(5, 0), 100);
		} catch (HangmanException e) {
			fail("Lanzo una excepcion");
		} 
    }
	
	/*
	 * Pruebas de PowerScore
	 */
    @Test
    public void validateItThrowsAnExceptionWhenNumberOfCorrectLettersIsMinusOnePowerScore() {
        try { 
        	PowerScore score = new PowerScore();
        	score.calculateScore(-1, 5);
            fail("No lanzo ninguna excepcion");
        } catch (HangmanException e) {
            assertEquals(HangmanException.CORRECT_LETTERS_INVALID, e.getMessage());
        }  
    } 
    
    @Test
    public void validateItThrowsAnExceptionWhenNumberOfIncorrectLettersIsMinusOnePowerScore() {
        try { 
        	PowerScore score = new PowerScore();
        	score.calculateScore(5, -1);
            fail("No lanzo ninguna excepcion");
        } catch (HangmanException e) {
            assertEquals(HangmanException.INCORRECT_LETTERS_INVALID, e.getMessage());
        }  
    } 
    
    @Test
    public void validateScoreIs93With3CorrectLettersAnd4IncorrectLettersPowerScore() {
    	try {
    		PowerScore score = new PowerScore();
			assertEquals(score.calculateScore(3, 4), 93);
		} catch (HangmanException e) {
			fail("Lanzo una excepcion");
		} 
    } 
    
    @Test
    public void validateScoreIs500WhenScoreIsMoreThan500PowerScore() {
    	try {
    		PowerScore score = new PowerScore();
			assertEquals(score.calculateScore(4, 10), 500);
		} catch (HangmanException e) {
			fail("Lanzo una excepcion");
		} 
    } 
     
    
    @Test
    public void validateItDoesNotThrowsAnExceptionWhenNumberOfCorrectLettersIsZeroPowerScore() {
    	try {
    		PowerScore score = new PowerScore();
			assertEquals(score.calculateScore(0, 5), 0);
		} catch (HangmanException e) {
			fail("Lanzo una excepcion");
		} 
    } 
    
    @Test
    public void validateItDoesNotThrowsAnExceptionWhenNumberOfIncorrectLettersIsZeroPowerScore() {
    	try {
    		PowerScore score = new PowerScore();
			assertEquals(score.calculateScore(5, 0), 125);
		} catch (HangmanException e) {
			fail("Lanzo una excepcion");
		} 
    }  
}
