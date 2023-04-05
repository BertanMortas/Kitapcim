package com.bertan.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SaveYayinEviRequestDto {
    @NotEmpty
    @Size(min = 3)
    String yayinEviAd;
    String adres;
    String telefon;
}
