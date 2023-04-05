package com.bertan.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tblturkitap")
public class TurKitap {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long turid;
    Long kitapid;
}
