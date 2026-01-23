package hospital;

public class MainHospital {
    public static void main(String[] args) {
        Hospital general = new Hospital("General");
        Departamento cardiologia = new Departamento("Cardiologia", general);
        Medico jordi = new Medico("Jordi", "2026655");
        Habitacion sur = new Habitacion("01");
        Paciente oscar = new Paciente("Oscar", "2002151", sur);
        Intervencion cancer = new Intervencion("cancer", jordi, oscar);
        Medicamento ibuprofeno = new Medicamento("Ibuprofeno");
    }
}
