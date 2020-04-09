
package calculadora.Logica;


public class PrincipalLogica {
    //Variables
    double a, b, resultado, trigonometricas, logaritmicas;
    
    //Constructores
    public PrincipalLogica(){
    }

    public PrincipalLogica(double a, double b, double resultado, double trigonometricas, double logaritmicas) {
        this.a = a;
        this.b = b;
        this.resultado = resultado;
        this.trigonometricas = trigonometricas;
        this.logaritmicas = logaritmicas;
    }

    
    
    //getter
    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getResultado() {
        return resultado;
    }

    public double getTrigonometricas() {
        return trigonometricas;
    }

    public double getLogaritmicas() {
        return logaritmicas;
    }
    

    
    //setter
    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setResultado(double resultado) {
        this.resultado = resultado;
    }

    public void setTrigonometricas(double trigonometricas) {
        this.trigonometricas = trigonometricas; //* (Math.PI/180.0);
    }

    public void setLogaritmicas(double logaritmicas) {
        this.logaritmicas = logaritmicas;
    }
    
    
    //Metodos
    
    //Metodos de las operaciones basicas

    public double suma(){
        this.resultado = this.a + this.b;
        return this.resultado;
    }
    
    public double resta(){
        this.resultado = this.a - this.b;
        return this.resultado;
    }

    public double producto(){
        this.resultado = this.a * this.b;
        return this.resultado;
    }

    public double cociente(){
        this.resultado = this.a / this.b;
        return this.resultado;
    }



    //Metodos de las funciones trigonometricas

    public double seno(){
        this.resultado = Math.sin(this.trigonometricas);
        return this.resultado;
    }
    
    public double coseno(){
        this.resultado = Math.cos(this.trigonometricas);
        return this.resultado;
    }
    
    public double tangente(){
        this.resultado = Math.tan(this.trigonometricas);
        return this.resultado;
    }

    public double cotangente(){
        this.resultado = 1 / Math.tan(this.trigonometricas);
        return this.resultado;
    }

    public double cosecante(){
        this.resultado = 1 / Math.sin(this.trigonometricas);
        return this.resultado;
    }

    public double secante(){
        this.resultado = 1 / Math.cos(this.trigonometricas);
        return this.resultado;
    }

    
    //Metodos funciones logaritmicas

    /*Math.log() me devuleve el logaritmo neperiano de un numero x, 
    *se debe de recordar que ellogartimo neperiando tambien se conoce
    *logaritmo natural
    */
    public double logaritmoNatural(){
        this.resultado = Math.log(this.logaritmicas);
        return this.resultado;
    }
    
    public double logaritmoBaseDiez(){
        this.resultado = Math.log10(this.logaritmicas);
        return this.resultado;
    }


}
