package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Vaga> vagas = new ArrayList<>();

        for (int i = 1; i <= 5; i++) {
            vagas.add(new Vaga(i));
        }

        System.out.println("=============================");
        System.out.println(" SISTEMA DE GESTÃO DE VAGAS ");
        System.out.println("=============================");

        int opcao = 0;

        while (true) {
            System.out.println("\n------------- MENU -------------");
            System.out.println("1) Listar vagas do estacionamento");
            System.out.println("2) Registrar ENTRADA de veículo");
            System.out.println("3) Registrar SAÍDA de veículo");
            System.out.println("4) Sair do sistema");
            System.out.println("--------------------------------");
            System.out.println("Escolha uma opção: ");
            opcao = scanner.nextInt();

            if (opcao == 1) {
                System.out.println("\n====== STATUS DO ESTACIONAMENTO ======");
                for (Vaga v : vagas) {
                    System.out.println(v);
                }
                System.out.println("======================================");

            } else if (opcao == 2) {
                System.out.println("\nDigite o número da vaga (1 a 5): ");
                int numeroEscolhido = scanner.nextInt();

                Vaga vagaEncontrada = null;

                for (Vaga v : vagas) {
                    if (v.getNumero() == numeroEscolhido) {
                        vagaEncontrada = v;
                        break;
                    }
                }

                if (vagaEncontrada == null) {
                    System.out.println("Vaga inválida! Digite um número entre 1 e 5");

                } else if (vagaEncontrada.isOcupada()) {
                    System.out.println("Essa vaga já está OCUPADA! Escolha outra");

                } else {
                    System.out.println("Digite a placa do veículo: ");
                    String placa = scanner.next();

                    vagaEncontrada.setPlaca(placa);
                    vagaEncontrada.setOcupada(true);

                    System.out.println("Veículo " + placa + " registrado na Vaga " + numeroEscolhido);
                }

            } else if (opcao == 3) {
                System.out.println("\nDigite o número da vaga a liberar (1 a 5): ");
                int numeroEscolhido = scanner.nextInt();

                Vaga vagaEncontrada = null;

                for (Vaga v : vagas) {
                    if (v.getNumero() == numeroEscolhido) {
                        vagaEncontrada = v;
                        break;
                    }
                }

                if (vagaEncontrada == null) {
                    System.out.println("Vaga inválida! Digite um número entre 1 e 5");

                } else if (!vagaEncontrada.isOcupada()) {
                    System.out.println("Essa vaga já está LIVRE! Nada a fazer");

                } else {
                    String placaSaindo = vagaEncontrada.getPlaca();

                    vagaEncontrada.setPlaca(null);
                    vagaEncontrada.setOcupada(false);

                    System.out.println("Veículo " + placaSaindo + " saiu da Vaga " + numeroEscolhido + ". Vaga liberada");
                }

            } else if (opcao == 4) {
                System.out.println("\nSISTEMA ENCERRADO!");
                scanner.close();
                break;

            } else {
                System.out.println("Opção inválida! Digite um número entre 1 e 4");
            }
        }
    }
}