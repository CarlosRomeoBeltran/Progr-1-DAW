package practica78;
/* @author carlos romeo */
public class Triangulo { 
    private double area;
    private double base;
    private double altura;
    
    public Triangulo(){
        
    }
    public Triangulo(double labase, double laaltura){
        this.base = labase;
        this.altura = laaltura;
    }
    
    public void SetBase(double labase){
        this.base = labase;               
    }
    
    public void SetAltura(double laaltura){
        this.altura = laaltura;               
    }
    

    public double GetArea(){    /*Realizo las operaciones pertinentes para obtener el area del triangulo*/
        area = (this.base * this.altura) / 2;
        return area;
    }
}
