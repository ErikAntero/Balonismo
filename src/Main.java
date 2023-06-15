public class Main {
    public static void main(String[] args) {

        //criar objetos do passeio
        Pessoa p1 = new Pessoa();
        Pessoa p2; //declaração do objeto
        p2 = new Pessoa(); //construção
        //...
        p1.nome = "Elliot Page";
        p1.cpf =  "111.111.111-11";
        p1.termoCienciaRisco = true;
        p1.rg = "99999999/99";
        p1.telefone = "55 11 91234-5678";
        p1.telContEmerg ="55 21 98736-8234";
        p1.endereco = "R. Eng.Oscar kesselring 348 Barueri Sp";

        //piloto
        Piloto p3 = new Piloto();
        Piloto p4;
        p4 = new Piloto();
        //nome piloto

        p3.nomePil = "Renato Augusto";
        p3.CpfPil = "123.456.789.00";
        p3.NumRegAnac ="8774-2341/33";



    }
}