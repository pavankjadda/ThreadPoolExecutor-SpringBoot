package com.pj.springdatademo.repo;

import com.pj.springdatademo.model.DBFile;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DbFileRepository extends JpaRepository<DBFile,Long>
{
}
