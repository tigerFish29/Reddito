package com.example.springlight.controller;

import com.example.springlight.domain.Link;
import com.example.springlight.repos.LinkRepo;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/links")
public class LinkController {

    private LinkRepo linkRepo;
    // constructor
    public LinkController(LinkRepo linkRepo) {
        this.linkRepo = linkRepo;
    }


    // list
    @GetMapping("/")
    public List<Link> list() {
        return linkRepo.findAll();
    }

    // crud functionality
    @PostMapping("/create")
    public Link create(@ModelAttribute Link link) {
        return linkRepo.save(link);
    }

    @GetMapping("/{id}")
    public Optional<Link> read(@PathVariable Long id) {
        return linkRepo.findById(id);
    }


    @PutMapping("/{id}")
    public Link update(@PathVariable Long id, @ModelAttribute Link link) {
        return linkRepo.save(link);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        // return something
        linkRepo.deleteById(id);
    }
}
