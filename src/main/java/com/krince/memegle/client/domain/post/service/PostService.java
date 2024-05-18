package com.krince.memegle.client.domain.post.service;

import com.krince.memegle.client.domain.post.dto.response.ResponsePostListDto;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface PostService {
    void resistPost(MultipartFile mimeImage, String content);

    List<ResponsePostListDto> getPosts();
}