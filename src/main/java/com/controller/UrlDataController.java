package com.controller;

import com.dto.UrlRequest;
import com.model.UrlData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.service.UrlDataService;

@RestController
@RequestMapping("/")
public class UrlDataController {

    @Autowired
    private UrlDataService urlDataService;
    @CrossOrigin(origins = "*")
    @PostMapping("/shorten")
    public UrlData createTinyUrl(@RequestBody UrlRequest urlRequest)
    {
        return urlDataService.saveMinifiedUrl(urlRequest.getLongUrl());
    }
    @CrossOrigin(origins = "*")
    @GetMapping("/resolveUrl/{shortUrl}")
    public UrlData getResolvedUrl(@PathVariable String shortUrl)
    {
        return urlDataService.getResolvedUrl(shortUrl);
    }
}
