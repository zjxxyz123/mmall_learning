package com.mmall.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * Created by zjx on 2018/5/22.
 */
public interface IFileService {
    String upload(MultipartFile file, String path);
}
