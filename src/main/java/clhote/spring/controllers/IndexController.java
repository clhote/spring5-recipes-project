package clhote.spring.controllers;

import org.hibernate.annotations.SourceType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by CLH3623 on 28/09/2017.
 */
@Controller
public class IndexController {

    @RequestMapping({"","/","/index"})
    public String getIndexPage(){
        System.out.println("Some message to say... 1234");
        return "index";
    }
}
