package Ejercicio2JuanJPuertas;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

/* la clase MiObjectOuputStream quedar�a con los siguientes m�todos*/
public class MiObjectOutputStream extends ObjectOutputStream {

	//Constructor sin par�metros
	protected MiObjectOutputStream() throws IOException, SecurityException {
		super();

	}

	//Constructor que recibe como par�metro un objeto OutputStream
	public MiObjectOutputStream(OutputStream out) throws IOException {
		super(out);

	}

	/*redefinici�n del m�todo que escribe la cabecera para que no haga
	nada en caso de que el fichero ya tenga datos
	 */
	protected void writeStreamHeader(){

	}

}
