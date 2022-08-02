package by.epam.nb.beans;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Assert;
import org.junit.Test;

public class NoteBookTest {
	
@Test

public void addNoteTest1 () {
	NoteBook nb = new NoteBook();
	Note note = new Note ("note1");
	nb.add(note);
	int expectedResult=1;
	
	Assert.assertEquals(expectedResult, nb.size());;
}

@Test

public void addNoteTest2 () {
	NoteBook nb = new NoteBook();
	Note note = new Note ("note1");
	nb.add(note);
	String expectedResult="note1";
	
	Assert.assertEquals(expectedResult, nb.getNote(0).getNote());;
}

	

}
