package com.example.ktp.util;

import com.example.ktp.dto.KtpDto;
import org.springframework.stereotype.Component;

@Component
public class ValidationUtil {
    public void validate(KtpDto dto) {
        if (dto.getNomorKtp() == null || dto.getNomorKtp().isBlank()) {
            throw new RuntimeException("Nomor KTP tidak boleh kosong!");
        }
        if (dto.getNamaLengkap() == null || dto.getNamaLengkap().isBlank()) {
            throw new RuntimeException("Nama Lengkap tidak boleh kosong!");
        }
        if (dto.getTanggalLahir() == null) {
            throw new RuntimeException("Tanggal Lahir tidak boleh kosong!");
        }
    }
}