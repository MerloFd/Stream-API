package br.com.merlo.intermediarias;

import br.com.merlo.Pessoa;

import java.util.List;
import java.util.stream.Stream;

public class DistinctStream {
    public static void main(String[] args) {
        List<Pessoa> listagem = new Pessoa().populaPessoas();

        Stream<Pessoa> streamDistinct = listagem.stream().distinct();

        streamDistinct.forEach(i -> System.out.println(i));
    }
}
