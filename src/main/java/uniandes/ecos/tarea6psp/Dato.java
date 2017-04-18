
package uniandes.ecos.tarea6psp;

/**
 * almacena los valores de grados de lbertad y pValor
 * @author juvenal
 * @version 1.0 17/04/2017
 */
public class Dato 
{
    /**valor del límite inferior*/
    private double pValor;
    
    /**valor del límite superior*/
    private int gradosLibertad;
    
       
    /**
     * Constructor de la clase
     * @param pValor P-valor 
     * @param gl grados de libertad
     */
    public Dato(double pValor, int gl)
    {
      this.pValor =pValor;      
      this.gradosLibertad= gl;
    }
    
  
    /**
     * Obtiene el valor del p-valor
     * @return pValor
     */
    public double getPValor() 
    {
        return pValor;
    }

    /**
     * Obtiene el valor del limite superio
     * @return valor limite superior
     */
    public int getGradosLibertad() 
    {
        return gradosLibertad;
    }
    
    
    
}

