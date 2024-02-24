package co.edu.escuelaing.hangman.model;
import org.springframework.stereotype.Component;

/**
 * Puntaje del juego que inicia con 0 puntos, la i-esima letra correcta se bonifica con 5^i puntos, se penaliza
 * con 8 puntos cada letra incorrecta y el puntaje minimo es 0. Si sobrepasa 500 puntos, el puntaje es 500 siempre.
 * @author Nicolas Bernal
 */
@Component("powerScore")
public class PowerScore implements GameScore {

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
		int result = (int) (Math.pow(5, correctCount) - incorrectCount * 8);
		return (result >= 0 ? (result <= 500 ? result : 500 ) : 0);
	}
}
