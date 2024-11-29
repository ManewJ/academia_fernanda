package models;

import enums.FrequenciaSemanal;
import enums.NivelTreino;
import enums.Plano;

public class Professor extends Pessoa {
    private String especialidade;

    public Professor(String nome, int idade, String cpf, String genero, String endereco, String especialidade) {
        super(nome, idade, cpf, genero, endereco);
        this.especialidade = especialidade;
    }

    @Override
    public String toString() {
        return super.toString() + 
               ", Especialidade: " + especialidade;
    }

    public static class Aluno extends Pessoa {
        private Plano plano;
        private boolean pagamentoEmDia;
        private NivelTreino nivelTreino;
        private FrequenciaSemanal frequencia;

        public Aluno(String nome, int idade, String cpf, String genero, String endereco, Plano plano, NivelTreino nivelTreino, FrequenciaSemanal frequencia) {
            super(nome, idade, cpf, genero, endereco);
            this.plano = plano;
            this.nivelTreino = nivelTreino;
            this.frequencia = frequencia;
            this.pagamentoEmDia = false;
        }

        public NivelTreino getNivelTreino() {
            return nivelTreino;
        }

        public FrequenciaSemanal getFrequencia() {
            return frequencia;
        }

        public void registrarPagamento() {
            this.pagamentoEmDia = true;
        }

        @Override
        public String toString() {
            return super.toString() +
                   ", enums.Plano: " + plano +
                   ", Nível: " + nivelTreino +
                   ", Frequência: " + frequencia.getDias() + " dias/semana, " +
                   "Pagamento em dia: " + (pagamentoEmDia ? "Sim" : "Não");
        }
    }
}
