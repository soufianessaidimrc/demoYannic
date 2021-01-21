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
                return "write down your name and last name in the path like this: PATH/welcometomypage/name/lastname";
    }

    @GetMapping("/spring")
    public String test() {
        return "Heloo World from Spring";
    }
    @GetMapping(path = "/welcometomypage/{name}/{sname}")
    public String message(@PathVariable("name") String name,@PathVariable("sname") String sname) {
        return "welcome : "+name+" "+sname;
    }
    
}

