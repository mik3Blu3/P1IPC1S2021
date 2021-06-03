
public class Carrera {
    Competidor comp1;
    Vehiculo vehiculoComp1;
    Pista pistaComp1;
    int cantidadFInalCompetidores;
    //constructor de la clase carrera 
    public Carrera(Competidor competidorInicial, Vehiculo vehiculoCompetidor,Pista pistaCompetidor, int cantidadCompetidoresExtra)
    {   
        this.comp1 = competidorInicial;
        this.vehiculoComp1 = vehiculoCompetidor;
        this.pistaComp1 = pistaCompetidor;
        this.cantidadFInalCompetidores = cantidadCompetidoresExtra;
    }
    //metodo que inicia la carrera 
    public void iniciarCarrera()
    {
        System.out.println("Gemas "+comp1.getGemas()+" oro "+comp1.getOro()+" GASOLINA "+vehiculoComp1.getGasolina());
        System.out.println(comp1.getNombre());
        System.out.println(vehiculoComp1);
        System.out.println(pistaComp1);
        System.out.println("numero de competidores "+cantidadFInalCompetidores);
        
    }


}
