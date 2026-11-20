package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.entity.Post;
import com.springboot.service.PostService;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/posts")
public class PostController {
	
	@Autowired
	private PostService postService;
	
	@GetMapping("/getAll")
	public List<Post> getAll(){
		return postService.getAll();
	}
	@GetMapping("/{id}")
	public Post getById(@PathVariable Long id) {
		return postService.getById(id);
	}
	@PostMapping("/create")
	public Post createPost(@RequestBody Post post) {
		return postService.create(post);
	}
	@DeleteMapping("/delete/{id}")
	public void deletePost(@PathVariable Long id) {
		postService.delete(id);
	}
	@PutMapping("/update/{id}")
	public Post updatePost(@PathVariable Long id, @RequestBody Post post) {
		return postService.update(id, post);
	}
}
