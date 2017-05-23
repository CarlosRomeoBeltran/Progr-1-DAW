package practica90;
/** @author Carlos Romeo*/
public class NIF {
    private String nif;
    private String letra;
    
    public NIF(){        
    }
    
    public NIF(String elnif){       /*Constructor por parametros*/
        this.nif = elnif;
        ObtenerLetraNif(elnif);
    }
    public void SetNIF(String elnif){       /*Setter de NIF*/
        this.nif = elnif;
        ObtenerLetraNif(elnif);
    }
    private void ObtenerLetraNif(String nif){       /*Nuestro método Obtener letra Nif*/       
        int dni_sin_letra = Integer.parseInt(nif.substring(0,8));   /*método para pasar el dni a una variable integer sin la letra*/
        String supuesta_letra = nif.substring(8);    /*Aislo la letra para igualarla con la obtenida y poder decir al usuario si es correcta o incorrecta*/
        int resto = (int) (dni_sin_letra % 23);     /*obtengo el resto de dividir entre 23 para obtener un número de la lista equivalente a una letra*/
        switch(resto)                   
        {
            case 0: /*Caso 0 para la letra T*/
                this.letra = "T";
                break;
            
            case 1: /*Caso 1 para la letra R*/
                this.letra = "R"; 
                
                break;

            case 2: /*Caso 2 para la letra W*/
                this.letra ="W";
                break;
            
            case 3: /*Caso 3 para la letra A*/
                this.letra = "A";
                break;
            
            case 4: /*Caso 4 para la letra G*/
                this.letra = "G";
                break;
            
            case 5: /*Caso 5 para la letra M*/
                this.letra = "M";
                break;
            
            case 6: /*Caso 6 para la letra Y*/
                this.letra = "Y";
                break;
            
            case 7: /*Caso 7 para la letra F*/
                this.letra = "F";
                break;
            
            case 8: /*Caso 8 para la letra P*/
                this.letra = "P";
                break;
            
            case 9: /*Caso 9 para la letra D*/
                this.letra = "D";
                break;
            
            case 10: /*Caso 10 para la letra X*/
                this.letra = "X";
                break;
            
            case 11: /*Caso 11 para la letra B*/
                this.letra = "B";
                break;
            
            case 12: /*Caso 12 para la letra N*/
                this.letra = "N";
                break;
            
            case 13: /*Caso 13 para la letra J*/
                this.letra = "J";
                break;
            
            case 14: /*Caso 14 para la letra Z*/
                this.letra = "Z";
                break;
            
            case 15: /*Caso 15 para la letra S*/
                this.letra = "S";
                break;
            
            case 16: /*Caso 16 para la letra Q*/
                this.letra = "Q";
                break;
            
            case 17: /*Caso 17 para la letra V*/
                this.letra = "V";
                break;
            
            case 18: /*Caso 18 para la letra H*/
                this.letra = "H";
                break;
            
            case 19: /*Caso 19 para la letra L*/
                this.letra = "L";
                break;
            
            case 20: /*Caso 20 para la letra C*/
                this.letra = "C";
                break;
            
            case 21: /*Caso 21 para la letra K*/
                this.letra = "K";
                break;
            
            case 22: /*Caso 22 para la letra E*/
                this.letra = "E";
                break;      
        }
        System.out.println("");
        if(this.letra.equals(supuesta_letra)){       /*Le digo al usuario si es correcto su DNI o no*/           
            System.out.println("La letra calculada es: "+this.letra);
            System.out.println("");
            System.out.println("La letra concuerda con la dada en el DNI.");            
        }else{
            System.out.println("La letra no concuerda con la dada en el DNI, es incorrecto.");
            System.out.println("");
            System.out.println("La letra que tu DNI tendría que tener es: "+this.letra);
        }
    }
    public String GetLetra(){           /*Un getter para obtener la letra para comprobaciones*/
        return letra;
    }
}
