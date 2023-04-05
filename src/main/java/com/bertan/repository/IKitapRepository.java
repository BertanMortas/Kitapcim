package com.bertan.repository;

import com.bertan.repository.entity.Kitap;
import com.bertan.repository.view.WvYazarKitap;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IKitapRepository extends JpaRepository<Kitap,Long> {
@Query(nativeQuery = true,value = "select y.ad from tblkitap as k inner join tblyazarkitap as yk on k.id = yk.kitapid\n" +
        "inner join tblyazar as y on y.id = yk.yazarid where k.ad = ?1")
List<String> findByAd(String kitapAd);

@Query(nativeQuery = true, value = "select k.ad from tblkitap as k \n" +
        "inner join tblturkitap as tk on k.id = tk.kitapid\n" +
        "where tk.turid=?1")
    List<String> findKitapByTurId(Long id);

    /**
     * IMapper ile dto ya çevirmek gerekiyor ilerleyen süreçler için
     * (daha sonra veriler değiştiğinde dto ile değişim daha kolay olacaktır).
     */
    @Query("select new com.bertan.repository.view.WvYazarKitap(y.ad, k.ad) from Kitap as k inner join YazarKitap as yk on k.id = yk.kitapid\n" +
            "inner join Yazar as y on y.id = yk.yazarid where k.ad = ?1")
    List<WvYazarKitap> findByYazarkitap(String kitapAd);
}

