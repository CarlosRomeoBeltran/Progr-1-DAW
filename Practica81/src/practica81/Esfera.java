package practica81;
/** @author carlos*/
public class Esfera {
    private double radio;
    private double area;
    private double volumen;
        
    
    public Esfera(){    /*Constructor por defecto*/
        
    }
    
    public Esfera(double elradio){    /*Constructor con parametros*/
        this.radio = elradio;
        
    }
    public void SetRadio(double elradio){   /*Setter del radio*/
        this.radio = elradio;        
    }
    public double GetRadio(){       /*Getter del radio*/
        return radio;
    }
    public void Area(double elradio){      /*Método para obtener el area*/  /*Realizo las operaciones pertinentes para obtener el area de la esfera*/
        this.area = Math.PI*4*Math.pow(elradio, 2);
    }
    public double GetArea(){
        return area;
    }
    public void Volumen(double elradio){   /*Método para obtener el volumen*/  /*Realizo las operaciones pertinentes para obtener el volumen de la esfera*/
        this.volumen = Math.PI*Math.pow(elradio, 3)*4/3;
    }
    public double GetVolumen(){
        return volumen;
    }
}
