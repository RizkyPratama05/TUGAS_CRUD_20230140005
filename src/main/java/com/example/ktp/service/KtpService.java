package com.example.ktp.service;

import com.example.ktp.dto.KtpDto;
import java.util.List;

public interface KtpService {
    KtpDto addKtp(KtpDto request);
    List<KtpDto> getAllKtp();
    KtpDto getKtpById(Integer id);
    KtpDto updateKtp(Integer id, KtpDto request);
    void deleteKtp(Integer id);
}