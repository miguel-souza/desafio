import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

public class Desafio {

    public long obterResultadoAngryBirds(List<String> placar){
        return placar.stream().mapToLong(p -> p.chars().filter(c -> c == '*').count()).sum();
    }

    public String obterEquipeCampea(List<Integer> vitorias, List<Integer> empates){
        Integer resultado;
        Integer equipe;
        Integer maiorResultado = 0;
        String mensagemEquipe = "Não houve uma equipe campeã";
        for(int i = 0; i < vitorias.size(); i++){
            resultado = vitorias.get(i) * 3;
            resultado += empates.get(i) * 1;

            if(resultado > maiorResultado){
                maiorResultado = resultado;
                equipe = i;
                mensagemEquipe = "Equipe campeã: "+equipe+"\nResultado: "+maiorResultado;
            }
        }
        return mensagemEquipe;
    }

    public void obterMultiplosFizzing(){
        String mensagem = "";
        for(int i=1; i <= 100; i++){
            mensagem = String.valueOf(i);
            if(i % 3 == 0){
                mensagem = "Fizz";
            }
            if(i % 5 == 0){
                mensagem = "Buzz";
            }
            if(i % 3 == 0 && i % 5 == 0){
                mensagem = "FizzBuzz";
            }

            System.out.println("Resultado: " + i + " - " + mensagem);
        }
    }

    public  long obterHorasAssustadoras(List<String> padroes, List<String> horas){
        long totalHorasAssustadoras = horas.stream().mapToLong(hora -> {
            boolean horaAssustadora = padroes.stream().anyMatch(p -> Pattern.matches(p, hora));
            return (horaAssustadora ? 1L : 0L);
        }).sum();

        return totalHorasAssustadoras;
    }
}
