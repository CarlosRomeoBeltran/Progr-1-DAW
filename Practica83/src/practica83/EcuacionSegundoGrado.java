package practica83;
/*@author Carlos Romeo*/
public class EcuacionSegundoGrado {
    private double a;
    private double b;
    private double c;
    private double resultadomas;
    private double resultadomenos;
    
    public EcuacionSegundoGrado(){

    }
    public void SetA(double x){
        this.a=x;
    }
    public double GetA(){
        return a;
    }
    public void SetB(double y){
        this.b=y;
    }
    public double GetB(){
        return b;
    }
    public void SetC(double z){
        this.c=z;
    }
    public double GetC(){
        return c;
    }
    public void SetEcuacionSegundoGradoMas(double x, double y, double z){               /*resolver la ecuacion de segundo grado para la opción con la suma*/
        resultadomas=(double)(-y + (Math.sqrt(Math.pow(y,2) - (4 * x * z)))) / (2*x);
    }
    public double GetMas(){
        return resultadomas;
    }
    public void SetEcuacionSegundoGradoMenos(double x, double y, double z){             /*resolver la ecuacion de segundo grado para la opción con la resta*/
        resultadomenos=(double)(-y - (Math.sqrt(Math.pow(y,2) - (4 * x * z)))) / (2*x);
    }    
    public double GetMenos(){
        return resultadomenos;
    }
}
