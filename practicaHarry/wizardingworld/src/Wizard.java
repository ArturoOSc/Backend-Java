public class Wizard {
    private int id;
    private String house;
    private String gender;
    private String name;
    private String boggart;
    private String patronus;
    public Wizard(int id, String house, String gender, String name, String boggart, String patronus){
        this.id = id;
        this.house = house;
        this.gender = gender;
        this.name = name;
        this.boggart = boggart;
        this.patronus = patronus;
    }

    public int getId(){ return id; }
    public String getHouse(){ return house; }
    public String getGender(){ return gender; }
    public String getName(){ return name; }
    public String getBoggart(){ return boggart; }
    public String getPatronus(){ return patronus; }

    public boolean setId(){
        if(id > 0){
            this.id = id;
            return true;
        }else
            return false;
    }

    public boolean setHouse(){
        if(!house.isEmpty()){
            this.house = house;
            return true;
        }else
            return false;
    }

    public boolean setGender(){
        if(!gender.isEmpty()){
            this.gender = gender;
            return true;
        }else
            return false;
    }

    public boolean setName(){
        if(!name.isEmpty()){
            this.name = name;
            return true;
        }else
            return false;
    }

    public boolean setBoggart(){
        if(!boggart.isEmpty()){
            this.boggart = boggart;
            return true;
        }else
            return false;
    }

    public boolean setPatronus(){
        if(!patronus.isEmpty()) {
            this.patronus = patronus;
            return true;
        }else
            return false;
    }

    public String showMessage(){
        return
                "id: " +id+
                        "House: "+house+
                        "Gender: "+gender+
                        "Name: "+name+
                        "Boggart: "+boggart+
                        "\n Patronus: "+patronus+ "\n";
    }
}


