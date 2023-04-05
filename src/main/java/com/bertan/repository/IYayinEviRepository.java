package com.bertan.repository;

import com.bertan.repository.entity.YayinEvi;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IYayinEviRepository extends JpaRepository<YayinEvi,Long> {
}
