package com.bertan.service;

import com.bertan.repository.IYazarKitapRepository;
import com.bertan.repository.entity.YazarKitap;
import com.bertan.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YazarKitapService extends ServiceManager<YazarKitap,Long> {
    private final IYazarKitapRepository repository;
    public YazarKitapService(IYazarKitapRepository repository){
        super(repository);
        this.repository=repository;
    }
    public void save(Long yazarId, Long kitapId){
        save(YazarKitap.builder()
                .yazarid(yazarId).kitapid(kitapId).build());
    }
    public List<Long> getAllByYazarid(Long id){
        return repository.getAllByYazarid(id);
    }

}
