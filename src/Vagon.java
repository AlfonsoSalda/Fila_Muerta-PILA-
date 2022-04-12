public class Vagon {
    private String name;
    private int capacidad;
    private int numeroVagon;

    public Vagon() {    }
    
    //setter anf getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public int getNumeroVagon() {
        return numeroVagon;
    }

    public void setNumeroVagon(int numeroVagon) {
        this.numeroVagon = numeroVagon;
    }
    
    //metodos
    public void vagon (int numeroVagon, int capacidad, String name){
        int capacite = 0,num=0;
        String names;
        capacite=capacidad;
        setCapacidad(capacite);
        names=name;
        setName(names);
        num=numeroVagon;
        setNumeroVagon(num);
    }
    
    @Override
    public String toString(){
        
        return "\n\tVagon: "+name+"\n\tCapacidade: "+capacidad+"\n\tNumero de Vagon: "+numeroVagon;
    }
}

