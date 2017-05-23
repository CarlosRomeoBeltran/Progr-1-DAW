package practica80;
/** @author carlos romeo*/
public class Cubo {
    private double arista;
    private double area;
    private double volumen;
    
    public Cubo(){ /*Constructor por defecto*/
        
    }
    
    public Cubo(double elarista){   /*Constructor por parametros*/
        this.arista = elarista;
    }
    
    public void SetArista(double elarista){     /*Setter del arista*/
        this.arista = elarista;        
    }
    public double GetArista(){      /*Getter del arista*/
        return arista;
    }
    public void Area(double elarista){      /*Método del area*/ /*Realizo las operaciones pertinentes para obtener el area del cubo*/
        this.area = 6*Math.pow(elarista,2);
    }
    public double GetArea(){
        return area;
    }
    public void Volumen(double elarista){   /*Método del volumen*/ /*Realizo las operaciones pertinentes para obtener el volumen del cubo*/
        this.volumen = Math.pow(elarista, 3);
    }
    public double GetVolumen(){
        return volumen;
    }
}
