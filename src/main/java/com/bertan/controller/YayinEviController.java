package com.bertan.controller;

import com.bertan.dto.request.SaveYayinEviRequestDto;
import com.bertan.repository.entity.YayinEvi;
import com.bertan.service.YayinEviService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;
import java.util.List;

import static com.bertan.constants.EndPointList.*;

@RestController
@RequestMapping(YAYINEVI)
@RequiredArgsConstructor
public class YayinEviController {
    private final YayinEviService yayinEviService;
    @PostMapping(SAVE)
    public ResponseEntity<Void> save(@RequestBody @Valid SaveYayinEviRequestDto dto){
        yayinEviService.save(dto);
        return ResponseEntity.ok().build();
    }
    @PostMapping(FIND_ALL)
    public ResponseEntity<List<YayinEvi>> findAll(){
        return ResponseEntity.ok(yayinEviService.findAll());
    }
}
