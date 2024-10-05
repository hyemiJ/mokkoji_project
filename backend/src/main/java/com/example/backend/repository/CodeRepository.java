package com.example.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.backend.entity.Code;
import com.example.backend.entity.CodeId;

import java.util.List;

public interface CodeRepository extends JpaRepository<Code, CodeId> {

	@Query(nativeQuery=true,value="select * from code where main_type='01PC'")
	List<Code> findPC();
}
