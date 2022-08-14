import java.util.*;
/**
 * Write a description of class Registro here.
 *  Crear un arreglo que pueda contener la temperatura a lo largo
    de los 7 días de una semana
 * @author (Sebastian Ahern)
 * @version (1.0)
 */
public class Registro
{
    // instance variables - replace the example below with your own
    double [] temperatura;
    int index;

    /**
     * Constructor for objects of class Registro
     */
    public Registro()
    {
        // initialise instance variables
        temperatura = new double [7];
        index = 0;
    }

    public void insertTemperaturas(double grado)
    {
        //if(indice < temperatura.legth) o...
        if(index <= 7)
        {
            temperatura[index] = grado;
            index++;
            // o ... index = index + 1; el resultado sera el mismo
        }
        else
        {
            System.out.println("el arreglo esta lleno");
        }
    }
}
