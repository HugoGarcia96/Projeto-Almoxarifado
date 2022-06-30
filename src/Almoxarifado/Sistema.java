package Almoxarifado;

import java.util.ArrayList;
import java.util.Scanner;

public class Sistema {

    Scanner ler = new Scanner(System.in);
    ArrayList<Usuario> contrato = new ArrayList();
    ArrayList<Item> a = new ArrayList();

    public void adicionar(Item i, Administrador ad) {
        String senhaaux = null;
        int cont = 0;
        while (ad.getSenha().equals(senhaaux) == false && cont < 3) {
            System.out.println("Digite sua senha para adicionar item: ");
            senhaaux = ler.next();
            cont++;

            if (ad.getSenha().equals(senhaaux) == false)
                System.out.println("Senha incorreta !!");
            else {
                a.add(i);
                System.out.println("Item adicionado ao Almoxarifado");
            }

        }
    }

    public void catalogo(Administrador ad) {
        for (int i = 0; i < a.size(); i++)
            System.out.println("Catalogo: " + a.get(i));
    }

    public void remover(Item i, Estagiario e) {
        String senhaaux = null;
        int cont = 0;
        boolean existe = false;
        while (e.getSenha().equals(senhaaux) == false && cont < 3) {
            System.out.println("Digite sua senha para remover item: ");
            senhaaux = ler.next();
            cont++;

            if (e.getSenha().equals(senhaaux) == false)
                System.out.println("Senha incorreta !!");
            else {
                for (int t = 0; t < a.size(); t++) {
                    if (a.get(t).equals(i)) {
                        int pos = t;

                        int novaquant = a.get(pos).getQtdeItem() - 1;
                        a.get(pos).setQtdeItem(novaquant);
                        t = a.size();
                    }
                }
                if (existe)
                    System.out.println("Item do Almoxarifado removido pelo Estagiário.");

                else
                    System.out.println("Item não existe !!");
            }

        }
    }

    public void devolver(Item i, Estagiario e) {
        String senhaaux = null;
        int cont = 0;
        boolean existe = false;
        while (e.getSenha().equals(senhaaux) == false && cont < 3) {
            System.out.println("Digite sua senha para Devolver o item: ");
            senhaaux = ler.next();
            cont++;

            if (e.getSenha().equals(senhaaux) == false)
                System.out.println("Senha incorreta !!");
            else {
                for (int t = 0; t < a.size(); t++) {
                    if (a.get(t).equals(i)) {
                        int pos = t;

                        int novaquant = a.get(pos).getQtdeItem() + 1;
                        a.get(pos).setQtdeItem(novaquant);
                        t = a.size();
                    }
                }
                if (existe)
                    System.out.println("Item do Almoxarifado devolvido pelo Estagiário.");

                else
                    System.out.println("Item não existe !!");
            }

        }
    }

    public void remover(Item i, Professor p) {
        String senhaaux = null;
        int cont = 0;
        boolean existe = false;
        while (p.getSenha().equals(senhaaux) == false && cont < 3) {
            System.out.println("Digite sua senha para remover item: ");
            senhaaux = ler.next();
            cont++;

            if (p.getSenha().equals(senhaaux) == false)
                System.out.println("Senha incorreta !!");
            else {
                for (int t = 0; t < a.size(); t++) {
                    if (a.get(t).getNome().equals(i.getNome())) {
                        int pos = t;

                        existe = true;
                        int novaquant = a.get(pos).getQtdeItem() - 1;
                        a.get(pos).setQtdeItem(novaquant);
                        t = a.size();
                    }
                }
                if (existe)
                    System.out.println("Item do Almoxarifado removido pelo Professor.");

                else
                    System.out.println("Item não existe !!");
            }

        }
    }

    public void devolver(Item i, Professor p) {
        String senhaaux = null;
        int cont = 0;
        boolean existe = false;
        while (p.getSenha().equals(senhaaux) == false && cont < 3) {
            System.out.println("Digite sua senha para Devolver o item: ");
            senhaaux = ler.next();
            cont++;

            if (p.getSenha().equals(senhaaux) == false)
                System.out.println("Senha incorreta !!");
            else {
                for (int t = 0; t < a.size(); t++) {
                    if (a.get(t).equals(i)) {
                        int pos = t;

                        int novaquant = a.get(pos).getQtdeItem() + 1;
                        a.get(pos).setQtdeItem(novaquant);
                        t = a.size();
                    }
                }
                if (existe)
                    System.out.println("Item do Almoxarifado devolvido pelo Professor.");

                else
                    System.out.println("Item não existe !!");
            }
        }
    }

    public void remover(Item i, Tecnico tec) {
        String senhaaux = null;
        int cont = 0;
        boolean existe = false;
        while (tec.getSenha().equals(senhaaux) == false && cont < 3) {
            System.out.println("Digite sua senha para remover item: ");
            senhaaux = ler.next();
            cont++;

            if (tec.getSenha().equals(senhaaux) == false)
                System.out.println("Senha incorreta !!");
            else {
                for (int t = 0; t < a.size(); t++) {
                    if (a.get(t).equals(i)) {
                        int pos = t;

                        int novaquant = a.get(pos).getQtdeItem() - 1;
                        a.get(pos).setQtdeItem(novaquant);
                        t = a.size();
                    }
                }
                if (existe)
                    System.out.println("Item do Almoxarifado removido pelo Tecnico.");

                else
                    System.out.println("Item não existe !!");
            }

        }
    }

    public void devolver(Item i, Tecnico tec) {
        String senhaaux = null;
        int cont = 0;
        boolean existe = false;
        while (tec.getSenha().equals(senhaaux) == false && cont < 3) {
            System.out.println("Digite sua senha para Devolver o item: ");
            senhaaux = ler.next();
            cont++;

            if (tec.getSenha().equals(senhaaux) == false)
                System.out.println("Senha incorreta !!");
            else {
                for (int t = 0; t < a.size(); t++) {
                    if (a.get(t).equals(i)) {
                        int pos = t;

                        int novaquant = a.get(pos).getQtdeItem() + 1;
                        a.get(pos).setQtdeItem(novaquant);
                        t = a.size();
                    }
                }
                if (existe)
                    System.out.println("Item do Almoxarifado devolvido pelo Tecnico.");

                else
                    System.out.println("Item não existe !!");
            }

        }
    }

    public void lista(Administrador ad) {

        String senhaaux = null;
        int cont = 0;
        while (ad.getSenha().equals(senhaaux) == false && cont < 3) {
            System.out.println("Digite sua senha para LISTAR USUÁRIOS: ");
            senhaaux = ler.next();
            cont++;

            if (!ad.getSenha().equals(senhaaux))
                System.out.println("Senha incorreta !!");
            else {
                System.out.println("Lista dos Usuários: ");
                for (int i = 0; i < contrato.size(); i++) {
                    System.out.println(contrato.get(i));
                }

            }

        }

    }

    public void adicionaUsuario(Usuario u, Administrador ad) {
        String senhaaux = null;
        int cont = 0;
        while (ad.getSenha().equals(senhaaux) == false && cont < 3) {
            System.out.println("Digite sua senha para ADICIONAR USUÁRIO: ");
            senhaaux = ler.next();
            cont++;

            if (ad.getSenha().equals(senhaaux) == false) {
                System.out.println("Senha incorreta !!");
            } else {
                contrato.add(u);
                System.out.println("Usuário ADICIONADO.");
            }
        }

    }

    public void removerUsuario(Usuario u, Administrador ad) {
        String senhaaux = null;
        int cont = 0;
        while (ad.getSenha().equals(senhaaux) == false && cont < 3) {
            System.out.println("Digite sua senha para REMOVER USUÁRIO: ");
            senhaaux = ler.next();
            cont++;

            if (ad.getSenha().equals(senhaaux) == false)
                System.out.println("Senha incorreta !!");
            else
                contrato.remove(u);
            System.out.println("Usuário REMOVIDO.");
        }

    }

}
