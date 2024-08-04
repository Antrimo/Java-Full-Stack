package com.spring.journalApp.controller;

import com.spring.journalApp.entity.JournalEntry;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/route")
public class JournalEntryController {

    private Map<Long, JournalEntry> journalEntryMap = new HashMap<>();

    @GetMapping
    public List<JournalEntry> getAll() {
        return new ArrayList<>(journalEntryMap.values());
    }

    @PostMapping
    public boolean createEntry(@RequestBody JournalEntry myEntry){
        journalEntryMap.put(myEntry.getId(), myEntry);
        return true;
    }
}
