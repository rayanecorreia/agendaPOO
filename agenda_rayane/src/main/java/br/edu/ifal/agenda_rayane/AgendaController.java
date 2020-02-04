package br.edu.ifal.agenda_rayane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;




@Controller
public class AgendaController{

@Autowired
ContatoRepository contatorepository;
CompromissoRepository compromissorepository;


@RequestMapping("/")
public ModelAndView index()  {
    return new ModelAndView("index.html");
}
@RequestMapping("/FormularioAgenda")
public ModelAndView formulario(){
    return new ModelAndView("FormularioAgenda.html");
}
@RequestMapping("/FormularioContato")
public ModelAndView formularioContato(){
    return new ModelAndView("FormularioContato.html");
}
@RequestMapping("/FormularioCompromisso")
public ModelAndView formularioCompromisso(){
    return new ModelAndView("FormularioCompromisso.html");
}
@RequestMapping("/salva-contatos")
public ModelAndView salvacontatos(Contato contato){
        contatorepository.save(contato);
        return new ModelAndView("redirect:/Formulario");

}
@RequestMapping("/salva-compromisso")
public ModelAndView salvacontatos(Compromisso compromisso){
        compromissorepository.save(compromisso);
        return new ModelAndView("redirect:/FormularioCompromisso");


}
