/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniandes.ecos.tarea6psp;

import java.util.ArrayList;
import java.util.Map;

/**
 * clase qque se encarga de generar de mostrar los menus en pantalla
 * @author juvenal
 * @version 1.0 04/04/2017
 */
public class Vista 
{
    /**
     * genera un string a partir de una lista de resulatados
     * @param mapaIntervalos lista de resultados
     * @return cadena de texto
     */
     public String mostrarResultados(Map<String,ArrayList<String>> mapaIntervalos)
     {
         String encabezado = " <!DOCTYPE html> <html> <body>";
         String tablaInicio = "<table style=\"width:100%\">";
         String columnasEncabezado=  "<tr> <th>pValue</th> <th>dof</th> <th>x</th>  </tr>";
         String valores ="";
         for (Map.Entry<String,ArrayList<String>> dato : mapaIntervalos.entrySet())
         {
          valores = valores + " <tr> "  + "<td>" + dato.getValue().get(0) + "</td>"  + "<td>"+ dato.getValue().get(1) + "</td>" + "<td>" + dato.getValue().get(2) + "</td> </tr>";
         
         }
         
          String volverform="<button type="+"\""+"button"+ "onclick="+"\""+"alert('Hello World!')"+"\""+">volver</button>";
         return encabezado + tablaInicio +columnasEncabezado +valores + " </table> " + volverform+"</body> </html>";
         
         
     }
     
     /**
     * genera un formulario para el ingreso de datos
     * @param  error parametro de error
     * @return formulario
     */
     public String mostrarFormularioIngreso(String error)
     {
         String inicio= " <form> ";
         String pError= "<br>" + error + "</br>";
         String cajaPValor="<br> pValor:</br>  <input type= " + "\""+"text"+"\""+ "name=" + "\"" +"pvalor"+"\""+">";
         String cajaGlibertad="<br> Grados Libertad:</br>  <input type= " + "\""+"text"+"\""+ "name=" + "\"" +"glibertad"+"\""+">";
         String boton="<button type="+"\""+"button"+ "onclick="+"\""+"alert('Hello World!')"+"\""+">Ejecutar!</button>";
         String fin = "</form>";
        return inicio + pError + cajaPValor+ boton + cajaGlibertad + fin;      
     }
}

