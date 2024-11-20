package dev.learnToCode.jte;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HomeController {
    @GetMapping("")
    public String home(Model model) {
        var page = new Page("Hello, JTE", "This is Home Page");
        var items = List.of("My Item1", "My Item2", "My Item3");

        model.addAttribute("name", "Developer");
        model.addAttribute("page", page);
        model.addAttribute("items", items);
        return "index";
    }
}
