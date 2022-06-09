package questao1.stringbuilder;

public class TestesStringBuilder {
    public static void main(String[] args) {

        StringBuilder nomes = new StringBuilder();
        nomes.append("Carlos>").append("Maria>").append("José>").append("Renata");

        System.out.println(nomes.toString());
        System.out.println("---------------------------------");

        StringBuilder buffer = new StringBuilder("João Silveira Batista");
        System.out.printf(" buffer = %s\n tamanho = %d\n capacidade (%d (tamanho) + " +
                        "16(valor inicial padrão)) = %d\n\n",
                buffer.toString(),buffer.length(),buffer.length(),buffer.capacity());

        //EXPANDE A CAPACIDADE P/ 75 CARACTERES
        buffer.ensureCapacity(75);
        System.out.printf(" Nova Capacidade = %d\n\n", buffer.capacity());

        //REDEFINE O TAMANHO, NÃO APARECENDO OS CARACTERES
        // SE O ARGUMENTO FOR MENOR QUE A QUANTIDADE DE CARACTERES ORIGINAL
        buffer.setLength(10);
        System.out.printf(" Novo tamanho = %d\n buffer = %s\n",buffer.length(),
                buffer.toString());
        System.out.println("---------------------------------");

        StringBuilder buffer2 = new StringBuilder("Usando outros métodos StringBuilder");

        System.out.printf("buffer = %s\n", buffer2.toString());
        System.out.printf("Caractere index 0: %s\nCaractere index 4: " +
                "%s\n\n",buffer2.charAt(0),buffer2.charAt(4));

        char[] charArray = new char[buffer2.length()];

        buffer2.getChars(0, buffer2.length(), charArray, 0);
        System.out.print("Os caracteres são: ");

        for(char c : charArray) {
            System.out.print(c);
        }

        buffer2.setCharAt(0, 'O');
        buffer2.setCharAt(4, 'P');

        System.out.printf("\n\nbuffer = %s", buffer2.toString());

        buffer2.reverse();
        System.out.printf("\n\nbuffer = %s\n", buffer2.toString());
        System.out.println("---------------------------------");

        StringBuilder buffer1 = new StringBuilder();
        StringBuilder buffer22 = new StringBuilder(5655);
        StringBuilder buffer3 = new StringBuilder("Texto Qualquer");

        System.out.printf("buffer1 = \"%s\"\n", buffer1.toString());
        System.out.printf("buffer2 = \"%s\" capacidade: %s\n", buffer22.toString(),buffer22.capacity());
        System.out.printf("buffer3 = \"%s\"\n", buffer3.toString());
        System.out.println("---------------------------------");

        Object objetoRef = "Maria";
        String String = "Joaquina";
        char[] conjArray = {'S','i','l','v','a'};

        StringBuilder buffer4 = new StringBuilder();
        buffer4.insert(0, objetoRef);
        buffer4.insert(0, " ");
        buffer4.insert(0, String);
        buffer4.insert(0, " ");
        buffer4.insert(0, conjArray);
        buffer4.insert(0, " ");

        System.out.printf("Valores:\n%s\n\n", buffer4.toString());
        System.out.println("---------------------------------");

        buffer4.delete(0, 4);
        buffer4.deleteCharAt(9);
        System.out.printf("Valores depois do delete:\n%s\n\n", buffer4.toString());

    }


}
