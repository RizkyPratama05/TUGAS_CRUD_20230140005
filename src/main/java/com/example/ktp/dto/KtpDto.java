package com.example.ktp.dto;

import lombok.Data;
import java.time.LocalDate;

@Data
public class KtpDto {
    private Integer id;
    private String nomorKtp;
    private String namaLengkap;
    private String alamat;
    private LocalDate tanggalLahir;
    private String jenisKelamin;
}