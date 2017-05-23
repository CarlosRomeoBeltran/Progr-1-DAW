package practica82;
/**@author Carlos Romeo*/
public class CambioMonedas {
    private long [] billetes = {500,200,100,50,20,10,5,2,1};
    private long [] resultado = new long[9];
    private long cantidad;
   
    public void SetObtenerBilletes(long lacantidad){    /*Con este setter desgloso los billetes en la mayor division posible*/
        this.cantidad=lacantidad;                       
        for (int i = 0; billetes.length > i; i++){
           resultado[i] = lacantidad / billetes[i];
           lacantidad%= billetes[i];                    /*El resultado está en un array que posteriormente mostraré*/
        }
    }
    public long [] GetObtenerBilletes(){
        return resultado;
    }
    public long [] GetBilletes(){
        return billetes;
    }
}
