package com.kerm.javaspringdemo;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

/**
 * Controller class for handling requests related to names.
 */
@Controller
public class NameController {

    private NameRepository nameRepository;

    /**
     * Constructs a new NameController, injecting the NameRepository dependency.
     * @param nameRepository The repository for managing NameEntity objects.
     */
    public NameController(NameRepository nameRepository) {
        this.nameRepository = nameRepository;
    }

    /**
     * Handles GET requests to the "/hello" endpoint.
     * Retrieves a name based on the provided user ID and adds it to the model.
     * @param user The user ID provided as a request parameter (default is 0).
     * @param model The Spring MVC model to add attributes.
     * @return The view name ("hello") to be rendered.
     */
    @GetMapping("/hello")
    public String findName(@RequestParam(name = "user", required = false, defaultValue = "0") Integer user, Model model) {

        String attributeValue;

        // Check if the user ID is 0, and set a default attribute value accordingly.
        if (user == 0) {
            attributeValue = "World";
        } else {
            // Retrieve NameEntity by ID from the repository.
            final Optional<NameEntity> nameEntity = nameRepository.findById(user);

            // Check if the NameEntity is present in the repository.
            if (nameEntity.isPresent()) {
                attributeValue = nameEntity.get().getName();
            } else {
                attributeValue = "Void";
            }
        }

        // Add the attribute to the model for rendering in the view.
        model.addAttribute("name", attributeValue);

        // Return the name of the view to be rendered.
        return "hello";
    }
}