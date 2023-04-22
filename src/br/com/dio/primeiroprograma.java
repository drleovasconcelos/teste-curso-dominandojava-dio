package br.com.dio;

import br.com.dio.model.Gato;

public class primeiroprograma {

    public static void main(String[] args) {
        Gato gato = new Gato(); //criou a classe gato

        Livro Livro1 = new Livro (x);
        System.out.println(Livro1);



        /*int a = 5;
        int b = 3;
        System.out.println("Hello world!" + (a + b));*/ //sout
    }
}

class Livro {
    private String name;
    private String numPaginas;

    public String getName() {
        return name;
    }

    public String getnumPaginas() {
        return numPaginas;
    }


    public void setnumPaginas(String numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "name='" + name + '\'' +
                ", numPaginas='" + numPaginas + '\'' +
                '}';
    }
}