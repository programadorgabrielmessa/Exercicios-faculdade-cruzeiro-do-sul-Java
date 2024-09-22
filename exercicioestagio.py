def calcula_comissao(V, Q):
    # Inicializando as variáveis
    C = 0.0
    M = V / Q  # Calcula o valor médio das vendas

    # Condições para cálculo da comissão
    if V < 5000:
        C = 100.00

    elif 5000 <= V <= 10000:
        C = V * 0.05
        if M > 800:
            C += V * 0.01

    elif 10000 < V <= 20000:
        C = V * 0.07 + 500.00
        if M > 1000:
            C += C * 0.10  # 10% sobre o total da comissão

    elif V > 20000:
        C = V * 0.10 + 1000.00
        if M > 1500:
            C += Q * 100.00  # Bônus adicional de 100 por venda

    return C

# Exemplo de uso
valor_vendas = 15000  # Exemplo de valor total das vendas
quantidade_vendas = 12  # Exemplo de quantidade de vendas

comissao = calcula_comissao(valor_vendas, quantidade_vendas)
print(f'A comissão calculada é: R$ {comissao:.2f}')
