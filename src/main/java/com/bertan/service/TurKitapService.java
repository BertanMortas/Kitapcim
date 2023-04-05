package com.bertan.service;


import com.bertan.repository.ITurKitapRepository;
import com.bertan.repository.entity.TurKitap;
import com.bertan.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class TurKitapService extends ServiceManager<TurKitap,Long> {
    private ITurKitapRepository repository;
    public TurKitapService(ITurKitapRepository repository){
        super(repository);
        this.repository=repository;
    }
    public void save(Long turId, Long kitapId){
        save(TurKitap.builder()
                .turid(turId).kitapid(kitapId).build());
    }
}
