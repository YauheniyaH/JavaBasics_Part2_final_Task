package by.epam.nb.dao.impl;

import java.io.IOException;
import java.util.Scanner;

import by.epam.nb.dao.NoteDAO;

public class NoteDAOImpl implements NoteDAO{

	@Override
	public String inputContent() throws IOException {
		Scanner sc;
		sc = new Scanner(System.in);
		System.out.print("input original string ");
		return sc.nextLine();
		
	}

	@Override
	public void inputDate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inputAction() {
		// TODO Auto-generated method stub
		
	}

}
