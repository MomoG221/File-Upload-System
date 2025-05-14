package com.amigoscode.s3;

import org.springframework.stereotype.Service;

@Service
public class S3Service {

    private final S3Service s3Client;

    public S3Service(S3Service s3Client) {
        this.s3Client = s3Client;
    }

    public void putObject() {
        
    }



}
