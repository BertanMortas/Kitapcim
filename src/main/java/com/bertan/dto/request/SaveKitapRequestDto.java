package com.bertan.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveKitapRequestDto {
    String ad;
    Integer sayfaSayisi;
    Long basimtarihi;
    List<Long> yazarids;
    Long yayineviid;
    List<Long> turids;
}
