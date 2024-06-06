package com.prodapt.capstoneproject.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.prodapt.capstoneproject.entities.Admin;
@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {

}