import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Grafica {
    public static void main(String[] args) {

        JFrame janela = new JFrame();

        //fazendo a tela ficar no meio e criando a tela
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(500, 400);
        janela.setTitle("Banco de Dados");

        
        janela.setLocationRelativeTo(null);

        //criando os botões
        JButton b1= new JButton("Inserir");
        JButton b2= new JButton("Atualizar");
        JButton b3= new JButton("Deletar");
        JButton b4= new JButton("Consultar");

        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela.setVisible(false);
                
                Object selectedValue= EscolheEntidade();

            Inserir(selectedValue, janela);

        
            }
        });

        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                janela.setVisible(false);

                Object selectedValue= EscolheEntidade();

                Atualizar(selectedValue, janela);
            }
        });

        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object selectedValue = EscolheEntidade();

                Deletar(selectedValue, janela);
            }
        });

        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object selectedValue = EscolheEntidade();

                Consultar(selectedValue, janela);
            }
        });
        //customizando e adicionando os botões
        JPanel painel = new JPanel();
        painel.setLayout(new BoxLayout(painel, BoxLayout.Y_AXIS));

        b1.setAlignmentX(Component.CENTER_ALIGNMENT);
        b1.setBackground(new Color(127, 172, 250));
        b1.setMaximumSize(new Dimension(100, 100));
        b2.setAlignmentX(Component.CENTER_ALIGNMENT);
        b2.setBackground(new Color(150, 250, 159));
        b2.setMaximumSize(new Dimension(100, 100));
        b3.setAlignmentX(Component.CENTER_ALIGNMENT);
        b3.setBackground(new Color(250, 108, 106));
        b3.setMaximumSize(new Dimension(100, 100));
        b4.setAlignmentX(Component.CENTER_ALIGNMENT);
        b4.setBackground(new Color(212, 160, 249));
        b4.setMaximumSize(new Dimension(100, 100));

        painel.add(Box.createVerticalGlue());
        painel.add(b1);
        painel.add(Box.createVerticalGlue());
        painel.add(b2);
        painel.add(Box.createVerticalGlue());
        painel.add(b3);
        painel.add(Box.createVerticalGlue());
        painel.add(b4);
        painel.add(Box.createVerticalGlue());
        janela.add(painel);
        janela.setVisible(true);
    }


    private static JFrame NovaJanela(String titulo){

        JFrame NovaJanela = new JFrame(titulo);
        NovaJanela.setSize(500, 400);
        NovaJanela.setTitle(titulo);

        NovaJanela.setLocationRelativeTo(null);
        NovaJanela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        return NovaJanela;
    }


    private static void Inserir(Object selectedValue, JFrame janela){
        if(selectedValue == "Consulta"){

            InserirConsulta(janela);

            }
        if(selectedValue == "Exame"){

            InserirExame(janela);

        }
        if(selectedValue == "Prontuario"){

            InserirProntuario(janela);

        }

        if(selectedValue == "Obs_Prontuario"){

            InserirObsProntuario(janela);

        }
        if(selectedValue == "Internacao"){

            InserirInternacao(janela);
            
        }

        if(selectedValue == "Pet"){

            InserirPet(janela);
            
        }

        if(selectedValue == "Tutor"){

            InserirTutor(janela);
            
        }

        if(selectedValue == "Funcionario"){

            InserirFuncionario(janela);
            
        }

        if(selectedValue == "Veterinario" || selectedValue == "Recepcionista" || selectedValue == "Gerente" 
        || selectedValue == "Aux_Veterinario" || selectedValue == "Aux_Limpeza"){

            InserirOResto(janela, selectedValue);
            
        }
    }


    private static void Atualizar(Object selectedValue, JFrame janela){
        if(selectedValue == "Exame"){
            int Chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o atributo chave : "));

            //pegar a entidade com a chave
             AtualizarExame(janela);

        }
        if(selectedValue == "Consulta"){

            int Chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o atributo chave : "));
            AtualizarConsulta(janela);

            }
        if(selectedValue == "Prontuario"){

            int Chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o atributo chave : "));
            AtualizarProntuario(janela);
        }

        if(selectedValue == "Obs_Prontuario"){

            int Chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o atributo chave : "));
            AtualizarObsProntuario(janela);

        }
        if(selectedValue == "Internacao"){

            int Chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o atributo chave : "));
            AtualizarInternacao(janela);
            
        }

        if(selectedValue == "Pet"){

            int Chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o atributo chave : "));
            AtualizarPet(janela);
        }

        if(selectedValue == "Tutor"){

            String CPF = JOptionPane.showInputDialog("Digite o CPF : ");
            AtualizarTutor(janela);
        }

        if(selectedValue == "Funcionario"){

            String CPF = JOptionPane.showInputDialog("Digite o CPF : ");
            AtualizarFunc(janela);
        }

        if(selectedValue == "Veterinario" || selectedValue == "Recepcionista" || selectedValue == "Gerente" 
        || selectedValue == "Aux_Veterinario" || selectedValue == "Aux_Limpeza"){

            String CPF = JOptionPane.showInputDialog("Digite o CPF : ");
            AtualizarOResto(janela, selectedValue);
        }
    }
    private static void Deletar(Object selectedValue, JFrame janela){
        if(selectedValue == "Exame"){
            int Chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o atributo chave : "));

            //pegar a entidade com a chave
            JOptionPane.showMessageDialog(null,"Exame Deletado");
        }
        if(selectedValue == "Consulta"){

            int Chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o atributo chave : "));
            JOptionPane.showMessageDialog(null,"Consulta Deletada");
            }
        if(selectedValue == "Prontuario"){

            int Chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o atributo chave : "));
            JOptionPane.showMessageDialog(null,"Prontuario Deletado");
        }

        if(selectedValue == "Obs_Prontuario"){

            int Chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o atributo chave : "));
            JOptionPane.showMessageDialog(null,"Observacao Prontuario Deletada");
        }
        if(selectedValue == "Internacao"){

            int Chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o atributo chave : "));
            JOptionPane.showMessageDialog(null,"Internacao Deletada");
        }

        if(selectedValue == "Pet"){

            int Chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o atributo chave : "));
            JOptionPane.showMessageDialog(null,"Pet Deletado");
        }

        if(selectedValue == "Tutor"){

            String CPF = JOptionPane.showInputDialog("Digite o CPF : ");
            JOptionPane.showMessageDialog(null,"Tutor Deletado");
        }

        if(selectedValue == "Funcionario"){

            String CPF = JOptionPane.showInputDialog("Digite o CPF : ");
            JOptionPane.showMessageDialog(null,"Funcionario Deletado");
        }

        if(selectedValue == "Veterinario" || selectedValue == "Recepcionista" || selectedValue == "Gerente" 
        || selectedValue == "Aux_Veterinario" || selectedValue == "Aux_Limpeza"){

            String CPF = JOptionPane.showInputDialog("Digite o CPF : ");
            JOptionPane.showMessageDialog(null, selectedValue +" Deletado");
        }
    }
    private static void Consultar(Object selectedValue, JFrame janela){
        if(selectedValue == "Exame"){
            int Chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o atributo chave : "));

            ConsultarExame(12, "Tipo Exame", "Laudo Exame", 12.99,
             "25/12/12", "42:22", 3, janela);

        }
        if(selectedValue == "Consulta"){

            int Chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o atributo chave : "));
            //ConsultarConsulta();

            }
        if(selectedValue == "Prontuario"){

            int Chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o atributo chave : "));
            //ConsultarProntuario();
        }

        if(selectedValue == "Obs_Prontuario"){

            int Chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o atributo chave : "));
            //ConsultarObsProntu

        }
        if(selectedValue == "Internacao"){

            int Chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o atributo chave : "));
            //ConsultarInternacao
            
        }

        if(selectedValue == "Pet"){

            int Chave = Integer.parseInt(JOptionPane.showInputDialog("Digite o atributo chave : "));
            //ConsultarPet
        }

        if(selectedValue == "Tutor"){

            String CPF = JOptionPane.showInputDialog("Digite o CPF : ");
            //ConsultarTutor
        }

        if(selectedValue == "Funcionario"){

            String CPF = JOptionPane.showInputDialog("Digite o CPF : ");
            //ConsultarFuncionario
        }

        if(selectedValue == "Veterinario" || selectedValue == "Recepcionista" || selectedValue == "Gerente" 
        || selectedValue == "Aux_Veterinario" || selectedValue == "Aux_Limpeza"){

            String CPF = JOptionPane.showInputDialog("Digite o CPF : ");
            //ConsultarOutros
        }
    }
    
    private static Object EscolheEntidade(){
        Object[] Entidades= {"Consulta", "Exame", "Funcionario", "Internacao", "Obs_Prontuario"
                , "Prontuario", "Pet","Tutor", "Veterinario", "Recepcionista", "Gerente", "Aux_Veterinario", "Aux_Limpeza"};

            Object selectedValue = JOptionPane.showInputDialog(null,
            "Escolha uma Entidade", "Banco de Dados",JOptionPane.INFORMATION_MESSAGE, null,
            Entidades,Entidades[0]);

            return selectedValue;
    }
    private static void InserirExame(JFrame janela){

            JFrame janela2 = NovaJanela("Inserindo um Exame");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(7, 1, 3 , 3));

            
            JLabel Tipo = new JLabel("Tipo do Exame :");
            JLabel Laudo = new JLabel("Laudo :");
            JLabel Valor = new JLabel("Valor :");
            JLabel Data = new JLabel("Data :");
            JLabel Horario = new JLabel("Horario :");
            JLabel IDConsulta= new JLabel("IDConsulta :");
            JTextField Tfieltipo= new JTextField(15);
            JTextArea Tfiellaudo= new JTextArea("", 3, 15);
            JTextField Tfielvalor= new JTextField(15);
            JTextField Tfieldata= new JTextField(15);
            JTextField Tfielhorario= new JTextField(15);
            JTextField TfielIDConsulta= new JTextField(15);

            JButton b1= new JButton("Inserir");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double vlr= Double.parseDouble(Tfielvalor.getText());
                //date
                //horario
                int IDConsulta= Integer.parseInt(TfielIDConsulta.getText());
                //realizar a inserção aqui

                System.out.println("Inseriu com SUcesso");
                //após a inserção :

                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });
        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(Tipo);
            linha1.add(Tfieltipo);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(Laudo);
            linha2.add(Tfiellaudo);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(Valor);
            linha3.add(Tfielvalor);

            JPanel linha4 = new JPanel();
            linha4.setLayout(new FlowLayout());
            linha4.add(Data);
            linha4.add(Tfieldata);

            JPanel linha5 = new JPanel();
            linha5.setLayout(new FlowLayout());
            linha5.add(Horario);
            linha5.add(Tfielhorario);

            JPanel linha6 = new JPanel();
            linha6.setLayout(new FlowLayout());
            linha6.add(IDConsulta);
            linha6.add(TfielIDConsulta);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(linha3);
            painel.add(linha4);
            painel.add(linha5);
            painel.add(linha6);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
        
    }
    private static void InserirProntuario(JFrame janela){
        JFrame janela2 = NovaJanela("Inserindo um Prontuario");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(7, 1, 3 , 3));

            
            JLabel MedApl = new JLabel("Medicacao Aplicada :");
            JLabel DataeHora = new JLabel("Data e hora :");
            JLabel Alimentacoes = new JLabel("Alimentacoes :");
            JLabel Pressao = new JLabel("Pressao :");
            JLabel Temp = new JLabel("Temperatura :");
            JLabel IDInternacao= new JLabel("IDInternacao :");
            JTextField TfielMedApl= new JTextField(15);
            JTextField TfielDataeHora= new JTextField(15);
            JTextArea TfielAlimentacoes= new JTextArea("", 3, 15);
            JTextField TfielPressao= new JTextField(15);
            JTextField Tfieltemp= new JTextField(15);
            JTextField TfielIDInternacao= new JTextField(15);

            JButton b1= new JButton("Inserir");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double pressao= Double.parseDouble(TfielPressao.getText());
                double temp= Double.parseDouble(Tfieltemp.getText());
                //dateehora
                String MedApl= TfielMedApl.getText();
                String alimentacoes= TfielAlimentacoes.getText();
                int IDConsulta= Integer.parseInt(TfielIDInternacao.getText());
                //realizar a inserção aqui

                System.out.println("Inseriu com SUcesso");
                //após a inserção :

                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });
        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(MedApl);
            linha1.add(TfielMedApl);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(DataeHora);
            linha2.add(TfielDataeHora);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(Alimentacoes);
            linha3.add(TfielAlimentacoes);

            JPanel linha4 = new JPanel();
            linha4.setLayout(new FlowLayout());
            linha4.add(Pressao);
            linha4.add(TfielPressao);

            JPanel linha5 = new JPanel();
            linha5.setLayout(new FlowLayout());
            linha5.add(Temp);
            linha5.add(Tfieltemp);

            JPanel linha6 = new JPanel();
            linha6.setLayout(new FlowLayout());
            linha6.add(IDInternacao);
            linha6.add(TfielIDInternacao);



            painel.add(linha1);
            painel.add(linha2);
            painel.add(linha3);
            painel.add(linha4);
            painel.add(linha5);
            painel.add(linha6);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void InserirObsProntuario(JFrame janela){
        JFrame janela2 = NovaJanela("Inserindo uma Observação de Prontuario");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(3, 1, 3 , 3));

            
            JLabel IDProntuario = new JLabel("IDProntuario :");
            JLabel Observacao = new JLabel("Observacao :");
            JTextField TfielIDProntuario= new JTextField(15);
            JTextArea TfielObservacao= new JTextArea("", 5, 30);

            JButton b1= new JButton("Inserir");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Observacao= TfielObservacao.getText();
                int IDProntuario= Integer.parseInt(TfielIDProntuario.getText());
                //realizar a inserção aqui

                System.out.println("Inseriu com SUcesso");
                //após a inserção :

                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });
        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(IDProntuario);
            linha1.add(TfielIDProntuario);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(Observacao);
            linha2.add(TfielObservacao);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
        
    }
    private static void InserirInternacao(JFrame janela){
        JFrame janela2 = NovaJanela("Inserindo uma Internacao");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(5, 1, 3 , 3));

            
            JLabel DataSaida = new JLabel("Data de Saida :");
            JLabel DataInicio = new JLabel("Data de Entrada :");
            JLabel Valor = new JLabel("Valor :");
            JLabel IDConsulta = new JLabel("IDConsulta :");
            JTextField TfielDataSaida= new JTextField(15);
            JTextField TfielDataInicio= new JTextField(15);
            JTextField TfielValor= new JTextField(15);
            JTextField TfielIDConsulta= new JTextField(15);

            JButton b1= new JButton("Inserir");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //datainicio
                //datasaida
                double vlr= Double.parseDouble(TfielValor.getText());
                int IDConsulta= Integer.parseInt(TfielIDConsulta.getText());
                //realizar a inserção aqui

                System.out.println("Inseriu com SUcesso");
                //após a inserção :

                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });
        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(DataInicio);
            linha1.add(TfielDataInicio);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(DataSaida);
            linha2.add(TfielDataSaida);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(Valor);
            linha3.add(TfielValor);

            JPanel linha4 = new JPanel();
            linha4.setLayout(new FlowLayout());
            linha4.add(IDConsulta);
            linha4.add(TfielIDConsulta);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(linha3);
            painel.add(linha4);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void InserirConsulta(JFrame janela){
        JFrame janela2 = NovaJanela("Inserindo uma Consulta");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(6, 1, 3 , 3));

            
            JLabel Valor = new JLabel("Valor :");
            JLabel Data = new JLabel("Data :");
            JLabel Horario = new JLabel("Horario :");
            JLabel IDPet = new JLabel("ID do Pet :");
            JLabel CPFVet = new JLabel("CPF do Veterinario :");
            JTextField Tfielvlr= new JTextField(15);
            JTextField Tfieldata= new JTextField(15);
            JTextField Tfielhorario= new JTextField(15);
            JTextField TfielIDPet= new JTextField(15);
            JTextField TfielCPFVet= new JTextField(15);


            JButton b1= new JButton("Inserir");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double vlr= Double.parseDouble(Tfielvlr.getText());
                //date
                //horario
                int IDpet= Integer.parseInt(TfielIDPet.getText());
                int CPFVet= Integer.parseInt(TfielCPFVet.getText());
                //realizar a inserção aqui

                System.out.println("Inseriu com SUcesso");
                //após a inserção :

                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });
        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(Valor);
            linha1.add(Tfielvlr);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(Data);
            linha2.add(Tfieldata);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(Horario);
            linha3.add(Tfielhorario);

            JPanel linha4 = new JPanel();
            linha4.setLayout(new FlowLayout());
            linha4.add(IDPet);
            linha4.add(TfielIDPet);

            JPanel linha5 = new JPanel();
            linha5.setLayout(new FlowLayout());
            linha5.add(CPFVet);
            linha5.add(TfielCPFVet);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(linha3);
            painel.add(linha4);
            painel.add(linha5);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void InserirPet(JFrame janela){
        JFrame janela2 = NovaJanela("Inserindo um Pet");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(6, 1, 3 , 3));

            
            JLabel Raca = new JLabel("Raca do Pet :");
            JLabel Especie = new JLabel("Especie do Pet :");
            JLabel Nome = new JLabel("Nome do Pet :");
            JLabel DataNasc = new JLabel("Data de Nascimento :");
            JLabel CPFTutor = new JLabel("CPF do Tutor :");
            JTextField TfielRaca= new JTextField(15);
            JTextField TfielEspecie= new JTextField(15);
            JTextField TfielNome= new JTextField(15);
            JTextField TfielDataNasc= new JTextField(15);
            JTextField TfielCPFTutor= new JTextField(15);

            JButton b1= new JButton("Inserir");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Raca= TfielRaca.getText();
                String Especie= TfielEspecie.getText();
                String Nome= TfielNome.getText();
                //datadenascimento
                String CPFTutor= TfielCPFTutor.getText();

                //realizar a inserção aqui

                System.out.println("Inseriu com SUcesso");
                //após a inserção :

                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });
        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(Raca);
            linha1.add(TfielRaca);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(Especie);
            linha2.add(TfielEspecie);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(Nome);
            linha3.add(TfielNome);

            JPanel linha4 = new JPanel();
            linha4.setLayout(new FlowLayout());
            linha4.add(DataNasc);
            linha4.add(TfielDataNasc);

            JPanel linha5 = new JPanel();
            linha5.setLayout(new FlowLayout());
            linha5.add(CPFTutor);
            linha5.add(TfielCPFTutor);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(linha3);
            painel.add(linha4);
            painel.add(linha5);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void InserirTutor(JFrame janela){
        JFrame janela2 = NovaJanela("Inserindo um Tutor");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(4, 1, 3 , 3));

            
            JLabel Endr = new JLabel("Endereco :");
            JLabel Nome = new JLabel("Nome :");
            JLabel CPFTutor = new JLabel("CPF :");
            JTextField TfielNome= new JTextField(15);
            JTextField TfielCPF= new JTextField(15);
            JTextArea TfielEnrd= new JTextArea("", 5, 30);

            JButton b1= new JButton("Inserir");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Nome= TfielNome.getText();
                String Endereco= TfielEnrd.getText();
                String CPF= TfielCPF.getText();
                //realizar a inserção aqui

                System.out.println("Inseriu com SUcesso");
                //após a inserção :

                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });
        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(Endr);
            linha1.add(TfielEnrd);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(Nome);
            linha2.add(TfielNome);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(CPFTutor);
            linha3.add(TfielCPF);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(linha3);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void InserirFuncionario(JFrame janela){
        JFrame janela2 = NovaJanela("Inserindo um Funcionario");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(6, 1, 3 , 3));

            JLabel Remune = new JLabel("Remuneracao :");
            JLabel DataNasc = new JLabel("Data de Nascimento :");
            JLabel DataEntrada = new JLabel("Data de Entrada :");
            JLabel Nome = new JLabel("Nome :");
            JLabel CPFFuncio = new JLabel("CPF :");

            JTextField TfielNome= new JTextField(15);
            JTextField TfielCPFFun= new JTextField(15);
            JTextField TfielRemune= new JTextField(15);
            JTextField TfielDataNasc= new JTextField(15);
            JTextField TfielDataEntra= new JTextField(15);

            JButton b1= new JButton("Inserir");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Nome= TfielNome.getText();
                Double Remune= Double.parseDouble(TfielRemune.getText());
                String CPF= TfielCPFFun.getText();
                //dataentrada
                //dataNasc

                //realizar a inserção aqui

                System.out.println("Inseriu com SUcesso");
                //após a inserção :

                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });
        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(CPFFuncio);
            linha1.add(TfielCPFFun);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(Nome);
            linha2.add(TfielNome);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(Remune);
            linha3.add(TfielRemune);

            JPanel linha4 = new JPanel();
            linha4.setLayout(new FlowLayout());
            linha4.add(DataNasc);
            linha4.add(TfielDataNasc);

            JPanel linha5 = new JPanel();
            linha5.setLayout(new FlowLayout());
            linha5.add(DataEntrada);
            linha5.add(TfielDataEntra);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(linha3);
            painel.add(linha4);
            painel.add(linha5);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void InserirOResto(JFrame janela, Object selectedValue){
        JFrame janela2 = NovaJanela("Inserindo um " + selectedValue);
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(2, 1, 3 , 3));
            JLabel CPFEnt = new JLabel("CPF :");

            JTextField TfielCPFFun= new JTextField(15);

            JButton b1= new JButton("Inserir");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String CPF= TfielCPFFun.getText();

                //realizar a inserção aqui

                System.out.println("Inseriu com SUcesso");
                //após a inserção :

                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });
        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(CPFEnt);
            linha1.add(TfielCPFFun);

            painel.add(linha1);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void AtualizarExame(JFrame janela){
        JFrame janela2 = NovaJanela("Atualizando um Exame");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(7, 1, 3 , 3));

            
            JLabel Tipo = new JLabel("Tipo do Exame :");
            JLabel Laudo = new JLabel("Laudo :");
            JLabel Valor = new JLabel("Valor :");
            JLabel Data = new JLabel("Data :");
            JLabel Horario = new JLabel("Horario :");
            JLabel IDConsulta= new JLabel("IDConsulta :");
            JTextField Tfieltipo= new JTextField(15);
            JTextArea Tfiellaudo= new JTextArea("", 3, 15);
            JTextField Tfielvalor= new JTextField(15);
            JTextField Tfieldata= new JTextField(15);
            JTextField Tfielhorario= new JTextField(15);
            JTextField TfielIDConsulta= new JTextField(15);

            JButton b1= new JButton("Atualizar");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double vlr= Double.parseDouble(Tfielvalor.getText());
                //date
                //horario
                int IDConsulta= Integer.parseInt(TfielIDConsulta.getText());
                //realizar a inserção aqui

                System.out.println("Inseriu com SUcesso");
                //após a inserção :

                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });
        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(Tipo);
            linha1.add(Tfieltipo);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(Laudo);
            linha2.add(Tfiellaudo);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(Valor);
            linha3.add(Tfielvalor);

            JPanel linha4 = new JPanel();
            linha4.setLayout(new FlowLayout());
            linha4.add(Data);
            linha4.add(Tfieldata);

            JPanel linha5 = new JPanel();
            linha5.setLayout(new FlowLayout());
            linha5.add(Horario);
            linha5.add(Tfielhorario);

            JPanel linha6 = new JPanel();
            linha6.setLayout(new FlowLayout());
            linha6.add(IDConsulta);
            linha6.add(TfielIDConsulta);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(linha3);
            painel.add(linha4);
            painel.add(linha5);
            painel.add(linha6);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void AtualizarProntuario(JFrame janela){
        JFrame janela2 = NovaJanela("Atualizando um Prontuario");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(7, 1, 3 , 3));

            
            JLabel MedApl = new JLabel("Medicacao Aplicada :");
            JLabel DataeHora = new JLabel("Data e hora :");
            JLabel Alimentacoes = new JLabel("Alimentacoes :");
            JLabel Pressao = new JLabel("Pressao :");
            JLabel Temp = new JLabel("Temperatura :");
            JLabel IDInternacao= new JLabel("IDInternacao :");
            JTextField TfielMedApl= new JTextField(15);
            JTextField TfielDataeHora= new JTextField(15);
            JTextArea TfielAlimentacoes= new JTextArea("", 3, 15);
            JTextField TfielPressao= new JTextField(15);
            JTextField Tfieltemp= new JTextField(15);
            JTextField TfielIDInternacao= new JTextField(15);

            JButton b1= new JButton("Atualizar");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double pressao= Double.parseDouble(TfielPressao.getText());
                double temp= Double.parseDouble(Tfieltemp.getText());
                //dateehora
                String MedApl= TfielMedApl.getText();
                String alimentacoes= TfielAlimentacoes.getText();
                int IDConsulta= Integer.parseInt(TfielIDInternacao.getText());
                //realizar a inserção aqui

                System.out.println("Atualizou com SUcesso");
                //após a inserção :

                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });
        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(MedApl);
            linha1.add(TfielMedApl);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(DataeHora);
            linha2.add(TfielDataeHora);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(Alimentacoes);
            linha3.add(TfielAlimentacoes);

            JPanel linha4 = new JPanel();
            linha4.setLayout(new FlowLayout());
            linha4.add(Pressao);
            linha4.add(TfielPressao);

            JPanel linha5 = new JPanel();
            linha5.setLayout(new FlowLayout());
            linha5.add(Temp);
            linha5.add(Tfieltemp);

            JPanel linha6 = new JPanel();
            linha6.setLayout(new FlowLayout());
            linha6.add(IDInternacao);
            linha6.add(TfielIDInternacao);



            painel.add(linha1);
            painel.add(linha2);
            painel.add(linha3);
            painel.add(linha4);
            painel.add(linha5);
            painel.add(linha6);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void AtualizarObsProntuario(JFrame janela){
        JFrame janela2 = NovaJanela("Atualizando uma Observação de Prontuario");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(3, 1, 3 , 3));

            
            JLabel IDProntuario = new JLabel("IDProntuario :");
            JLabel Observacao = new JLabel("Observacao :");
            JTextField TfielIDProntuario= new JTextField(15);
            JTextArea TfielObservacao= new JTextArea("", 5, 30);

            JButton b1= new JButton("Atualizar");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Observacao= TfielObservacao.getText();
                int IDProntuario= Integer.parseInt(TfielIDProntuario.getText());
                //realizar a inserção aqui

                System.out.println("Atualizou com SUcesso");
                //após a inserção :

                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });
        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(IDProntuario);
            linha1.add(TfielIDProntuario);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(Observacao);
            linha2.add(TfielObservacao);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void AtualizarInternacao(JFrame janela){
        JFrame janela2 = NovaJanela("Atualizando uma Internacao");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(5, 1, 3 , 3));

            
            JLabel DataSaida = new JLabel("Data de Saida :");
            JLabel DataInicio = new JLabel("Data de Entrada :");
            JLabel Valor = new JLabel("Valor :");
            JLabel IDConsulta = new JLabel("IDConsulta :");
            JTextField TfielDataSaida= new JTextField(15);
            JTextField TfielDataInicio= new JTextField(15);
            JTextField TfielValor= new JTextField(15);
            JTextField TfielIDConsulta= new JTextField(15);

            JButton b1= new JButton("Atualizar");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //datainicio
                //datasaida
                double vlr= Double.parseDouble(TfielValor.getText());
                int IDConsulta= Integer.parseInt(TfielIDConsulta.getText());
                //realizar a inserção aqui

                System.out.println("Atualizou com SUcesso");
                //após a inserção :

                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });
        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(DataInicio);
            linha1.add(TfielDataInicio);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(DataSaida);
            linha2.add(TfielDataSaida);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(Valor);
            linha3.add(TfielValor);

            JPanel linha4 = new JPanel();
            linha4.setLayout(new FlowLayout());
            linha4.add(IDConsulta);
            linha4.add(TfielIDConsulta);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(linha3);
            painel.add(linha4);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void AtualizarConsulta(JFrame janela){
        JFrame janela2 = NovaJanela("Atualizando uma Consulta");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(6, 1, 3 , 3));

            
            JLabel Valor = new JLabel("Valor :");
            JLabel Data = new JLabel("Data :");
            JLabel Horario = new JLabel("Horario :");
            JLabel IDPet = new JLabel("ID do Pet :");
            JLabel CPFVet = new JLabel("CPF do Veterinario :");
            JTextField Tfielvlr= new JTextField(15);
            JTextField Tfieldata= new JTextField(15);
            JTextField Tfielhorario= new JTextField(15);
            JTextField TfielIDPet= new JTextField(15);
            JTextField TfielCPFVet= new JTextField(15);


            JButton b1= new JButton("Atualizar");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double vlr= Double.parseDouble(Tfielvlr.getText());
                //date
                //horario
                int IDpet= Integer.parseInt(TfielIDPet.getText());
                int CPFVet= Integer.parseInt(TfielCPFVet.getText());
                //realizar a inserção aqui

                System.out.println("Atualizou com SUcesso");
                //após a inserção :

                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });
        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(Valor);
            linha1.add(Tfielvlr);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(Data);
            linha2.add(Tfieldata);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(Horario);
            linha3.add(Tfielhorario);

            JPanel linha4 = new JPanel();
            linha4.setLayout(new FlowLayout());
            linha4.add(IDPet);
            linha4.add(TfielIDPet);

            JPanel linha5 = new JPanel();
            linha5.setLayout(new FlowLayout());
            linha5.add(CPFVet);
            linha5.add(TfielCPFVet);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(linha3);
            painel.add(linha4);
            painel.add(linha5);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void AtualizarPet(JFrame janela){
        JFrame janela2 = NovaJanela("Atualizando um Pet");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(6, 1, 3 , 3));

            
            JLabel Raca = new JLabel("Raca do Pet :");
            JLabel Especie = new JLabel("Especie do Pet :");
            JLabel Nome = new JLabel("Nome do Pet :");
            JLabel DataNasc = new JLabel("Data de Nascimento :");
            JLabel CPFTutor = new JLabel("CPF do Tutor :");
            JTextField TfielRaca= new JTextField(15);
            JTextField TfielEspecie= new JTextField(15);
            JTextField TfielNome= new JTextField(15);
            JTextField TfielDataNasc= new JTextField(15);
            JTextField TfielCPFTutor= new JTextField(15);

            JButton b1= new JButton("Atualizar");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Raca= TfielRaca.getText();
                String Especie= TfielEspecie.getText();
                String Nome= TfielNome.getText();
                //datadenascimento
                String CPFTutor= TfielCPFTutor.getText();

                //realizar a inserção aqui

                System.out.println("Atualizou com SUcesso");
                //após a inserção :

                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });
        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(Raca);
            linha1.add(TfielRaca);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(Especie);
            linha2.add(TfielEspecie);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(Nome);
            linha3.add(TfielNome);

            JPanel linha4 = new JPanel();
            linha4.setLayout(new FlowLayout());
            linha4.add(DataNasc);
            linha4.add(TfielDataNasc);

            JPanel linha5 = new JPanel();
            linha5.setLayout(new FlowLayout());
            linha5.add(CPFTutor);
            linha5.add(TfielCPFTutor);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(linha3);
            painel.add(linha4);
            painel.add(linha5);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void AtualizarTutor(JFrame janela){
        JFrame janela2 = NovaJanela("Atualizando um Tutor");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(3, 1, 3 , 3));

            
            JLabel Endr = new JLabel("Endereco :");
            JLabel Nome = new JLabel("Nome :");
            JTextField TfielNome= new JTextField(15);
            JTextArea TfielEnrd= new JTextArea("", 5, 30);

            JButton b1= new JButton("Atualizar");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Nome= TfielNome.getText();
                String Endereco= TfielEnrd.getText();
                //realizar a inserção aqui

                System.out.println("Atualizou com SUcesso");
                //após a inserção :

                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });
        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(Endr);
            linha1.add(TfielEnrd);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(Nome);
            linha2.add(TfielNome);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void AtualizarFunc(JFrame janela){
        JFrame janela2 = NovaJanela("Atualizando um Funcionario");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(5, 1, 3 , 3));

            JLabel Remune = new JLabel("Remuneracao :");
            JLabel DataNasc = new JLabel("Data de Nascimento :");
            JLabel DataEntrada = new JLabel("Data de Entrada :");
            JLabel Nome = new JLabel("Nome :");

            JTextField TfielNome= new JTextField(15);
            JTextField TfielRemune= new JTextField(15);
            JTextField TfielDataNasc= new JTextField(15);
            JTextField TfielDataEntra= new JTextField(15);

            JButton b1= new JButton("Atualizar");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String Nome= TfielNome.getText();
                Double Remune= Double.parseDouble(TfielRemune.getText());
                //dataentrada
                //dataNasc

                //realizar a inserção aqui

                System.out.println("Atualizou com SUcesso");
                //após a inserção :

                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(Nome);
            linha2.add(TfielNome);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(Remune);
            linha3.add(TfielRemune);

            JPanel linha4 = new JPanel();
            linha4.setLayout(new FlowLayout());
            linha4.add(DataNasc);
            linha4.add(TfielDataNasc);

            JPanel linha5 = new JPanel();
            linha5.setLayout(new FlowLayout());
            linha5.add(DataEntrada);
            linha5.add(TfielDataEntra);

            painel.add(linha2);
            painel.add(linha3);
            painel.add(linha4);
            painel.add(linha5);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void AtualizarOResto(JFrame janela, Object selectedValue){
        JFrame janela2 = NovaJanela("Atualizando um " + selectedValue);
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(2, 1, 3 , 3));
            JLabel CPFEnt = new JLabel("CPF :");

            JTextField TfielCPFFun= new JTextField(15);

            JButton b1= new JButton("Atualizar");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String CPF= TfielCPFFun.getText();

                //realizar a Atualizacao aqui

                System.out.println("Atualizou com SUcesso");
                //após a Atualzacao :

                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });
        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(CPFEnt);
            linha1.add(TfielCPFFun);

            painel.add(linha1);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void ConsultarExame(int IDExame, String Tipo, String Laudo, Double Valor, String Data,
    String horario, int IDConsulta, JFrame janela){
        JFrame janela2 = NovaJanela("Consultando um Exame");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(8, 1, 3 , 3));

            JLabel LabIDExame = new JLabel("IDExame :");
            JLabel LabTipo = new JLabel("Tipo :");
            JLabel LabLaudo = new JLabel("Laudo :");
            JLabel LabValor = new JLabel("Valor :");
            JLabel LabData = new JLabel("Data :");
            JLabel LabHorario = new JLabel("Horario :");
            JLabel LabIDConsulta = new JLabel("IDConsulta :");

            JLabel dataIDExame = new JLabel(String.valueOf(IDExame));
            JLabel dataTipo = new JLabel(Tipo);
            JLabel dataLaudo = new JLabel(Laudo);
            JLabel dataValor = new JLabel(String.valueOf(Valor));
            JLabel dataData = new JLabel(Data);
            JLabel dataHorario = new JLabel(horario);
            JLabel dataIDConsulta = new JLabel(String.valueOf(IDConsulta));


            JButton b1= new JButton("OK");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });

        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(LabIDExame);
            linha1.add(dataIDExame);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(LabTipo);
            linha2.add(dataTipo);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(LabLaudo);
            linha3.add(dataLaudo);

            JPanel linha4 = new JPanel();
            linha4.setLayout(new FlowLayout());
            linha4.add(LabValor);
            linha4.add(dataValor);

            JPanel linha5 = new JPanel();
            linha5.setLayout(new FlowLayout());
            linha5.add(LabData);
            linha5.add(dataData);

            JPanel linha6 = new JPanel();
            linha6.setLayout(new FlowLayout());
            linha6.add(LabHorario);
            linha6.add(dataHorario);

            JPanel linha7 = new JPanel();
            linha7.setLayout(new FlowLayout());
            linha7.add(LabIDConsulta);
            linha7.add(dataIDConsulta);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(linha3);
            painel.add(linha4);
            painel.add(linha5);
            painel.add(linha6);
            painel.add(linha7);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void ConsultarProntuario(int IDProntuario, String MedApl, String Data_hora, String Alm, double pressao,
    double temperatura, int IDInternacao, JFrame janela){
        JFrame janela2 = NovaJanela("Consultando um Prontuario");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(8, 1, 3 , 3));

            JLabel LabIDProntuario = new JLabel("IDProntuario :");
            JLabel LabMedApl = new JLabel("Medicacao Aplicada :");
            JLabel LabDataeHora = new JLabel("Data e hora :");
            JLabel LabAlimentacoes = new JLabel("Alimentacoes :");
            JLabel LabPressao = new JLabel("Pressao :");
            JLabel LabTemp = new JLabel("Temperatura :");
            JLabel LabIDInternacao= new JLabel("IDInternacao :");

            JLabel dataIDProntuario = new JLabel(String.valueOf(IDProntuario));
            JLabel dataMedApl = new JLabel(MedApl);
            JLabel dataDataeHora = new JLabel(Data_hora);
            JLabel dataAlm = new JLabel(Alm);
            JLabel dataPressao = new JLabel(String.valueOf(pressao));
            JLabel dataTemp = new JLabel(String.valueOf(temperatura));
            JLabel dataIDInternacao = new JLabel(String.valueOf(IDInternacao));


            JButton b1= new JButton("OK");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });

        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(LabIDProntuario);
            linha1.add(dataIDProntuario);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(LabMedApl);
            linha2.add(dataMedApl);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(LabDataeHora);
            linha3.add(dataDataeHora);

            JPanel linha4 = new JPanel();
            linha4.setLayout(new FlowLayout());
            linha4.add(LabAlimentacoes);
            linha4.add(dataAlm);

            JPanel linha5 = new JPanel();
            linha5.setLayout(new FlowLayout());
            linha5.add(LabPressao);
            linha5.add(dataPressao);

            JPanel linha6 = new JPanel();
            linha6.setLayout(new FlowLayout());
            linha6.add(LabTemp);
            linha6.add(dataTemp);

            JPanel linha7 = new JPanel();
            linha7.setLayout(new FlowLayout());
            linha7.add(LabIDInternacao);
            linha7.add(dataIDInternacao);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(linha3);
            painel.add(linha4);
            painel.add(linha5);
            painel.add(linha6);
            painel.add(linha7);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void ConsultarObsProntuario(int IDProntuario, String Observacao, JFrame janela){
        JFrame janela2 = NovaJanela("Consultando uma Observacao de Prontuario");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(3, 1, 3 , 3));

            JLabel LabIDProntuario = new JLabel("IDProntuario :");
            JLabel LabObservacao = new JLabel("Observacao :");

            JLabel dataIDProntuario = new JLabel(String.valueOf(IDProntuario));
            JLabel dataObservacao= new JLabel(Observacao);


            JButton b1= new JButton("OK");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });

        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(LabIDProntuario);
            linha1.add(dataIDProntuario);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(LabObservacao);
            linha2.add(dataObservacao);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void ConsultarInternacao(int IDInternacao, String DataSaida, String DataInicio, double valor,
     int IDConsulta, JFrame janela){

        JFrame janela2 = NovaJanela("Consultando uma Internacao");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(6, 1, 3 , 3));

            JLabel LabIDInternacao = new JLabel("IDInternacao :");
            JLabel LabDataSaida = new JLabel("Data de Saida :");
            JLabel LabDataInicio = new JLabel("Data de Entrada :");
            JLabel LabValor = new JLabel("Valor :");
            JLabel LabIDConsulta= new JLabel("IDConsulta :");

            JLabel dataIDInternacao = new JLabel(String.valueOf(IDInternacao));
            JLabel dataDataSaida = new JLabel(DataSaida);
            JLabel dataDataEntrada = new JLabel(DataInicio);
            JLabel dataValor = new JLabel(String.valueOf(valor));
            JLabel dataIDConsulta = new JLabel(String.valueOf(IDConsulta));


            JButton b1= new JButton("OK");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });

        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(LabIDInternacao);
            linha1.add(dataIDInternacao);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(LabDataSaida);
            linha2.add(dataDataSaida);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(LabDataInicio);
            linha3.add(dataDataEntrada);

            JPanel linha4 = new JPanel();
            linha4.setLayout(new FlowLayout());
            linha4.add(LabValor);
            linha4.add(dataValor);

            JPanel linha5 = new JPanel();
            linha5.setLayout(new FlowLayout());
            linha5.add(LabIDConsulta);
            linha5.add(dataIDConsulta);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(linha3);
            painel.add(linha4);
            painel.add(linha5);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void ConsultarConsulta(int IDConsulta, double valor, String Data, String Horario, int IDPet,
     String CPFVet, JFrame janela){
        JFrame janela2 = NovaJanela("Consultando uma Consulta");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(7, 1, 3 , 3));

            JLabel LabIDConsulta = new JLabel("IDConsulta :");
            JLabel LabValor = new JLabel("Valor :");
            JLabel LabData = new JLabel("Data :");
            JLabel LabHorario = new JLabel("Horario :");
            JLabel LabIDPet = new JLabel("IDPet :");
            JLabel LabCPFVet = new JLabel("CPF do Veterinario :");

            JLabel dataIDConsulta = new JLabel(String.valueOf(IDConsulta));
            JLabel dataValor = new JLabel(String.valueOf(valor));
            JLabel dataData = new JLabel(Data);
            JLabel dataHorario = new JLabel(Horario);
            JLabel dataIDPet = new JLabel(String.valueOf(IDPet));
            JLabel dataCPFVet = new JLabel(CPFVet);


            JButton b1= new JButton("OK");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });

        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(LabIDConsulta);
            linha1.add(dataIDConsulta);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(LabValor);
            linha2.add(dataValor);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(LabData);
            linha3.add(dataData);

            JPanel linha4 = new JPanel();
            linha4.setLayout(new FlowLayout());
            linha4.add(LabHorario);
            linha4.add(dataHorario);

            JPanel linha5 = new JPanel();
            linha5.setLayout(new FlowLayout());
            linha5.add(LabIDPet);
            linha5.add(dataIDPet);

            JPanel linha6 = new JPanel();
            linha6.setLayout(new FlowLayout());
            linha6.add(LabCPFVet);
            linha6.add(dataCPFVet);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(linha3);
            painel.add(linha4);
            painel.add(linha5);
            painel.add(linha6);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void ConsultarPet(int IDPet, String Raca, String Especie, String Nome, String DataNasc,
     String CPFTutor, JFrame janela){
        JFrame janela2 = NovaJanela("Consultando um Pet");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(7, 1, 3 , 3));

            JLabel LabIDPet = new JLabel("IDPet :");
            JLabel LabRaca = new JLabel("Raca :");
            JLabel LabEspecie = new JLabel("Especie :");
            JLabel LabNome = new JLabel("Nome :");
            JLabel LabDataNasc = new JLabel("Data de Nascimento :");
            JLabel LabCPFTutor = new JLabel("CPF do Tutor :");

            JLabel dataIDPet = new JLabel(String.valueOf(IDPet));
            JLabel dataRaca = new JLabel(Raca);
            JLabel dataEspecie = new JLabel(Especie);
            JLabel dataNome = new JLabel(Nome);
            JLabel dataDataNasc = new JLabel(DataNasc);
            JLabel dataCPFTutor = new JLabel(CPFTutor);


            JButton b1= new JButton("OK");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });

        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(LabIDPet);
            linha1.add(dataIDPet);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(LabRaca);
            linha2.add(dataRaca);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(LabEspecie);
            linha3.add(dataEspecie);

            JPanel linha4 = new JPanel();
            linha4.setLayout(new FlowLayout());
            linha4.add(LabNome);
            linha4.add(dataNome);

            JPanel linha5 = new JPanel();
            linha5.setLayout(new FlowLayout());
            linha5.add(LabDataNasc);
            linha5.add(dataDataNasc);

            JPanel linha6 = new JPanel();
            linha6.setLayout(new FlowLayout());
            linha6.add(LabCPFTutor);
            linha6.add(dataCPFTutor);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(linha3);
            painel.add(linha4);
            painel.add(linha5);
            painel.add(linha6);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void ConsultarTutor(String CPFTutor, String Endr, String Nome, JFrame janela){
        JFrame janela2 = NovaJanela("Consultando um Tutor");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(4, 1, 3 , 3));

            JLabel LabCPFTutor = new JLabel("CPF do Tutor :");
            JLabel LabEndr = new JLabel("Endereco :");
            JLabel LabNome = new JLabel("Nome :");

            JLabel dataEndr = new JLabel(Endr);
            JLabel dataNome = new JLabel(Nome);
            JLabel dataCPFTutor = new JLabel(CPFTutor);


            JButton b1= new JButton("OK");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });

        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(LabCPFTutor);
            linha1.add(dataCPFTutor);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(LabEndr);
            linha2.add(dataEndr);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(LabNome);
            linha3.add(dataNome);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(linha3);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void ConsultarFuncionario(String CPFFuncio, double remuneracao, String DataNasc, String Nome,
     String DataEntrada, JFrame janela){
        JFrame janela2 = NovaJanela("Consultando um Funcionario");
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(6, 1, 3 , 3));

            JLabel LabCPFFuncio = new JLabel("CPF do Funcionario :");
            JLabel LabRemuneracao = new JLabel("Remuneracao :");
            JLabel LabDataNasc = new JLabel("Data de Nascimento :");
            JLabel LabNome = new JLabel("Nome :");
            JLabel LabDataEntrada = new JLabel("Data de Entrada :");

            JLabel dataCPFFuncio = new JLabel(CPFFuncio);
            JLabel dataRemuneracao = new JLabel(String.valueOf(remuneracao));
            JLabel dataDataNasc = new JLabel(DataNasc);
            JLabel dataNome = new JLabel(Nome);
            JLabel dataDataEntrada = new JLabel(DataEntrada);


            JButton b1= new JButton("OK");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });

        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(LabCPFFuncio);
            linha1.add(dataCPFFuncio);

            JPanel linha2 = new JPanel();
            linha2.setLayout(new FlowLayout());
            linha2.add(LabRemuneracao);
            linha2.add(dataRemuneracao);

            JPanel linha3 = new JPanel();
            linha3.setLayout(new FlowLayout());
            linha3.add(LabDataNasc);
            linha3.add(dataDataNasc);

            JPanel linha4 = new JPanel();
            linha4.setLayout(new FlowLayout());
            linha4.add(LabNome);
            linha4.add(dataNome);

            JPanel linha5 = new JPanel();
            linha5.setLayout(new FlowLayout());
            linha5.add(LabDataEntrada);
            linha5.add(dataDataEntrada);

            painel.add(linha1);
            painel.add(linha2);
            painel.add(linha3);
            painel.add(linha4);
            painel.add(linha5);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
    private static void ConsultarOutros(String CPFFuncio, Object selectedObject, JFrame janela){
        JFrame janela2 = NovaJanela("Consultando um " + selectedObject);
            JPanel painel = new JPanel();
            painel.setLayout(new GridLayout(2, 1, 3 , 3));

            JLabel LabCPFFuncio = new JLabel("CPF do " + selectedObject + ": ");

            JLabel dataCPFFuncio = new JLabel(CPFFuncio);


            JButton b1= new JButton("OK");

            b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                janela2.setVisible(false);
                janela2.dispose();

                janela.setVisible(true);
            }
        });

        JPanel linha1 = new JPanel();
            linha1.setLayout(new FlowLayout());
            linha1.add(LabCPFFuncio);
            linha1.add(dataCPFFuncio);

            painel.add(linha1);
            painel.add(b1);

            janela2.add(painel);

            janela2.setVisible(true);
    }
}