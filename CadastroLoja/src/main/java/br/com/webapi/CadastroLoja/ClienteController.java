package br.com.webapi.CadastroLoja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class ClienteController {
    @GetMapping ("/boasVindas")
    public String boasVindas(){
        return "Boas Vindas!";
    }
}
