public class Bird {
    //Caracteristicas principales de los pajaros
    private String nom, tam, color, velo, Skill;
    private int impulso;


    public Bird(){
        this.nom = "";
        this.tam = "";
        this.color = "";
        this.velo = "";
        this.impulso = 0;
        this.Skill = "";
    }

    public Bird(String nombre, String tam, String color, String velocidad, int impulso){
        this.nom = nombre;
        this.tam = tam;
        this.color = color;
        this.velo = velocidad;
        this.impulso = impulso;
    }


    //getters y setters de cada atributo de los pajaros

    public String getNom(){
        return this.nom;
    }
    public void setNom(String nom){
        this.nom = nom;
    }

    public String getTam(){
        return this.tam;
    }
    public void setTam(String tam){
        this.tam = tam;
    }

    public String getColor(){
        return this.color;
    }
    public void setColor(String color){
        this.color = color;
    }

    public String getVelo(){
        return this.velo;
    }
    public void setVelo(String velo){
        this.velo = velo;
    }

    public int getImpulso(){
        return this.impulso;
    }
    public void setImpulso(int impulso){
        this.impulso = impulso;
    }

    public String getSkill(){
        return this.Skill;
    }
    public void setSkill(String Skill){
        this.Skill = Skill;
    }
//return para que al correrlo nos devuelva lo que hace cada pajaro
    public static String Ataque(Bird[] birds, int indice){
        return "El pajaro " + birds[indice].getNom() + " ataco y " + birds[indice].getSkill() +"\n";
    }
}
