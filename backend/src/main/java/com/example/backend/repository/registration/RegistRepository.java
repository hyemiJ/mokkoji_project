package com.example.backend.repository.registration;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.backend.entity.registration.Regist;

import java.util.List;

@Repository
public interface RegistRepository extends JpaRepository<Regist, String>{
	
	@Query(nativeQuery=true,
			value = "SELECT regist_code, name, regist_option, teenager, adult, hightlight_1, hightlight_2, hightlight_3, hightlight_4, package_detail, restrict_detail, reserve_restrict, etc_detail\n"
			+ "FROM project.regist;")
	List<?> findByRegist();
}
