package by.epam.nb.dao;

import java.io.IOException;

public interface NoteDAO {
	String inputContent () throws IOException;
	void inputDate ();
	void inputAction ();

}
