package co.edu.escuelaing.hangman.model;

/**
 * Clase excepción del juego.
 * @author Nicolas Bernal
 */
public class HangmanException extends Exception {
	public static final String CORRECT_LETTERS_INVALID = "El numero de letras correctas no puede ser menor a 0";
    public static final String INCORRECT_LETTERS_INVALID = "El numero de letras incorrectas no puede ser menor a 0.";

    /**
     * Constructor para objetos de la clase HangmanException.
     * @param m Mensaje de la excepción.
     */
    public HangmanException(String m) {
        super(m);
    }
}
