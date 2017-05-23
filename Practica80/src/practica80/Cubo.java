package practica80;
/** @author carlos romeo*/
public class Cubo {
    private double arista;
    private double area;
    private double volumen;
    
    public void SetArista(double elarista){
        this.arista = elarista;        
    }
    public double GetArista(){
        return arista;
    }
    public void SetArea(double elarista){       /*Realizo las operaciones pertinentes para obtener el area del cubo*/
        this.area = 6*Math.pow(elarista,2);
    }
    public double GetArea(){
        return area;
    }
    public void SetVolumen(double elarista){    /*Realizo las operaciones pertinentes para obtener el volumen del cubo*/
        this.volumen = Math.pow(elarista, 3);
    }
    public double GetVolumen(){
        return volumen;
    }
}
