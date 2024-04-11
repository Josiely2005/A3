package Model;

public class Emprestimo {
    private int id;
    private int amigoId;
    private int ferramentaId;
    private String dataOut;
    private String dataIn;

    public Emprestimo() {
        this(0, 0, 0, "","");
    }

    public Emprestimo(int id, int amigoId, int ferramentaId, String dataOut, String dataIn) {
        this.id = id;
        this.amigoId = amigoId;
        this.ferramentaId = ferramentaId;
        this.dataOut = dataOut;
        this.dataIn = dataIn;
  ; }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAmigoId() {
        return amigoId;
    }
    public void setAmigoId(int amigoId) {
        this.amigoId = amigoId;
    }
    public int getFerrentaId() {
        return ferramentaId;
    }
    public void setFerrentaId(int ferramentaId) {
        this.ferramentaId = ferramentaId;
    }
    public String getDataOut() {
        return dataOut;
    }
    public void setDataOut(String dataOut) {
        this.dataOut = dataOut;
    }
    public String getDataIn() {
        return dataIn;
    }
    public void setDataIn(String dataIn) {
        this.dataIn = dataIn;
    }

}
