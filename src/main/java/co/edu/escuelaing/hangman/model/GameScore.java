package co.edu.escuelaing.hangman.model;

/**
 * Puntaje del juego del ahorcado.
 * @author Nicolas Bernal
 */
public interface GameScore {
	
	/**
	 * Metodo que calcula el puntaje del juego de ahorcado.
	 * @param correctCount Numero de letras correctas.
	 * @param incorrectCount Numero de letras incorrectas.
	 * @return Numero entero con el puntaje.
	 * @pre Calculo de las letras correctas e incorrectas.
	 * @pos Calculo del puntaje de acuerdo a las condiciones establecidas.
	 * @throws HangmanException CORRECT_LETTERS_INVALID, si el numero de letras correctas es negativo.
	 * 							INCORRECT_LETTERS_INVALID, si el numero de letras incorrectas es negativo.
	 */
	public abstract int calculateScore(int correctCount, int incorrectCount) throws HangmanException;
}
