public class Vehiculo {
    private String ascci;
    private String marca;
    private int gasolina;
    private int motorPotencia;
    private int llantas;
    private String color;
    //constructor 
    public Vehiculo(String ascci,String marca, int gasolina, int potenciaMotor, int coeficienteLlantas, String color)
    {   
        //igual
        this.ascci = ascci;
        this.marca = marca;
        this.gasolina = gasolina;
        this.motorPotencia = potenciaMotor;
        this.llantas = coeficienteLlantas;
        this.color = color;
    }
    //obtener la imagen del vehiculo
    public String getAscci()
    {
        return ascci;
    }
    //enviar la imagen del vehiculo 
    public void setAscci(String ascci)
    {
        this.ascci = ascci;
    }
    //permite obtener la marca del vehiculo
    public String getMarca()
    {
        return marca;
    }
    //permite enviar una nueva marca del vehiculo
    public void SetMarca(String marca)
    {   
        this.marca = marca;
    }

    //metodo para ver gasolina disponible
    public int getGasolina()
    {
        return gasolina;
    }
    //metodo que permite enviar gasolina
    public void setGasolina(int aumentoGasolina)
    {
        this.gasolina = this.gasolina + aumentoGasolina;
    }
    //permite enviar al motor
    public int getMotor()
    {
        return motorPotencia;
    }
    //permite enviar mas potencia al motor 
    public void setMotor(int SumarPotenciaMotor)
    {
        this.motorPotencia = this.motorPotencia + SumarPotenciaMotor;
    }
    //permite obtener el color del vehiculo
    public String getColor()
    {
        return color;
    }
    //permite enviar o cambiar el color de un vehiculo
    public void setColor(String cambioColor)
    {
        this.color = cambioColor;
    }
    //permite obtener el coeficiente de las llantas
    public int getLlantas()
    {
        return llantas;
    }
    //permite enviar un nuevo coeficiente de llantas 
    public void setLlantas(int llantas)
    {
        this.llantas = llantas;
    }
     //PERMITE VISUALIZAR LOS ATRIBUTOS DE MI OBJETO ALMACENADOS EN EL ARRAY 
    @Override
    public String toString()
    {
        return "REPRESENTATIVO: "+ascci+" MARCA: "+marca+" GASOLINA (GAL): "+gasolina+" POTENCIA MOTOR: "+motorPotencia+" COEFICIENTE LLANTAS: "+llantas+" COLOR: "+color;
    }
}
