package practica89;
import java.util.Calendar;
/** @author Carlos Romeo*/

public class FechaActual {
    private int dia_actual;
    private int mes_actual;
    private int año_actual;
    
    public FechaActual(){       /*Constructor por defecto*/    
    }
    
    public void FechaActual(){  /*Método obtener fecha actual*/
        Calendar fechaActual = Calendar.getInstance();                  /*utilizo la funcion calendar que nos proporciona java en la biblioteca para obtener la fecha*/
        this.dia_actual = fechaActual.get(Calendar.DAY_OF_MONTH);        /*guardo el dia actual*/             
        this.mes_actual = fechaActual.get(Calendar.MONTH);               /*guardo el mes actual*/
        this.año_actual = fechaActual.get(Calendar.YEAR);                /*guardo el año actual*/
        System.out.println("La fecha actual es: "+dia_actual+"/"+(mes_actual+1)+"/"+año_actual);    /*Muestro la fecha actual*/
    }    
}
