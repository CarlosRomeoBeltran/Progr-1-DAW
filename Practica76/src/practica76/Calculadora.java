package practica76;
/** @author carlos*/
public class Calculadora {
    private int numero1;
    private int numero2;
    private int resultado;
    public Calculadora(){
        resultado=0;      
    }   
    public Calculadora(int num1, int num2){
        this.numero1=num1;
        this.numero2=num2;

    }
    public void SetSuma(int num1, int num2){        /*Setter para la suma*/
        this.resultado=num1 + num2;    
    }
    public void SetResta(int num1, int num2){       /*Setter para la resta*/
        this.resultado=num1 - num2;    
    }
    public void SetMultiplicacion(int num1, int num2){      /*Setter para la multiplicacion*/
        this.resultado=num1 * num2;    
    }
    public void SetDivision(int num1, int num2){        /*Setter para la division*/
        this.resultado=num1 / num2;    
    }
    public void SetResto(int num1, int num2){       /*Setter para el resto*/
        this.resultado=num1 % num2;    
    }
    
    public int GetResultado(){          /*Getter para obtener el resultado*/
        return resultado;
    }
    
}
