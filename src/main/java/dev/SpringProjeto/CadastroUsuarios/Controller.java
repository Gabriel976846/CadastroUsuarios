package dev.SpringProjeto.CadastroUsuarios;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class Controller {

    @GetMapping("/boasvindas")
    public String teste01(){
        return "Essa é minha primeira mensagem nessa rota";
    }
}
