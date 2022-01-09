public class Developer {

    public String getStackOfDeveloper(String stack) {
        return stack;
    }


    public String getNameOfDeveloper(String name) {
        return name;
    }

    public String getCountryOfDeveloper(String country) {
        return country;
    }

    public static void main(String[] args) {

        Developer kamilacode = new Developer();


        String minhaStack = kamilacode.getStackOfDeveloper("java e spring");
        String meuPais = kamilacode.getCountryOfDeveloper("brazil");
        String meuNome = kamilacode.getNameOfDeveloper("name");


        System.out.println(minhaStack);
        System.out.println(meuPais);
        System.out.println(meuNome);


    }
}
