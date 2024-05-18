package com.krince.memegle.admin.domain.admin.service;

import com.krince.memegle.admin.domain.admin.dto.request.RequestAdminLoginDto;
import com.krince.memegle.admin.domain.admin.repository.AdminRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

    private final AdminRepository adminRepository;

    public void login(RequestAdminLoginDto requestAdminLoginDto) {
        String adminId = requestAdminLoginDto.getAdminId();
        String password = requestAdminLoginDto.getPassword();

        adminRepository.findByAdminIdAndPassword(adminId, password).orElseThrow(NoSuchElementException::new);
    }
}