import java.lang.*;

public class Voto {

    private int id;
    private String rut;
    private Boolean respuestaVoto;



    //========GETTER==============
    public int getId() {
        return id;
    }
    
    public String getRut() {
        return rut;
    }

    public Boolean getRespuestaVoto() {
        return respuestaVoto;
    }

    //==========SETTER===============
    public void setRut(String rut) {
        this.rut = rut;
    }
    public void setId(int id) {
        this.id = id;
    }

    public void setRespuestaVoto(Boolean respuestaVoto) {
        this.respuestaVoto = respuestaVoto;
    }
}

