package util;

public class Validarcoes {
    private Validarcoes(){

    }
    public static boolean nomeValido(String nome){
        return !(nome == null || nome.trim().isEmpty() || nome.matches(".*\\d+.*"));
    }

    public static String mensagemErroNome(String nome){
        if(nome == null ||nome.trim().isEmpty()){
            return "Erro: o nome nao pode ser vazio";
        }else if (nome.matches(".*\\d+.*")){
            return"Erro: o nome nao pode conter numeros";
        }
        return"";
    }

    public static boolean idadeValida(int idade){
        return idade >= 0 && idade <= 150;
    }
    public static String mensagemErroIdade(int idade){
        if(idade < 0){
            return "Erro: a idade nao pode ser negativa";
        }else if(idade > 150){
            return "Erro: idade invalida";
        }
        return "";
    }
    public static boolean alturaValida(double altura){
        return altura >= 0 &&  altura <= 3;
    }
    public static String mensagemErroAltura(double altura){
        if( altura < 0){
            return "Erro: a altura nao pode ser negativa";
        }else if(altura >= 3){
            return"Erro: altura invalida maximo ate 3 metros";
        }
        return"";
    }
}
