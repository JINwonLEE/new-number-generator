package com.example.newnumbergenerator;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@RestController
@Controller
public class MainController {

    @RequestMapping("/")
    //@ResponseBody
    public String mainPage() {
        final String result = "mainPage";

        return result;

    }

}