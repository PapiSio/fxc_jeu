package fr.cfai.sio.business;

/**
 * Commentaire OK
 * 
 * @author mathieu
 *
 */
public class Note
{
	/**
	 * Déclaration des variables de Note
	 */
	private int idNote;
	private short note;
	private Test test;

	/**
	 * Constructeur de Note
	 * 
	 * @param idNote
	 *            ID de la note
	 * @param note
	 *            note de la note
	 * @param test
	 *            Test de la note
	 */
	public Note(int idNote, short note, Test test)
	{
		super();
		this.idNote = idNote;
		this.note = note;
		this.test = test;
	}

	/**
	 * Getteur ID de la note
	 * 
	 * @return ID de la note
	 */
	public int getIdNote()
	{
		return idNote;
	}

	/**
	 * Setteur ID de la note
	 * 
	 * @param idNote
	 *            ID de la note
	 */
	public void setIdNote(int idNote)
	{
		this.idNote = idNote;
	}

	/**
	 * Getteur Note de la note
	 * 
	 * @return Note de la note
	 */
	public short getNote()
	{
		return note;
	}

	/**
	 * Setteur Note de la note
	 * 
	 * @param note
	 *            Note de la note
	 */
	public void setNote(short note)
	{
		this.note = note;
	}

	/**
	 * Getteur Test de la note
	 * 
	 * @return Test de la note
	 */
	public Test getTest()
	{
		return test;
	}

	/**
	 * Setteur Test de la note
	 * 
	 * @param test
	 *            Test de la note
	 */
	public void setTest(Test test)
	{
		this.test = test;
	}
}
