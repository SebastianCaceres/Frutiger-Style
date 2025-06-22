package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService {
    @Autowired
    private ProjectRepository projectRepository;
    public ProjectService(ProjectRepository projectRepository){
        this.projectRepository = projectRepository;
    }
    public void initializeProjects() {
        List<Project> projects = List.of(
                new Project("Weather App", "Displays weather forecasts using OpenWeather API.", "https://github.com/yourname/weather-app"),
                new Project("Task Manager", "A to-do app with user authentication.", "https://github.com/yourname/task-manager"),
                new Project("Portfolio Site", "Personal website to showcase projects and resume.", "https://yourname.github.io")
        );

        projectRepository.saveAll(projects);
    }
    public List<Project> findAll(){
        return projectRepository.findAll();
    }


}
