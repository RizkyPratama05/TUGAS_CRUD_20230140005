package com.example.ktp.controller;

import com.example.ktp.dto.KtpDto;
import com.example.ktp.model.ApiResponse;
import com.example.ktp.service.KtpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ktp")
public class KtpController {

    @Autowired
    private KtpService ktpService;

    @PostMapping
    public ResponseEntity<ApiResponse<KtpDto>> addKtp(@RequestBody KtpDto request) {
        try {
            KtpDto result = ktpService.addKtp(request);
            return ResponseEntity.ok(new ApiResponse<>("success", "Data berhasil ditambahkan", result));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new ApiResponse<>("error", e.getMessage(), null));
        }
    }

    @GetMapping
    public ResponseEntity<ApiResponse<List<KtpDto>>> getAllKtp() {
        List<KtpDto> result = ktpService.getAllKtp();
        return ResponseEntity.ok(new ApiResponse<>("success", "Berhasil mengambil data", result));
    }

    @GetMapping("/{id}")
    public ResponseEntity<ApiResponse<KtpDto>> getKtpById(@PathVariable Integer id) {
        try {
            KtpDto result = ktpService.getKtpById(id);
            return ResponseEntity.ok(new ApiResponse<>("success", "Data ditemukan", result));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new ApiResponse<>("error", e.getMessage(), null));
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<ApiResponse<KtpDto>> updateKtp(@PathVariable Integer id, @RequestBody KtpDto request) {
        try {
            KtpDto result = ktpService.updateKtp(id, request);
            return ResponseEntity.ok(new ApiResponse<>("success", "Data berhasil diperbarui", result));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new ApiResponse<>("error", e.getMessage(), null));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse<String>> deleteKtp(@PathVariable Integer id) {
        try {
            ktpService.deleteKtp(id);
            return ResponseEntity.ok(new ApiResponse<>("success", "Data berhasil dihapus", null));
        } catch (Exception e) {
            return ResponseEntity.badRequest().body(new ApiResponse<>("error", e.getMessage(), null));
        }
    }
}