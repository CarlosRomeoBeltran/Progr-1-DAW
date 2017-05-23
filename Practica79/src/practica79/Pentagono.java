package practica79;
/** @author carlos romeo*/
public class Pentagono {

    private double area;
    private double apotema;
    private double perimetro;
    
    public Pentagono(){ /*Constructor por defecto*/
    
    }
    
    public Pentagono(double elperimetro, double elapotema){     /*Constructor con parametros*/
        this.perimetro = elperimetro;
        this.apotema = elapotema;
    }

    public void SetPerimetro(double elperimetro) {      /*Setter de perimetro*/
        this.perimetro = elperimetro;
    }

    public double GetPerimetro() {      /*Getter de perimetro*/
        return perimetro;
    }

    public void SetApotema(double elapotema) {      /*Setter de apotema*/
        this.apotema = elapotema;
    }

    public double GetApotema() {        /*Getter de apotema*/
        return apotema;
    }
    
    public void Area(double apotema, double perimetro){     /*Metodo para obtener area*/ /*Realizo las operaciones pertinentes para obtener el area del pentagono*/
        this.area = (perimetro * apotema) / 2;  
    }
    public double GetArea(){
        return area;
    }
}

