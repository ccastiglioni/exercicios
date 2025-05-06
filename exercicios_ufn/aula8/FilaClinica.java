/*
 *  
// Enunciado – Simulação de Atendimento em Clínica Médica //
Implemente um programa em Java que simule o atendimento de pacientes em uma clínica médica. 
Os pacientes são divididos em dois tipos de fila:
Fila de emergência (prioridade alta)
Fila de agendamento comum (prioridade baixa)

Cada paciente deve ser representado por um objeto da classe Paciente, contendo:
int id (gerado automaticamente)
String nome
String tipo (pode ser "emergencia" ou "comum")

🎯 Regras do programa:
1 - O programa deve simular 20 ciclos de atendimento.

2- Em cada ciclo:
Um novo paciente é gerado aleatoriamente (emergência ou comum)
Ele é adicionado à fila respectiva se ainda não estiver nela (usar contains com equals)
A cada 2 ciclos, um paciente da fila de emergência deve ser atendido (se houver)
A cada 3 ciclos, um paciente da fila comum deve ser atendido (se houver)

3 - Ao final, exiba:

Quantos pacientes foram atendidos de cada tipo
Quantos ainda aguardam em cada fila
*/
package exercicios_ufn.aula8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class FilaClinica {

    public static void main(String[] args) {
        Queue<Paciente> agendamentoComum = new LinkedList<>();
        Queue<Paciente> agendamentoEmergencia = new LinkedList<>();

        Random random = new Random();
        String[] nomes = {
                "Ana", "Bruno", "Carla", "Daniel", "Eduarda",
                "Fernando", "Gabriela", "Henrique", "Isabela", "João",
                "Karen", "Lucas", "Mariana", "Nicolas", "Olívia",
                "Paulo", "Quésia", "Ricardo", "Sofia", "Thiago"
        };

        for (int i = 0; i < 20; i++) {
            String nomeAleatorio = nomes[random.nextInt(nomes.length)];
            int id = random.nextInt(5);
            System.out.println("id: " + id);
            Paciente Objpc = new Paciente(id, nomeAleatorio, "Urgente");

            if (!agendamentoEmergencia.contains(Objpc)) {
                agendamentoEmergencia.add(Objpc);
            }
        }

        for (Paciente paciente : agendamentoEmergencia) {
            System.out.println(paciente.getId() + " " + paciente.getNome());
        }

    }
}
