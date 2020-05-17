/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PLYF;

import java.util.Map;
import org.jpl7.Compound;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;

/**
 *
 * @author jvega
 */
public class Metodos {
        String proyecto= "C:/Users/jvega/Documents/GitHub/Proyecto_PLYF/CodigoFuente/U3T3.pl";
        String t1;
        Query q1;
        
        
        
    public void Conexion(){
        t1 = "consult('" + proyecto + "')";//aqui colocan el nombre de su archivo a compilar
        q1 = new Query(t1);
        System.out.println(t1 + " " + (q1.hasSolution() ? "verdadero" : "fallo")); //mostrara mensaje  si hay o no conexion

    }
    
    public void MostarTodos(javax.swing.JComboBox Lista){
              
        Compound te1 = new Compound(
                "persona",
                new Term[]{
                    new Variable("X")
                }
        );
        q1 = new Query(te1);
        while (q1.hasNext()) {
            Map<String, Term> personas = q1.next();
            Term t = (Term) personas.get("X");
            Lista.addItem(t.toString());
        }
        
     
    }
}
