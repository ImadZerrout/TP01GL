package org.emp.gl;
import java.util.Objects;
/**
 * Hello world!
 *
 */
public class Etudiant 
{
    private String nom;
    private String prenom;
    private int age;

    public Etudiant(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public int getAge() {
        return age;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    @Override
   public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Etudiant student = (Etudiant) o;
        return age == student.age &&
               nom.equals(student.nom) &&
               prenom.equals(student.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, age);
    }

    @Override
    public String toString() {
        return "Etudiant{" + "nom=" + nom + ", prenom=" + prenom + ", age=" + age + '}';
    }

}
