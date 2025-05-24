public class TestaAluno {
    public static void main(String[]args){
        Aluno aluno1 = new Aluno ("Nicolas");
        aluno1.setNota1(7.0);
        aluno1.setNota2(7.0);
        aluno1.setNota3(7.0);
       
        System.out.println(aluno1.toString());
        System.out.println("Média: " + aluno1.calcularMedia());
        System.out.println("Aprovado: " + aluno1.isAprovado());
    }
}
