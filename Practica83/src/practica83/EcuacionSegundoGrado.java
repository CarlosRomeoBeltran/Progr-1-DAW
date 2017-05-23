package practica83;
/*@author Carlos Romeo*/
public class EcuacionSegundoGrado {
    private double a;
    private double b;
    private double c;
    private double resultadomas;
    private double resultadomenos;
    
    public EcuacionSegundoGrado(){  /*Constructor por defecto*/

    }
    
    public EcuacionSegundoGrado(double x, double y, double z){  /*Constructor por parametros*/
        this.a = x;
        this.b = y;
        this.c = z;
    }
    
    public void SetA(double x){     /*Setter de a*/
        this.a=x;
    }
    public double GetA(){       /*Getter de a*/
        return a;
    }
    public void SetB(double y){     /*Setter de b*/
        this.b=y;
    }
    public double GetB(){       /*Getter de b*/
        return b;
    }
    public void SetC(double z){     /*Setter de c*/
        this.c=z;
    }
    public double GetC(){       /*Getter de c*/
        return c;
    }
    public void EcuacionSegundoGradoMas(double x, double y, double z){        /*Metodo para el resultado con el operador suma*/ /*resolver la ecuacion de segundo grado para la opción con la suma*/
        resultadomas=(double)(-y + (Math.sqrt(Math.pow(y,2) - (4 * x * z)))) / (2*x);
    }
    public double GetMas(){     /*Mediante este "getter" obtengo el resultado con +*/
        return resultadomas;
    }
    public void EcuacionSegundoGradoMenos(double x, double y, double z){       /*Metodo para el resultado con el operador suma*/ /*resolver la ecuacion de segundo grado para la opción con la resta*/
        resultadomenos=(double)(-y - (Math.sqrt(Math.pow(y,2) - (4 * x * z)))) / (2*x);
    }       
    public double GetMenos(){   /*Mediante este "getter" obtengo el resultado con -*/
        return resultadomenos;
    }
}
