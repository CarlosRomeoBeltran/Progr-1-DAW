package practica71;
/** @author carlos romeo*/
public class Practica71 {

    public static void main(String[] args) {
        int matriz[][]={{9,12,3,4,3,2},{124,7,11,1,0,67}};
        for (int i = 0; i < matriz.length; i++)             /*recorro la matriz por filas*/
        {
            for (int j = 0; j < matriz[0].length; j++)      /*recorro matriz por columnas*/
            {
                if(primos(matriz[i][j])==true)
                {
                    System.out.println("El número "+matriz[i][j]+" es primo.");
                }
            }
        }
    }
    
    public static boolean primos(int x ) {
        int divisores = 0;
        boolean primo = false;
        for (int i = 1; i <= x; i++)
        if (x % i == 0)             /*si el número dado dividido entre cualquier número menor que él da 0*/ 
        {
            divisores++;            /*se aumenta el numero de divisores*/
        }
        if(divisores==2)            /*si la cantidad de divisores son 2*/ 
        {
            primo = true;           /*será primo, sino no cambiará la variable y */
        }
        return primo;
    }
}
