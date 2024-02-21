package org.local.MyAssistant.controller;

import javax.swing.*;

public class TextGenerator {
    static public String getTextoChamado(String nome_do_cliente, String localizacao, String apoio) {
        String texto =
                "O cliente entrou em contato via WhatsApp solicitando apoio. Durante o atendimento, foram coletadas as seguintes informações:\n" +
                "\nNome do Cliente: " + nome_do_cliente.toUpperCase() +
                "\nLocalização: " + localizacao.toUpperCase() +
                "\nTipo de Apoio Necessário: " + apoio.toUpperCase() +
                "\n\nO atendimento está em andamento e as necessidades do cliente estão sendo tratadas conforme as políticas e procedimentos estabelecidos." +
                "\nSerá fornecida uma atualização assim que o atendimento for concluído ou se houver necessidade de mais informações.";
        return texto;
    }

    static public String getSaudacao() {
        String saudacao =
            "Olá,\n" +
            "\nAgradecemos por entrar em contato com nosso suporte via WhatsApp.\n" +
            "\nPara que possamos auxiliá-lo da melhor forma possível, precisamos de algumas informações adicionais. Por favor, poderia nos fornecer:\n" +
            "\n1. Seu nome completo." +
            "\n2. A sala ou laboratório onde você se encontra." +
            "\n3. Qual tipo de apoio você necessita neste momento.\n" +
            "\nAssim que recebermos essas informações, nossa equipe estará pronta para lhe ajudar. Estamos aqui para tornar sua experiência mais fluida e produtiva.\n" +
            "\nAguardamos o seu retorno.\n" +
            "\nAtenciosamente, Núcleo de  Informática do Senai Cimatec.";
        return saudacao;
    }

    static public String getSenhaText(){
        String[] options = {"Login SESI","Primeiro Acesso","Troca de senha"};
        String msg;
        String resposta =
                (String) JOptionPane.showInputDialog(null,"Selecione qual texto você deseja copiar:","Seleção de Texto",JOptionPane.INFORMATION_MESSAGE,null,options,options[0]);
        switch (resposta) {
            case "Login SESI":
                msg =
                    "CREDENCIAIS DE ACESSO AO SESI:\n" +
                    "\nPara acessar os equipamentos do SESI, por favor, utilize uma das seguintes credenciais:\n" +
                    "\nUsuário: cimatec" +
                    "\nSenha: Cimatec123\n" +
                    "\nou\n" +
                    "\nUsuário: sesi" +
                    "\nSenha: Fieb@123\n" +
                    "\nEssas são as informações necessárias para acessar os equipamentos do SESI. Se precisar de mais alguma assistência, não hesite em nos contatar.\n" +
                    "\nAtenciosamente, Núcleo de  Informática do Senai Cimatec.";
                break;
            case "Primeiro Acesso":
                msg =
                    "PRIMEIRO ACESSO:\n" +
                    "\n1. Utilize seu RA ou Código do Professor como login, e a senha inicial é *Cimatec@123* em qualquer máquina do Laboratório / Sala de Aula, com exceção do Laboratório Cyber." +
                    "\n2. Após o login inicial, o sistema solicitará que você efetue a troca da senha para garantir a segurança da sua conta.\n" +
                    "\nSe precisar de mais assistência ou tiver outras perguntas, não hesite em nos contatar novamente. Estamos aqui para ajudar.\n" +
                    "\nAtenciosamente, Núcleo de  Informática do Senai Cimatec.";
                break;
            case "Troca de senha":
                msg =
                    "TROCA DE SENHA:\n" +
                    "\n1. Para realizar a troca de senha, por favor, forneça seu RA ou Código do Professor. Sua senha será resetada para *Cimatec@123*." +
                    "\n2. Ao fazer login com essa senha temporária, em qualquer máquina do Laboratório / Sala de Aula, com exceção do Laboratório Cyber, será solicitada imediatamente a troca para uma senha de sua escolha.\n" +
                    "\nSe precisar de mais assistência ou tiver outras perguntas, não hesite em nos contatar novamente. Estamos aqui para ajudar.\n" +
                    "\nAtenciosamente, Núcleo de  Informática do Senai Cimatec.";
                break;
            default:
                msg = null;
        }
        return msg;
    }

    static public String getContatos() {
        String contatoString =
                "Central de Matrículas:\n" +
                "1. (71) 3462-9501 / 9502\n" +
                "2. 98110-4473 (WhatsApp)" +
                "\n\n" +
                "Secretária Geral de Cursos:\n" +
                "1. (71) 3462-9558\n" +
                "2. Email: cimatecsecretariageraldecursos@fieb.org.br" +
                "\n\n" +
                "Financeiro:\n" +
                "1. (71) 3462-9576 / 9589\n" +
                "2. Email: financeirosenaicimatec@fieb.org.br" +
                "\n\n" +
                "Central de Atendimento ao Aluno:\n" +
                "1. (71) 3287-8337 (Apenas WhatsApp)\n" +
                "2. Email: caasenaiba@fieb.org.br" +
                "\n\n" +
                "Núcleo de Carreiras:\n" +
                "1. (71) 3462-5675 / 8423\n" +
                "2. Email: carreiras.cimatec@fieb.org.br" +
                "\n\n" +
                "Megazap:\n" +
                "1. (71) 98110-4473";
        return contatoString;
    }

    static public String getEncaminhamentoTecnico() {
        String msg =
                "Prezado(a),\n\n" +
                "Agradecemos pelas informações fornecidas. Seu atendimento será encaminhado para um técnico presencial imediatamente. Em questão de minutos, o mesmo estará chegando para prestar assistência.\n\n" +
                "Agradecemos pela sua compreensão e paciência. Estamos aqui para garantir que suas necessidades sejam atendidas da melhor maneira possível.\n\n" +
                "Atenciosamente, Núcleo de Informática do Senai Cimatec.";
        return msg;
    }
}
