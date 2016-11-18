package fr.cfai.sio.business;

public class Note
{
	/**
	 * Déclaration des variables de Note
	 */
	private byte note;
	private Test test;

	/**
	 * Constructeur de Note
	 * 
	 * @param note
	 * @param test
	 */
	public Note(byte note, Test test)
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
	public byte getNote()
	{
		return note;
	}

	public void setNote(byte note)
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
