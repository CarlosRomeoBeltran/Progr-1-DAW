package practica77;
/**
 *
 * @author carlos
 */
public class Circulo {  
    
    private double area;
    private double radio;
    private double longitud;
    
    public Circulo(){   /*Contructor por defecto*/
        area=0;
        longitud=0;
    }
    
    public Circulo(int elradio){    /*Constructor por parámetros*/
        this.radio = elradio;
    }
    
    public void SetArea(double elradio){        /*Setter del area*/  /*Realizo las operaciones pertinentes para obtener el area del circulo*/
        this.area =  Math.pow(elradio, 2)* Math.PI;
    }
    public double GetArea(){        /*Getter del area*/
        return area;
    }
    
    public void SetLongitud(double elradio){    /*Setter de la longitud*/  /*Realizo las operaciones pertinentes para obtener la longitud*/
        this.longitud = 2*Math.PI*elradio;
    }
    public double GetLongitud(){    /*Getter de la longitud*/
        return longitud;
    }
}
    

