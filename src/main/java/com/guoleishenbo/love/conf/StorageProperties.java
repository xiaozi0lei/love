package com.guoleishenbo.love.conf;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author GuoLei Sun
 * @date 2020/11/28 4:27 PM
 */
@ConfigurationProperties("storage")
public class StorageProperties {
    /**
     * Folder location for storing files
     */
    private String location = "upload-dir";

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
