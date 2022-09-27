package com.example.demo.repositories;

import com.example.demo.model.Registeration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRegisterationRepo extends
        JpaRepository<Registeration,Integer> {
}
