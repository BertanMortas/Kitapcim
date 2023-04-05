package com.bertan.repository;

import com.bertan.repository.entity.YazarKitap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IYazarKitapRepository extends JpaRepository<YazarKitap,Long> {
    /**
     * Amaç; yazar id si verilen kayıtları çekmek ve kitap idlerini liste halinde dönmek
     */
    @Query("select yk.kitapid from YazarKitap yk where yk.yazarid = ?1")
    List<Long> getAllByYazarid(Long yazarid);
    List<YazarKitap> findAllByYazarid(Long yazarid);
}
