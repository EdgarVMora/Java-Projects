package projectDate;

public class Fecha {
    private int dia;
    private int mes;
    private int anio;

    public Fecha() {
        this.dia = 1;
        this.mes = 1;
        this.anio = 1900;
    }

    public Fecha(int dia, int mes, int anio) {
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        validarFecha();
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        if (anio >= 1900 && anio <= 2050) {
            this.anio = anio;
        } else {
            System.out.println("Año fuera de rango. Se mantiene el año actual.");
        }
    }

    private void validarFecha() {
        if (anio < 1900 || anio > 2050) {
            anio = 1900;
        }
        if (mes < 1 || mes > 12) {
            mes = 1;
        }
        if (dia < 1 || dia > diasMes()) {
            dia = 1;
        }
    }

    public boolean bisiesto() {
        return (anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0);
    }

    public int diasMes() {
        int[] dias = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (mes == 2 && bisiesto()) {
            return 29;
        }
        return dias[mes - 1];
    }

    public String corta() {
        return (dia < 10 ? "0" + dia : dia) + "-" + (mes < 10 ? "0" + mes : mes) + "-" + anio;
    }

    public int diasTranscurridos() {
        int totalDias = 0;
        for (int i = 1900; i < anio; i++) {
            totalDias += (new Fecha(1, 1, i).bisiesto()) ? 366 : 365;
        }
        for (int i = 1; i < mes; i++) {
            totalDias += new Fecha(1, i, anio).diasMes();
        }
        totalDias += dia - 1;
        return totalDias;
    }

    public int diaSemana() {
        return (diasTranscurridos() + 1) % 7;
    }

    public void siguiente() {
        if (dia < diasMes()) {
            dia++;
        } else {
            dia = 1;
            if (mes < 12) {
                mes++;
            } else {
                mes = 1;
                anio++;
            }
        }
    }

    public void anterior() {
        if (dia > 1) {
            dia--;
        } else {
            if (mes > 1) {
                mes--;
            } else {
                mes = 12;
                anio--;
            }
            dia = new Fecha(1, mes, anio).diasMes();
        }
    }

    @Override
    public String toString() {
        String[] diasSemana = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado"};
        String[] nombresMeses = {"enero", "febrero", "marzo", "abril", "mayo", "junio", 
                                  "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
        
        return diasSemana[diaSemana()] + " " + dia + " de " + nombresMeses[mes - 1] + " de " + anio;
    }
}


