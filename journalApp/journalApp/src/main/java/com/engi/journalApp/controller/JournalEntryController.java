package com.engi.journalApp.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.engi.journalApp.entity.JournalEntry;

@RestController
@RequestMapping("/journal")
public class JournalEntryController {
	
	private Map<Long,JournalEntry> journalEntries = new HashMap<>();
	
	@GetMapping()
	public List<JournalEntry> getAll(){
		return new ArrayList<>(journalEntries.values());
		
		
	}
	
	
	@PostMapping
	public  boolean createEntry(@RequestBody JournalEntry myEntry) {
		journalEntries.put(myEntry.getId(),myEntry);
		return true;
		
	}
	
	@GetMapping("id/{myId}")
	public JournalEntry getGeneralEntryById(@PathVariable Long myId) {
		return journalEntries.get(myId);
		
		
	}
	
	@DeleteMapping("id/{myId}")
	public JournalEntry deleteEntryById(@PathVariable Long myId) {
		return journalEntries.remove(myId);
	}
	
	@PutMapping
	public JournalEntry updateJournalById(@PathVariable Long id,@RequestBody JournalEntry myEntry) {
		return journalEntries.put(id, myEntry);
	}

}
