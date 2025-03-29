class Aluno:

    def __init__(self, matricula, nome):
        self.nome = nome
        self.matricula = matricula
        self.email = self.gerar_email()

    def gerar_email(self):
        vetor_nomes = self.nome.lower().split(" ")
        return f"{vetor_nomes[0]}.{vetor_nomes[-1]}@ufn.edu.br"

    def __eq__(self, aluno):
        if not isinstance(aluno, Aluno):
            return False
        return self.email == aluno.email
 
    def __str__(self):
        return f"Matricula: {self.matricula}, Nome: {self.nome}, Email: {self.email}"


def main():
    alunos = []
    matricula = 1

    while True:
        nome = input("Digite o nome do aluno: ").upper()
        tmp = Aluno(matricula, nome)

        if tmp in alunos:
            print("Aluno com este email já cadastrado!")
        else:
            alunos.append(tmp) # No lugar do add
            print(f"Aluno cadastrado com sucesso! Matricula: {matricula} Email: {tmp.email}")
            matricula += 1

        opcao = input("CONTINUA ? (s/n): ")

        if opcao.lower() != "s":
            break

    alunos.sort(key=lambda aluno: aluno.nome)

    print("Relação de alunos:")
    for aluno in alunos: #for obj
        print(aluno)


if __name__ == "__main__":
    main()
