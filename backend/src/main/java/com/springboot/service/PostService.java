package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.entity.Post;
import com.springboot.repository.PostRepository;

@Service
public class PostService {

	@Autowired
	private PostRepository postRepository;
	
	public List<Post> getAll(){
		return postRepository.findAll();
	}
	
	public Post getById(long id) {
		return postRepository.findById(id).orElseThrow();
	}
	
	public Post create(Post post) {
		return postRepository.save(post);
	}
	
	public void delete(Long id) {
		postRepository.deleteById(id);
	}
	
	public Post update(Long id, Post post) {
		Post pre = postRepository.findById(id).orElseThrow();
		
		pre.setTitle(post.getTitle());
		pre.setContent(post.getContent());
		pre.setAuthor(post.getAuthor());
		
		return postRepository.save(pre);
				 
	}
}
