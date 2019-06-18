package com.pj.springdatademo.repo;

import com.pj.springdatademo.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Long>
{
}
