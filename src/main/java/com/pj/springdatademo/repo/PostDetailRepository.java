package com.pj.springdatademo.repo;

import com.pj.springdatademo.model.PostDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostDetailRepository extends JpaRepository<PostDetails,Long>
{
}
