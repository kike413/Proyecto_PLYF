/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PLYF;

import gnu.prolog.term.AtomTerm;
import gnu.prolog.term.CompoundTerm;
import gnu.prolog.term.Term;
import gnu.prolog.term.VariableTerm;
import gnu.prolog.vm.Environment;
import gnu.prolog.vm.Interpreter;
import gnu.prolog.vm.PrologCode;
import gnu.prolog.vm.PrologException;

/**
 *
 * @author jvega
 */
public class NewClass {

    public static void main(String[] args) {
    Environment env;
    Interpreter interpreter;

    env = new Environment();
    env.ensureLoaded(AtomTerm.get("C:/Users/jvega/Documents/Escuela/8voSemestre/Programacionlogicayfuncional/OutClassRoomPLYF/U3T3.pl"));
    // Obtenemos el interprete
    interpreter = env.createInterpreter();
    // Y lo inicializamos
    env.runInitialization(interpreter);
    // Argumentos para la consulta en este caso constantes.
    Term[] Argumento = { AtomTerm.get("leo"), AtomTerm.get("enrique") };
    // Construimos la consulta Paco es desdenciente de Tito?
    CompoundTerm goalTerm =
        new CompoundTerm(AtomTerm.get("progenitor"), Argumento);


    try {
        if (interpreter.runOnce(goalTerm) == 
            PrologCode.SUCCESS)
        {
            System.out.println("leo es descendiente de enrique.");
        } else {
            System.out.println("leo NO es descendiente de enrique.");
        }
    } catch (PrologException e) {
        System.out.println("Error." + e.getMessage());
    } 
    // Fin. 
    env.closeStreams();
    }
    
}
