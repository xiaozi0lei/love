package com.guoleishenbo.love.service;

import org.springframework.core.io.Resource;
import org.springframework.web.multipart.MultipartFile;

import java.nio.file.Path;
import java.util.stream.Stream;

/**
 * @author GuoLei Sun
 * Date: 2020/11/28 4:20 PM
 */
public interface StorageService {
//    void init();

    void store(MultipartFile file);

    Stream<Path> loadAll();
//
    Path load(String filename);
//
    Resource loadAsResource(String filename);
//
//    void deleteAll();
}
