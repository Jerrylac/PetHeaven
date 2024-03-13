package com.example.PetHeaven.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.PetHeaven.entity.Member;

@Repository
public interface MemberDao extends JpaRepository<Member,String>{

}
