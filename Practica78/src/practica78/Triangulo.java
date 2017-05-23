package practica78;
/* @author carlos romeo */
public class Triangulo { 
    private double area;
    private double base;
    private double altura;
    
    public void SetArea(double labase, double laaltura){    /*Realizo las operaciones pertinentes para obtener el area del triangulo*/
        area = (labase * laaltura) / 2;
    }
    public double GetArea(){
        return area;
    }
}
