package com.mithun.helloworld.dao;

import com.mithun.helloworld.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface UsersDao extends JpaRepository<Users, Integer>{

}
