package practica81;
/** @author carlos*/
public class Esfera {
    private double radio;
    private double area;
    private double volumen;
        
    public void SetRadio(double elradio){
        this.radio = elradio;        
    }
    public double GetRadio(){
        return radio;
    }
    public void SetArea(double elradio){        /*Realizo las operaciones pertinentes para obtener el area de la esfera*/
        this.area = Math.PI*4*Math.pow(elradio, 2);
    }
    public double GetArea(){
        return area;
    }
    public void SetVolumen(double elradio){     /*Realizo las operaciones pertinentes para obtener el volumen de la esfera*/
        this.volumen = Math.PI*Math.pow(elradio, 3)*4/3;
    }
    public double GetVolumen(){
        return volumen;
    }
}
