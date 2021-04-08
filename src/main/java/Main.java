import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Desafio desafio = new Desafio();

        System.out.println("======================Verificando Resultado Marvin======================");
        long resultadoAngryBirds = desafio.obterResultadoAngryBirds(Arrays.asList("*--", "**-", "---"));
        System.out.println("Pontuação final Marvin: " + resultadoAngryBirds);

        System.out.println("======================Verificando Múltiplos Fizzing======================");
        desafio.obterMultiplosFizzing();

        System.out.println("======================Verificando Resultado da Equipe Campeã======================");
        String mensagemEquipe = desafio.obterEquipeCampea(Arrays.asList(1,1,3), Arrays.asList(2,2,0));
        System.out.println(mensagemEquipe);

        System.out.println("======================Verificando Horas Assustadoras======================");
        List<String> padroes = new ArrayList<>();
        padroes.add("\\b(\\d)(\\d)\\b:\\b\\1\\2\\b");
        padroes.add("\\b(\\d)\\1\\b:\\b(\\d)\\2\\b");
        padroes.add("\\b(\\d)(\\d)\\b:\\b\\2\\1\\b");
        padroes.add("\\b(\\d)\\1\\b:\\b\\1\\1\\b");

        List<String> horas = new ArrayList<>();
        horas.add("11:00");
        horas.add("13:00");
        horas.add("12:12");
        long totalHorasAssustadoras = desafio.obterHorasAssustadoras(padroes, horas);

        System.out.println("Total de horas assustadoras: " + totalHorasAssustadoras);

    }
}
