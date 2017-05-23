package practica82;
/**@author Carlos Romeo*/
public class CambioMonedas {
    private long [] billetes = {500,200,100,50,20,10,5,2,1};
    private long [] resultado = new long[9];
    private long cantidad;
    
    public CambioMonedas(){ /*Constructor por defecto*/
        
    }
    
    public CambioMonedas(long lacantidad){  /*Constructor con parametros*/
        this.cantidad = lacantidad;
    }
    
    public long getCantidad() { /*Getter de la cantidad*/
        return cantidad;
    }

    public void setCantidad(long cantidad) {    /*Setter de la cantidad*/
        this.cantidad = cantidad;
    }
       
    
    
    public void ObtenerBilletes(long lacantidad){   /*Metodo obtener billetes*/ /*desgloso los billetes en la mayor division posible*/
        this.cantidad=lacantidad;                       
        for (int i = 0; billetes.length > i; i++){
           resultado[i] = lacantidad / billetes[i];
           lacantidad%= billetes[i];                    /*El resultado está en un array que posteriormente mostraré*/
        }
    }
    public long [] GetObtenerBilletes(){    /*Getter para obtener el resultado del método ObtenerBilletes*/
        return resultado;
    }
    public long [] GetBilletes(){
        return billetes;
    }
}
