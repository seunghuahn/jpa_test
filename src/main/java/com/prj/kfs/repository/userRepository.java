package com.prj.kfs.repository;

import com.prj.kfs.entity.userEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface userRepository extends JpaRepository<userEntity, Long> {
}
