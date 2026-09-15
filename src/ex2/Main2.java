package ex2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class Main2 {
    static void main() {

        List<Empregado> empregados = new ArrayList<>();
        empregados.add(new Empregado("John Doe",1000,15));
        empregados.add(new Empregado("Jane Doe",10000,4));
        empregados.add(new Empregado("Joe Doe",100,0));

        List<Empregado> reajustes = empregados.stream()
                .map(emp ->{
                    double valor;
                    if (emp.experiencia()>=5){ valor = emp.salario() *1.20;
                    }else{
                        valor = emp.salario() * 1.10;
                    }return new Empregado(emp.nome(),valor,emp.experiencia());})
                .sorted(Comparator.comparing(Empregado::nome))

                .toList();

        System.out.println(reajustes);
    }
}
