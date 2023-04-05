package com.bertan.controller;

import com.bertan.dto.request.SaveKitapRequestDto;
import com.bertan.dto.response.FindByYazarAdiResponseDto;
import com.bertan.repository.entity.Kitap;
import com.bertan.repository.view.WvYazarKitap;
import com.bertan.service.KitapService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

import static com.bertan.constants.EndPointList.*;

@RestController
@RequestMapping(KITAP)
@RequiredArgsConstructor
public class KitapController {
    private final KitapService kitapService;

    /**
     * ÖDEV
     * Kitap adı verilince yazar listesi gelsin √
     * Tür adı verilince kitap listesi gelsin
     */
    @PostMapping(SAVE)
    public ResponseEntity<Kitap> saveKitap(@RequestBody @Valid SaveKitapRequestDto dto){
        return ResponseEntity.ok(kitapService.save(dto));
    }
    @GetMapping(FIND_ALL)
    public ResponseEntity<List<Kitap>> findAll(){
        return ResponseEntity.ok(kitapService.findAll());
    }
    @GetMapping("/find-yazar-list")
    public ResponseEntity<List<String>> findYazarList(String kitapAdi){
        List<String> yazarAdList = kitapService.kitapAdiToYazarList(kitapAdi);
        return ResponseEntity.ok(yazarAdList);
    }
    @GetMapping("/find-kitap-list")
    public ResponseEntity<List<String>> findKitapList(String ad) {
        List<String> kitapList = kitapService.findKitapByTurId(ad);
        return ResponseEntity.ok(kitapList);
    }
    @GetMapping("/find-kitap-yazar")
    public ResponseEntity<List<WvYazarKitap>> findByYazarkitap(String ad) {
        List<WvYazarKitap> kitapList = kitapService.findByYazarkitap(ad);
        return ResponseEntity.ok(kitapList);
    }

    /**
     * Controller katmanında alınan ve iletilen tüm datalar
     * DTO (data transfer object) olarak kullanılmaktadır
     * requestDTO responseDTO
     *
     * Repository ile bir veritabanından bilgi çekiliyor ise bu çekilen bilgilerde
     * entity dışında belli bir özellikle bütünü olarak çekilecekse
     * Wiev kullanılmalıdır
     */
    @GetMapping(FIND_BY_YAZARADI)
    public ResponseEntity<List<FindByYazarAdiResponseDto>> findYazarAdi(String yazarAdi){
        List<FindByYazarAdiResponseDto> result = kitapService.findByYazarAdi(yazarAdi);
        return ResponseEntity.ok(result);
    }
}
