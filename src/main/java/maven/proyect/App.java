package maven.proyect;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Operaciones operacion= new Operaciones();
        int resultado= operacion.suma(2, 2);
        System.out.println(resultado);
        
    }
}
