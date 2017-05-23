package practica86;
/**
 *
 * @author Carlos Romeo
 */
public class Contador {
    private int contador;
    
    public Contador(){          /*Constructor por defecto*/
        
    }
    
    public Contador(int elcontador){    /*Constructor con parametros*/
        this.contador = elcontador;
    }
    
    public Contador(Contador c1){       /*Constructor copia*/
        this.contador = c1.contador;
    }
    
    public void Incrementar(int cantidad){   /*Método incrementar*/
        contador+= cantidad;
    }
    
    public void Decrementar(int cantidad){   /*Método decrementar*/
        contador-= cantidad;
    }
    
    public void SetContador(int elcontador){    /*Setter para poder poner el contador que queramos*/
        this.contador=elcontador;
    }
    
    public int GetContador(){       /*Getter del contador, para poder verlo*/
        return contador;
    }
    
    public void Menu(){     /*Menu para contadores*/     
        System.out.println("");
        System.out.println("Elije una opción:");
        System.out.println("0) Volver a introducir una cantidad en tu contador.");
        System.out.println("1) Incrementar contador.");
        System.out.println("2) Decrementar contador.");
        System.out.println("3) Ver contador.");
        System.out.println("4) Salir del programa.");
        System.out.println("");
    }
}
