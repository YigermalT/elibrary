package edu.mumcs.cs425.demowepapp.elibrary;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomePageController {

    @GetMapping (value = {"/", "/elibrary","elibrary/home"})
    public String displayHomepage( ){
        return "home/index";
    }

}
