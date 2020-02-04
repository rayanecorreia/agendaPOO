package br.edu.ifal.agenda_rayane;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Contato{
    
    @Id
    private Long id;
    private String nome;
    private String sobrenome;
    private String telefone;
    private String email;
    private String aniversario;


    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sobrenome
     */
    public String getSobrenome() {
        return sobrenome;
    }

    /**
     * @param sobrenome the sobrenome to set
     */
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
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
     * @return the aniversariante
     */
    public String getAniversario() {
        return aniversario;
    }

    /**
     * @param aniversariante the aniversariante to set
     */
    public void setAniversario(String aniversario) {
        this.aniversario = aniversario;
    }
    
    

}
