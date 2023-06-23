package Ex_01;

public class ContaBancaria {
    private String nomeDoCliente;
    private int numConta;
    private double saldo;

    public ContaBancaria(String nomeDoCliente, int numConta, double saldo) {
        this.nomeDoCliente = nomeDoCliente;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void sacar(double valorSaque) {
        if (saldo > 0 && valorSaque <= saldo) {
            saldo -= valorSaque;
            System.out.println("O saque foi realizado com sucesso.");

        } else  {
            System.out.println("Não foi possível realizar o saque.");

        }
    }

        public void depositar(double valorDeposito) {
            if (valorDeposito > 0) {
                saldo += valorDeposito;
                System.out.println("O deposito foi realizado com sucesso.");
            } else if (valorDeposito < 0) {
                System.out.println("Não foi possível realizar o deposito.");
            } else {
                System.out.println("ERRO: você digitou um valor inválido.");
            }
        }

        public String getNomeDoCliente () {
            return nomeDoCliente;
        }

        public void setNomeDoCliente (String nomeDoCliente){
            this.nomeDoCliente = nomeDoCliente;
        }

        public int getNumConta () {
            return numConta;
        }

        public void setNumConta ( int numConta){
            this.numConta = numConta;
        }

        public double getSaldo () {
            return saldo;
        }

        public void setSaldo ( double saldo){
            this.saldo = saldo;
        }
    }
