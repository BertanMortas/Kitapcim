package com.bertan.repository;

import com.bertan.repository.entity.Tur;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ITurRepository extends JpaRepository<Tur,Long> {
    /**
     * Tür adının sorgulanarak veri tabanında olup olmadığına bakılır.
     * @param ad -> tür adını giriniz
     * @return -> Optional olarak bulunan tur döner
     */
    Optional<Tur> findOptionalByAdIgnoreCase(String ad);

}
