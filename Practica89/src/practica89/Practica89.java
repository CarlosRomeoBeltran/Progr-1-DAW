package practica89;
import java.util.Calendar;
import java.util.Scanner;

/** @author Carlos Romeo*/
public class Practica89 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una fecha y te confirmaré si es correcta, además te daré la fecha actual.");
        Fecha f1 = new Fecha();
        FechaActual fa1 = new FechaActual();
        System.out.println("Dime el día: ");
        f1.SetDia(teclado.nextInt());
        System.out.println("Dime el mes: ");
        f1.SetMes(teclado.nextInt());
        System.out.println("Dime el año: ");
        f1.SetAño(teclado.nextInt());
        f1.SetEvaluacionFecha(f1.GetDia(), f1.GetMes(), f1.GetAño());
        
        if(f1.GetEvaluacionFecha() == true)
        {
                System.out.println("La fecha introducida es correcta.");
        }else
            System.out.println("La fecha introducida es incorrecta.");
        fa1.FechaActual();
    }
}
