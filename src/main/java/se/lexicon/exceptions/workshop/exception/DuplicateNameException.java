package se.lexicon.exceptions.workshop.exception;

public class DuplicateNameException extends Exception {
    private int IdPerson;
    private String NamePerson;

    public DuplicateNameException(String namePerson) {
        this.NamePerson = namePerson;
    }

    public  DuplicateNameException(String namePerson, int idPerson) {
        this.NamePerson = namePerson;
        this.IdPerson = idPerson;
    }

    public int getIdPerson() {
        return IdPerson;
    }

    public void setIdPerson(int idPerson) {
        IdPerson = idPerson;
    }

    public String getNamePerson() {
        return NamePerson;
    }

    public void setNamePerson(String namePerson) {
        NamePerson = namePerson;
    }
}
