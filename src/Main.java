import java.util.ArrayList;

public  class Main {
    public static void main(String[] args) {
        boolean bool = false;

        int[] colecaoInteriros = {111, 22, 33, 34, 54};

        if (bool) {

            System.out.println("verdadeiro");
        } else {
            System.out.println("falso");
        }


        for (int i = 0; i < 5; i++) {

            System.out.println(colecaoInteriros[i]);


        }


        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Francisco");
        nomes.add("zfsafsdfsd");
        nomes.add("ljfguj");
        nomes.add("fdghsrtyrth");
        nomes.add("fghgfhfghf");



        for (int i=0; i < nomes.size();i++){

        System.out.println("nome "+ i +":  "+ nomes.get(i));



        }

        for(String nome: nomes){

            System.out.println(nome);


        }


    }

}

