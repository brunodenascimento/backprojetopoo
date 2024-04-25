public class modelovendedor {
    /*Estou criando a classe modelo do vendedor */
    private String name;
    private int cpf;
    private String senha;
    private String email;
    private int numerovendas;
    private float faturamento;

    //método construtor
   
    public modelovendedor(String n, String s, int c, String e){
        this.name=n;
        this.senha=s;
        this.cpf=c;
        this.email=e;
        this.numerovendas = 0; //todo vendedor assimm que criar a conta tem 0 vendas
        this.faturamento=0; //todo vendedor assimm que criar a conta tem 0 reais de faturamentos
        //ou seja assim que eu criar uma conta já devo informar esses dados do vendedor

    }
    public String getName() {
        return name;
    }
    public void setName(String n) {
        this.name = n;
    }
    public int getCpf() {
        return cpf;
    }
    public void setCpf(int c) {
        this.cpf = c;
    }
    public String getSenha() {
        return senha;
    }
    public void setSenha(String s) {
        this.senha = s;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String e) {
        this.email = e;
    }
     public int getNumerovendas() {
        return numerovendas;
    }
    public void setNumerovendas(int nv) {
        this.numerovendas = nv;
    }
    public float getFaturamento() {
        return faturamento;
    }
    public void setFaturamento(float f) {
        this.faturamento = f;
    }
    
}
