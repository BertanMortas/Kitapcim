package com.bertan.service;

import com.bertan.dto.request.SaveYazarRequestDto;
import com.bertan.mapper.IYazarMapper;
import com.bertan.repository.IYazarRepository;
import com.bertan.repository.entity.Yazar;
import com.bertan.utility.ServiceManager;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class YazarService extends ServiceManager<Yazar,Long> {
    private final IYazarRepository repository;
    public YazarService(IYazarRepository repository) {
        super(repository);
        this.repository = repository;
    }
    public void save(SaveYazarRequestDto dto){
        Optional<Yazar> yazar = repository.findOptionalByAdIgnoreCase(dto.getAd());
        if (yazar.isEmpty()) {
/*            repository.save(Yazar.builder()
                            .ad(dto.getAd())
                            .biografi(dto.getBiografi())
                    .build());*/
            save(IYazarMapper.INSTANCE.toYazar(dto));
        }
    }
    public List<Yazar> findAllByContaining(String ad){
        return repository.findAllByAdContainingIgnoreCase(ad);
    }

}
