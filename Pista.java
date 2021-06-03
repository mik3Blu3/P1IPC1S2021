public class Pista {
    private String tipoPista;
    private int tamañoPista;
    private int coeficientePista;
    
    public  Pista(String tipoPista, int tamañoPista, int coeficientePista)
    {
        this.tipoPista = tipoPista;
        this.tamañoPista = tamañoPista;
        this.coeficientePista =coeficientePista;
    }

    public  String getTipoPista()
    {
        return tipoPista;
    }

    public void setTipoPista( String caracteristicaTipoPista)
    {
        this.tipoPista = caracteristicaTipoPista;
    }

    public int getTamañoPista()
    {
        return tamañoPista;
    }

    public void setTamañoPista(int longitudPista)
    {
        this.tamañoPista = longitudPista;
    }
    
    public int getCoeficientePista()
    {
        return coeficientePista;
    }

    public void setCoeficientePista( int nuevoCoeficientePista)
    {
        this.coeficientePista = nuevoCoeficientePista;
    }

     //PERMITE VISUALIZAR LOS ATRIBUTOS DE MI OBJETO ALMACENADOS EN EL ARRAY 
    @Override
    public String toString()
    {
        return "Tipo de Pista: "+tipoPista+" Tamaño de Pista: "+tamañoPista+" Coeficiente de Pista: "+coeficientePista;
    }
}
