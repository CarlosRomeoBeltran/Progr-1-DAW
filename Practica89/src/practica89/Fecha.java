package practica89;

/*@author Carlos Romeo*/
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    private boolean correcto;
    
    public Fecha(){     /*Constructor por defecto*/
    }
    
    public Fecha(int eldia, int elmes, int elaño){      /*Constructor con parametros*/
        this.dia = eldia;
        this.mes = elmes;
        this.año = elaño;
    }
    
    public void SetDia(int eldia){  /*Inicializo en el objeto el dia con este Setter*/
        this.dia = eldia;
    }
    public int GetDia(){            /*Obtengo el dia con este Getter*/
        return dia;
    }
    
    public void SetMes(int elmes){  /*Inicializo en el objeto el mes con este Setter*/
        this.mes = elmes;
    }
    public int GetMes(){            /*Obtengo el mes con este Getter*/
        return mes;
        
    }public void SetAño(int elaño){ /*Inicializo en el objeto el año con este Setter*/
        this.año = elaño;
    }
    public int GetAño(){            /*Obtengo el año con este Getter*/
        return año;
    }
    
    public void SetEvaluacionFecha(int dia, int mes, int año){
        
        if (mes==2 && (año%4==0 || año%100==0 && año%400==0) && (dia>0 && dia<=29)) /*si el mes es el numero 2 será febrero y si el año es divisible entre 4 o 100 y 400 será bisiesto por tanto el dia tiene que ser entre el 1 y 29*/
        {
            correcto = true; /*si se cumple la condicion muestro que la fecha es correcta*/
        }else /*sino, pueden ser uno de los siguientes casos*/
            {
                if ((mes==4 || mes==6 || mes==9 || mes==11) && (dia>0 && dia<=30))   /*si el mes es abril, junio, septiembre o noviembre el dia tendra que ser entre 1 y 30*/
                {
                    correcto = true; /*muestro por pantalla que tiene 30 días si se cumple la condición*/
                }else /*sino, pueden ser uno de los siguientes casos*/ 
                    {
                        if(mes==2 && (dia>0 && dia<=28) && (año%4!=0 || año%100!=0 && año%400!=0)) /*si el mes es febrero pero no es divisible ni por 4 ni por 100 y 400 entonces no es bisiesto y tendrá entre 1 y 28 dias*/
                        {
                            correcto = true; /*muestro por pantalla que la fecha es correcta si se cumple la condicion*/
                        }else   
                            {
                                if((mes==1 || mes==3 || mes==5 ||  mes==7 ||  mes==8 ||  mes==10 || mes==12) && (dia>0 && dia<=31))/*si es enero, marzo, mayo, julio, agosto, octubre o diciembre y el dia esta entre el 0 y el 31 la fecha estara correcta*/
                                {
                                    correcto = true; /*si se cumple la condicion muestro que esta correcta*/
                                }else /*si no es ninguno de los anteriores casos muestro que la fecha es incorrecta*/
                                    {
                                        correcto = false; /*muestro que la fecha es incorrecta*/
                                    }
                            }
                    }
            }
    }
    public boolean GetEvaluacionFecha(){
        return correcto;
    }
    
}
