package com.pj.springdatademo.web;

import com.pj.springdatademo.model.Post;
import com.pj.springdatademo.model.PostDetails;
import com.pj.springdatademo.repo.PostDetailRepository;
import com.pj.springdatademo.repo.PostRepository;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
@RequestMapping("/api/v1/post")
public class PostController
{
    private final PostRepository postRepository;

    private final PostDetailRepository postDetailRepository;

    public PostController(PostRepository postRepository, PostDetailRepository postDetailRepository)
    {
        this.postRepository = postRepository;
        this.postDetailRepository = postDetailRepository;
    }

    @GetMapping(path = "/list")
    public List<Post> getPosts()
    {
        return postRepository.findAll();
    }

    @GetMapping(path = "/create")
    public List<Post> createAndGetPosts()
    {

        Post post=new Post();
        post.setId(new Random().nextLong());
        post.setTitle("First Post");
        post=postRepository.saveAndFlush(post);

        PostDetails postDetails=new PostDetails();
        postDetails.setCreatedBy("Admin");
        postDetails.setCreatedOn(Date.from(Instant.now()));
        postDetails.setPost(post);
        postDetailRepository.saveAndFlush(postDetails);

        return postRepository.findAll(Sort.by(Sort.Direction.DESC,"id"));
    }

    @GetMapping(path = "/delete/{id}")
    public List<Post> deleteAndGetPosts(@PathVariable Long id)
    {
        postRepository.deleteById(id);

        return postRepository.findAll();
    }
}
