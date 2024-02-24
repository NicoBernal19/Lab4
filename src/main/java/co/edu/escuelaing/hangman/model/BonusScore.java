package co.edu.escuelaing.hangman.model;
import org.springframework.stereotype.Component;

/**
 * Puntaje del juego que inicia con 0 puntos, se bonifica con 10 puntos cada letra correcta, cada letra incorrecta se penaliza con 5 puntos y el puntaje 
 * minimo es 0.
 * @author Nicolas Bernal
 */
@Component("bonusScore")
public class BonusScore implements GameScore {

	/**
	 * Metodo que calcula el puntaje del juego.
	 * @param correctCount Numero de letras correctas.
	 * @param incorrectCount Numero letras incorrectas.
	 * @return Numero entero con el puntaje.
	 * @pre Calculo de las letras correctas e incorrectas.
	 * @pos Calculo del puntaje de acuerdo a las condiciones establecidas.
	 * @throws HangmanException CORRECT_LETTERS_INVALID, si el numero de letras correctas es negativo.
	 * 							INCORRECT_LETTERS_INVALID, si el numero de letras incorrectas es negativo.
	 */
	public int calculateScore(int correctCount, int incorrectCount) throws HangmanException {
		if (correctCount < 0) throw new HangmanException(HangmanException.CORRECT_LETTERS_INVALID);
		if (incorrectCount < 0) throw new HangmanException(HangmanException.INCORRECT_LETTERS_INVALID);
		int result = correctCount * 10 - incorrectCount * 5;
		return (result >= 0 ? result : 0);
	}
}
