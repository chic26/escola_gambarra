package com.escolaGambarra;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlunoController {

    @GetMapping("/")
    public String exibirFichaMatricula(Model model) {
        // Instancia o modelo Aluno (pode vir com dados de teste ou em branco)
        Aluno aluno = new Aluno(
            "Ana Silva",
            "Rua das Flores, 123 - Centro",
            "(83) 99999-1234",
            "ana.silva@email.com",
            "2025001"
        );

        // Envia o objeto aluno para a página HTML
        model.addAttribute("aluno", aluno);
        return "index";
    }
}