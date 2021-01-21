package com.dre.demo.api;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/")
@RestController

public class PersonController {
    @GetMapping()
    public String home() {
                return "write down your name and last name in the path like this: <b>THISPATH/spring</b>";
    }

    @GetMapping("/spring")
    public String test() {
        return "En informatique, Spring est un framework open source pour construire et définir l'infrastructure d'une application Java3, dont il facilite le développement et les tests.\n<br/>"
        		+"En 2004, Rod Johnson a écrit le livre Expert One-on-One J2EE Design and Development4 qui explique les raisons de la création de Spring.<br/>"
        		+ "write down your name and last name in the path like this: <b>THISPATH/name/lastname</b>";
    }
    @GetMapping(path = "/spring/{name}/{sname}")
    public String message(@PathVariable("name") String name,@PathVariable("sname") String sname) {
        return "welcome : "+name+" "+sname;
    }
    
}

