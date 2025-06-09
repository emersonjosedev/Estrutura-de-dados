package org.example;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Regcli> listaClientes = new ArrayList<>();
        Stack<Regcli> pilhaClientes = new Stack<>();
        Queue<Regcli> filaClientes = new LinkedList<>();

        try (BufferedReader br = new BufferedReader(new FileReader("C:\\UNINASSAU\\2_periodo\\ESTRUTURA DE DADOS\\projetos\\untitled\\src\\main\\java\\org\\example\\Clientes.txt"));
        ) {
            String linha;

            // Leitura de cada linha do arquivo
            while ((linha = br.readLine()) != null) {
                String[] partes = linha.split(";", 3);
                if (partes.length == 3) {
                    String codigo = partes[0].trim();
                    String nome = partes[1].trim();
                    String pais = partes[2].trim();

                    Regcli cliente = new Regcli(codigo, nome, pais);
                    listaClientes.add(cliente);
                }
            }

            // Pondo os 10 primeiros nas pilhas
            for (int i = 0; i < 10 && i < listaClientes.size(); i++) {
                pilhaClientes.push(listaClientes.get(i));
            }

            // Agora  os 10 últimos na fila
            for (int i = listaClientes.size() - 10; i < listaClientes.size(); i++) {
                filaClientes.add(listaClientes.get(i));
            }

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
            return;
        }

         //OPERACoES NAS ESTRUTURAS

        System.out.println("=== ARRAYLIST DE CLIENTES ===");
        for (Regcli cliente : listaClientes) {
            System.out.println("País: " + cliente.getPais() + " | Nome: " + cliente.getNome());
        }

        System.out.println("\n=== PILHA (desempilhando clientes) ===");
        while (!pilhaClientes.isEmpty()) {
            Regcli cliente = pilhaClientes.pop();
            System.out.println("Desempilhado -> Código: " + cliente.getCodigo() + ", Nome: " + cliente.getNome());
        }

        System.out.println("\n=== FILA (atendendo clientes FIFO) ===");
        while (!filaClientes.isEmpty()) {
            Regcli cliente = filaClientes.poll();
            System.out.println("Atendido -> Código: " + cliente.getCodigo() + ", Nome: " + cliente.getNome());
        }
    }
}