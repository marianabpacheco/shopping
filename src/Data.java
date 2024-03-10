public class Data {
    private int dia;
    private int mes;
    private int ano;


    public Data(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. Atribuindo a data padrão: 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }

    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int diasNoMes(int mes) {
        switch (mes) {
            case 2:
                return (verificaAnoBissexto()) ? 29 : 28;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 31;
        }
    }

    public boolean validaData(int dia, int mes, int ano) {
        if (ano > 0 && mes >= 1 && mes <= 12) {
            int maxDia = diasNoMes(mes);
            if (dia >= 1 && dia <= maxDia) {
                return true;
            }
        }
        return false;
    }




    public boolean verificaAnoBissexto(){
        if(this.ano % 400 == 0 || this.ano % 4 == 0 && this.ano % 100 != 0) {
            return true;
        }
        return false;
    }



    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
