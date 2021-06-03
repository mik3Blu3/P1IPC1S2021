import java.util.Scanner;//importa la clase scanner 
public class Ejecutable//nombre definido de la clase
{
  static Scanner entrada = new Scanner(System.in);//definiendo lo que nos permitira leer datos por teclado 
  //clase principal main
  public static void main(String args[]) {
    //inicializando la opcion por defecto a 0
    int opcion=0;
    // creando el objeto juego
    while(opcion != 1)
    {
      System.out.println("BIENVENIDO AL JUEGO DE CARRERAS, ACEPTA LOS TEMINOS Y CONDICIONES? S/N SI/NO");
      System.out.println("INGRESE 'S' SI O 'N' NO");
      String seleccion = entrada.nextLine();//leyendo datos proporcionados por teclado
        //condicion que compara el caracter ingresado por el usuario
         if (seleccion.equalsIgnoreCase("S") )//si es S entonces crea un nuevo Juego
         {
           new Juego(); //creando un nuevo juego llamando a la clase denominada juego
          
         }else//sino es S entonces sale ya que no acepto los terminos
         {
           System.out.println("NO ACEPTO LOS TERMINOS Y CONDICIONES");
           opcion++;//aumenta en 1 la variable opcion asi dejara de ejecutar el ciclo while
         }
    }
        
    }
    
    
}