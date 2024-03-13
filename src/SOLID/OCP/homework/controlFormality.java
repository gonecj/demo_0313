package SOLID.OCP.homework;

public class controlFormality {
    private String _formality;

    private formality _targetFormality;

    public void setFormality(String formality) {
        _formality = formality;
        setFormal();
    }
    private void setFormal() {
        switch (_formality) {
            case "formal" -> _targetFormality = new formalFormality();
            case "casual" -> _targetFormality = new casualFormality();
            case "intimate" -> _targetFormality = new intimateFormality();
            default -> _targetFormality = new basicFormality();
        }
    }

    public void say() {
        _targetFormality.getMessage();
    }
}
