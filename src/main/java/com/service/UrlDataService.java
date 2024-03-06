package com.service;

import com.model.UrlData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.repo.UrlDataRepository;

@Service
public class UrlDataService {
    @Autowired(required = true)
    private UrlDataRepository urlDataRepository;




    public UrlData saveMinifiedUrl(String longUrl) {
        UrlData urlData = new UrlData();

        urlData.setLongurl(longUrl);
        urlData.setCode(Util.getRandomCode());
//        urlData.setCreatedAt(new Date());
//        urlData.setLastModified(new Date());
        return urlDataRepository.save(urlData);
    }
    public UrlData getResolvedUrl( String code) {
        return  urlDataRepository.findOneByCode(code);

    }
}
