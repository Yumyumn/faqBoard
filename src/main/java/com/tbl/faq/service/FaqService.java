package com.tbl.faq.service;

import com.tbl.faq.entity.Faq;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import com.tbl.faq.entity.FaqResult;
import org.springframework.stereotype.Service;

@Service
public interface FaqService {
    public void saveFaq(Faq faq);
    public List<Faq> findAll();
    public Optional<Faq> findOne(int id);
    public void updateFaq(int id, Faq faq);
    public void deleteFaq(int id);
    public List<Faq> searchFaq(String keyword);
    public List<Faq> sortFaqAsc();
    public List<Faq> sortFaqDesc();
    public List<FaqResult> getFaqList(Integer page, Integer size);
    public <R, T> T sourceToDestination(R source, T destination);
//    public void close();
}
