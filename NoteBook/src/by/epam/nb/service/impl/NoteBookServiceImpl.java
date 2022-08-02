package by.epam.nb.service.impl;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import by.epam.nb.beans.Note;
import by.epam.nb.beans.NoteBook;
import by.epam.nb.controller.NoteBookProvider;
import by.epam.nb.service.NoteBookService;

public class NoteBookServiceImpl implements NoteBookService {
	
private static final NoteBookProvider provider = NoteBookProvider.getInstance();
	
	private NoteBook nb;
	
	
	public NoteBookServiceImpl() {
		this.nb = new NoteBook();
		provider.addNewNoteBook(nb);
	}
	public NoteBookServiceImpl(int index) {
		this.nb = provider.getNoteBook(index);
	}	

	@Override
	public void addNote(String noteContent) {
		
		nb.add(noteContent);
	}

	@Override
	public void addNote(Note note) {
		nb.add(note);
	}

	@Override
	public Note  find(Date date) {
		List<Note> notes = nb.getNotes();
		for (Note n : notes) {
			if (n.getDate().equals(date)) {
				return n;
			}
		}
		return null;
	}
	public void setNb(int index) {
		this.nb = provider.getNoteBook(index);
	}
	
	public int getNBIndex() {
		return provider.whSize();
	}
	public NoteBook getNb() {
		return this.nb;
	}
	@Override
	public List<Note> find(String noteContent) {
		List<Note> notes = nb.getNotes();
		List<Note> result = new ArrayList<Note>();
	
		for (Note n : notes) {
			if (n.getNote().contains(noteContent)) {
				result.add(n);
			}
		}
		return result;
	}

	@Override
	public boolean deleteNote(Note note) {
		return ( this.nb.deleteNote(note));	
	
	}
	@Override
	public boolean deleteNote(String noteContent) {
		//this.nb.find (noteContent)
		return false;
	}



}
