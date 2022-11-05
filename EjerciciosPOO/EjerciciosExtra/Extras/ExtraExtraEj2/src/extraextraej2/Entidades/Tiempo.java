package extraextraej2.Entidades;

public class Tiempo {
    private int hora, min, seg;
    //Constructores
    public Tiempo() {
    }
    public Tiempo(int hora, int min, int seg) {
        this.hora = hora;
        this.min = min;
        this.seg = seg;
    }
    //Setters y Getters
    public int getHora() {
        return hora;
    }
    public void setHora(int hora) {
        this.hora = hora;
    }
    public int getMin() {
        return min;
    }
    public void setMin(int min) {
        this.min = min;
    }
    public int getSeg() {
        return seg;
    }
    public void setSeg(int seg) {
        this.seg = seg;
    }
    public void imprimirHoraCompleta(){
        String hora = "0", min = "0", seg = "0";
        if(this.hora<=9){
            hora = hora.concat(Integer.toString(this.hora));
        }else hora = Integer.toString(this.hora);
        if(this.min<=9){
            min = min.concat(Integer.toString(this.min));
        }else min = Integer.toString(this.min);
        if(this.seg<=9){
            seg = seg.concat(Integer.toString(this.seg));
        }else seg = Integer.toString(this.seg);
        System.out.println(hora+":"+min+":"+seg);
    }
    @Override
    public String toString() {
        return hora + ":" + min + ":" + seg;
    }
}