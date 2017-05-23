package practica79;
/** @author carlos romeo*/
public class Pentagono {

    private double area;
    private double apotema;
    private double perimetro;

    public void SetPerimetro(double elperimetro) {
        this.perimetro = elperimetro;
    }

    public double GetPerimetro() {
        return perimetro;
    }

    public void SetApotema(double elapotema) {
        this.apotema = elapotema;
    }

    public double GetApotema() {
        return apotema;
    }
    
    public void SetArea(double apotema, double perimetro){      /*Realizo las operaciones pertinentes para obtener el area del pentagono*/
        this.area = (perimetro * apotema) / 2;  
    }
    public double GetArea(){
        return area;
    }
}

