package Problema_7;

public class Cliente {
	public String nombre;
    public String direccion;
    public int telefono;
    public int dpi;
    public String ciudadResidencia;
    /*se asocia directamente con
     * la clase viaje*/
    public Viaje Unnamed1;
    /*tiene una relacion de agregacion
     * con la clase Establecimiento ya
     * que no es indispensable que 
     * este alojado en un hotel para que
     * este exista*/
    public Establecimiento Unnamed2;
    public Establecimiento Unnamed3;

}
