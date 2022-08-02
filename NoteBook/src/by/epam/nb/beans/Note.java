package by.epam.nb.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

public class Note implements Serializable{
	private static final long serialVersionUID = -1687440560284627231L;
	private String note;
	private Date date;

	public  Note() {
		this.note = null;
		this.date = null;
	}
	
	public Note(String note) {//public Note(Note this, String note)
		this.note = note;
		this.date = new Date(System.currentTimeMillis());;		
	}
	
	public Note(String note, Date date) {
		this.note = note;
		this.date = date;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@Override
	public int hashCode() {
		return Objects.hash(date, note);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Note other = (Note) obj;
		return Objects.equals(date, other.date) && Objects.equals(note, other.note);
	}

	@Override
	public String toString() {
		return "Note [note=" + note + ", date=" + date + "]";
	}
	

}
