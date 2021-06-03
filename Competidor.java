//definiendo el nombre de nuestro objeto competidor 
public class Competidor {
    //atributos de nuestro objeto
    private  String nombreCompetidor;
    private  String nickname;
    private int edadCompetidor;
    private int gemas;
    private int oro;
    private int carrerasGanadas;
    private int carrerasPerdidas;
    final int cantidadVehiculos = 5;
    public Vehiculo arregloVehiculo[];//declarando el arreglo de los vehiculos
    final int cantidadPistas =3;
    public Pista arregloPista[];//declarando el arreglo de las pistas
    //inicializando el constructor que lleva el mismo nombre que la clase
    public Competidor(String nombre, String apodo, int edad, int gemas, int oro, int carrerasGanadas, int carrerasPerdidas)
    {
        this.nombreCompetidor = nombre;
        this.nickname = apodo;
        this.edadCompetidor = edad;
        this.gemas = gemas;
        this.oro = oro;
        this.carrerasGanadas = carrerasGanadas;
        this.carrerasGanadas = carrerasPerdidas;

    }

    //metodo de tipo string que devuelve el nombre
    public  String  getNombre()
    {
        return nombreCompetidor;
    }
    //metodo de tipo void que no devuelve nada mas que el nombreCompetidor
    public void setnombre(String nombre)
    {
        nombreCompetidor = nombre;
    }
    //metodo que obtiene el apodo y que no necesita nada
    public String getApodo()
    {   
        return nickname;
    }
    //metodo que modifica el apodo si en algun momento se hace 
    public void setApodo(String apodo)
    {
        nickname = apodo;
    }
    //metodo que permite devolver la edad del competidor
     public  int getEdad()
     {
        return edadCompetidor;
     }
     //metodo que permite enviar la edad
     public void setEdad(int edad)
     {
         this.edadCompetidor = edad;
     }
     //metodo que permite devolver el monto de gemas que posee
     public int getGemas()
     {
         return gemas;
     }
     //metodo que permite enviar una cantidad de gemas
     public void setGemas(int montoGemas)
     {
         //igualamos la variable de instancia a una suma de las gemas actuales mas un abono que se le dara de gemas
         this.gemas = this.gemas + montoGemas;
     }
     //encargado de debitar las gemas
     public void setDisminuirGemas(int restaGemas)
     {
         this.gemas = this.gemas-restaGemas;
     }
     //permite ver con cuanto oro cuenta el competidor 
     public int getOro()
     {
        return oro;
     }
     //permite modificar el oro que tenga un competidor 
     public void setOro(int montoOro)
     {
         this.oro = this.oro+montoOro;
     }
     //permite obtener las carreras ganadas por el competidor 
     public int getCarrerasGanadas()
     {
        return carrerasGanadas;
     }
     //permite aumentar las carreras ganadas 
     public void setCarrerasGanadas(int sumarVictoria)
     {
         this.carrerasGanadas = this.carrerasGanadas+sumarVictoria;
     }
     //permite obtener las carreras perdidas por el competidor
     public int getCarrerasPerdidas()
     {
         return carrerasPerdidas;//retorna las carreras actuales perdidas
     }
     //permite enviar una carrera mas perdida
     public void setCarrerasPerdidas(int sumarDerrota)
     {
         this.carrerasPerdidas = this.carrerasPerdidas + sumarDerrota;
     }
     //PERMITE VISUALIZAR LOS ATRIBUTOS DE MI OBJETO ALMACENADOS EN EL ARRAY 
     @Override
     public String toString()
     {
         return nombreCompetidor+","+nickname+","+edadCompetidor+","+gemas+","+oro+","+carrerasGanadas+","+carrerasPerdidas;
     }
     //creando nuestro arreglo de tipo vehiculo a traves de nuestro metodo
     public void arrayVehiculos()
     {
         //creando el array de autos con los que podra contar el usuario
         arregloVehiculo = new Vehiculo[this.cantidadVehiculos];
         arregloVehiculo[0]= new Vehiculo("Y","YAMAHA", 100, 4,2, "AMARILLO");
         arregloVehiculo[1]= new Vehiculo("T","TOYOTA", 100, 4,2, "AMARILLO");
         arregloVehiculo[2]= new Vehiculo("M","MITSUBISHI", 100, 4,2, "AMARILLO");
         arregloVehiculo[3]= new Vehiculo("B","BUGATTI", 100, 4,2, "AMARILLO");
         arregloVehiculo[4]= new Vehiculo("B","BMW", 100, 4,2, "AMARILLO");
     }
     //metodo que permite recorrer y mostrar en pantalla nuestro arreglo de tipo vehiculo
     public void mostrarVehiculos()
     {
         for(int i =0; i< arregloVehiculo.length; i++)
         {   
            int numeroPosicion=i+1;
            System.out.printf("%d)",numeroPosicion);
            System.out.println(arregloVehiculo[i]);
         }
     }
     //metodo que permite seleccionar el vehiculo de el arreglo
     public Vehiculo seleccionarVehiculo(int numeroVehiculo)
     {
         Vehiculo vehiculo=null;//inicializando nuestro  vehiculo 
         vehiculo = arregloVehiculo[numeroVehiculo];//almacenando en vehiculo los datos que esten en la posicion deseada
         System.out.println(vehiculo);
         return vehiculo;//retorna el vehiculo que hemos elegido con todos sus datos 

     }
     //metodo que permite crear nuestras pistas
     public void  crearArrayPistas()
     {
         //definiendo el arreglo
         arregloPista = new Pista[this.cantidadPistas];
         arregloPista[0] = new Pista("Tierra",80, 4); 
         arregloPista[1] = new Pista("Arena",90, 2); 
         arregloPista[2] = new Pista("Concreto",100, 6);    
     }
     //metodo que permite visualizar nuestro total de pistas
     public void mostrarPistas()
     {
        for(int i =0; i< arregloPista.length; i++)
        {   
           int numeroPosicion=i+1;
           System.out.printf("%d)",numeroPosicion);
           System.out.println(arregloPista[i]);
        }
     }
     //metodo que permite seleccionar la pista de nuestro interes y que recibe un parametro de tipo numero de pista elegido 
     public Pista seleccionarPista(int numeroPista)
     {
         Pista pistaElegida = null;//inicializando nuestra pista en null
         pistaElegida = arregloPista[numeroPista];//almacenando nuestra pista elegida del arreglo en la posicion especifica
         System.out.println(pistaElegida);
         return pistaElegida;//retorna la pista que hemmos seleccionado
     }
}
