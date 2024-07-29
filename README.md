# 🏅 Projeto Olympic Rings

Bem-vindo ao **Projeto Olympic Rings**! Esta aplicação Java utiliza Swing para desenhar os icônicos anéis olímpicos em uma interface gráfica.

## 📋 Visão Geral do Projeto

Este projeto demonstra como usar Java Swing para criar aplicações gráficas simples. O objetivo principal é desenhar os cinco anéis olímpicos com cores e posições especificadas.

## 🛠️ Tecnologias Utilizadas

- Java
- Swing para a interface gráfica

## 📦 Instalação

1. Clone o repositório:
   ```bash
   git clone https://github.com/eduardohen1/OlympicsRings.git
   ```
2. Abra o projeto na sua IDE Java favorita.
3. Compile e execute o arquivo OlympicRings.java.

## 🚀 Uso
Execute a classe OlympicRings para ver os anéis olímpicos exibidos em uma janela. Os anéis são desenhados com as seguintes especificações:
- Cores: Azul, Preto, Vermelho, Amarelo, Verde
- Posições: Arranjadas em um padrão de grade

## 📄 Explicação do Código
Aqui está uma breve explicação das partes principais do código:

- `paintComponent(Graphics g)`: Este método é sobrescrito para realizar a pintura personalizada.
- `drawOlympicRings(Graphics g)`: Este método contém a lógica para desenhar os anéis usando `Graphics2DP`.

```java
protected void paintComponent(Graphics g) {
    super.paintComponent(g);
    drawOlympicRings(g);
}

private void drawOlympicRings(Graphics g) {
    Graphics2D g2d = (Graphics2D) g;
    g2d.setStroke(new BasicStroke(7));
    Color[] ringColors = {
		Color.BLUE, 
		Color.BLACK, 
		Color.RED, 
		Color.YELLOW, 
		Color.GREEN
	};
    int[][] ringPositions = {
		{ 50,  50}, 
		{150,  50}, 
		{250,  50}, 
		{100, 100}, 
		{200, 100}
	};
    for (int i = 0; i < ringColors.length; i++) {
        g2d.setColor(ringColors[i]);
        g2d.drawOval(ringPositions[i][0], ringPositions[i][1], 100, 100);
    }
}
```
## 🤝 Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para enviar um pull request ou abrir uma issue.

Obrigado por conferir nosso projeto! Esperamos que você o ache educativo e inspirador. 🏆