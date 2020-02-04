package br.edu.ifal.agenda_rayane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AgendaController{

@Autowired
ContatoRepository contatorepository;


@RequestMapping("/")
public ModelAndView index()  {
    return new ModelAndView("index.html");
}
@RequestMapping("/FormularioContato")
public ModelAndView formularioContato(){
    return new ModelAndView("FormularioContato.html");
}
@RequestMapping("/salva-contatos")
public ModelAndView salvacontatos(Contato contato){
        contatorepository.save(contato);
        return new ModelAndView("redirect:/Formulario");

}
@RequestMapping("/ListaContatos")
public ModelAndView listacontatos(Contato contato){
    ModelAndView modelAndView = new ModelAndView("ListaContatos");
    modelAndView.addObject("Contatos", contatorepository.findAll());
    return new ModelAndView("redirect:/ListaContatos");
}





}

