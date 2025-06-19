package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // Portfolio Pages
    @GetMapping("/")
    public String portfolioHome(Model model) {
        return "index"; // This will be our XP-themed portfolio home
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
}
