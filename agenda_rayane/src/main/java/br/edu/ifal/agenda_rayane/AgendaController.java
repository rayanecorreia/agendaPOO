package br.edu.ifal.agenda_rayane;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class AgendaController {

    @Autowired
    ContatoRepository contatorepository;

    @RequestMapping("/")
    public ModelAndView index() {
        return new ModelAndView("index.html");
    }

    @RequestMapping("/FormularioContato")
    public ModelAndView formularioContato(Contato contato) {
        return new ModelAndView("FormularioContato.html");
    }

    @RequestMapping("/salva-contatos")
    public ModelAndView salvacontatos(Contato contato) {
        contatorepository.save(contato);
        return new ModelAndView("redirect:/ListaContato");

    }

    @RequestMapping("/ListaContato")
    public ModelAndView listacontato() {
        ModelAndView modelAndView = new ModelAndView("ListaContato");
        modelAndView.addObject("contatos", contatorepository.findAll());
        return modelAndView;
    }
    @RequestMapping("/BuscarContato")
    public ModelAndView buscarcontato(String nome){
        ModelAndView modelAndView = new ModelAndView("ListaContato");
        modelAndView.addObject("contatos", contatorepository.findByNomeContaining(nome));
        return modelAndView;
    }
    @RequestMapping("/Excluir_Contato/{idContato}")
    public ModelAndView excluir(@PathVariable("idContato") Long contatoID, RedirectAttributes redirect){
        ModelAndView modelAndView = new ModelAndView("redirect:/ListaContato");
      contatorepository.deleteById(contatoID);    
      redirect.addFlashAttribute("mensagem", " Contato" + " excluido com sucesso.");
      return modelAndView;
}
@RequestMapping("/Atualizar_Contato/{idContato}")
public ModelAndView atualizar(@PathVariable("idContato") Long contatoID) {
    Optional<Contato> opcao = contatorepository.findById(contatoID);
    ModelAndView modelAndView = new ModelAndView("FormularioContato.html");
    modelAndView.addObject("contato", opcao.get());
return modelAndView;

}
}
