
package calculadora;

import calculadora.Controlador.PrincipalControlador;
import calculadora.Logica.PrincipalLogica;
import calculadora.Vista.Interfaz;

public class Calculadora {

    public static void main(String[] args) {
        
        PrincipalLogica model = new PrincipalLogica();
        Interfaz vista = new Interfaz();
        PrincipalControlador inspector = new PrincipalControlador(model, vista);
        inspector.iniciar();
        vista.setVisible(true);
    }
    
}
