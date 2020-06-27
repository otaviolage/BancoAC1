# BancoAC1
Trabalho de Construção de Algoritmos - Facens S1/2020

# Proposta
<p>Nesta atividade você deverá construir um programa na linguagem JAVA tendo como base o fluxograma
abaixo demonstrado.
<p>Observações:
<p>  - Considere Início com uma tela de boas-vindas ao usuário.
<p>  - Considere o CPF como sendo: “123.456.789-00”.
<p>  - Considere a Senha como sendo: 01020304.
<p>  Considere o Saldo inicial como sendo: R$1.000,00.
<p>  Considere o seguinte Menu:
<p>    1 – Saldo (deverá exibir o saldo atual)
<p>    2 – Depósito (deverá requisitar o valor do depósito e somar ao saldo atual)
<p>    3 – Saque (deverá requisitar o valor do saque e subtrair o saldo atual)
<p>    0 – Sair
<p>Desafio (não obrigatório):
<p>  Fazer Transferência: deverá solicitar o valor da transferência, a conta, agência e o banco (simular
valores) e atualizar o saldo.
<p>  Consultar Extrato: deverá exibir o extrato das operações do usuário mostrando débitos, créditos e
transferências em ordem cronológica.

# Fluxograma
<h1 align="center">
    <img alt="Logo" src="https://ik.imagekit.io/otaviolage/BancoAC1_Fluxograma_XiYfRgRJh.PNG" />
    <br>
</h1>

# Exemplo de Resultado
```bash
==========================================
CAIXA ELETRÔNICO DO BANCO DO OTÁVIO
==========================================

Digite o seu CPF: <font color="blue"> 123.456 </font>

CPF INCORRETO
Digite o seu CPF novamente: 123.456.789-00
Senha: 123

SENHA INCORRETA
Digite novamente: 1020304

==========================================

Bem-vindo Cliente!
Banco: 100
Ag: 3003
Conta: 1015582

==========================================

Digite 1 para visualizar o saldo
Digite 2 para depósitos
Digite 3 para saques
Digite 4 para transferências
Digite 5 para extrato
Digite 0 para sair
Digite a operacao que deseja realizar: 2

==========================================

Digite o valor que deseja depositar: 100

==========================================
Deseja realizar uma nova operação?
Digite [sim] para realizar
Digite [não] para reiniciar
Digite a senha de desligamento para finalizar
==========================================
- sim

==========================================

Digite 1 para visualizar o saldo
Digite 2 para depósitos
Digite 3 para saques
Digite 4 para transferências
Digite 5 para extrato
Digite 0 para sair
Digite a operacao que deseja realizar: 3

==========================================

Digite o valor deseja sacar: 300

==========================================
Deseja realizar uma nova operação?
Digite [sim] para realizar
Digite [não] para reiniciar
Digite a senha de desligamento para finalizar
==========================================
- sim

==========================================

Digite 1 para visualizar o saldo
Digite 2 para depósitos
Digite 3 para saques
Digite 4 para transferências
Digite 5 para extrato
Digite 0 para sair
Digite a operacao que deseja realizar: 4

==========================================

Digite o valor deseja transferir: 250
Digite o CPF do destinatário: 123.456.790-00
Digite o número da conta: 1234
Agencia: 567890
Número do Banco: 300

==========================================

Comprovante: 
Banco: 300
Ag: 567890
Conta: 1234
Valor Transferido: R$250,00

==========================================


==========================================
Deseja realizar uma nova operação?
Digite [sim] para realizar
Digite [não] para reiniciar
Digite a senha de desligamento para finalizar
==========================================
- sim

==========================================

Digite 1 para visualizar o saldo
Digite 2 para depósitos
Digite 3 para saques
Digite 4 para transferências
Digite 5 para extrato
Digite 0 para sair
Digite a operacao que deseja realizar: 5

==========================================


==========================================

Extrato da conta 1015582:

Saldo inicial: R$ 1.000,00
1.depósito: 100.0
2.saque: -300.0
3.transferência: -250.0
Saldo atual: R$550,00

==========================================
Deseja realizar uma nova operação?
Digite [sim] para realizar
Digite [não] para reiniciar
Digite a senha de desligamento para finalizar
==========================================
- 1234
Máquina desligando...
```
