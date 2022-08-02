package by.epam.nb.service;

import java.util.Date;
import java.util.List;

import by.epam.nb.beans.Note;
import by.epam.nb.beans.NoteBook;

public interface NoteBookService {
	
	public void addNote (String noteContent);
	public void addNote ( Note note);
	
	public Note  find ( Date date);
	public List<Note>  find (String noteContent);
	
	public boolean deleteNote (Note note);
	public boolean deleteNote (String noteContent);
	
	//public int size ();

	public void setNb(int index);
	public int getNBIndex() ;
	public NoteBook getNb() ;
}
