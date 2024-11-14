package org.example.controller;


import org.example.post.Post;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api/posts")
public class PostController {
    private List<Post> posts = new ArrayList<>();

    @GetMapping("/{id")
    Optional<Posy> finalbyId(@PathVariable Integer id){
        return Optioonal.ofNullable(posts
                .stream()
                .filter(post -> post.id().equals(id))
                .findFirst()
                .orElseThrow(() -> new PostNotFoundException("Post with id: " + id + " not found."))
        );
    }

    @PostMapping
    void create(@RequestBody Post post){
        post.add(post);
    }
}
