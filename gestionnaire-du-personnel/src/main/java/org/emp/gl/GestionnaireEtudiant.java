package org.emp.gl;
import java.util.ArrayList;
import java.util.List;
/**
 * Hello world!
 *
 */
public class GestionnaireEtudiant 
{
    private List<Etudiant> list;
    public  void sauvgarder( Etudiant e )
    {
       this.list.add(e);
    }
    public  Boolean Verifier( Etudiant e )
    {
       return this.list.contains(e);
       
    }

    public GestionnaireEtudiant() {
        this.list = new ArrayList<>();
    }
    
}
