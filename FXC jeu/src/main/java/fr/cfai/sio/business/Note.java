package fr.cfai.sio.business;

public class Note
{
	/**
	 * Déclaration des variables de Note
	 */
	private short note;
	private Test test;

	/**
	 * Constructeur de Note
	 * 
	 * @param note
	 * @param test
	 */
	public Note(short note, Test test)
	{
		super();
		this.note = note;
		this.test = test;
	}

	/**
	 * Getters and Setters
	 * 
	 * @return
	 */
	public short getNote()
	{
		return note;
	}

	public void setNote(short note)
	{
		this.note = note;
	}

	public Test getTest()
	{
		return test;
	}

	public void setTest(Test test)
	{
		this.test = test;
	}

}
