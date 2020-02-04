package br.edu.ifal.agenda_rayane;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Agenda {

    @Id
    @GeneratedValue
    private Long id;
    private String proprietario;
    private String email;
    private String telefone;
    //@OneToMany
    //private  Contato contato ;

    /**
     * @return the proprietario
     */
    public String getProprietario() {
        return proprietario;
    }

    /**
     * @param proprietario the proprietario to set
     */
    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the telefone
     */
    public String getTelefone() {
        return telefone;
    }

    /**
     * @param telefone the telefone to set
     */
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /**
     /* @return the contato
     */
    //public Contato getContato() {
      //  return contato;
    //}

    /**
     /* @param contato the contato to set
     */
    //public void setContato(Contato contato) {
   //     this.contato = contato;
//}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    

    
}