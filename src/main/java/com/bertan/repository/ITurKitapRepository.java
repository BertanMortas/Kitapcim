package com.bertan.repository;

import com.bertan.repository.entity.TurKitap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ITurKitapRepository extends JpaRepository<TurKitap,Long> {
}
