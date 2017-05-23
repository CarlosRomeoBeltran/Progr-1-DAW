package practica78;
/* @author carlos romeo */
public class Triangulo { 
    private double area;
    private double base;
    private double altura;
    
    public Triangulo(){     /*Constructor por defecto*/
        
    }
    public Triangulo(double labase, double laaltura){       /*Constructor por parametros*/
        this.base = labase;
        this.altura = laaltura;
    }
    
    public void SetBase(double labase){     /*Setter de la base*/
        this.base = labase;               
    }
    
    public void SetAltura(double laaltura){     /*Setter de la altura*/
        this.altura = laaltura;               
    }

    public double getBase() {       /*Getter de la base*/
        return base;
    }

    public double getAltura() {     /*Getter de la altura*/
        return altura;
    }
    

    public double GetArea(){    /*Realizo las operaciones pertinentes para obtener el area del triangulo*/
        area = (this.base * this.altura) / 2;
        return area;
    }
}
