
package Problema_7;

public class Viaje {
	public int identificadorUnico;
    public String reservasEstancia;
    public String vuelosRealizados;
    /*la cuenta depende directamente
     * de los viajes que realiza el cliente*/
    public Cuenta Unnamed2;
    /*el viaje depende de las reservas que
     * se hacen el los hotes, aunque sin 
     * embargo tambien podria hacerse un 
     * viajes si reservas*/
    public Reserva Unnamed3;
    /*por cada viaje que realiza el cliente
     * es necesario hacerse un vuelo,
     * ya sea de ida, vuelta o ambos*/
    public Vuelo Unnamed4;
    public Cuenta Unnamed5;
    /*metodos para escojer los viajes*/
    public void escojerAlojamiento()
    {  }
    
    public void elejirVuelos()
    {  }
}
