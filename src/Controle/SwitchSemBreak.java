package Controle;

import java.util.Locale;

public class SwitchSemBreak {
    public static void main(String[] args) {

        String faixa = "preta";

        switch (faixa.toLowerCase())
        {
            case "preta":
                System.out.println("Sei o Bassai-Dai...");
            case "marrom":
                System.out.println("Sei o Tekki Shodan");
            case "roxa":
                System.out.println("Sei Heian Godan");
            case "verde":
                System.out.println("Sei Heian Yodan");
            case "laranja":
                System.out.println("Sei heian Sandan");
            case "vermelha":
                System.out.println("Sei Heian Nidan");
            case "amarela":
                System.out.println("Sei Heian Shodan");
                break;
            case "branca":
                System.out.println("Sabe de nada Daniel San");
        }

    }
}
