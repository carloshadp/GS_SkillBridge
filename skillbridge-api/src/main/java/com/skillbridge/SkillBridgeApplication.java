package com.skillbridge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SkillBridgeApplication {

    public static void main(String[] args) {
        SpringApplication.run(SkillBridgeApplication.class, args);

        printBanner();
    }

    private static void printBanner() {
        System.out.println("\n========================================");
        System.out.println("✅ SkillBridge API iniciada com sucesso!");
        System.out.println("========================================");
        System.out.println();
        System.out.println("URLs de Acesso:");
        System.out.println("Usuarios: http://localhost:3000/usuarios");
        System.out.println("Trilhas: http://localhost:3000/trilhas");
        System.out.println("H2 Console: http://localhost:3000/h2-console");
        System.out.println();
        System.out.println("Configuração do Banco:");
        System.out.println("JDBC URL: jdbc:h2:mem:skillbridgedb");
        System.out.println("Usuário: sa");
        System.out.println("Senha: (vazio)");
        System.out.println();
        System.out.println("Dados Iniciais:");
        System.out.println("5 Usuários");
        System.out.println("5 Trilhas de Aprendizagem");
        System.out.println("8 Competências");
        System.out.println("10 Matrículas");
        System.out.println("========================================\n");
    }
}
