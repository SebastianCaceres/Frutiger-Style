package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Autowired
    private ProjectService projectService;
    public HomeController (ProjectService projectService){
        this.projectService = projectService;
    }

    // Existing Style Showcase Pages
    @GetMapping("95-style")
    public String style95() { // Model might not be needed if static
        return "95-style";
    }

    @GetMapping("Forms")
    public String formsTest() { // Renamed method to follow Java conventions
        return "Forms";
    }

    @GetMapping("Tests")
    public String testsPage() { // Renamed method
        return "Tests";
    }

    @GetMapping("xp-style")
    public String styleXp() { // Renamed method
        return "xp-style";
    }
    @GetMapping("Win7Style")
    public String Win7Style(Model model) {
        model.addAttribute("projects",projectService.findAll());
        return "Win7";
    }
}
