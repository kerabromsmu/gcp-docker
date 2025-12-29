package se.dimage.gcp_uppgift.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class PublicController {
    @GetMapping
    public String rootView() {
        return "index.html";
    }

}
