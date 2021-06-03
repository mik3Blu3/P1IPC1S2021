import java.util.Scanner;//importando la clase scanner

import java.util.Random;//importando la clase random 
//nombre de nuestra clase
public class Juego {

    final int cantidadCompetidores = 6;//definiendo el valor final de la cantidad de Competidores
    public  Competidor arregloCompetidores[];//creando un nuevo arreglo de tipo Competidor  denominado arregloCompetidores
    Scanner entrada = new Scanner(System.in);//declarando la variable de tipo scanner para leer datos de teclado
    //contructor que me permite llamar al menu 
    public  Juego()  
    {
        this.crearCompetidor();//hace referencia al metodo crear competidor para inicializar con la creacion de un Competidor
    }
    //nuestro metodo menu, que necesita parametros dados por el programa tales como un competidor, y al menos un vehiculo
    public void menu(Competidor miCompetidor,Vehiculo vehiculoCompetidor)
    {
        //inicializando una variable local 
        int opcion =0;
        while(opcion != 6 )//ciclo while que nos permite mostrar el menu repetidas veces
        {
            System.out.println("\n---------BIENVENIDO AL MENU DEL JUEGO----------\n");
            System.out.println("__________Las opciones son las siguientes_______");
            System.out.println("|            1)*****COMPETIR******             |");
            System.out.println("|            2)*****RULETA********             |");
            System.out.println("|            3)******GARAGE*******             |");
            System.out.println("|            4)*****PISTAS********             |");
            System.out.println("|            5)****ESTADISTICAS***             |");
            System.out.println("|            6)*******SALIR*******             |");
            System.out.println("|______________________________________________|");
            System.out.println("Ingrese la opcion que desea escoger");
            int opcion1 = entrada.nextInt();//leyendo la opcion que eliga el usuario
            System.out.printf("\nLa opcion que ha elegido es %d\n",opcion1);//mostrando msj en pantalla con la opcion elegida por el usuario
            //ciclos if que permiten comparar la opcion y realizar una accion dependiendo de que necesitamos
            if (opcion1 == 1)
               this.mostrarCarrera(miCompetidor, vehiculoCompetidor);//llama al metodo mostrar carrera y envia al competidor ya creado y al vehiculo que ha elegido el usuario
            if (opcion1 == 2)
                this.mostrarRuleta(miCompetidor);//muestra el metodo ruleta y envia como parametro al competidor
            //if (opcion1 ==3)
               // new Garaje(miCompetidor);   
            if (opcion1 == 4)
            {
                miCompetidor.crearArrayPistas();//creando las pistas
                miCompetidor.mostrarPistas();//mostrando las pistas del competidor
            }
             //miCompetidor.crearArrayPistas();
             //miCompetidor.mostrarPistas();
            /*if (opcion1 == 5)
                this.mostrarEstadisticas();*/  
            if (opcion1 == 6)
            opcion = opcion1;//sale del programa y se deja de ejecutar el menu
        }
    }
    //metodo que crea el competidor 
    public void crearCompetidor()
    {
        System.out.println("Ahora antes de competir crearemos el perfil del competidor");
        System.out.println("Bienvenido vamos a crear su perfil de jugador porfavor proporcione los datos que se le piden a continuación : ");
        System.out.println();
        System.out.println(" Ingrese su nombre ");
        String nombre =entrada.nextLine();//leyendo el nombre del competidor
        System.out.println(" Ingrese su nickname o apodo ");
        String nickname = entrada.nextLine();//leyendo el apodo del competidor
        System.out.println(" Ingrese su edad ");
        int edad = entrada.nextInt();//leyendo la edad del competidot
        System.out.println("Por ser tu primer ingreso haz recibido un bonus de 30 gemas y 50 monedas de oro!!!");
        //creando un nuevo objeto llamado competidor el cual cuenta con varios atributos que ya son rellenados
        Competidor miCompetidor = new Competidor(nombre, nickname, edad,30,50,0,0);
        System.out.println("Ahora elija uno de estos vehiculos :");
        miCompetidor.arrayVehiculos();//creando el array de vehiculos para mostrar al competidor 
        miCompetidor.mostrarVehiculos();//llama al metodo mostrar vehiculos del competidor y los imprime en pantalla
        System.out.println("cual es la opcion de vehiculo que desea utilizar??? ");
        int opcionVehiculo = entrada.nextInt();//leyendo la opcion del vehiculo a utilizar
        int opcionRealVehiculo =opcionVehiculo-1;//definiendo nuestra opcion real de eleccion de vehiculo
       Vehiculo vehiculoCompetidor = miCompetidor.seleccionarVehiculo(opcionRealVehiculo);//seleccionando a traves de un metodo el vehiculo seleccionado por el competidor
        /*System.out.println(" que tal mi nombre es: "+miCompetidor.getNombre());
        System.out.println(" y mi apodo es: "+miCompetidor.getApodo());
        System.out.println("Tengo la edad de:  "+miCompetidor.getEdad());*/
        System.out.println(" cuento con "+miCompetidor.getGemas()+" gemas y "+miCompetidor.getOro()+" de Oro ");//imprime un mensaje y mostrando atributos rellenados
        System.out.println(" cuento con una racha de "+miCompetidor.getCarrerasGanadas()+ " Victorias y ademas "+miCompetidor.getCarrerasPerdidas()+ " Derrotas");//mostrando datos en pantalla
        this.menu(miCompetidor ,vehiculoCompetidor);//llama al metodo menu, y le envia como parametros a nuestro competidor y a el vehiculo que ha elegido
    }
    //metodo que me permite mostrar la ruleta, la cual para funcionar necesita un parametro definido como competidor
    public void mostrarRuleta(Competidor Competidor )
    {
        System.out.println(" gemas "+Competidor.getGemas()+" oro "+Competidor.getOro());
        Random opcionAleatoria = new Random();//creando nuestra opcion aleatoria gracias a el random
        System.out.println("BIENVENIDO A LA RULETA ");//mensaje
        System.out.println("Su competidor es "+Competidor.getNombre());//muestra el nombre de nuestro competidor
        System.out.println("actualmente cuenta con "+Competidor.getGemas()+ " gemas");//muestra las gemas con las que cuenta el competidor 
        System.out.println("actualmente cuenta con "+Competidor.getOro()+" monedad de oro");//muestra el oro con que cuenta el competidor
        System.out.println("Los premios son: 1) 40 gemas 2) 75 oro   3) 1000 gemas   4) 2000 oro 5) 5 gemas 6) 10 oro ");  
        System.out.println("Desea hacer un tiro le cuesta 5 gemas ? Si/No 1/0");
        int tiroOpcion = entrada.nextInt();//leyendo la opcion de tiro 
        //ciclo if que nos permite saber si acepto o no realizar un tiro en la ruleta
        if(tiroOpcion == 1)
        {
            Competidor.setDisminuirGemas(5);//disminuye a traves del metodo disminuir un monto de gemas especifico 
            System.out.println("Se descontaron 5 gemas  De su cuenta, actualmente tiene "+Competidor.getGemas());//mensaje
        }else//sino acepto realizar el tiro solo muesta un mensaje
        {
            System.out.println("No acepto realizar el tiro de la ruleta");
        }
        int tiroAleatorio =0;//declarando una variable de tiro aleatorio para generar el premio aleatorio
        while(tiroOpcion != 0)
        {
            tiroAleatorio = opcionAleatoria.nextInt(5);//definiendo un aleatorio de maximo 5
            System.out.println(tiroAleatorio);//muestra el aleatorio que se genero
            //estructura selectiva que depende del numero aleatorio que generamos
            switch(tiroAleatorio)
            {
                case 0:
                System.out.println(" Ha ganado el premio numero 1 Se le acreditaran 40 gemas");
                Competidor.setGemas(40);//le suma 40 gemas al competidor
                break;

                case 1:
                System.out.println("Ha ganado el premio numero 2 Se le acreditaran 75 monedas de oro");
                Competidor.setOro(75);//le suma 75 monedas de oro al competidor
                break;

                case 2:
                System.out.println("Ha ganado el premio numero 3 Se le acreditaran 1000 gemas");
                Competidor.setGemas(1000);//le suma 1000 gemas al competidor 
                break;

                case 3:
                System.out.println("Ha ganado el premio numero 4 Se le acreditaran 2000 monedas de oro");
                Competidor.setOro(2000);//envia 2000 monedas de oro al competidor 
                break;

                case 4:
                System.out.println("Ha ganado el premio numero 5 Se le acreditaran 5 gemas");
                Competidor.setGemas(5);//envia 5 gemas al competidor 
                break;

                case 5:
                System.out.println("Ha ganado el premio numero 6 Se le acreditaran 10 monedas de oro");
                Competidor.setOro(10);//envia la cantidad de 10 monedas de oro al competidor 
                break;
            }
            System.out.println("Tengo gemas "+Competidor.getGemas()+ " y oro "+Competidor.getOro());//muestra el estado actual de recursos del competidor 
            tiroOpcion--;//disminuye la opcion de tiro para que sea diferente de 0 
        }
    }
    //metodo que permite visualizar la carrera y necesita para funcionar dos parametros uno de tipo competidor y otro de tipo vehiculo
    public void mostrarCarrera(Competidor competidor, Vehiculo vehiculoCompetidor)
    {   
        System.out.println(" GEMAS "+competidor.getGemas()+" ORO "+competidor.getOro()+" GASOLINA "+vehiculoCompetidor.getGasolina());//mostrando con lo que cuenta nuestro competidor 
        this.arrayCompetidores(competidor);//envia al competidor que creamos al array
        //this.mostrarCompetidores();
        System.out.println("A continuacion presentaremos las pistas disponibles eliga una: ");
        competidor.crearArrayPistas();//define crear nuestro arreglo en que almacenaremos las pistas gracias a un metodo que se encarga de generarlas
        competidor.mostrarPistas();//muestra en consola las pistas anteriormente creadas
        int numeroPista = entrada.nextInt();//lee la opcion de pista que elegira
        int numeroPistaReal = numeroPista-1;//disminuye en uno la opcion
        Pista pistaSeleccionada = competidor.seleccionarPista(numeroPistaReal);//envia nuestra pista seleccionada con el numero de pista que se selecciono
        System.out.println("CONTRA CUANTOS COMPETIDORES DESEA COMPETIR MINIMO 2 Y MAXIMO 5");
        //permite elegir la cantidad de competidores extras que desea el competidor 
        int cantidadCompetidoresSeleccionada = entrada.nextInt();
        //crea la carrera con los competidores y vehiculos que sean
        Carrera carreraActual = new Carrera(competidor,vehiculoCompetidor,pistaSeleccionada,cantidadCompetidoresSeleccionada);
        //llama al metodo que inicia la carrera
        carreraActual.iniciarCarrera();
        //creando el array de vehiculos
        //arregloVehiculo = new Vehiculo[this.cantidadVehiculos]; 
    }
    //muestra a los competidores
    public void mostrarCompetidores()
    {
        for(int i =0; i< arregloCompetidores.length; i++)//define las condiciones del ciclo repetitivo 
        {
            int numeroPosicion=i+1;//define la posicion de los competidores
            System.out.printf("%d)",numeroPosicion);
            System.out.println(arregloCompetidores[i]);
        }
    }
    //metodo que petmite crear los competidores extras incluyendo a nuestro competidor principal
    public void arrayCompetidores(Competidor competidor)
    {
                //creando el array de jugadores tomando en cuenta al usuario
                arregloCompetidores = new Competidor[this.cantidadCompetidores];
                //rellenando de datos nuestro array de tipo competidor
                arregloCompetidores[0] = competidor;
                arregloCompetidores[1] = new Competidor("Jose", "La Pulga", 23,30, 50,0, 0);
                arregloCompetidores[2] = new Competidor("Lourdes", "La Veloz", 25,30, 50,0, 0);
                arregloCompetidores[3] = new Competidor("Gabriela", "La Audaz", 30,30, 50,0, 0);
                arregloCompetidores[4] = new Competidor("Marcos", "Aguare", 27,30, 50,0, 0);
                arregloCompetidores[5] = new Competidor("Leonel", "El Velociraptor", 29,30, 50,0, 0);
    }
    //metodo que permite seleccionar al competidor que deseamos
    public Competidor seleccionaCompetidor(int numeroCompetidor)
    {   
        System.out.println("LOS COMPETIDORES SON LOS SIGUIENTES :");
        this.mostrarCompetidores();
        Competidor compEleccion = null;
        compEleccion = arregloCompetidores[numeroCompetidor];
        System.out.println(compEleccion);
        return compEleccion;
    }
}
