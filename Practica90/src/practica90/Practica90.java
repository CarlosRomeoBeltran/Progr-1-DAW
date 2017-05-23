package practica90;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/** @author Carlos Romeo*/
public class Practica90 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        NIF n1 = new NIF();
        System.out.println("Este programa te comprueba la letra del DNI que pases."+"\n");
        System.out.println("Dime el DNI.");
        String comprobacion_dni = teclado.next();
        String patron = "([0-9]{8})([A-Z])";
        Pattern p = Pattern.compile(patron);
        Matcher matcher = p.matcher(comprobacion_dni);
        if(matcher.matches()){
            n1.SetNIF(comprobacion_dni);             
        }else{
            System.out.println("Formato de DNI incorrecto.");
        }              
    }               
}
    


