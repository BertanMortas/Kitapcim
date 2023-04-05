package com.bertan.service;

import com.bertan.dto.request.SaveYayinEviRequestDto;
import com.bertan.mapper.IYayinEviMapper;
import com.bertan.repository.IKitapRepository;
import com.bertan.repository.IYayinEviRepository;
import com.bertan.repository.entity.YayinEvi;
import com.bertan.utility.ServiceManager;
import org.springframework.stereotype.Service;

@Service
public class YayinEviService extends ServiceManager<YayinEvi,Long> {
    private final IYayinEviRepository repository;
    public YayinEviService(IYayinEviRepository repository) {
        super(repository);
        this.repository = repository;
    }
    public void save(SaveYayinEviRequestDto dto){
        repository.save(IYayinEviMapper.INSTANCE.toYayinEvi(dto));
    }
}
