/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniandes.ecos.tarea6psp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/**
 * clase que administra los conjuntos de datos
 * @author juvenal
 * @version 1.0 17/04/2017
 */
public class AdministraDatos
{
        
     /**Lista de Datosde datos*/
    private ArrayList<Dato> ListaDatos;
	
    /**objeto de tipo Calculo*/
    private Calculo calculos;
    
    /**
    * constructor de la clase
    */	
    public AdministraDatos()
    {
	ListaDatos = new ArrayList<Dato>();
	calculos = new Calculo();
    }
    
     /**
     * pobla el array list de datos
     */
    public void poblarDatos(double pValor, int gradosLibertad)
    { 
	Dato nuevoDato= new Dato(pValor,gradosLibertad);			
        ListaDatos.add(nuevoDato);
         
    }
    /**
     * estima el valor de x
     * @param pValor pValor Base
     * @param gradosLibertad grados de libertad
     * @return mapa con la lista de resultados
     */
    public Map<String,ArrayList<String>> estimarXDato(double pValor, int gradosLibertad)
    { Map<String,ArrayList<String>> mapValoresp = new HashMap<String,ArrayList<String>>();
      double x;
      int contador =0;
      poblarDatos(pValor,gradosLibertad);
      for (Dato pDato: ListaDatos)
      {
       contador = contador + 1 ;
       x= calculos.estimarValorX(pDato.getPValor(),pDato.getGradosLibertad(),0.00001);
       String llave = "dato" +   Integer.toString(contador);
       ArrayList<String> valores = new ArrayList<String>();
       valores.add(Double.toString(pDato.getPValor()));      
       valores.add(Integer.toString(pDato.getGradosLibertad()));
       valores.add(Double.toString(x));
       mapValoresp.put(llave, valores);

      }      
      return mapValoresp;
    }
}
