/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PLYF;

import java.util.Map;
import org.jpl7.Atom;
import org.jpl7.Compound;
import org.jpl7.Query;
import org.jpl7.Term;
import org.jpl7.Variable;

/**
 *
 * @author jvega
 */
public class Metodos {

    String proyecto = "C:/Users/jvega/Documents/GitHub/Proyecto_PLYF/CodigoFuente Y Arbol/U3T3.pl";
    String t1;
    Query q1;

    public void Conexion() {
        t1 = "consult('" + proyecto + "')";//aqui colocan el nombre de su archivo a compilar
        q1 = new Query(t1);
        System.out.println(t1 + " " + (q1.hasSolution() ? "verdadero" : "fallo")); //mostrara mensaje  si hay o no conexion

    }
    
    public void MostarTodos(javax.swing.JComboBox Lista) {

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

    public void Abuelos(String persona, javax.swing.JComboBox abuelo) {
        Compound te1 = new Compound(
                "abuelo",
                new Term[]{
                    new Variable("X"),
                    new Atom (persona)
                }
        );
        q1 = new Query(te1);
        while (q1.hasNext()) {
            Map<String, Term> personas = q1.next();
            Term t = (Term) personas.get("X");
            abuelo.addItem(t.toString());
        }
    }
    
    public void Abuelas(String persona, javax.swing.JComboBox abuela) {
        Compound te1 = new Compound(
                "abuela",
                new Term[]{
                    new Variable("X"),
                    new Atom (persona)
                }
        );
        q1 = new Query(te1);
        while (q1.hasNext()) {
            Map<String, Term> personas = q1.next();
            Term t = (Term) personas.get("X");
            abuela.addItem(t.toString());
        }
    }
    
    public void Bisabuelas(String persona, javax.swing.JComboBox bisabuela) {
        Compound te1 = new Compound(
                "bisabuela",
                new Term[]{
                    new Variable("X"),
                    new Atom (persona)
                }
        );
        q1 = new Query(te1);
        while (q1.hasNext()) {
            Map<String, Term> personas = q1.next();
            Term t = (Term) personas.get("X");
            bisabuela.addItem(t.toString());
        }
    }
    
    public void Bisabuelos(String persona, javax.swing.JComboBox bisabuelo) {
        Compound te1 = new Compound(
                "bisabuelo",
                new Term[]{
                    new Variable("X"),
                    new Atom (persona)
                }
        );
        q1 = new Query(te1);
        while (q1.hasNext()) {
            Map<String, Term> personas = q1.next();
            Term t = (Term) personas.get("X");
            bisabuelo.addItem(t.toString());
        }
    }
    
    public void Bisnieto(String persona, javax.swing.JComboBox bisnieto) {
        Compound te1 = new Compound(
                "bisabuelo",
                new Term[]{
                    new Atom (persona),
                    new Variable("X") 
                }
        );
        q1 = new Query(te1);
        while (q1.hasNext()) {
            Map<String, Term> personas = q1.next();
            Term t = (Term) personas.get("X");
            bisnieto.addItem(t.toString());
        }
    }
    public void Hermano(String persona, javax.swing.JComboBox hermano) {
        Compound te1 = new Compound(
                "hermano",
                new Term[]{
                    new Variable("X"),
                    new Atom (persona)
                }
        );
        q1 = new Query(te1);
        while (q1.hasNext()) {
            Map<String, Term> personas = q1.next();
            Term t = (Term) personas.get("X");
            hermano.addItem(t.toString());
        }
    }
    
    
    public void Hermana(String persona, javax.swing.JComboBox hermana) {
        Compound te1 = new Compound(
                "hermana",
                new Term[]{
                    new Variable("X"),
                    new Atom (persona)
                }
        );
        q1 = new Query(te1);
        while (q1.hasNext()) {
            Map<String, Term> personas = q1.next();
            Term t = (Term) personas.get("X");
            hermana.addItem(t.toString());
        }
    }
    
    
    public void Tio(String persona, javax.swing.JComboBox tio) {
        Compound te1 = new Compound(
                "tio",
                new Term[]{
                    new Variable("X"),
                    new Atom (persona)
                }
        );
        q1 = new Query(te1);
        while (q1.hasNext()) {
            Map<String, Term> personas = q1.next();
            Term t = (Term) personas.get("X");
            tio.addItem(t.toString());
        }
    }
    
    public void Tia(String persona, javax.swing.JComboBox tia) {
        Compound te1 = new Compound(
                "tia",
                new Term[]{
                    new Variable("X"),
                    new Atom (persona)
                }
        );
        q1 = new Query(te1);
        while (q1.hasNext()) {
            Map<String, Term> personas = q1.next();
            Term t = (Term) personas.get("X");
            tia.addItem(t.toString());
        }
    }
    
    public void Primo(String persona, javax.swing.JComboBox primo) {
        Compound te1 = new Compound(
                "primo",
                new Term[]{
                    new Variable("X"),
                    new Atom (persona)
                }
        );
        q1 = new Query(te1);
        while (q1.hasNext()) {
            Map<String, Term> personas = q1.next();
            Term t = (Term) personas.get("X");
            primo.addItem(t.toString());
        }
    }
    
    public void Prima(String persona, javax.swing.JComboBox prima) {
        Compound te1 = new Compound(
                "prima",
                new Term[]{
                    new Variable("X"),
                    new Atom (persona)
                }
        );
        q1 = new Query(te1);
        while (q1.hasNext()) {
            Map<String, Term> personas = q1.next();
            Term t = (Term) personas.get("X");
            prima.addItem(t.toString());
        }
    }
    
    public void madre(String persona, javax.swing.JComboBox mama) {
        Compound te1 = new Compound(
                "madre",
                new Term[]{
                    new Variable("X"),
                    new Atom (persona)
                }
        );
        q1 = new Query(te1);
        while (q1.hasNext()) {
            Map<String, Term> personas = q1.next();
            Term t = (Term) personas.get("X");
            mama.addItem(t.toString());
        }
    }
    
    public void padre(String persona, javax.swing.JComboBox papa) {
        Compound te1 = new Compound(
                "padre",
                new Term[]{
                    new Variable("X"),
                    new Atom (persona)
                }
        );
        q1 = new Query(te1);
        while (q1.hasNext()) {
            Map<String, Term> personas = q1.next();
            Term t = (Term) personas.get("X");
            papa.addItem(t.toString());
        }
    }
    
    public void Limpiar(javax.swing.JComboBox bisnieto,javax.swing.JComboBox bisabuelo, javax.swing.JComboBox bisabuela,javax.swing.JComboBox abuelo, javax.swing.JComboBox abuela, javax.swing.JComboBox papa,
                        javax.swing.JComboBox mama, javax.swing.JComboBox hermano, javax.swing.JComboBox hermana,
                        javax.swing.JComboBox primo, javax.swing.JComboBox prima, javax.swing.JComboBox tio, javax.swing.JComboBox tia){
        abuelo.removeAllItems();
        abuela.removeAllItems();
        papa.removeAllItems();
        mama.removeAllItems();
        hermano.removeAllItems();
        hermana.removeAllItems();
        primo.removeAllItems();
        prima.removeAllItems();
        tio.removeAllItems();
        tia.removeAllItems();
        bisabuelo.removeAllItems();
        bisabuela.removeAllItems();
        bisnieto.removeAllItems();
        
    }
}
