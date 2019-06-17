package com.pj.springdatademo.repo;

import com.pj.springdatademo.model.UserProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface UserProfileBaseRepository<T extends UserProfile> extends JpaRepository<T,Long>
{
}
