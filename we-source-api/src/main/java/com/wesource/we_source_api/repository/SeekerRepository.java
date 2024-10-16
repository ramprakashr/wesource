package com.wesource.we_source_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wesource.we_source_api.model.Seeker;

@Repository
public interface SeekerRepository extends JpaRepository<Seeker, Integer>  {

}
