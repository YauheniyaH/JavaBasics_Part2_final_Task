package by.epam.nb.main;

import java.io.IOException;
import java.util.List;

import by.epam.nb.view.PrintNoteView;
import by.epam.nb.beans.Note;
import by.epam.nb.dao.impl.NoteDAOImpl;
import by.epam.nb.dao.impl.NoteDaoException;
import by.epam.nb.service.impl.NoteBookServiceImpl;

public class Main {

	public static void main(String[] args) throws NoteDaoException {
		NoteBookServiceImpl logic = new NoteBookServiceImpl();
		PrintNoteView view = new PrintNoteView();
		System.out.println(logic.getNBIndex());

		NoteDAOImpl input = new NoteDAOImpl();

		try {
			logic.setNb(0);

			logic.addNote(input.inputContent());
			logic.addNote("11411");
			logic.addNote("1111");
			view.print(logic.getNb());

			List<Note> notes = logic.find("1111");
			view.print(notes);

			Note note = notes.get(0);
			view.print(note);

			logic.setNb(0);
			logic.addNote("33333");
			view.print(logic.getNb());

			logic.deleteNote(note);
			view.print(logic.getNb());

		} catch (IOException e) {
			throw new NoteDaoException(e);

		} catch (Exception e) {
			throw new NoteDaoException(e);

		}
	}

}
