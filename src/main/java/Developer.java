public class Developer {

    String name;
    String stack;
    String country;


    public Developer(String name, String stack, String country) {
        this.name = name;
        this.stack = stack;
        this.country = country;
    }


    @Override
    public String toString() {
        return "ola meu nome é \n " + name + "\n trabalho com a stack " + stack
                + "\n e sou do " + country;
    }
    
    public static  void main (String [] args) {
        Developer KamilaCode = new Developer("kamila code", "java", "brasil");


        Developer newDev = new Developer("seu nome", "sua stack", "seu pais");

        System.out.println(KamilaCode);
        System.out.println(newDev);

    }
}
