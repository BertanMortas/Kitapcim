package com.bertan.utility;


import java.util.List;
import java.util.Optional;

/**
 *
 * @param <T> -> Entity nin adı Type
 * @param <ID> -> Entity nin @Id ile işaretlenmiş alanın DataType ı
 */
public interface IService<T,ID> {
    T save(T t);
    /**
     * Belli bir entity listesini kaydetmek için kullanırız. kayıt işleminden sonra
     * kaydedilen tüm kayıtların almış oldukalrı id ler ile listesini döneriz
     */
    Iterable<T> saveAll(Iterable<T> entities);
    T update (T t);
    void delete(T t);
    void deleteById(ID id);
    Optional<T> findById(ID id);
    List<T> findAll();
}
