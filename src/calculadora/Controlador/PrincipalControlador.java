
package calculadora.Controlador;

import calculadora.Logica.PrincipalLogica;
import calculadora.Vista.Interfaz;
import calculadora.Vista.InterfazInformacion;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class PrincipalControlador implements ActionListener{
    
    //Argumentos 
    PrincipalLogica control;
    Interfaz ventana;

    
    //Constructores 
    
    public PrincipalControlador(){
    }
    
    public PrincipalControlador(PrincipalLogica control, Interfaz ventana) {
        
        this.control = control;
        this.ventana = ventana;
        
        //Funciones Trigonometricas
        this.ventana.jSeno.addActionListener(this);
        this.ventana.jCoseno.addActionListener(this);
        this.ventana.jTangente.addActionListener(this);
        this.ventana.jCosecante.addActionListener(this);
        this.ventana.jSecante.addActionListener(this);
        this.ventana.jCotagente.addActionListener(this);

        //Funciones Logaritmicas
        this.ventana.jLogaritmoNatural.addActionListener(this);
        this.ventana.jlogaraitmo.addActionListener(this);

        //Operaciones Basicas
        this.ventana.jResta.addActionListener(this);
        this.ventana.jSuma.addActionListener(this);
        this.ventana.jDivision.addActionListener(this);
        this.ventana.jProducto.addActionListener(this);
        this.ventana.jBorrar.addActionListener(this);

        
        //Para Pasar a la ventana Información
        this.ventana.jFuncionamiento.addActionListener(this);
    }
    
    
    public void iniciar(){
    	ventana.setTitle("Calculadora Cientifica");
        ventana.setLocationRelativeTo(null);
        
    }
    
  

    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
            JButton boton = (JButton) ae.getSource();
            String op = boton.getText();
            //ventana.CajaResultado.setText(String.valueOf(control.getResultado()));
            
            
            
            switch(op){

                //operaciones basicas
                
                case "+":
                    control.setA(Double.parseDouble(ventana.jNumA.getText()));
                    control.setB(Double.parseDouble(ventana.jNumB.getText()));
                    control.suma();
                    ventana.CajaResultado.setText(String.valueOf(control.getResultado()));
                    break;
                   
                case "-":
                    control.setA(Double.parseDouble(ventana.jNumA.getText()));
                    control.setB(Double.parseDouble(ventana.jNumB.getText()));
                    control.resta();
                    ventana.CajaResultado.setText(String.valueOf(control.getResultado()));
                    break;

                case "*":
                    control.setA(Double.parseDouble(ventana.jNumA.getText()));
                    control.setB(Double.parseDouble(ventana.jNumB.getText()));
                    control.producto();
                    ventana.CajaResultado.setText(String.valueOf(control.getResultado()));
                    break;

                case "/":
                    control.setA(Double.parseDouble(ventana.jNumA.getText()));
                    control.setB(Double.parseDouble(ventana.jNumB.getText()));
                    control.cociente();
                    ventana.CajaResultado.setText(String.valueOf(control.getResultado()));
                    break;

               
                //Funciones Trigonometricas
                case "sin":
                    control.setTrigonometricas(Double.parseDouble(ventana.CajaResultado.getText()));
                    control.seno();
                    ventana.CajaResultado.setText(String.valueOf(control.getResultado()));
                    break;

                case "cos":
                    control.setTrigonometricas(Double.parseDouble(ventana.CajaResultado.getText()));
                    control.coseno();
                    ventana.CajaResultado.setText(String.valueOf(control.getResultado()));
                    break;

                case "tan":
                    control.setTrigonometricas(Double.parseDouble(ventana.CajaResultado.getText()));
                    control.tangente();
                    ventana.CajaResultado.setText(String.valueOf(control.getResultado()));
                    break;

                case "sec":
                    control.setTrigonometricas(Double.parseDouble(ventana.CajaResultado.getText()));
                    control.secante();
                    ventana.CajaResultado.setText(String.valueOf(control.getResultado()));
                    break;

                case "csc":
                    control.setTrigonometricas(Double.parseDouble(ventana.CajaResultado.getText()));
                    control.cosecante();
                    ventana.CajaResultado.setText(String.valueOf(control.getResultado()));
                    break;

                case "cot":
                    control.setTrigonometricas(Double.parseDouble(ventana.CajaResultado.getText()));
                    control.cotangente();
                    ventana.CajaResultado.setText(String.valueOf(control.getResultado()));
                    break;

                //Funciones Logaritmicas
                case "ln":
                    control.setLogaritmicas(Double.parseDouble(ventana.CajaResultado.getText()));
                    control.logaritmoNatural();
                    ventana.CajaResultado.setText(String.valueOf(control.getResultado()));
                    break;

                case "log":
                    control.setLogaritmicas(Double.parseDouble(ventana.CajaResultado.getText()));
                    control.logaritmoBaseDiez();
                    ventana.CajaResultado.setText(String.valueOf(control.getResultado()));
                    break;
                    
                case "C":
                    ventana.CajaResultado.setText("0");
                    ventana.jNumA.setText("0");
                    ventana.jNumB.setText("0");
                    break;
                    
                case "Funcionamiento":
                    
                    InterfazInformacion ventnaInformacion = new InterfazInformacion();
                    ventnaInformacion.setVisible(true);
                    
            }
    }
}
