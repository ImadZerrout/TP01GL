package org.emp.gl;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args )
    {
        GestionnaireEtudiant g=new GestionnaireEtudiant();
        Etudiant e1=new Etudiant("Zerrout","Imad",23);
        Etudiant e2=new Etudiant("Snoussi","Abdo",23);
        Etudiant e3=new Etudiant("Djaafri","Anwar",23);
        g.sauvgarder(e1);
        g.sauvgarder(e2);
        System.out.println(g.Verifier(e3));
    }
}
